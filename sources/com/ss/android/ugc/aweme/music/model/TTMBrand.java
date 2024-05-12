package com.ss.android.ugc.aweme.music.model;

import X.InterfaceC65349Pkn;
import X.ORY;
import X.X1D;
import defpackage.b0;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TTMBrand implements Serializable {
    public static final Companion Companion = new Companion();

    @InterfaceC65349Pkn("button_text")
    public String buttonText;

    @InterfaceC65349Pkn("entrance")
    public String entrance;

    @InterfaceC65349Pkn("link")
    public TTMLink link;

    @InterfaceC65349Pkn("product_status")
    public int productStatus;

    @InterfaceC65349Pkn("subscribed")
    public boolean subscribed;

    @InterfaceC65349Pkn("subtitle")
    public String subtitle;

    @InterfaceC65349Pkn("title")
    public String title;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TTMBrand() {
        /*
            r10 = this;
            r1 = 0
            r6 = 0
            r8 = 127(0x7f, float:1.78E-43)
            r0 = r10
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r7 = r6
            r9 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.model.TTMBrand.<init>():void");
    }

    public static /* synthetic */ TTMBrand copy$default(TTMBrand tTMBrand, String str, TTMLink tTMLink, String str2, String str3, String str4, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = tTMBrand.entrance;
        }
        if ((i2 & 2) != 0) {
            tTMLink = tTMBrand.link;
        }
        if ((i2 & 4) != 0) {
            str2 = tTMBrand.title;
        }
        if ((i2 & 8) != 0) {
            str3 = tTMBrand.subtitle;
        }
        if ((i2 & 16) != 0) {
            str4 = tTMBrand.buttonText;
        }
        if ((i2 & 32) != 0) {
            z = tTMBrand.subscribed;
        }
        if ((i2 & 64) != 0) {
            i = tTMBrand.productStatus;
        }
        return tTMBrand.copy(str, tTMLink, str2, str3, str4, z, i);
    }

    public final TTMBrand copy(String str, TTMLink tTMLink, String str2, String str3, String str4, boolean z, int i) {
        return new TTMBrand(str, tTMLink, str2, str3, str4, z, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TTMBrand)) {
            return false;
        }
        TTMBrand tTMBrand = (TTMBrand) obj;
        return o.LJ(this.entrance, tTMBrand.entrance) && o.LJ(this.link, tTMBrand.link) && o.LJ(this.title, tTMBrand.title) && o.LJ(this.subtitle, tTMBrand.subtitle) && o.LJ(this.buttonText, tTMBrand.buttonText) && this.subscribed == tTMBrand.subscribed && this.productStatus == tTMBrand.productStatus;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.entrance;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        TTMLink tTMLink = this.link;
        int hashCode2 = (hashCode + (tTMLink == null ? 0 : tTMLink.hashCode())) * 31;
        String str2 = this.title;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subtitle;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.buttonText;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        boolean z = this.subscribed;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((hashCode5 + i) * 31) + this.productStatus;
    }

    public final boolean isInExp() {
        return ORY.LJJIJIIJIL(this.entrance, new String[]{"for_you_action_sheet", "music_detail_action_sheet", "music_detail_button"});
    }

    public final boolean isOn() {
        if (this.productStatus == 2) {
            return true;
        }
        return false;
    }

    public final boolean isUX1() {
        return o.LJ(this.entrance, "for_you_action_sheet");
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TTMBrand(entrance=");
        LIZ.append(this.entrance);
        LIZ.append(", link=");
        LIZ.append(this.link);
        LIZ.append(", title=");
        LIZ.append(this.title);
        LIZ.append(", subtitle=");
        LIZ.append(this.subtitle);
        LIZ.append(", buttonText=");
        LIZ.append(this.buttonText);
        LIZ.append(", subscribed=");
        LIZ.append(this.subscribed);
        LIZ.append(", productStatus=");
        return b0.LIZJ(LIZ, this.productStatus, ')', LIZ);
    }

    /* loaded from: classes13.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final String getEntrance() {
        return this.entrance;
    }

    public final TTMLink getLink() {
        return this.link;
    }

    public final int getProductStatus() {
        return this.productStatus;
    }

    public final boolean getSubscribed() {
        return this.subscribed;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public TTMBrand(String str, TTMLink tTMLink, String str2, String str3, String str4, boolean z, int i) {
        this.entrance = str;
        this.link = tTMLink;
        this.title = str2;
        this.subtitle = str3;
        this.buttonText = str4;
        this.subscribed = z;
        this.productStatus = i;
    }

    public /* synthetic */ TTMBrand(String str, TTMLink tTMLink, String str2, String str3, String str4, boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? null : tTMLink, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) == 0 ? str4 : null, (i2 & 32) != 0 ? false : z, (i2 & 64) != 0 ? 1 : i);
    }
}
