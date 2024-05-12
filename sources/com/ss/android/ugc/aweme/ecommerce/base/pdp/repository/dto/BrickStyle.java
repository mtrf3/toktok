package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C0MT;
import X.C1FJ;
import X.C1FL;
import X.C27633Asv;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class BrickStyle implements Parcelable {
    public static final Parcelable.Creator<BrickStyle> CREATOR = new C27633Asv();

    @InterfaceC65349Pkn("background_color")
    public final String backgroundColor;

    @InterfaceC65349Pkn("background_color_dark")
    public final String backgroundColorDark;

    @InterfaceC65349Pkn("collapse_height")
    public final Integer collapseHeight;

    @InterfaceC65349Pkn("height")
    public final Float height;

    @InterfaceC65349Pkn("padding")
    public final Padding padding;

    @InterfaceC65349Pkn("show_divider")
    public final Boolean showDivider;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrickStyle)) {
            return false;
        }
        BrickStyle brickStyle = (BrickStyle) obj;
        return o.LJ(this.height, brickStyle.height) && o.LJ(this.padding, brickStyle.padding) && o.LJ(this.showDivider, brickStyle.showDivider) && o.LJ(this.backgroundColor, brickStyle.backgroundColor) && o.LJ(this.backgroundColorDark, brickStyle.backgroundColorDark) && o.LJ(this.collapseHeight, brickStyle.collapseHeight);
    }

    public final int hashCode() {
        Float f = this.height;
        int hashCode = (f == null ? 0 : f.hashCode()) * 31;
        Padding padding = this.padding;
        int hashCode2 = (hashCode + (padding == null ? 0 : padding.hashCode())) * 31;
        Boolean bool = this.showDivider;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.backgroundColorDark;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.collapseHeight;
        return hashCode5 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BrickStyle(height=");
        LIZ.append(this.height);
        LIZ.append(", padding=");
        LIZ.append(this.padding);
        LIZ.append(", showDivider=");
        LIZ.append(this.showDivider);
        LIZ.append(", backgroundColor=");
        LIZ.append(this.backgroundColor);
        LIZ.append(", backgroundColorDark=");
        LIZ.append(this.backgroundColorDark);
        LIZ.append(", collapseHeight=");
        return s0.LIZJ(LIZ, this.collapseHeight, ')', LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        Float f = this.height;
        if (f == null) {
            out.writeInt(0);
        } else {
            C0MT.LIZJ(out, 1, f);
        }
        Padding padding = this.padding;
        if (padding == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            padding.writeToParcel(out, i);
        }
        Boolean bool = this.showDivider;
        if (bool == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool);
        }
        out.writeString(this.backgroundColor);
        out.writeString(this.backgroundColorDark);
        Integer num = this.collapseHeight;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
    }

    public BrickStyle(Float f, Padding padding, Boolean bool, String str, String str2, Integer num) {
        this.height = f;
        this.padding = padding;
        this.showDivider = bool;
        this.backgroundColor = str;
        this.backgroundColorDark = str2;
        this.collapseHeight = num;
    }

    public /* synthetic */ BrickStyle(Float f, Padding padding, Boolean bool, String str, String str2, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Float.valueOf(0.0f) : f, padding, (i & 4) != 0 ? Boolean.FALSE : bool, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) == 0 ? num : null);
    }
}
