package com.ss.android.ugc.aweme.creative.model;

import X.C43593H8z;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class MusicVolumeInfoModel implements Parcelable {
    public static final Parcelable.Creator<MusicVolumeInfoModel> CREATOR = new C43593H8z();

    @InterfaceC65349Pkn("duet_src_loudness")
    public float duetSrcLoudness;

    @InterfaceC65349Pkn("music_volume_info_music_id")
    public String musicId;

    @InterfaceC65349Pkn("music_volume_info_json")
    public String musicVolumeInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public MusicVolumeInfoModel() {
        this(null, 0 == true ? 1 : 0, 0.0f, 7, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.musicId);
        out.writeString(this.musicVolumeInfo);
        out.writeFloat(this.duetSrcLoudness);
    }

    public MusicVolumeInfoModel(String str, String str2, float f) {
        this.musicId = str;
        this.musicVolumeInfo = str2;
        this.duetSrcLoudness = f;
    }

    public /* synthetic */ MusicVolumeInfoModel(String str, String str2, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? Float.MIN_VALUE : f);
    }
}
