package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.Surface;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.playerkit.radar.SimRadar;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Iac, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46882Iac extends C46848Ia4 {
    public static final WeakHashMap<Surface, C46882Iac> LJJIIZ = new WeakHashMap<>();
    public static final WeakHashMap<Surface, C46882Iac> LJJIIZI = new WeakHashMap<>();
    public static final WeakHashMap<Surface, Object> LJJIJ = new WeakHashMap<>();
    public static final C46883Iad LJJIJIIJI = new C46883Iad();
    public static final C46884Iae LJJIJIIJIL;
    public static WeakReference<C46882Iac> LJJIJIL;
    public final java.util.Map<Integer, Object> LJJ;
    public final C46885Iaf LJJI;
    public final InterfaceC46855IaB LJJIFFI;
    public String LJJII;
    public boolean LJJIII;
    public final boolean LJJIIJ;
    public Surface LJJIIJZLJL;

    @Override // com.ss.ttvideoengine.TTVideoEngine
    public final synchronized void LJIIIIZZ() {
        SimRadar.traceGroup(toString()).LIZIZ("createPlayer");
        SimRadar.keyScan("MTTVideoEngine", "createPlayer", this);
        super.LJIIIIZZ();
    }

    @Override // com.ss.ttvideoengine.TTVideoEngine
    public final synchronized void LJJLIIIJILLIZJL() {
        IVN analyzer = SimRadar.analyzer();
        String str = ((IZL) this.LJJIFFI).LJLL;
        analyzer.getClass();
        C46894Iao LIZ = IVN.LIZ(str);
        if (LIZ != null) {
            LIZ.LJJIFFI();
        }
        SimRadar.traceGroup(toString()).LIZIZ("release-1");
        SimRadar.traceGroup(toString()).LIZ("MTTVEngineC-R").end();
        SimRadar.keyScan("MTTVideoEngine", "release", this, ((IZL) this.LJJIFFI).LJLL);
        LLJLILLLLZIIL();
        super.LJJLIIIJILLIZJL();
        LJJIJIIJI.LIZIZ(this);
        C46885Iaf c46885Iaf = this.LJJI;
        c46885Iaf.LIZ = -1.0f;
        c46885Iaf.LIZIZ = -1.0f;
        c46885Iaf.LIZJ = null;
        c46885Iaf.LIZLLL = null;
        LLJLL(false);
    }

    @Override // com.ss.ttvideoengine.TTVideoEngine
    public final synchronized void LJJLIIIJJI() {
        SimRadar.traceGroup(toString()).LIZIZ("release-2");
        SimRadar.keyScan("MTTVideoEngine", "releaseAsync", this, ((IZL) this.LJJIFFI).LJLL);
        LLJLILLLLZIIL();
        super.LJJLIIIJJI();
        LJJIJIIJI.LIZIZ(this);
        C46885Iaf c46885Iaf = this.LJJI;
        c46885Iaf.LIZ = -1.0f;
        c46885Iaf.LIZIZ = -1.0f;
        c46885Iaf.LIZJ = null;
        c46885Iaf.LIZLLL = null;
        LLJLL(false);
    }

    static {
        Object value = IZ8.LLZZLLIL.getValue();
        o.LJIIIIZZ(value, "<get-disableDuplicateConfig>(...)");
        LJJIJIIJIL = new C46884Iae(((Number) value).intValue());
        LJJIJIL = new WeakReference<>(null);
    }

    public final String toString() {
        String str;
        String str2 = "";
        if (!IXB.LIZ || !this.LJJIIJ || TextUtils.isEmpty(LJJI())) {
            str = "";
        } else {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(", mTTVideoEngine@");
            LIZ.append(Integer.toHexString(CastIntegerProtector.parseInt(LJJI())));
            str = X1D.LIZIZ(LIZ);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("MTTVideoEngine@");
        LIZ2.append(Integer.toHexString(hashCode()));
        if (!TextUtils.isEmpty(str)) {
            str2 = str;
        }
        LIZ2.append(str2);
        return X1D.LIZIZ(LIZ2);
    }

    @Override // com.ss.ttvideoengine.TTVideoEngine
    public final void LJJL() {
        SimRadar.traceGroup(toString()).LIZIZ("pause");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sub-tag:");
        LIZ.append(this.LJJI.LIZLLL);
        SimRadar.keyScan("MTTVideoEngine", "pause", this, X1D.LIZIZ(LIZ), ((IZL) this.LJJIFFI).LJLL);
        IVN analyzer = SimRadar.analyzer();
        String str = ((IZL) this.LJJIFFI).LJLL;
        analyzer.getClass();
        C46894Iao LIZ2 = IVN.LIZ(str);
        if (LIZ2 != null) {
            LIZ2.LJIIZILJ();
        }
        super.LJJL();
        LLJLL(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0083 A[SYNTHETIC] */
    @Override // com.ss.ttvideoengine.TTVideoEngine
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLI() {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46882Iac.LJJLI():void");
    }

    @Override // com.ss.ttvideoengine.TTVideoEngine
    public final void LLJJJJJIL() {
        SimRadar.traceGroup(toString()).LIZIZ("stop");
        SimRadar.keyScan("MTTVideoEngine", "stop", this, ((IZL) this.LJJIFFI).LJLL);
        IVN analyzer = SimRadar.analyzer();
        String str = ((IZL) this.LJJIFFI).LJLL;
        analyzer.getClass();
        C46894Iao LIZ = IVN.LIZ(str);
        if (LIZ != null) {
            LIZ.LJJII();
        }
        super.LLJJJJJIL();
        LLJLL(false);
    }

    public final void LLJLILLLLZIIL() {
        Surface LJJIJLIJ = LJJIJLIJ();
        if (LJJIJLIJ != null) {
            WeakHashMap<Surface, C46882Iac> weakHashMap = LJJIIZ;
            synchronized (weakHashMap) {
                weakHashMap.remove(LJJIJLIJ);
            }
        }
        if (this.LJJIIJZLJL != null) {
            WeakHashMap<Surface, C46882Iac> weakHashMap2 = LJJIIZI;
            synchronized (weakHashMap2) {
                weakHashMap2.remove(this.LJJIIJZLJL);
            }
        }
    }

    @Override // X.C46848Ia4, com.ss.ttvideoengine.TTVideoEngine
    public final void LLIIIJ(C46886Iag c46886Iag) {
        C46885Iaf c46885Iaf = this.LJJI;
        C46886Iag c46886Iag2 = c46885Iaf.LIZJ;
        if (c46886Iag2 == null || c46886Iag == null) {
            c46885Iaf.LIZJ = c46886Iag;
        } else if (c46886Iag2.LIZLLL == c46886Iag.LIZLLL && c46886Iag2.LIZJ == c46886Iag.LIZJ && c46886Iag2.LIZ == c46886Iag.LIZ && c46886Iag2.LIZIZ == c46886Iag.LIZIZ) {
            if (!(true ^ LJJIJIIJIL.LJLJI)) {
                return;
            }
        } else {
            c46885Iaf.LIZJ = c46886Iag;
        }
        super.LLIIIJ(c46886Iag);
    }

    @Override // com.ss.ttvideoengine.TTVideoEngine
    public final void LLILZ(String str) {
        super.LLILZ(str);
        this.LJJI.LIZLLL = str;
    }

    @Override // com.ss.ttvideoengine.TTVideoEngine
    public final void LLILZIL(Surface surface) {
        String str;
        boolean z;
        boolean z2;
        if (surface != null) {
            SimRadar.traceGroup(toString()).LIZIZ("setSurface");
            if (!surface.isValid()) {
                SimRadar.errorScan("MTTVideoEngine", "setSurface", new C46691IUd("Surface is invalid"), new Object[0]);
                return;
            }
        }
        Object[] objArr = new Object[3];
        if (surface != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("surface@");
            LIZ.append(Integer.toHexString(surface.hashCode()));
            str = X1D.LIZIZ(LIZ);
        } else {
            str = null;
        }
        objArr[0] = str;
        objArr[1] = this;
        objArr[2] = ((IZL) this.LJJIFFI).LJLL;
        SimRadar.keyScan("MTTVideoEngine", "setSurface", objArr);
        if (((Boolean) IZ8.LJLJJL.getValue()).booleanValue()) {
            WeakHashMap<Surface, C46882Iac> weakHashMap = LJJIIZ;
            synchronized (weakHashMap) {
                Surface LJJIJLIJ = LJJIJLIJ();
                C46882Iac c46882Iac = weakHashMap.get(surface);
                if (LJJIJLIJ != null) {
                    weakHashMap.remove(LJJIJLIJ);
                }
                if (surface != null) {
                    weakHashMap.put(surface, this);
                }
                if (LJJIJLIJ == surface && surface != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (c46882Iac != null && c46882Iac != this) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z && z2) {
                    SimRadar.keyScan("MTTVideoEngine", "setSurface: clear Last Engine Surface", c46882Iac, LJJIJLIJ);
                    c46882Iac.LLILZIL(null);
                }
            }
        }
        super.LLILZIL(surface);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x010c, code lost:
    
        if (r3 != r11) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0180, code lost:
    
        if (r12 != null) goto L80;
     */
    @Override // com.ss.ttvideoengine.TTVideoEngine
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLILZLL(android.view.SurfaceHolder r12) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46882Iac.LLILZLL(android.view.SurfaceHolder):void");
    }

    @Override // com.ss.ttvideoengine.TTVideoEngine
    public final void LLJIJIL(String str) {
        super.LLJIJIL(str);
        this.LJJI.getClass();
    }

    public final void LLJLL(boolean z) {
        int LJJIJ2 = IZ8.LJJIJ();
        if (LJJIJ2 != 0) {
            C46882Iac c46882Iac = LJJIJIL.get();
            if (z) {
                if (c46882Iac != null && c46882Iac.hashCode() != hashCode()) {
                    if (LJJIJ2 == 1) {
                        c46882Iac.LJJL();
                        return;
                    }
                    if (LJJIJ2 != 2) {
                        return;
                    }
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("last engine: ");
                    LIZ.append(c46882Iac.LJJII);
                    LIZ.append("\ncurrent engine: ");
                    LIZ.append(this.LJJII);
                    throw new Error(X1D.LIZIZ(LIZ));
                }
                LJJIJIL = new WeakReference<>(this);
                return;
            }
            if (c46882Iac == null || c46882Iac.hashCode() != hashCode()) {
                return;
            }
            LJJIJIL.clear();
        }
    }

    @Override // com.ss.ttvideoengine.TTVideoEngine
    public final void LJJLIIIJLJLI(int i, InterfaceC47896Iqy interfaceC47896Iqy) {
        SimRadar.keyScan("MTTVideoEngine", "seekTo", this, Integer.valueOf(i), ((IZL) this.LJJIFFI).LJLL);
        super.LJJLIIIJLJLI(i, interfaceC47896Iqy);
    }

    @Override // com.ss.ttvideoengine.TTVideoEngine
    public final void LJLLILLLL(float f, int i) {
        if (LLJLIL(i, Float.valueOf(f))) {
            super.LJLLILLLL(f, i);
        }
    }

    @Override // com.ss.ttvideoengine.TTVideoEngine
    public final void LJLLLL(int i, int i2) {
        if (LLJLIL(i, Integer.valueOf(i2))) {
            super.LJLLLL(i, i2);
        }
    }

    @Override // com.ss.ttvideoengine.TTVideoEngine
    public final void LLFF(int i, long j) {
        if (LLJLIL(i, Long.valueOf(j))) {
            super.LLFF(i, j);
        }
    }

    @Override // com.ss.ttvideoengine.TTVideoEngine
    public final void LLILL(int i, String str) {
        if (LLJLIL(i, str)) {
            super.LLILL(i, str);
        }
    }

    @Override // com.ss.ttvideoengine.TTVideoEngine
    public final void LLJJIJIL(float f, float f2) {
        C46885Iaf c46885Iaf = this.LJJI;
        if (c46885Iaf.LIZ != f || c46885Iaf.LIZIZ != f2) {
            c46885Iaf.LIZIZ = f2;
            c46885Iaf.LIZ = f;
        } else if (!(true ^ LJJIJIIJIL.LJLILLLLZI)) {
            return;
        }
        super.LLJJIJIL(f, f2);
    }

    public final boolean LLJLIL(int i, Object obj) {
        if (((ConcurrentHashMap) this.LJJ).containsKey(Integer.valueOf(i))) {
            if (((ConcurrentHashMap) this.LJJ).get(Integer.valueOf(i)) != obj) {
                return true;
            }
            return !LJJIJIIJIL.LJLIL;
        }
        ((ConcurrentHashMap) this.LJJ).put(Integer.valueOf(i), obj);
        return true;
    }

    public C46882Iac(Context context, int i, InterfaceC46855IaB interfaceC46855IaB) {
        super(context, i);
        this.LJJ = new ConcurrentHashMap();
        this.LJJI = new C46885Iaf();
        this.LJJIIJZLJL = null;
        SimRadar.traceGroup(toString()).LIZ("MTTVEngineC-R").LIZJ();
        this.LJJIFFI = interfaceC46855IaB;
        this.LJJIIJ = true;
    }
}
