package com.bytedance.android.live.annotation;

/* loaded from: classes.dex */
public @interface Group {
    boolean isDefault() default false;

    String value() default "";
}
