package com.bytedance.lynx.spark.schema.model;

import X.EnumC39924Flg;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class SparkCardSchemaParam extends SparkSchemaParam {
    /* JADX WARN: Multi-variable type inference failed */
    public SparkCardSchemaParam() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SparkCardSchemaParam(EnumC39924Flg engineType) {
        super(engineType);
        o.LJIIJ(engineType, "engineType");
    }

    public /* synthetic */ SparkCardSchemaParam(EnumC39924Flg enumC39924Flg, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? EnumC39924Flg.UNKNOWN : enumC39924Flg);
    }
}
