package com.ss.ugc.aweme.creation.base;

import X.HIN;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class MusicModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<MusicModel> CREATOR = new HIN();

    @InterfaceC65349Pkn("music_id")
    public String musicId;

    /* JADX WARN: Multi-variable type inference failed */
    public MusicModel() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        parcel.writeString(this.musicId);
    }

    public final String getMusicId() {
        return this.musicId;
    }

    public MusicModel(String str) {
        this.musicId = str;
    }

    public final void setMusicId(String str) {
        this.musicId = str;
    }

    public /* synthetic */ MusicModel(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
