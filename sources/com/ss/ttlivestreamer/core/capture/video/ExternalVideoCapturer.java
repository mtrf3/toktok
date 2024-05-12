package com.ss.ttlivestreamer.core.capture.video;

import X.AnonymousClass028;
import X.C16880lQ;
import X.X1D;
import android.graphics.Matrix;
import android.os.Bundle;
import android.os.Handler;
import android.util.AndroidRuntimeException;
import com.ss.ttlivestreamer.core.buffer.GlTextureFrameBuffer;
import com.ss.ttlivestreamer.core.buffer.JavaI420Buffer;
import com.ss.ttlivestreamer.core.buffer.RoiInfo;
import com.ss.ttlivestreamer.core.buffer.TextureBufferImpl;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.capture.video.VideoCapturer;
import com.ss.ttlivestreamer.core.opengl.RendererCommon;
import com.ss.ttlivestreamer.core.opengl.YuvConverter;
import com.ss.ttlivestreamer.core.utils.AVLog2;
import com.ss.ttlivestreamer.core.utils.LoadYUVHelper;
import com.ss.ttlivestreamer.core.utils.ThreadUtils;
import com.ss.ttlivestreamer.core.utils.TimeUtils;
import defpackage.i0;
import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public class ExternalVideoCapturer extends VideoCapturer implements TextureBufferImpl.ToI420Interface {
    public volatile boolean mBufferAlreadyReturn;
    public int mFps;
    public Handler mHandler;
    public boolean mHorizontalMirror;
    public LoadYUVHelper mLoadYUVHelper;
    public Handler mOesProcessHandler;
    public int mOutHeight;
    public int mOutWidth;
    public boolean mSigBufferMode;
    public int mStatus;
    public boolean mVerticalMirror;
    public VideoCapturer.VideoCapturerObserver mVideoCapturerObserver;
    public YuvConverter mYuvConverter;

    /* renamed from: com.ss.ttlivestreamer.core.capture.video.ExternalVideoCapturer$3, reason: invalid class name */
    /* loaded from: classes12.dex */
    public class AnonymousClass3 implements Runnable {
        public final /* synthetic */ ByteBuffer val$buffer;
        public final /* synthetic */ JavaI420Buffer[] val$buffer1;
        public final /* synthetic */ long val$captureMs;
        public final /* synthetic */ ByteBuffer val$dataU;
        public final /* synthetic */ ByteBuffer val$dataV;
        public final /* synthetic */ ByteBuffer val$dataY;
        public final /* synthetic */ int val$height;
        public final /* synthetic */ int[] val$ret;
        public final /* synthetic */ int val$strideUV;
        public final /* synthetic */ long val$timestamp_us;
        public final /* synthetic */ int val$width;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_core_capture_video_ExternalVideoCapturer$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_core_capture_video_ExternalVideoCapturer$3__run$___twin___() {
            ExternalVideoCapturer externalVideoCapturer = ExternalVideoCapturer.this;
            if (externalVideoCapturer.mStatus != 1) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("mStatus ");
                LIZ.append(ExternalVideoCapturer.this.mStatus);
                AVLog2.logToIODevice2(5, "ExternalVideoCapturer", i0.LJFF("ExternalVideoCapturer drop frame: ", X1D.LIZIZ(LIZ)), null, 4, 10000);
                this.val$ret[0] = -1;
                return;
            }
            if (!externalVideoCapturer.mBufferAlreadyReturn && ExternalVideoCapturer.this.mSigBufferMode) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("!mBufferAlreadyReturn ");
                LIZ2.append(!ExternalVideoCapturer.this.mBufferAlreadyReturn);
                LIZ2.append(", mSigBufferMode ");
                LIZ2.append(ExternalVideoCapturer.this.mSigBufferMode);
                AVLog2.logToIODevice2(5, "ExternalVideoCapturer", i0.LJFF("ExternalVideoCapturer drop frame: ", X1D.LIZIZ(LIZ2)), null, 5, 10000);
                this.val$ret[0] = -2;
                return;
            }
            if (this.val$buffer.isDirect()) {
                JavaI420Buffer[] javaI420BufferArr = this.val$buffer1;
                int i = this.val$width;
                int i2 = this.val$height;
                ByteBuffer byteBuffer = this.val$dataY;
                ByteBuffer byteBuffer2 = this.val$dataU;
                int i3 = this.val$strideUV;
                javaI420BufferArr[0] = JavaI420Buffer.wrap(i, i2, byteBuffer, i, byteBuffer2, i3, this.val$dataV, i3, this.val$captureMs, new Runnable() { // from class: com.ss.ttlivestreamer.core.capture.video.ExternalVideoCapturer.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com_ss_ttlivestreamer_core_capture_video_ExternalVideoCapturer$3$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    }

                    public void com_ss_ttlivestreamer_core_capture_video_ExternalVideoCapturer$3$1__run$___twin___() {
                        ExternalVideoCapturer.this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.core.capture.video.ExternalVideoCapturer.3.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                com_ss_ttlivestreamer_core_capture_video_ExternalVideoCapturer$3$1$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                            }

                            public void com_ss_ttlivestreamer_core_capture_video_ExternalVideoCapturer$3$1$1__run$___twin___() {
                                ExternalVideoCapturer.this.mBufferAlreadyReturn = true;
                            }

                            public static void com_ss_ttlivestreamer_core_capture_video_ExternalVideoCapturer$3$1$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(RunnableC00381 runnableC00381) {
                                boolean LIZ3;
                                try {
                                    runnableC00381.com_ss_ttlivestreamer_core_capture_video_ExternalVideoCapturer$3$1$1__run$___twin___();
                                } finally {
                                    if (LIZ3) {
                                    }
                                }
                            }
                        });
                    }

                    public static void com_ss_ttlivestreamer_core_capture_video_ExternalVideoCapturer$3$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                        boolean LIZ3;
                        try {
                            anonymousClass1.com_ss_ttlivestreamer_core_capture_video_ExternalVideoCapturer$3$1__run$___twin___();
                        } finally {
                            if (LIZ3) {
                            }
                        }
                    }
                });
            } else {
                this.val$buffer1[0] = JavaI420Buffer.allocate(this.val$width, this.val$height, new Runnable() { // from class: com.ss.ttlivestreamer.core.capture.video.ExternalVideoCapturer.3.2
                    @Override // java.lang.Runnable
                    public void run() {
                        com_ss_ttlivestreamer_core_capture_video_ExternalVideoCapturer$3$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    }

                    public void com_ss_ttlivestreamer_core_capture_video_ExternalVideoCapturer$3$2__run$___twin___() {
                        ExternalVideoCapturer.this.mBufferAlreadyReturn = true;
                    }

                    public static void com_ss_ttlivestreamer_core_capture_video_ExternalVideoCapturer$3$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                        boolean LIZ3;
                        try {
                            anonymousClass2.com_ss_ttlivestreamer_core_capture_video_ExternalVideoCapturer$3$2__run$___twin___();
                        } finally {
                            if (LIZ3) {
                            }
                        }
                    }
                });
                this.val$buffer1[0].getDataY().put(this.val$dataY);
                this.val$buffer1[0].getDataU().put(this.val$dataU);
                this.val$buffer1[0].getDataV().put(this.val$dataV);
                this.val$buffer1[0].updateCaptureMs(this.val$captureMs);
            }
            if (this.val$buffer1[0] == null) {
                AVLog2.logToIODevice2(5, "ExternalVideoCapturer", "ExternalVideoCapturer drop frame: buffer is null", null, 6, 10000);
                this.val$ret[0] = -3;
            } else {
                ExternalVideoCapturer.this.mBufferAlreadyReturn = false;
                this.val$ret[0] = ExternalVideoCapturer.this.onFrame(this.val$buffer1[0], this.val$width, this.val$height, 0, this.val$timestamp_us);
                this.val$buffer1[0].release();
            }
        }

        public static void com_ss_ttlivestreamer_core_capture_video_ExternalVideoCapturer$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass3 anonymousClass3) {
            boolean LIZ;
            try {
                anonymousClass3.com_ss_ttlivestreamer_core_capture_video_ExternalVideoCapturer$3__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass3(int[] iArr, ByteBuffer byteBuffer, JavaI420Buffer[] javaI420BufferArr, int i, int i2, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, long j, long j2) {
            this.val$ret = iArr;
            this.val$buffer = byteBuffer;
            this.val$buffer1 = javaI420BufferArr;
            this.val$width = i;
            this.val$height = i2;
            this.val$dataY = byteBuffer2;
            this.val$dataU = byteBuffer3;
            this.val$strideUV = i3;
            this.val$dataV = byteBuffer4;
            this.val$captureMs = j;
            this.val$timestamp_us = j2;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.core.capture.video.ExternalVideoCapturer$4, reason: invalid class name */
    /* loaded from: classes12.dex */
    public class AnonymousClass4 implements Runnable {
        public final /* synthetic */ JavaI420Buffer[] val$buffer1;
        public final /* synthetic */ long val$captureMs;
        public final /* synthetic */ ByteBuffer val$dataU;
        public final /* synthetic */ ByteBuffer val$dataV;
        public final /* synthetic */ ByteBuffer val$dataY;
        public final /* synthetic */ int val$height;
        public final /* synthetic */ int[] val$ret;
        public final /* synthetic */ int[] val$strides;
        public final /* synthetic */ long val$timestamp_us;
        public final /* synthetic */ int val$width;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_core_capture_video_ExternalVideoCapturer$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_core_capture_video_ExternalVideoCapturer$4__run$___twin___() {
            ExternalVideoCapturer externalVideoCapturer = ExternalVideoCapturer.this;
            if (externalVideoCapturer.mStatus != 1) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("mStatus ");
                LIZ.append(ExternalVideoCapturer.this.mStatus);
                AVLog2.logToIODevice2(5, "ExternalVideoCapturer", i0.LJFF("ExternalVideoCapturer drop frame: ", X1D.LIZIZ(LIZ)), null, 4, 10000);
                this.val$ret[0] = -1;
                return;
            }
            if (!externalVideoCapturer.mBufferAlreadyReturn && ExternalVideoCapturer.this.mSigBufferMode) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("!mBufferAlreadyReturn ");
                LIZ2.append(!ExternalVideoCapturer.this.mBufferAlreadyReturn);
                LIZ2.append(", mSigBufferMode ");
                LIZ2.append(ExternalVideoCapturer.this.mSigBufferMode);
                AVLog2.logToIODevice2(5, "ExternalVideoCapturer", i0.LJFF("ExternalVideoCapturer drop frame: ", X1D.LIZIZ(LIZ2)), null, 5, 10000);
                this.val$ret[0] = -2;
                return;
            }
            if (this.val$dataY.isDirect()) {
                JavaI420Buffer[] javaI420BufferArr = this.val$buffer1;
                int i = this.val$width;
                int i2 = this.val$height;
                ByteBuffer byteBuffer = this.val$dataY;
                int[] iArr = this.val$strides;
                javaI420BufferArr[0] = JavaI420Buffer.wrap(i, i2, byteBuffer, iArr[0], this.val$dataU, iArr[1], this.val$dataV, iArr[2], this.val$captureMs, new Runnable() { // from class: com.ss.ttlivestreamer.core.capture.video.ExternalVideoCapturer.4.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com_ss_ttlivestreamer_core_capture_video_ExternalVideoCapturer$4$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    }

                    public void com_ss_ttlivestreamer_core_capture_video_ExternalVideoCapturer$4$1__run$___twin___() {
                        ExternalVideoCapturer.this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.core.capture.video.ExternalVideoCapturer.4.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                com_ss_ttlivestreamer_core_capture_video_ExternalVideoCapturer$4$1$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                            }

                            public void com_ss_ttlivestreamer_core_capture_video_ExternalVideoCapturer$4$1$1__run$___twin___() {
                                ExternalVideoCapturer.this.mBufferAlreadyReturn = true;
                            }

                            public static void com_ss_ttlivestreamer_core_capture_video_ExternalVideoCapturer$4$1$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(RunnableC00391 runnableC00391) {
                                boolean LIZ3;
                                try {
                                    runnableC00391.com_ss_ttlivestreamer_core_capture_video_ExternalVideoCapturer$4$1$1__run$___twin___();
                                } finally {
                                    if (LIZ3) {
                                    }
                                }
                            }
                        });
                    }

                    public static void com_ss_ttlivestreamer_core_capture_video_ExternalVideoCapturer$4$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                        boolean LIZ3;
                        try {
                            anonymousClass1.com_ss_ttlivestreamer_core_capture_video_ExternalVideoCapturer$4$1__run$___twin___();
                        } finally {
                            if (LIZ3) {
                            }
                        }
                    }
                });
            } else {
                this.val$buffer1[0] = JavaI420Buffer.allocate(this.val$width, this.val$height, new Runnable() { // from class: com.ss.ttlivestreamer.core.capture.video.ExternalVideoCapturer.4.2
                    @Override // java.lang.Runnable
                    public void run() {
                        com_ss_ttlivestreamer_core_capture_video_ExternalVideoCapturer$4$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    }

                    public void com_ss_ttlivestreamer_core_capture_video_ExternalVideoCapturer$4$2__run$___twin___() {
                        ExternalVideoCapturer.this.mBufferAlreadyReturn = true;
                    }

                    public static void com_ss_ttlivestreamer_core_capture_video_ExternalVideoCapturer$4$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                        boolean LIZ3;
                        try {
                            anonymousClass2.com_ss_ttlivestreamer_core_capture_video_ExternalVideoCapturer$4$2__run$___twin___();
                        } finally {
                            if (LIZ3) {
                            }
                        }
                    }
                });
                this.val$buffer1[0].getDataY().put(this.val$dataY);
                this.val$buffer1[0].getDataU().put(this.val$dataU);
                this.val$buffer1[0].getDataV().put(this.val$dataV);
                this.val$buffer1[0].updateCaptureMs(this.val$captureMs);
            }
            if (this.val$buffer1[0] == null) {
                AVLog2.logToIODevice2(5, "ExternalVideoCapturer", "ExternalVideoCapturer drop frame: buffer is null", null, 6, 10000);
                this.val$ret[0] = -3;
            } else {
                ExternalVideoCapturer.this.mBufferAlreadyReturn = false;
                this.val$ret[0] = ExternalVideoCapturer.this.onFrame(this.val$buffer1[0], this.val$width, this.val$height, 0, this.val$timestamp_us);
                this.val$buffer1[0].release();
            }
        }

        public static void com_ss_ttlivestreamer_core_capture_video_ExternalVideoCapturer$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass4 anonymousClass4) {
            boolean LIZ;
            try {
                anonymousClass4.com_ss_ttlivestreamer_core_capture_video_ExternalVideoCapturer$4__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass4(int[] iArr, ByteBuffer byteBuffer, JavaI420Buffer[] javaI420BufferArr, int i, int i2, int[] iArr2, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, long j, long j2) {
            this.val$ret = iArr;
            this.val$dataY = byteBuffer;
            this.val$buffer1 = javaI420BufferArr;
            this.val$width = i;
            this.val$height = i2;
            this.val$strides = iArr2;
            this.val$dataU = byteBuffer2;
            this.val$dataV = byteBuffer3;
            this.val$captureMs = j;
            this.val$timestamp_us = j2;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.core.capture.video.ExternalVideoCapturer$6, reason: invalid class name */
    /* loaded from: classes12.dex */
    public class AnonymousClass6 implements Runnable {
        public final /* synthetic */ long val$captureMs;
        public final /* synthetic */ Bundle val$extraInfo;
        public final /* synthetic */ int val$height;
        public final /* synthetic */ boolean val$isOes;
        public final /* synthetic */ int[] val$ret;
        public final /* synthetic */ int val$rotation;
        public final /* synthetic */ TextureBufferImpl.ToI420Interface val$self;
        public final /* synthetic */ int val$tex;
        public final /* synthetic */ float[] val$texMatrix;
        public final /* synthetic */ long val$timestamp_us;
        public final /* synthetic */ int val$width;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_core_capture_video_ExternalVideoCapturer$6_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_core_capture_video_ExternalVideoCapturer$6__run$___twin___() {
            Matrix matrix;
            int i;
            float f;
            VideoFrame.TextureBuffer.Type type;
            ExternalVideoCapturer externalVideoCapturer = ExternalVideoCapturer.this;
            if (externalVideoCapturer.mStatus != 1) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("mStatus ");
                LIZ.append(ExternalVideoCapturer.this.mStatus);
                AVLog2.logToIODevice2(5, "ExternalVideoCapturer", i0.LJFF("ExternalVideoCapturer drop frame: ", X1D.LIZIZ(LIZ)), null, 9, 10000);
                this.val$ret[0] = -1;
                return;
            }
            if (externalVideoCapturer.mOesProcessHandler == null && !externalVideoCapturer.mBufferAlreadyReturn && ExternalVideoCapturer.this.mSigBufferMode) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("!mBufferAlreadyReturn ");
                LIZ2.append(!ExternalVideoCapturer.this.mBufferAlreadyReturn);
                LIZ2.append(", mSigBufferMode ");
                LIZ2.append(ExternalVideoCapturer.this.mSigBufferMode);
                AVLog2.logToIODevice2(5, "ExternalVideoCapturer", i0.LJFF("ExternalVideoCapturer drop frame: ", X1D.LIZIZ(LIZ2)), null, 0, 10000);
                this.val$ret[0] = -2;
                return;
            }
            float[] fArr = this.val$texMatrix;
            RoiInfo roiInfo = null;
            if (fArr != null) {
                matrix = RendererCommon.convertMatrixToAndroidGraphicsMatrix(fArr);
            } else {
                matrix = null;
            }
            int i2 = this.val$rotation;
            Matrix matrix2 = new Matrix();
            matrix2.reset();
            int i3 = this.val$width;
            int i4 = this.val$height;
            if (i2 % 180 != 0) {
                i = i4;
            } else {
                i = i3;
                i3 = i4;
            }
            matrix2.preTranslate(0.5f, 0.5f);
            matrix2.preRotate(-i2);
            ExternalVideoCapturer externalVideoCapturer2 = ExternalVideoCapturer.this;
            float f2 = -1.0f;
            if (externalVideoCapturer2.mHorizontalMirror) {
                f = -1.0f;
            } else {
                f = 1.0f;
            }
            if (!externalVideoCapturer2.mVerticalMirror) {
                f2 = 1.0f;
            }
            matrix2.preScale(f, f2);
            matrix2.preTranslate(-0.5f, -0.5f);
            if (matrix != null) {
                matrix2.preConcat(matrix);
            }
            Bundle bundle = this.val$extraInfo;
            if (bundle != null) {
                roiInfo = new RoiInfo(((Integer) C16880lQ.LLJJIII(bundle, "roi_center_pos_x")).intValue(), ((Integer) C16880lQ.LLJJIII(this.val$extraInfo, "roi_center_pos_y")).intValue(), ((Integer) C16880lQ.LLJJIII(this.val$extraInfo, "roi_width")).intValue(), ((Integer) C16880lQ.LLJJIII(this.val$extraInfo, "roi_height")).intValue(), ((Float) C16880lQ.LLJJIII(this.val$extraInfo, "roi_yaw")).floatValue(), ((Float) C16880lQ.LLJJIII(this.val$extraInfo, "roi_pitch")).floatValue(), ((Float) C16880lQ.LLJJIII(this.val$extraInfo, "roi_roll")).floatValue());
            }
            if (this.val$isOes) {
                type = VideoFrame.TextureBuffer.Type.OES;
            } else {
                type = VideoFrame.TextureBuffer.Type.RGB;
            }
            TextureBufferImpl textureBufferImpl = new TextureBufferImpl(i, i3, type, this.val$tex, matrix2, this.val$self, new Runnable() { // from class: com.ss.ttlivestreamer.core.capture.video.ExternalVideoCapturer.6.1
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_core_capture_video_ExternalVideoCapturer$6$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_core_capture_video_ExternalVideoCapturer$6$1__run$___twin___() {
                    ExternalVideoCapturer externalVideoCapturer3 = ExternalVideoCapturer.this;
                    Handler handler = externalVideoCapturer3.mOesProcessHandler;
                    if (handler != null) {
                        handler.post(new Runnable() { // from class: com.ss.ttlivestreamer.core.capture.video.ExternalVideoCapturer.6.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                com_ss_ttlivestreamer_core_capture_video_ExternalVideoCapturer$6$1$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                            }

                            public void com_ss_ttlivestreamer_core_capture_video_ExternalVideoCapturer$6$1$1__run$___twin___() {
                                AnonymousClass6 anonymousClass6 = AnonymousClass6.this;
                                ExternalVideoCapturer.this.returnTexture(anonymousClass6.val$tex);
                            }

                            public static void com_ss_ttlivestreamer_core_capture_video_ExternalVideoCapturer$6$1$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(RunnableC00411 runnableC00411) {
                                boolean LIZ3;
                                try {
                                    runnableC00411.com_ss_ttlivestreamer_core_capture_video_ExternalVideoCapturer$6$1$1__run$___twin___();
                                } finally {
                                    if (LIZ3) {
                                    }
                                }
                            }
                        });
                    } else {
                        externalVideoCapturer3.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.core.capture.video.ExternalVideoCapturer.6.1.2
                            @Override // java.lang.Runnable
                            public void run() {
                                com_ss_ttlivestreamer_core_capture_video_ExternalVideoCapturer$6$1$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                            }

                            public void com_ss_ttlivestreamer_core_capture_video_ExternalVideoCapturer$6$1$2__run$___twin___() {
                                ExternalVideoCapturer.this.returnTexture();
                            }

                            public static void com_ss_ttlivestreamer_core_capture_video_ExternalVideoCapturer$6$1$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                                boolean LIZ3;
                                try {
                                    anonymousClass2.com_ss_ttlivestreamer_core_capture_video_ExternalVideoCapturer$6$1$2__run$___twin___();
                                } finally {
                                    if (LIZ3) {
                                    }
                                }
                            }
                        });
                    }
                }

                public static void com_ss_ttlivestreamer_core_capture_video_ExternalVideoCapturer$6$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                    boolean LIZ3;
                    try {
                        anonymousClass1.com_ss_ttlivestreamer_core_capture_video_ExternalVideoCapturer$6$1__run$___twin___();
                    } finally {
                        if (LIZ3) {
                        }
                    }
                }
            });
            textureBufferImpl.setROIInfo(roiInfo);
            textureBufferImpl.updateCaptureMs(this.val$captureMs);
            ExternalVideoCapturer.this.mBufferAlreadyReturn = false;
            this.val$ret[0] = ExternalVideoCapturer.this.onFrame(textureBufferImpl, i, i3, 0, this.val$timestamp_us);
            textureBufferImpl.release();
        }

        public static void com_ss_ttlivestreamer_core_capture_video_ExternalVideoCapturer$6_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass6 anonymousClass6) {
            boolean LIZ;
            try {
                anonymousClass6.com_ss_ttlivestreamer_core_capture_video_ExternalVideoCapturer$6__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass6(int[] iArr, float[] fArr, int i, int i2, int i3, Bundle bundle, boolean z, int i4, TextureBufferImpl.ToI420Interface toI420Interface, long j, long j2) {
            this.val$ret = iArr;
            this.val$texMatrix = fArr;
            this.val$rotation = i;
            this.val$width = i2;
            this.val$height = i3;
            this.val$extraInfo = bundle;
            this.val$isOes = z;
            this.val$tex = i4;
            this.val$self = toI420Interface;
            this.val$captureMs = j;
            this.val$timestamp_us = j2;
        }
    }

    public void blockingWaitBufferReturn(String str) {
    }

    public int pushVideoFrame(int i, int i2, int i3, int i4, float[] fArr, long j, Bundle bundle, long j2) {
        return -1;
    }

    @Override // com.ss.ttlivestreamer.core.engine.NativeObject
    public synchronized void release() {
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() { // from class: com.ss.ttlivestreamer.core.capture.video.ExternalVideoCapturer.7
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_core_capture_video_ExternalVideoCapturer$7_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_core_capture_video_ExternalVideoCapturer$7__run$___twin___() {
                ExternalVideoCapturer externalVideoCapturer = ExternalVideoCapturer.this;
                externalVideoCapturer.mStatus = 2;
                YuvConverter yuvConverter = externalVideoCapturer.mYuvConverter;
                if (yuvConverter != null) {
                    yuvConverter.release();
                    ExternalVideoCapturer.this.mYuvConverter = null;
                }
            }

            public static void com_ss_ttlivestreamer_core_capture_video_ExternalVideoCapturer$7_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass7 anonymousClass7) {
                boolean LIZ;
                try {
                    anonymousClass7.com_ss_ttlivestreamer_core_capture_video_ExternalVideoCapturer$7__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
        super.release();
    }

    public void returnTexture() {
        this.mBufferAlreadyReturn = true;
        if (this.mStatus != 1) {
            stop();
        }
    }

    public void returnTexture(int i) {
    }

    @Override // com.ss.ttlivestreamer.core.capture.video.VideoCapturer
    public void stop() {
        this.mStatus = 2;
        VideoCapturer.VideoCapturerObserver videoCapturerObserver = this.mVideoCapturerObserver;
        if (videoCapturerObserver != null) {
            videoCapturerObserver.onVideoCaptureStopped();
        }
    }

    public boolean isSigBufferMode() {
        return this.mSigBufferMode;
    }

    @Override // com.ss.ttlivestreamer.core.engine.MediaSource
    public int status() {
        return this.mStatus;
    }

    /* renamed from: com.ss.ttlivestreamer.core.capture.video.ExternalVideoCapturer$5, reason: invalid class name */
    /* loaded from: classes12.dex */
    public class AnonymousClass5 implements Runnable {
        public final /* synthetic */ long val$captureMs;
        public final /* synthetic */ Bundle val$extraInfo;
        public final /* synthetic */ int val$height;
        public final /* synthetic */ boolean val$isOes;
        public final /* synthetic */ Matrix val$matrix;
        public final /* synthetic */ int[] val$ret;
        public final /* synthetic */ TextureBufferImpl.ToI420Interface val$self;
        public final /* synthetic */ int val$tex;
        public final /* synthetic */ long val$timestamp_us;
        public final /* synthetic */ int val$width;

        public void com_ss_ttlivestreamer_core_capture_video_ExternalVideoCapturer$5__run$___twin___() {
            RoiInfo roiInfo;
            VideoFrame.TextureBuffer.Type type;
            ExternalVideoCapturer externalVideoCapturer = ExternalVideoCapturer.this;
            if (externalVideoCapturer.mStatus != 1) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("mStatus ");
                LIZ.append(ExternalVideoCapturer.this.mStatus);
                AVLog2.logToIODevice2(5, "ExternalVideoCapturer", i0.LJFF("ExternalVideoCapturer drop frame: ", X1D.LIZIZ(LIZ)), null, 7, 10000);
                this.val$ret[0] = -1;
                return;
            }
            if (externalVideoCapturer.mOesProcessHandler == null && !externalVideoCapturer.mBufferAlreadyReturn && ExternalVideoCapturer.this.mSigBufferMode) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("!mBufferAlreadyReturn ");
                LIZ2.append(!ExternalVideoCapturer.this.mBufferAlreadyReturn);
                LIZ2.append(", mSigBufferMode ");
                LIZ2.append(ExternalVideoCapturer.this.mSigBufferMode);
                AVLog2.logToIODevice2(5, "ExternalVideoCapturer", i0.LJFF("ExternalVideoCapturer drop frame: ", X1D.LIZIZ(LIZ2)), null, 8, 10000);
                this.val$ret[0] = -2;
                return;
            }
            Bundle bundle = this.val$extraInfo;
            if (bundle != null) {
                roiInfo = new RoiInfo(((Integer) C16880lQ.LLJJIII(bundle, "roi_center_pos_x")).intValue(), ((Integer) C16880lQ.LLJJIII(this.val$extraInfo, "roi_center_pos_y")).intValue(), ((Integer) C16880lQ.LLJJIII(this.val$extraInfo, "roi_width")).intValue(), ((Integer) C16880lQ.LLJJIII(this.val$extraInfo, "roi_height")).intValue(), ((Float) C16880lQ.LLJJIII(this.val$extraInfo, "roi_yaw")).floatValue(), ((Float) C16880lQ.LLJJIII(this.val$extraInfo, "roi_pitch")).floatValue(), ((Float) C16880lQ.LLJJIII(this.val$extraInfo, "roi_roll")).floatValue());
            } else {
                roiInfo = null;
            }
            if (this.val$isOes) {
                type = VideoFrame.TextureBuffer.Type.OES;
            } else {
                type = VideoFrame.TextureBuffer.Type.RGB;
            }
            TextureBufferImpl textureBufferImpl = new TextureBufferImpl(this.val$width, this.val$height, type, this.val$tex, this.val$matrix, this.val$self, new Runnable() { // from class: com.ss.ttlivestreamer.core.capture.video.ExternalVideoCapturer.5.1
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_core_capture_video_ExternalVideoCapturer$5$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_core_capture_video_ExternalVideoCapturer$5$1__run$___twin___() {
                    ExternalVideoCapturer externalVideoCapturer2 = ExternalVideoCapturer.this;
                    Handler handler = externalVideoCapturer2.mOesProcessHandler;
                    if (handler != null) {
                        handler.post(new Runnable() { // from class: com.ss.ttlivestreamer.core.capture.video.ExternalVideoCapturer.5.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                com_ss_ttlivestreamer_core_capture_video_ExternalVideoCapturer$5$1$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                            }

                            public void com_ss_ttlivestreamer_core_capture_video_ExternalVideoCapturer$5$1$1__run$___twin___() {
                                AnonymousClass5 anonymousClass5 = AnonymousClass5.this;
                                ExternalVideoCapturer.this.returnTexture(anonymousClass5.val$tex);
                            }

                            public static void com_ss_ttlivestreamer_core_capture_video_ExternalVideoCapturer$5$1$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(RunnableC00401 runnableC00401) {
                                boolean LIZ3;
                                try {
                                    runnableC00401.com_ss_ttlivestreamer_core_capture_video_ExternalVideoCapturer$5$1$1__run$___twin___();
                                } finally {
                                    if (LIZ3) {
                                    }
                                }
                            }
                        });
                    } else {
                        externalVideoCapturer2.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.core.capture.video.ExternalVideoCapturer.5.1.2
                            @Override // java.lang.Runnable
                            public void run() {
                                com_ss_ttlivestreamer_core_capture_video_ExternalVideoCapturer$5$1$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                            }

                            public void com_ss_ttlivestreamer_core_capture_video_ExternalVideoCapturer$5$1$2__run$___twin___() {
                                ExternalVideoCapturer.this.returnTexture();
                            }

                            public static void com_ss_ttlivestreamer_core_capture_video_ExternalVideoCapturer$5$1$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                                boolean LIZ3;
                                try {
                                    anonymousClass2.com_ss_ttlivestreamer_core_capture_video_ExternalVideoCapturer$5$1$2__run$___twin___();
                                } finally {
                                    if (LIZ3) {
                                    }
                                }
                            }
                        });
                    }
                }

                public static void com_ss_ttlivestreamer_core_capture_video_ExternalVideoCapturer$5$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                    boolean LIZ3;
                    try {
                        anonymousClass1.com_ss_ttlivestreamer_core_capture_video_ExternalVideoCapturer$5$1__run$___twin___();
                    } finally {
                        if (LIZ3) {
                        }
                    }
                }
            });
            textureBufferImpl.updateCaptureMs(this.val$captureMs);
            textureBufferImpl.setROIInfo(roiInfo);
            ExternalVideoCapturer.this.mBufferAlreadyReturn = false;
            this.val$ret[0] = ExternalVideoCapturer.this.onFrame(textureBufferImpl, this.val$width, this.val$height, 0, this.val$timestamp_us);
            textureBufferImpl.release();
        }

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_core_capture_video_ExternalVideoCapturer$5_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public static void com_ss_ttlivestreamer_core_capture_video_ExternalVideoCapturer$5_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass5 anonymousClass5) {
            boolean LIZ;
            try {
                anonymousClass5.com_ss_ttlivestreamer_core_capture_video_ExternalVideoCapturer$5__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass5(int[] iArr, Bundle bundle, boolean z, int i, int i2, int i3, Matrix matrix, TextureBufferImpl.ToI420Interface toI420Interface, long j, long j2) {
            this.val$ret = iArr;
            this.val$extraInfo = bundle;
            this.val$isOes = z;
            this.val$width = i;
            this.val$height = i2;
            this.val$tex = i3;
            this.val$matrix = matrix;
            this.val$self = toI420Interface;
            this.val$captureMs = j;
            this.val$timestamp_us = j2;
        }
    }

    public void enableSigalMode(boolean z) {
        this.mSigBufferMode = z;
    }

    public boolean isMirror(boolean z) {
        if (z) {
            return this.mHorizontalMirror;
        }
        return this.mVerticalMirror;
    }

    @Override // com.ss.ttlivestreamer.core.buffer.TextureBufferImpl.ToI420Interface
    public VideoFrame.I420Buffer toI420(final VideoFrame.TextureBuffer textureBuffer) {
        if (this.mStatus != 1) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("BUG! Unexpected mStatus ");
            LIZ.append(this.mStatus);
            AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException(X1D.LIZIZ(LIZ));
            if (!AnonymousClass028.LJI(androidRuntimeException, "ExternalVideoCapturer.toI420")) {
                return GetBlackFrameBuffer(textureBuffer.getWidth(), textureBuffer.getHeight());
            }
            throw androidRuntimeException;
        }
        final VideoFrame.I420Buffer[] i420BufferArr = {null};
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() { // from class: com.ss.ttlivestreamer.core.capture.video.ExternalVideoCapturer.1
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_core_capture_video_ExternalVideoCapturer$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_core_capture_video_ExternalVideoCapturer$1__run$___twin___() {
                ExternalVideoCapturer externalVideoCapturer = ExternalVideoCapturer.this;
                if (externalVideoCapturer.mStatus != 1) {
                    i420BufferArr[0] = externalVideoCapturer.GetBlackFrameBuffer(textureBuffer.getWidth(), textureBuffer.getHeight());
                    return;
                }
                if (externalVideoCapturer.mYuvConverter == null) {
                    externalVideoCapturer.mYuvConverter = new YuvConverter();
                }
                i420BufferArr[0] = ExternalVideoCapturer.this.mYuvConverter.convert(textureBuffer);
            }

            public static void com_ss_ttlivestreamer_core_capture_video_ExternalVideoCapturer$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                boolean LIZ2;
                try {
                    anonymousClass1.com_ss_ttlivestreamer_core_capture_video_ExternalVideoCapturer$1__run$___twin___();
                } finally {
                    if (LIZ2) {
                    }
                }
            }
        });
        return i420BufferArr[0];
    }

    public ExternalVideoCapturer(VideoCapturer.VideoCapturerObserver videoCapturerObserver, Handler handler) {
        this(videoCapturerObserver, handler, null);
    }

    public void enableMirror(boolean z, boolean z2) {
        if (z2) {
            this.mHorizontalMirror = z;
        } else {
            this.mVerticalMirror = z;
        }
    }

    public ExternalVideoCapturer(VideoCapturer.VideoCapturerObserver videoCapturerObserver, Handler handler, Handler handler2) {
        this.mBufferAlreadyReturn = true;
        this.mVideoCapturerObserver = videoCapturerObserver;
        this.mHandler = handler;
        this.mOesProcessHandler = handler2;
    }

    @Override // com.ss.ttlivestreamer.core.capture.video.VideoCapturer
    public void start(int i, int i2, int i3) {
        this.mOutHeight = i2;
        this.mOutWidth = i;
        this.mFps = i3;
        this.mStatus = 1;
        VideoCapturer.VideoCapturerObserver videoCapturerObserver = this.mVideoCapturerObserver;
        if (videoCapturerObserver != null) {
            videoCapturerObserver.onVideoCaptureStarted();
        }
    }

    public int pushVideoFrame(ByteBuffer byteBuffer, int i, int i2, int i3, long j, long j2) {
        int i4 = (i + 1) / 2;
        int i5 = i * i2;
        int i6 = ((i2 + 1) / 2) * i4;
        int i7 = i5 + i6;
        byteBuffer.position(0);
        byteBuffer.limit(i5);
        ByteBuffer slice = byteBuffer.slice();
        byteBuffer.position(i5);
        byteBuffer.limit(i7);
        ByteBuffer slice2 = byteBuffer.slice();
        byteBuffer.position(i7);
        byteBuffer.limit(i7 + i6);
        ByteBuffer slice3 = byteBuffer.slice();
        blockingWaitBufferReturn("Push ByteBuffer");
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new AnonymousClass3(new int[]{0}, byteBuffer, new JavaI420Buffer[]{null}, i, i2, slice, slice2, i4, slice3, j2, j));
        return 0;
    }

    public int pushVideoFrame(ByteBuffer[] byteBufferArr, int[] iArr, int i, int i2, int i3, long j, long j2) {
        ByteBuffer byteBuffer = byteBufferArr[0];
        ByteBuffer byteBuffer2 = byteBufferArr[1];
        ByteBuffer byteBuffer3 = byteBufferArr[2];
        blockingWaitBufferReturn("Push ByteBuffer");
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new AnonymousClass4(new int[]{0}, byteBuffer, new JavaI420Buffer[]{null}, i, i2, iArr, byteBuffer2, byteBuffer3, j2, j));
        return 0;
    }

    public int pushVideoFrame(int i, boolean z, int i2, int i3, Matrix matrix, long j, Bundle bundle, long j2) {
        int[] iArr = {0};
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new AnonymousClass5(iArr, bundle, z, i2, i3, i, matrix, this, j2, j));
        return iArr[0];
    }

    public int pushVideoFrame(final ByteBuffer byteBuffer, final ByteBuffer byteBuffer2, final ByteBuffer byteBuffer3, final int i, final int i2, final int i3, final long j, long j2) {
        final int[] iArr = {0};
        blockingWaitBufferReturn("Push ByteBuffer");
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() { // from class: com.ss.ttlivestreamer.core.capture.video.ExternalVideoCapturer.2
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_core_capture_video_ExternalVideoCapturer$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_core_capture_video_ExternalVideoCapturer$2__run$___twin___() {
                ExternalVideoCapturer externalVideoCapturer = ExternalVideoCapturer.this;
                if (externalVideoCapturer.mStatus != 1) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("mStatus ");
                    LIZ.append(ExternalVideoCapturer.this.mStatus);
                    AVLog2.logToIODevice2(5, "ExternalVideoCapturer", i0.LJFF("ExternalVideoCapturer drop frame: ", X1D.LIZIZ(LIZ)), null, 1, 10000);
                    iArr[0] = -1;
                    return;
                }
                if (!externalVideoCapturer.mBufferAlreadyReturn && ExternalVideoCapturer.this.mSigBufferMode) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("!mBufferAlreadyReturn ");
                    LIZ2.append(!ExternalVideoCapturer.this.mBufferAlreadyReturn);
                    LIZ2.append(", mSigBufferMode ");
                    LIZ2.append(ExternalVideoCapturer.this.mSigBufferMode);
                    AVLog2.logToIODevice2(5, "ExternalVideoCapturer", i0.LJFF("ExternalVideoCapturer drop frame: ", X1D.LIZIZ(LIZ2)), null, 2, 10000);
                    iArr[0] = -2;
                    return;
                }
                ExternalVideoCapturer externalVideoCapturer2 = ExternalVideoCapturer.this;
                if (externalVideoCapturer2.mLoadYUVHelper == null) {
                    externalVideoCapturer2.mLoadYUVHelper = new LoadYUVHelper(i, i2);
                }
                int i4 = i;
                LoadYUVHelper loadYUVHelper = ExternalVideoCapturer.this.mLoadYUVHelper;
                if (i4 != loadYUVHelper.mWidth || i2 != loadYUVHelper.mHeight) {
                    loadYUVHelper.createTexture(i4, i2);
                }
                if (ExternalVideoCapturer.this.mLoadYUVHelper.loadYuvAndDraw(byteBuffer, byteBuffer2, byteBuffer3, i, i2)) {
                    ExternalVideoCapturer externalVideoCapturer3 = ExternalVideoCapturer.this;
                    GlTextureFrameBuffer glTextureFrameBuffer = externalVideoCapturer3.mLoadYUVHelper.mTextureFrameBuffer;
                    if (glTextureFrameBuffer != null) {
                        externalVideoCapturer3.pushVideoFrame(glTextureFrameBuffer.getTextureId(), false, i, i2, i3, RendererCommon.verticalFlipMatrix(), j, null, TimeUtils.currentTimeMs());
                        return;
                    }
                    return;
                }
                AVLog2.logToIODevice2(5, "ExternalVideoCapturer", "loadYuvAndDraw fail ", null, 3, 10000);
            }

            public static void com_ss_ttlivestreamer_core_capture_video_ExternalVideoCapturer$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                boolean LIZ;
                try {
                    anonymousClass2.com_ss_ttlivestreamer_core_capture_video_ExternalVideoCapturer$2__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
        return -1;
    }

    public int pushVideoFrame(int i, boolean z, int i2, int i3, int i4, float[] fArr, long j, Bundle bundle, long j2) {
        int[] iArr = {0};
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new AnonymousClass6(iArr, fArr, i4, i2, i3, bundle, z, i, this, j2, j));
        return iArr[0];
    }
}
