package com.ss.android.ugc.aweme.editSticker.text.bean;

import X.F9E;
import X.InterfaceC65349Pkn;
import X.UC7;
import X.W3C;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class EffectTextBgNinePatch extends F9E implements Parcelable {
    public static final Parcelable.Creator<EffectTextBgNinePatch> CREATOR = new W3C();

    @InterfaceC65349Pkn("divX")
    public final List<NinePatchDiv> divX;

    @InterfaceC65349Pkn("divY")
    public final List<NinePatchDiv> divY;

    @InterfaceC65349Pkn("padding_bottom")
    public final int paddingBottom;

    @InterfaceC65349Pkn("padding_left")
    public final int paddingLeft;

    @InterfaceC65349Pkn("padding_right")
    public final int paddingRight;

    @InterfaceC65349Pkn("padding_top")
    public final int paddingTop;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public EffectTextBgNinePatch() {
        /*
            r9 = this;
            r1 = 0
            r3 = 0
            r7 = 63
            r0 = r9
            r2 = r1
            r4 = r3
            r5 = r3
            r6 = r3
            r8 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.editSticker.text.bean.EffectTextBgNinePatch.<init>():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EffectTextBgNinePatch copy$default(EffectTextBgNinePatch effectTextBgNinePatch, List list, List list2, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            list = effectTextBgNinePatch.divX;
        }
        if ((i5 & 2) != 0) {
            list2 = effectTextBgNinePatch.divY;
        }
        if ((i5 & 4) != 0) {
            i = effectTextBgNinePatch.paddingLeft;
        }
        if ((i5 & 8) != 0) {
            i2 = effectTextBgNinePatch.paddingRight;
        }
        if ((i5 & 16) != 0) {
            i3 = effectTextBgNinePatch.paddingTop;
        }
        if ((i5 & 32) != 0) {
            i4 = effectTextBgNinePatch.paddingBottom;
        }
        return effectTextBgNinePatch.copy(list, list2, i, i2, i3, i4);
    }

    public final EffectTextBgNinePatch copy(List<NinePatchDiv> divX, List<NinePatchDiv> divY, int i, int i2, int i3, int i4) {
        o.LJIIIZ(divX, "divX");
        o.LJIIIZ(divY, "divY");
        return new EffectTextBgNinePatch(divX, divY, i, i2, i3, i4);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.divX, this.divY, Integer.valueOf(this.paddingLeft), Integer.valueOf(this.paddingRight), Integer.valueOf(this.paddingTop), Integer.valueOf(this.paddingBottom)};
    }

    public final List<NinePatchDiv> getDivX() {
        return this.divX;
    }

    public final List<NinePatchDiv> getDivY() {
        return this.divY;
    }

    public final int getPaddingBottom() {
        return this.paddingBottom;
    }

    public final int getPaddingLeft() {
        return this.paddingLeft;
    }

    public final int getPaddingRight() {
        return this.paddingRight;
    }

    public final int getPaddingTop() {
        return this.paddingTop;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        Iterator LIZJ = UC7.LIZJ(this.divX, out);
        while (LIZJ.hasNext()) {
            ((NinePatchDiv) LIZJ.next()).writeToParcel(out, i);
        }
        Iterator LIZJ2 = UC7.LIZJ(this.divY, out);
        while (LIZJ2.hasNext()) {
            ((NinePatchDiv) LIZJ2.next()).writeToParcel(out, i);
        }
        out.writeInt(this.paddingLeft);
        out.writeInt(this.paddingRight);
        out.writeInt(this.paddingTop);
        out.writeInt(this.paddingBottom);
    }

    public EffectTextBgNinePatch(List<NinePatchDiv> divX, List<NinePatchDiv> divY, int i, int i2, int i3, int i4) {
        o.LJIIIZ(divX, "divX");
        o.LJIIIZ(divY, "divY");
        this.divX = divX;
        this.divY = divY;
        this.paddingLeft = i;
        this.paddingRight = i2;
        this.paddingTop = i3;
        this.paddingBottom = i4;
    }

    public /* synthetic */ EffectTextBgNinePatch(List list, List list2, int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? new ArrayList() : list, (i5 & 2) != 0 ? new ArrayList() : list2, (i5 & 4) != 0 ? 0 : i, (i5 & 8) != 0 ? 0 : i2, (i5 & 16) != 0 ? 0 : i3, (i5 & 32) == 0 ? i4 : 0);
    }
}
