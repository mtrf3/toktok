package com.ss.android.ugc.aweme.ecommercelive.business.settings;

import X.C16880lQ;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ShopBagIconNewUserAnimSettings$ECShopBagNewUserAnimConfig {

    @InterfaceC65349Pkn("anim_show_max_room_count")
    public final int animShowMaxRoomCount;

    @InterfaceC65349Pkn("anim_show_max_user_count")
    public final int animShowMaxUserCount;

    @InterfaceC65349Pkn("delay_show_time")
    public final long delayShowTime;

    @InterfaceC65349Pkn("new_user_anim_v1")
    public final String newUserAnimV1;

    @InterfaceC65349Pkn("new_user_anim_v2")
    public final String newUserAnimV2;

    @InterfaceC65349Pkn("shop_bag_click_max_time")
    public final int shopBagClickMaxTime;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ShopBagIconNewUserAnimSettings$ECShopBagNewUserAnimConfig() {
        /*
            r10 = this;
            r1 = 0
            r3 = 0
            r6 = 0
            r8 = 63
            r0 = r10
            r4 = r3
            r5 = r3
            r7 = r6
            r9 = r6
            r0.<init>(r1, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommercelive.business.settings.ShopBagIconNewUserAnimSettings$ECShopBagNewUserAnimConfig.<init>():void");
    }

    public static /* synthetic */ ShopBagIconNewUserAnimSettings$ECShopBagNewUserAnimConfig copy$default(ShopBagIconNewUserAnimSettings$ECShopBagNewUserAnimConfig shopBagIconNewUserAnimSettings$ECShopBagNewUserAnimConfig, long j, int i, int i2, int i3, String str, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j = shopBagIconNewUserAnimSettings$ECShopBagNewUserAnimConfig.delayShowTime;
        }
        if ((i4 & 2) != 0) {
            i = shopBagIconNewUserAnimSettings$ECShopBagNewUserAnimConfig.shopBagClickMaxTime;
        }
        if ((i4 & 4) != 0) {
            i2 = shopBagIconNewUserAnimSettings$ECShopBagNewUserAnimConfig.animShowMaxRoomCount;
        }
        if ((i4 & 8) != 0) {
            i3 = shopBagIconNewUserAnimSettings$ECShopBagNewUserAnimConfig.animShowMaxUserCount;
        }
        if ((i4 & 16) != 0) {
            str = shopBagIconNewUserAnimSettings$ECShopBagNewUserAnimConfig.newUserAnimV1;
        }
        if ((i4 & 32) != 0) {
            str2 = shopBagIconNewUserAnimSettings$ECShopBagNewUserAnimConfig.newUserAnimV2;
        }
        return shopBagIconNewUserAnimSettings$ECShopBagNewUserAnimConfig.copy(j, i, i2, i3, str, str2);
    }

    public final ShopBagIconNewUserAnimSettings$ECShopBagNewUserAnimConfig copy(long j, int i, int i2, int i3, String str, String str2) {
        return new ShopBagIconNewUserAnimSettings$ECShopBagNewUserAnimConfig(j, i, i2, i3, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopBagIconNewUserAnimSettings$ECShopBagNewUserAnimConfig)) {
            return false;
        }
        ShopBagIconNewUserAnimSettings$ECShopBagNewUserAnimConfig shopBagIconNewUserAnimSettings$ECShopBagNewUserAnimConfig = (ShopBagIconNewUserAnimSettings$ECShopBagNewUserAnimConfig) obj;
        return this.delayShowTime == shopBagIconNewUserAnimSettings$ECShopBagNewUserAnimConfig.delayShowTime && this.shopBagClickMaxTime == shopBagIconNewUserAnimSettings$ECShopBagNewUserAnimConfig.shopBagClickMaxTime && this.animShowMaxRoomCount == shopBagIconNewUserAnimSettings$ECShopBagNewUserAnimConfig.animShowMaxRoomCount && this.animShowMaxUserCount == shopBagIconNewUserAnimSettings$ECShopBagNewUserAnimConfig.animShowMaxUserCount && o.LJ(this.newUserAnimV1, shopBagIconNewUserAnimSettings$ECShopBagNewUserAnimConfig.newUserAnimV1) && o.LJ(this.newUserAnimV2, shopBagIconNewUserAnimSettings$ECShopBagNewUserAnimConfig.newUserAnimV2);
    }

    public int hashCode() {
        int LLJIJIL = ((((((C16880lQ.LLJIJIL(this.delayShowTime) * 31) + this.shopBagClickMaxTime) * 31) + this.animShowMaxRoomCount) * 31) + this.animShowMaxUserCount) * 31;
        String str = this.newUserAnimV1;
        int hashCode = (LLJIJIL + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.newUserAnimV2;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ECShopBagNewUserAnimConfig(delayShowTime=");
        LIZ.append(this.delayShowTime);
        LIZ.append(", shopBagClickMaxTime=");
        LIZ.append(this.shopBagClickMaxTime);
        LIZ.append(", animShowMaxRoomCount=");
        LIZ.append(this.animShowMaxRoomCount);
        LIZ.append(", animShowMaxUserCount=");
        LIZ.append(this.animShowMaxUserCount);
        LIZ.append(", newUserAnimV1=");
        LIZ.append(this.newUserAnimV1);
        LIZ.append(", newUserAnimV2=");
        return q.LIZIZ(LIZ, this.newUserAnimV2, ')', LIZ);
    }

    public final int getAnimShowMaxRoomCount() {
        return this.animShowMaxRoomCount;
    }

    public final int getAnimShowMaxUserCount() {
        return this.animShowMaxUserCount;
    }

    public final long getDelayShowTime() {
        return this.delayShowTime;
    }

    public final String getNewUserAnimV1() {
        return this.newUserAnimV1;
    }

    public final String getNewUserAnimV2() {
        return this.newUserAnimV2;
    }

    public final int getShopBagClickMaxTime() {
        return this.shopBagClickMaxTime;
    }

    public ShopBagIconNewUserAnimSettings$ECShopBagNewUserAnimConfig(long j, int i, int i2, int i3, String str, String str2) {
        this.delayShowTime = j;
        this.shopBagClickMaxTime = i;
        this.animShowMaxRoomCount = i2;
        this.animShowMaxUserCount = i3;
        this.newUserAnimV1 = str;
        this.newUserAnimV2 = str2;
    }

    public /* synthetic */ ShopBagIconNewUserAnimSettings$ECShopBagNewUserAnimConfig(long j, int i, int i2, int i3, String str, String str2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 5000L : j, (i4 & 2) != 0 ? 3 : i, (i4 & 4) != 0 ? 1 : i2, (i4 & 8) != 0 ? 5 : i3, (i4 & 16) != 0 ? null : str, (i4 & 32) == 0 ? str2 : null);
    }
}
