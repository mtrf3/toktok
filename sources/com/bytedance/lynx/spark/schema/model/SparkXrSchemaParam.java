package com.bytedance.lynx.spark.schema.model;

import X.EnumC39924Flg;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class SparkXrSchemaParam extends SparkSchemaParam {
    public boolean exitOnActivityFinish;
    public String splashDrawable;
    public String splashTitle;

    /* JADX WARN: Multi-variable type inference failed */
    public SparkXrSchemaParam() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean getExitOnActivityFinish() {
        return this.exitOnActivityFinish;
    }

    public final String getSplashDrawable() {
        return this.splashDrawable;
    }

    public final String getSplashTitle() {
        return this.splashTitle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SparkXrSchemaParam(EnumC39924Flg engineType) {
        super(engineType);
        o.LJIIJ(engineType, "engineType");
        this.splashDrawable = "spark_icon";
        this.splashTitle = "App Title";
    }

    public final void setExitOnActivityFinish(boolean z) {
        this.exitOnActivityFinish = z;
    }

    public final void setSplashDrawable(String str) {
        o.LJIIJ(str, "<set-?>");
        this.splashDrawable = str;
    }

    public final void setSplashTitle(String str) {
        o.LJIIJ(str, "<set-?>");
        this.splashTitle = str;
    }

    public /* synthetic */ SparkXrSchemaParam(EnumC39924Flg enumC39924Flg, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? EnumC39924Flg.UNKNOWN : enumC39924Flg);
    }
}
