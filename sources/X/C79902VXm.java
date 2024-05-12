package X;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ConfigurationInfo;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import com.ss.android.ugc.aweme.experiment.TikTokResolution;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.VXm, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79902VXm extends GLSurfaceView implements GLSurfaceView.Renderer, SurfaceTexture.OnFrameAvailableListener {
    public boolean LJLIL;
    public int LJLILLLLZI;
    public Surface LJLJI;
    public int[] LJLJJI;
    public SurfaceTexture LJLJJL;
    public final int[] LJLJJLL;
    public final float[] LJLJL;
    public final float[] LJLJLJ;
    public boolean LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;
    public boolean LJLLILLLL;
    public final Handler LJLLJ;
    public CameraDevice LJLLL;
    public CameraCaptureSession LJLLLL;
    public boolean LJLLLLLL;
    public String LJLZ;
    public InterfaceC72616Sei LJZ;
    public long LJZI;
    public int LJZL;
    public final boolean LL;
    public final boolean LLD;

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        InterfaceC72616Sei interfaceC72616Sei = this.LJZ;
        if (interfaceC72616Sei != null) {
            interfaceC72616Sei.LJJJJJL();
        }
        try {
            if (this.LJLZ != null) {
                setCameraHW(false);
            }
            InterfaceC72616Sei interfaceC72616Sei2 = this.LJZ;
            o.LJI(interfaceC72616Sei2);
            interfaceC72616Sei2.LJJLIIIJJIZ();
            InterfaceC72616Sei interfaceC72616Sei3 = this.LJZ;
            o.LJI(interfaceC72616Sei3);
            interfaceC72616Sei3.LJJJJ();
            InterfaceC72616Sei interfaceC72616Sei4 = this.LJZ;
            o.LJI(interfaceC72616Sei4);
            interfaceC72616Sei4.LJJJJI();
            this.LJLIL = false;
            GLES20.glDeleteTextures(1, this.LJLJJI, 0);
            Surface surface = this.LJLJI;
            if (surface != null) {
                surface.release();
            }
            this.LJLJI = null;
            SurfaceTexture surfaceTexture = this.LJLJJL;
            if (surfaceTexture != null) {
                surfaceTexture.release();
            }
            this.LJLJJL = null;
        } catch (NullPointerException e) {
            H78.LJ(e);
        }
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        InterfaceC72616Sei interfaceC72616Sei = this.LJZ;
        if (interfaceC72616Sei != null) {
            Context context = getContext();
            o.LJI(context);
            interfaceC72616Sei.LJJLIIIJL(HW1.LIZIZ(context).getResourceFinder());
        }
        setCameraHW(this.LJLLI);
    }

    public final int getGLVersion() {
        return this.LJLILLLLZI;
    }

    public final InterfaceC72616Sei getNaviManager() {
        return this.LJZ;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl) {
        o.LJIIIZ(gl, "gl");
        if (!this.LJLIL) {
            return;
        }
        synchronized (this) {
            if (this.LJLLILLLL) {
                try {
                    SurfaceTexture surfaceTexture = this.LJLJJL;
                    o.LJI(surfaceTexture);
                    surfaceTexture.updateTexImage();
                } catch (Exception e) {
                    H78.LJ(e);
                }
                this.LJLLILLLL = false;
            }
        }
        try {
            if (this.LLD) {
                long currentTimeMillis = System.currentTimeMillis() - this.LJZI;
                long j = 1000 / this.LJZL;
                if (currentTimeMillis < j) {
                    Thread.sleep(j - currentTimeMillis);
                }
                this.LJZI = System.currentTimeMillis();
            }
            InterfaceC72616Sei interfaceC72616Sei = this.LJZ;
            o.LJI(interfaceC72616Sei);
            interfaceC72616Sei.LJJJJJ(this.LJLLI, this.LJLJJI[0]);
        } catch (Exception e2) {
            H78.LJ(e2);
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final synchronized void onFrameAvailable(SurfaceTexture st) {
        o.LJIIIZ(st, "st");
        this.LJLLILLLL = true;
        requestRender();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent pMotionEvent) {
        o.LJIIIZ(pMotionEvent, "pMotionEvent");
        if (!this.LJLL) {
            return super.onTouchEvent(pMotionEvent);
        }
        int pointerCount = pMotionEvent.getPointerCount();
        if (pointerCount > 10) {
            pointerCount = 10;
        }
        for (int i = 0; i < pointerCount; i++) {
            this.LJLJJLL[i] = pMotionEvent.getPointerId(i);
            this.LJLJL[i] = pMotionEvent.getX(i);
            this.LJLJLJ[i] = pMotionEvent.getY(i);
        }
        int action = pMotionEvent.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 5) {
                        if (action == 6) {
                            int action2 = pMotionEvent.getAction() >> 8;
                            if (this.LJLJLLL || action2 == 0) {
                                LIZ(this.LJLJL, this.LJLJLJ, pointerCount);
                                int[] iArr = {this.LJLJJLL[action2]};
                                float[] fArr = {this.LJLJL[action2]};
                                float[] fArr2 = {this.LJLJLJ[action2]};
                                InterfaceC72616Sei interfaceC72616Sei = this.LJZ;
                                o.LJI(interfaceC72616Sei);
                                interfaceC72616Sei.LJJLIIIJILLIZJL(iArr, fArr, fArr2);
                            }
                        }
                    } else {
                        int action3 = pMotionEvent.getAction() >> 8;
                        if (this.LJLJLLL || action3 == 0) {
                            LIZ(this.LJLJL, this.LJLJLJ, pointerCount);
                            int[] iArr2 = {this.LJLJJLL[action3]};
                            float[] fArr3 = {this.LJLJL[action3]};
                            float[] fArr4 = {this.LJLJLJ[action3]};
                            InterfaceC72616Sei interfaceC72616Sei2 = this.LJZ;
                            o.LJI(interfaceC72616Sei2);
                            interfaceC72616Sei2.LJJJJZI(iArr2, fArr3, fArr4);
                        }
                    }
                } else {
                    LIZ(this.LJLJL, this.LJLJLJ, pointerCount);
                    if (!this.LJLJLLL) {
                        int[] iArr3 = {this.LJLJJLL[0]};
                        float[] fArr5 = {this.LJLJL[0]};
                        float[] fArr6 = {this.LJLJLJ[0]};
                        InterfaceC72616Sei interfaceC72616Sei3 = this.LJZ;
                        o.LJI(interfaceC72616Sei3);
                        interfaceC72616Sei3.LJJJIL(iArr3, fArr5, fArr6);
                    } else {
                        for (int i2 = 0; i2 < pointerCount; i2++) {
                            int[] iArr4 = {this.LJLJJLL[i2]};
                            float[] fArr7 = {this.LJLJL[i2]};
                            float[] fArr8 = {this.LJLJLJ[i2]};
                            InterfaceC72616Sei interfaceC72616Sei4 = this.LJZ;
                            o.LJI(interfaceC72616Sei4);
                            interfaceC72616Sei4.LJJJIL(iArr4, fArr7, fArr8);
                        }
                    }
                }
            } else {
                LIZ(this.LJLJL, this.LJLJLJ, 1);
                int[] iArr5 = {this.LJLJJLL[0]};
                float[] fArr9 = {this.LJLJL[0]};
                float[] fArr10 = {this.LJLJLJ[0]};
                InterfaceC72616Sei interfaceC72616Sei5 = this.LJZ;
                o.LJI(interfaceC72616Sei5);
                interfaceC72616Sei5.LJJLIIIJILLIZJL(iArr5, fArr9, fArr10);
            }
        } else {
            LIZ(this.LJLJL, this.LJLJLJ, 1);
            int[] iArr6 = {this.LJLJJLL[0]};
            float[] fArr11 = {this.LJLJL[0]};
            float[] fArr12 = {this.LJLJLJ[0]};
            InterfaceC72616Sei interfaceC72616Sei6 = this.LJZ;
            o.LJI(interfaceC72616Sei6);
            interfaceC72616Sei6.LJJJJZI(iArr6, fArr11, fArr12);
        }
        return true;
    }

    public final void setCamera(boolean z) {
        this.LJLLI = z;
        setCameraHW(z);
        C43045Guv.LIZLLL(new AqS162S0100000_12(this, 937), 0L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
    
        r10.LJLZ = r2;
        r1 = (android.hardware.camera2.params.StreamConfigurationMap) r1.get(android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        kotlin.jvm.internal.o.LJI(r1);
        r4 = r1.getOutputSizes(android.graphics.SurfaceTexture.class);
        kotlin.jvm.internal.o.LJIIIIZZ(r4, "map!!.getOutputSizes(SurfaceTexture::class.java)");
        r3 = r4.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0086, code lost:
    
        if (r7 >= r3) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
    
        r2 = r4[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0090, code lost:
    
        if (1920 != r2.getWidth()) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0098, code lost:
    
        if (1080 != r2.getHeight()) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0084, code lost:
    
        r7 = r7 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setCameraHW(boolean r11) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79902VXm.setCameraHW(boolean):void");
    }

    public final void setFps(int i) {
        this.LJZL = i;
    }

    public final void setMultiTouchEnabled(boolean z) {
        this.LJLJLLL = z;
    }

    public final void setTouchEnabled(boolean z) {
        this.LJLL = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C79902VXm(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        InterfaceC72616Sei vgz;
        a1.LJFF(context, "context");
        this.LJLJJI = new int[1];
        this.LJLJJLL = new int[10];
        this.LJLJL = new float[10];
        this.LJLJLJ = new float[10];
        this.LJLLJ = new Handler(C16880lQ.LLJJJJ());
        this.LJLLLLLL = true;
        this.LJZI = System.currentTimeMillis();
        this.LJZL = 24;
        boolean z = C34505DgT.LIZ;
        this.LL = z;
        this.LLD = C34073DYv.LIZ;
        Object LLILL = C16880lQ.LLILL(context, "activity");
        o.LJII(LLILL, "null cannot be cast to non-null type android.app.ActivityManager");
        ConfigurationInfo deviceConfigurationInfo = ((ActivityManager) LLILL).getDeviceConfigurationInfo();
        boolean z2 = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.by7, R.attr.by8}).getBoolean(1, true);
        int i = deviceConfigurationInfo.reqGlEsVersion >= 196608 ? 3 : 2;
        this.LJLILLLLZI = i;
        setEGLContextClientVersion(i);
        setZOrderOnTop(z2);
        setEGLConfigChooser(8, 8, 8, 8, 16, 0);
        getHolder().setFormat(1);
        setRenderer(this);
        setRenderMode(1);
        if (z) {
            vgz = new C79448VGa();
        } else {
            vgz = new VGZ();
        }
        this.LJZ = vgz;
        vgz.LJJJJLL(C46381IIf.LIZ);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl, EGLConfig config) {
        boolean z;
        o.LJIIIZ(gl, "gl");
        o.LJIIIZ(config, "config");
        if (!this.LJLIL) {
            InterfaceC72616Sei interfaceC72616Sei = this.LJZ;
            o.LJI(interfaceC72616Sei);
            interfaceC72616Sei.LJJJZ();
            InterfaceC72616Sei interfaceC72616Sei2 = this.LJZ;
            o.LJI(interfaceC72616Sei2);
            interfaceC72616Sei2.LJJLI();
            InterfaceC72616Sei interfaceC72616Sei3 = this.LJZ;
            o.LJI(interfaceC72616Sei3);
            if (this.LJLILLLLZI == 3) {
                z = true;
            } else {
                z = false;
            }
            interfaceC72616Sei3.LJJLIIIIJ(z);
            this.LJLJJI = new int[1];
            gl.glDisable(3024);
            gl.glHint(3152, 4353);
            gl.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            gl.glEnable(2884);
            gl.glShadeModel(7425);
            gl.glEnable(2929);
            GLES20.glGenTextures(1, this.LJLJJI, 0);
            GLES20.glBindTexture(36197, this.LJLJJI[0]);
            GLES20.glTexParameteri(36197, 10242, 33071);
            GLES20.glTexParameteri(36197, 10243, 33071);
            GLES20.glTexParameteri(36197, 10241, 9729);
            GLES20.glTexParameteri(36197, 10240, 9729);
            SurfaceTexture surfaceTexture = new SurfaceTexture(this.LJLJJI[0]);
            this.LJLJJL = surfaceTexture;
            if (this.LL) {
                C62822Ol8 c62822Ol8 = TikTokResolution.LIZIZ;
                surfaceTexture.setDefaultBufferSize(((TikTokResolution.TiktokResolution) c62822Ol8.getValue()).height, ((TikTokResolution.TiktokResolution) c62822Ol8.getValue()).width);
            } else {
                surfaceTexture.setDefaultBufferSize(1920, 1080);
            }
            SurfaceTexture surfaceTexture2 = this.LJLJJL;
            o.LJI(surfaceTexture2);
            surfaceTexture2.setOnFrameAvailableListener(this);
            this.LJLJI = new Surface(this.LJLJJL);
            this.LJLIL = true;
            setCameraHW(this.LJLLI);
        }
    }

    public final void LIZ(float[] fArr, float[] fArr2, int i) {
        int width = getWidth();
        int height = getHeight();
        for (int i2 = 0; i2 < i; i2++) {
            float f = fArr[i2];
            float f2 = fArr2[i2];
            fArr[i2] = f / width;
            fArr2[i2] = 1.0f - (f2 / height);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl, int i, int i2) {
        o.LJIIIZ(gl, "gl");
        InterfaceC72616Sei interfaceC72616Sei = this.LJZ;
        o.LJI(interfaceC72616Sei);
        interfaceC72616Sei.LJJL(i, i2);
        InterfaceC72616Sei interfaceC72616Sei2 = this.LJZ;
        o.LJI(interfaceC72616Sei2);
        interfaceC72616Sei2.LJJLI();
    }
}
