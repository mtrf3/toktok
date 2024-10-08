package com.ss.ttlivestreamer.core.codec;

import android.os.Handler;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.TEBundle;
import com.ss.ttlivestreamer.core.utils.ThreadUtils;

/* loaded from: classes12.dex */
public class H264HWVideoEncoder extends HardwareVideoEncoder {
    public Handler mHandler;

    @Override // com.ss.ttlivestreamer.core.codec.HardwareVideoEncoder, com.ss.ttlivestreamer.core.engine.VideoEncoder, com.ss.ttlivestreamer.core.engine.NativeObject
    public synchronized void release() {
        this.mSummary.summaryEncoder("H264HWVideoEncoder");
        Handler handler = this.mHandler;
        if (handler == null) {
            return;
        }
        ThreadUtils.invokeAtFrontUninterruptibly(handler, new Runnable() { // from class: com.ss.ttlivestreamer.core.codec.H264HWVideoEncoder.3
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_core_codec_H264HWVideoEncoder$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_core_codec_H264HWVideoEncoder$3__run$___twin___() {
                H264HWVideoEncoder.this.superRelease();
            }

            public static void com_ss_ttlivestreamer_core_codec_H264HWVideoEncoder$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass3 anonymousClass3) {
                boolean LIZ;
                try {
                    anonymousClass3.com_ss_ttlivestreamer_core_codec_H264HWVideoEncoder$3__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
        this.mHandler = null;
    }

    public void superRelease() {
        super.release();
    }

    public H264HWVideoEncoder(Handler handler) {
        this.mHandler = handler;
        this.codecType = "video/avc";
        this.mSummary.reportEncoderCreate("H264HWVideoEncoder");
    }

    @Override // com.ss.ttlivestreamer.core.codec.HardwareVideoEncoder, com.ss.ttlivestreamer.core.engine.VideoEncoder
    public int Encode(final VideoFrame videoFrame) {
        videoFrame.retain();
        if (!this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.core.codec.H264HWVideoEncoder.1
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_core_codec_H264HWVideoEncoder$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_core_codec_H264HWVideoEncoder$1__run$___twin___() {
                H264HWVideoEncoder.this.superEncode(videoFrame);
                videoFrame.release();
            }

            public static void com_ss_ttlivestreamer_core_codec_H264HWVideoEncoder$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                boolean LIZ;
                try {
                    anonymousClass1.com_ss_ttlivestreamer_core_codec_H264HWVideoEncoder$1__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        })) {
            videoFrame.release();
            if (this.noDropFrame) {
                AVLog.iow("H264HWVideoEncoder", "drop frame!");
                return 0;
            }
            return 0;
        }
        return 0;
    }

    @Override // com.ss.ttlivestreamer.core.codec.HardwareVideoEncoder, com.ss.ttlivestreamer.core.engine.VideoEncoder
    public boolean InitEncoder(final TEBundle tEBundle) {
        AVLog.iow("H264HWVideoEncoder", "InitEncoder");
        this.mSummary.onInitStep(21);
        if (this.mHandler == null) {
            this.mSummary.onInitFail(21);
            return false;
        }
        this.mSummary.onInitStep(22);
        final boolean[] zArr = {false};
        try {
            ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() { // from class: com.ss.ttlivestreamer.core.codec.H264HWVideoEncoder.2
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_core_codec_H264HWVideoEncoder$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_core_codec_H264HWVideoEncoder$2__run$___twin___() {
                    AVLog.iow("H264HWVideoEncoder", "InitEncoder in GL Thread");
                    zArr[0] = H264HWVideoEncoder.this.superInitEncoder(tEBundle);
                }

                public static void com_ss_ttlivestreamer_core_codec_H264HWVideoEncoder$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                    boolean LIZ;
                    try {
                        anonymousClass2.com_ss_ttlivestreamer_core_codec_H264HWVideoEncoder$2__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        } catch (Throwable th) {
            this.mSummary.onInitFail(22, th);
        }
        return zArr[0];
    }

    @Override // com.ss.ttlivestreamer.core.engine.NativeObject
    public void setNativeObj(long j) {
        if (j == 0) {
            release();
        }
        super.setNativeObj(j);
    }

    public int superEncode(VideoFrame videoFrame) {
        return super.Encode(videoFrame);
    }

    public boolean superInitEncoder(TEBundle tEBundle) {
        return super.InitEncoder(tEBundle);
    }
}
