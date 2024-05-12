package com.ss.android.ugc.aweme.shortvideo.model;

import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class NLEEditModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<NLEEditModel> CREATOR = new Creator();

    @InterfaceC65349Pkn("is_nle_canvas")
    public boolean isNLECanvas;

    /* loaded from: classes8.dex */
    public static final class Creator implements Parcelable.Creator<NLEEditModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NLEEditModel createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new NLEEditModel(parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NLEEditModel[] newArray(int i) {
            return new NLEEditModel[i];
        }
    }

    public NLEEditModel() {
        this(false, 1, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final void resetModel() {
        this.isNLECanvas = false;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.isNLECanvas ? 1 : 0);
    }

    public final boolean isNLECanvas() {
        return this.isNLECanvas;
    }

    public NLEEditModel(boolean z) {
        this.isNLECanvas = z;
    }

    public final void setNLECanvas(boolean z) {
        this.isNLECanvas = z;
    }

    public /* synthetic */ NLEEditModel(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
