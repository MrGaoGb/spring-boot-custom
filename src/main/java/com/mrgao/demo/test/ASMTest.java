package com.mrgao.demo.test;

import jdk.internal.org.objectweb.asm.AnnotationVisitor;
import jdk.internal.org.objectweb.asm.ClassReader;
import jdk.internal.org.objectweb.asm.ClassVisitor;
import jdk.internal.org.objectweb.asm.Opcodes;

import java.io.IOException;

/**
 * @author Mr.Gao
 * @date 2023/3/29 18:27
 * @apiNote:通过ASM技术获取字节码中的方法、注释、以及类信息
 */
public class ASMTest {
    public static void main(String[] args) throws IOException {

        ClassReader classReader = new ClassReader("com.mrgao.demo.controller.UserController");
        System.out.println("获取类名" + classReader.getClassName());

        ClassVisitor classVisitor = new ClassVisitor(Opcodes.ASM5) {
            @Override
            public AnnotationVisitor visitAnnotation(String s, boolean b) {
                System.out.println("获取注解：" + s);
                return super.visitAnnotation(s, b);
            }
        };

        classReader.accept(classVisitor, ClassReader.SKIP_DEBUG);
    }
}
