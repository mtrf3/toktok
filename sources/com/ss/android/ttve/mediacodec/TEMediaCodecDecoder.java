package com.ss.android.ttve.mediacodec;

import X.C03880Dg;
import X.C06460Ne;
import X.C15890jp;
import X.C16880lQ;
import X.C36499EUd;
import X.C39519Ff9;
import X.C65300Pk0;
import X.C65429Pm5;
import X.P47;
import X.P4I;
import X.P4J;
import X.P4K;
import X.P4M;
import X.P4P;
import X.P4Q;
import X.P6Z;
import X.PDO;
import X.Q4K;
import X.X1D;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.media.Image;
import android.media.ImageReader;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.os.Build;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.Range;
import android.view.Surface;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.ss.android.medialib.util.VEPlatformUtils;
import com.ss.android.ttve.common.TEImageUtils;
import com.ss.android.ttve.common.TESharedContext;
import com.ss.android.ttve.model.VEFrame;
import com.ss.android.vesdk.VEConfigCenter;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class TEMediaCodecDecoder implements SurfaceTexture.OnFrameAvailableListener, ImageReader.OnImageAvailableListener {
    public static int file_count = 0;
    public static int sDequeueOutputTimeoutUs = 10000;
    public static int sPendingInputBufferThreshold = 5;
    public boolean mIs10bit;
    public Handler m_MediaCodechandler;
    public int m_bGlobalDecoderPoolOption;
    public boolean m_bNeedConfigure;
    public boolean m_bUseImageReader;
    public ByteBuffer m_codecSpecificData;
    public ByteBuffer m_extraDataBuf;
    public MediaFormat m_format;
    public int m_iFps;
    public int m_iHeight;
    public int m_iOutputHeight;
    public int m_iOutputWidth;
    public int m_iRotateDegree;
    public int m_iWidth;
    public long m_nativeHandler;
    public Surface m_surface;
    public SurfaceTexture m_surfaceTexture;
    public static Object mCodecListLock = new Object();
    public static ArrayList<MediaCodecInfo> mVideoHWDecoderCodecs = new ArrayList<>();
    public static boolean mIsByteVC1Blocklist = false;
    public static boolean m_useCreateDecoderByName = true;
    public static volatile boolean sDequeueHWDecodeInputBufferOpt = true;
    public static boolean sHWDecodeSupportRtAndOr = false;
    public String VIDEO_MIME_TYPE = "video/avc";
    public int m_iCodecID = 28;
    public int[] m_surfaceTexID = new int[1];
    public int m_pageMode = -1;
    public MediaCodec.BufferInfo m_bufferInfo = new MediaCodec.BufferInfo();
    public MediaCodec m_decoder = null;
    public volatile boolean m_decoderStarted = false;
    public final Object m_frameSyncObject = new Object();
    public boolean m_frameAvailable = false;
    public volatile long m_timestampOfLastDecodedFrame = Long.MIN_VALUE;
    public volatile long m_timestampOfCurTexFrame = Long.MIN_VALUE;
    public volatile boolean m_inputBufferQueued = false;
    public volatile int m_pendingInputFrameCount = 0;
    public volatile boolean m_sawInputEOS = false;
    public volatile boolean m_sawOutputEOS = false;
    public P47 m_textureRender = null;
    public TESharedContext m_sharedContext = null;
    public P4I m_eglStateSaver = null;
    public HandlerThread m_handleThread = new HandlerThread("VE-MediaCodecHandler");
    public HandlerThread mReaderHandlerThread = null;
    public ImageReader mImageReader = null;
    public Image mImage = null;
    public VEFrame mConvertFrame = null;
    public VEFrame mScaleFrame = null;
    public final long MAX_SLEEP_MS = 0;
    public final int MAX_DELAY_COUNT = 10;
    public int m_iCurCount = 0;
    public boolean m_needSendPacketAgain = false;
    public volatile boolean m_awaitNewImageSuccess = false;
    public int m_indexOfOutputBuffer = -1;
    public volatile boolean m_bReEnableOpt = false;
    public ConditionVariable m_ReEncodeOptCV = new ConditionVariable(true);
    public P4J m_renderParam = new P4J();
    public int mMinCompressionRatio = 1;
    public boolean m_bHWOverload = false;
    public final float Max_Playback_Speed = 4.0f;
    public final float Normal_Video_Fps = 30.0f;

    public static boolean codecNeedsFlushWorkaround(String str) {
        return false;
    }

    public static Object com_ss_android_ttve_mediacodec_TEMediaCodecDecoder_java_lang_reflect_Method_invoke(Method method, Object obj, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "3153263497290011235"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    private boolean isHarmonyOS() {
        try {
            Class<?> cls = Class.forName("com.huawei.system.BuildEx");
            return "harmony".equals(cls.getMethod("getOsBrand", new Class[0]).invoke(cls, new Object[0]));
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return false;
        }
    }

    public static boolean isSupportByteVC10bit() {
        return isSupportFormat("video/hevc", 2, 16384);
    }

    private native boolean nativeOnFrameAvailable(long j, ByteBuffer byteBuffer, int i);

    public static void setHWDecodeBoolConfigFromNative(String str, boolean z) {
    }

    public static void setHWDecodeIntConfigFromNative(String str, int i) {
    }

    private boolean IsValid() {
        if (this.m_decoder != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:(5:52|53|54|55|(4:57|58|59|(1:63))(3:65|59|(2:61|63)))|68|53|54|55|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x022b, code lost:
    
        X.P4Q.LJII("TEMediaCodecDecoder", "getSupportedFrameRate unsupported size");
        r1 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0229  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int configureMediaFormat() {
        /*
            Method dump skipped, instructions count: 718
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttve.mediacodec.TEMediaCodecDecoder.configureMediaFormat():int");
    }

    private int createTexture() {
        GLES20.glGenTextures(1, this.m_surfaceTexID, 0);
        int i = this.m_surfaceTexID[0];
        if (i <= 0) {
            P4Q.LIZJ("TEMediaCodecDecoder", "createTexture failed");
            return 0;
        }
        GLES20.glBindTexture(36197, i);
        GLES20.glTexParameterf(36197, 10241, 9728.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        return this.m_surfaceTexID[0];
    }

    private void deleteTexture() {
        int[] iArr = this.m_surfaceTexID;
        if (iArr[0] != 0) {
            GLES20.glDeleteTextures(1, iArr, 0);
            this.m_surfaceTexID[0] = 0;
        }
    }

    public static int getMaxBlocksSizePerSecond() {
        MediaCodecInfo mediaCodecInfo21;
        if (VEPlatformUtils.LIZ() != VEPlatformUtils.VEPlatform.PLATFORM_HISI && (mediaCodecInfo21 = getMediaCodecInfo21("video/avc")) != null) {
            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo21.getCapabilitiesForType("video/avc");
            try {
                Method LIZ = C36499EUd.LIZ(capabilitiesForType.getVideoCapabilities().getClass(), new Class[0]);
                LIZ.setAccessible(true);
                Range range = (Range) com_ss_android_ttve_mediacodec_TEMediaCodecDecoder_java_lang_reflect_Method_invoke(LIZ, capabilitiesForType.getVideoCapabilities(), new Object[0]);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("maxBlocksSizePerSecond", ((Long) range.getUpper()).longValue() * 256);
                    try {
                        Class<?> cls = Class.forName("jp3.c");
                        cls.getDeclaredMethod("onEvent", String.class, JSONObject.class, String.class).invoke(null, String.valueOf(cls.getField("VESDK_EVENT_COMMON_HW_RESOURCE_LIMIT_SIZE")), jSONObject, String.valueOf(cls.getField("EVENT_TYPE_PERFORMANCE")));
                    } catch (Exception e) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("call ApplogUtils.onEvent method err ");
                        LIZ2.append(e.getMessage());
                        P4Q.LIZJ("TEMediaCodecDecoder", X1D.LIZIZ(LIZ2));
                        C16880lQ.LLLLIIL(e);
                    }
                } catch (JSONException e2) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("report maxBlocksSizePerSecond json err ");
                    LIZ3.append(e2.getMessage());
                    P4Q.LIZJ("TEMediaCodecDecoder", X1D.LIZIZ(LIZ3));
                }
                return (int) (((Long) range.getUpper()).longValue() * 256);
            } catch (Exception e3) {
                P4Q.LIZJ("TEMediaCodecDecoder", e3.getMessage());
            }
        }
        return -1;
    }

    private boolean isHisiByteVC1BlockList() {
        String property = getProperty("ro.board.platform", null);
        if (Build.VERSION.SDK_INT != 26 || property == null) {
            return false;
        }
        if (!property.startsWith("kirin960") && !property.startsWith("hi3660")) {
            return false;
        }
        if (CastDoubleProtector.parseDouble(getProperty("ro.config.hw_codec_support", "0.0")) >= 0.18041d) {
            return false;
        }
        return true;
    }

    private boolean isMtkByteVC1BlockList() {
        String lowerCase = Build.HARDWARE.toLowerCase(Locale.US);
        if (lowerCase.startsWith("mt6763") || lowerCase.startsWith("mt6757") || lowerCase.startsWith("mt6739") || lowerCase.startsWith("mt6750")) {
            return true;
        }
        return false;
    }

    private void onImageFrameAvailable() {
        VEFrame createYUVPlanFrame;
        if (this.mImage.getFormat() == 35) {
            int width = this.mImage.getWidth();
            int height = this.mImage.getHeight();
            if (this.mImage.getPlanes() != null && this.mImage.getPlanes()[1].getPixelStride() > 1) {
                VEFrame createYUVPlanFrame2 = VEFrame.createYUVPlanFrame(new P4M(this.mImage.getPlanes()), width, height, 0, 0L, P6Z.TEPixFmt_NV12);
                if (this.mConvertFrame == null) {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(((width * height) * 3) / 2);
                    allocateDirect.clear();
                    this.mConvertFrame = VEFrame.createByteBufferFrame(allocateDirect, width, height, 0, 0L, P6Z.TEPixFmt_YUV420P);
                }
                TEImageUtils.LIZ(createYUVPlanFrame2, this.mConvertFrame, P4K.OP_CONVERT);
                createYUVPlanFrame = this.mConvertFrame;
            } else {
                createYUVPlanFrame = VEFrame.createYUVPlanFrame(new P4M(this.mImage.getPlanes()), width, height, 0, 0L, P6Z.TEPixFmt_YUV420P);
            }
            if (width == this.m_iOutputWidth && height == this.m_iOutputHeight && (createYUVPlanFrame.getFrame() instanceof VEFrame.ByteBufferFrame)) {
                ByteBuffer byteBuffer = ((VEFrame.ByteBufferFrame) createYUVPlanFrame.getFrame()).getByteBuffer();
                nativeOnFrameAvailable(this.m_nativeHandler, byteBuffer, byteBuffer.remaining());
                return;
            }
            if (this.mScaleFrame == null) {
                ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(((this.m_iOutputWidth * this.m_iOutputHeight) * 3) / 2);
                allocateDirect2.clear();
                this.mScaleFrame = VEFrame.createByteBufferFrame(allocateDirect2, this.m_iOutputWidth, this.m_iOutputHeight, 0, 0L, P6Z.TEPixFmt_YUV420P);
            }
            if (this.m_iWidth == this.m_iOutputWidth && this.m_iHeight == this.m_iOutputHeight) {
                TEImageUtils.LIZ(createYUVPlanFrame, this.mScaleFrame, P4K.OP_COPY);
            } else {
                TEImageUtils.LIZ(createYUVPlanFrame, this.mScaleFrame, P4K.OP_SCALE);
            }
            ByteBuffer byteBuffer2 = ((VEFrame.ByteBufferFrame) this.mScaleFrame.getFrame()).getByteBuffer();
            nativeOnFrameAvailable(this.m_nativeHandler, byteBuffer2, byteBuffer2.remaining());
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("image format: ");
        LIZ.append(this.mImage.getFormat());
        P4Q.LIZJ("TEMediaCodecDecoder", X1D.LIZIZ(LIZ));
    }

    public void cleanupDecoder() {
        P4Q.LJFF("TEMediaCodecDecoder", "cleanupDecoder");
        if (this.m_decoder != null) {
            if (this.m_decoderStarted) {
                try {
                    if (this.m_inputBufferQueued) {
                        this.m_decoder.flush();
                        this.m_inputBufferQueued = false;
                    }
                    this.m_decoder.stop();
                } catch (Exception e) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("");
                    LIZ.append(e.getMessage());
                    P4Q.LIZJ("TEMediaCodecDecoder", X1D.LIZIZ(LIZ));
                    C16880lQ.LLLLIIL(e);
                }
                this.m_decoderStarted = false;
            }
            this.m_decoder.release();
            this.m_decoder = null;
            this.m_iRotateDegree = 0;
        }
        if (C65429Pm5.LJFF("ve_mediacodec_resource_reasonable_distribute", false)) {
            TEMediaCodecResourceManager.freeCodecBlocksSize(this.m_iWidth * this.m_iHeight * this.m_iFps, hashCode());
        }
        this.m_timestampOfLastDecodedFrame = Long.MIN_VALUE;
        this.m_timestampOfCurTexFrame = Long.MIN_VALUE;
        this.m_pendingInputFrameCount = 0;
        this.m_sawInputEOS = false;
        this.m_sawOutputEOS = false;
    }

    public int closeDecoder() {
        P4Q.LJII("TEMediaCodecDecoder", "closeHwDecoder");
        stopDecoder();
        deleteTexture();
        return 0;
    }

    public int getOESTexture() {
        return this.m_surfaceTexID[0];
    }

    public void signalReEncodeOptCV() {
        if (!this.m_bReEnableOpt) {
            return;
        }
        this.m_ReEncodeOptCV.open();
        P4Q.LIZ("TEMediaCodecDecoder", "signalReEncodeOptCV...");
    }

    public static int getMaxMediaCodecVideoDecoderCount() {
        MediaCodecInfo mediaCodecInfo21 = getMediaCodecInfo21("video/avc");
        if (mediaCodecInfo21 == null) {
            P4Q.LIZJ("TEMediaCodecDecoder", "MediaCodecInfo is null!");
            return -2;
        }
        int maxSupportedInstances = mediaCodecInfo21.getCapabilitiesForType("video/avc").getMaxSupportedInstances();
        Q4K.LJ("getMaxMediaCodecVideoDecoderCount ", maxSupportedInstances, "TEMediaCodecDecoder");
        return maxSupportedInstances;
    }

    private int restartDecoder() {
        stopDecoder();
        return startDecoder();
    }

    private int startDecoder() {
        int i;
        if (IsValid()) {
            P4Q.LIZJ("TEMediaCodecDecoder", "You can't call startDecoder() twice!");
            return -1;
        }
        if (!this.m_bUseImageReader) {
            i = this.m_surfaceTexID[0];
            if (i == 0 && (i = createTexture()) == 0) {
                return -1;
            }
        } else {
            i = 0;
        }
        try {
            if (!this.m_bUseImageReader) {
                this.m_surfaceTexture = new SurfaceTexture(i);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Surface texture with texture (id=");
                LIZ.append(i);
                LIZ.append(") has been created.");
                P4Q.LJFF("TEMediaCodecDecoder", X1D.LIZIZ(LIZ));
            }
            this.m_handleThread.start();
            Handler handler = new Handler(this.m_handleThread.getLooper());
            this.m_MediaCodechandler = handler;
            if (!this.m_bUseImageReader) {
                this.m_surfaceTexture.setOnFrameAvailableListener(this, handler);
                this.m_surface = new Surface(this.m_surfaceTexture);
            } else {
                this.mReaderHandlerThread = new HandlerThread("VE-ImageReaderHandler");
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("getVideoFramesHW: mReaderHandlerThread = ");
                LIZ2.append(this.mReaderHandlerThread.getThreadId());
                P4Q.LJFF("TEMediaCodecDecoder", X1D.LIZIZ(LIZ2));
                this.mReaderHandlerThread.start();
                Handler handler2 = new Handler(this.mReaderHandlerThread.getLooper());
                ImageReader newInstance = ImageReader.newInstance(this.m_iWidth, this.m_iHeight, 35, 2);
                this.mImageReader = newInstance;
                newInstance.setOnImageAvailableListener(this, handler2);
            }
            if (!this.m_bUseImageReader) {
                P47 p47 = new P47(this.m_surfaceTexture);
                this.m_textureRender = p47;
                P4I p4i = this.m_eglStateSaver;
                if (p4i != null) {
                    p47.LJIILJJIL = p4i.LJ;
                }
                if (C65429Pm5.LJFF("ve_enable_opt_hwdecode_moire", false) && p47.LJIILJJIL >= 3) {
                    p47.LJ = P47.LIZ("#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform vec2 uTexelScale;\nuniform vec2 uTexelSrc;\nuniform samplerExternalOES sTexture;\nvec4 texture2DArea(vec2 coord)\n    {\n        vec4 color = vec4(0.0);\n        vec2 p = max(coord * uTexelSrc - 0.5, 0.0);\n        vec2 q = min(p + uTexelScale, uTexelSrc);\n        vec2 r = 1.0 / uTexelSrc;\n        vec2 r2 = r * 0.5;\n        vec2 s = ceil(p);\n        vec2 t = floor(q);\n        vec2 c0 = s - p;\n        vec2 c1 = q - t;\n        float e = 1.5e-2;\n        if (c0.y > e)\n        {\n            vec4 c = vec4(0.0);\n            if (c0.x > e)\n                c += texture2D(sTexture, (s - 1.0) * r + r2) * c0.x;\n            for (float x = s.x; x < t.x; x += 1.0)\n                c += texture2D(sTexture, vec2(x, s.y - 1.0) * r + r2);\n            if (c1.x > e)\n                c += texture2D(sTexture, vec2(t.x, s.y - 1.0) * r + r2) * c1.x;\n            color += c * c0.y;\n        }\n        for (float y = s.y; y < t.y; y += 1.0)\n        {\n            if (c0.x > e)\n                color += texture2D(sTexture, vec2(s.x - 1.0, y) * r + r2) * c0.x;\n            for (float x = s.x; x < t.x; x += 1.0)\n                color += texture2D(sTexture, vec2(x, y) * r + r2);\n            if (c1.x > e)\n                color += texture2D(sTexture, vec2(t.x, y) * r + r2) * c1.x;\n        }\n        if (c1.y > e)\n        {\n            vec4 c = vec4(0.0);\n            if (c0.x > e)\n                c += texture2D(sTexture, vec2(s.x - 1.0, t.y) * r + r2) * c0.x;\n            for (float x = s.x; x < t.x; x += 1.0)\n                c += texture2D(sTexture, vec2(x, t.y) * r + r2);\n            if (c1.x > e)\n                c += texture2D(sTexture, t * r + r2) * c1.x;\n            color += c * c1.y;\n        }\n        return clamp(color / (uTexelScale.x * uTexelScale.y), 0.0, 1.0);\n    }\nvoid main() {\n  if (uTexelScale.x >= 2.0)\n  {\n     gl_FragColor = texture2DArea(vTextureCoord);\n  } else {\n     gl_FragColor = texture2D(sTexture, vTextureCoord);\n  }\n}\n");
                } else {
                    p47.LJ = P47.LIZ("#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
                }
                if (p47.LJ == 0) {
                    P4Q.LIZJ("TEMediaCodecDecoder", "failed create program");
                }
                int glGetAttribLocation = GLES20.glGetAttribLocation(p47.LJ, "aPosition");
                p47.LJII = glGetAttribLocation;
                if (glGetAttribLocation == -1) {
                    P4Q.LIZJ("TEMediaCodecDecoder", "Could not get attrib location for aPosition");
                }
                int glGetAttribLocation2 = GLES20.glGetAttribLocation(p47.LJ, "aTextureCoord");
                p47.LJIIIIZZ = glGetAttribLocation2;
                if (glGetAttribLocation2 == -1) {
                    P4Q.LIZJ("TEMediaCodecDecoder", "Could not get attrib location for aTextureCoord");
                }
                int glGetUniformLocation = GLES20.glGetUniformLocation(p47.LJ, "uMVPMatrix");
                p47.LJFF = glGetUniformLocation;
                if (glGetUniformLocation == -1) {
                    P4Q.LIZJ("TEMediaCodecDecoder", "Could not get attrib location for uMVPMatrix");
                }
                p47.LJI = GLES20.glGetUniformLocation(p47.LJ, "uSTMatrix");
                P4Q.LIZ("TEMediaCodecDecoder", "glGetUniformLocation uSTMatrix");
                if (p47.LJI == -1) {
                    P4Q.LJII("TEMediaCodecDecoder", "Could not get attrib location for uSTMatrix");
                }
                if (C65429Pm5.LJFF("ve_enable_opt_hwdecode_moire", false) && p47.LJIILJJIL >= 3) {
                    int glGetUniformLocation2 = GLES20.glGetUniformLocation(p47.LJ, "uTexelScale");
                    p47.LJIIJ = glGetUniformLocation2;
                    if (glGetUniformLocation2 == -1) {
                        P4Q.LIZJ("TEMediaCodecDecoder", "Could not get uniform location for uTexelScale");
                    }
                    p47.LJIIIZ = GLES20.glGetUniformLocation(p47.LJ, "uTexelSrc");
                    if (p47.LJIIJ == -1) {
                        P4Q.LIZJ("TEMediaCodecDecoder", "Could not get uniform location for uTexelSrc");
                    }
                    p47.LJIIIZ = GLES20.glGetUniformLocation(p47.LJ, "uTexelSrc");
                    if (p47.LJIIJ == -1) {
                        P4Q.LIZJ("TEMediaCodecDecoder", "Could not get uniform location for uTexelSrc");
                    }
                }
                GLES20.glGenFramebuffers(1, p47.LJIIJJI, 0);
                P4Q.LIZ("TEMediaCodecDecoder", "glGenFramebuffers");
            }
            if (setupDecoder(this.VIDEO_MIME_TYPE)) {
                return 0;
            }
            stopDecoder();
            if (this.m_bHWOverload) {
                this.m_bHWOverload = false;
                if (C65429Pm5.LJFF("ve_enable_video_reader_hw_overload_fallback_opt", false) || C65429Pm5.LJFF("veabtest_aboffline_jy_android", false)) {
                    return -104;
                }
            }
            return -1;
        } catch (Exception e) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("");
            LIZ3.append(e.getMessage());
            P4Q.LIZJ("TEMediaCodecDecoder", X1D.LIZIZ(LIZ3));
            C16880lQ.LLLLIIL(e);
            stopDecoder();
            return -1;
        }
    }

    private int stopDecoder() {
        cleanupDecoder();
        this.m_handleThread.quit();
        HandlerThread handlerThread = this.mReaderHandlerThread;
        if (handlerThread != null) {
            handlerThread.quit();
            this.mReaderHandlerThread = null;
        }
        P47 p47 = this.m_textureRender;
        if (p47 != null) {
            int i = p47.LJ;
            if (i != 0) {
                GLES20.glDeleteProgram(i);
                p47.LJ = 0;
            }
            int[] iArr = p47.LJIIJJI;
            if (iArr[0] != 0) {
                GLES20.glDeleteFramebuffers(1, iArr, 0);
            }
            this.m_textureRender = null;
        }
        if (C65429Pm5.LJFF("veabtest_mediacodec_fix_powervr", false)) {
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
            GLES20.glBindFramebuffer(36160, 0);
        }
        Surface surface = this.m_surface;
        if (surface != null) {
            surface.release();
            this.m_surface = null;
        }
        SurfaceTexture surfaceTexture = this.m_surfaceTexture;
        if (surfaceTexture != null) {
            surfaceTexture.setOnFrameAvailableListener(null);
            this.m_surfaceTexture.release();
            this.m_surfaceTexture = null;
        }
        return 0;
    }

    private boolean isNeedSendPacketAgain() {
        return this.m_needSendPacketAgain;
    }

    public P4J getRenderParam() {
        return this.m_renderParam;
    }

    private boolean AwaitNewImage(int i) {
        synchronized (this.m_frameSyncObject) {
            do {
                if (!this.m_frameAvailable) {
                    try {
                        this.m_frameSyncObject.wait(i);
                    } catch (InterruptedException e) {
                        C16880lQ.LLLLIIL(e);
                        return false;
                    }
                } else {
                    this.m_frameAvailable = false;
                    return true;
                }
            } while (this.m_frameAvailable);
            return false;
        }
    }

    private ByteBuffer getInputBufferByIdx(int i) {
        return this.m_decoder.getInputBuffer(i);
    }

    public static MediaCodecInfo getMediaCodecInfo(String str) {
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (!codecInfoAt.isEncoder()) {
                String name = codecInfoAt.getName();
                if (!name.startsWith("OMX.google.") && !name.startsWith("OMX.Nvidia.") && !name.equals("OMX.TI.DUCATI1.VIDEO.H264E")) {
                    for (String str2 : codecInfoAt.getSupportedTypes()) {
                        if (str2.equalsIgnoreCase(str)) {
                            return codecInfoAt;
                        }
                    }
                }
            }
        }
        return null;
    }

    public static MediaCodecInfo getMediaCodecInfo21(String str) {
        try {
            MediaCodecInfo[] codecInfos = new MediaCodecList(1).getCodecInfos();
            if (codecInfos != null && codecInfos.length != 0) {
                for (MediaCodecInfo mediaCodecInfo : codecInfos) {
                    if (mediaCodecInfo != null && !mediaCodecInfo.isEncoder()) {
                        String name = mediaCodecInfo.getName();
                        if (!name.startsWith("OMX.google.") && !name.startsWith("OMX.Nvidia.") && !name.equals("OMX.TI.DUCATI1.VIDEO.H264E")) {
                            for (String str2 : mediaCodecInfo.getSupportedTypes()) {
                                if (str2.equalsIgnoreCase(str)) {
                                    return mediaCodecInfo;
                                }
                            }
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    private boolean isSupportSize(MediaCodecInfo mediaCodecInfo) {
        Range<Integer> range;
        int i;
        if (mediaCodecInfo == null) {
            return false;
        }
        Range<Integer> supportedWidths = mediaCodecInfo.getCapabilitiesForType(this.VIDEO_MIME_TYPE).getVideoCapabilities().getSupportedWidths();
        Range<Integer> supportedHeights = mediaCodecInfo.getCapabilitiesForType(this.VIDEO_MIME_TYPE).getVideoCapabilities().getSupportedHeights();
        if (supportedWidths.getUpper().intValue() < supportedHeights.getUpper().intValue()) {
            range = supportedWidths;
        } else {
            range = supportedHeights;
        }
        if (supportedWidths.getUpper().intValue() <= supportedHeights.getUpper().intValue()) {
            supportedWidths = supportedHeights;
        }
        int i2 = this.m_iWidth;
        int i3 = this.m_iHeight;
        if (i2 < i3) {
            i = i2;
        } else {
            i = i3;
        }
        if (i2 <= i3) {
            i2 = i3;
        }
        if (!range.contains((Range<Integer>) Integer.valueOf(i)) || !supportedWidths.contains((Range<Integer>) Integer.valueOf(i2))) {
            return false;
        }
        return true;
    }

    private void setProcessFlag(int i) {
        boolean z = true;
        if ((i & 1) == 0) {
            z = false;
        }
        this.m_bReEnableOpt = z;
    }

    private void setRenderParam(int i) {
        this.m_renderParam.LIZIZ = i;
    }

    private boolean setupDecoder(String str) {
        boolean z = true;
        if (C65429Pm5.LJFF("ve_mediacodec_resource_reasonable_distribute", false) && !TEMediaCodecResourceManager.tryUseCodecBlocksSize(this.m_iWidth * this.m_iHeight * this.m_iFps, hashCode())) {
            P4Q.LJII("TEMediaCodecDecoder", P4Q.LJ("TEMediaCodecDecoder", "setupDecoder ERROR_HW_OVERLOAD", new P4P("MaxCodecBlocksSize is", Integer.valueOf(TEMediaCodecResourceManager.getMaxCodecBlocksSize())), new P4P("UsedCodecBlocksSize is", Integer.valueOf(TEMediaCodecResourceManager.getUsedCodecBlocksSize()))));
            if (TEMediaCodecResourceManager.sHWEncoderStateIsBeforeRunning) {
                P4Q.LJFF("TEMediaCodecDecoder", "guarantee HWEncoder strategy");
                return false;
            }
        }
        try {
            if (!m_useCreateDecoderByName) {
                this.m_decoder = MediaCodec.createDecoderByType(str);
            } else {
                String bestCodecName = getBestCodecName(str);
                this.m_decoder = MediaCodec.createByCodecName(bestCodecName);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("setupDecoder, codecName = ");
                LIZ.append(bestCodecName);
                P4Q.LJFF("TEMediaCodecDecoder", X1D.LIZIZ(LIZ));
            }
            P4Q.LJFF("TEMediaCodecDecoder", "setupDecoder, m_useCreateDecoderByName = " + m_useCreateDecoderByName);
            Surface surface = this.m_surface;
            if (surface != null) {
                this.m_decoder.configure(this.m_format, surface, (MediaCrypto) null, 0);
            } else {
                this.m_decoder.configure(this.m_format, this.mImageReader.getSurface(), (MediaCrypto) null, 0);
            }
            this.m_decoder.start();
            this.m_decoderStarted = true;
            return true;
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("");
            LIZ2.append(e.getMessage());
            P4Q.LIZJ("TEMediaCodecDecoder", X1D.LIZIZ(LIZ2));
            if (e.getMessage() == null || !e.getMessage().contains("0xffffec77")) {
                z = false;
            }
            this.m_bHWOverload = z;
            C16880lQ.LLLLIIL(e);
            cleanupDecoder();
            return false;
        }
    }

    public int flushDecoder(boolean z) {
        if (this.m_decoder == null) {
            return -3;
        }
        if (z) {
            try {
                if (this.m_sawInputEOS || this.m_sawOutputEOS) {
                    cleanupDecoder();
                    if (!setupDecoder(this.VIDEO_MIME_TYPE)) {
                        return -2;
                    }
                    P4Q.LJII("TEMediaCodecDecoder", "Decoder has been recreated.");
                    return 0;
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                return -3;
            }
        }
        if (!this.m_inputBufferQueued) {
            return -3;
        }
        if (!z) {
            this.m_timestampOfLastDecodedFrame = Long.MIN_VALUE;
            this.m_timestampOfCurTexFrame = Long.MIN_VALUE;
            this.m_pendingInputFrameCount = 0;
            this.m_sawInputEOS = false;
            this.m_sawOutputEOS = false;
        }
        this.m_decoder.flush();
        this.m_inputBufferQueued = false;
        this.m_pendingInputFrameCount = 0;
        if (VEConfigCenter.getInstance().getValue("ve_mediacodec_resource_reasonable_distribute", false).booleanValue()) {
            TEMediaCodecResourceManager.freeCodecBlocksSize(this.m_iWidth * this.m_iHeight * this.m_iFps, hashCode());
        }
        P4Q.LJFF("TEMediaCodecDecoder", "media decoder has been flushed.");
        return 0;
    }

    public String getBestCodecName(String str) {
        int codecCount;
        MediaCodecInfo codecInfoAt;
        String[] supportedTypes;
        PDO LIZ;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.equals("video/hevc") && mIsByteVC1Blocklist) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        synchronized (mCodecListLock) {
            boolean z = !mVideoHWDecoderCodecs.isEmpty();
            try {
                if (z) {
                    codecCount = mVideoHWDecoderCodecs.size();
                } else {
                    codecCount = MediaCodecList.getCodecCount();
                }
                for (int i = 0; i < codecCount && (!z || arrayList.isEmpty()); i++) {
                    if (z) {
                        codecInfoAt = mVideoHWDecoderCodecs.get(i);
                    } else {
                        codecInfoAt = MediaCodecList.getCodecInfoAt(i);
                    }
                    String name = codecInfoAt.getName();
                    if (!codecInfoAt.isEncoder() && !name.startsWith("OMX.google") && !name.startsWith("c2.android") && (supportedTypes = codecInfoAt.getSupportedTypes()) != null) {
                        for (String str2 : supportedTypes) {
                            if (!TextUtils.isEmpty(str2)) {
                                if (!z && str2.startsWith("video/")) {
                                    mVideoHWDecoderCodecs.add(codecInfoAt);
                                }
                                if (str2.equalsIgnoreCase(str) && ((name.startsWith("OMX.") || name.startsWith("c2.")) && !name.startsWith("OMX.pv") && !name.startsWith("OMX.ittiam") && !name.contains("ffmpeg") && !name.contains("avcodec") && !name.contains("secure"))) {
                                    name.startsWith("OMX.MTK.");
                                    if (!codecNeedsFlushWorkaround(name) && (LIZ = PDO.LIZ(codecInfoAt, str)) != null && LIZ.LIZIZ != 20) {
                                        arrayList.add(LIZ);
                                    }
                                }
                            }
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                PDO pdo = (PDO) arrayList.get(0);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    PDO pdo2 = (PDO) it.next();
                    if (pdo2.LIZIZ > pdo.LIZIZ) {
                        pdo = pdo2;
                    }
                }
                return pdo.LIZ.getName();
            } catch (Exception unused) {
                return null;
            }
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        synchronized (this.m_frameSyncObject) {
            if (this.m_frameAvailable) {
                P4Q.LIZ("TEMediaCodecDecoder", "m_frameAvailable already set, frame could be dropped!");
            }
            this.m_frameAvailable = true;
            this.m_frameSyncObject.notifyAll();
        }
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public void onImageAvailable(ImageReader imageReader) {
        synchronized (this.m_frameSyncObject) {
            if (this.m_frameAvailable) {
                P4Q.LIZ("TEMediaCodecDecoder", "m_frameAvailable already set, frame could be dropped!");
            }
            Image acquireNextImage = imageReader.acquireNextImage();
            Image image = this.mImage;
            if (image != null) {
                image.close();
            }
            this.mImage = acquireNextImage;
            this.m_frameAvailable = true;
            this.m_frameSyncObject.notifyAll();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:1|(5:(2:3|(1:5)(0))|7|8|(2:10|(2:12|13)(2:15|(3:17|(2:18|(1:20)(1:21))|(1:23))))|24)(0)|6|7|8|(0)|24) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0020, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0021, code lost:
    
        X.C16880lQ.LLLLIIL(r0);
        X.P4Q.LIZJ("TEMediaCodecDecoder", r0.getMessage());
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int releaseOutBuffer(boolean r6) {
        /*
            r5 = this;
            int r0 = r5.m_bGlobalDecoderPoolOption
            java.lang.String r3 = "TEMediaCodecDecoder"
            r4 = 1
            if (r0 <= r4) goto L13
        L7:
            int r1 = android.opengl.GLES20.glGetError()
            if (r1 == 0) goto L13
            java.lang.String r0 = "before releaseOutBuffer, glError:"
            X.Q7K.LJ(r0, r1, r3)
            goto L7
        L13:
            int r0 = r5.m_pendingInputFrameCount     // Catch: java.lang.Exception -> L20
            int r0 = r0 - r4
            r5.m_pendingInputFrameCount = r0     // Catch: java.lang.Exception -> L20
            android.media.MediaCodec r1 = r5.m_decoder     // Catch: java.lang.Exception -> L20
            int r0 = r5.m_indexOfOutputBuffer     // Catch: java.lang.Exception -> L20
            r1.releaseOutputBuffer(r0, r6)     // Catch: java.lang.Exception -> L20
            goto L2b
        L20:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
            java.lang.String r0 = r0.getMessage()
            X.P4Q.LIZJ(r3, r0)
        L2b:
            r2 = 0
            if (r6 == 0) goto L57
            r0 = 500(0x1f4, float:7.0E-43)
            boolean r0 = r5.AwaitNewImage(r0)
            if (r0 != 0) goto L3e
            java.lang.String r0 = "release output buffer to surface texture failed!"
            X.P4Q.LIZJ(r3, r0)
            r0 = -103(0xffffffffffffff99, float:NaN)
            return r0
        L3e:
            r5.m_awaitNewImageSuccess = r4
            int r0 = r5.m_bGlobalDecoderPoolOption
            if (r0 <= r4) goto L57
            r0 = 0
        L45:
            int r1 = android.opengl.GLES20.glGetError()
            if (r1 == 0) goto L52
            java.lang.String r0 = "after releaseOutBuffer, glError:"
            X.Q7K.LJ(r0, r1, r3)
            r0 = 1
            goto L45
        L52:
            if (r0 == 0) goto L57
            r0 = -105(0xffffffffffffff97, float:NaN)
            return r0
        L57:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttve.mediacodec.TEMediaCodecDecoder.releaseOutBuffer(boolean):int");
    }

    public static String getProperty(String str, String str2) {
        try {
            try {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, str2);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                return str2;
            }
        } catch (Throwable unused) {
            return str2;
        }
    }

    public int getInfoByFlag(long[] jArr, int i) {
        if (i == 1) {
            jArr[0] = this.m_timestampOfLastDecodedFrame;
        } else if (i == 2) {
            jArr[0] = this.m_timestampOfCurTexFrame;
        }
        return 0;
    }

    public static boolean checkHDVideoCanFastImport(int i, int i2, int i3) {
        if (!C65429Pm5.LJFF("ve_mediacodec_resource_reasonable_distribute", false)) {
            return false;
        }
        return TEMediaCodecResourceManager.checkCanFastImport(i, i2, i3);
    }

    public static Bitmap convertTexToBitmap(int i, int i2, int i3) {
        ByteBuffer readTextureToByteBuffer = readTextureToByteBuffer(i, i2, i3);
        Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        createBitmap.copyPixelsFromBuffer(readTextureToByteBuffer);
        return createBitmap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        if (r13 >= 0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0041 -> B:10:0x0022). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int decodeFrame2Surface(byte[] r20, int r21, long r22) {
        /*
            Method dump skipped, instructions count: 733
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttve.mediacodec.TEMediaCodecDecoder.decodeFrame2Surface(byte[], int, long):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
    
        if (r13 >= 0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0041 -> B:10:0x0022). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int decodeFrameWithInputOutput(byte[] r21, int r22, long r23) {
        /*
            Method dump skipped, instructions count: 706
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttve.mediacodec.TEMediaCodecDecoder.decodeFrameWithInputOutput(byte[], int, long):int");
    }

    public static boolean dumpOESTexture(int i, int i2, int i3) {
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        GLES20.glGetIntegerv(36006, iArr2, 0);
        GLES20.glGenFramebuffers(1, iArr, 0);
        GLES20.glViewport(0, 0, i2, i3);
        GLES20.glBindTexture(36197, i);
        GLES20.glBindFramebuffer(36160, iArr[0]);
        GLES20.glFramebufferTexture2D(36160, 36064, 36197, i, 0);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i2 * i3 * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        allocateDirect.position(0);
        GLES20.glReadPixels(0, 0, i2, i3, 6408, 5121, allocateDirect);
        GLES20.glFinish();
        GLES20.glBindFramebuffer(36160, iArr2[0]);
        GLES20.glBindTexture(36197, 0);
        GLES20.glDeleteFramebuffers(1, iArr, 0);
        Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        createBitmap.copyPixelsFromBuffer(allocateDirect);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("/data/data/com.lemon.lv/files/OES_");
        C15890jp.LIZIZ(LIZ, file_count, "_", i, ".jpg");
        String LIZIZ = X1D.LIZIZ(LIZ);
        file_count++;
        File file = new File(LIZIZ);
        if (file.exists()) {
            C16880lQ.LLLZZIL(file);
        }
        try {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                createBitmap.compress(Bitmap.CompressFormat.JPEG, 20, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
                if (!createBitmap.isRecycled()) {
                    createBitmap.recycle();
                }
                return true;
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                if (!createBitmap.isRecycled()) {
                    createBitmap.recycle();
                }
                return false;
            }
        } catch (Throwable th) {
            if (!createBitmap.isRecycled()) {
                createBitmap.recycle();
            }
            throw th;
        }
    }

    public static boolean isSupportFormat(String str, int i, int i2) {
        MediaCodecInfo mediaCodecInfo21 = getMediaCodecInfo21(str);
        if (mediaCodecInfo21 == null) {
            P4Q.LIZJ("TEMediaCodecDecoder", "MediaCodecInfo is null!");
            return false;
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : mediaCodecInfo21.getCapabilitiesForType(str).profileLevels) {
            if (codecProfileLevel.profile == i && codecProfileLevel.level >= i2) {
                return true;
            }
        }
        return false;
    }

    public static ByteBuffer readTextureToByteBuffer(int i, int i2, int i3) {
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        GLES20.glGetIntegerv(36006, iArr2, 0);
        GLES20.glGenFramebuffers(1, iArr, 0);
        GLES20.glBindFramebuffer(36160, iArr[0]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i, 0);
        ByteBuffer allocate = ByteBuffer.allocate(i2 * i3 * 4);
        GLES20.glReadPixels(0, 0, i2, i3, 6408, 5121, allocate);
        GLES20.glFinish();
        GLES20.glBindFramebuffer(36160, iArr2[0]);
        GLES20.glDeleteFramebuffers(1, iArr, 0);
        return allocate;
    }

    public static boolean saveFrameToFile(int i, int i2, int i3) {
        Bitmap convertTexToBitmap = convertTexToBitmap(i, i2, i3);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("/data/data/com.lemon.lv/files/2D_");
        C15890jp.LIZIZ(LIZ, file_count, "_", i, ".jpg");
        String LIZIZ = X1D.LIZIZ(LIZ);
        file_count++;
        File file = new File(LIZIZ);
        if (file.exists()) {
            C16880lQ.LLLZZIL(file);
        }
        try {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                convertTexToBitmap.compress(Bitmap.CompressFormat.JPEG, 20, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
                if (!convertTexToBitmap.isRecycled()) {
                    convertTexToBitmap.recycle();
                }
                return true;
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                if (!convertTexToBitmap.isRecycled()) {
                    convertTexToBitmap.recycle();
                    return false;
                }
                return false;
            }
        } catch (Throwable th) {
            if (!convertTexToBitmap.isRecycled()) {
                convertTexToBitmap.recycle();
            }
            throw th;
        }
    }

    public int decodeFrameWithoutDraw(byte[] bArr, int i, long j) {
        int i2 = -2;
        if (this.m_decoder == null) {
            return -2;
        }
        if (C65429Pm5.LJFF("ve_mediacodec_resource_reasonable_distribute", false) && !TEMediaCodecResourceManager.tryUseCodecBlocksSize(this.m_iWidth * this.m_iHeight * this.m_iFps, hashCode())) {
            P4Q.LIZ("TEMediaCodecDecoder", P4Q.LJ("TEMediaCodecDecoder", "decodeFrameWithoutDraw ERROR_HW_OVERLOAD", new P4P("MaxCodecBlocksSize is", Integer.valueOf(TEMediaCodecResourceManager.getMaxCodecBlocksSize())), new P4P("UsedCodecBlocksSize is", Integer.valueOf(TEMediaCodecResourceManager.getUsedCodecBlocksSize()))));
        }
        try {
            i2 = decodeFrameWithInputOutput(bArr, i, j);
            return i2;
        } catch (IllegalStateException e) {
            C16880lQ.LLLLIIL(e);
            return i2;
        }
    }

    public void updateAndRenderOES(int i, int i2, int i3, int i4) {
        this.m_iOutputWidth = i2;
        this.m_iOutputHeight = i3;
        this.m_iRotateDegree = i4;
        if (!this.m_bUseImageReader && this.m_eglStateSaver == null) {
            P4I p4i = new P4I();
            this.m_eglStateSaver = p4i;
            p4i.LIZIZ();
            this.m_textureRender.LJIILJJIL = this.m_eglStateSaver.LJ;
        }
        if (!this.m_bUseImageReader && !EGL14.eglGetCurrentContext().equals(this.m_eglStateSaver.LIZ)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("eglGetCurrentContext = ");
            LIZ.append(EGL14.eglGetCurrentContext());
            LIZ.append(" getSavedEGLContext = ");
            LIZ.append(this.m_eglStateSaver.LIZ);
            P4Q.LJII("TEMediaCodecDecoder", X1D.LIZIZ(LIZ));
        }
        if (!this.m_sawOutputEOS) {
            P4Q.LIZ("TEMediaCodecDecoder", "Rendering decoded frame to surface texture.");
            if (this.m_awaitNewImageSuccess) {
                this.m_timestampOfCurTexFrame = this.m_bufferInfo.presentationTimeUs;
                if (this.m_bReEnableOpt) {
                    this.m_ReEncodeOptCV.block();
                }
                SurfaceTexture surfaceTexture = this.m_surfaceTexture;
                if (surfaceTexture != null) {
                    surfaceTexture.updateTexImage();
                    if (VEConfigCenter.getInstance().getValue("ve_enable_hw_decoder_use_surfacetexture_matrix", false).booleanValue()) {
                        this.m_surfaceTexture.getTransformMatrix(this.m_textureRender.LIZLLL);
                    }
                }
                if (this.m_bReEnableOpt) {
                    this.m_ReEncodeOptCV.close();
                    this.m_awaitNewImageSuccess = false;
                    return;
                }
                P47 p47 = this.m_textureRender;
                if (p47 != null && i > 0) {
                    p47.LIZIZ(this.m_iWidth, this.m_iHeight, this.m_iOutputWidth, this.m_iOutputHeight, this.m_surfaceTexID[0], i, this.m_iRotateDegree);
                }
                if (this.m_bUseImageReader) {
                    onImageFrameAvailable();
                }
                this.m_awaitNewImageSuccess = false;
                return;
            }
            P4Q.LIZJ("TEMediaCodecDecoder", "Render OES to 2D texture failed: m_awaitNewImageSuccess is false!");
            return;
        }
        P4Q.LIZ("TEMediaCodecDecoder", "Render OES to 2D texture failed: m_sawOutputEOS");
    }

    public int decodeFrame(byte[] bArr, int i, long j, int i2, int i3, int i4, int i5) {
        this.m_iOutputWidth = i3;
        this.m_iOutputHeight = i4;
        this.m_iRotateDegree = i5;
        if (!this.m_bUseImageReader && this.m_eglStateSaver == null) {
            P4I p4i = new P4I();
            this.m_eglStateSaver = p4i;
            p4i.LIZIZ();
        }
        if (!this.m_bUseImageReader && !EGL14.eglGetCurrentContext().equals(this.m_eglStateSaver.LIZ)) {
            this.m_bNeedConfigure = true;
        }
        if (this.m_bNeedConfigure) {
            if (!this.m_bUseImageReader) {
                this.m_eglStateSaver.LIZIZ();
            }
            restartDecoder();
            this.m_bNeedConfigure = false;
        }
        int i6 = -2;
        if (this.m_decoder == null) {
            return -2;
        }
        if (C65429Pm5.LJFF("ve_mediacodec_resource_reasonable_distribute", false) && !TEMediaCodecResourceManager.tryUseCodecBlocksSize(this.m_iWidth * this.m_iHeight * this.m_iFps, hashCode())) {
            P4Q.LIZ("TEMediaCodecDecoder", P4Q.LJ("TEMediaCodecDecoder", "decodeFrame ERROR_HW_OVERLOAD", new P4P("MaxCodecBlocksSize is", Integer.valueOf(TEMediaCodecResourceManager.getMaxCodecBlocksSize())), new P4P("UsedCodecBlocksSize is", Integer.valueOf(TEMediaCodecResourceManager.getUsedCodecBlocksSize()))));
        }
        try {
            i6 = decodeFrame2Surface(bArr, i, j);
            if (i6 == 0) {
                if (this.m_bReEnableOpt) {
                    this.m_ReEncodeOptCV.block();
                }
                SurfaceTexture surfaceTexture = this.m_surfaceTexture;
                if (surfaceTexture != null) {
                    surfaceTexture.updateTexImage();
                    if (VEConfigCenter.getInstance().getValue("ve_enable_hw_decoder_use_surfacetexture_matrix", false).booleanValue()) {
                        this.m_surfaceTexture.getTransformMatrix(this.m_textureRender.LIZLLL);
                    }
                }
                if (this.m_bReEnableOpt) {
                    this.m_ReEncodeOptCV.close();
                    return i6;
                }
                P47 p47 = this.m_textureRender;
                if (p47 != null && i2 > 0) {
                    p47.LIZIZ(this.m_iWidth, this.m_iHeight, this.m_iOutputWidth, this.m_iOutputHeight, this.m_surfaceTexID[0], i2, this.m_iRotateDegree);
                }
                if (this.m_bUseImageReader) {
                    onImageFrameAvailable();
                }
            }
        } catch (IllegalStateException e) {
            C16880lQ.LLLLIIL(e);
        }
        return i6;
    }

    public int setDecoderParams(int i, int i2, int i3, byte[] bArr, int i4, int i5, int i6, int i7) {
        this.m_iWidth = i;
        this.m_iHeight = i2;
        this.m_iFps = i3;
        this.m_iOutputWidth = i5;
        this.m_iOutputHeight = i6;
        this.m_codecSpecificData = null;
        this.m_iCodecID = i7;
        if (i7 != 2) {
            if (i7 != 13) {
                if (i7 != 28) {
                    if (i7 != 140) {
                        if (i7 != 168) {
                            if (i7 == 174) {
                                this.VIDEO_MIME_TYPE = "video/hevc";
                                this.mMinCompressionRatio = 4;
                            }
                        } else {
                            this.VIDEO_MIME_TYPE = "video/x-vnd.on2.vp9";
                        }
                    } else {
                        this.VIDEO_MIME_TYPE = "video/x-vnd.on2.vp8";
                    }
                } else {
                    this.VIDEO_MIME_TYPE = "video/avc";
                    this.mMinCompressionRatio = 2;
                }
            } else {
                this.VIDEO_MIME_TYPE = "video/mp4v-es";
            }
        } else {
            this.VIDEO_MIME_TYPE = "video/mpeg2";
        }
        if (i4 > 0) {
            this.m_codecSpecificData = ByteBuffer.wrap(bArr, 0, i4);
        }
        this.m_bNeedConfigure = true;
        return 0;
    }

    public int initDecoder(long j, int i, int i2, int i3, byte[] bArr, int i4, int i5, int i6, int i7, boolean z, boolean z2, boolean z3, int i8) {
        this.m_nativeHandler = j;
        this.m_bUseImageReader = z2;
        this.mIs10bit = z3;
        this.m_pageMode = i8;
        this.m_bGlobalDecoderPoolOption = VEConfigCenter.getInstance().getValue("ve_enable_global_decoder_pool", 0);
        m_useCreateDecoderByName = z;
        if (174 == i7 && (isHisiByteVC1BlockList() || isMtkByteVC1BlockList())) {
            mIsByteVC1Blocklist = true;
        }
        int decoderParams = setDecoderParams(i, i2, i3, bArr, i4, i5, i6, i7);
        if (this.m_bNeedConfigure) {
            decoderParams = configureMediaFormat();
        }
        if (decoderParams != 0) {
            return decoderParams;
        }
        if (this.m_eglStateSaver == null && !this.m_bUseImageReader) {
            P4I p4i = new P4I();
            this.m_eglStateSaver = p4i;
            p4i.LIZIZ();
        }
        if (this.m_bNeedConfigure && (decoderParams = restartDecoder()) == 0) {
            this.m_bNeedConfigure = false;
        }
        StringBuilder LIZJ = C06460Ne.LIZJ("initHwDecoder srcSize:(", i, ",", i2, "), dstSize:(");
        C15890jp.LIZIZ(LIZJ, i5, ",", i6, ") ret=");
        LIZJ.append(decoderParams);
        P4Q.LJII("TEMediaCodecDecoder", X1D.LIZIZ(LIZJ));
        return decoderParams;
    }
}
