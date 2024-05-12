package com.livecore.base.tinyjson;

import X.ORY;
import com.livecore.base.tinyjson.ReflectType;
import com.livecore.base.tinyjson.annotations.Serialized;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class ClassParser {
    public static final ClassParser INSTANCE = new ClassParser();
    public static final Map<Class<? extends Object>, TreeNode<ReflectProperty>> clazzParseCache = new LinkedHashMap();

    public final TreeNode<ReflectProperty> parseAsTree(Class<? extends Object> clazz) {
        o.LJIIIZ(clazz, "clazz");
        TreeNode<ReflectProperty> treeNode = clazzParseCache.get(clazz);
        if (treeNode != null) {
            return treeNode;
        }
        Serialized serialized = (Serialized) clazz.getAnnotation(Serialized.class);
        Field[] declaredFields = clazz.getDeclaredFields();
        o.LJIIIIZZ(declaredFields, "clazz.declaredFields");
        ArrayList arrayList = new ArrayList();
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(Serialized.class)) {
                arrayList.add(field);
            }
        }
        TreeNode<ReflectProperty> treeNode2 = new TreeNode<>(new ReflectProperty(serialized, new ReflectType.Struct(clazz, null)), null, null, 4, null);
        parseRecursively(treeNode2, arrayList);
        clazzParseCache.put(clazz, treeNode2);
        return treeNode2;
    }

    private final void parseRecursively(TreeNode<ReflectProperty> treeNode, List<Field> list) {
        TreeNode<ReflectProperty> treeNode2;
        for (Field field : list) {
            field.setAccessible(true);
            Serialized serialized = (Serialized) field.getAnnotation(Serialized.class);
            Class<?> type = field.getType();
            o.LJIIIIZZ(type, "type");
            if (DefinitionKt.isDirectType(type)) {
                treeNode2 = new TreeNode<>(new ReflectProperty(serialized, new ReflectType.DirectType(type, field)), treeNode, null, 4, null);
            } else if (List.class.isAssignableFrom(type)) {
                Type genericType = field.getGenericType();
                if (genericType != null) {
                    Type[] actualTypeArguments = ((ParameterizedType) genericType).getActualTypeArguments();
                    o.LJIIIIZZ(actualTypeArguments, "(field.genericType as Pa…Type).actualTypeArguments");
                    Type memberType = (Type) ORY.LJJIL(actualTypeArguments);
                    o.LJIIIIZZ(memberType, "memberType");
                    treeNode2 = new TreeNode<>(new ReflectProperty(serialized, new ReflectType.List(memberType, field)), treeNode, null, 4, null);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.reflect.ParameterizedType");
                }
            } else if (Map.class.isAssignableFrom(type)) {
                Type genericType2 = field.getGenericType();
                if (genericType2 != null) {
                    Type[] typeArgs = ((ParameterizedType) genericType2).getActualTypeArguments();
                    o.LJIIIIZZ(typeArgs, "typeArgs");
                    Object LJJJJZI = ORY.LJJJJZI(typeArgs);
                    o.LJIIIIZZ(LJJJJZI, "typeArgs.last()");
                    treeNode2 = new TreeNode<>(new ReflectProperty(serialized, new ReflectType.Map((Type) LJJJJZI, field)), treeNode, null, 4, null);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.reflect.ParameterizedType");
                }
            } else {
                Field[] declaredFields = type.getDeclaredFields();
                o.LJIIIIZZ(declaredFields, "type.declaredFields");
                ArrayList arrayList = new ArrayList();
                for (Field field2 : declaredFields) {
                    if (field2.isAnnotationPresent(Serialized.class)) {
                        arrayList.add(field2);
                    }
                }
                treeNode2 = new TreeNode<>(new ReflectProperty(serialized, new ReflectType.Struct(type, field)), treeNode, null, 4, null);
                parseRecursively(treeNode2, arrayList);
            }
            treeNode.getChildren().add(treeNode2);
        }
    }
}
