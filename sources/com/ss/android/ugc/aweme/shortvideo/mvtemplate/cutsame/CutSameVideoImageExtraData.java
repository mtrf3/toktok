package com.ss.android.ugc.aweme.shortvideo.mvtemplate.cutsame;

import X.F9E;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.cutsame.CutSameVideoImageExtraData;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class CutSameVideoImageExtraData extends F9E implements Parcelable {
    public static final Parcelable.Creator<CutSameVideoImageExtraData> CREATOR = new Parcelable.Creator<CutSameVideoImageExtraData>() { // from class: X.6r7
        @Override // android.os.Parcelable.Creator
        public final CutSameVideoImageExtraData createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new CutSameVideoImageExtraData(parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final CutSameVideoImageExtraData[] newArray(int i) {
            return new CutSameVideoImageExtraData[i];
        }
    };
    public final long extraDuration;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.extraDuration)};
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeLong(this.extraDuration);
    }

    public CutSameVideoImageExtraData(long j) {
        this.extraDuration = j;
    }
}
