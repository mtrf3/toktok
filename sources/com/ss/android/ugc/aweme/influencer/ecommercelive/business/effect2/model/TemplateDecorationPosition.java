package com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model;

import X.C1FJ;
import X.C71606S8k;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.s0;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TemplateDecorationPosition implements Parcelable {
    public static final Parcelable.Creator<TemplateDecorationPosition> CREATOR = new C71606S8k();

    @InterfaceC65349Pkn("x")
    public final Integer posX;

    @InterfaceC65349Pkn("y")
    public final Integer posY;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TemplateDecorationPosition)) {
            return false;
        }
        TemplateDecorationPosition templateDecorationPosition = (TemplateDecorationPosition) obj;
        return o.LJ(this.posX, templateDecorationPosition.posX) && o.LJ(this.posY, templateDecorationPosition.posY);
    }

    public final int hashCode() {
        Integer num = this.posX;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.posY;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TemplateDecorationPosition(posX=");
        LIZ.append(this.posX);
        LIZ.append(", posY=");
        return s0.LIZJ(LIZ, this.posY, ')', LIZ);
    }

    public TemplateDecorationPosition(Integer num, Integer num2) {
        this.posX = num;
        this.posY = num2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        Integer num = this.posX;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        Integer num2 = this.posY;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num2);
        }
    }
}
