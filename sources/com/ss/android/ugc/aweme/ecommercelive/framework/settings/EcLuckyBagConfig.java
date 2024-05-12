package com.ss.android.ugc.aweme.ecommercelive.framework.settings;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class EcLuckyBagConfig {
    public static final EcLuckyBagConfig LIZ = new EcLuckyBagConfig();
    public static final EcLuckyBagSettingConfig LIZIZ = new EcLuckyBagSettingConfig(null, 1, 0 == true ? 1 : 0);

    /* loaded from: classes5.dex */
    public static final class EcLuckyBagSettingConfig {

        @InterfaceC65349Pkn("result_schema")
        public String resultSchema;

        /* JADX WARN: Multi-variable type inference failed */
        public EcLuckyBagSettingConfig() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ EcLuckyBagSettingConfig copy$default(EcLuckyBagSettingConfig ecLuckyBagSettingConfig, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = ecLuckyBagSettingConfig.resultSchema;
            }
            return ecLuckyBagSettingConfig.copy(str);
        }

        public final EcLuckyBagSettingConfig copy(String resultSchema) {
            o.LJIIIZ(resultSchema, "resultSchema");
            return new EcLuckyBagSettingConfig(resultSchema);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof EcLuckyBagSettingConfig) && o.LJ(this.resultSchema, ((EcLuckyBagSettingConfig) obj).resultSchema);
        }

        public int hashCode() {
            return this.resultSchema.hashCode();
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("EcLuckyBagSettingConfig(resultSchema=");
            return q.LIZIZ(LIZ, this.resultSchema, ')', LIZ);
        }

        public final String getResultSchema() {
            return this.resultSchema;
        }

        public EcLuckyBagSettingConfig(String resultSchema) {
            o.LJIIIZ(resultSchema, "resultSchema");
            this.resultSchema = resultSchema;
        }

        public final void setResultSchema(String str) {
            o.LJIIIZ(str, "<set-?>");
            this.resultSchema = str;
        }

        public /* synthetic */ EcLuckyBagSettingConfig(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }
    }
}
