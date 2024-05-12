package com.ss.android.ugc.aweme.shortvideo;

import X.C43146GwY;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.j;
import com.google.gson.o;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class ImportVideoInfo implements Parcelable, Serializable {
    public static final C43146GwY CREATOR = new C43146GwY();

    @InterfaceC65349Pkn(alternate = {"c"}, value = "bit_rate")
    public int bitRate;

    @InterfaceC65349Pkn(alternate = {"k"}, value = "cutSpeed")
    public float cutSpeed;

    @InterfaceC65349Pkn(alternate = {"h"}, value = "description")
    public String description;

    @InterfaceC65349Pkn(alternate = {"g"}, value = "duration")
    public long duration;

    @InterfaceC65349Pkn(alternate = {"d"}, value = "encode_id")
    public int encodeId;

    @InterfaceC65349Pkn(alternate = {"n"}, value = "fast_import_depend_hw")
    public boolean fastImportDependHW;

    @InterfaceC65349Pkn(alternate = {"o"}, value = "hypic_description")
    public String hypicDescription;

    @InterfaceC65349Pkn(alternate = {"e"}, value = "importPath")
    public String importIndex;

    @InterfaceC65349Pkn(alternate = {"f"}, value = "import_file_duration")
    public long importfileDuration;

    @InterfaceC65349Pkn(alternate = {"i"}, value = "music_id")
    public String musicId;

    @InterfaceC65349Pkn(alternate = {"j"}, value = "origin_fps")
    public int originFps;

    @InterfaceC65349Pkn(alternate = {"m"}, value = "origin_import_path")
    public String originImportPath;

    @InterfaceC65349Pkn(alternate = {"l"}, value = "real_import_path")
    public String realImportPath;

    @InterfaceC65349Pkn(alternate = {"b"}, value = "video_height")
    public int videoHeight;

    @InterfaceC65349Pkn(alternate = {"a"}, value = "video_width")
    public int videoWidth;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ImportVideoInfo() {
        /*
            r20 = this;
            r1 = 0
            r5 = 0
            r6 = 0
            r13 = 0
            r18 = 32767(0x7fff, float:4.5916E-41)
            r0 = r20
            r2 = r1
            r3 = r1
            r4 = r1
            r8 = r6
            r10 = r5
            r11 = r5
            r12 = r1
            r14 = r5
            r15 = r5
            r16 = r1
            r17 = r5
            r19 = r5
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.ImportVideoInfo.<init>():void");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getRealMusicId() {
        String str;
        j LJJIJ;
        boolean z;
        String str2 = this.musicId;
        boolean z2 = false;
        if (str2 != null) {
            if (str2.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return str2;
            }
        }
        String str3 = this.description;
        if (str3 == null || str3.length() == 0) {
            z2 = true;
        }
        if (z2) {
            return "";
        }
        try {
            new o();
            j LJJIJ2 = o.LIZ(this.description).LJIIZILJ().LJJIJ("data");
            if (LJJIJ2 != null && (LJJIJ = LJJIJ2.LJIIZILJ().LJJIJ("musicId")) != null) {
                str = LJJIJ.LJJIFFI();
            } else {
                str = null;
            }
            if (str == null) {
                return "";
            }
            return str;
        } catch (Exception unused) {
            return "";
        }
    }

    public final int getBitRate() {
        return this.bitRate;
    }

    public final float getCutSpeed() {
        return this.cutSpeed;
    }

    public final String getDescription() {
        return this.description;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final int getEncodeId() {
        return this.encodeId;
    }

    public final boolean getFastImportDependHW() {
        return this.fastImportDependHW;
    }

    public final String getHypicDescription() {
        return this.hypicDescription;
    }

    public final String getImportIndex() {
        return this.importIndex;
    }

    public final long getImportfileDuration() {
        return this.importfileDuration;
    }

    public final String getMusicId() {
        return this.musicId;
    }

    public final int getOriginFps() {
        return this.originFps;
    }

    public final String getOriginImportPath() {
        return this.originImportPath;
    }

    public final String getRealImportPath() {
        return this.realImportPath;
    }

    public final int getVideoHeight() {
        return this.videoHeight;
    }

    public final int getVideoWidth() {
        return this.videoWidth;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ImportVideoInfo(android.os.Parcel r24) {
        /*
            r23 = this;
            java.lang.String r0 = "parcel"
            r2 = r24
            kotlin.jvm.internal.o.LJIIIZ(r2, r0)
            r4 = 0
            r8 = 0
            r9 = 0
            r16 = 0
            r21 = 32767(0x7fff, float:4.5916E-41)
            r3 = r23
            r5 = r4
            r6 = r4
            r7 = r4
            r11 = r9
            r13 = r8
            r14 = r8
            r15 = r4
            r17 = r8
            r18 = r8
            r19 = r4
            r20 = r8
            r22 = r8
            r3.<init>(r4, r5, r6, r7, r8, r9, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            int r0 = r2.readInt()
            r3.videoWidth = r0
            int r0 = r2.readInt()
            r3.videoHeight = r0
            int r0 = r2.readInt()
            r3.bitRate = r0
            int r0 = r2.readInt()
            r3.encodeId = r0
            java.lang.String r0 = r2.readString()
            r3.importIndex = r0
            long r0 = r2.readLong()
            r3.importfileDuration = r0
            long r0 = r2.readLong()
            r3.duration = r0
            java.lang.String r0 = r2.readString()
            r3.description = r0
            java.lang.String r0 = r2.readString()
            r3.musicId = r0
            int r0 = r2.readInt()
            r3.originFps = r0
            float r0 = r2.readFloat()
            r3.cutSpeed = r0
            java.lang.String r0 = r2.readString()
            r3.realImportPath = r0
            java.lang.String r0 = r2.readString()
            r3.originImportPath = r0
            int r1 = r2.readInt()
            r0 = 1
            if (r1 != r0) goto L83
        L7a:
            r3.fastImportDependHW = r0
            java.lang.String r0 = r2.readString()
            r3.hypicDescription = r0
            return
        L83:
            r0 = 0
            goto L7a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.ImportVideoInfo.<init>(android.os.Parcel):void");
    }

    public final void setBitRate(int i) {
        this.bitRate = i;
    }

    public final void setCutSpeed(float f) {
        this.cutSpeed = f;
    }

    public final void setDescription(String str) {
        this.description = str;
    }

    public final void setDuration(long j) {
        this.duration = j;
    }

    public final void setEncodeId(int i) {
        this.encodeId = i;
    }

    public final void setFastImportDependHW(boolean z) {
        this.fastImportDependHW = z;
    }

    public final void setHypicDescription(String str) {
        this.hypicDescription = str;
    }

    public final void setImportIndex(String str) {
        this.importIndex = str;
    }

    public final void setImportfileDuration(long j) {
        this.importfileDuration = j;
    }

    public final void setMusicId(String str) {
        this.musicId = str;
    }

    public final void setOriginFps(int i) {
        this.originFps = i;
    }

    public final void setOriginImportPath(String str) {
        this.originImportPath = str;
    }

    public final void setRealImportPath(String str) {
        this.realImportPath = str;
    }

    public final void setVideoHeight(int i) {
        this.videoHeight = i;
    }

    public final void setVideoWidth(int i) {
        this.videoWidth = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.o.LJIIIZ(parcel, "parcel");
        parcel.writeInt(this.videoWidth);
        parcel.writeInt(this.videoHeight);
        parcel.writeInt(this.bitRate);
        parcel.writeInt(this.encodeId);
        parcel.writeString(this.importIndex);
        parcel.writeLong(this.importfileDuration);
        parcel.writeLong(this.duration);
        parcel.writeString(this.description);
        parcel.writeString(this.musicId);
        parcel.writeInt(this.originFps);
        parcel.writeFloat(this.cutSpeed);
        parcel.writeString(this.realImportPath);
        parcel.writeString(this.originImportPath);
        parcel.writeInt(this.fastImportDependHW ? 1 : 0);
        parcel.writeString(this.hypicDescription);
    }

    public ImportVideoInfo(int i, int i2, int i3, int i4, String str, long j, long j2, String str2, String str3, int i5, float f, String str4, String str5, boolean z, String str6) {
        this.videoWidth = i;
        this.videoHeight = i2;
        this.bitRate = i3;
        this.encodeId = i4;
        this.importIndex = str;
        this.importfileDuration = j;
        this.duration = j2;
        this.description = str2;
        this.musicId = str3;
        this.originFps = i5;
        this.cutSpeed = f;
        this.realImportPath = str4;
        this.originImportPath = str5;
        this.fastImportDependHW = z;
        this.hypicDescription = str6;
    }

    public /* synthetic */ ImportVideoInfo(int i, int i2, int i3, int i4, String str, long j, long j2, String str2, String str3, int i5, float f, String str4, String str5, boolean z, String str6, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 0 : i, (i6 & 2) != 0 ? 0 : i2, (i6 & 4) != 0 ? 0 : i3, (i6 & 8) != 0 ? 0 : i4, (i6 & 16) != 0 ? null : str, (i6 & 32) != 0 ? 0L : j, (i6 & 64) == 0 ? j2 : 0L, (i6 & 128) != 0 ? null : str2, (i6 & 256) != 0 ? null : str3, (i6 & 512) != 0 ? 0 : i5, (i6 & 1024) != 0 ? 1.0f : f, (i6 & 2048) != 0 ? null : str4, (i6 & 4096) != 0 ? null : str5, (i6 & FileUtils.BUFFER_SIZE) != 0 ? false : z, (i6 & 16384) != 0 ? null : str6);
    }
}
