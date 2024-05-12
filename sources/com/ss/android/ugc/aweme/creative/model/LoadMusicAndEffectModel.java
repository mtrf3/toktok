package com.ss.android.ugc.aweme.creative.model;

import X.GPV;
import X.HBD;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class LoadMusicAndEffectModel implements Parcelable {
    public static final Parcelable.Creator<LoadMusicAndEffectModel> CREATOR = new HBD();

    @GPV
    public boolean loadAfterRecord;

    @GPV
    public String musicId;

    @GPV
    public boolean netUnavailableMusic;

    public LoadMusicAndEffectModel() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.loadAfterRecord ? 1 : 0);
        out.writeInt(this.netUnavailableMusic ? 1 : 0);
        out.writeString(this.musicId);
    }

    public /* synthetic */ LoadMusicAndEffectModel(int i) {
        this(false, false, null);
    }

    public LoadMusicAndEffectModel(boolean z, boolean z2, String str) {
        this.loadAfterRecord = z;
        this.netUnavailableMusic = z2;
        this.musicId = str;
    }
}
