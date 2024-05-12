package com.ss.android.ttve.mediacodec;

import X.C01R;
import X.C0MT;
import X.C141415gn;
import X.C16880lQ;
import X.C63845P3x;
import X.C63868P4u;
import X.C65429Pm5;
import X.C78609UtB;
import X.C7MY;
import X.EnumC63844P3w;
import X.JBR;
import X.P4C;
import X.P4D;
import X.P4I;
import X.P4N;
import X.P4O;
import X.P4P;
import X.P4Q;
import X.P4T;
import X.P4U;
import X.P4V;
import X.Q4K;
import X.Q7K;
import X.V10;
import X.X1D;
import Y.ARunnableS47S0100000_11;
import android.graphics.Bitmap;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ttve.common.TESharedContext;
import com.ss.android.ttve.nativePort.TEUtils;
import com.ss.android.vesdk.VEConfigCenter;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.ss.android.vesdk.runtime.VERuntime;
import com.ss.lens.algorithm.SmartCodec;
import defpackage.i0;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import jp3.c;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class TEAvcEncoder {
    public static boolean DEBUG = false;
    public static int MAX_FRAME_RATE = 2000;
    public static long MAX_PRODUCT_OF_SIZE_AND_FPS = -1;
    public static int MIN_FRAME_RATE = 7;
    public static int m_uploadSpeed = -2;
    public P4I m_eglStateSaver;
    public TESharedContext m_sharedContext;
    public P4N m_textureDrawer;
    public byte[] pps;
    public byte[] sps;
    public static List<String> mSmartCodecPathList = new ArrayList();
    public static String mJsonSettings = "";
    public static float mVmaf = 0.0f;
    public static int ENCODE_RESOLUTION_ALIGN = 16;
    public static final Object kInitSyncObj = new Object();
    public static Boolean kInitialized = Boolean.FALSE;
    public static int file_count = 0;
    public final int ENCODE_COUNT_DEFAULT = 10;
    public LinkedBlockingQueue<P4O> AVCQueue = new LinkedBlockingQueue<>();
    public Queue<Long> m_PTSQueue = new LinkedList();
    public long m_lastDts = 0;
    public boolean m_bPrintExistBFrame = false;
    public byte[] configByte = null;
    public MediaCodec m_mediaCodec = null;
    public MediaFormat m_codecFormat = null;
    public Surface m_surface = null;
    public int m_codec_type = 0;
    public int m_width = 0;
    public int m_height = 0;
    public int m_OesSrcRotation = 0;
    public int m_OesSrcWidth = 0;
    public int m_OesSrcHeight = 0;
    public boolean m_OesFlipY = false;
    public int m_width_align = 0;
    public int m_height_align = 0;
    public int m_frameRate = 0;
    public int m_colorFormat = 0;
    public int m_bitRate = 0;
    public int m_maxBitRate = 0;
    public int m_iFrameInternal = 0;
    public int m_profile = 0;
    public boolean isSupportBFrame = true;
    public int m_colorspace = 0;
    public int m_bColorRangeFull = 0;
    public int m_colorTrc = 0;
    public double m_dHpBitrateRatio = 0.75d;
    public double m_TransitionKeyframeRatio = 1.0d;
    public int m_TransitionFrameCounter = 0;
    public int m_level = 0;
    public boolean m_useInputSurface = true;
    public long m_getnerateIndex = 0;
    public int m_pageMode = -1;
    public int m_streamID = -1;
    public int m_hardWare = -1;
    public String m_mime_type = "video/avc";
    public float mSmartBitrate = 0.0f;
    public boolean mNeedIFrame = false;
    public long mProcessSCTimestamp = 0;
    public float mEncodedFrameSizeSum = -1.0f;
    public int mEncodedFrameSize = -1;
    public boolean mEnableSmartEncoder = true;
    public P4O m_lastCodecData = null;
    public boolean m_bSuccessInit = false;
    public boolean m_isNeedReconfigure = false;
    public boolean m_bNeedSingalEnd = false;
    public boolean m_bSignalEndOfStream = false;
    public boolean m_bByteVC110BitHWDecoder = false;
    public boolean m_useHDR10Bit = false;
    public int m_configStatus = 0;
    public long m_encodeStartTime = -1;
    public P4D m_textureOESDrawer = null;
    public TEMediaCodecDecoder m_MediaCodecDecInstance = null;
    public boolean m_bEncodeOESTexture = false;
    public boolean m_bEncoderGLContextReuse = false;
    public boolean m_bEncoderBanExtraDataLoop = false;
    public boolean isEnableHwEncoderOpt = false;
    public boolean m_bEncodeGLFinish = true;
    public long mFirstFrameTimestamp = Long.MIN_VALUE;
    public long mLastKeyFramePTS = 0;
    public long MINIMUM_KEY_FRAME_PTS_DISTANCE_IN_US = 500000;
    public long mEncFrameCount = 0;
    public long mTotalFrameCount = 0;
    public long mLastFramePTS = -1;
    public long mGOPSize = -1;
    public boolean mEnableOperatingRate = true;
    public boolean mEnableEncodeBt601 = true;
    public boolean mUseForRecorder = false;
    public boolean mRecorderEncodeFail = false;
    public Handler mHandler = null;
    public long mLastEncodeFramePTS = -1;
    public long mPicBufferCount = 0;
    public long mPicEncodeCount = 0;
    public long mPicSendCount = 0;
    public P4T mSmartCodec = null;
    public P4U result = new P4U();
    public int mSmartCodecInitNum = 0;
    public boolean isOesTexture = false;
    public ByteBuffer mByteBuf = null;
    public boolean mFirstFrame = true;
    public boolean mEndOfStream = false;
    public int mBufferIndex = -1;

    private void reportEncInfo() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("picEncodeCount", String.valueOf(this.mPicEncodeCount));
            jSONObject.put("picBufferCount", String.valueOf(this.mPicBufferCount));
            jSONObject.put("picSendCount", String.valueOf(this.mPicSendCount));
            jSONObject.put("useForRecorder", String.valueOf(this.mUseForRecorder));
            c.LIZIZ("vesdk_event_hwencode_error", "behavior", jSONObject, false, true);
        } catch (JSONException e) {
            StringWriter stringWriter = new StringWriter();
            e.printStackTrace(new PrintWriter(stringWriter));
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("releaseEncoder, Exception ");
            LIZ.append(stringWriter);
            P4Q.LJII("TEAvcEncoder", P4Q.LJ("TEAvcEncoder", X1D.LIZIZ(LIZ), new P4P[0]));
        }
    }

    public static boolean saveFrameToFile(int i, int i2, int i3, long j) {
        return true;
    }

    public void stopEncoder() {
        try {
            this.m_bByteVC110BitHWDecoder = false;
            TESharedContext tESharedContext = this.m_sharedContext;
            if (tESharedContext != null) {
                tESharedContext.LIZLLL();
            }
            P4N p4n = this.m_textureDrawer;
            if (p4n != null) {
                p4n.LIZIZ();
                this.m_textureDrawer = null;
            }
            P4D p4d = this.m_textureOESDrawer;
            if (p4d != null) {
                p4d.LIZJ();
                this.m_textureOESDrawer = null;
            }
            MediaCodec mediaCodec = this.m_mediaCodec;
            if (mediaCodec != null) {
                mediaCodec.stop();
            }
        } catch (Exception e) {
            StringWriter stringWriter = new StringWriter();
            e.printStackTrace(new PrintWriter(stringWriter));
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("stopEncoder, Exception ");
            LIZ.append(stringWriter);
            String LJ = P4Q.LJ("TEAvcEncoder", X1D.LIZIZ(LIZ), new P4P[0]);
            P4Q.LJII("TEAvcEncoder", LJ);
            reportErrorInfo("stopEncoder", LJ);
        }
    }

    private int cleanUpMediaCodec() {
        if (this.mEndOfStream) {
            return 0;
        }
        try {
            MediaCodec mediaCodec = this.m_mediaCodec;
            if (mediaCodec != null) {
                mediaCodec.signalEndOfInputStream();
            }
            int i = 30;
            while (!this.mEndOfStream && i > 0) {
                int drainOutputBuffer = drainOutputBuffer(10000L);
                if (drainOutputBuffer != 0) {
                    Q7K.LJ("CleanUpMediaCodec drainOutputBuffer failed ret: ", drainOutputBuffer, "TEAvcEncoder");
                    return drainOutputBuffer;
                }
                i--;
            }
            StringBuilder LJ = C7MY.LJ("CleanUpMediaCodec: cnt= ", i, " mEndOfStream = ");
            LJ.append(this.mEndOfStream);
            P4Q.LIZ("TEAvcEncoder", X1D.LIZIZ(LJ));
            if (!this.mEndOfStream) {
                P4Q.LIZJ("TEAvcEncoder", "CleanUpMediaCodec: Not reaching end of stream but encoder is alive so let's keep it going!");
                return 0;
            }
            if (restartEncoder() >= 0) {
                return 0;
            }
            P4Q.LIZJ("TEAvcEncoder", P4Q.LJ("TEAvcEncoder", "CleanupMediaCodec restartEncoder failed", new P4P[0]));
            return -213;
        } catch (Exception e) {
            StringWriter stringWriter = new StringWriter();
            e.printStackTrace(new PrintWriter(stringWriter));
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("CleanUpMediaCodec signalEndOfInputStream exception: ");
            LIZ.append(stringWriter);
            String LJ2 = P4Q.LJ("TEAvcEncoder", X1D.LIZIZ(LIZ), new P4P[0]);
            P4Q.LJII("TEAvcEncoder", LJ2);
            reportErrorInfo("CleanUpMediaCodec", LJ2);
            return -213;
        }
    }

    private int configEncode() {
        Object valueOf;
        boolean z;
        try {
            if (this.m_surface != null) {
                if (VEConfigCenter.getInstance().getValue("veabtest_mediacodec_fix_powervr", false).booleanValue()) {
                    GLES20.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                    GLES20.glBindFramebuffer(36160, 0);
                }
                this.m_surface.release();
                this.m_surface = null;
            }
            MediaCodec mediaCodec = this.m_mediaCodec;
            if (mediaCodec != null) {
                mediaCodec.release();
            }
            if (VEConfigCenter.getInstance().getValue("ve_mediacodec_resource_reasonable_distribute", false).booleanValue()) {
                TEMediaCodecResourceManager.sHWEncoderStateIsBeforeRunning = true;
                TEMediaCodecResourceManager.sExistHWEncoder = true;
                if (!TEMediaCodecResourceManager.tryUseCodecBlocksSize(this.m_width_align * this.m_height_align * this.m_frameRate, hashCode())) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("ERROR_HW_OVERLOAD, MaxCodecBlocksSize is: ");
                    LIZ.append(TEMediaCodecResourceManager.getMaxCodecBlocksSize());
                    LIZ.append(", UsedCodecBlocksSize is: ");
                    LIZ.append(TEMediaCodecResourceManager.getUsedCodecBlocksSize());
                    P4Q.LJII("TEAvcEncoder", X1D.LIZIZ(LIZ));
                }
            }
            MediaCodec createEncoderByType = MediaCodec.createEncoderByType(this.m_mime_type);
            this.m_mediaCodec = createEncoderByType;
            MediaCodecInfo codecInfo = createEncoderByType.getCodecInfo();
            List<String> list = mSmartCodecPathList;
            if (list != null && !list.isEmpty() && this.mEnableSmartEncoder && this.m_streamID == 1) {
                String lowerCase = codecInfo.getName().toLowerCase();
                if (lowerCase.contains(".qcom.") || lowerCase.contains(".qti.")) {
                    this.m_hardWare = 1;
                } else if (lowerCase.contains(".hisi.")) {
                    this.m_hardWare = 2;
                } else if (lowerCase.contains(".mtk.")) {
                    this.m_hardWare = 3;
                } else if (lowerCase.contains(".exynos.") || lowerCase.contains(".sec.")) {
                    this.m_hardWare = 4;
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("configEncode m_hardWare ");
                LIZ2.append(this.m_hardWare);
                P4Q.LJFF("TEAvcEncoder", X1D.LIZIZ(LIZ2));
            }
            String[] supportedTypes = codecInfo.getSupportedTypes();
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("configEncode supports ");
            LIZ3.append(Arrays.toString(supportedTypes));
            P4Q.LIZ("TEAvcEncoder", X1D.LIZIZ(LIZ3));
            MediaCodecInfo.CodecCapabilities capabilitiesForType = codecInfo.getCapabilitiesForType(supportedTypes[0]);
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("configEncode caps ");
            LIZ4.append(Arrays.toString(capabilitiesForType.colorFormats));
            P4Q.LJFF("TEAvcEncoder", X1D.LIZIZ(LIZ4));
            if (this.m_useHDR10Bit) {
                int[] iArr = capabilitiesForType.colorFormats;
                boolean z2 = false;
                for (int i : iArr) {
                    if (i == 54) {
                        z2 = true;
                    }
                }
                if (z2) {
                    z = true;
                } else {
                    z = false;
                }
                this.m_useHDR10Bit = z;
            }
            if (codecInfo.getName().startsWith("OMX.google.")) {
                P4Q.LJII("TEAvcEncoder", P4Q.LJ("TEAvcEncoder", "TEAvcEncoder mediaCodecInfo Name() startsWith OMX.google.", new P4P[0]));
                return -2;
            }
            if (reconfigureMediaFormat(codecInfo) != 0) {
                P4Q.LJII("TEAvcEncoder", P4Q.LJ("TEAvcEncoder", "TEAvcEncoder reconfigureMediaFormat failed", new P4P[0]));
                return -3;
            }
            this.m_mediaCodec.configure(this.m_codecFormat, (Surface) null, (MediaCrypto) null, 1);
            if (this.m_useInputSurface) {
                this.m_surface = this.m_mediaCodec.createInputSurface();
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("m_mediaCodec.createInputSurface(), m_surface.isValid=");
                Surface surface = this.m_surface;
                if (surface == null) {
                    valueOf = "null";
                } else {
                    valueOf = Boolean.valueOf(surface.isValid());
                }
                LIZ5.append(valueOf);
                P4Q.LIZJ("TEAvcEncoder", X1D.LIZIZ(LIZ5));
            }
            return 0;
        } catch (Exception e) {
            StringWriter stringWriter = new StringWriter();
            e.printStackTrace(new PrintWriter(stringWriter));
            StringBuilder LIZ6 = X1D.LIZ();
            LIZ6.append("TEAvcEncoder configEncode Exception");
            LIZ6.append(stringWriter);
            String LJ = P4Q.LJ("TEAvcEncoder", X1D.LIZIZ(LIZ6), new P4P[0]);
            P4Q.LJII("TEAvcEncoder", LJ);
            reportErrorInfo("configEncode", LJ);
            return -4;
        }
    }

    public static TEAvcEncoder createEncoderObject() {
        return new TEAvcEncoder();
    }

    private int forceToPrepareKeyFrame() {
        P4Q.LIZ("TEAvcEncoder", "HW_ENCODE forceToPrepareKeyFrame");
        this.m_mediaCodec.signalEndOfInputStream();
        int i = 30;
        while (!this.mEndOfStream) {
            int drainOutputBuffer = drainOutputBuffer(10000L);
            if (drainOutputBuffer != 0) {
                Q7K.LJ("forceToPrepareKeyFrame failed ret: ", drainOutputBuffer, "TEAvcEncoder");
                return drainOutputBuffer;
            }
            if (this.mBufferIndex >= 0 || i - 1 <= 0) {
                break;
            }
        }
        restartEncoder();
        return 0;
    }

    public static void initializeHookImageCopy() {
        if (kInitialized.booleanValue()) {
            return;
        }
        synchronized (kInitSyncObj) {
            if (kInitialized.booleanValue()) {
                return;
            }
            kInitialized = Boolean.TRUE;
            try {
                if (VEConfigCenter.getInstance().getValue("veabtest_hook_image_copy", false).booleanValue() && shouldHookImageCopy()) {
                    TEUtils.nativeHookImageCopy();
                }
            } catch (Throwable th) {
                P4Q.LIZLLL("TEAvcEncoder", "Hook image copy failed", th);
            }
        }
    }

    private int mediaCodecStart() {
        if (this.mUseForRecorder || !C65429Pm5.LJFF("veabtest_hook_image_copy", false) || !shouldHookImageCopy()) {
            this.m_mediaCodec.start();
        } else {
            try {
                TEUtils.nativeSetEncodeThreadId(TEUtils.nativeGetPThreadId());
                if (!TEUtils.nativeTryExecute(new ARunnableS47S0100000_11(this, 38))) {
                    P4Q.LIZJ("TEAvcEncoder", "MediaCodec.start() failed!");
                    TEUtils.nativeSetEncodeThreadId(-1L);
                    return -4;
                }
            } finally {
            }
        }
        return 0;
    }

    private void setBFrames() {
        String value;
        JSONObject jSONObject;
        if (this.m_codecFormat == null || Build.VERSION.SDK_INT < 29 || (value = VEConfigCenter.getInstance().getValue("ve_encoder_b_frame", "")) == null || value.isEmpty()) {
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(value);
            if (this.mUseForRecorder) {
                jSONObject = JSONObjectProtectorUtils.getJSONObject(jSONObject2, "recorder");
            } else if (this.m_pageMode == 1) {
                jSONObject = JSONObjectProtectorUtils.getJSONObject(jSONObject2, "crop");
            } else {
                jSONObject = JSONObjectProtectorUtils.getJSONObject(jSONObject2, "common");
            }
            int i = JSONObjectProtectorUtils.getInt(jSONObject, "count");
            if (i <= 0) {
                return;
            }
            this.m_codecFormat.setInteger("max-bframes", i);
        } catch (JSONException e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setBFrames json str parse error : ");
            LIZ.append(e.getLocalizedMessage());
            P4Q.LJII("TEAvcEncoder", P4Q.LJ("TEAvcEncoder", X1D.LIZIZ(LIZ), new P4P[0]));
        }
    }

    public static boolean shouldHookImageCopy() {
        if (Build.VERSION.SDK_INT != 31 || Build.SOC_MODEL.compareToIgnoreCase("SM7325") != 0) {
            return false;
        }
        return true;
    }

    private void startupRecordMonitor() {
        int value;
        if (!this.mUseForRecorder || (value = VEConfigCenter.getInstance().getValue("ve_hwencode_detect_duration", 0)) == 0) {
            return;
        }
        if (this.mHandler == null) {
            this.mHandler = new Handler(C16880lQ.LLJJJJ());
        }
        this.mHandler.postDelayed(new ARunnableS47S0100000_11(this, 39), value);
    }

    private int videoSmartCodecInit() {
        if (this.mSmartCodec == null) {
            P4T p4t = new P4T();
            this.mSmartCodec = p4t;
            int i = this.m_width_align;
            int i2 = this.m_height_align;
            if (!p4t.InitSmartCodec(i, i2, i, i2, this.m_frameRate, this.m_bitRate, SmartCodec.Preset.MEDIUM, SmartCodec.InputMode.SURFACE_RGBA, (String) ListProtector.get(mSmartCodecPathList, 0), (String) ListProtector.get(mSmartCodecPathList, 1), this.isOesTexture, mJsonSettings)) {
                P4Q.LIZJ("TEAvcEncoder", "smartEncoder initSmartCodec failed");
                mSmartCodecPathList.clear();
                this.mSmartCodec.ReleaseSmartCodec();
                this.mSmartCodec = null;
                return -116;
            }
        }
        this.mSmartCodecInitNum++;
        return 0;
    }

    public byte[] getExtraData() {
        byte[] bArr = this.configByte;
        if (bArr != null) {
            return bArr;
        }
        return new byte[0];
    }

    public ByteBuffer getFrameCacheBuf() {
        if (this.mByteBuf == null) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.m_width * this.m_height * 4);
            this.mByteBuf = allocateDirect;
            allocateDirect.order(ByteOrder.nativeOrder());
        }
        this.mByteBuf.position(0);
        return this.mByteBuf;
    }

    public boolean initTextureDrawer() {
        P4N p4n = null;
        P4D p4d = null;
        if (this.m_bEncodeOESTexture) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("initTextureDrawer m_bEncodeOESTexture = ");
            LIZ.append(this.m_bEncodeOESTexture);
            P4Q.LJFF("TEAvcEncoder", X1D.LIZIZ(LIZ));
            P4D p4d2 = new P4D();
            p4d2.LIZJ = P4D.LIZ(P4D.LJII);
            p4d2.LIZLLL = P4D.LIZ(P4D.LJIIIIZZ);
            P4C p4c = new P4C();
            p4d2.LIZ = p4c;
            if (!p4c.LIZIZ("attribute vec4 aPosition;\nattribute vec2 aTextureCoord;\nuniform mat4 uMVPMatrix;\nvarying vec2 vTextureCoord;\nvoid main()\n{\n   gl_Position = uMVPMatrix * aPosition;\n   vTextureCoord = aTextureCoord;\n}", "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nuniform samplerExternalOES uTextureSampler;\nvarying vec2 vTextureCoord;\nvoid main() \n{\n  gl_FragColor = texture2D(uTextureSampler, vTextureCoord);\n}")) {
                P4C p4c2 = p4d2.LIZ;
                int i = p4c2.LIZ;
                if (i != 0) {
                    GLES20.glDeleteProgram(i);
                    p4c2.LIZ = 0;
                }
                p4d2.LIZ = null;
                P4Q.LIZJ("TETextureOESDrawer", "TETextureOESDrawer create failed!");
                p4d2.LIZJ();
            } else {
                p4d2.LIZ.LIZ();
                p4d2.LJ = GLES20.glGetUniformLocation(p4d2.LIZ.LIZ, "uMVPMatrix");
                int[] iArr = new int[2];
                p4d2.LIZIZ = iArr;
                GLES20.glGenBuffers(2, iArr, 0);
                GLES20.glBindAttribLocation(p4d2.LIZ.LIZ, 0, "aPosition");
                GLES20.glBindBuffer(34962, p4d2.LIZIZ[0]);
                p4d2.LIZJ.position(0);
                GLES20.glBufferData(34962, 32, p4d2.LIZJ, 35044);
                GLES20.glBindAttribLocation(p4d2.LIZ.LIZ, 1, "aTextureCoord");
                GLES20.glBindBuffer(34962, p4d2.LIZIZ[1]);
                p4d2.LIZLLL.position(0);
                GLES20.glBufferData(34962, 32, p4d2.LIZLLL, 35048);
                p4d2.LIZLLL(0, 0, 0, 0, 0, false);
                P4Q.LJFF("TETextureOESDrawer", "init: success.");
                p4d = p4d2;
            }
            this.m_textureOESDrawer = p4d;
            if (p4d != null) {
                return true;
            }
            P4Q.LIZJ("TEAvcEncoder", "NULL OES texture drawer!");
            return false;
        }
        P4N p4n2 = this.m_textureDrawer;
        if (p4n2 != null) {
            p4n2.LIZIZ();
            this.m_textureDrawer = null;
        }
        P4N p4n3 = new P4N();
        P4C p4c3 = new P4C();
        p4n3.LIZ = p4c3;
        if (!p4c3.LIZIZ("attribute vec2 vPosition;\nvarying vec2 texCoord;\nuniform mat2 rotation;\nuniform vec2 flipScale;\nvoid main()\n{\n   gl_Position = vec4(vPosition, 0.0, 1.0);\n   texCoord = flipScale * (vPosition / 2.0 * rotation) + 0.5;\n}", "precision mediump float;\nvarying vec2 texCoord;\nuniform sampler2D inputImageTexture;\nvoid main()\n{\n   gl_FragColor = texture2D(inputImageTexture, texCoord);\n}")) {
            P4C p4c4 = p4n3.LIZ;
            int i2 = p4c4.LIZ;
            if (i2 != 0) {
                GLES20.glDeleteProgram(i2);
                p4c4.LIZ = 0;
            }
            p4n3.LIZ = null;
            P4Q.LIZJ("TETextureDrawer", "TETextureDrawer create failed!");
            p4n3.LIZIZ();
        } else {
            p4n3.LIZ.LIZ();
            p4n3.LIZJ = GLES20.glGetUniformLocation(p4n3.LIZ.LIZ, "rotation");
            p4n3.LIZLLL = GLES20.glGetUniformLocation(p4n3.LIZ.LIZ, "flipScale");
            GLES20.glBindAttribLocation(p4n3.LIZ.LIZ, 0, "vPosition");
            int[] iArr2 = new int[1];
            GLES20.glGenBuffers(1, iArr2, 0);
            int i3 = iArr2[0];
            p4n3.LIZIZ = i3;
            GLES20.glBindBuffer(34962, i3);
            FloatBuffer LJI = i0.LJI(ByteBuffer.allocateDirect(32));
            LJI.put(P4N.LJ);
            LJI.position(0);
            GLES20.glBufferData(34962, 32, LJI, 35044);
            p4n3.LIZJ();
            p4n3.LIZ.LIZ();
            GLES20.glUniform2f(p4n3.LIZLLL, 1.0f, 1.0f);
            P4Q.LJFF("TETextureDrawer", "init: success.");
            p4n = p4n3;
        }
        this.m_textureDrawer = p4n;
        if (p4n == null) {
            P4Q.LIZJ("TEAvcEncoder", "NULL texture drawer!");
            return false;
        }
        p4n.LIZJ();
        P4N p4n4 = this.m_textureDrawer;
        p4n4.LIZ.LIZ();
        GLES20.glUniform2f(p4n4.LIZLLL, 1.0f, -1.0f);
        return true;
    }

    public void releaseEncoder() {
        long j;
        boolean z;
        EGLSurface eGLSurface;
        if (this.configByte == null) {
            j = 1;
        } else {
            j = 0;
        }
        C63868P4u.LJ(0, j, "te_record_is_stop_before_extra_data");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TE_RECORD_IS_STOP_BEFORE_EXTRA_DATA: ");
        if (this.configByte == null) {
            z = true;
        } else {
            z = false;
        }
        LIZ.append(z);
        P4Q.LJFF("TEAvcEncoder", X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("HW_ENCODE AVCQueue = ");
        LIZ2.append(this.AVCQueue.size());
        LIZ2.append(", mPicSendCount = ");
        LIZ2.append(this.mPicSendCount);
        LIZ2.append(", mPicBufferCount = ");
        LIZ2.append(this.mPicBufferCount);
        LIZ2.append(", mPicEncodeCount = ");
        LIZ2.append(this.mPicEncodeCount);
        P4Q.LJFF("TEAvcEncoder", X1D.LIZIZ(LIZ2));
        P4Q.LIZ("TEAvcEncoder", "HW_ENCODE releaseEncoder");
        stopEncoder();
        reportEncInfo();
        P4Q.LJFF("TEAvcEncoder", "releaseEncoder");
        if (this.mSmartCodec != null) {
            P4Q.LIZJ("TEAvcEncoder", "release SmartCodec");
            this.mSmartCodec.ReleaseSmartCodec();
            this.mSmartCodec = null;
        }
        TESharedContext tESharedContext = this.m_sharedContext;
        if (tESharedContext != null) {
            if (!this.m_bEncoderGLContextReuse) {
                tESharedContext.LJ();
            } else {
                EGLDisplay eGLDisplay = tESharedContext.LIZJ;
                if (eGLDisplay != null && (eGLSurface = tESharedContext.LIZLLL) != null) {
                    EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
                }
            }
            this.m_sharedContext = null;
        }
        if (this.m_surface != null) {
            P4Q.LIZ("TEAvcEncoder", "release surface");
            if (VEConfigCenter.getInstance().getValue("veabtest_mediacodec_fix_powervr", false).booleanValue()) {
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                GLES20.glBindFramebuffer(36160, 0);
            }
            this.m_surface.release();
            this.m_surface = null;
        }
        if (this.m_mediaCodec != null) {
            P4Q.LIZ("TEAvcEncoder", "release mediaCodec");
            this.m_mediaCodec.release();
            this.m_mediaCodec = null;
            if (C65429Pm5.LJFF("ve_mediacodec_resource_reasonable_distribute", false)) {
                TEMediaCodecResourceManager.freeCodecBlocksSize(this.m_width_align * this.m_height_align * this.m_frameRate, hashCode());
                TEMediaCodecResourceManager.sExistHWEncoder = false;
            }
        }
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.mHandler = null;
        }
    }

    public void releaseTextureDrawer() {
        if (this.m_bEncodeOESTexture) {
            P4D p4d = this.m_textureOESDrawer;
            if (p4d != null) {
                p4d.LIZJ();
                this.m_textureOESDrawer = null;
                return;
            }
            return;
        }
        P4N p4n = this.m_textureDrawer;
        if (p4n == null) {
            return;
        }
        p4n.LIZIZ();
        this.m_textureDrawer = null;
    }

    public int restartEncoder() {
        P4Q.LJFF("TEAvcEncoder", "HW_ENCODE restartEncoder...");
        this.m_bNeedSingalEnd = false;
        stopEncoder();
        int configEncode = configEncode();
        if (configEncode < 0) {
            if (C65429Pm5.LJFF("ve_mediacodec_resource_reasonable_distribute", false)) {
                TEMediaCodecResourceManager.freeCodecBlocksSize(this.m_width_align * this.m_height_align * this.m_frameRate, hashCode());
            }
            return configEncode;
        }
        return startEncoder();
    }

    public void setSharedEGLContext() {
        if (this.m_eglStateSaver == null) {
            P4I p4i = new P4I();
            this.m_eglStateSaver = p4i;
            p4i.LIZIZ();
        }
    }

    public int startEncoder() {
        int i;
        P4Q.LJFF("TEAvcEncoder", "startEncoder...");
        try {
            if (this.m_useInputSurface) {
                boolean z = this.m_useHDR10Bit;
                if (z) {
                    i = 4;
                } else {
                    i = 12610;
                }
                if (this.m_bEncoderGLContextReuse) {
                    if (this.m_eglStateSaver == null) {
                        P4I p4i = new P4I();
                        this.m_eglStateSaver = p4i;
                        p4i.LIZIZ();
                    }
                    if (this.m_sharedContext == null) {
                        P4I p4i2 = this.m_eglStateSaver;
                        this.m_sharedContext = TESharedContext.LIZJ(p4i2.LIZ, p4i2.LIZLLL, i);
                    }
                    if (!this.m_sharedContext.LJFF(12610, this.m_surface) && this.mUseForRecorder) {
                        P4Q.LIZJ("TEAvcEncoder", "updateSurface failed!");
                        return -2;
                    }
                } else {
                    TESharedContext tESharedContext = this.m_sharedContext;
                    if (tESharedContext == null) {
                        TESharedContext LIZIZ = TESharedContext.LIZIZ(this.m_eglStateSaver.LIZ, i, this.m_surface, z);
                        this.m_sharedContext = LIZIZ;
                        if (LIZIZ == null) {
                            P4Q.LIZJ("TEAvcEncoder", "create shared context failed!");
                            return -2;
                        }
                    } else if (!tESharedContext.LJFF(i, this.m_surface)) {
                        P4Q.LIZJ("TEAvcEncoder", "updateSurface failed!");
                        return -2;
                    }
                }
                if (!initTextureDrawer()) {
                    return -3;
                }
            }
            int mediaCodecStart = mediaCodecStart();
            if (mediaCodecStart != 0) {
                return mediaCodecStart;
            }
            this.m_encodeStartTime = System.nanoTime();
            this.m_isNeedReconfigure = false;
            this.mEndOfStream = false;
            return 0;
        } catch (Throwable th) {
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("startEncoder, ERROR_OCCUR_EXCEPTION Exception ");
            LIZ.append(stringWriter);
            String LJ = P4Q.LJ("TEAvcEncoder", X1D.LIZIZ(LIZ), new P4P[0]);
            P4Q.LJII("TEAvcEncoder", LJ);
            reportErrorInfo("startEncoder", LJ);
            return -1;
        }
    }

    public Surface getInputSurface() {
        return this.m_surface;
    }

    private int drainOutputBuffer(long j) {
        int i;
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        P4Q.LIZ("TEAvcEncoder", "drainOutputBuffer before dequeueOutputBuffer");
        this.mBufferIndex = -1;
        try {
            int dequeueOutputBuffer = this.m_mediaCodec.dequeueOutputBuffer(bufferInfo, j);
            this.mBufferIndex = dequeueOutputBuffer;
            if (this.configByte == null && dequeueOutputBuffer == -1) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("configByte = null and mBufferIndex = MediaCodec.INFO_TRY_AGAIN_LATER, timeoutUs: ");
                LIZ.append(j);
                P4Q.LJII("TEAvcEncoder", X1D.LIZIZ(LIZ));
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("HW_ENCODE drainOutputBuffer mBufferIndex ");
            LIZ2.append(this.mBufferIndex);
            LIZ2.append(" buffer-flag= ");
            LIZ2.append(bufferInfo.flags);
            P4Q.LIZ("TEAvcEncoder", X1D.LIZIZ(LIZ2));
            while (true) {
                int i2 = this.mBufferIndex;
                if (i2 < 0) {
                    break;
                }
                int i3 = bufferInfo.size;
                byte[] bArr = new byte[i3];
                try {
                    ByteBuffer outputBufferByIdx = getOutputBufferByIdx(i2);
                    outputBufferByIdx.position(bufferInfo.offset);
                    outputBufferByIdx.limit(bufferInfo.offset + bufferInfo.size);
                    outputBufferByIdx.get(bArr);
                    int i4 = bufferInfo.flags;
                    if (i4 == 2) {
                        P4Q.LIZ("TEAvcEncoder", "HW_ENCODE drainOutputBuffer BUFFER_FLAG_CODEC_CONFIG");
                        this.configByte = bArr;
                    } else if (i4 == 1) {
                        P4Q.LIZ("TEAvcEncoder", "HW_ENCODE drainOutputBuffer data BUFFER_FLAG_KEY_FRAME");
                        byte[] bArr2 = this.configByte;
                        if (bArr2 != null && bArr2.length > 4 && i3 > bArr2.length + 4) {
                            if (bArr[4] == bArr2[4] && (bArr[bArr2.length + 4] & 31) == 5) {
                                int length = i3 - bArr2.length;
                                byte[] bArr3 = new byte[length];
                                System.arraycopy(bArr, bArr2.length, bArr3, 0, length);
                                bArr = bArr3;
                            }
                        } else {
                            P4Q.LIZJ("TEAvcEncoder", "I can't find configByte!!!! NEED extract from I frame!!!");
                        }
                        addOutputData(bArr, bufferInfo);
                        this.mPicEncodeCount++;
                    } else if (i4 == 4) {
                        P4Q.LJFF("TEAvcEncoder", "HW_ENCODE drainOutputBuffer BUFFER_FLAG_END_OF_STREAM");
                        if (this.result != null) {
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("resultAverageComplexity", this.result.averageComplexity);
                                jSONObject.put("resultMaxComplexity", this.result.maxComplexity);
                                jSONObject.put("resultMinComplexity", this.result.minComplexity);
                                jSONObject.put("resultVersion", this.result.version);
                            } catch (JSONException e) {
                                StringWriter stringWriter = new StringWriter();
                                e.printStackTrace(new PrintWriter(stringWriter));
                                StringBuilder LIZ3 = X1D.LIZ();
                                LIZ3.append("drainOutputBuffer VESDK_EVENT_EDITOR_COMPILE_FINISH report exception:");
                                LIZ3.append(stringWriter);
                                P4Q.LIZJ("TEAvcEncoder", P4Q.LJ("TEAvcEncoder", X1D.LIZIZ(LIZ3), new P4P[0]));
                            }
                            c.LIZ("vesdk_event_editor_compile_finish", "performance", jSONObject);
                        }
                        this.mEndOfStream = true;
                    } else {
                        P4Q.LIZ("TEAvcEncoder", "HW_ENCODE drainOutputBuffer data");
                        addOutputData(bArr, bufferInfo);
                        this.mPicEncodeCount++;
                    }
                    try {
                        this.m_mediaCodec.releaseOutputBuffer(this.mBufferIndex, false);
                        this.mBufferIndex = this.m_mediaCodec.dequeueOutputBuffer(bufferInfo, j);
                    } catch (Exception e2) {
                        StringWriter stringWriter2 = new StringWriter();
                        e2.printStackTrace(new PrintWriter(stringWriter2));
                        StringBuilder LIZ4 = X1D.LIZ();
                        LIZ4.append("releaseOutputBuffer exception:");
                        LIZ4.append(stringWriter2);
                        String LJ = P4Q.LJ("TEAvcEncoder", X1D.LIZIZ(LIZ4), new P4P[0]);
                        P4Q.LIZJ("TEAvcEncoder", LJ);
                        reportErrorInfo("releaseOutputBuffer", LJ);
                        return -214;
                    }
                } catch (Exception e3) {
                    StringWriter stringWriter3 = new StringWriter();
                    e3.printStackTrace(new PrintWriter(stringWriter3));
                    StringBuilder LIZ5 = X1D.LIZ();
                    LIZ5.append("getOutputBufferByIdx exception:");
                    LIZ5.append(stringWriter3);
                    String LJ2 = P4Q.LJ("TEAvcEncoder", X1D.LIZIZ(LIZ5), new P4P[0]);
                    P4Q.LIZJ("TEAvcEncoder", LJ2);
                    reportErrorInfo("getOutputBufferByIdx", LJ2);
                    return -214;
                }
            }
            if (this.mBufferIndex == -2) {
                P4Q.LIZ("TEAvcEncoder", "HW_ENCODE drainOutputBuffer INFO_OUTPUT_FORMAT_CHANGED");
                try {
                    MediaFormat outputFormat = this.m_mediaCodec.getOutputFormat();
                    ByteBuffer byteBuffer = outputFormat.getByteBuffer("csd-0");
                    ByteBuffer byteBuffer2 = outputFormat.getByteBuffer("csd-1");
                    if (byteBuffer != null) {
                        byte[] bArr4 = (byte[]) byteBuffer.array().clone();
                        this.sps = bArr4;
                        i = bArr4.length;
                    } else {
                        i = 0;
                    }
                    if (byteBuffer2 != null) {
                        byte[] bArr5 = (byte[]) byteBuffer2.array().clone();
                        this.pps = bArr5;
                        i += bArr5.length;
                    }
                    byte[] bArr6 = new byte[i];
                    this.configByte = bArr6;
                    if (byteBuffer != null) {
                        byte[] bArr7 = this.sps;
                        System.arraycopy(bArr7, 0, bArr6, 0, bArr7.length);
                    }
                    if (byteBuffer2 != null) {
                        byte[] bArr8 = this.pps;
                        System.arraycopy(bArr8, 0, this.configByte, this.sps.length, bArr8.length);
                    }
                } catch (IllegalStateException e4) {
                    StringWriter stringWriter4 = new StringWriter();
                    e4.printStackTrace(new PrintWriter(stringWriter4));
                    StringBuilder LIZ6 = X1D.LIZ();
                    LIZ6.append("getOutputFormat exception:");
                    LIZ6.append(stringWriter4);
                    String LJ3 = P4Q.LJ("TEAvcEncoder", X1D.LIZIZ(LIZ6), new P4P[0]);
                    P4Q.LIZJ("TEAvcEncoder", LJ3);
                    reportErrorInfo("getOutputFormat", LJ3);
                    return -214;
                }
            }
            return 0;
        } catch (Exception e5) {
            StringWriter stringWriter5 = new StringWriter();
            e5.printStackTrace(new PrintWriter(stringWriter5));
            StringBuilder LIZ7 = X1D.LIZ();
            LIZ7.append("dequeueOutputBuffer exception:");
            LIZ7.append(stringWriter5);
            String LJ4 = P4Q.LJ("TEAvcEncoder", X1D.LIZIZ(LIZ7), new P4P[0]);
            P4Q.LIZJ("TEAvcEncoder", LJ4);
            reportErrorInfo("drainOutputBuffer", LJ4);
            return -214;
        }
    }

    private ByteBuffer getInputBufferByIdx(int i) {
        return this.m_mediaCodec.getInputBuffer(i);
    }

    private ByteBuffer getOutputBufferByIdx(int i) {
        return this.m_mediaCodec.getOutputBuffer(i);
    }

    private int reconfigureMediaFormat(MediaCodecInfo mediaCodecInfo) {
        boolean LJFF;
        String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
        P4Q.LIZ("TEAvcEncoder", "CodecNames:");
        for (String str : supportedTypes) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Codec: ");
            LIZ.append(str);
            P4Q.LIZ("TEAvcEncoder", X1D.LIZIZ(LIZ));
        }
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat(this.m_mime_type, this.m_width_align, this.m_height_align);
        this.m_codecFormat = createVideoFormat;
        createVideoFormat.setInteger("color-format", this.m_colorFormat);
        this.m_codecFormat.setInteger("bitrate", this.m_bitRate);
        int i = this.m_frameRate;
        long j = MAX_PRODUCT_OF_SIZE_AND_FPS;
        if (j > 0) {
            long j2 = j / (this.m_width_align * this.m_height_align);
            if (i > j2) {
                i = (int) j2;
            }
        }
        this.m_codecFormat.setInteger("frame-rate", i);
        this.m_codecFormat.setInteger("i-frame-interval", this.m_iFrameInternal);
        this.mGOPSize = i * this.m_iFrameInternal;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(" m_colorspace ");
        LIZ2.append(this.m_colorspace);
        LIZ2.append(" m_bColorRangeFull ");
        LIZ2.append(this.m_bColorRangeFull);
        LIZ2.append(" m_colorTrc ");
        LIZ2.append(this.m_colorTrc);
        P4Q.LJII("TEAvcEncoder", X1D.LIZIZ(LIZ2));
        this.m_codecFormat.setInteger("color-standard", this.m_colorspace);
        this.m_codecFormat.setInteger("color-range", this.m_bColorRangeFull);
        this.m_codecFormat.setInteger("color-transfer", this.m_colorTrc);
        if (this.mEnableEncodeBt601 && this.m_useInputSurface && (LJFF = C65429Pm5.LJFF("ve_encode_color_space_bt601", true))) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("enableEncodeColorSpace601: ");
            LIZ3.append(LJFF);
            P4Q.LJFF("TEAvcEncoder", X1D.LIZIZ(LIZ3));
            this.m_codecFormat.setInteger("color-standard", 2);
            this.m_codecFormat.setInteger("color-range", 2);
            this.m_codecFormat.setInteger("color-transfer", 3);
        }
        setProfile(mediaCodecInfo.getCapabilitiesForType(this.m_mime_type));
        setCacMode(mediaCodecInfo);
        setQpParameters(mediaCodecInfo);
        setBFrames();
        this.mEncFrameCount = 0L;
        P4Q.LJFF("TEAvcEncoder", C16880lQ.LLLZ("RequestSyncFrame width:[%d] height:[%d] frameRate:[%d] iFrameInternal:[%d] bitRate:[%d] colorFormat:[%d] codec_type:[%d] gop_size: [%d]", new Object[]{Integer.valueOf(this.m_width_align), Integer.valueOf(this.m_height_align), Integer.valueOf(this.m_frameRate), Integer.valueOf(this.m_iFrameInternal), Integer.valueOf(this.m_bitRate), Integer.valueOf(this.m_colorFormat), Integer.valueOf(this.m_codec_type), Long.valueOf(this.mGOPSize)}));
        return 0;
    }

    private void setBitRateMode(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        String[] strArr = {"BITRATE_MODE_CQ", "BITRATE_MODE_VBR", "BITRATE_MODE_CBR"};
        MediaCodecInfo.EncoderCapabilities encoderCapabilities = codecCapabilities.getEncoderCapabilities();
        int i = 0;
        do {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(strArr[i]);
            LIZ.append(": ");
            LIZ.append(encoderCapabilities.isBitrateModeSupported(i));
            P4Q.LIZ("TEAvcEncoder", X1D.LIZIZ(LIZ));
            i++;
        } while (i < 3);
        this.m_codecFormat.setInteger("bitrate-mode", 1);
    }

    private void setByteVC110BitHWDecoderFlag(boolean z) {
        this.m_bByteVC110BitHWDecoder = z;
    }

    private void setCacMode(MediaCodecInfo mediaCodecInfo) {
        if (Build.VERSION.SDK_INT >= 29) {
            String lowerCase = mediaCodecInfo.getName().toLowerCase();
            if (lowerCase.contains(".qcom.") || lowerCase.contains(".qti.")) {
                int value = VEConfigCenter.getInstance().getValue("ve_content_adaptive_coding_mode", -1);
                Q4K.LJ("set cac value = ", value, "TEAvcEncoder");
                if (value >= 0) {
                    this.m_codecFormat.setInteger("vendor.qti-ext-enc-content-adaptive-mode.value", value);
                }
            }
        }
    }

    public static void setEncodeParams(P4V p4v) {
        X1D.LIZ().append("setEncodeParams ");
        throw null;
    }

    public static void setEncodeResolutionAlign(int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            ENCODE_RESOLUTION_ALIGN = i;
        }
    }

    private void setMediaCodecDecInstance(Object obj) {
        TEMediaCodecDecoder tEMediaCodecDecoder = (TEMediaCodecDecoder) obj;
        this.m_MediaCodecDecInstance = tEMediaCodecDecoder;
        if (tEMediaCodecDecoder == null) {
            P4Q.LIZJ("TEAvcEncoder", "m_MediaCodecDecInstance is null");
        }
    }

    private void setProcessFlag(int i) {
        boolean z = true;
        if ((i & 1) == 0) {
            z = false;
        }
        this.m_bEncodeOESTexture = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0189 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[LOOP:1: B:58:0x00a1->B:90:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void setProfile(android.media.MediaCodecInfo.CodecCapabilities r23) {
        /*
            Method dump skipped, instructions count: 940
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttve.mediacodec.TEAvcEncoder.setProfile(android.media.MediaCodecInfo$CodecCapabilities):void");
    }

    private void setQpParameters(MediaCodecInfo mediaCodecInfo) {
        String value;
        boolean z;
        boolean z2;
        if (this.m_codecFormat != null) {
            String lowerCase = mediaCodecInfo.getName().toLowerCase();
            if (!this.mUseForRecorder || (value = VEConfigCenter.getInstance().getValue("ve_encoder_qp_range_for_recorder", "")) == null || value.isEmpty()) {
                value = VEConfigCenter.getInstance().getValue("ve_encoder_qp_range", "");
            }
            String value2 = VEConfigCenter.getInstance().getValue("ve_encoder_initial_qp", "");
            if (value != null && !value.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (value2 != null && !value2.isEmpty()) {
                z2 = true;
            } else {
                z2 = false;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setQpParameters codecName:");
            LIZ.append(lowerCase);
            LIZ.append(", hasQpRangeJson:");
            LIZ.append(z);
            LIZ.append(", hasInitialQpJson:");
            LIZ.append(z2);
            LIZ.append(", useForRecorder:");
            LIZ.append(this.mUseForRecorder);
            P4Q.LIZ("TEAvcEncoder", X1D.LIZIZ(LIZ));
            if (z) {
                try {
                    JSONObject jSONObject = new JSONObject(value);
                    if (lowerCase.contains(".qcom.") || lowerCase.contains(".qti.")) {
                        setQpRange(JSONObjectProtectorUtils.getJSONObject(jSONObject, "qcom"), "qcom");
                    } else if (lowerCase.contains(".exynos.") || lowerCase.contains(".sec.")) {
                        setQpRange(JSONObjectProtectorUtils.getJSONObject(jSONObject, "exynos"), "exynos");
                    } else if (lowerCase.contains(".mtk.")) {
                        setQpRange(JSONObjectProtectorUtils.getJSONObject(jSONObject, "mtk"), "mtk");
                    } else if (lowerCase.contains(".hisi.")) {
                        setQpRange(JSONObjectProtectorUtils.getJSONObject(jSONObject, "hisi"), "hisi");
                    } else {
                        setQpRange(JSONObjectProtectorUtils.getJSONObject(jSONObject, "others"), "others");
                    }
                } catch (JSONException e) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("setQpParameters, qp range json str parse error : ");
                    LIZ2.append(e.getLocalizedMessage());
                    P4Q.LJII("TEAvcEncoder", P4Q.LJ("TEAvcEncoder", X1D.LIZIZ(LIZ2), new P4P[0]));
                }
            }
            if (z2) {
                try {
                    JSONObject jSONObject2 = new JSONObject(value2);
                    if (lowerCase.contains(".qcom.") || lowerCase.contains(".qti.")) {
                        JSONObject jSONObject3 = JSONObjectProtectorUtils.getJSONObject(jSONObject2, "qcom");
                        int i = JSONObjectProtectorUtils.getInt(jSONObject3, "i");
                        int i2 = JSONObjectProtectorUtils.getInt(jSONObject3, "p");
                        int i3 = JSONObjectProtectorUtils.getInt(jSONObject3, "b");
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("parse initial QP, I:");
                        LIZ3.append(i);
                        LIZ3.append(" P:");
                        LIZ3.append(i2);
                        LIZ3.append(" B:");
                        LIZ3.append(i3);
                        P4Q.LIZ("TEAvcEncoder", X1D.LIZIZ(LIZ3));
                        if (i >= 1 && i <= 51) {
                            this.m_codecFormat.setInteger("vendor.qti-ext-enc-initial-qp.qp-i-enable", 1);
                            this.m_codecFormat.setInteger("vendor.qti-ext-enc-initial-qp.qp-i", i);
                        }
                        if (i2 >= 1 && i2 <= 51) {
                            this.m_codecFormat.setInteger("vendor.qti-ext-enc-initial-qp.qp-p-enable", 1);
                            this.m_codecFormat.setInteger("vendor.qti-ext-enc-initial-qp.qp-p", i2);
                        }
                        if (i3 >= 1 && i3 <= 51) {
                            this.m_codecFormat.setInteger("vendor.qti-ext-enc-initial-qp.qp-b-enable", 1);
                            this.m_codecFormat.setInteger("vendor.qti-ext-enc-initial-qp.qp-b", i3);
                        }
                    }
                } catch (JSONException e2) {
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("setQpParameters, initial qp json str parse error : ");
                    LIZ4.append(e2.getLocalizedMessage());
                    P4Q.LJII("TEAvcEncoder", P4Q.LJ("TEAvcEncoder", X1D.LIZIZ(LIZ4), new P4P[0]));
                }
            }
        }
    }

    public static void setSmartCodecPath(List<String> list) {
        mSmartCodecPathList.clear();
        if (list != null && !list.isEmpty()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("smartEncoder != null path1:");
            LIZ.append((String) ListProtector.get(list, 0));
            LIZ.append(" path2:");
            LIZ.append((String) ListProtector.get(list, 1));
            P4Q.LJFF("TEAvcEncoder", X1D.LIZIZ(LIZ));
            mSmartCodecPathList.addAll(list);
        }
    }

    public void enableEncodeBt601(boolean z) {
        this.mEnableEncodeBt601 = z;
    }

    public void enableOperatingRate(boolean z) {
        this.mEnableOperatingRate = z;
    }

    public void enableSmartEncoder(boolean z) {
        this.mEnableSmartEncoder = z;
    }

    public byte[] getCodecData(int i) {
        P4O p4o = this.m_lastCodecData;
        if (p4o != null) {
            return p4o.LIZ;
        }
        return null;
    }

    public void setUseForRecorder(boolean z) {
        this.mUseForRecorder = z;
    }

    private void addOutputData(byte[] bArr, MediaCodec.BufferInfo bufferInfo) {
        long j;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("encode: pts queue size = ");
        LIZ.append(this.m_PTSQueue.size());
        LIZ.append(" avc sdata size= ");
        LIZ.append(this.AVCQueue.size());
        P4Q.LIZ("TEAvcEncoder", X1D.LIZIZ(LIZ));
        if (this.m_PTSQueue.size() <= 0 && this.m_profile >= 8) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("encode: no available pts!!! profile ");
            LIZ2.append(this.m_profile);
            P4Q.LJII("TEAvcEncoder", X1D.LIZIZ(LIZ2));
            return;
        }
        if (this.m_PTSQueue.size() <= 0) {
            P4Q.LJII("TEAvcEncoder", "encode: no available pts!!!");
            return;
        }
        P4O p4o = new P4O();
        long j2 = bufferInfo.presentationTimeUs;
        if (j2 <= 0) {
            j2 = 0;
        }
        if (C65429Pm5.LJFF("ve_enable_opt_hwencode_dts", false)) {
            if (j2 == this.m_PTSQueue.poll().longValue()) {
                j = j2;
            } else {
                j = (long) Math.ceil(((float) (Math.min(r0, j2) + this.m_lastDts)) / 2.0f);
                if (!this.m_bPrintExistBFrame) {
                    StringBuilder LIZJ = V10.LIZJ("exist B frame, pts = ", j2, ", dts = ");
                    LIZJ.append(j);
                    P4Q.LJFF("TEAvcEncoder", X1D.LIZIZ(LIZJ));
                    this.m_bPrintExistBFrame = true;
                }
            }
            this.m_lastDts = j;
        } else {
            long longValue = this.m_PTSQueue.poll().longValue();
            if (this.isSupportBFrame) {
                j = longValue - 200000;
            } else {
                j = j2;
            }
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("isSupportBFrame:");
        LIZ3.append(this.isSupportBFrame);
        LIZ3.append(", dts = ");
        LIZ3.append(j);
        C0MT.LIZLLL(LIZ3, ", pts = ", j2, " add codecdata-encode AVCQueue-size= ");
        LIZ3.append(this.AVCQueue.size());
        P4Q.LIZ("TEAvcEncoder", X1D.LIZIZ(LIZ3));
        p4o.LIZ = bArr;
        p4o.LIZIZ = j2;
        p4o.LIZJ = j;
        try {
            this.AVCQueue.add(p4o);
        } catch (Exception e) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("Add data to AVCQueue FAILED! Packet lost! ");
            LIZ4.append(e.getLocalizedMessage());
            P4Q.LIZJ("TEAvcEncoder", X1D.LIZIZ(LIZ4));
        }
    }

    private void reportErrorInfo(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("errFunction", str);
            jSONObject.put("errMessage", str2);
            jSONObject.put("useForRecorder", String.valueOf(this.mUseForRecorder));
            c.LIZ("vesdk_event_hwencode_error", "behavior", jSONObject);
        } catch (JSONException e) {
            StringWriter stringWriter = new StringWriter();
            e.printStackTrace(new PrintWriter(stringWriter));
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            LIZ.append(", ");
            LIZ.append(str2);
            LIZ.append(", Exception ");
            LIZ.append(stringWriter);
            P4Q.LJII("TEAvcEncoder", P4Q.LJ("TEAvcEncoder", X1D.LIZIZ(LIZ), new P4P[0]));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void setQpRange(org.json.JSONObject r23, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 795
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttve.mediacodec.TEAvcEncoder.setQpRange(org.json.JSONObject, java.lang.String):void");
    }

    public static void setSmartCodecPath(List<String> list, float f) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("smartEncoder set path and vmaf, vmaf: f%");
        LIZ.append(f);
        P4Q.LJFF("TEAvcEncoder", X1D.LIZIZ(LIZ));
        mSmartCodecPathList.clear();
        if (list != null && !list.isEmpty()) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("smartEncoder != null path1:");
            LIZ2.append((String) ListProtector.get(list, 0));
            LIZ2.append(" path2:");
            LIZ2.append((String) ListProtector.get(list, 1));
            P4Q.LJFF("TEAvcEncoder", X1D.LIZIZ(LIZ2));
            mSmartCodecPathList.addAll(list);
        }
        mVmaf = f;
    }

    private int videoSmartCodecProcess(long j, int i) {
        if (this.mSmartCodec != null) {
            float[] fArr = {1.0f};
            float f = new MediaCodec.BufferInfo().size;
            this.mEncodedFrameSizeSum = f;
            int i2 = (int) (this.mEncodedFrameSize + f);
            this.mEncodedFrameSize = i2;
            if (this.mSmartCodec.SmartCodecProcess(i, this.m_width_align, this.m_height_align, fArr, (float) (j * 1.0E-6d), f, i2) < 0) {
                P4Q.LIZJ("TEAvcEncoder", "smartEncoder SmartCodecProcess failed");
                mSmartCodecPathList.clear();
                this.mSmartCodec.ReleaseSmartCodec();
                this.mSmartCodec = null;
                return -117;
            }
            P4U p4u = (P4U) this.mSmartCodec.GetSmartCodecGLOutput(this.result);
            this.result = p4u;
            this.mSmartBitrate = p4u.bitrate;
            this.mNeedIFrame = p4u.needIFrame;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("smartEncoder smartBitrate: ");
        LIZ.append(this.mSmartBitrate);
        LIZ.append(", needIFrame: ");
        LIZ.append(this.mNeedIFrame);
        P4Q.LIZ("TEAvcEncoder", X1D.LIZIZ(LIZ));
        return 0;
    }

    public int getInfoByFlag(long[] jArr, int i) {
        if (i == 1) {
            P4O p4o = this.m_lastCodecData;
            jArr[0] = p4o.LIZIZ;
            jArr[1] = p4o.LIZJ;
            return 4;
        }
        return -1;
    }

    public static Bitmap convertTexToBitmap(int i, int i2, int i3) {
        ByteBuffer readTextureToByteBuffer = readTextureToByteBuffer(i, i2, i3);
        Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        createBitmap.copyPixelsFromBuffer(readTextureToByteBuffer);
        return createBitmap;
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

    public int encodeVideoFromBuffer(int i, long j, boolean z, boolean z2) {
        int i2;
        int i3 = 0;
        if (!this.m_bSuccessInit) {
            return 0;
        }
        if (this.m_mediaCodec == null) {
            return -211;
        }
        StringBuilder LJI = JBR.LJI("HW_ENCODE encodeVideoFromBuffer start isSignalEndStream = ", z, ", mEndOfStream = ");
        LJI.append(this.mEndOfStream);
        LJI.append(", size= ");
        LJI.append(i);
        P4Q.LIZ("TEAvcEncoder", X1D.LIZIZ(LJI));
        this.m_PTSQueue.offer(Long.valueOf(j));
        if (this.m_isNeedReconfigure || (this.m_configStatus & 4) != 0) {
            if (this.m_mediaCodec != null && this.m_configStatus == 1) {
                Bundle bundle = new Bundle();
                bundle.putInt("video-bitrate", this.m_bitRate);
                this.m_mediaCodec.setParameters(bundle);
                this.m_configStatus = 0;
            } else {
                restartEncoder();
            }
            this.m_isNeedReconfigure = false;
        }
        if (z2 && (VERuntime.getInstance().isTransitionKeyFrameEnable() || VERuntime.getInstance().getTransitionKeyFrameVersion() > -1)) {
            Bundle LIZ = C141415gn.LIZ("request-sync", 0);
            LIZ.putInt("video-bitrate", (int) (this.m_bitRate * this.m_TransitionKeyframeRatio));
            this.m_mediaCodec.setParameters(LIZ);
        }
        if (this.m_encodeStartTime == -1) {
            this.m_encodeStartTime = System.nanoTime();
        }
        int drainOutputBuffer = drainOutputBuffer(0L);
        if (drainOutputBuffer != 0) {
            return drainOutputBuffer;
        }
        if (!z) {
            P4Q.LIZ("TEAvcEncoder", "HW_ENCODE encodeYUV420");
            int encodeYUV420 = encodeYUV420(this.mByteBuf.array(), this.mByteBuf.arrayOffset(), i, j);
            if (encodeYUV420 != 0) {
                return encodeYUV420;
            }
        } else {
            if (this.AVCQueue.isEmpty()) {
                i2 = 300;
            } else {
                i2 = 30;
            }
            while (!this.mEndOfStream) {
                P4Q.LJFF("TEAvcEncoder", "HW_ENCODE signal flush() from buffer");
                try {
                    this.m_mediaCodec.queueInputBuffer(this.m_mediaCodec.dequeueInputBuffer(10000L), 0, 0, 0L, 4);
                    int drainOutputBuffer2 = drainOutputBuffer(10000L);
                    if (drainOutputBuffer2 != 0) {
                        return drainOutputBuffer2;
                    }
                    if (this.mBufferIndex >= 0 || i2 - 1 <= 0) {
                        break;
                    }
                } catch (Exception e) {
                    StringWriter stringWriter = new StringWriter();
                    e.printStackTrace(new PrintWriter(stringWriter));
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("encodeVideoFromBuffer, TER_MEDIA_CODEC_SIG_END_EXCEPTION, Exception ");
                    LIZ2.append(stringWriter);
                    String LJ = P4Q.LJ("TEAvcEncoder", X1D.LIZIZ(LIZ2), new P4P[0]);
                    P4Q.LJII("TEAvcEncoder", LJ);
                    reportErrorInfo("encodeVideoFromBuffer", LJ);
                    return -213;
                }
            }
            if (!this.mEndOfStream && this.AVCQueue.isEmpty()) {
                P4Q.LIZJ("TEAvcEncoder", "encodeVideoFromBuffer - Timeout waiting for encoder finish!");
                return -211;
            }
        }
        P4O poll = this.AVCQueue.poll();
        this.m_lastCodecData = poll;
        if (poll != null) {
            i3 = poll.LIZ.length;
            this.mPicSendCount++;
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("HW_ENCODE AVCQueue = ");
        LIZ3.append(this.AVCQueue.size());
        LIZ3.append(", mPicSendCount = ");
        LIZ3.append(this.mPicSendCount);
        LIZ3.append(", mPicBufferCount = ");
        LIZ3.append(this.mPicBufferCount);
        LIZ3.append(", mPicEncodeCount = ");
        LIZ3.append(this.mPicEncodeCount);
        P4Q.LIZ("TEAvcEncoder", X1D.LIZIZ(LIZ3));
        return i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008f, code lost:
    
        if (r14.AVCQueue.size() >= 1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0091, code lost:
    
        r0 = 10000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0093, code lost:
    
        r0 = drainOutputBuffer(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0097, code lost:
    
        if (r0 == 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0099, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int encodeYUV420(byte[] r15, int r16, int r17, long r18) {
        /*
            r14 = this;
            r10 = r17
            long r0 = r14.mLastEncodeFramePTS
            java.lang.String r4 = "TEAvcEncoder"
            r9 = 0
            r11 = r18
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 != 0) goto L13
            java.lang.String r0 = "inputBuffer repeat"
            X.P4Q.LIZ(r4, r0)
            return r9
        L13:
            android.media.MediaCodec r2 = r14.m_mediaCodec     // Catch: java.lang.Exception -> L9c
            r0 = 0
            int r8 = r2.dequeueInputBuffer(r0)     // Catch: java.lang.Exception -> L9c
            r7 = 30
            r5 = 0
        L1e:
            r2 = 10000(0x2710, double:4.9407E-320)
            if (r8 >= 0) goto L48
            if (r7 <= 0) goto L88
            java.lang.StringBuilder r8 = X.X1D.LIZ()     // Catch: java.lang.Exception -> L9a
            java.lang.String r6 = "HW_ENCODE no inputBuffer maxCount = "
            r8.append(r6)     // Catch: java.lang.Exception -> L9a
            r8.append(r7)     // Catch: java.lang.Exception -> L9a
            java.lang.String r6 = X.X1D.LIZIZ(r8)     // Catch: java.lang.Exception -> L9a
            X.P4Q.LIZ(r4, r6)     // Catch: java.lang.Exception -> L9a
            int r5 = r14.drainOutputBuffer(r0)     // Catch: java.lang.Exception -> L9a
            if (r5 == 0) goto L3e
            goto L47
        L3e:
            android.media.MediaCodec r6 = r14.m_mediaCodec     // Catch: java.lang.Exception -> L9a
            int r8 = r6.dequeueInputBuffer(r2)     // Catch: java.lang.Exception -> L9a
            int r7 = r7 + (-1)
            goto L1e
        L47:
            return r5
        L48:
            java.nio.ByteBuffer r3 = r14.getInputBufferByIdx(r8)     // Catch: java.lang.Exception -> L9a
            r3.clear()     // Catch: java.lang.Exception -> L9a
            java.lang.StringBuilder r6 = X.X1D.LIZ()     // Catch: java.lang.Exception -> L9a
            java.lang.String r2 = "inputBuffer "
            r6.append(r2)     // Catch: java.lang.Exception -> L9a
            r6.append(r3)     // Catch: java.lang.Exception -> L9a
            java.lang.String r2 = ", inputBufferIndex = "
            r6.append(r2)     // Catch: java.lang.Exception -> L9a
            r6.append(r8)     // Catch: java.lang.Exception -> L9a
            java.lang.String r2 = X.X1D.LIZIZ(r6)     // Catch: java.lang.Exception -> L9a
            X.P4Q.LIZ(r4, r2)     // Catch: java.lang.Exception -> L9a
            int r2 = r3.capacity()     // Catch: java.lang.Exception -> L9a
            if (r10 <= r2) goto L74
            int r10 = r3.capacity()     // Catch: java.lang.Exception -> L9a
        L74:
            r2 = r16
            r3.put(r15, r2, r10)     // Catch: java.lang.Exception -> L9a
            android.media.MediaCodec r7 = r14.m_mediaCodec     // Catch: java.lang.Exception -> L9a
            r13 = r9
            r7.queueInputBuffer(r8, r9, r10, r11, r13)     // Catch: java.lang.Exception -> L9a
            r14.mLastEncodeFramePTS = r11     // Catch: java.lang.Exception -> L9a
            long r2 = r14.mPicBufferCount     // Catch: java.lang.Exception -> L9a
            r6 = 1
            long r2 = r2 + r6
            r14.mPicBufferCount = r2     // Catch: java.lang.Exception -> L9a
        L88:
            java.util.concurrent.LinkedBlockingQueue<X.P4O> r2 = r14.AVCQueue     // Catch: java.lang.Exception -> L9a
            int r3 = r2.size()     // Catch: java.lang.Exception -> L9a
            r2 = 1
            if (r3 >= r2) goto L93
            r0 = 10000(0x2710, double:4.9407E-320)
        L93:
            int r0 = r14.drainOutputBuffer(r0)     // Catch: java.lang.Exception -> L9a
            if (r0 == 0) goto Ld2
            return r0
        L9a:
            r1 = move-exception
            goto L9e
        L9c:
            r1 = move-exception
            r5 = 0
        L9e:
            java.io.StringWriter r2 = new java.io.StringWriter
            r2.<init>()
            java.io.PrintWriter r0 = new java.io.PrintWriter
            r0.<init>(r2)
            r1.printStackTrace(r0)
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "encodeYUV420, ret: "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = ", Exception "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            X.P4P[] r0 = new X.P4P[r9]
            java.lang.String r1 = X.P4Q.LJ(r4, r1, r0)
            X.P4Q.LJII(r4, r1)
            java.lang.String r0 = "encodeYUV420"
            r14.reportErrorInfo(r0, r1)
            r0 = 0
        Ld2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttve.mediacodec.TEAvcEncoder.encodeYUV420(byte[], int, int, long):int");
    }

    public void setOESSrcFrameParams(int i, int i2, int i3, boolean z) {
        this.m_OesSrcRotation = i;
        this.m_OesSrcWidth = i2;
        this.m_OesSrcHeight = i3;
        this.m_OesFlipY = z;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Oes Width:");
        LIZ.append(this.m_OesSrcWidth);
        LIZ.append(" Height:");
        LIZ.append(this.m_OesSrcHeight);
        LIZ.append(" FlipY:");
        LIZ.append(this.m_OesFlipY);
        LIZ.append(" rotation:");
        C01R.LIZJ(LIZ, this.m_OesSrcRotation, LIZ, "TEAvcEncoder");
    }

    /* JADX WARN: Code restructure failed: missing block: B:290:0x0343, code lost:
    
        if (r25.m_textureOESDrawer != null) goto L113;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int encodeVideoFromTexture(int r26, long r27, boolean r29, boolean r30, boolean r31) {
        /*
            Method dump skipped, instructions count: 2278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttve.mediacodec.TEAvcEncoder.encodeVideoFromTexture(int, long, boolean, boolean, boolean):int");
    }

    private void setEncoder(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, double d, int i9, int i10, int i11) {
        this.m_configStatus = 0;
        this.m_codec_type = i;
        VEVideoEncodeSettings.ENCODE_STANDARD encode_standard = VEVideoEncodeSettings.ENCODE_STANDARD.ENCODE_STANDARD_ByteVC1;
        if (i == encode_standard.ordinal()) {
            this.m_mime_type = "video/hevc";
        } else if (i == VEVideoEncodeSettings.ENCODE_STANDARD.ENCODE_STANDARD_MPEG4.ordinal()) {
            this.m_mime_type = "video/mp4v-es";
        } else {
            this.m_mime_type = "video/avc";
        }
        if (i2 > 0) {
            this.m_width = i2;
            this.m_width_align = i2;
        }
        if (i3 > 0) {
            this.m_height = i3;
            this.m_height_align = i3;
        }
        Math.min(this.m_width_align, this.m_height_align);
        if (this.m_useInputSurface) {
            int i12 = this.m_width_align;
            int i13 = ENCODE_RESOLUTION_ALIGN;
            if (i12 % i13 != 0) {
                this.m_width_align = ((i12 / i13) + 1) * i13;
            }
            int i14 = this.m_height_align;
            if (i14 % i13 != 0) {
                this.m_height_align = ((i14 / i13) + 1) * i13;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Encoder set OutResolution align: ");
            LIZ.append(ENCODE_RESOLUTION_ALIGN);
            LIZ.append(", dstResolution: ");
            LIZ.append(this.m_width_align);
            LIZ.append("*");
            LIZ.append(this.m_height_align);
            LIZ.append(", srcResolution: ");
            LIZ.append(this.m_width);
            LIZ.append("*");
            LIZ.append(this.m_height);
            P4Q.LJII("TEAvcEncoder", X1D.LIZIZ(LIZ));
        }
        if (i4 > 0) {
            if (!C65429Pm5.LJFF("veabtest_aboffline_performance", false) && C65429Pm5.LJFF("ve_enable_limit_min_encode_fps", true) && i4 < MIN_FRAME_RATE) {
                P4Q.LJII("TEAvcEncoder", C16880lQ.LLLZI(Locale.getDefault(), "_frameRate:[%d] is too small, change to %d", new Object[]{Integer.valueOf(i4), Integer.valueOf(MIN_FRAME_RATE)}));
                i4 = MIN_FRAME_RATE;
            }
            if (i4 > MAX_FRAME_RATE) {
                P4Q.LJII("TEAvcEncoder", C16880lQ.LLLZI(Locale.getDefault(), "_frameRate:[%d] is too large, change to %d", new Object[]{Integer.valueOf(i4), Integer.valueOf(MAX_FRAME_RATE)}));
                i4 = MAX_FRAME_RATE;
            }
            if (this.m_frameRate != i4) {
                this.m_frameRate = i4;
                if (i4 < this.m_iFrameInternal) {
                    this.m_iFrameInternal = i4;
                }
                this.m_isNeedReconfigure = true;
                this.m_configStatus |= 2;
            }
        }
        if (i5 > 0) {
            this.m_maxBitRate = i5;
            if (this.m_bitRate != i5) {
                this.m_bitRate = i5;
                this.m_isNeedReconfigure = true;
                this.m_configStatus |= 1;
            }
        }
        if (i6 >= 0) {
            this.m_iFrameInternal = i6;
        }
        if (i7 > 0) {
            this.m_colorFormat = i7;
        }
        if (this.m_codec_type == encode_standard.ordinal()) {
            if (this.m_useHDR10Bit) {
                this.m_profile = 4096;
            } else {
                this.m_profile = 1;
            }
        } else {
            this.m_profile = C78609UtB.LJJIIZ(i8, 1, 64);
        }
        this.m_dHpBitrateRatio = d;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("setEncoder, m_mime_type = ");
        LIZ2.append(this.m_mime_type);
        LIZ2.append(", bitRate = ");
        LIZ2.append(this.m_bitRate);
        LIZ2.append(", maxBitRate = ");
        LIZ2.append(this.m_maxBitRate);
        LIZ2.append(", m_dHpBitrateRatio = ");
        LIZ2.append(this.m_dHpBitrateRatio);
        P4Q.LJFF("TEAvcEncoder", X1D.LIZIZ(LIZ2));
        this.m_colorspace = i9;
        this.m_bColorRangeFull = i10;
        this.m_colorTrc = i11;
    }

    public int initEncoder(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, double d, boolean z, int i9, int i10, int i11, double d2, int i12, boolean z2, boolean z3, int i13, int i14, boolean z4) {
        boolean z5;
        if (!this.mUseForRecorder) {
            initializeHookImageCopy();
        }
        if (i12 > 0) {
            setEncodeResolutionAlign(i12);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("m_mediaCodec initEncoder == enter transitionRatio ");
        LIZ.append(d2);
        P4Q.LJFF("TEAvcEncoder", X1D.LIZIZ(LIZ));
        this.m_pageMode = i13;
        this.m_streamID = i14;
        if (!this.mUseForRecorder) {
            if (C65429Pm5.LJFF("ve_enable_compile_hw_encoder_opt", false) || C65429Pm5.LJFF("veabtest_aboffline_jy_android", false)) {
                z5 = true;
            } else {
                z5 = false;
            }
            this.isEnableHwEncoderOpt = z5;
        }
        this.m_useInputSurface = z;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("isEnableHwEncoderOpt=");
        LIZ2.append(this.isEnableHwEncoderOpt);
        LIZ2.append(", m_useInputSurface=");
        LIZ2.append(this.m_useInputSurface);
        P4Q.LJFF("TEAvcEncoder", X1D.LIZIZ(LIZ2));
        if (this.m_useInputSurface) {
            this.m_colorFormat = 2130708361;
        } else {
            this.m_colorFormat = i5;
        }
        if (i9 == 6) {
            this.m_useHDR10Bit = true;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("Hardware HDR encode: ");
            LIZ3.append(this.m_useHDR10Bit);
            P4Q.LJFF("TEAvcEncoder", X1D.LIZIZ(LIZ3));
        }
        setEncoder(i, i2, i3, i4, i7, i6, this.m_colorFormat, i8, d, i9, i10, i11);
        if (d2 > LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX && d2 < 5.0d) {
            this.m_TransitionKeyframeRatio = d2;
        }
        this.m_isNeedReconfigure = true;
        this.m_bSuccessInit = true;
        this.m_bSignalEndOfStream = false;
        this.m_bEncoderGLContextReuse = z2;
        this.m_bEncoderBanExtraDataLoop = z3;
        this.m_bEncodeGLFinish = z4;
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("avcencoder glcontext reuse: ");
        LIZ4.append(this.m_bEncoderGLContextReuse);
        LIZ4.append(", m_bEncoderBanExtraDataLoop=");
        LIZ4.append(this.m_bEncoderBanExtraDataLoop);
        LIZ4.append(", m_bEncodeGLFinish=");
        LIZ4.append(this.m_bEncodeGLFinish);
        P4Q.LJFF("TEAvcEncoder", X1D.LIZIZ(LIZ4));
        int configEncode = configEncode();
        if (configEncode < 0) {
            if (C65429Pm5.LJFF("ve_mediacodec_resource_reasonable_distribute", false)) {
                TEMediaCodecResourceManager.freeCodecBlocksSize(this.m_width_align * this.m_height_align * this.m_frameRate, hashCode());
            }
        } else if (configEncode == 0 && this.m_bEncoderBanExtraDataLoop && (configEncode = startEncoder()) != 0) {
            Q7K.LJ("Start encoder failed on initEncoder: ", configEncode, "TEAvcEncoder");
        }
        int value = VEConfigCenter.getInstance().getValue("ve_hardware_encode_fallback", 0);
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("Hardware video encoder fallback mode =");
        LIZ5.append(value);
        P4Q.LIZ("TEAvcEncoder", X1D.LIZIZ(LIZ5));
        int i15 = C63845P3x.LIZLLL;
        EnumC63844P3w enumC63844P3w = EnumC63844P3w.VIDEO_ENC_INIT_FALLBACK;
        if (i15 == enumC63844P3w.getValue() || value == enumC63844P3w.getValue()) {
            P4Q.LIZJ("TEAvcEncoder", "TESTING! HW VIDEO ENC INIT FALLBACK");
            return -1;
        }
        List<String> list = mSmartCodecPathList;
        if (list != null && !list.isEmpty() && this.mEnableSmartEncoder && this.m_streamID == 1) {
            String value2 = VEConfigCenter.getInstance().getValue("ve_smartcodec_video_json_setting", "");
            if (value2 != null && !value2.isEmpty()) {
                mJsonSettings = value2;
            }
            try {
                String str = mJsonSettings;
                if (str != null && !str.isEmpty()) {
                    JSONObject jSONObject = new JSONObject(mJsonSettings);
                    JSONObject jSONObject2 = new JSONObject();
                    String str2 = "unknow";
                    if (i == VEVideoEncodeSettings.ENCODE_STANDARD.ENCODE_STANDARD_ByteVC1.ordinal()) {
                        str2 = "bytevc1";
                    } else if (i == VEVideoEncodeSettings.ENCODE_STANDARD.ENCODE_STANDARD_H264.ordinal()) {
                        str2 = "bytevc0";
                    }
                    jSONObject2.put("codec_type", str2);
                    jSONObject2.put("hard_ware", this.m_hardWare);
                    jSONObject2.put("upload_speed", m_uploadSpeed);
                    jSONObject2.put("delta_vmaf", mVmaf);
                    jSONObject.put("param", jSONObject2);
                    mJsonSettings = jSONObject.toString();
                }
                StringBuilder LIZ6 = X1D.LIZ();
                LIZ6.append("smartEncoder jsonSettings: ");
                LIZ6.append(mJsonSettings);
                P4Q.LJFF("TEAvcEncoder", X1D.LIZIZ(LIZ6));
            } catch (JSONException e) {
                mJsonSettings = "";
                C16880lQ.LLLLIIL(e);
                StringBuilder LIZ7 = X1D.LIZ();
                LIZ7.append("smartCodec jsonSettings error: ");
                LIZ7.append(e.getLocalizedMessage());
                P4Q.LIZJ("TEAvcEncoder", X1D.LIZIZ(LIZ7));
            }
        }
        file_count = 0;
        return configEncode;
    }
}
