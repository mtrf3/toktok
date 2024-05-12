package com.ss.android.ugc.aweme.music.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TTMInfo implements Serializable {
    public static final Companion Companion = new Companion();

    @InterfaceC65349Pkn("brand")
    public TTMBrand brand;

    @InterfaceC65349Pkn("product")
    public Integer product;

    @InterfaceC65349Pkn("vip_verification_schema")
    public String vipVerificationSchema;

    /* JADX WARN: Multi-variable type inference failed */
    public TTMInfo() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ TTMInfo copy$default(TTMInfo tTMInfo, Integer num, TTMBrand tTMBrand, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = tTMInfo.product;
        }
        if ((i & 2) != 0) {
            tTMBrand = tTMInfo.brand;
        }
        if ((i & 4) != 0) {
            str = tTMInfo.vipVerificationSchema;
        }
        return tTMInfo.copy(num, tTMBrand, str);
    }

    public final TTMInfo copy(Integer num, TTMBrand tTMBrand, String str) {
        return new TTMInfo(num, tTMBrand, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TTMInfo)) {
            return false;
        }
        TTMInfo tTMInfo = (TTMInfo) obj;
        return o.LJ(this.product, tTMInfo.product) && o.LJ(this.brand, tTMInfo.brand) && o.LJ(this.vipVerificationSchema, tTMInfo.vipVerificationSchema);
    }

    public int hashCode() {
        Integer num = this.product;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        TTMBrand tTMBrand = this.brand;
        int hashCode2 = (hashCode + (tTMBrand == null ? 0 : tTMBrand.hashCode())) * 31;
        String str = this.vipVerificationSchema;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final boolean isTtm() {
        Integer num = this.product;
        if (num == null || num.intValue() != 2) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TTMInfo(product=");
        LIZ.append(this.product);
        LIZ.append(", brand=");
        LIZ.append(this.brand);
        LIZ.append(", vipVerificationSchema=");
        return q.LIZIZ(LIZ, this.vipVerificationSchema, ')', LIZ);
    }

    /* loaded from: classes13.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public final TTMBrand getBrand() {
        return this.brand;
    }

    public final Integer getProduct() {
        return this.product;
    }

    public final String getVipVerificationSchema() {
        return this.vipVerificationSchema;
    }

    public TTMInfo(Integer num, TTMBrand tTMBrand, String str) {
        this.product = num;
        this.brand = tTMBrand;
        this.vipVerificationSchema = str;
    }

    public /* synthetic */ TTMInfo(Integer num, TTMBrand tTMBrand, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? null : tTMBrand, (i & 4) != 0 ? null : str);
    }
}
