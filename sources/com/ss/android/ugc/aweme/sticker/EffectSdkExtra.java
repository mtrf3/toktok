package com.ss.android.ugc.aweme.sticker;

import X.C83533WqP;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class EffectSdkExtra implements Parcelable, Serializable {
    public static final Parcelable.Creator<EffectSdkExtra> CREATOR = new C83533WqP();

    @InterfaceC65349Pkn("pl")
    public PlDataBean pl;

    /* JADX WARN: Multi-variable type inference failed */
    public EffectSdkExtra() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        this.pl.writeToParcel(parcel, 0);
    }

    public final PlDataBean getPl() {
        return this.pl;
    }

    public EffectSdkExtra(PlDataBean pl) {
        o.LJIIIZ(pl, "pl");
        this.pl = pl;
    }

    public final void setPl(PlDataBean plDataBean) {
        o.LJIIIZ(plDataBean, "<set-?>");
        this.pl = plDataBean;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ EffectSdkExtra(com.ss.android.ugc.aweme.sticker.PlDataBean r19, int r20, kotlin.jvm.internal.DefaultConstructorMarker r21) {
        /*
            r18 = this;
            r1 = r19
            r0 = r20 & 1
            if (r0 == 0) goto L1d
            com.ss.android.ugc.aweme.sticker.PlDataBean r1 = new com.ss.android.ugc.aweme.sticker.PlDataBean
            r2 = 0
            r5 = 0
            r16 = 16383(0x3fff, float:2.2957E-41)
            r3 = r2
            r4 = r2
            r6 = r5
            r7 = r5
            r8 = r5
            r9 = r5
            r10 = r5
            r11 = r5
            r12 = r5
            r13 = r5
            r14 = r5
            r15 = r5
            r17 = r2
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
        L1d:
            r0 = r18
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.sticker.EffectSdkExtra.<init>(com.ss.android.ugc.aweme.sticker.PlDataBean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
