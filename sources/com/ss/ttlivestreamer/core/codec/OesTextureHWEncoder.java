package com.ss.ttlivestreamer.core.codec;

import X.C16880lQ;
import android.os.Handler;
import android.util.AndroidRuntimeException;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.DebugLogUtils;
import com.ss.ttlivestreamer.core.utils.SafeHandlerThread;
import com.ss.ttlivestreamer.core.utils.TEBundle;
import com.ss.ttlivestreamer.core.utils.TTLSSladarBugReportUtils;
import com.ss.ttlivestreamer.core.utils.ThreadUtils;

/* loaded from: classes12.dex */
public class OesTextureHWEncoder extends HardwareVideoEncoder {
    public Handler mHandler;

    @Override // com.ss.ttlivestreamer.core.codec.HardwareVideoEncoder, com.ss.ttlivestreamer.core.engine.VideoEncoder, com.ss.ttlivestreamer.core.engine.NativeObject
    public synchronized void release() {
        this.mSummary.summaryEncoder("OesTextureHWEncoder");
        Handler handler = this.mHandler;
        if (handler != null) {
            ThreadUtils.invokeAtFrontUninterruptibly(handler, new Runnable() { // from class: com.ss.ttlivestreamer.core.codec.OesTextureHWEncoder.1
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_core_codec_OesTextureHWEncoder$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_core_codec_OesTextureHWEncoder$1__run$___twin___() {
                    OesTextureHWEncoder.this.superRelease();
                }

                public static void com_ss_ttlivestreamer_core_codec_OesTextureHWEncoder$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                    boolean LIZ;
                    try {
                        anonymousClass1.com_ss_ttlivestreamer_core_codec_OesTextureHWEncoder$1__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        } else {
            superRelease();
        }
    }

    @Override // com.ss.ttlivestreamer.core.codec.HardwareVideoEncoder
    public boolean setupCodecType() {
        AVLog.iod("OesTextureHWEncoder", "using OesTextureHWEncoder!");
        return super.setupCodecType();
    }

    @Override // com.ss.ttlivestreamer.core.codec.HardwareVideoEncoder, com.ss.ttlivestreamer.core.engine.VideoEncoder
    public /* bridge */ /* synthetic */ String getEncoderInfo() {
        return super.getEncoderInfo();
    }

    @Override // com.ss.ttlivestreamer.core.codec.HardwareVideoEncoder
    public /* bridge */ /* synthetic */ byte[] getExtraData() {
        return super.getExtraData();
    }

    @Override // com.ss.ttlivestreamer.core.codec.HardwareVideoEncoder, com.ss.ttlivestreamer.core.engine.VideoEncoder
    public /* bridge */ /* synthetic */ void RequestIDRFrame() {
        super.RequestIDRFrame();
    }

    public void superRelease() {
        super.release();
    }

    public OesTextureHWEncoder(boolean z) {
        String str;
        if (z) {
            str = MediaCodecUtils.ByteVC1Mime;
        } else {
            str = "video/avc";
        }
        this.codecType = str;
        this.mSummary.reportEncoderCreate("OesTextureHWEncoder");
    }

    @Override // com.ss.ttlivestreamer.core.codec.HardwareVideoEncoder, com.ss.ttlivestreamer.core.engine.VideoEncoder
    public int Encode(VideoFrame videoFrame) {
        return super.Encode(videoFrame);
    }

    @Override // com.ss.ttlivestreamer.core.codec.HardwareVideoEncoder, com.ss.ttlivestreamer.core.engine.VideoEncoder
    public boolean InitEncoder(TEBundle tEBundle) {
        AVLog.iow("OesTextureHWEncoder", "InitEncoder");
        this.mSummary.onInitStep(21);
        Thread LLLLIIIILLL = C16880lQ.LLLLIIIILLL();
        if (LLLLIIIILLL instanceof SafeHandlerThread) {
            this.mHandler = ((SafeHandlerThread) LLLLIIIILLL).getHandler();
            DebugLogUtils.isEnableDebugLog();
        } else {
            this.mSummary.onInitFail(21);
            DebugLogUtils.isEnableDebugLog();
            TTLSSladarBugReportUtils.getInstance().report(new AndroidRuntimeException("BUG! not handlerthread"), "OesTextureHWEncoder.InitEncoder");
        }
        this.mSummary.onInitStep(22);
        try {
            return super.InitEncoder(tEBundle);
        } catch (Throwable th) {
            this.mSummary.onInitFail(22, th);
            return false;
        }
    }

    @Override // com.ss.ttlivestreamer.core.codec.HardwareVideoEncoder, com.ss.ttlivestreamer.core.engine.VideoEncoder
    public /* bridge */ /* synthetic */ void SetBitrate(int i) {
        super.SetBitrate(i);
    }

    @Override // com.ss.ttlivestreamer.core.engine.NativeObject
    public void setNativeObj(long j) {
        if (j == 0) {
            try {
                release();
            } catch (Exception unused) {
            }
        }
        super.setNativeObj(j);
    }
}
