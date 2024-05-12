package com.ss.android.ugc.aweme.creative.model;

import X.C1FJ;
import X.GPV;
import X.InterfaceC43620HAa;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.MusicShareStoryData;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class MusicShareStoryData implements Serializable, Parcelable {
    public static final Parcelable.Creator<MusicShareStoryData> CREATOR = new Parcelable.Creator<MusicShareStoryData>() { // from class: X.6D3
        @Override // android.os.Parcelable.Creator
        public final MusicShareStoryData createFromParcel(Parcel parcel) {
            Integer valueOf;
            Integer valueOf2;
            o.LJIIIZ(parcel, "parcel");
            String readString = parcel.readString();
            Effect effect = (Effect) parcel.readParcelable(MusicShareStoryData.class.getClassLoader());
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            Integer num = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                num = Integer.valueOf(parcel.readInt());
            }
            return new MusicShareStoryData(readString, effect, readInt, readInt2, valueOf, valueOf2, num, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MusicShareStoryData[] newArray(int i) {
            return new MusicShareStoryData[i];
        }
    };

    @InterfaceC65349Pkn("artist_name")
    public final String artistName;

    @InterfaceC65349Pkn("bg_end_color")
    public final int bgEndColor;

    @InterfaceC65349Pkn("bg_start_color")
    public final int bgStartColor;

    @InterfaceC65349Pkn("card_bg_color")
    public final Integer cardBgColor;

    @InterfaceC43620HAa
    @InterfaceC65349Pkn("cover_path")
    public final String coverPath;

    @InterfaceC65349Pkn("song_name")
    public final String songName;

    @GPV
    public final Effect sticker;

    @InterfaceC65349Pkn("text_color")
    public final Integer textColor;

    @InterfaceC65349Pkn("volume_color")
    public final Integer waveColor;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MusicShareStoryData() {
        /*
            r12 = this;
            r1 = 0
            r3 = 0
            r10 = 511(0x1ff, float:7.16E-43)
            r0 = r12
            r2 = r1
            r4 = r3
            r5 = r1
            r6 = r1
            r7 = r1
            r8 = r1
            r9 = r1
            r11 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.creative.model.MusicShareStoryData.<init>():void");
    }

    public static /* synthetic */ MusicShareStoryData copy$default(MusicShareStoryData musicShareStoryData, String str, Effect effect, int i, int i2, Integer num, Integer num2, Integer num3, String str2, String str3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = musicShareStoryData.coverPath;
        }
        if ((i3 & 2) != 0) {
            effect = musicShareStoryData.sticker;
        }
        if ((i3 & 4) != 0) {
            i = musicShareStoryData.bgStartColor;
        }
        if ((i3 & 8) != 0) {
            i2 = musicShareStoryData.bgEndColor;
        }
        if ((i3 & 16) != 0) {
            num = musicShareStoryData.cardBgColor;
        }
        if ((i3 & 32) != 0) {
            num2 = musicShareStoryData.textColor;
        }
        if ((i3 & 64) != 0) {
            num3 = musicShareStoryData.waveColor;
        }
        if ((i3 & 128) != 0) {
            str2 = musicShareStoryData.songName;
        }
        if ((i3 & 256) != 0) {
            str3 = musicShareStoryData.artistName;
        }
        return musicShareStoryData.copy(str, effect, i, i2, num, num2, num3, str2, str3);
    }

    public final MusicShareStoryData copy(String str, Effect effect, int i, int i2, Integer num, Integer num2, Integer num3, String str2, String str3) {
        return new MusicShareStoryData(str, effect, i, i2, num, num2, num3, str2, str3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicShareStoryData)) {
            return false;
        }
        MusicShareStoryData musicShareStoryData = (MusicShareStoryData) obj;
        return o.LJ(this.coverPath, musicShareStoryData.coverPath) && o.LJ(this.sticker, musicShareStoryData.sticker) && this.bgStartColor == musicShareStoryData.bgStartColor && this.bgEndColor == musicShareStoryData.bgEndColor && o.LJ(this.cardBgColor, musicShareStoryData.cardBgColor) && o.LJ(this.textColor, musicShareStoryData.textColor) && o.LJ(this.waveColor, musicShareStoryData.waveColor) && o.LJ(this.songName, musicShareStoryData.songName) && o.LJ(this.artistName, musicShareStoryData.artistName);
    }

    public int hashCode() {
        String str = this.coverPath;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Effect effect = this.sticker;
        int hashCode2 = (((((hashCode + (effect == null ? 0 : effect.hashCode())) * 31) + this.bgStartColor) * 31) + this.bgEndColor) * 31;
        Integer num = this.cardBgColor;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.textColor;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.waveColor;
        int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str2 = this.songName;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.artistName;
        return hashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MusicShareStoryData(coverPath=");
        LIZ.append(this.coverPath);
        LIZ.append(", sticker=");
        LIZ.append(this.sticker);
        LIZ.append(", bgStartColor=");
        LIZ.append(this.bgStartColor);
        LIZ.append(", bgEndColor=");
        LIZ.append(this.bgEndColor);
        LIZ.append(", cardBgColor=");
        LIZ.append(this.cardBgColor);
        LIZ.append(", textColor=");
        LIZ.append(this.textColor);
        LIZ.append(", waveColor=");
        LIZ.append(this.waveColor);
        LIZ.append(", songName=");
        LIZ.append(this.songName);
        LIZ.append(", artistName=");
        return q.LIZIZ(LIZ, this.artistName, ')', LIZ);
    }

    public final String getArtistName() {
        return this.artistName;
    }

    public final int getBgEndColor() {
        return this.bgEndColor;
    }

    public final int getBgStartColor() {
        return this.bgStartColor;
    }

    public final Integer getCardBgColor() {
        return this.cardBgColor;
    }

    public final String getCoverPath() {
        return this.coverPath;
    }

    public final String getSongName() {
        return this.songName;
    }

    public final Effect getSticker() {
        return this.sticker;
    }

    public final Integer getTextColor() {
        return this.textColor;
    }

    public final Integer getWaveColor() {
        return this.waveColor;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.coverPath);
        out.writeParcelable(this.sticker, i);
        out.writeInt(this.bgStartColor);
        out.writeInt(this.bgEndColor);
        Integer num = this.cardBgColor;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        Integer num2 = this.textColor;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num2);
        }
        Integer num3 = this.waveColor;
        if (num3 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num3);
        }
        out.writeString(this.songName);
        out.writeString(this.artistName);
    }

    public MusicShareStoryData(String str, Effect effect, int i, int i2, Integer num, Integer num2, Integer num3, String str2, String str3) {
        this.coverPath = str;
        this.sticker = effect;
        this.bgStartColor = i;
        this.bgEndColor = i2;
        this.cardBgColor = num;
        this.textColor = num2;
        this.waveColor = num3;
        this.songName = str2;
        this.artistName = str3;
    }

    public /* synthetic */ MusicShareStoryData(String str, Effect effect, int i, int i2, Integer num, Integer num2, Integer num3, String str2, String str3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? null : effect, (i3 & 4) != 0 ? -16777216 : i, (i3 & 8) == 0 ? i2 : -16777216, (i3 & 16) != 0 ? null : num, (i3 & 32) != 0 ? null : num2, (i3 & 64) != 0 ? null : num3, (i3 & 128) != 0 ? null : str2, (i3 & 256) == 0 ? str3 : null);
    }
}
