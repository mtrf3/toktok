package com.ss.android.ugc.aweme.creative.model.audio;

import X.GPV;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.audio.MusicInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class MusicInfo implements Parcelable {
    public static final Parcelable.Creator<MusicInfo> CREATOR = new Parcelable.Creator<MusicInfo>() { // from class: X.6En
        @Override // android.os.Parcelable.Creator
        public final MusicInfo createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new MusicInfo(parcel.readLong(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MusicInfo[] newArray(int i) {
            return new MusicInfo[i];
        }
    };

    @GPV
    @InterfaceC65349Pkn("id")
    public final long id;

    @GPV
    @InterfaceC65349Pkn("name")
    public final String name;

    /* JADX WARN: Multi-variable type inference failed */
    public MusicInfo() {
        this(0L, null, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeLong(this.id);
        out.writeString(this.name);
    }

    public MusicInfo(long j, String name) {
        o.LJIIIZ(name, "name");
        this.id = j;
        this.name = name;
    }

    public /* synthetic */ MusicInfo(long j, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? "" : str);
    }
}
