package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C27666AtS;
import X.F9E;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class Padding extends F9E implements Parcelable {
    public static final Parcelable.Creator<Padding> CREATOR = new C27666AtS();

    @InterfaceC65349Pkn("bottom")
    public final float bottom;

    @InterfaceC65349Pkn("left")
    public final float left;

    @InterfaceC65349Pkn("right")
    public final float right;

    @InterfaceC65349Pkn("top")
    public final float top;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Padding() {
        /*
            r7 = this;
            r1 = 0
            r5 = 15
            r6 = 0
            r0 = r7
            r2 = r1
            r3 = r1
            r4 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Padding.<init>():void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Float.valueOf(this.top), Float.valueOf(this.bottom), Float.valueOf(this.left), Float.valueOf(this.right)};
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeFloat(this.top);
        out.writeFloat(this.bottom);
        out.writeFloat(this.left);
        out.writeFloat(this.right);
    }

    public Padding(float f, float f2, float f3, float f4) {
        this.top = f;
        this.bottom = f2;
        this.left = f3;
        this.right = f4;
    }

    public /* synthetic */ Padding(float f, float f2, float f3, float f4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2, (i & 4) != 0 ? 0.0f : f3, (i & 8) != 0 ? 0.0f : f4);
    }
}
