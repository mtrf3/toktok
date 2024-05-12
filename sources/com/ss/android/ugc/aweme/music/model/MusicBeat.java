package com.ss.android.ugc.aweme.music.model;

import X.C1FJ;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class MusicBeat implements Serializable, Parcelable {
    public static final Parcelable.Creator<MusicBeat> CREATOR = new Creator();

    @InterfaceC65349Pkn("man_made_beats")
    public final String manMadeBeats;

    @InterfaceC65349Pkn("max_video_num")
    public final Integer maxVideoNum;

    @InterfaceC65349Pkn("min_video_num")
    public final Integer minVideoNum;

    @InterfaceC65349Pkn("onset_cnn")
    public final String onset_cnn;

    @InterfaceC65349Pkn("type")
    public final Integer type;

    /* loaded from: classes8.dex */
    public static final class Creator implements Parcelable.Creator<MusicBeat> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MusicBeat createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new MusicBeat(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MusicBeat[] newArray(int i) {
            return new MusicBeat[i];
        }
    }

    public static /* synthetic */ MusicBeat copy$default(MusicBeat musicBeat, Integer num, Integer num2, String str, Integer num3, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = musicBeat.minVideoNum;
        }
        if ((i & 2) != 0) {
            num2 = musicBeat.maxVideoNum;
        }
        if ((i & 4) != 0) {
            str = musicBeat.manMadeBeats;
        }
        if ((i & 8) != 0) {
            num3 = musicBeat.type;
        }
        if ((i & 16) != 0) {
            str2 = musicBeat.onset_cnn;
        }
        return musicBeat.copy(num, num2, str, num3, str2);
    }

    public final MusicBeat copy(Integer num, Integer num2, String str, Integer num3, String str2) {
        return new MusicBeat(num, num2, str, num3, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicBeat)) {
            return false;
        }
        MusicBeat musicBeat = (MusicBeat) obj;
        return o.LJ(this.minVideoNum, musicBeat.minVideoNum) && o.LJ(this.maxVideoNum, musicBeat.maxVideoNum) && o.LJ(this.manMadeBeats, musicBeat.manMadeBeats) && o.LJ(this.type, musicBeat.type) && o.LJ(this.onset_cnn, musicBeat.onset_cnn);
    }

    public int hashCode() {
        Integer num = this.minVideoNum;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.maxVideoNum;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.manMadeBeats;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num3 = this.type;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str2 = this.onset_cnn;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MusicBeat(minVideoNum=");
        LIZ.append(this.minVideoNum);
        LIZ.append(", maxVideoNum=");
        LIZ.append(this.maxVideoNum);
        LIZ.append(", manMadeBeats=");
        LIZ.append(this.manMadeBeats);
        LIZ.append(", type=");
        LIZ.append(this.type);
        LIZ.append(", onset_cnn=");
        return q.LIZIZ(LIZ, this.onset_cnn, ')', LIZ);
    }

    public final String getManMadeBeats() {
        return this.manMadeBeats;
    }

    public final Integer getMaxVideoNum() {
        return this.maxVideoNum;
    }

    public final Integer getMinVideoNum() {
        return this.minVideoNum;
    }

    public final String getOnset_cnn() {
        return this.onset_cnn;
    }

    public final Integer getType() {
        return this.type;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        Integer num = this.minVideoNum;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        Integer num2 = this.maxVideoNum;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num2);
        }
        out.writeString(this.manMadeBeats);
        Integer num3 = this.type;
        if (num3 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num3);
        }
        out.writeString(this.onset_cnn);
    }

    public MusicBeat(Integer num, Integer num2, String str, Integer num3, String str2) {
        this.minVideoNum = num;
        this.maxVideoNum = num2;
        this.manMadeBeats = str;
        this.type = num3;
        this.onset_cnn = str2;
    }
}
