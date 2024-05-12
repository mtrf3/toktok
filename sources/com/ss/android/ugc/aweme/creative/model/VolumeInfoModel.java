package com.ss.android.ugc.aweme.creative.model;

import X.C43555H7n;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class VolumeInfoModel implements Parcelable {
    public static final Parcelable.Creator<VolumeInfoModel> CREATOR = new C43555H7n();

    @InterfaceC65349Pkn("music_volume")
    public float musicVolume;

    @InterfaceC65349Pkn("video_volume")
    public float videoVolume;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public VolumeInfoModel() {
        /*
            r3 = this;
            r2 = 3
            r1 = 0
            r0 = 0
            r3.<init>(r0, r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.creative.model.VolumeInfoModel.<init>():void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeFloat(this.musicVolume);
        out.writeFloat(this.videoVolume);
    }

    public VolumeInfoModel(float f, float f2) {
        this.musicVolume = f;
        this.videoVolume = f2;
    }

    public /* synthetic */ VolumeInfoModel(float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? -1.0f : f, (i & 2) != 0 ? -1.0f : f2);
    }
}
