package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* renamed from: X.EWp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public @interface InterfaceC36563EWp {
    InterfaceC36566EWs defaultValue() default @InterfaceC36566EWs;

    boolean isEnum() default false;

    boolean isGetter() default true;

    String keyPath() default "";

    Class<? extends XBaseModel> nestedClassType() default C35771E2d.class;

    Class<? extends Object> primitiveClassType() default Object.class;

    boolean required() default false;
}
