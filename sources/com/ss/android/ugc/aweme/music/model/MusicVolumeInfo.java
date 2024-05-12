package com.ss.android.ugc.aweme.music.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class MusicVolumeInfo implements Serializable {

    @InterfaceC65349Pkn("Loudness")
    public final Float loudness;

    @InterfaceC65349Pkn("LoudnessRange")
    public final Float loudnessRange;

    @InterfaceC65349Pkn("LoudnessRangeEnd")
    public final Float loudnessRangeEnd;

    @InterfaceC65349Pkn("MaximumMomentaryLoudness")
    public final Float maximumMomentaryLoudness;

    @InterfaceC65349Pkn("MaximumShortTermLoudness")
    public final Float maximumShortTermLoudness;

    @InterfaceC65349Pkn("Peak")
    public final Float peak;

    @InterfaceC65349Pkn("Version")
    public final Integer version;

    /* JADX WARN: Multi-variable type inference failed */
    public MusicVolumeInfo() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ MusicVolumeInfo copy$default(MusicVolumeInfo musicVolumeInfo, Float f, Float f2, Integer num, Float f3, Float f4, Float f5, Float f6, int i, Object obj) {
        if ((i & 1) != 0) {
            f = musicVolumeInfo.peak;
        }
        if ((i & 2) != 0) {
            f2 = musicVolumeInfo.loudness;
        }
        if ((i & 4) != 0) {
            num = musicVolumeInfo.version;
        }
        if ((i & 8) != 0) {
            f3 = musicVolumeInfo.loudnessRangeEnd;
        }
        if ((i & 16) != 0) {
            f4 = musicVolumeInfo.loudnessRange;
        }
        if ((i & 32) != 0) {
            f5 = musicVolumeInfo.maximumMomentaryLoudness;
        }
        if ((i & 64) != 0) {
            f6 = musicVolumeInfo.maximumShortTermLoudness;
        }
        return musicVolumeInfo.copy(f, f2, num, f3, f4, f5, f6);
    }

    public final MusicVolumeInfo copy(Float f, Float f2, Integer num, Float f3, Float f4, Float f5, Float f6) {
        return new MusicVolumeInfo(f, f2, num, f3, f4, f5, f6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicVolumeInfo)) {
            return false;
        }
        MusicVolumeInfo musicVolumeInfo = (MusicVolumeInfo) obj;
        return o.LJ(this.peak, musicVolumeInfo.peak) && o.LJ(this.loudness, musicVolumeInfo.loudness) && o.LJ(this.version, musicVolumeInfo.version) && o.LJ(this.loudnessRangeEnd, musicVolumeInfo.loudnessRangeEnd) && o.LJ(this.loudnessRange, musicVolumeInfo.loudnessRange) && o.LJ(this.maximumMomentaryLoudness, musicVolumeInfo.maximumMomentaryLoudness) && o.LJ(this.maximumShortTermLoudness, musicVolumeInfo.maximumShortTermLoudness);
    }

    public int hashCode() {
        Float f = this.peak;
        int hashCode = (f == null ? 0 : f.hashCode()) * 31;
        Float f2 = this.loudness;
        int hashCode2 = (hashCode + (f2 == null ? 0 : f2.hashCode())) * 31;
        Integer num = this.version;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Float f3 = this.loudnessRangeEnd;
        int hashCode4 = (hashCode3 + (f3 == null ? 0 : f3.hashCode())) * 31;
        Float f4 = this.loudnessRange;
        int hashCode5 = (hashCode4 + (f4 == null ? 0 : f4.hashCode())) * 31;
        Float f5 = this.maximumMomentaryLoudness;
        int hashCode6 = (hashCode5 + (f5 == null ? 0 : f5.hashCode())) * 31;
        Float f6 = this.maximumShortTermLoudness;
        return hashCode6 + (f6 != null ? f6.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MusicVolumeInfo(peak=");
        LIZ.append(this.peak);
        LIZ.append(", loudness=");
        LIZ.append(this.loudness);
        LIZ.append(", version=");
        LIZ.append(this.version);
        LIZ.append(", loudnessRangeEnd=");
        LIZ.append(this.loudnessRangeEnd);
        LIZ.append(", loudnessRange=");
        LIZ.append(this.loudnessRange);
        LIZ.append(", maximumMomentaryLoudness=");
        LIZ.append(this.maximumMomentaryLoudness);
        LIZ.append(", maximumShortTermLoudness=");
        LIZ.append(this.maximumShortTermLoudness);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final Float getLoudness() {
        return this.loudness;
    }

    public final Float getLoudnessRange() {
        return this.loudnessRange;
    }

    public final Float getLoudnessRangeEnd() {
        return this.loudnessRangeEnd;
    }

    public final Float getMaximumMomentaryLoudness() {
        return this.maximumMomentaryLoudness;
    }

    public final Float getMaximumShortTermLoudness() {
        return this.maximumShortTermLoudness;
    }

    public final Float getPeak() {
        return this.peak;
    }

    public final Integer getVersion() {
        return this.version;
    }

    public MusicVolumeInfo(Float f, Float f2, Integer num, Float f3, Float f4, Float f5, Float f6) {
        this.peak = f;
        this.loudness = f2;
        this.version = num;
        this.loudnessRangeEnd = f3;
        this.loudnessRange = f4;
        this.maximumMomentaryLoudness = f5;
        this.maximumShortTermLoudness = f6;
    }

    public /* synthetic */ MusicVolumeInfo(Float f, Float f2, Integer num, Float f3, Float f4, Float f5, Float f6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : f, (i & 2) != 0 ? null : f2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : f3, (i & 16) != 0 ? null : f4, (i & 32) != 0 ? null : f5, (i & 64) == 0 ? f6 : null);
    }
}
