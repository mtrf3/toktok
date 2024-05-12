package com.ss.android.ugc.aweme.shortvideo.model;

import X.AnonymousClass391;
import X.C16880lQ;
import X.C1NE;
import X.C38485F8n;
import X.C47135Ieh;
import X.C47959Irz;
import X.C77413UZt;
import X.C79062V1e;
import X.HH1;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.UC7;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class VQEvaluationConfig implements Parcelable {
    public static final Parcelable.Creator<VQEvaluationConfig> CREATOR = new Creator();

    @InterfaceC65349Pkn("base_config")
    public final BaseConfig baseConfig;

    @InterfaceC65349Pkn("compose_config")
    public final ComposeConfig composeConfig;

    @InterfaceC65349Pkn("screen_shot_config")
    public final ScreenShotConfig screenShotConfig;

    @InterfaceC65349Pkn("sticker_config")
    public final StickerConfig stickerConfig;

    /* loaded from: classes13.dex */
    public static final class Creator implements Parcelable.Creator<VQEvaluationConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VQEvaluationConfig createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new VQEvaluationConfig(BaseConfig.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ScreenShotConfig.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ComposeConfig.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StickerConfig.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VQEvaluationConfig[] newArray(int i) {
            return new VQEvaluationConfig[i];
        }
    }

    /* loaded from: classes13.dex */
    public static final class ResultConfig implements Parcelable {
        public static final Parcelable.Creator<ResultConfig> CREATOR = new Creator();

        @InterfaceC65349Pkn("fail_info_path")
        public final String failInfoPath;

        @InterfaceC65349Pkn("finish_tag_path")
        public final String finishTagPath;

        @InterfaceC65349Pkn("success_info_path")
        public final String successInfoPath;

        /* loaded from: classes13.dex */
        public static final class Creator implements Parcelable.Creator<ResultConfig> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ResultConfig createFromParcel(Parcel parcel) {
                o.LJIIIZ(parcel, "parcel");
                return new ResultConfig(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ResultConfig[] newArray(int i) {
                return new ResultConfig[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ResultConfig() {
            this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ ResultConfig copy$default(ResultConfig resultConfig, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = resultConfig.successInfoPath;
            }
            if ((i & 2) != 0) {
                str2 = resultConfig.failInfoPath;
            }
            if ((i & 4) != 0) {
                str3 = resultConfig.finishTagPath;
            }
            return resultConfig.copy(str, str2, str3);
        }

        public final ResultConfig copy(String successInfoPath, String failInfoPath, String finishTagPath) {
            o.LJIIIZ(successInfoPath, "successInfoPath");
            o.LJIIIZ(failInfoPath, "failInfoPath");
            o.LJIIIZ(finishTagPath, "finishTagPath");
            return new ResultConfig(successInfoPath, failInfoPath, finishTagPath);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ResultConfig)) {
                return false;
            }
            ResultConfig resultConfig = (ResultConfig) obj;
            return o.LJ(this.successInfoPath, resultConfig.successInfoPath) && o.LJ(this.failInfoPath, resultConfig.failInfoPath) && o.LJ(this.finishTagPath, resultConfig.finishTagPath);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            o.LJIIIZ(out, "out");
            out.writeString(this.successInfoPath);
            out.writeString(this.failInfoPath);
            out.writeString(this.finishTagPath);
        }

        public final void doClear() {
            C16880lQ.LLLZZIL(new File(this.finishTagPath));
            C16880lQ.LLLZZIL(new File(this.failInfoPath));
            C16880lQ.LLLZZIL(new File(this.successInfoPath));
        }

        public int hashCode() {
            return this.finishTagPath.hashCode() + C79062V1e.LJ(this.failInfoPath, this.successInfoPath.hashCode() * 31, 31);
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ResultConfig(successInfoPath=");
            LIZ.append(this.successInfoPath);
            LIZ.append(", failInfoPath=");
            LIZ.append(this.failInfoPath);
            LIZ.append(", finishTagPath=");
            return q.LIZIZ(LIZ, this.finishTagPath, ')', LIZ);
        }

        public final void doFail(String failInfo) {
            o.LJIIIZ(failInfo, "failInfo");
            File LJIIIIZZ = C77413UZt.LJIIIIZZ(this.failInfoPath, true);
            if (LJIIIIZZ != null) {
                C38485F8n.LLLII(LJIIIIZZ, failInfo);
            }
            C77413UZt.LJIIIIZZ(this.finishTagPath, true);
        }

        public final void doSuc(String sucInfo) {
            o.LJIIIZ(sucInfo, "sucInfo");
            File LJIIIIZZ = C77413UZt.LJIIIIZZ(this.successInfoPath, true);
            if (LJIIIIZZ != null) {
                C38485F8n.LLLII(LJIIIIZZ, sucInfo);
            }
            C77413UZt.LJIIIIZZ(this.finishTagPath, true);
        }

        public ResultConfig(String str, String str2, String str3) {
            HH1.LIZ(str, "successInfoPath", str2, "failInfoPath", str3, "finishTagPath");
            this.successInfoPath = str;
            this.failInfoPath = str2;
            this.finishTagPath = str3;
        }

        public static /* synthetic */ void doFail$default(ResultConfig resultConfig, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = "";
            }
            resultConfig.doFail(str);
        }

        public static /* synthetic */ void doSuc$default(ResultConfig resultConfig, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = "";
            }
            resultConfig.doSuc(str);
        }

        public /* synthetic */ ResultConfig(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
        }
    }

    /* loaded from: classes13.dex */
    public static final class ScreenShotConfig implements Parcelable {
        public static final Parcelable.Creator<ScreenShotConfig> CREATOR = new Creator();

        @InterfaceC65349Pkn("capture_loop_delay")
        public final long captureLoopDelay;

        @InterfaceC65349Pkn("mistake_threshold")
        public final long mistakeThreshold;

        @InterfaceC65349Pkn("result_config")
        public final ResultConfig resultConfig;

        @InterfaceC65349Pkn("time_points")
        public final List<Long> timePoints;

        @InterfaceC65349Pkn("workspace")
        public final String workspace;

        /* loaded from: classes13.dex */
        public static final class Creator implements Parcelable.Creator<ScreenShotConfig> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ScreenShotConfig createFromParcel(Parcel parcel) {
                o.LJIIIZ(parcel, "parcel");
                String readString = parcel.readString();
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(Long.valueOf(parcel.readLong()));
                }
                return new ScreenShotConfig(readString, arrayList, ResultConfig.CREATOR.createFromParcel(parcel), parcel.readLong(), parcel.readLong());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ScreenShotConfig[] newArray(int i) {
                return new ScreenShotConfig[i];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public ScreenShotConfig() {
            /*
                r10 = this;
                r1 = 0
                r4 = 0
                r8 = 31
                r0 = r10
                r2 = r1
                r3 = r1
                r6 = r4
                r9 = r1
                r0.<init>(r1, r2, r3, r4, r6, r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.model.VQEvaluationConfig.ScreenShotConfig.<init>():void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ScreenShotConfig copy$default(ScreenShotConfig screenShotConfig, String str, List list, ResultConfig resultConfig, long j, long j2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = screenShotConfig.workspace;
            }
            if ((i & 2) != 0) {
                list = screenShotConfig.timePoints;
            }
            if ((i & 4) != 0) {
                resultConfig = screenShotConfig.resultConfig;
            }
            if ((i & 8) != 0) {
                j = screenShotConfig.mistakeThreshold;
            }
            if ((i & 16) != 0) {
                j2 = screenShotConfig.captureLoopDelay;
            }
            return screenShotConfig.copy(str, list, resultConfig, j, j2);
        }

        public final ScreenShotConfig copy(String workspace, List<Long> timePoints, ResultConfig resultConfig, long j, long j2) {
            o.LJIIIZ(workspace, "workspace");
            o.LJIIIZ(timePoints, "timePoints");
            o.LJIIIZ(resultConfig, "resultConfig");
            return new ScreenShotConfig(workspace, timePoints, resultConfig, j, j2);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ScreenShotConfig)) {
                return false;
            }
            ScreenShotConfig screenShotConfig = (ScreenShotConfig) obj;
            return o.LJ(this.workspace, screenShotConfig.workspace) && o.LJ(this.timePoints, screenShotConfig.timePoints) && o.LJ(this.resultConfig, screenShotConfig.resultConfig) && this.mistakeThreshold == screenShotConfig.mistakeThreshold && this.captureLoopDelay == screenShotConfig.captureLoopDelay;
        }

        public int hashCode() {
            return C16880lQ.LLJIJIL(this.captureLoopDelay) + JBR.LIZJ(this.mistakeThreshold, (this.resultConfig.hashCode() + AnonymousClass391.LIZIZ(this.timePoints, this.workspace.hashCode() * 31, 31)) * 31, 31);
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ScreenShotConfig(workspace=");
            LIZ.append(this.workspace);
            LIZ.append(", timePoints=");
            LIZ.append(this.timePoints);
            LIZ.append(", resultConfig=");
            LIZ.append(this.resultConfig);
            LIZ.append(", mistakeThreshold=");
            LIZ.append(this.mistakeThreshold);
            LIZ.append(", captureLoopDelay=");
            return C47135Ieh.LIZIZ(LIZ, this.captureLoopDelay, ')', LIZ);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            o.LJIIIZ(out, "out");
            out.writeString(this.workspace);
            Iterator LIZJ = UC7.LIZJ(this.timePoints, out);
            while (LIZJ.hasNext()) {
                out.writeLong(((Number) LIZJ.next()).longValue());
            }
            this.resultConfig.writeToParcel(out, i);
            out.writeLong(this.mistakeThreshold);
            out.writeLong(this.captureLoopDelay);
        }

        public ScreenShotConfig(String workspace, List<Long> timePoints, ResultConfig resultConfig, long j, long j2) {
            o.LJIIIZ(workspace, "workspace");
            o.LJIIIZ(timePoints, "timePoints");
            o.LJIIIZ(resultConfig, "resultConfig");
            this.workspace = workspace;
            this.timePoints = timePoints;
            this.resultConfig = resultConfig;
            this.mistakeThreshold = j;
            this.captureLoopDelay = j2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ ScreenShotConfig(String str, List list, ResultConfig resultConfig, long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new ArrayList() : list, (i & 4) != 0 ? new ResultConfig(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0) : resultConfig, (i & 8) != 0 ? 500L : j, (i & 16) != 0 ? 32L : j2);
        }
    }

    /* loaded from: classes13.dex */
    public static final class StickerConfig implements Parcelable {

        @InterfaceC65349Pkn("end_time")
        public final long endTime;

        @InterfaceC65349Pkn("extra")
        public final String extra;

        @InterfaceC65349Pkn("id")
        public final String id;

        @InterfaceC65349Pkn("result_config")
        public final ResultConfig resultConfig;

        @InterfaceC65349Pkn("rotation")
        public final int rotation;

        @InterfaceC65349Pkn("scale")
        public final float scale;

        @InterfaceC65349Pkn("start_time")
        public final long startTime;

        @InterfaceC65349Pkn("type")
        public final int type;

        @InterfaceC65349Pkn("x_coordinate")
        public final float xCoordinate;

        @InterfaceC65349Pkn("y_coordinate")
        public final float yCoordinate;
        public static final Companion Companion = new Companion();
        public static final Parcelable.Creator<StickerConfig> CREATOR = new Creator();

        /* loaded from: classes13.dex */
        public static final class Creator implements Parcelable.Creator<StickerConfig> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StickerConfig createFromParcel(Parcel parcel) {
                o.LJIIIZ(parcel, "parcel");
                return new StickerConfig(parcel.readString(), parcel.readInt(), parcel.readLong(), parcel.readLong(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readInt(), parcel.readString(), ResultConfig.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StickerConfig[] newArray(int i) {
                return new StickerConfig[i];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public StickerConfig() {
            /*
                r15 = this;
                r1 = 0
                r2 = 0
                r3 = 0
                r7 = 0
                r13 = 1023(0x3ff, float:1.434E-42)
                r0 = r15
                r5 = r3
                r8 = r7
                r9 = r7
                r10 = r2
                r11 = r1
                r12 = r1
                r14 = r1
                r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r11, r12, r13, r14)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.model.VQEvaluationConfig.StickerConfig.<init>():void");
        }

        public static /* synthetic */ StickerConfig copy$default(StickerConfig stickerConfig, String str, int i, long j, long j2, float f, float f2, float f3, int i2, String str2, ResultConfig resultConfig, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = stickerConfig.id;
            }
            if ((i3 & 2) != 0) {
                i = stickerConfig.type;
            }
            if ((i3 & 4) != 0) {
                j = stickerConfig.startTime;
            }
            if ((i3 & 8) != 0) {
                j2 = stickerConfig.endTime;
            }
            if ((i3 & 16) != 0) {
                f = stickerConfig.xCoordinate;
            }
            if ((i3 & 32) != 0) {
                f2 = stickerConfig.yCoordinate;
            }
            if ((i3 & 64) != 0) {
                f3 = stickerConfig.scale;
            }
            if ((i3 & 128) != 0) {
                i2 = stickerConfig.rotation;
            }
            if ((i3 & 256) != 0) {
                str2 = stickerConfig.extra;
            }
            if ((i3 & 512) != 0) {
                resultConfig = stickerConfig.resultConfig;
            }
            return stickerConfig.copy(str, i, j, j2, f, f2, f3, i2, str2, resultConfig);
        }

        public final StickerConfig copy(String id, int i, long j, long j2, float f, float f2, float f3, int i2, String extra, ResultConfig resultConfig) {
            o.LJIIIZ(id, "id");
            o.LJIIIZ(extra, "extra");
            o.LJIIIZ(resultConfig, "resultConfig");
            return new StickerConfig(id, i, j, j2, f, f2, f3, i2, extra, resultConfig);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StickerConfig)) {
                return false;
            }
            StickerConfig stickerConfig = (StickerConfig) obj;
            return o.LJ(this.id, stickerConfig.id) && this.type == stickerConfig.type && this.startTime == stickerConfig.startTime && this.endTime == stickerConfig.endTime && Float.compare(this.xCoordinate, stickerConfig.xCoordinate) == 0 && Float.compare(this.yCoordinate, stickerConfig.yCoordinate) == 0 && Float.compare(this.scale, stickerConfig.scale) == 0 && this.rotation == stickerConfig.rotation && o.LJ(this.extra, stickerConfig.extra) && o.LJ(this.resultConfig, stickerConfig.resultConfig);
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("StickerConfig(id=");
            LIZ.append(this.id);
            LIZ.append(", type=");
            LIZ.append(this.type);
            LIZ.append(", startTime=");
            LIZ.append(this.startTime);
            LIZ.append(", endTime=");
            LIZ.append(this.endTime);
            LIZ.append(", xCoordinate=");
            LIZ.append(this.xCoordinate);
            LIZ.append(", yCoordinate=");
            LIZ.append(this.yCoordinate);
            LIZ.append(", scale=");
            LIZ.append(this.scale);
            LIZ.append(", rotation=");
            LIZ.append(this.rotation);
            LIZ.append(", extra=");
            LIZ.append(this.extra);
            LIZ.append(", resultConfig=");
            LIZ.append(this.resultConfig);
            LIZ.append(')');
            return X1D.LIZIZ(LIZ);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            o.LJIIIZ(out, "out");
            out.writeString(this.id);
            out.writeInt(this.type);
            out.writeLong(this.startTime);
            out.writeLong(this.endTime);
            out.writeFloat(this.xCoordinate);
            out.writeFloat(this.yCoordinate);
            out.writeFloat(this.scale);
            out.writeInt(this.rotation);
            out.writeString(this.extra);
            this.resultConfig.writeToParcel(out, i);
        }

        public int hashCode() {
            return this.resultConfig.hashCode() + C79062V1e.LJ(this.extra, (C47959Irz.LIZIZ(this.scale, C47959Irz.LIZIZ(this.yCoordinate, C47959Irz.LIZIZ(this.xCoordinate, JBR.LIZJ(this.endTime, JBR.LIZJ(this.startTime, ((this.id.hashCode() * 31) + this.type) * 31, 31), 31), 31), 31), 31) + this.rotation) * 31, 31);
        }

        /* loaded from: classes13.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public Companion() {
            }
        }

        public StickerConfig(String id, int i, long j, long j2, float f, float f2, float f3, int i2, String extra, ResultConfig resultConfig) {
            o.LJIIIZ(id, "id");
            o.LJIIIZ(extra, "extra");
            o.LJIIIZ(resultConfig, "resultConfig");
            this.id = id;
            this.type = i;
            this.startTime = j;
            this.endTime = j2;
            this.xCoordinate = f;
            this.yCoordinate = f2;
            this.scale = f3;
            this.rotation = i2;
            this.extra = extra;
            this.resultConfig = resultConfig;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ StickerConfig(String str, int i, long j, long j2, float f, float f2, float f3, int i2, String str2, ResultConfig resultConfig, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0L : j, (i3 & 8) == 0 ? j2 : 0L, (i3 & 16) != 0 ? 0.0f : f, (i3 & 32) == 0 ? f2 : 0.0f, (i3 & 64) != 0 ? 1.0f : f3, (i3 & 128) == 0 ? i2 : 0, (i3 & 256) == 0 ? str2 : "", (i3 & 512) != 0 ? new ResultConfig(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0) : resultConfig);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VQEvaluationConfig() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ VQEvaluationConfig copy$default(VQEvaluationConfig vQEvaluationConfig, BaseConfig baseConfig, ScreenShotConfig screenShotConfig, ComposeConfig composeConfig, StickerConfig stickerConfig, int i, Object obj) {
        if ((i & 1) != 0) {
            baseConfig = vQEvaluationConfig.baseConfig;
        }
        if ((i & 2) != 0) {
            screenShotConfig = vQEvaluationConfig.screenShotConfig;
        }
        if ((i & 4) != 0) {
            composeConfig = vQEvaluationConfig.composeConfig;
        }
        if ((i & 8) != 0) {
            stickerConfig = vQEvaluationConfig.stickerConfig;
        }
        return vQEvaluationConfig.copy(baseConfig, screenShotConfig, composeConfig, stickerConfig);
    }

    public final VQEvaluationConfig copy(BaseConfig baseConfig, ScreenShotConfig screenShotConfig, ComposeConfig composeConfig, StickerConfig stickerConfig) {
        o.LJIIIZ(baseConfig, "baseConfig");
        return new VQEvaluationConfig(baseConfig, screenShotConfig, composeConfig, stickerConfig);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VQEvaluationConfig)) {
            return false;
        }
        VQEvaluationConfig vQEvaluationConfig = (VQEvaluationConfig) obj;
        return o.LJ(this.baseConfig, vQEvaluationConfig.baseConfig) && o.LJ(this.screenShotConfig, vQEvaluationConfig.screenShotConfig) && o.LJ(this.composeConfig, vQEvaluationConfig.composeConfig) && o.LJ(this.stickerConfig, vQEvaluationConfig.stickerConfig);
    }

    public int hashCode() {
        int hashCode = this.baseConfig.hashCode() * 31;
        ScreenShotConfig screenShotConfig = this.screenShotConfig;
        int hashCode2 = (hashCode + (screenShotConfig == null ? 0 : screenShotConfig.hashCode())) * 31;
        ComposeConfig composeConfig = this.composeConfig;
        int hashCode3 = (hashCode2 + (composeConfig == null ? 0 : composeConfig.hashCode())) * 31;
        StickerConfig stickerConfig = this.stickerConfig;
        return hashCode3 + (stickerConfig != null ? stickerConfig.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VQEvaluationConfig(baseConfig=");
        LIZ.append(this.baseConfig);
        LIZ.append(", screenShotConfig=");
        LIZ.append(this.screenShotConfig);
        LIZ.append(", composeConfig=");
        LIZ.append(this.composeConfig);
        LIZ.append(", stickerConfig=");
        LIZ.append(this.stickerConfig);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        this.baseConfig.writeToParcel(out, i);
        ScreenShotConfig screenShotConfig = this.screenShotConfig;
        if (screenShotConfig == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            screenShotConfig.writeToParcel(out, i);
        }
        ComposeConfig composeConfig = this.composeConfig;
        if (composeConfig == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            composeConfig.writeToParcel(out, i);
        }
        StickerConfig stickerConfig = this.stickerConfig;
        if (stickerConfig == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            stickerConfig.writeToParcel(out, i);
        }
    }

    /* loaded from: classes13.dex */
    public static final class BaseConfig implements Parcelable {
        public static final Parcelable.Creator<BaseConfig> CREATOR = new Creator();

        @InterfaceC65349Pkn("media_list")
        public final List<String> mediaList;

        @InterfaceC65349Pkn("task_id")
        public final String taskID;

        /* loaded from: classes13.dex */
        public static final class Creator implements Parcelable.Creator<BaseConfig> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BaseConfig createFromParcel(Parcel parcel) {
                o.LJIIIZ(parcel, "parcel");
                return new BaseConfig(parcel.readString(), parcel.createStringArrayList());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BaseConfig[] newArray(int i) {
                return new BaseConfig[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public BaseConfig() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ BaseConfig copy$default(BaseConfig baseConfig, String str, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = baseConfig.taskID;
            }
            if ((i & 2) != 0) {
                list = baseConfig.mediaList;
            }
            return baseConfig.copy(str, list);
        }

        public final BaseConfig copy(String taskID, List<String> mediaList) {
            o.LJIIIZ(taskID, "taskID");
            o.LJIIIZ(mediaList, "mediaList");
            return new BaseConfig(taskID, mediaList);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BaseConfig)) {
                return false;
            }
            BaseConfig baseConfig = (BaseConfig) obj;
            return o.LJ(this.taskID, baseConfig.taskID) && o.LJ(this.mediaList, baseConfig.mediaList);
        }

        public int hashCode() {
            return this.mediaList.hashCode() + (this.taskID.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            o.LJIIIZ(out, "out");
            out.writeString(this.taskID);
            out.writeStringList(this.mediaList);
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("BaseConfig(taskID=");
            LIZ.append(this.taskID);
            LIZ.append(", mediaList=");
            return C1NE.LIZIZ(LIZ, this.mediaList, ')', LIZ);
        }

        public BaseConfig(String taskID, List<String> mediaList) {
            o.LJIIIZ(taskID, "taskID");
            o.LJIIIZ(mediaList, "mediaList");
            this.taskID = taskID;
            this.mediaList = mediaList;
        }

        public /* synthetic */ BaseConfig(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new ArrayList() : list);
        }
    }

    /* loaded from: classes2.dex */
    public static final class FailInfo {

        @InterfaceC65349Pkn("error_code")
        public final int errorCode;

        @InterfaceC65349Pkn("error_msg")
        public final String errorMsg;

        /* JADX WARN: Multi-variable type inference failed */
        public FailInfo() {
            this(0, null, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ FailInfo copy$default(FailInfo failInfo, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = failInfo.errorCode;
            }
            if ((i2 & 2) != 0) {
                str = failInfo.errorMsg;
            }
            return failInfo.copy(i, str);
        }

        public final FailInfo copy(int i, String str) {
            return new FailInfo(i, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FailInfo)) {
                return false;
            }
            FailInfo failInfo = (FailInfo) obj;
            return this.errorCode == failInfo.errorCode && o.LJ(this.errorMsg, failInfo.errorMsg);
        }

        public int hashCode() {
            int i = this.errorCode * 31;
            String str = this.errorMsg;
            return i + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("FailInfo(errorCode=");
            LIZ.append(this.errorCode);
            LIZ.append(", errorMsg=");
            return q.LIZIZ(LIZ, this.errorMsg, ')', LIZ);
        }

        public FailInfo(int i, String str) {
            this.errorCode = i;
            this.errorMsg = str;
        }

        public /* synthetic */ FailInfo(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : str);
        }
    }

    /* loaded from: classes13.dex */
    public static final class ComposeConfig implements Parcelable {
        public static final Parcelable.Creator<ComposeConfig> CREATOR = new Creator();

        @InterfaceC65349Pkn("open_hd_switch")
        public final boolean openHDSwitch;

        @InterfaceC65349Pkn("output_path")
        public final String outputPath;

        @InterfaceC65349Pkn("result_config")
        public final ResultConfig resultConfig;

        /* loaded from: classes13.dex */
        public static final class Creator implements Parcelable.Creator<ComposeConfig> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ComposeConfig createFromParcel(Parcel parcel) {
                o.LJIIIZ(parcel, "parcel");
                return new ComposeConfig(parcel.readString(), parcel.readInt() != 0, ResultConfig.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ComposeConfig[] newArray(int i) {
                return new ComposeConfig[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ComposeConfig() {
            this(null, false, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ ComposeConfig copy$default(ComposeConfig composeConfig, String str, boolean z, ResultConfig resultConfig, int i, Object obj) {
            if ((i & 1) != 0) {
                str = composeConfig.outputPath;
            }
            if ((i & 2) != 0) {
                z = composeConfig.openHDSwitch;
            }
            if ((i & 4) != 0) {
                resultConfig = composeConfig.resultConfig;
            }
            return composeConfig.copy(str, z, resultConfig);
        }

        public final ComposeConfig copy(String outputPath, boolean z, ResultConfig resultConfig) {
            o.LJIIIZ(outputPath, "outputPath");
            o.LJIIIZ(resultConfig, "resultConfig");
            return new ComposeConfig(outputPath, z, resultConfig);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ComposeConfig)) {
                return false;
            }
            ComposeConfig composeConfig = (ComposeConfig) obj;
            return o.LJ(this.outputPath, composeConfig.outputPath) && this.openHDSwitch == composeConfig.openHDSwitch && o.LJ(this.resultConfig, composeConfig.resultConfig);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.outputPath.hashCode() * 31;
            boolean z = this.openHDSwitch;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return this.resultConfig.hashCode() + ((hashCode + i) * 31);
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ComposeConfig(outputPath=");
            LIZ.append(this.outputPath);
            LIZ.append(", openHDSwitch=");
            LIZ.append(this.openHDSwitch);
            LIZ.append(", resultConfig=");
            LIZ.append(this.resultConfig);
            LIZ.append(')');
            return X1D.LIZIZ(LIZ);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            o.LJIIIZ(out, "out");
            out.writeString(this.outputPath);
            out.writeInt(this.openHDSwitch ? 1 : 0);
            this.resultConfig.writeToParcel(out, i);
        }

        public ComposeConfig(String outputPath, boolean z, ResultConfig resultConfig) {
            o.LJIIIZ(outputPath, "outputPath");
            o.LJIIIZ(resultConfig, "resultConfig");
            this.outputPath = outputPath;
            this.openHDSwitch = z;
            this.resultConfig = resultConfig;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ ComposeConfig(String str, boolean z, ResultConfig resultConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? new ResultConfig(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0) : resultConfig);
        }
    }

    public VQEvaluationConfig(BaseConfig baseConfig, ScreenShotConfig screenShotConfig, ComposeConfig composeConfig, StickerConfig stickerConfig) {
        o.LJIIIZ(baseConfig, "baseConfig");
        this.baseConfig = baseConfig;
        this.screenShotConfig = screenShotConfig;
        this.composeConfig = composeConfig;
        this.stickerConfig = stickerConfig;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ VQEvaluationConfig(BaseConfig baseConfig, ScreenShotConfig screenShotConfig, ComposeConfig composeConfig, StickerConfig stickerConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new BaseConfig(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0) : baseConfig, (i & 2) != 0 ? null : screenShotConfig, (i & 4) != 0 ? null : composeConfig, (i & 8) != 0 ? null : stickerConfig);
    }
}
