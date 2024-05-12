package com.livecore.base.tinyjson;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public abstract class ReflectType {
    public final Field field;

    /* loaded from: classes16.dex */
    public static final class DirectType extends ReflectType {
        public final Class<? extends Object> type;

        public final Class<? extends Object> getType() {
            return this.type;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DirectType(Class<? extends Object> type, Field field) {
            super(field);
            o.LJIIIZ(type, "type");
            o.LJIIIZ(field, "field");
            this.type = type;
        }
    }

    /* loaded from: classes16.dex */
    public static final class List extends ReflectType {
        public final Type memberType;

        public final Type getMemberType() {
            return this.memberType;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public List(Type memberType, Field field) {
            super(field);
            o.LJIIIZ(memberType, "memberType");
            o.LJIIIZ(field, "field");
            this.memberType = memberType;
        }
    }

    /* loaded from: classes16.dex */
    public static final class Map extends ReflectType {
        public final Type valueType;

        public final Type getValueType() {
            return this.valueType;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Map(Type valueType, Field field) {
            super(field);
            o.LJIIIZ(valueType, "valueType");
            o.LJIIIZ(field, "field");
            this.valueType = valueType;
        }
    }

    /* loaded from: classes16.dex */
    public static final class Struct extends ReflectType {
        public final Class<? extends Object> clazz;

        public final Class<? extends Object> getClazz() {
            return this.clazz;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Struct(Class<? extends Object> clazz, Field field) {
            super(field);
            o.LJIIIZ(clazz, "clazz");
            this.clazz = clazz;
        }
    }

    public final Field getField() {
        return this.field;
    }

    public ReflectType(Field field) {
        this.field = field;
    }

    public /* synthetic */ ReflectType(Field field, DefaultConstructorMarker defaultConstructorMarker) {
        this(field);
    }
}
