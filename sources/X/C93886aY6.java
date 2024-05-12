package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.effectcreatormobile.camera.impl.CameraRenderImpl;
import com.bytedance.effectcreatormobile.ckeapi.api.ICameraBPEA;
import com.ss.android.ttvecamera.TECameraCapture;
import com.ss.android.vesdk.VECameraSettings;
import com.ss.android.vesdk.VERecorder;
import com.ss.android.vesdk.VESize;
import kotlin.jvm.internal.o;

/* renamed from: X.aY6, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93886aY6 {
    public Context LIZ;
    public TextureView LIZIZ;
    public C84133X0f LIZJ;
    public VERecorder LIZLLL;
    public P6F LJ;
    public Surface LJIIIIZZ;
    public final VESize LJFF = new VESize(720, 1280);
    public final VESize LJI = new VESize(720, 1280);
    public final MutableLiveData<Boolean> LJII = new MutableLiveData<>();
    public VECameraSettings.CAMERA_FACING_ID LJIIIZ = VECameraSettings.CAMERA_FACING_ID.FACING_FRONT;
    public String LJIIJ = "";
    public boolean LJIIJJI = true;

    public final VERecorder LJ() {
        VERecorder vERecorder = this.LIZLLL;
        if (vERecorder != null) {
            o.LJI(vERecorder);
            return vERecorder;
        }
        throw new IllegalStateException("record is null, make sure initVERecorder has called");
    }

    public static void LIZJ(C84133X0f c84133X0f) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(100802, "com/ss/android/vesdk/VECameraCapture", "close", c84133X0f, new Object[0], "int", new C65300Pk0(false, "()I", "-3485373762622240204"));
        if (LIZJ.LIZ) {
            ((Integer) LIZJ.LIZIZ).intValue();
            return;
        }
        C39519Ff9 LIZJ2 = new C03880Dg(2).LIZJ(100802, "com/ss/android/vesdk/VECameraCapture", "close", c84133X0f, new Object[]{null}, "int", new C65300Pk0(false, "(Lcom/bytedance/bpea/basics/Cert;)I", "9070747164134211277"));
        if (LIZJ2.LIZ) {
            ((Integer) LIZJ2.LIZIZ).intValue();
            return;
        }
        C78866UxK.LJIJ("VECameraCapture-close(cert)");
        c84133X0f.LJLLILLLL.set(false);
        TECameraCapture tECameraCapture = c84133X0f.LJLLI;
        C39519Ff9 LIZJ3 = new C03880Dg(2).LIZJ(100803, "com/ss/android/ttvecamera/TECameraCapture", "disConnect", tECameraCapture, new Object[]{null}, "int", new C65300Pk0(false, "(Lcom/bytedance/bpea/basics/Cert;)I", "9070747164134211277"));
        if (LIZJ3.LIZ) {
            ((Integer) LIZJ3.LIZIZ).intValue();
        } else {
            tECameraCapture.disConnect((Cert) null);
        }
        C78866UxK.LJJIIJ();
    }

    public static void LIZLLL(C84133X0f c84133X0f) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Boolean bool = Boolean.TRUE;
        C39519Ff9 LIZJ = c03880Dg.LIZJ(100802, "com/ss/android/vesdk/VECameraCapture", "close", c84133X0f, new Object[]{bool}, "int", new C65300Pk0(false, "(Z)I", "-3485373762622240204"));
        if (LIZJ.LIZ) {
            ((Integer) LIZJ.LIZIZ).intValue();
            return;
        }
        C39519Ff9 LIZJ2 = new C03880Dg(2).LIZJ(100802, "com/ss/android/vesdk/VECameraCapture", "close", c84133X0f, new Object[]{bool, null}, "int", new C65300Pk0(false, "(ZLcom/bytedance/bpea/basics/Cert;)I", "9070747164134211277"));
        if (LIZJ2.LIZ) {
            ((Integer) LIZJ2.LIZIZ).intValue();
        } else {
            c84133X0f.LJJIFFI(true, null);
        }
    }

    public final void LIZ(SurfaceTexture surfaceTexture) {
        if (this.LJIIIIZZ == null) {
            Surface surface = new Surface(surfaceTexture);
            this.LJIIIIZZ = surface;
            VERecorder vERecorder = this.LIZLLL;
            if (vERecorder != null) {
                vERecorder.LIZIZ.startPreview(surface);
                return;
            }
            return;
        }
        Surface surface2 = new Surface(surfaceTexture);
        this.LJIIIIZZ = surface2;
        VERecorder vERecorder2 = this.LIZLLL;
        if (vERecorder2 == null) {
            return;
        }
        vERecorder2.LIZIZ.changeSurface(surface2);
    }

    public final void LIZIZ(TextureView textureView) {
        this.LIZIZ = textureView;
        if (textureView.isAvailable()) {
            TextureView textureView2 = this.LIZIZ;
            if (textureView2 != null) {
                SurfaceTexture surfaceTexture = textureView2.getSurfaceTexture();
                if (surfaceTexture != null) {
                    TextureView textureView3 = this.LIZIZ;
                    if (textureView3 != null) {
                        textureView3.getWidth();
                        TextureView textureView4 = this.LIZIZ;
                        if (textureView4 != null) {
                            textureView4.getHeight();
                            LIZ(surfaceTexture);
                        } else {
                            o.LJIJI("textureView");
                            throw null;
                        }
                    } else {
                        o.LJIJI("textureView");
                        throw null;
                    }
                }
            } else {
                o.LJIJI("textureView");
                throw null;
            }
        }
        textureView.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC93885aY5(this));
    }

    public final void LJFF(boolean z) {
        boolean z2;
        this.LJIIJJI = z;
        if (this.LIZLLL != null) {
            if (z) {
                C84133X0f c84133X0f = this.LIZJ;
                if (c84133X0f != null) {
                    LIZLLL(c84133X0f);
                    C84133X0f c84133X0f2 = this.LIZJ;
                    if (c84133X0f2 != null) {
                        c84133X0f2.LJJIIJ();
                    }
                    this.LIZJ = null;
                }
                P6F p6f = this.LJ;
                if (p6f != null) {
                    p6f.LJJ();
                }
                P6F p6f2 = new P6F();
                this.LJ = p6f2;
                VECameraSettings LIZ = C93881aY1.LIZ(this.LJFF);
                p6f2.LJLJI = LIZ;
                p6f2.LJLJJI = LIZ.getPreviewSize();
                p6f2.LJLJJL = Math.min(p6f2.LJLJI.getFps(), 60);
                VERecorder vERecorder = this.LIZLLL;
                o.LJI(vERecorder);
                vERecorder.LIZIZ.startCameraPreview(this.LJ);
            } else {
                P6F p6f3 = this.LJ;
                if (p6f3 != null) {
                    p6f3.LJJ();
                    this.LJ = null;
                }
                C84133X0f c84133X0f3 = this.LIZJ;
                if (c84133X0f3 != null) {
                    LIZLLL(c84133X0f3);
                }
                P6F p6f4 = this.LJ;
                if (p6f4 != null) {
                    p6f4.LJJ();
                }
                C84133X0f c84133X0f4 = new C84133X0f();
                this.LIZJ = c84133X0f4;
                Context context = this.LIZ;
                if (context != null) {
                    VECameraSettings LIZ2 = C93881aY1.LIZ(this.LJFF);
                    LIZ2.setCameraFacing(this.LJIIIZ);
                    LIZ2.setOutPutMode(VECameraSettings.CAMERA_OUTPUT_MODE.SURFACE);
                    c84133X0f4.LJJIIJZLJL(context, LIZ2);
                    ICameraBPEA<C84133X0f> LIZ3 = C93880aY0.LIZ();
                    if (LIZ3 != null) {
                        LIZ3.openCameraCaptureforSwitchMode(this.LIZJ);
                    }
                    VERecorder vERecorder2 = this.LIZLLL;
                    o.LJI(vERecorder2);
                    vERecorder2.LIZIZ.startCameraPreview(this.LIZJ);
                    CameraRenderImpl LIZ4 = C93899aYJ.LIZ();
                    if (LIZ4 != null) {
                        if (this.LJIIIZ == VECameraSettings.CAMERA_FACING_ID.FACING_FRONT) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        LIZ4.setCameraFront(z2);
                    }
                } else {
                    o.LJIJI("context");
                    throw null;
                }
            }
        }
        if (this.LJIIJJI) {
            P6F p6f5 = this.LJ;
            if (p6f5 != null) {
                p6f5.LJIJJLI(this.LJIIJ);
            }
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("try apply model image ");
            LIZ5.append(this.LJIIJ);
            C94034aaU.LIZ("CKE-editor", X1D.LIZIZ(LIZ5));
        }
    }

    public final void LJI(String str) {
        String str2;
        String str3;
        if (o.LJ(str, this.LJIIJ)) {
            return;
        }
        P6F p6f = this.LJ;
        String str4 = null;
        if (p6f != null) {
            if (str != null) {
                if (str.length() == 0) {
                    str3 = this.LJIIJ;
                } else {
                    str3 = str;
                }
            } else {
                str3 = null;
            }
            p6f.LJIJJLI(str3);
        }
        StringBuilder sb = new StringBuilder("updateModelPath::try apply model image ");
        if (str != null) {
            if (str.length() == 0) {
                str2 = this.LJIIJ;
            } else {
                str2 = str;
            }
        } else {
            str2 = null;
        }
        sb.append(str2);
        C94034aaU.LIZ("CKE-editor", sb.toString());
        if (str != null) {
            if (str.length() == 0) {
                str = this.LJIIJ;
            }
            str4 = str;
        }
        this.LJIIJ = String.valueOf(str4);
    }
}
