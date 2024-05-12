package X;

import Y.ARunnableS47S0100000_11;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.bytedance.bpea.basics.Cert;
import com.ss.android.ttvecamera.TEFrameRateRange;
import com.ss.android.ttvecamera.TEFrameSizei;
import com.ss.android.ttvecamera.cameraalgorithm.TECameraAlgorithmInterface;
import com.ss.android.ttvecamera.cameraalgorithm.TECameraAlgorithmParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes16.dex */
public abstract class YQ5 implements X10 {
    public boolean LIZ;
    public C84134X0g LIZIZ;
    public boolean LIZJ;
    public final YQV LIZLLL;
    public final Handler LJ;
    public final Context LJFF;
    public int LJII;
    public int LJIIIIZZ;
    public float LJIIJJI;
    public final PDB LJIILIIL;
    public Cert LJIJ;
    public final YQK LJIJI;
    public final JSONObject LJIJJ;
    public boolean LJIJJLI;
    public TECameraAlgorithmInterface LJIL;
    public long LJJ;
    public int LJJI;
    public long LJJIFFI;
    public boolean LJJII;
    public int LJJIII;
    public volatile boolean LJJIIJ;
    public final Object LJJIIJZLJL;
    public boolean LJJIIZ;
    public boolean LJJIIZI;
    public boolean LJJIJ;
    public long LJJIJIIJI;
    public final P77 LJJIJIIJIL;
    public HashMap<VKA, Cert> LJJIJIL;
    public final ARunnableS47S0100000_11 LJJIJL;
    public P7J LJI = new P7J();
    public int LJIIIZ = -1;
    public int LJIIJ = -1;
    public int LJIIL = 0;
    public P75 LJIILJJIL = null;
    public InterfaceC87373YQv LJIILL = null;
    public final AtomicBoolean LJIILLIIL = new AtomicBoolean(false);
    public final java.util.Map<String, Bundle> LJIIZILJ = new HashMap();

    public abstract int LJ();

    @Override // X.X10
    public int LJJJJIZL() {
        return -1;
    }

    @Override // X.X10
    public abstract void LJJJJJ(int i);

    @Override // X.X10
    public abstract int LLJJJ();

    @Override // X.X10
    public int LLJJJJ() {
        return -1;
    }

    @Override // X.X10
    public abstract void LLJLL(int i, int i2, PZA pza);

    @Override // X.X10
    public void LLJLLL() {
    }

    @Override // X.X10
    public void LLJZ() {
    }

    @Override // X.X10
    public abstract void LLLFF(C84151X0x c84151X0x);

    @Override // X.X10
    public void LLLI(int i) {
    }

    @Override // X.X10
    public void LLLII(Cert cert) {
    }

    @Override // X.X10
    public boolean LLLIIII() {
        return this instanceof YQ6;
    }

    @Override // X.X10
    public void LLLIILIL(Bundle bundle) {
    }

    @Override // X.X10
    public void LLLIL() {
        this.LJJIIZ = false;
        this.LJJIIZI = false;
        this.LJJIJ = false;
        this.LJJIJIIJI = System.currentTimeMillis();
    }

    @Override // X.X10
    public abstract void LLLILZ(InterfaceC87361YQj interfaceC87361YQj, boolean z);

    @Override // X.X10
    public void LLLILZLLLI(int i, int i2) {
    }

    @Override // X.X10
    public void LLLIZZ(boolean z) {
    }

    @Override // X.X10
    public int[] LLLJIL() {
        return null;
    }

    @Override // X.X10
    public void LLLJL(boolean z) {
    }

    @Override // X.X10
    public void LLLL(float f) {
    }

    @Override // X.X10
    public void LLLLIIIILLL(TEFrameRateRange tEFrameRateRange) {
    }

    @Override // X.X10
    public void LLLLIIL() {
    }

    @Override // X.X10
    public JSONObject LLLLIILL() {
        return null;
    }

    @Override // X.X10
    public void LLLLIL(float f) {
    }

    @Override // X.X10
    public float LLLLILI() {
        return -1.0f;
    }

    @Override // X.X10
    public final void LLLLJI() {
    }

    @Override // X.X10
    public int LLLLLLLLL() {
        return -1;
    }

    @Override // X.X10
    public long[] LLLLLLLLLL() {
        return new long[]{-1, -1};
    }

    @Override // X.X10
    public abstract void LLLLLZ(float f, InterfaceC87361YQj interfaceC87361YQj);

    @Override // X.X10
    public final void LLLLLZIL(int i) {
    }

    @Override // X.X10
    public abstract void LLLLLZL(PZA pza);

    @Override // X.X10
    public int[] LLLLZ() {
        return null;
    }

    @Override // X.X10
    public void LLLLZI(long j) {
    }

    @Override // X.X10
    public final void LLLLZIL() {
    }

    @Override // X.X10
    public int[] LLLZI() {
        TEFrameSizei tEFrameSizei = this.LIZIZ.LJZL;
        return new int[]{tEFrameSizei.width, tEFrameSizei.height};
    }

    @Override // X.X10
    public float[] LLLZLL() {
        return new float[]{-1.0f, -1.0f};
    }

    @Override // X.X10
    public void LLLZZ() {
    }

    @Override // X.X10
    public int[] LLZIL() {
        return new int[]{-1, -1};
    }

    @Override // X.X10
    public int getFlashMode() {
        return -1;
    }

    @Override // X.X10
    public abstract void stopCapture();

    @Override // X.X10
    public final int LLJLIL() {
        C63824P3c c63824P3c = this.LIZIZ.LLIIIL;
        if (c63824P3c != null) {
            return c63824P3c.LIZIZ;
        }
        return 0;
    }

    @Override // X.X10
    public final void LLLF() {
        int i = this.LJIIL;
        if (i > 0) {
            this.LJIIL = i - 1;
        }
    }

    @Override // X.X10
    public final int LLLFFI() {
        if (this.LJIILLIIL.getAndSet(false)) {
            LJ();
        }
        return this.LJIIIZ;
    }

    @Override // X.X10
    public List<TEFrameSizei> LLLJ() {
        C63922P6w.LIZIZ("TECameraBase", "getSupportedPreviewSizes error");
        return null;
    }

    @Override // X.X10
    public void LLLLLLIL() {
        P7K p7k;
        C63922P6w.LIZLLL("TECameraBase", "updateSurface");
        P7J p7j = this.LJI;
        if (p7j == null || (p7k = p7j.LIZ) == null) {
            C63922P6w.LIZIZ("TECameraBase", "can not update provider");
        } else if (C63906P6g.LIZ[p7k.LJFF().ordinal()] != 1) {
            C63922P6w.LJ("TECameraBase", "not support!");
        } else {
            this.LJI.LIZ.LJIJ();
        }
    }

    @Override // X.X10
    public List<TEFrameSizei> LLLLLLL() {
        C63922P6w.LIZIZ("TECameraBase", "getSupportedPictureSizes error");
        return null;
    }

    @Override // X.X10
    public final void LLZ() {
        C63922P6w.LIZLLL("TECameraBase", "releaseSurfaceTexture");
        synchronized (this.LJJIIJZLJL) {
            if (this.LJJIIJ) {
                C63922P6w.LIZ("TECameraBase", "need releaseSurfaceTexture");
                this.LJJIIJ = false;
                P7K p7k = this.LJI.LIZ;
                if (p7k != null) {
                    p7k.LJIILLIIL();
                }
            }
        }
    }

    @Override // X.X10
    public void destroy() {
        TECameraAlgorithmInterface tECameraAlgorithmInterface = this.LJIL;
        if (tECameraAlgorithmInterface != null) {
            tECameraAlgorithmInterface.destroy();
        }
        P7J p7j = this.LJI;
        if (p7j != null) {
            P7K p7k = p7j.LIZ;
            if (p7k != null) {
                p7k.LJIILL();
                p7j.LIZ = null;
            }
            C63922P6w.LIZLLL("TECameraBase", "release provider");
        }
    }

    @Override // X.X10
    public final C63824P3c getCameraECInfo() {
        return this.LIZIZ.LLIIIL;
    }

    @Override // X.X10
    public boolean isSupportedExposureCompensation() {
        C63824P3c c63824P3c = this.LIZIZ.LLIIIL;
        if (c63824P3c != null && c63824P3c.LIZ()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0044, code lost:
    
        if (r2 != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.os.Bundle LIZJ() {
        /*
            r4 = this;
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            X.X0g r0 = r4.LIZIZ
            int r0 = r0.LJLILLLLZI
            r1.append(r0)
            java.lang.String r0 = "_"
            r1.append(r0)
            X.X0g r0 = r4.LIZIZ
            int r0 = r0.LJLJJI
            r1.append(r0)
            java.lang.String r3 = X.X1D.LIZIZ(r1)
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "fillFeatures key = "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.lang.String r0 = "TECameraBase"
            X.C63922P6w.LIZ(r0, r1)
            java.util.Map<java.lang.String, android.os.Bundle> r0 = r4.LJIIZILJ
            java.util.HashMap r0 = (java.util.HashMap) r0
            boolean r0 = r0.containsKey(r3)
            if (r0 == 0) goto L50
            java.util.Map<java.lang.String, android.os.Bundle> r0 = r4.LJIIZILJ
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r2 = r0.get(r3)
            android.os.Bundle r2 = (android.os.Bundle) r2
            if (r2 == 0) goto L4f
        L46:
            X.X0g r0 = r4.LIZIZ
            int r1 = r0.LJLJJI
            java.lang.String r0 = "facing"
            r2.putInt(r0, r1)
        L4f:
            return r2
        L50:
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.util.Map<java.lang.String, android.os.Bundle> r0 = r4.LJIIZILJ
            java.util.HashMap r0 = (java.util.HashMap) r0
            r0.put(r3, r2)
            goto L46
        */
        throw new UnsupportedOperationException("Method not decompiled: X.YQ5.LIZJ():android.os.Bundle");
    }

    @Override // X.X10
    public final float LLJJJJJIL() {
        return this.LJIIJJI;
    }

    @Override // X.X10
    public final C84134X0g LLJJJJLIIL() {
        return this.LIZIZ;
    }

    @Override // X.X10
    public final P7J LLLLJ() {
        return this.LJI;
    }

    @Override // X.X10
    public final int LLLLLIL() {
        return this.LJII;
    }

    @Override // X.X10
    public final int LLLLLLJ() {
        return this.LJIIL;
    }

    @Override // X.X10
    public final Handler getHandler() {
        return this.LJ;
    }

    public final Cert LIZLLL(VKA vka) {
        HashMap<VKA, Cert> hashMap = this.LJJIJIL;
        if (hashMap != null && !hashMap.isEmpty() && this.LJJIJIL.containsKey(vka)) {
            return this.LJJIJIL.get(vka);
        }
        return null;
    }

    @Override // X.X10
    public final Bundle LLJLILLLLZIIL(String str) {
        return (Bundle) ((HashMap) this.LJIIZILJ).get(str);
    }

    @Override // X.X10
    public void LLJLLIL(YR0 yr0) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("unsupport capture burst, camera type:");
        LIZ.append(LLJJJ());
        new UnsupportedOperationException(X1D.LIZIZ(LIZ));
        throw null;
    }

    @Override // X.X10
    public final void LLLFZ(TECameraAlgorithmParam tECameraAlgorithmParam) {
        if (this.LJIL == null) {
            TECameraAlgorithmInterface tECameraAlgorithmInterface = new TECameraAlgorithmInterface(this);
            this.LJIL = tECameraAlgorithmInterface;
            tECameraAlgorithmInterface.init();
        }
        this.LJIL.addCameraAlgorithm(tECameraAlgorithmParam);
    }

    @Override // X.X10
    public final void LLLIIIIL(C87372YQu c87372YQu) {
        this.LJIILL = c87372YQu;
    }

    @Override // X.X10
    public final int LLLIIL(int i) {
        return LLLFFI();
    }

    @Override // X.X10
    public int LLLILZJ(Cert cert) {
        System.currentTimeMillis();
        C63922P6w.LIZ("TECameraBase", "close...");
        return 0;
    }

    @Override // X.X10
    public final P6E LLLLII(P6E p6e) {
        TECameraAlgorithmInterface tECameraAlgorithmInterface = this.LJIL;
        if (tECameraAlgorithmInterface != null) {
            return tECameraAlgorithmInterface.processAlgorithm(p6e);
        }
        return null;
    }

    @Override // X.X10
    public final void LLLLIILLL(InterfaceC63917P6r interfaceC63917P6r) {
        TECameraAlgorithmInterface tECameraAlgorithmInterface = this.LJIL;
        if (tECameraAlgorithmInterface != null) {
            tECameraAlgorithmInterface.setLensCallback(interfaceC63917P6r);
        }
    }

    @Override // X.X10
    public final void LLLLL(P7J p7j) {
        if (this.LJI == null) {
            this.LJI = p7j;
        }
    }

    @Override // X.X10
    public final void LLLLLL(C84143X0p c84143X0p) {
        if (c84143X0p != null && c84143X0p.LIZ == 2) {
            this.LJIILLIIL.set(true);
        }
    }

    @Override // X.X10
    public void LLLLLLZ(int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("scene mode: ");
        LIZ.append(i);
        C63922P6w.LIZLLL("TECameraBase", X1D.LIZIZ(LIZ));
    }

    @Override // X.X10
    public final void LLLLZLL(TECameraAlgorithmParam tECameraAlgorithmParam) {
        TECameraAlgorithmInterface tECameraAlgorithmInterface = this.LJIL;
        if (tECameraAlgorithmInterface != null) {
            tECameraAlgorithmInterface.updateCameraAlgorithmParam(tECameraAlgorithmParam);
        }
    }

    @Override // X.X10
    public final long LLLLZLLIL(boolean z) {
        long j = this.LJJ;
        this.LJJII = z;
        return j;
    }

    @Override // X.X10
    public final void LLLLZLLLI(P74 p74) {
        this.LJIILJJIL = p74;
    }

    @Override // X.X10
    public final void LLLZL(int i) {
        TECameraAlgorithmInterface tECameraAlgorithmInterface = this.LJIL;
        if (tECameraAlgorithmInterface != null) {
            tECameraAlgorithmInterface.removeCameraAlgorithm(i);
        }
    }

    @Override // X.X10
    public final void LLLZLZ(boolean z) {
        synchronized (this.LJJIIJZLJL) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("needRelease is ");
            LIZ.append(z);
            C63922P6w.LIZLLL("TECameraBase", X1D.LIZIZ(LIZ));
            this.LJJIIJ = z;
        }
    }

    @Override // X.X10
    public final void LLZILL(int i) {
        int i2 = this.LIZIZ.LJLJJI;
        if (i2 != 7) {
            this.LJJIII++;
        }
        if (i2 != 7) {
            if (!this.LJJIIZ) {
                this.LJJIIZ = true;
                long currentTimeMillis = System.currentTimeMillis() - this.LJJIJIIJI;
                YQV yqv = this.LIZLLL;
                if (yqv != null) {
                    yqv.LJIIIIZZ(3, (int) currentTimeMillis, "Camera first frame captured");
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Camera first frame captured，single camera, start preview cost time = ");
                LIZ.append(currentTimeMillis);
                C63922P6w.LIZLLL("TECameraBase", X1D.LIZIZ(LIZ));
                C87367YQp.LIZ("te_record_camera_preview_first_frame_cost", currentTimeMillis);
                return;
            }
            if (i2 != 7) {
                return;
            }
        }
        if (i == 0) {
            if (this.LJJIIZI) {
                return;
            } else {
                this.LJJIIZI = true;
            }
        } else if (i != 1 || this.LJJIJ) {
            return;
        } else {
            this.LJJIJ = true;
        }
        long currentTimeMillis2 = System.currentTimeMillis() - this.LJJIJIIJI;
        YQV yqv2 = this.LIZLLL;
        if (yqv2 != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Camera first frame captured, multi camera, facing: ");
            LIZ2.append(i);
            yqv2.LJIIIIZZ(3, 0, X1D.LIZIZ(LIZ2));
        }
        C63922P6w.LIZLLL("TECameraBase", C00F.LIZJ("Camera first frame captured，multi camera, facing = ", i, ", start preview cost time = ", currentTimeMillis2));
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("te_record_camera_preview_first_frame_cost_multi_");
        LIZ3.append(i);
        C87367YQp.LIZ(X1D.LIZIZ(LIZ3), currentTimeMillis2);
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("te_record_camera_preview_first_frame_cost_multi_");
        LIZ4.append(i);
        X1D.LIZIZ(LIZ4);
    }

    @Override // X.X10
    public final void setDeviceRotation(int i) {
        this.LJIIJ = i;
        this.LJIILLIIL.set(true);
    }

    public static Exception LIZIZ(int i, Exception exc) {
        String message = exc.getMessage();
        if (message == null) {
            message = "Exception message";
        }
        return new Exception(YE1.LIZIZ(message, ", errorCode=", i));
    }

    public final void LIZ(int i, String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("checkIfNeedCbCameraInfo type=");
        LIZ.append(i);
        LIZ.append(", msg=");
        LIZ.append(str);
        C63922P6w.LIZ("TECameraBase", X1D.LIZIZ(LIZ));
        this.LIZLLL.LJIIIIZZ(i, 0, str);
    }

    @Override // X.X10
    public int LLLZIIL(C84134X0g c84134X0g, Cert cert) {
        this.LJIIL = c84134X0g.LLF;
        System.currentTimeMillis();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("set start preview retry count: ");
        LIZ.append(this.LJIIL);
        C63922P6w.LIZLLL("TECameraBase", X1D.LIZIZ(LIZ));
        this.LJJIJIL = c84134X0g.LLJLIL;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("set mCameraPrivacyCertMap: ");
        LIZ2.append(this.LJJIJIL);
        C63922P6w.LIZLLL("TECameraBase", X1D.LIZIZ(LIZ2));
        return 0;
    }

    public YQ5(Context context, YQV yqv, Handler handler, PDC pdc) {
        new HashMap();
        this.LJIJ = null;
        YQK yqk = new YQK();
        this.LJIJI = yqk;
        this.LJIJJ = new JSONObject();
        this.LJIJJLI = false;
        this.LJIL = null;
        this.LJJ = 0L;
        this.LJJI = 0;
        this.LJJIFFI = 0L;
        this.LJJII = false;
        this.LJJIII = 0;
        this.LJJIIJ = false;
        this.LJJIIJZLJL = new Object();
        this.LJJIIZ = false;
        this.LJJIIZI = false;
        this.LJJIJ = false;
        this.LJJIJIIJI = 0L;
        this.LJJIJIIJIL = new P77();
        this.LJJIJIL = null;
        this.LJJIJL = new ARunnableS47S0100000_11(this, 43);
        this.LJFF = context;
        this.LIZLLL = yqv;
        this.LJ = handler;
        this.LJIILIIL = pdc;
        YQT yqt = new YQT();
        if (!yqk.LIZJ) {
            if (yqk.LIZ == null) {
                yqk.LIZ = new ArrayList();
            }
            if (yqk.LIZIZ == null) {
                yqk.LIZIZ = yqt;
            }
            yqk.LIZJ = true;
        }
    }
}
