package com.ss.android.ugc.aweme.mvtheme;

import X.C0JT;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class BeatMvInfo implements Serializable {

    @InterfaceC65349Pkn("beat_mv_dst_in")
    public final int dstIn;

    @InterfaceC65349Pkn("beat_mv_dst_out")
    public final int dstOut;

    @InterfaceC65349Pkn("beat_mv_music_key")
    public String musicKey;

    @InterfaceC65349Pkn("beat_mv_music_path")
    public final String musicName;

    @InterfaceC65349Pkn("beat_mv_bit_time")
    public float[] times;

    @InterfaceC65349Pkn("beat_mv_trim_in")
    public final int trimIn;

    @InterfaceC65349Pkn("beat_mv_trim_out")
    public final int trimOut;

    @InterfaceC65349Pkn("beat_mv_bit_value")
    public int[] values;

    public static /* synthetic */ BeatMvInfo copy$default(BeatMvInfo beatMvInfo, int[] iArr, float[] fArr, int i, int i2, int i3, int i4, String str, String str2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            iArr = beatMvInfo.values;
        }
        if ((i5 & 2) != 0) {
            fArr = beatMvInfo.times;
        }
        if ((i5 & 4) != 0) {
            i = beatMvInfo.trimIn;
        }
        if ((i5 & 8) != 0) {
            i2 = beatMvInfo.trimOut;
        }
        if ((i5 & 16) != 0) {
            i3 = beatMvInfo.dstIn;
        }
        if ((i5 & 32) != 0) {
            i4 = beatMvInfo.dstOut;
        }
        if ((i5 & 64) != 0) {
            str = beatMvInfo.musicName;
        }
        if ((i5 & 128) != 0) {
            str2 = beatMvInfo.musicKey;
        }
        return beatMvInfo.copy(iArr, fArr, i, i2, i3, i4, str, str2);
    }

    public final BeatMvInfo copy(int[] iArr, float[] fArr, int i, int i2, int i3, int i4, String musicName, String musicKey) {
        o.LJIIIZ(musicName, "musicName");
        o.LJIIIZ(musicKey, "musicKey");
        return new BeatMvInfo(iArr, fArr, i, i2, i3, i4, musicName, musicKey);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BeatMvInfo)) {
            return false;
        }
        BeatMvInfo beatMvInfo = (BeatMvInfo) obj;
        return o.LJ(this.values, beatMvInfo.values) && o.LJ(this.times, beatMvInfo.times) && this.trimIn == beatMvInfo.trimIn && this.trimOut == beatMvInfo.trimOut && this.dstIn == beatMvInfo.dstIn && this.dstOut == beatMvInfo.dstOut && o.LJ(this.musicName, beatMvInfo.musicName) && o.LJ(this.musicKey, beatMvInfo.musicKey);
    }

    public int hashCode() {
        int[] iArr = this.values;
        int hashCode = (iArr != null ? Arrays.hashCode(iArr) : 0) * 31;
        float[] fArr = this.times;
        int hashCode2 = (((((((((hashCode + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31) + this.trimIn) * 31) + this.trimOut) * 31) + this.dstIn) * 31) + this.dstOut) * 31;
        String str = this.musicName;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.musicKey;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BeatMvInfo(values=");
        C0JT.LIZLLL(this.values, LIZ, ", times=");
        LIZ.append(Arrays.toString(this.times));
        LIZ.append(", trimIn=");
        LIZ.append(this.trimIn);
        LIZ.append(", trimOut=");
        LIZ.append(this.trimOut);
        LIZ.append(", dstIn=");
        LIZ.append(this.dstIn);
        LIZ.append(", dstOut=");
        LIZ.append(this.dstOut);
        LIZ.append(", musicName=");
        LIZ.append(this.musicName);
        LIZ.append(", musicKey=");
        return JBR.LJFF(LIZ, this.musicKey, ")", LIZ);
    }

    public final int getDstIn() {
        return this.dstIn;
    }

    public final int getDstOut() {
        return this.dstOut;
    }

    public final String getMusicKey() {
        return this.musicKey;
    }

    public final String getMusicName() {
        return this.musicName;
    }

    public final float[] getTimes() {
        return this.times;
    }

    public final int getTrimIn() {
        return this.trimIn;
    }

    public final int getTrimOut() {
        return this.trimOut;
    }

    public final int[] getValues() {
        return this.values;
    }

    public final void setMusicKey(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.musicKey = str;
    }

    public final void setTimes(float[] fArr) {
        this.times = fArr;
    }

    public final void setValues(int[] iArr) {
        this.values = iArr;
    }

    public BeatMvInfo(int[] iArr, float[] fArr, int i, int i2, int i3, int i4, String musicName, String musicKey) {
        o.LJIIIZ(musicName, "musicName");
        o.LJIIIZ(musicKey, "musicKey");
        this.values = iArr;
        this.times = fArr;
        this.trimIn = i;
        this.trimOut = i2;
        this.dstIn = i3;
        this.dstOut = i4;
        this.musicName = musicName;
        this.musicKey = musicKey;
    }

    public /* synthetic */ BeatMvInfo(int[] iArr, float[] fArr, int i, int i2, int i3, int i4, String str, String str2, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(iArr, fArr, i, i2, (i5 & 16) != 0 ? 0 : i3, (i5 & 32) != 0 ? 0 : i4, (i5 & 64) != 0 ? "" : str, (i5 & 128) == 0 ? str2 : "");
    }
}
