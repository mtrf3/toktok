package X;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.SystemClock;
import android.view.Surface;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.UnusedLogOfflineSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource;
import com.ss.android.ugc.aweme.live.alphaplayer.model.MaskSrc;
import defpackage.i0;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class VGW implements InterfaceC79896VXg {
    public FloatBuffer LJLJJI;
    public FloatBuffer LJLJJL;
    public FloatBuffer LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public int LJLL;
    public int LJLLI;
    public SurfaceTexture LJLLILLLL;
    public VGX LJLLLLLL;
    public final InterfaceC79452VGe LJLZ;
    public VGU LJZI;
    public VGU LJZL;
    public VGU LL;
    public int LLD;
    public int LLF;
    public int LLFF;
    public int LLFFF;
    public VGR LLFII;
    public PMI LLFZ;
    public java.util.Map<String, java.util.Map<String, DataSource.Element>> LLI;
    public VGY LLII;
    public boolean LLIIII;
    public final float[] LJLIL = new float[8];
    public final float[] LJLILLLLZI = new float[8];
    public final float[] LJLJI = new float[8];
    public final AtomicBoolean LJLLJ = new AtomicBoolean(false);
    public final AtomicBoolean LJLLL = new AtomicBoolean(false);
    public final AtomicInteger LJLLLL = new AtomicInteger(0);
    public DataSource.ScaleType LJZ = DataSource.ScaleType.ScaleAspectFill;
    public final VGS LLIFFJFJJ = new VGS();
    public long LLIIIILZ = 0;
    public int LLIIIJ = 0;
    public long LLIIIL = 0;
    public long LLIIIZ = 0;

    @Override // X.InterfaceC79896VXg
    public final void LJIIIZ() {
        this.LJLLLL.set(0);
        this.LJLLL.compareAndSet(false, true);
        this.LLIIIILZ = SystemClock.currentThreadTimeMillis();
        this.LLIIIL = SystemClock.elapsedRealtime();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("record starttimems : ");
        LIZ.append(this.LLIIIL);
        C32444CoK.LIZLLL("AlphaPlayerRender", X1D.LIZIZ(LIZ));
        this.LLIIIJ = 0;
        this.LLIIIZ = 0L;
        this.LJLZ.requestRender();
        this.LLIIII = true;
    }

    @Override // X.InterfaceC79896VXg
    public final void onCompletion() {
        long j;
        this.LJLLL.compareAndSet(true, false);
        this.LLIIIZ = SystemClock.elapsedRealtime();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("record endtimems : ");
        LIZ.append(this.LLIIIZ);
        C32444CoK.LIZLLL("AlphaPlayerRender", X1D.LIZIZ(LIZ));
        float currentThreadTimeMillis = this.LLIIIJ / ((((float) SystemClock.currentThreadTimeMillis()) - ((float) this.LLIIIILZ)) / 100.0f);
        long j2 = 0;
        if (LiveMonitorSampleSetting.INSTANCE.isReportDolphin("ttlive_gift_video_fps", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX)) {
            HashMap hashMap = new HashMap();
            hashMap.put("average", String.valueOf(currentThreadTimeMillis));
            hashMap.put("tag", "ttlive_sdk");
            Long LJ = C32257ClJ.LJ();
            if (LJ != null) {
                j = LJ.longValue();
            } else {
                j = 0;
            }
            hashMap.put("user_id", String.valueOf(j));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", currentThreadTimeMillis);
            InterfaceC32251ClD LIZJ = C32257ClJ.LIZJ();
            if (LIZJ != null) {
                LIZJ.LIZ("ttlive_gift_video_fps", jSONObject, C32257ClJ.LJII(hashMap));
            }
        }
        if (UnusedLogOfflineSetting.INSTANCE.isEnable("ttlive_gift_video_fps")) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("average", String.valueOf(currentThreadTimeMillis));
            hashMap2.put("tag", "ttlive_sdk");
            Long LJ2 = C32257ClJ.LJ();
            if (LJ2 != null) {
                j2 = LJ2.longValue();
            }
            hashMap2.put("user_id", String.valueOf(j2));
            new JSONObject().put("duration", currentThreadTimeMillis);
            C32255ClH LIZ2 = C32256ClI.LIZ("ttlive_gift_video_fps");
            LIZ2.LJFF(hashMap2);
            LIZ2.LIZIZ();
            LIZ2.LJI();
        }
        this.LJLZ.requestRender();
        VGR vgr = this.LLFII;
        if (vgr != null) {
            vgr.LIZJ();
            this.LLFII = null;
        }
        this.LLI = null;
    }

    public VGW(InterfaceC79452VGe interfaceC79452VGe) {
        this.LJLZ = interfaceC79452VGe;
    }

    @Override // X.InterfaceC79896VXg
    public final void LIZIZ(List<MaskSrc> list) {
        if (this.LLI != null && list != null && !list.isEmpty()) {
            this.LLFII = new VGR(this.LJLZ.getContext(), list);
            if (this.LJLZ.LIZJ()) {
                this.LLFII.LIZIZ();
            }
        }
    }

    @Override // X.InterfaceC79896VXg
    public final void LJ(VGX vgx) {
        this.LJLLLLLL = vgx;
    }

    @Override // android.opengl.GLSurfaceView.Renderer, X.InterfaceC81370Vwc
    public final void onDrawFrame(GL10 gl10) {
        java.util.Map<String, DataSource.Element> map;
        if (this.LJLLILLLL != null && this.LJLLJ.compareAndSet(true, false)) {
            try {
                this.LJLLILLLL.updateTexImage();
            } catch (Exception unused) {
            }
        }
        GLES20.glClear(16640);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        if (!this.LJLLL.get()) {
            GLES20.glFinish();
            return;
        }
        this.LJLLLL.addAndGet(1);
        if (this.LJLJJI != null && this.LJLJJL != null && this.LJLJJLL != null) {
            GLES20.glUseProgram(this.LJLJLJ);
            this.LJLJJI.position(0);
            GLES20.glVertexAttribPointer(this.LJLJLLL, 2, 5126, false, 0, (Buffer) this.LJLJJI);
            GLES20.glEnableVertexAttribArray(this.LJLJLLL);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, this.LJLJL);
            this.LJLJJL.position(0);
            GLES20.glVertexAttribPointer(this.LJLL, 2, 5126, false, 0, (Buffer) this.LJLJJL);
            GLES20.glEnableVertexAttribArray(this.LJLL);
            this.LJLJJLL.position(0);
            GLES20.glVertexAttribPointer(this.LJLLI, 2, 5126, false, 0, (Buffer) this.LJLJJLL);
            GLES20.glEnableVertexAttribArray(this.LJLLI);
            GLES20.glDrawArrays(5, 0, 4);
        }
        if (this.LLFII != null && this.LJLLLLLL != null) {
            int i = this.LJLLLL.get();
            int LIZ = this.LJLLLLLL.LIZ();
            if (LIZ > i + 2) {
                this.LJLLLL.set(LIZ);
                i = LIZ;
            }
            java.util.Map<String, java.util.Map<String, DataSource.Element>> map2 = this.LLI;
            if (map2 != null && (map = map2.get(String.valueOf(i))) != null) {
                for (Map.Entry<String, DataSource.Element> entry : map.entrySet()) {
                    VGR vgr = this.LLFII;
                    if (vgr != null) {
                        vgr.LIZ(this.LJLJL, this.LLD, this.LLF, this.LLFF, this.LLFFF, this.LLIFFJFJJ, entry.getKey(), entry.getValue());
                    }
                }
            }
        }
        PMI pmi = this.LLFZ;
        if (pmi != null) {
            pmi.LIZIZ();
        }
        GLES20.glFinish();
        VGY vgy = this.LLII;
        if (vgy != null && this.LLIIII) {
            vgy.LIZ();
            this.LLIIII = false;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.LJLLJ.compareAndSet(false, true);
        this.LLIIIJ++;
        this.LJLZ.requestRender();
    }

    @Override // X.InterfaceC79896VXg
    public final void setConfigParams(DataSource.DataInfo dataInfo) {
        this.LJZ = dataInfo.getScaleType();
        this.LLD = dataInfo.getVideoWidth();
        this.LLF = dataInfo.getVideoHeight();
        this.LLFF = dataInfo.getActualWidth();
        this.LLFFF = dataInfo.getActualHeight();
        if (dataInfo.isSupportZip()) {
            VGU rgbArea = dataInfo.getRgbArea();
            rgbArea.LIZ(dataInfo.getVideoWidth(), dataInfo.getVideoHeight());
            this.LJZL = rgbArea;
            VGU alphaArea = dataInfo.getAlphaArea();
            alphaArea.LIZ(dataInfo.getVideoWidth(), dataInfo.getVideoHeight());
            this.LJZI = alphaArea;
        } else {
            this.LJZL = new VGU(0.5f, 0.0f, 1.0f, 1.0f);
            this.LJZI = new VGU(0.0f, 0.0f, 0.5f, 1.0f);
        }
        this.LL = new VGU(0.0f, 0.0f, 1.0f, 1.0f);
        if (dataInfo.isSupportMask()) {
            this.LLI = dataInfo.getMasks();
        } else {
            this.LLI = null;
        }
        VGU vgu = this.LL;
        if (vgu != null && this.LJZL != null && this.LJZI != null) {
            VGT.LIZ(vgu);
            float[] fArr = this.LJLIL;
            VGU vgu2 = this.LL;
            VGT.LIZIZ(fArr, vgu2.LIZ, vgu2.LIZIZ, vgu2.LIZJ, vgu2.LIZLLL);
            FloatBuffer LJI = i0.LJI(ByteBuffer.allocateDirect(this.LJLIL.length * 4));
            LJI.put(this.LJLIL);
            this.LJLJJI = LJI;
            LJI.position(0);
            float[] fArr2 = this.LJLILLLLZI;
            VGU vgu3 = this.LJZL;
            VGT.LIZIZ(fArr2, vgu3.LIZ, vgu3.LIZIZ, vgu3.LIZJ, vgu3.LIZLLL);
            FloatBuffer LJI2 = i0.LJI(ByteBuffer.allocateDirect(this.LJLILLLLZI.length * 4));
            LJI2.put(this.LJLILLLLZI);
            this.LJLJJL = LJI2;
            LJI2.position(0);
            float[] fArr3 = this.LJLJI;
            VGU vgu4 = this.LJZI;
            VGT.LIZIZ(fArr3, vgu4.LIZ, vgu4.LIZIZ, vgu4.LIZJ, vgu4.LIZLLL);
            FloatBuffer LJI3 = i0.LJI(ByteBuffer.allocateDirect(this.LJLJI.length * 4));
            LJI3.put(this.LJLJI);
            this.LJLJJLL = LJI3;
            LJI3.position(0);
            VGS vgs = this.LLIFFJFJJ;
            vgs.LIZ = 0.0f;
            vgs.LIZIZ = 0.0f;
            vgs.LIZJ = 0.0f;
            vgs.LIZLLL = 0.0f;
        }
        VGR vgr = this.LLFII;
        if (vgr != null) {
            vgr.LIZJ();
            this.LLFII = null;
        }
    }

    @Override // X.InterfaceC79896VXg
    public final void setFirstGLFrameListener(VGY vgy) {
        this.LLII = vgy;
    }

    @Override // android.opengl.GLSurfaceView.Renderer, X.InterfaceC81370Vwc
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        int LJII = V16.LJII(V16.LJJJJI("video/video_vertex.sh", this.LJLZ.getResources()), V16.LJJJJI("video/video_frag.sh", this.LJLZ.getResources()));
        this.LJLJLJ = LJII;
        if (LJII != 0) {
            int glGetAttribLocation = GLES20.glGetAttribLocation(LJII, "aPosition");
            this.LJLJLLL = glGetAttribLocation;
            if (glGetAttribLocation != -1) {
                int glGetAttribLocation2 = GLES20.glGetAttribLocation(this.LJLJLJ, "aTextureCoord");
                this.LJLL = glGetAttribLocation2;
                if (glGetAttribLocation2 != -1) {
                    int glGetAttribLocation3 = GLES20.glGetAttribLocation(this.LJLJLJ, "aAlphaTextureCoord");
                    this.LJLLI = glGetAttribLocation3;
                    if (glGetAttribLocation3 == -1) {
                        throw new RuntimeException("Could not get attrib location for aAlphaTextureCoord");
                    }
                } else {
                    throw new RuntimeException("Could not get attrib location for aTextureCoord");
                }
            } else {
                throw new RuntimeException("Could not get attrib location for aPosition");
            }
        }
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i = iArr[0];
        this.LJLJL = i;
        GLES20.glBindTexture(36197, i);
        GLES20.glTexParameterf(36197, 10241, 9729.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.LJLJL);
        this.LJLLILLLL = surfaceTexture;
        surfaceTexture.setDefaultBufferSize(this.LJLZ.getMeasuredWidth(), this.LJLZ.getMeasuredHeight());
        this.LJLLILLLL.setOnFrameAvailableListener(this);
        Surface surface = new Surface(this.LJLLILLLL);
        VGX vgx = this.LJLLLLLL;
        if (vgx != null) {
            vgx.LIZIZ(surface);
        }
        this.LJLLJ.compareAndSet(true, false);
        VGR vgr = this.LLFII;
        if (vgr != null) {
            vgr.LIZIZ();
        }
        PMI pmi = this.LLFZ;
        if (pmi != null) {
            pmi.LJ();
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer, X.InterfaceC81370Vwc
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        GLES20.glViewport(0, 0, i, i2);
    }

    public final void LIZ(float f, float f2, float f3, float f4) {
        VGU vgu;
        if (this.LJLJJL == null || (vgu = this.LJZL) == null || this.LJLJJLL == null || this.LJZI == null) {
            return;
        }
        VGS vgs = this.LLIFFJFJJ;
        float f5 = (1.0f - f3) - f;
        float f6 = (1.0f - f2) - f4;
        vgs.LIZ = (-f) / f5;
        vgs.LIZIZ = (-f2) / f6;
        vgs.LIZJ = (-f3) / f5;
        vgs.LIZLLL = (-f4) / f6;
        float[] fArr = this.LJLILLLLZI;
        float f7 = vgu.LIZ;
        float f8 = vgu.LIZJ;
        float f9 = f8 - f7;
        float f10 = vgu.LIZIZ;
        float f11 = vgu.LIZLLL;
        float f12 = f11 - f10;
        VGT.LIZIZ(fArr, (f9 * f) + f7, (f12 * f2) + f10, f8 - (f9 * f3), f11 - (f12 * f4));
        this.LJLJJL.position(0);
        this.LJLJJL.put(this.LJLILLLLZI);
        float[] fArr2 = this.LJLJI;
        VGU vgu2 = this.LJZI;
        float f13 = vgu2.LIZ;
        float f14 = vgu2.LIZJ;
        float f15 = f14 - f13;
        float f16 = (f * f15) + f13;
        float f17 = vgu2.LIZIZ;
        float f18 = vgu2.LIZLLL;
        float f19 = f18 - f17;
        VGT.LIZIZ(fArr2, f16, (f2 * f19) + f17, f14 - (f15 * f3), f18 - (f19 * f4));
        this.LJLJJLL.position(0);
        this.LJLJJLL.put(this.LJLJI);
    }

    public final void LIZJ(float f, float f2, float f3, float f4) {
        VGU vgu;
        if (this.LJLJJI == null || (vgu = this.LL) == null) {
            return;
        }
        VGS vgs = this.LLIFFJFJJ;
        vgs.LIZ = f;
        vgs.LIZIZ = f2;
        vgs.LIZJ = f3;
        vgs.LIZLLL = f4;
        VGT.LIZIZ(this.LJLIL, (f * 2.0f) + vgu.LIZ, vgu.LIZIZ - (f2 * 2.0f), vgu.LIZJ - (f3 * 2.0f), (f4 * 2.0f) + vgu.LIZLLL);
        this.LJLJJI.position(0);
        this.LJLJJI.put(this.LJLIL);
    }

    @Override // X.InterfaceC79896VXg
    public final void LIZLLL(float f, float f2, float f3, float f4) {
        float f5;
        float f6;
        float f7;
        float f8 = 0.0f;
        if (f <= 0.0f || f2 <= 0.0f || f3 <= 0.0f || f4 <= 0.0f) {
            return;
        }
        float f9 = f / f2;
        float f10 = f3 / f4;
        if (f9 > f10) {
            f6 = (1.0f - (f2 / (f / f10))) / 2.0f;
            f5 = 0.0f;
        } else {
            f5 = (1.0f - (f / (f2 * f10))) / 2.0f;
            f6 = 0.0f;
        }
        switch (VXK.LIZ[this.LJZ.ordinal()]) {
            case 1:
                LIZ(0.0f, 0.0f, 0.0f, 0.0f);
                return;
            case 2:
                if (f9 > f10) {
                    f8 = (1.0f - ((f2 * f10) / f)) / 2.0f;
                    f7 = 0.0f;
                } else {
                    f7 = (1.0f - ((f / f10) / f2)) / 2.0f;
                }
                LIZJ(f8, f7, f8, f7);
                return;
            case 3:
                LIZ(f5, f6, f5, f6);
                return;
            case 4:
                LIZ(f5, 0.0f, f5, f6 * 2.0f);
                return;
            case 5:
                LIZ(f5, f6 * 2.0f, f5, 0.0f);
                return;
            case 6:
                LIZ(0.0f, f6, f5 * 2.0f, f6);
                return;
            case 7:
                LIZ(f5 * 2.0f, f6, 0.0f, f6);
                return;
            case 8:
                LIZJ(0.0f, 0.0f, 0.0f, ((1.0f - ((f / f10) / f2)) / 2.0f) * 2.0f);
                return;
            case 9:
                LIZJ(0.0f, ((1.0f - ((f / f10) / f2)) / 2.0f) * 2.0f, 0.0f, 0.0f);
                return;
            case 10:
                LIZJ(0.0f, 0.0f, ((1.0f - ((f2 * f10) / f)) / 2.0f) * 2.0f, 0.0f);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                LIZJ(((1.0f - ((f2 * f10) / f)) / 2.0f) * 2.0f, 0.0f, 0.0f, 0.0f);
                return;
            default:
                return;
        }
    }
}
