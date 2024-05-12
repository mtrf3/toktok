package com.ss.android.ugc.aweme.shortvideo.edit;

import X.C1JX;
import X.C43683HCl;
import X.C44615Hf9;
import X.C44616HfA;
import X.C44617HfB;
import X.C45019Hlf;
import X.C47959Irz;
import X.V0N;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import defpackage.b0;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class CompileProbeResult implements Parcelable, Serializable {
    public final ResultData data;
    public final ResultStatus status;
    public final int version;
    public static final C44617HfB Companion = new C44617HfB();
    public static final Parcelable.Creator<CompileProbeResult> CREATOR = new C44615Hf9();

    /* loaded from: classes8.dex */
    public static final class ResultData implements Parcelable, Serializable {
        public static final Parcelable.Creator<ResultData> CREATOR = new C43683HCl();
        public final int crf;
        public final int durationMs;
        public final int encodeHeight;
        public final int encodeWidth;
        public final int encoderType;
        public final int gop;
        public final int maxBitrate;
        public final float optBitrate;
        public final OptBitrateFromVE optBitrateFromVE;
        public final int optimizeCrf;
        public final int preset;
        public final float psnr;
        public final double qpoffset;
        public final float videoBitrate;

        public static /* synthetic */ ResultData copy$default(ResultData resultData, int i, float f, int i2, int i3, int i4, int i5, int i6, float f2, int i7, int i8, double d, int i9, float f3, OptBitrateFromVE optBitrateFromVE, int i10, Object obj) {
            float f4 = f;
            int i11 = i;
            int i12 = i3;
            int i13 = i2;
            int i14 = i5;
            int i15 = i4;
            float f5 = f2;
            int i16 = i6;
            int i17 = i8;
            int i18 = i7;
            double d2 = d;
            float f6 = f3;
            int i19 = i9;
            OptBitrateFromVE optBitrateFromVE2 = optBitrateFromVE;
            if ((i10 & 1) != 0) {
                i11 = resultData.optimizeCrf;
            }
            if ((i10 & 2) != 0) {
                f4 = resultData.videoBitrate;
            }
            if ((i10 & 4) != 0) {
                i13 = resultData.encoderType;
            }
            if ((i10 & 8) != 0) {
                i12 = resultData.preset;
            }
            if ((i10 & 16) != 0) {
                i15 = resultData.maxBitrate;
            }
            if ((i10 & 32) != 0) {
                i14 = resultData.encodeWidth;
            }
            if ((i10 & 64) != 0) {
                i16 = resultData.encodeHeight;
            }
            if ((i10 & 128) != 0) {
                f5 = resultData.psnr;
            }
            if ((i10 & 256) != 0) {
                i18 = resultData.crf;
            }
            if ((i10 & 512) != 0) {
                i17 = resultData.gop;
            }
            if ((i10 & 1024) != 0) {
                d2 = resultData.qpoffset;
            }
            if ((i10 & 2048) != 0) {
                i19 = resultData.durationMs;
            }
            if ((i10 & 4096) != 0) {
                f6 = resultData.optBitrate;
            }
            if ((i10 & FileUtils.BUFFER_SIZE) != 0) {
                optBitrateFromVE2 = resultData.optBitrateFromVE;
            }
            return resultData.copy(i11, f4, i13, i12, i15, i14, i16, f5, i18, i17, d2, i19, f6, optBitrateFromVE2);
        }

        public final ResultData copy(int i, float f, int i2, int i3, int i4, int i5, int i6, float f2, int i7, int i8, double d, int i9, float f3, OptBitrateFromVE optBitrateFromVE) {
            o.LJIIIZ(optBitrateFromVE, "optBitrateFromVE");
            return new ResultData(i, f, i2, i3, i4, i5, i6, f2, i7, i8, d, i9, f3, optBitrateFromVE);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ResultData)) {
                return false;
            }
            ResultData resultData = (ResultData) obj;
            return this.optimizeCrf == resultData.optimizeCrf && Float.compare(this.videoBitrate, resultData.videoBitrate) == 0 && this.encoderType == resultData.encoderType && this.preset == resultData.preset && this.maxBitrate == resultData.maxBitrate && this.encodeWidth == resultData.encodeWidth && this.encodeHeight == resultData.encodeHeight && Float.compare(this.psnr, resultData.psnr) == 0 && this.crf == resultData.crf && this.gop == resultData.gop && Double.compare(this.qpoffset, resultData.qpoffset) == 0 && this.durationMs == resultData.durationMs && Float.compare(this.optBitrate, resultData.optBitrate) == 0 && o.LJ(this.optBitrateFromVE, resultData.optBitrateFromVE);
        }

        public String toString() {
            return "ResultData(optimizeCrf=" + this.optimizeCrf + ", videoBitrate=" + this.videoBitrate + ", encoderType=" + this.encoderType + ", preset=" + this.preset + ", maxBitrate=" + this.maxBitrate + ", encodeWidth=" + this.encodeWidth + ", encodeHeight=" + this.encodeHeight + ", psnr=" + this.psnr + ", crf=" + this.crf + ", gop=" + this.gop + ", qpoffset=" + this.qpoffset + ", durationMs=" + this.durationMs + ", optBitrate=" + this.optBitrate + ", optBitrateFromVE=" + this.optBitrateFromVE + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            o.LJIIIZ(out, "out");
            out.writeInt(this.optimizeCrf);
            out.writeFloat(this.videoBitrate);
            out.writeInt(this.encoderType);
            out.writeInt(this.preset);
            out.writeInt(this.maxBitrate);
            out.writeInt(this.encodeWidth);
            out.writeInt(this.encodeHeight);
            out.writeFloat(this.psnr);
            out.writeInt(this.crf);
            out.writeInt(this.gop);
            out.writeDouble(this.qpoffset);
            out.writeInt(this.durationMs);
            out.writeFloat(this.optBitrate);
            this.optBitrateFromVE.writeToParcel(out, i);
        }

        public int hashCode() {
            return this.optBitrateFromVE.hashCode() + C47959Irz.LIZIZ(this.optBitrate, (C1JX.LIZIZ(this.qpoffset, (((C47959Irz.LIZIZ(this.psnr, (((((((((C47959Irz.LIZIZ(this.videoBitrate, this.optimizeCrf * 31, 31) + this.encoderType) * 31) + this.preset) * 31) + this.maxBitrate) * 31) + this.encodeWidth) * 31) + this.encodeHeight) * 31, 31) + this.crf) * 31) + this.gop) * 31, 31) + this.durationMs) * 31, 31);
        }

        public final int getCrf() {
            return this.crf;
        }

        public final int getDurationMs() {
            return this.durationMs;
        }

        public final int getEncodeHeight() {
            return this.encodeHeight;
        }

        public final int getEncodeWidth() {
            return this.encodeWidth;
        }

        public final int getEncoderType() {
            return this.encoderType;
        }

        public final int getGop() {
            return this.gop;
        }

        public final int getMaxBitrate() {
            return this.maxBitrate;
        }

        public final float getOptBitrate() {
            return this.optBitrate;
        }

        public final OptBitrateFromVE getOptBitrateFromVE() {
            return this.optBitrateFromVE;
        }

        public final int getOptimizeCrf() {
            return this.optimizeCrf;
        }

        public final int getPreset() {
            return this.preset;
        }

        public final float getPsnr() {
            return this.psnr;
        }

        public final double getQpoffset() {
            return this.qpoffset;
        }

        public final float getVideoBitrate() {
            return this.videoBitrate;
        }

        public ResultData(int i, float f, int i2, int i3, int i4, int i5, int i6, float f2, int i7, int i8, double d, int i9, float f3, OptBitrateFromVE optBitrateFromVE) {
            o.LJIIIZ(optBitrateFromVE, "optBitrateFromVE");
            this.optimizeCrf = i;
            this.videoBitrate = f;
            this.encoderType = i2;
            this.preset = i3;
            this.maxBitrate = i4;
            this.encodeWidth = i5;
            this.encodeHeight = i6;
            this.psnr = f2;
            this.crf = i7;
            this.gop = i8;
            this.qpoffset = d;
            this.durationMs = i9;
            this.optBitrate = f3;
            this.optBitrateFromVE = optBitrateFromVE;
        }

        public /* synthetic */ ResultData(int i, float f, int i2, int i3, int i4, int i5, int i6, float f2, int i7, int i8, double d, int i9, float f3, OptBitrateFromVE optBitrateFromVE, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, f, i2, i3, i4, i5, i6, f2, i7, i8, d, i9, (i10 & 4096) != 0 ? 0.0f : f3, (i10 & FileUtils.BUFFER_SIZE) != 0 ? new OptBitrateFromVE(0.0f, 0.0f, 0.0f, 0.0f, 15, null) : optBitrateFromVE);
        }
    }

    /* loaded from: classes8.dex */
    public enum State implements Parcelable, Serializable {
        SUCCESS,
        ERROR,
        CANCEL;

        public static final Parcelable.Creator<State> CREATOR = new C45019Hlf();

        public static State valueOf(String str) {
            return (State) V0N.LJJJ(State.class, str);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            o.LJIIIZ(out, "out");
            out.writeString(name());
        }
    }

    public static /* synthetic */ CompileProbeResult copy$default(CompileProbeResult compileProbeResult, ResultStatus resultStatus, ResultData resultData, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            resultStatus = compileProbeResult.status;
        }
        if ((i2 & 2) != 0) {
            resultData = compileProbeResult.data;
        }
        if ((i2 & 4) != 0) {
            i = compileProbeResult.version;
        }
        return compileProbeResult.copy(resultStatus, resultData, i);
    }

    public final CompileProbeResult copy(ResultStatus status, ResultData resultData, int i) {
        o.LJIIIZ(status, "status");
        return new CompileProbeResult(status, resultData, i);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompileProbeResult)) {
            return false;
        }
        CompileProbeResult compileProbeResult = (CompileProbeResult) obj;
        return o.LJ(this.status, compileProbeResult.status) && o.LJ(this.data, compileProbeResult.data) && this.version == compileProbeResult.version;
    }

    public int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        ResultData resultData = this.data;
        return ((hashCode + (resultData == null ? 0 : resultData.hashCode())) * 31) + this.version;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        this.status.writeToParcel(out, i);
        ResultData resultData = this.data;
        if (resultData == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            resultData.writeToParcel(out, i);
        }
        out.writeInt(this.version);
    }

    /* loaded from: classes8.dex */
    public static final class ResultStatus implements Parcelable, Serializable {
        public static final Parcelable.Creator<ResultStatus> CREATOR = new C44616HfA();
        public final String msg;
        public final State state;
        public final int toolsCode;
        public final int veCode;

        public static /* synthetic */ ResultStatus copy$default(ResultStatus resultStatus, State state, int i, int i2, String str, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                state = resultStatus.state;
            }
            if ((i3 & 2) != 0) {
                i = resultStatus.veCode;
            }
            if ((i3 & 4) != 0) {
                i2 = resultStatus.toolsCode;
            }
            if ((i3 & 8) != 0) {
                str = resultStatus.msg;
            }
            return resultStatus.copy(state, i, i2, str);
        }

        public final ResultStatus copy(State state, int i, int i2, String msg) {
            o.LJIIIZ(state, "state");
            o.LJIIIZ(msg, "msg");
            return new ResultStatus(state, i, i2, msg);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ResultStatus)) {
                return false;
            }
            ResultStatus resultStatus = (ResultStatus) obj;
            return this.state == resultStatus.state && this.veCode == resultStatus.veCode && this.toolsCode == resultStatus.toolsCode && o.LJ(this.msg, resultStatus.msg);
        }

        public int hashCode() {
            return this.msg.hashCode() + (((((this.state.hashCode() * 31) + this.veCode) * 31) + this.toolsCode) * 31);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            o.LJIIIZ(out, "out");
            this.state.writeToParcel(out, i);
            out.writeInt(this.veCode);
            out.writeInt(this.toolsCode);
            out.writeString(this.msg);
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ResultStatus(state=");
            LIZ.append(this.state);
            LIZ.append(", veCode=");
            LIZ.append(this.veCode);
            LIZ.append(", toolsCode=");
            LIZ.append(this.toolsCode);
            LIZ.append(", msg=");
            return q.LIZIZ(LIZ, this.msg, ')', LIZ);
        }

        public final String getMsg() {
            return this.msg;
        }

        public final State getState() {
            return this.state;
        }

        public final int getToolsCode() {
            return this.toolsCode;
        }

        public final int getVeCode() {
            return this.veCode;
        }

        public ResultStatus(State state, int i, int i2, String msg) {
            o.LJIIIZ(state, "state");
            o.LJIIIZ(msg, "msg");
            this.state = state;
            this.veCode = i;
            this.toolsCode = i2;
            this.msg = msg;
        }

        public /* synthetic */ ResultStatus(State state, int i, int i2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(state, i, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? "" : str);
        }
    }

    public final boolean isHw() {
        if (this.version == 2) {
            return true;
        }
        return false;
    }

    public final boolean isSw() {
        if (this.version == 1) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CompileProbeResult(status=");
        LIZ.append(this.status);
        LIZ.append(", data=");
        LIZ.append(this.data);
        LIZ.append(", version=");
        return b0.LIZJ(LIZ, this.version, ')', LIZ);
    }

    public final ResultData getData() {
        return this.data;
    }

    public final ResultStatus getStatus() {
        return this.status;
    }

    public final int getVersion() {
        return this.version;
    }

    public CompileProbeResult(ResultStatus status, ResultData resultData, int i) {
        o.LJIIIZ(status, "status");
        this.status = status;
        this.data = resultData;
        this.version = i;
    }

    public /* synthetic */ CompileProbeResult(ResultStatus resultStatus, ResultData resultData, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(resultStatus, (i2 & 2) != 0 ? null : resultData, (i2 & 4) != 0 ? 1 : i);
    }
}
