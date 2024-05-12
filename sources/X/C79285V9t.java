package X;

import Y.ARunnableS0S0114000_10;
import Y.ARunnableS49S0100000_13;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.image.AutoSizeImage;
import defpackage.i0;
import java.lang.ref.SoftReference;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: X.V9t, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79285V9t {
    public static final Bitmap.Config LJJIIJ = Bitmap.Config.ARGB_8888;
    public static final ConcurrentHashMap<String, V9L> LJJIIJZLJL = new ConcurrentHashMap<>();
    public int LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public String LJ;
    public String LJFF;
    public boolean LJI;
    public ShadowNode LJII;
    public boolean LJIIIIZZ;
    public Bitmap.Config LJIIIZ = LJJIIJ;
    public EnumC78943UyZ LJIIJ = EnumC78943UyZ.RESIZE;
    public C78747UvP LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public String LJIILJJIL;
    public int LJIILL;
    public C117434jD LJIILLIIL;
    public C117434jD LJIIZILJ;
    public VA0 LJIJ;
    public final InterfaceC79287V9v LJIJI;
    public final Context LJIJJ;
    public ReadableMap LJIJJLI;
    public boolean LJIL;
    public LynxBaseUI LJJ;
    public volatile InterfaceC79289V9x LJJI;
    public boolean LJJIFFI;
    public boolean LJJII;
    public final boolean LJJIII;

    public final void LIZLLL() {
        ShadowNode shadowNode;
        LynxBaseUI lynxBaseUI = this.LJJ;
        if (lynxBaseUI == null || this.LIZJ == 0 || this.LIZLLL == 0) {
            return;
        }
        if (this.LJII == null) {
            VNU vnu = lynxBaseUI.mContext;
            int sign = lynxBaseUI.getSign();
            VOL vol = vnu.LJLLLLLL.get();
            if (vol != null) {
                shadowNode = vol.LJFF.LIZ(sign);
            } else {
                shadowNode = null;
            }
            this.LJII = shadowNode;
        }
        ShadowNode shadowNode2 = this.LJII;
        if (!(shadowNode2 instanceof AutoSizeImage)) {
            return;
        }
        AutoSizeImage autoSizeImage = (AutoSizeImage) shadowNode2;
        boolean z = this.LJI;
        int i = this.LIZJ;
        int i2 = this.LIZLLL;
        int width = this.LJJ.getWidth();
        int height = this.LJJ.getHeight();
        synchronized (autoSizeImage.LJJIFFI) {
            Handler handler = autoSizeImage.LJJ;
            if (handler == null) {
                autoSizeImage.LJJI = new ARunnableS0S0114000_10(autoSizeImage, z, i, i2, width, height, 0);
            } else {
                handler.post(new ARunnableS0S0114000_10(autoSizeImage, z, i, i2, width, height, 1));
            }
        }
    }

    public final void LJI() {
        ARunnableS49S0100000_13 aRunnableS49S0100000_13 = new ARunnableS49S0100000_13(this, 75);
        if (Looper.myLooper() == C16880lQ.LLJJJJ()) {
            aRunnableS49S0100000_13.run();
        } else {
            new Handler(C16880lQ.LLJJJJ()).post(aRunnableS49S0100000_13);
        }
    }

    public final boolean LJII(String str) {
        if (str != null && str.equals(this.LJIILJJIL) && str.startsWith("http")) {
            int i = this.LJIILL;
            this.LJIILL = i - 1;
            if (i > 0) {
                LJIIJJI(str);
                this.LJIJI.LIZJ();
                this.LJIJI.LJFF();
                return true;
            }
            return false;
        }
        return false;
    }

    public final void LJIIIIZZ(String str) {
        C117434jD c117434jD = this.LJIIZILJ;
        if (c117434jD != null && c117434jD.LIZIZ.equals(str)) {
            return;
        }
        this.LJIIZILJ = null;
        if (str != null && !str.isEmpty()) {
            C117434jD c117434jD2 = new C117434jD(this.LJIJJ, str, 0);
            this.LJIIZILJ = c117434jD2;
            if (android.net.Uri.EMPTY.equals(c117434jD2.LIZIZ())) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Warning: Image source \"");
                LIZ.append(str);
                LIZ.append("\" doesn't exist");
                LLog.LIZLLL(3, "Lynx", X1D.LIZIZ(LIZ));
            }
        }
        this.LJIJI.LIZJ();
    }

    public final void LJIIJJI(String str) {
        C117434jD c117434jD = this.LJIILLIIL;
        if (c117434jD != null && c117434jD.LIZIZ.equals(str)) {
            return;
        }
        this.LJIILLIIL = null;
        if (str != null && !str.isEmpty()) {
            C117434jD c117434jD2 = new C117434jD(this.LJIJJ, str, 0);
            this.LJIILLIIL = c117434jD2;
            if (android.net.Uri.EMPTY.equals(c117434jD2.LIZIZ())) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Warning: Image source \"");
                LIZ.append(str);
                LIZ.append("\" doesn't exist");
                LLog.LIZLLL(3, "Lynx", X1D.LIZIZ(LIZ));
            }
        } else {
            this.LJIJI.clear();
        }
        this.LIZJ = 0;
        this.LIZLLL = 0;
        this.LJIJI.LJI();
        this.LJIJI.LIZJ();
    }

    public C79285V9t(Context context, InterfaceC79287V9v interfaceC79287V9v) {
        boolean z;
        this.LJIJJ = context;
        this.LJIJI = interfaceC79287V9v;
        VNU LJJJJI = C78996UzQ.LJJJJI(context);
        if (LJJJJI != null) {
            if (LynxEnv.LJIIIZ().LJJIII && LJJJJI.LLIIZ) {
                z = true;
            } else {
                z = false;
            }
            this.LJJIFFI = z;
            this.LJJIII = LJJJJI.LLIILZL;
        }
    }

    public final int LIZ(int i, int i2) {
        Bitmap.Config config = this.LJIIIZ;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i3 = i * i2;
        int i4 = C83F.LIZ[config.ordinal()];
        int i5 = 1;
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 == 3 || i4 == 4) {
                    i5 = 2;
                } else {
                    throw new UnsupportedOperationException("Current Bitmap.Config is not supported");
                }
            }
        } else {
            i5 = 4;
        }
        return i3 * i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0044 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(java.lang.String r12, java.lang.String r13) {
        /*
            r11 = this;
            r6 = r12
            r4 = 0
            r5 = r11
            r5.LJJII = r4
            r3 = -1
            r9 = 0
            r2 = 1
            if (r6 == 0) goto L26
            r5.LJIILJJIL = r6
            boolean r0 = r5.LJJIII
            if (r0 == 0) goto L26
            X.VEZ r1 = X.VEZ.LIZIZ()
            java.lang.Class<X.VA4> r0 = X.VA4.class
            X.FfS r0 = r1.LIZ(r0)
            X.VA4 r0 = (X.VA4) r0
            int r0 = r0.isGeckoResource(r6)
            if (r0 != 0) goto L52
            r5.LJIIJJI(r6)
            r6 = r9
        L26:
            if (r13 == 0) goto L50
            boolean r0 = r5.LJJIII
            if (r0 == 0) goto L50
            X.VEZ r1 = X.VEZ.LIZIZ()
            java.lang.Class<X.VA4> r0 = X.VA4.class
            X.FfS r0 = r1.LIZ(r0)
            X.VA4 r0 = (X.VA4) r0
            int r0 = r0.isGeckoResource(r13)
            if (r0 != 0) goto L47
            r5.LJIIIIZZ(r13)
        L41:
            r10 = 0
        L42:
            if (r6 != 0) goto L5e
            if (r9 != 0) goto L5e
            return
        L47:
            if (r0 != r2) goto L4c
            r9 = r13
            r10 = 1
            goto L42
        L4c:
            if (r0 != r3) goto L50
            r5.LJJIFFI = r4
        L50:
            r9 = r13
            goto L41
        L52:
            if (r0 != r2) goto L59
            r5.LJJII = r2
            r5.LJIILL = r2
            goto L26
        L59:
            if (r0 != r3) goto L26
            r5.LJJIFFI = r4
            goto L26
        L5e:
            android.content.Context r0 = r5.LJIJJ
            X.VNU r8 = X.C78996UzQ.LJJJJI(r0)
            if (r8 == 0) goto L79
            boolean r0 = r8.LJZL
            if (r0 == 0) goto L79
            boolean r7 = r5.LJJII
            java.util.concurrent.Executor r0 = X.C64493PSv.LIZ()
            X.V9w r4 = new X.V9w
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.execute(r4)
        L78:
            return
        L79:
            if (r6 == 0) goto L84
            boolean r0 = r5.LJJII
            java.lang.String r0 = r5.LIZJ(r6, r0, r8)
            r5.LJIIJJI(r0)
        L84:
            if (r9 == 0) goto L78
            java.lang.String r0 = r5.LIZJ(r9, r10, r8)
            r5.LJIIIIZZ(r0)
            goto L78
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79285V9t.LJIIIZ(java.lang.String, java.lang.String):void");
    }

    public final void LJIIJ(String str, boolean z) {
        if (z) {
            LJIIIZ(str, null);
        } else {
            this.LJIILJJIL = str;
            LJIIJJI(str);
        }
    }

    public final void LJIIL(int i, int i2) {
        C117434jD c117434jD = this.LJIILLIIL;
        if (c117434jD == null || c117434jD.LIZIZ == null || !this.LJIIL || this.LJIJJ == null) {
            return;
        }
        TraceEvent.LIZIZ("ImageDelegate.tryFetchImageFromLocalCache");
        long currentTimeMillis = System.currentTimeMillis();
        if (this.LJJIFFI && this.LJJII) {
            if (this.LJJI == null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("localCache image can not getForestResponse and the url is: ");
                C13870gZ.LIZJ(LIZ, this.LJIILJJIL, LIZ, 3, "ImageDelegate");
                return;
            }
            Object LJ = this.LJJI.LJ();
            if (LJ instanceof SoftReference) {
                LJ = ((SoftReference) LJ).get();
            }
            if (!(LJ instanceof C81392Vwy)) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("localCache image forest Response is not CloseableReference and the url is: ");
                C13870gZ.LIZJ(LIZ2, this.LJIILJJIL, LIZ2, 3, "ImageDelegate");
                return;
            }
            C81392Vwy<?> c81392Vwy = (C81392Vwy) LJ;
            Object LJI = c81392Vwy.LJI();
            if (!(LJI instanceof Bitmap) && !(LJI instanceof W5B)) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("localCache image forest Response cannot get bitmap and the url is: ");
                C13870gZ.LIZJ(LIZ3, this.LJIILJJIL, LIZ3, 3, "ImageDelegate");
                return;
            } else {
                LJFF(0, LIZ(i, i2), currentTimeMillis, System.currentTimeMillis(), this.LJIILJJIL, true, true);
                this.LJIJI.LJ(c81392Vwy);
            }
        } else {
            String str = this.LJIILLIIL.LIZIZ;
            Context context = this.LJIJJ;
            float f = i;
            float f2 = i2;
            C79286V9u c79286V9u = new C79286V9u(this, str, i, i2, currentTimeMillis);
            VNU LJJJJI = C78996UzQ.LJJJJI(context);
            if (LJJJJI == null) {
                LLog.LIZLLL(4, "ImageUrlRedirectUtils", "load image failed due to no context available");
            } else {
                InterfaceC79290V9y interfaceC79290V9y = LJJJJI.LJLIL;
                if (interfaceC79290V9y != null) {
                    interfaceC79290V9y.LIZ(LJJJJI, str, f, f2, c79286V9u);
                } else {
                    c79286V9u.LIZ(null);
                }
            }
        }
        TraceEvent.LJ("ImageDelegate.tryFetchImageFromLocalCache");
    }

    public final String LIZJ(String str, boolean z, VNU vnu) {
        if (this.LJJIFFI && z) {
            if (this.LJIIL) {
                O3M o3m = new O3M();
                Boolean bool = Boolean.TRUE;
                o3m.LJIILIIL = bool;
                o3m.LJI = Boolean.FALSE;
                o3m.LJIILL = bool;
                o3m.LJII = bool;
                o3m.LIZ = EnumC61029NxJ.LYNX_IMAGE;
                this.LJJI = ((VA4) VEZ.LIZIZ().LIZ(VA4.class)).fetchResourceSync(str, o3m);
                if (this.LJJI != null && this.LJJI.LIZIZ().booleanValue() && !TextUtils.isEmpty(this.LJJI.getFilePath())) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("file://");
                    LIZ.append(this.LJJI.getFilePath());
                    return X1D.LIZIZ(LIZ);
                }
                return str;
            }
            String geckoResourcePathForUrlString = ((VA4) VEZ.LIZIZ().LIZ(VA4.class)).geckoResourcePathForUrlString(str);
            if (TextUtils.isEmpty(geckoResourcePathForUrlString)) {
                return str;
            }
            return i0.LJFF("file://", geckoResourcePathForUrlString);
        }
        if (vnu.LJZL) {
            return VA1.LIZ(vnu, str, true);
        }
        return VA1.LIZ(vnu, str, false);
    }

    public final void LJ(String str, boolean z, long j, long j2, int i, JSONObject jSONObject) {
        VNU LJJJJI = C78996UzQ.LJJJJI(this.LJIJJ);
        if (TextUtils.isEmpty(str) || j <= 0 || j2 <= 0) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        C64493PSv.LIZ().execute(new RunnableC40044Fnc(j2 - j, currentTimeMillis - j, j, currentTimeMillis, LJJJJI, jSONObject, str, z, i));
    }

    public final void LJFF(int i, int i2, long j, long j2, String str, boolean z, boolean z2) {
        C64493PSv.LIZ().execute(new RunnableC39539FfT(i2, i, j, j2, C78996UzQ.LJJJJI(this.LJIJJ), str, z, z2));
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C79266V9a LIZIZ(X.C117434jD r22, int r23, int r24, int r25, int r26, int r27, int r28, float[] r29, X.InterfaceC78716Uuu r30) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79285V9t.LIZIZ(X.4jD, int, int, int, int, int, int, float[], X.Uuu):X.V9a");
    }
}
