package com.ss.android.ugc.aweme.shortvideo.cut;

import X.C79062V1e;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import defpackage.e1;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class CutVideoCompileSettings {
    public final int LIZ;
    public final int LIZIZ;
    public int LIZJ;
    public final boolean LIZLLL;
    public final VEVideoEncodeSettings.ENCODE_STANDARD LJ;
    public final VEVideoEncodeSettings.ENCODE_PROFILE LJFF;
    public final VEVideoEncodeSettings.ENCODE_BITRATE_MODE LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public final int LJIIIZ;
    public final String LJIIJ;
    public final boolean LJIIJJI;
    public final Float LJIIL;
    public final Float LJIILIIL;

    @InterfaceC65349Pkn("audioOutputPath")
    public final String audioOutputPath;

    @InterfaceC65349Pkn("segments")
    public final List<VideoSegment> segments;

    @InterfaceC65349Pkn("videoOutputPath")
    public final String videoOutputPath;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CutVideoCompileSettings)) {
            return false;
        }
        CutVideoCompileSettings cutVideoCompileSettings = (CutVideoCompileSettings) obj;
        return o.LJ(this.segments, cutVideoCompileSettings.segments) && o.LJ(this.videoOutputPath, cutVideoCompileSettings.videoOutputPath) && o.LJ(this.audioOutputPath, cutVideoCompileSettings.audioOutputPath) && this.LIZ == cutVideoCompileSettings.LIZ && this.LIZIZ == cutVideoCompileSettings.LIZIZ && this.LIZJ == cutVideoCompileSettings.LIZJ && this.LIZLLL == cutVideoCompileSettings.LIZLLL && this.LJ == cutVideoCompileSettings.LJ && this.LJFF == cutVideoCompileSettings.LJFF && this.LJI == cutVideoCompileSettings.LJI && this.LJII == cutVideoCompileSettings.LJII && this.LJIIIIZZ == cutVideoCompileSettings.LJIIIIZZ && this.LJIIIZ == cutVideoCompileSettings.LJIIIZ && o.LJ(this.LJIIJ, cutVideoCompileSettings.LJIIJ) && this.LJIIJJI == cutVideoCompileSettings.LJIIJJI && o.LJ(this.LJIIL, cutVideoCompileSettings.LJIIL) && o.LJ(this.LJIILIIL, cutVideoCompileSettings.LJIILIIL);
    }

    public final String toString() {
        return "CutVideoCompileSettings(segments=" + this.segments + ", videoOutputPath=" + this.videoOutputPath + ", audioOutputPath=" + this.audioOutputPath + ", videoWidth=" + this.LIZ + ", videoHeight=" + this.LIZIZ + ", fps=" + this.LIZJ + ", isHWEncode=" + this.LIZLLL + ", encodeStandard=" + this.LJ + ", encodeProfile=" + this.LJFF + ", videoEncodeBitrateMode=" + this.LJI + ", videoBitrate=" + this.LJII + ", resizeMode=" + this.LJIIIIZZ + ", rotate=" + this.LJIIIZ + ", externalSettings=" + this.LJIIJ + ", enableAvInterLevel=" + this.LJIIJJI + ", resizeX=" + this.LJIIL + ", resizeY=" + this.LJIILIIL + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int LJ = C79062V1e.LJ(this.videoOutputPath, this.segments.hashCode() * 31, 31);
        String str = this.audioOutputPath;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (((((((LJ + hashCode) * 31) + this.LIZ) * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31;
        boolean z = this.LIZLLL;
        int i3 = 1;
        int i4 = z;
        if (z != 0) {
            i4 = 1;
        }
        int LJ2 = C79062V1e.LJ(this.LJIIJ, (((((((this.LJI.hashCode() + ((this.LJFF.hashCode() + ((this.LJ.hashCode() + ((i2 + i4) * 31)) * 31)) * 31)) * 31) + this.LJII) * 31) + this.LJIIIIZZ) * 31) + this.LJIIIZ) * 31, 31);
        if (!this.LJIIJJI) {
            i3 = 0;
        }
        int i5 = (LJ2 + i3) * 31;
        Float f = this.LJIIL;
        if (f == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = f.hashCode();
        }
        int i6 = (i5 + hashCode2) * 31;
        Float f2 = this.LJIILIIL;
        if (f2 != null) {
            i = f2.hashCode();
        }
        return i6 + i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CutVideoCompileSettings(List<? extends VideoSegment> segments, String videoOutputPath, String str, int i, int i2, int i3, boolean z, VEVideoEncodeSettings.ENCODE_STANDARD encodeStandard, VEVideoEncodeSettings.ENCODE_PROFILE encodeProfile, VEVideoEncodeSettings.ENCODE_BITRATE_MODE videoEncodeBitrateMode, int i4, int i5, int i6, String externalSettings, boolean z2, Float f, Float f2) {
        o.LJIIIZ(segments, "segments");
        o.LJIIIZ(videoOutputPath, "videoOutputPath");
        o.LJIIIZ(encodeStandard, "encodeStandard");
        o.LJIIIZ(encodeProfile, "encodeProfile");
        o.LJIIIZ(videoEncodeBitrateMode, "videoEncodeBitrateMode");
        o.LJIIIZ(externalSettings, "externalSettings");
        this.segments = segments;
        this.videoOutputPath = videoOutputPath;
        this.audioOutputPath = str;
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = z;
        this.LJ = encodeStandard;
        this.LJFF = encodeProfile;
        this.LJI = videoEncodeBitrateMode;
        this.LJII = i4;
        this.LJIIIIZZ = i5;
        this.LJIIIZ = i6;
        this.LJIIJ = externalSettings;
        this.LJIIJJI = z2;
        this.LJIIL = f;
        this.LJIILIIL = f2;
    }

    public CutVideoCompileSettings(List list, String str, String str2, int i, int i2, int i3, boolean z, VEVideoEncodeSettings.ENCODE_STANDARD encode_standard, VEVideoEncodeSettings.ENCODE_PROFILE encode_profile, VEVideoEncodeSettings.ENCODE_BITRATE_MODE encode_bitrate_mode, int i4, int i5, int i6, String str3, boolean z2, Float f, Float f2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, str, str2, (i7 & 8) != 0 ? 720 : i, (i7 & 16) != 0 ? 1280 : i2, (i7 & 32) != 0 ? 30 : i3, (i7 & 64) != 0 ? false : z, (i7 & 128) != 0 ? VEVideoEncodeSettings.ENCODE_STANDARD.ENCODE_STANDARD_H264 : encode_standard, (i7 & 256) != 0 ? VEVideoEncodeSettings.ENCODE_PROFILE.ENCODE_PROFILE_BASELINE : encode_profile, (i7 & 512) != 0 ? VEVideoEncodeSettings.ENCODE_BITRATE_MODE.ENCODE_BITRATE_CRF : encode_bitrate_mode, (i7 & 1024) != 0 ? 19 : i4, (i7 & 2048) != 0 ? 1 : i5, (i7 & 4096) != 0 ? 0 : i6, (i7 & FileUtils.BUFFER_SIZE) != 0 ? "" : str3, (i7 & 16384) != 0 ? e1.LIZ(31744, "enable_creative_compile_av_inter_leave", true, false) : z2, (32768 & i7) != 0 ? null : f, (i7 & 65536) == 0 ? f2 : null);
    }
}
