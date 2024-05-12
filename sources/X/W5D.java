package X;

import android.graphics.drawable.Animatable;
import android.text.TextUtils;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import defpackage.i0;

/* loaded from: classes15.dex */
public final class W5D extends W4V<InterfaceC81599W0t> {
    public SmartImageView LIZIZ;
    public InterfaceC70769Rq1 LIZJ;
    public android.net.Uri LIZLLL;
    public C81831W9r LJ;
    public boolean LJFF;
    public boolean LJI;
    public W5E LJII;
    public W4R LJIIIIZZ;

    @Override // X.W4V, X.W4Z
    public final void LIZJ(String str) {
        C79083V1z.LJ(this.LJII.hashCode(), "ControllerListenerAdapter", i0.LJFF("onRelease  id=", str));
        InterfaceC70769Rq1 interfaceC70769Rq1 = this.LIZJ;
        if (interfaceC70769Rq1 != null) {
            interfaceC70769Rq1.LJLLLLLL(this.LIZLLL);
        }
        this.LJFF = false;
        this.LJI = false;
    }

    public final void LJIIL(W5E w5e) {
        this.LJII = w5e;
        this.LIZIZ = (SmartImageView) w5e.LJJIIZI;
        this.LIZJ = w5e.LJJIJIIJI;
        C62562cu c62562cu = w5e.LJJJ;
        if (c62562cu != null && !c62562cu.LIZ()) {
            this.LIZLLL = UriProtector.parse((String) ListProtector.get(w5e.LJJJ.LIZ, 0));
        } else {
            this.LIZLLL = w5e.LIZ;
        }
    }

    @Override // X.W4V, X.W4Z
    public final void LIZIZ(String str, Throwable th) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onIntermediateImageFailed  id=");
        LIZ.append(str);
        LIZ.append("  throwable: ");
        LIZ.append(th);
        C79083V1z.LIZIZ(this.LJII.hashCode(), "ControllerListenerAdapter", X1D.LIZIZ(LIZ), "");
        InterfaceC70769Rq1 interfaceC70769Rq1 = this.LIZJ;
        if (interfaceC70769Rq1 != null) {
            interfaceC70769Rq1.LLZZJLIL(this.LIZLLL, th);
        }
        this.LJFF = false;
        this.LJI = false;
    }

    @Override // X.W4V, X.W4Z
    public final void LIZLLL(Object obj, String str) {
        InterfaceC81599W0t interfaceC81599W0t = (InterfaceC81599W0t) obj;
        C79083V1z.LJ(this.LJII.hashCode(), "ControllerListenerAdapter", i0.LJFF("onIntermediateImageSet  id=", str));
        InterfaceC70769Rq1 interfaceC70769Rq1 = this.LIZJ;
        if (interfaceC70769Rq1 != null) {
            if (interfaceC81599W0t != null) {
                this.LIZJ.D1(this.LIZLLL, new C2047581v(interfaceC81599W0t.getWidth(), interfaceC81599W0t.getHeight()));
            } else {
                interfaceC70769Rq1.D1(this.LIZLLL, null);
            }
        }
        this.LJFF = false;
        this.LJI = false;
    }

    @Override // X.W4V, X.W4Z
    public final void LJ(String str, Throwable th) {
        W5E w5e = this.LJII;
        if (w5e.LJJJJ) {
            HWC.LIZIZ(w5e);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("  id=");
        LIZ.append(str);
        LIZ.append(", ex=");
        LIZ.append(th);
        C79083V1z.LIZIZ(this.LJII.hashCode(), "ControllerListenerAdapter", "onFailure", X1D.LIZIZ(LIZ));
        InterfaceC70769Rq1 interfaceC70769Rq1 = this.LIZJ;
        if (interfaceC70769Rq1 != null) {
            interfaceC70769Rq1.s2(this.LIZLLL, this.LIZIZ, th);
        }
        this.LJFF = false;
    }

    @Override // X.W4V, X.W4Z
    public final void LJI(Object obj, String str) {
        C79083V1z.LJFF(this.LJII.hashCode(), "ControllerListenerAdapter", "onSubmit", i0.LJFF(" id = ", str));
        InterfaceC70769Rq1 interfaceC70769Rq1 = this.LIZJ;
        if (interfaceC70769Rq1 != null) {
            interfaceC70769Rq1.T1(this.LIZLLL, this.LIZIZ);
        }
        W5E w5e = this.LJII;
        if (w5e.LJJJJ) {
            HWC.LIZ(w5e, new W51(this.LJIIIIZZ));
        }
    }

    @Override // X.W4V, X.W4Z
    public final void LJFF(String str, Object obj, Animatable animatable) {
        InterfaceC81599W0t interfaceC81599W0t = (InterfaceC81599W0t) obj;
        C79083V1z.LIZ(this.LJII.hashCode(), "ControllerListenerAdapter", i0.LJFF("onFinalImageSet  id=", str), "");
        W5E w5e = this.LJII;
        if (w5e.LJJJJ) {
            HWC.LIZIZ(w5e);
        }
        boolean z = interfaceC81599W0t instanceof C81831W9r;
        if (z) {
            this.LJ = (C81831W9r) interfaceC81599W0t;
        }
        boolean z2 = true;
        this.LJI = true;
        if (animatable == null) {
            z2 = false;
        }
        this.LJFF = z2;
        InterfaceC70769Rq1 interfaceC70769Rq1 = this.LIZJ;
        if (interfaceC70769Rq1 != null) {
            if (interfaceC81599W0t != null) {
                this.LIZJ.U0(this.LIZLLL, this.LIZIZ, new C2047581v(interfaceC81599W0t.getWidth(), interfaceC81599W0t.getHeight()), animatable);
            } else {
                interfaceC70769Rq1.U0(this.LIZLLL, this.LIZIZ, null, animatable);
            }
        }
        if (this.LJ != null && this.LJII.LJJIJL && !TextUtils.isEmpty(this.LIZIZ.getAnimPreviewFrameCacheKey())) {
            W68 w68 = C49612JdY.LIZ;
            if (w68.LIZJ(this.LIZIZ.getAnimPreviewFrameCacheKey()) == null && z) {
                w68.LIZ(this.LIZIZ.getAnimPreviewFrameCacheKey(), this.LJ);
            }
        }
        if (this.LJFF && this.LJII.LIZLLL) {
            this.LIZIZ.LJ();
        }
    }

    @Override // X.W4V
    public final void LJIIIZ(String str, InterfaceC81599W0t interfaceC81599W0t, Animatable animatable, W5O w5o, java.util.Map map) {
        W5E w5e = this.LJII;
        if (w5e.LJJJJ) {
            HWC.LIZIZ(w5e);
        }
    }
}
