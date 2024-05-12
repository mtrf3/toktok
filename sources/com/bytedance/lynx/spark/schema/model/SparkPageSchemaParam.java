package com.bytedance.lynx.spark.schema.model;

import X.EnumC39924Flg;
import com.bytedance.lynx.spark.schema.model.AbsModel.AbsSparkPageSchemaParam;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class SparkPageSchemaParam extends AbsSparkPageSchemaParam {
    /* JADX WARN: Multi-variable type inference failed */
    public SparkPageSchemaParam() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SparkPageSchemaParam(EnumC39924Flg engineType) {
        super(engineType);
        o.LJIIJ(engineType, "engineType");
    }

    public /* synthetic */ SparkPageSchemaParam(EnumC39924Flg enumC39924Flg, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? EnumC39924Flg.UNKNOWN : enumC39924Flg);
    }
}
