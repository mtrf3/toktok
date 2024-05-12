package com.ss.android.ugc.aweme.shortvideo;

import X.C44499HdH;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class ClientCherEffectParam implements Serializable, Parcelable {
    public static final C44499HdH CREATOR = new C44499HdH();

    @InterfaceC65349Pkn("duration")
    public double[] duration;

    @InterfaceC65349Pkn("matrix")
    public String[] matrix;

    @InterfaceC65349Pkn("segUseCher")
    public boolean[] segUseCher;

    /* JADX WARN: Multi-variable type inference failed */
    public ClientCherEffectParam() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final double[] getDuration() {
        return this.duration;
    }

    public final String[] getMatrix() {
        return this.matrix;
    }

    public final boolean[] getSegUseCher() {
        return this.segUseCher;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ClientCherEffectParam(Parcel parcel) {
        this(parcel.createStringArray(), parcel.createDoubleArray(), parcel.createBooleanArray());
        o.LJIIIZ(parcel, "parcel");
    }

    public final void setDuration(double[] dArr) {
        this.duration = dArr;
    }

    public final void setMatrix(String[] strArr) {
        this.matrix = strArr;
    }

    public final void setSegUseCher(boolean[] zArr) {
        this.segUseCher = zArr;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        parcel.writeStringArray(this.matrix);
        parcel.writeDoubleArray(this.duration);
        parcel.writeBooleanArray(this.segUseCher);
    }

    public ClientCherEffectParam(String[] strArr, double[] dArr, boolean[] zArr) {
        this.matrix = strArr;
        this.duration = dArr;
        this.segUseCher = zArr;
    }

    public /* synthetic */ ClientCherEffectParam(String[] strArr, double[] dArr, boolean[] zArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : strArr, (i & 2) != 0 ? null : dArr, (i & 4) != 0 ? null : zArr);
    }
}
