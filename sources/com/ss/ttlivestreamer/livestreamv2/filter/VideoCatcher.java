package com.ss.ttlivestreamer.livestreamv2.filter;

import X.C06460Ne;
import X.C08380Uo;
import X.C16880lQ;
import X.C25620zW;
import X.C7MY;
import X.KMP;
import X.X1D;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.capture.video.ExternalVideoCapturer;
import com.ss.ttlivestreamer.core.capture.video.VideoCapturer;
import com.ss.ttlivestreamer.core.codec.DefaultAudioEncoderFactory;
import com.ss.ttlivestreamer.core.codec.DefaultVideoEncoderFactory;
import com.ss.ttlivestreamer.core.engine.AudioEncoderFactory;
import com.ss.ttlivestreamer.core.engine.MediaEncodeStream;
import com.ss.ttlivestreamer.core.engine.MediaEngineFactory;
import com.ss.ttlivestreamer.core.engine.Transport;
import com.ss.ttlivestreamer.core.engine.VideoEncoderFactory;
import com.ss.ttlivestreamer.core.engine.VideoTrack;
import com.ss.ttlivestreamer.core.opengl.RendererCommon;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.AVLog2;
import com.ss.ttlivestreamer.core.utils.SafeHandlerThread;
import com.ss.ttlivestreamer.core.utils.SafeHandlerThreadPoolExecutor;
import com.ss.ttlivestreamer.core.utils.TEBundle;
import com.ss.ttlivestreamer.core.utils.TTLSThreadConfigHelper;
import com.ss.ttlivestreamer.core.utils.TimeUtils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes12.dex */
public class VideoCatcher implements VideoCapturer.VideoCapturerObserver, MediaEncodeStream.Observer {
    public AudioEncoderFactory mAudioEncoderFactory;
    public String[] mAvailableVideoEncoders;
    public VideoCatcherCallback mCallback;
    public TEBundle mEncodeStreamOpt;
    public int mFps;
    public H264Dumper mH264Dumper;
    public Handler mHandler;
    public int mHeight;
    public MediaEncodeStream mMediaEncodeStream;
    public int mMode;
    public PngShotter mPngShotter;
    public ExternalVideoCapturer mVideoCapturer;
    public VideoEncoderFactory mVideoEncoderFactory;
    public VideoTrack mVideoTrack;
    public int mWidth;
    public boolean mUseHardwareEncoder = true;
    public AtomicBoolean mStarted = new AtomicBoolean(false);
    public Bitmap reusableBitmap = null;
    public Bitmap compressedBitmap = null;

    /* loaded from: classes12.dex */
    public class PngShotter {
        public Bitmap mBitmap;
        public ByteBuffer mBuffer;
        public int mCount;
        public Object mFence;
        public String mPngSaveDir;
        public SafeHandlerThread mShotThread;
        public ByteBuffer mTempBuffer;

        public ByteBuffer copyBuffer() {
            this.mBuffer.position(0);
            this.mTempBuffer.rewind();
            this.mTempBuffer.limit(this.mBuffer.capacity());
            this.mTempBuffer.put(this.mBuffer);
            this.mTempBuffer.rewind();
            return this.mTempBuffer;
        }

        public PngShotter() {
            this.mPngSaveDir = "";
            this.mFence = new Object();
        }

        public void post(Runnable runnable) {
            SafeHandlerThread safeHandlerThread = this.mShotThread;
            if (safeHandlerThread != null) {
                safeHandlerThread.post(runnable);
            }
        }

        public void stop(final int i) {
            Handler handler = VideoCatcher.this.mHandler;
            if (handler == null) {
                return;
            }
            handler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.VideoCatcher.PngShotter.2
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_livestreamv2_filter_VideoCatcher$PngShotter$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_livestreamv2_filter_VideoCatcher$PngShotter$2__run$___twin___() {
                    if (i == 0 || TextUtils.isEmpty(PngShotter.this.mPngSaveDir)) {
                        return;
                    }
                    File file = new File(PngShotter.this.mPngSaveDir);
                    if (file.exists() && file.isDirectory()) {
                        for (int i2 = 1; i2 <= PngShotter.this.mCount; i2++) {
                            try {
                                StringBuilder LIZ = X1D.LIZ();
                                LIZ.append(PngShotter.this.mPngSaveDir);
                                LIZ.append("/");
                                LIZ.append(i2);
                                LIZ.append(".png");
                                File file2 = new File(X1D.LIZIZ(LIZ));
                                if (file2.exists() && file2.isFile()) {
                                    C16880lQ.LLLZZIL(file2);
                                }
                            } catch (Exception e) {
                                C16880lQ.LLLLIIL(e);
                            }
                        }
                    }
                }

                public static void com_ss_ttlivestreamer_livestreamv2_filter_VideoCatcher$PngShotter$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                    boolean LIZ;
                    try {
                        anonymousClass2.com_ss_ttlivestreamer_livestreamv2_filter_VideoCatcher$PngShotter$2__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
            SafeHandlerThread safeHandlerThread = this.mShotThread;
            if (safeHandlerThread != null) {
                SafeHandlerThreadPoolExecutor.unlockThread(safeHandlerThread);
                this.mShotThread = null;
            }
            Bitmap bitmap = this.mBitmap;
            if (bitmap != null) {
                if (!bitmap.isRecycled()) {
                    this.mBitmap.recycle();
                    System.gc();
                }
                this.mBitmap = null;
            }
            if (this.mBuffer != null) {
                this.mBuffer = null;
            }
        }

        public void initBitmapBuffer(int i, int i2) {
            Bitmap bitmap = this.mBitmap;
            if (bitmap == null || bitmap.getWidth() != i || this.mBitmap.getHeight() != i2) {
                this.mBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            }
            ByteBuffer byteBuffer = this.mBuffer;
            if (byteBuffer == null || byteBuffer.capacity() < i * i2 * 4) {
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i * i2 * 4);
                this.mBuffer = allocateDirect;
                this.mTempBuffer = ByteBuffer.allocateDirect(allocateDirect.capacity());
            }
            ByteBuffer byteBuffer2 = this.mBuffer;
            if (byteBuffer2 != null) {
                byteBuffer2.clear();
            }
        }

        public boolean readPixels(int i, int i2) {
            boolean z;
            try {
                synchronized (this.mBuffer) {
                    VideoCatcher.this.mPngShotter.initBitmapBuffer(i, i2);
                    GLES20.glReadPixels(0, 0, i, i2, 6408, 5121, this.mBuffer);
                }
                z = true;
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                int glGetError = GLES20.glGetError();
                if (glGetError != 0) {
                    AVLog2.logToIODevice2(6, "VideoCatcher", KMP.LJ("glReadPixels error ", glGetError), null, 65, 10000);
                }
                z = false;
            }
            try {
                synchronized (this.mFence) {
                    this.mBitmap.copyPixelsFromBuffer(this.mBuffer);
                }
            } catch (Exception e2) {
                C16880lQ.LLLLIIL(e2);
            }
            if (TextUtils.isEmpty(this.mPngSaveDir)) {
                return z;
            }
            this.mShotThread.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.VideoCatcher.PngShotter.3
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_livestreamv2_filter_VideoCatcher$PngShotter$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_livestreamv2_filter_VideoCatcher$PngShotter$3__run$___twin___() {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(PngShotter.this.mPngSaveDir);
                    LIZ.append("/");
                    PngShotter pngShotter = PngShotter.this;
                    int i3 = pngShotter.mCount + 1;
                    pngShotter.mCount = i3;
                    try {
                        File file = new File(C08380Uo.LIZ(LIZ, i3, ".png", LIZ));
                        if (file.exists()) {
                            C16880lQ.LLLZZIL(file);
                        }
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        synchronized (PngShotter.this.mFence) {
                            PngShotter.this.mBitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                        }
                        fileOutputStream.flush();
                        fileOutputStream.close();
                    } catch (Exception e3) {
                        C16880lQ.LLLLIIL(e3);
                    }
                }

                public static void com_ss_ttlivestreamer_livestreamv2_filter_VideoCatcher$PngShotter$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass3 anonymousClass3) {
                    boolean LIZ;
                    try {
                        anonymousClass3.com_ss_ttlivestreamer_livestreamv2_filter_VideoCatcher$PngShotter$3__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
            return z;
        }

        public void start(int i, int i2, String str) {
            initBitmapBuffer(i, i2);
            this.mPngSaveDir = str;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("PngShotThread_");
            LIZ.append(this);
            SafeHandlerThread lockThread = SafeHandlerThreadPoolExecutor.lockThread(X1D.LIZIZ(LIZ));
            this.mShotThread = lockThread;
            lockThread.start();
            if (TextUtils.isEmpty(this.mPngSaveDir)) {
                return;
            }
            this.mShotThread.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.VideoCatcher.PngShotter.1
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_livestreamv2_filter_VideoCatcher$PngShotter$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_livestreamv2_filter_VideoCatcher$PngShotter$1__run$___twin___() {
                    try {
                        File file = new File(PngShotter.this.mPngSaveDir);
                        if (file.exists() && file.isFile()) {
                            C16880lQ.LLLZZIL(file);
                        }
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        if (file.exists()) {
                            if (!file.canWrite()) {
                                StringBuilder LIZ2 = X1D.LIZ();
                                LIZ2.append(file);
                                LIZ2.append(" is forbidden to write.");
                                throw new Exception(X1D.LIZIZ(LIZ2));
                            }
                            return;
                        }
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append(file);
                        LIZ3.append(" doesn't exist.");
                        throw new Exception(X1D.LIZIZ(LIZ3));
                    } catch (Exception e) {
                        VideoCatcherCallback videoCatcherCallback = VideoCatcher.this.mCallback;
                        if (videoCatcherCallback != null) {
                            videoCatcherCallback.onError(-5, e.toString());
                        }
                    }
                }

                public static void com_ss_ttlivestreamer_livestreamv2_filter_VideoCatcher$PngShotter$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                    boolean LIZ2;
                    try {
                        anonymousClass1.com_ss_ttlivestreamer_livestreamv2_filter_VideoCatcher$PngShotter$1__run$___twin___();
                    } finally {
                        if (LIZ2) {
                        }
                    }
                }
            });
        }
    }

    /* loaded from: classes12.dex */
    public interface VideoCatcherCallback {
        void onCatchedBuffer(VideoCatcher videoCatcher);

        void onError(int i, String str);
    }

    private String getSoftEncoderCodec() {
        return "video/bytevc0";
    }

    @Override // com.ss.ttlivestreamer.core.capture.video.VideoCapturer.VideoCapturerObserver
    public void onVideoCaptureInfo(int i, int i2, int i3, String str) {
    }

    private String chooseVideoEncode() {
        if (this.mAvailableVideoEncoders == null) {
            String GetSupportedFormats = this.mVideoEncoderFactory.GetSupportedFormats();
            if (GetSupportedFormats != null) {
                this.mAvailableVideoEncoders = GetSupportedFormats.split(":");
            } else {
                throw new AndroidRuntimeException("Not found any valid video encoder");
            }
        }
        String str = null;
        if (this.mUseHardwareEncoder) {
            for (String str2 : this.mAvailableVideoEncoders) {
                if (str2.contains("video_enable_accelera=true") && str2.contains("video_type=video/avc")) {
                    str = "video/avc";
                }
            }
            if (str != null) {
                return str;
            }
        }
        String softEncoderCodec = getSoftEncoderCodec();
        AVLog.iow("VideoCatcher", C16880lQ.LLLZ("Hardware video encoder not found, use %s instead.", new Object[]{softEncoderCodec}));
        this.mUseHardwareEncoder = false;
        return softEncoderCodec;
    }

    private void setupParameter() {
        MediaEncodeStream mediaEncodeStream = this.mMediaEncodeStream;
        if (mediaEncodeStream != null) {
            if (this.mEncodeStreamOpt == null) {
                this.mEncodeStreamOpt = mediaEncodeStream.getParameter();
            }
            this.mEncodeStreamOpt.setString("video_type", chooseVideoEncode());
            this.mEncodeStreamOpt.setBool("video_enable_accelera", this.mUseHardwareEncoder);
            this.mEncodeStreamOpt.setInt("video_width", this.mWidth);
            this.mEncodeStreamOpt.setInt("video_height", this.mHeight);
            this.mEncodeStreamOpt.setInt("video_profileLevel", 3);
            this.mEncodeStreamOpt.setInt("video_fps", this.mFps);
            this.mEncodeStreamOpt.setInt("video_gop", this.mFps * 2);
            this.mEncodeStreamOpt.setInt("video_is_cbr", 1);
            this.mEncodeStreamOpt.setInt("configuration_type", 1);
            this.mEncodeStreamOpt.setBool("video_lossless_encode", true);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Dump all encodeStream config:");
            LIZ.append(this.mEncodeStreamOpt.toString());
            AVLog.iod("VideoCatcher", X1D.LIZIZ(LIZ));
            this.mMediaEncodeStream.setParameter(this.mEncodeStreamOpt);
        }
    }

    public ByteBuffer getPixelBuffer() {
        PngShotter pngShotter = this.mPngShotter;
        if (pngShotter == null) {
            return null;
        }
        return pngShotter.copyBuffer();
    }

    public void onCreateEncoderError() {
        String string = this.mEncodeStreamOpt.getString("video_type");
        if (this.mMediaEncodeStream != null) {
            String string2 = this.mEncodeStreamOpt.getString("video_type");
            int i = this.mEncodeStreamOpt.getInt("video_profileLevel");
            if (this.mUseHardwareEncoder) {
                int i2 = 1;
                if (i == 1) {
                    this.mUseHardwareEncoder = false;
                    string2 = getSoftEncoderCodec();
                    i2 = 3;
                }
                StringBuilder LIZIZ = C25620zW.LIZIZ("Video encoder switch to ", string2, ", hardware ");
                LIZIZ.append(this.mUseHardwareEncoder);
                LIZIZ.append(", profile ");
                LIZIZ.append(i2);
                AVLog.iow("VideoCatcher", X1D.LIZIZ(LIZIZ));
                this.mEncodeStreamOpt.setString("video_type", string2);
                this.mEncodeStreamOpt.setBool("video_enable_accelera", this.mUseHardwareEncoder);
                this.mEncodeStreamOpt.setInt("video_profileLevel", i2);
                this.mMediaEncodeStream.setParameter(this.mEncodeStreamOpt);
                return;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Video encoder(");
            LIZ.append(string);
            LIZ.append(") created failed");
            String LIZIZ2 = X1D.LIZIZ(LIZ);
            AVLog.ioe("VideoCatcher", LIZIZ2);
            VideoCatcherCallback videoCatcherCallback = this.mCallback;
            if (videoCatcherCallback != null) {
                videoCatcherCallback.onError(-4, LIZIZ2);
            }
        }
    }

    @Override // com.ss.ttlivestreamer.core.capture.video.VideoCapturer.VideoCapturerObserver
    public void onVideoCaptureStarted() {
        AVLog.iod("VideoCatcher", "onVideoCaptureStarted");
    }

    @Override // com.ss.ttlivestreamer.core.capture.video.VideoCapturer.VideoCapturerObserver
    public void onVideoCaptureStopped() {
        AVLog.iod("VideoCatcher", "onVideoCaptureStopped");
    }

    public int getHeight() {
        return this.mHeight;
    }

    public int getMode() {
        return this.mMode;
    }

    public int getWidth() {
        return this.mWidth;
    }

    /* loaded from: classes12.dex */
    public class H264Dumper extends Transport {
        public int codeOnQuit;
        public Object mDumpFence;
        public Thread mDumpThread;
        public ConcurrentLinkedQueue<Transport.MediaPacket> mPacketQueue;
        public boolean mRunning;

        @Override // com.ss.ttlivestreamer.core.engine.Transport
        public void registerFeedbackObserber(Transport.FeedbackObserver feedbackObserver) {
        }

        @Override // com.ss.ttlivestreamer.core.engine.Transport
        public void unRegisterFeedbackObserber(Transport.FeedbackObserver feedbackObserver) {
        }

        public H264Dumper() {
            this.mPacketQueue = new ConcurrentLinkedQueue<>();
            this.mDumpFence = new Object();
            this.codeOnQuit = 0;
        }

        @Override // com.ss.ttlivestreamer.core.engine.Transport
        public void sendPacket(Transport.MediaPacket mediaPacket) {
            this.mPacketQueue.offer(mediaPacket);
            synchronized (this.mDumpFence) {
                this.mDumpFence.notify();
            }
        }

        @Override // com.ss.ttlivestreamer.core.engine.Transport
        public boolean setupUrl(final String str) {
            final String str2 = "DumpH264Thread_";
            PthreadThread pthreadThread = new PthreadThread(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.VideoCatcher.H264Dumper.1
                public String mH264OutputPath;
                public FileOutputStream mH264OutputStream;

                private boolean onStart() {
                    try {
                        File file = new File(this.mH264OutputPath);
                        String parent = file.getParent();
                        File file2 = new File(parent);
                        if (!file2.exists()) {
                            file2.mkdirs();
                        }
                        if (file2.exists()) {
                            if (file2.canWrite()) {
                                if (file.exists() && file.isFile()) {
                                    C16880lQ.LLLZZIL(file);
                                }
                                this.mH264OutputStream = new FileOutputStream(file, false);
                                return true;
                            }
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append(parent);
                            LIZ.append(" is forbidden to write.");
                            throw new Exception(X1D.LIZIZ(LIZ));
                        }
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append(parent);
                        LIZ2.append(" doesn't exist.");
                        throw new Exception(X1D.LIZIZ(LIZ2));
                    } catch (Exception e) {
                        FileOutputStream fileOutputStream = this.mH264OutputStream;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e2) {
                                C16880lQ.LLLLIIL(e2);
                            }
                            this.mH264OutputStream = null;
                        }
                        VideoCatcherCallback videoCatcherCallback = VideoCatcher.this.mCallback;
                        if (videoCatcherCallback != null) {
                            videoCatcherCallback.onError(-5, e.toString());
                        }
                        return false;
                    }
                }

                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_livestreamv2_filter_VideoCatcher$H264Dumper$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                private void onQuit() {
                    if (this.mH264OutputStream != null) {
                        while (!H264Dumper.this.mPacketQueue.isEmpty()) {
                            Transport.MediaPacket poll = H264Dumper.this.mPacketQueue.poll();
                            if (poll != null) {
                                try {
                                    this.mH264OutputStream.getChannel().write(poll.buffer);
                                } catch (Exception e) {
                                    VideoCatcherCallback videoCatcherCallback = VideoCatcher.this.mCallback;
                                    if (videoCatcherCallback != null) {
                                        videoCatcherCallback.onError(-5, e.toString());
                                    }
                                }
                            }
                        }
                        try {
                            this.mH264OutputStream.close();
                        } catch (IOException e2) {
                            C16880lQ.LLLLIIL(e2);
                        }
                        this.mH264OutputStream = null;
                    }
                    if (H264Dumper.this.codeOnQuit != 0) {
                        try {
                            File file = new File(this.mH264OutputPath);
                            if (file.exists() && file.isFile()) {
                                C16880lQ.LLLZZIL(file);
                            }
                        } catch (Exception e3) {
                            C16880lQ.LLLLIIL(e3);
                        }
                    }
                }

                public void com_ss_ttlivestreamer_livestreamv2_filter_VideoCatcher$H264Dumper$1__run$___twin___() {
                    FileOutputStream fileOutputStream;
                    Process.setThreadPriority(TTLSThreadConfigHelper.getPriority(str2, 0));
                    this.mH264OutputPath = str;
                    H264Dumper.this.mRunning = onStart();
                    while (true) {
                        H264Dumper h264Dumper = H264Dumper.this;
                        if (h264Dumper.mRunning) {
                            if (h264Dumper.mPacketQueue.isEmpty()) {
                                try {
                                    synchronized (H264Dumper.this.mDumpFence) {
                                        H264Dumper.this.mDumpFence.wait();
                                    }
                                } catch (Exception e) {
                                    VideoCatcherCallback videoCatcherCallback = VideoCatcher.this.mCallback;
                                    if (videoCatcherCallback != null) {
                                        videoCatcherCallback.onError(-5, e.toString());
                                    }
                                }
                            }
                            Transport.MediaPacket poll = H264Dumper.this.mPacketQueue.poll();
                            if (poll != null && (fileOutputStream = this.mH264OutputStream) != null) {
                                try {
                                    fileOutputStream.getChannel().write(poll.buffer);
                                } catch (Exception e2) {
                                    VideoCatcherCallback videoCatcherCallback2 = VideoCatcher.this.mCallback;
                                    if (videoCatcherCallback2 != null) {
                                        videoCatcherCallback2.onError(-5, e2.toString());
                                    }
                                }
                            }
                        } else {
                            onQuit();
                            return;
                        }
                    }
                }

                public static void com_ss_ttlivestreamer_livestreamv2_filter_VideoCatcher$H264Dumper$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                    boolean LIZ;
                    try {
                        anonymousClass1.com_ss_ttlivestreamer_livestreamv2_filter_VideoCatcher$H264Dumper$1__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            }, "VideoCatcher$H264Dumper");
            this.mDumpThread = pthreadThread;
            pthreadThread.setName("DumpH264Thread_");
            this.mDumpThread.start();
            return true;
        }

        public void stop(int i) {
            this.mRunning = false;
            this.codeOnQuit = i;
            synchronized (this.mDumpFence) {
                this.mDumpFence.notifyAll();
            }
            try {
                this.mDumpThread.join(5000L);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
            this.mDumpThread = null;
        }
    }

    public void onFrame(VideoFrame videoFrame) {
        boolean z;
        if (this.mMode == 0) {
            VideoFrame.Buffer buffer = videoFrame.getBuffer();
            if (!(buffer instanceof VideoFrame.TextureBuffer)) {
                VideoCatcherCallback videoCatcherCallback = this.mCallback;
                if (videoCatcherCallback != null) {
                    videoCatcherCallback.onError(-4, "Video frame type not supported.");
                    return;
                }
                return;
            }
            int width = buffer.getWidth();
            int height = buffer.getHeight();
            if (width != this.mWidth || height != this.mHeight) {
                VideoCatcherCallback videoCatcherCallback2 = this.mCallback;
                if (videoCatcherCallback2 != null) {
                    StringBuilder LIZJ = C06460Ne.LIZJ("Video frame size (", width, ", ", height, ") does not match the init size (");
                    LIZJ.append(this.mWidth);
                    LIZJ.append(", ");
                    videoCatcherCallback2.onError(-4, C08380Uo.LIZ(LIZJ, this.mHeight, ")", LIZJ));
                    return;
                }
                return;
            }
            if (this.mVideoCapturer == null) {
                return;
            }
            VideoFrame.TextureBuffer textureBuffer = (VideoFrame.TextureBuffer) buffer;
            VideoFrame.TextureBuffer.Type type = textureBuffer.getType();
            float[] convertMatrixFromAndroidGraphicsMatrix = RendererCommon.convertMatrixFromAndroidGraphicsMatrix(textureBuffer.getTransformMatrix());
            ExternalVideoCapturer externalVideoCapturer = this.mVideoCapturer;
            int textureId = textureBuffer.getTextureId();
            if (type == VideoFrame.TextureBuffer.Type.OES) {
                z = true;
            } else {
                z = false;
            }
            externalVideoCapturer.pushVideoFrame(textureId, z, width, height, 0, convertMatrixFromAndroidGraphicsMatrix, videoFrame.getTimestampNs() / 1000, null, TimeUtils.currentTimeMs());
        }
    }

    public void stop(int i) {
        VideoTrack videoTrack;
        MediaEncodeStream mediaEncodeStream = this.mMediaEncodeStream;
        if (mediaEncodeStream != null) {
            mediaEncodeStream.stop();
        }
        MediaEncodeStream mediaEncodeStream2 = this.mMediaEncodeStream;
        if (mediaEncodeStream2 != null && (videoTrack = this.mVideoTrack) != null) {
            mediaEncodeStream2.removeTrack(videoTrack);
        }
        H264Dumper h264Dumper = this.mH264Dumper;
        if (h264Dumper != null) {
            h264Dumper.stop(i);
            this.mH264Dumper = null;
        }
        TEBundle tEBundle = this.mEncodeStreamOpt;
        if (tEBundle != null) {
            tEBundle.release();
            this.mEncodeStreamOpt = null;
        }
        MediaEncodeStream mediaEncodeStream3 = this.mMediaEncodeStream;
        if (mediaEncodeStream3 != null) {
            mediaEncodeStream3.registerObserver(null);
            this.mMediaEncodeStream.release();
            this.mMediaEncodeStream = null;
        }
        VideoEncoderFactory videoEncoderFactory = this.mVideoEncoderFactory;
        if (videoEncoderFactory != null) {
            videoEncoderFactory.release();
            this.mVideoEncoderFactory = null;
        }
        AudioEncoderFactory audioEncoderFactory = this.mAudioEncoderFactory;
        if (audioEncoderFactory != null) {
            audioEncoderFactory.release();
            this.mAudioEncoderFactory = null;
        }
        ExternalVideoCapturer externalVideoCapturer = this.mVideoCapturer;
        if (externalVideoCapturer != null) {
            externalVideoCapturer.stop();
            this.mVideoCapturer.release();
            this.mVideoCapturer = null;
        }
        VideoTrack videoTrack2 = this.mVideoTrack;
        if (videoTrack2 != null) {
            videoTrack2.release();
            this.mVideoTrack = null;
        }
        PngShotter pngShotter = this.mPngShotter;
        if (pngShotter != null) {
            pngShotter.stop(i);
            this.mPngShotter = null;
        }
        this.mStarted.set(false);
    }

    @Override // com.ss.ttlivestreamer.core.capture.video.VideoCapturer.VideoCapturerObserver
    public void onVideoCaptureError(int i, Exception exc) {
        VideoCatcherCallback videoCatcherCallback = this.mCallback;
        if (videoCatcherCallback != null) {
            StringBuilder LJ = C7MY.LJ("onVideoCaptureError: ", i, ", ");
            LJ.append(exc.toString());
            videoCatcherCallback.onError(-3, X1D.LIZIZ(LJ));
        }
    }

    public void readPixels(int i, int i2) {
        PngShotter pngShotter;
        if (this.mMode == 1 && (pngShotter = this.mPngShotter) != null) {
            this.mWidth = i;
            this.mHeight = i2;
            if (pngShotter.readPixels(i, i2) && this.mCallback != null) {
                this.mPngShotter.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.VideoCatcher.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com_ss_ttlivestreamer_livestreamv2_filter_VideoCatcher$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    }

                    public void com_ss_ttlivestreamer_livestreamv2_filter_VideoCatcher$1__run$___twin___() {
                        VideoCatcher videoCatcher = VideoCatcher.this;
                        videoCatcher.mCallback.onCatchedBuffer(videoCatcher);
                    }

                    public static void com_ss_ttlivestreamer_livestreamv2_filter_VideoCatcher$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                        boolean LIZ;
                        try {
                            anonymousClass1.com_ss_ttlivestreamer_livestreamv2_filter_VideoCatcher$1__run$___twin___();
                        } finally {
                            if (LIZ) {
                            }
                        }
                    }
                });
            }
        }
    }

    public byte[] getCompressedStream(int i, int i2, float f) {
        ByteBuffer pixelBuffer = getPixelBuffer();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i * i2 * 4);
        Bitmap bitmap = this.reusableBitmap;
        if (bitmap == null || bitmap.getWidth() != this.mWidth || this.reusableBitmap.getHeight() != this.mHeight) {
            Bitmap bitmap2 = this.reusableBitmap;
            if (bitmap2 != null) {
                bitmap2.recycle();
            }
            this.reusableBitmap = Bitmap.createBitmap(this.mWidth, this.mHeight, Bitmap.Config.ARGB_8888);
        }
        this.reusableBitmap.copyPixelsFromBuffer(pixelBuffer);
        Bitmap bitmap3 = this.compressedBitmap;
        if (bitmap3 == null || bitmap3.getWidth() != i || this.compressedBitmap.getHeight() != i2) {
            Bitmap bitmap4 = this.compressedBitmap;
            if (bitmap4 != null) {
                bitmap4.recycle();
            }
            this.compressedBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        }
        new Canvas(this.compressedBitmap).drawBitmap(this.reusableBitmap, (Rect) null, new RectF(0.0f, 0.0f, i, i2), (Paint) null);
        this.compressedBitmap.compress(Bitmap.CompressFormat.JPEG, (int) (f * 100.0f), byteArrayOutputStream);
        try {
            byteArrayOutputStream.flush();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // com.ss.ttlivestreamer.core.engine.MediaEncodeStream.Observer
    public void onMediaEncodeStreamEvent(final int i, final int i2, final long j, final String str) {
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.VideoCatcher.2
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_filter_VideoCatcher$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_filter_VideoCatcher$2__run$___twin___() {
                int i3 = i;
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 5) {
                            return;
                        }
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("Video encoder format changed: code1 ");
                        LIZ.append(i);
                        LIZ.append(", code2 ");
                        LIZ.append(i2);
                        LIZ.append(", code3 ");
                        LIZ.append(j);
                        LIZ.append(", msg \"");
                        LIZ.append(str);
                        LIZ.append("\"");
                        AVLog.iow("VideoCatcher", X1D.LIZIZ(LIZ));
                        return;
                    }
                    VideoCatcher.this.onCreateEncoderError();
                    return;
                }
                AVLog.iod("VideoCatcher", "Video encoder created");
            }

            public static void com_ss_ttlivestreamer_livestreamv2_filter_VideoCatcher$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                boolean LIZ;
                try {
                    anonymousClass2.com_ss_ttlivestreamer_livestreamv2_filter_VideoCatcher$2__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public void start(int i, int i2, VideoCatcherCallback videoCatcherCallback, Handler handler) {
        start(1, i, i2, 0, false, null, videoCatcherCallback, null, handler);
    }

    public void start(int i, int i2, int i3, int i4, boolean z, String str, VideoCatcherCallback videoCatcherCallback, MediaEngineFactory mediaEngineFactory, Handler handler) {
        if (this.mStarted.get()) {
            if (videoCatcherCallback != null) {
                videoCatcherCallback.onError(-2, "Video catching already started.");
                return;
            }
            return;
        }
        this.mStarted.set(true);
        if (i2 <= 0 || i3 <= 0 || handler == null) {
            if (videoCatcherCallback != null) {
                StringBuilder LIZJ = C06460Ne.LIZJ("Param error: mode ", i, ", width ", i2, ", height ");
                LIZJ.append(i3);
                LIZJ.append(", handler ");
                LIZJ.append(handler);
                videoCatcherCallback.onError(-1, X1D.LIZIZ(LIZJ));
                return;
            }
            return;
        }
        this.mMode = i;
        this.mWidth = i2;
        this.mHeight = i3;
        this.mFps = i4;
        this.mCallback = videoCatcherCallback;
        this.mHandler = handler;
        if (i == 0) {
            if (i4 <= 0 || TextUtils.isEmpty(str) || mediaEngineFactory == null) {
                if (videoCatcherCallback != null) {
                    StringBuilder LIZJ2 = C06460Ne.LIZJ("Param error: mode ", i, ",fps ", i4, ", outputPath ");
                    LIZJ2.append(str);
                    LIZJ2.append(", MediaEngineFactory ");
                    LIZJ2.append(mediaEngineFactory);
                    videoCatcherCallback.onError(-1, X1D.LIZIZ(LIZJ2));
                    return;
                }
                return;
            }
            ExternalVideoCapturer externalVideoCapturer = new ExternalVideoCapturer(this, handler);
            this.mVideoCapturer = externalVideoCapturer;
            this.mVideoTrack = mediaEngineFactory.createVideoTrack(externalVideoCapturer);
            this.mUseHardwareEncoder = z;
            this.mVideoEncoderFactory = new DefaultVideoEncoderFactory();
            this.mAudioEncoderFactory = new DefaultAudioEncoderFactory();
            H264Dumper h264Dumper = new H264Dumper();
            this.mH264Dumper = h264Dumper;
            MediaEncodeStream createMediaEncodeStream = mediaEngineFactory.createMediaEncodeStream(this.mVideoEncoderFactory, this.mAudioEncoderFactory, h264Dumper);
            this.mMediaEncodeStream = createMediaEncodeStream;
            createMediaEncodeStream.registerObserver(this);
            this.mMediaEncodeStream.start();
            setupParameter();
            this.mH264Dumper.setupUrl(str);
            this.mMediaEncodeStream.addTrack(this.mVideoTrack);
            this.mVideoCapturer.start(this.mWidth, this.mHeight, this.mFps);
            return;
        }
        PngShotter pngShotter = new PngShotter();
        this.mPngShotter = pngShotter;
        pngShotter.start(this.mWidth, this.mHeight, str);
    }
}
