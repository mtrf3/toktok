package com.ss.android.ugc.aweme.compliance.api.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class BanInfo implements Serializable {

    @InterfaceC65349Pkn("ban_platform")
    public final Integer banPlatform;

    @InterfaceC65349Pkn("ban_type")
    public final Integer banType;

    /* JADX WARN: Multi-variable type inference failed */
    public BanInfo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BanInfo copy$default(BanInfo banInfo, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = banInfo.banType;
        }
        if ((i & 2) != 0) {
            num2 = banInfo.banPlatform;
        }
        return banInfo.copy(num, num2);
    }

    public final BanInfo copy(Integer num, Integer num2) {
        return new BanInfo(num, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BanInfo)) {
            return false;
        }
        BanInfo banInfo = (BanInfo) obj;
        return o.LJ(this.banType, banInfo.banType) && o.LJ(this.banPlatform, banInfo.banPlatform);
    }

    public int hashCode() {
        Integer num = this.banType;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.banPlatform;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BanInfo(banType=");
        LIZ.append(this.banType);
        LIZ.append(", banPlatform=");
        return s0.LIZJ(LIZ, this.banPlatform, ')', LIZ);
    }

    public final Integer getBanPlatform() {
        return this.banPlatform;
    }

    public final Integer getBanType() {
        return this.banType;
    }

    public BanInfo(Integer num, Integer num2) {
        this.banType = num;
        this.banPlatform = num2;
    }

    public /* synthetic */ BanInfo(Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? 0 : num2);
    }
}
