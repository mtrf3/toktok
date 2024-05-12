package X;

import android.widget.FrameLayout;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import kotlin.jvm.internal.o;

/* renamed from: X.WNl, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82189WNl implements WGL {
    public final /* synthetic */ C82188WNk LIZ;

    @Override // X.WGL
    public final void LIZ() {
        C122034qd LJJI;
        NLEEditor nLEEditor;
        C82188WNk c82188WNk = this.LIZ;
        c82188WNk.getClass();
        c82188WNk.LJLILLLLZI.LIZLLL(false, c82188WNk.LJLJLJ, new C145555nT(), c82188WNk.LJZ);
        InterfaceC153045zY value = this.LIZ.getEditPreviewApi().Kh().getValue();
        if (value == null || (LJJI = C17N.LJJI(value)) == null || (nLEEditor = LJJI.LJIIJ) == null) {
            return;
        }
        this.LIZ.LJLZ = String.valueOf(C122284r2.LIZJ(nLEEditor));
        C82188WNk c82188WNk2 = this.LIZ;
        XVD LIZ = XVD.LIZ(c82188WNk2.LLIIIJ, null, null, null, null, c82188WNk2.LLJILJIL().getEnterMethod(), this.LIZ.LLJILJIL().Rp0(), null, 90111);
        C82188WNk c82188WNk3 = this.LIZ;
        XVC.LJII(LIZ, c82188WNk3.LJLLILLLL, c82188WNk3.LJLJL, c82188WNk3.LJZ, c82188WNk3.LJLZ, !c82188WNk3.LLI, C44384HbQ.LJLLLLLL(c82188WNk3.LLJILJILJ()));
    }

    @Override // X.WGL
    public final void LIZIZ() {
        C82188WNk c82188WNk = this.LIZ;
        int i = c82188WNk.LJLJLLL;
        c82188WNk.LJLJLJ = i;
        InterfaceC82187WNj interfaceC82187WNj = c82188WNk.LLIIII;
        if (interfaceC82187WNj != null) {
            interfaceC82187WNj.Wh((i * 1.0f) / c82188WNk.LJLLILLLL, i, false);
            c82188WNk.LJLL = c82188WNk.LJLLI;
            c82188WNk.LJLILLLLZI.LIZ();
            c82188WNk.LJLILLLLZI.LIZLLL(true, c82188WNk.LJLJLJ, new C145555nT(), c82188WNk.LJZ);
            FrameLayout frameLayout = this.LIZ.LLII;
            if (frameLayout != null) {
                frameLayout.setVisibility(4);
                InterfaceC82196WNs mobHelper = this.LIZ.LJZL;
                o.LJIIIIZZ(mobHelper, "mobHelper");
                C82188WNk c82188WNk2 = this.LIZ;
                XVC.LJI(XVD.LIZ(c82188WNk2.LLIIIJ, null, null, null, null, c82188WNk2.LLJILJIL().getEnterMethod(), this.LIZ.LLJILJIL().Rp0(), null, 90111), null);
                return;
            }
            o.LJIJI("mParentLayout");
            throw null;
        }
        o.LJIJI("mCutMusicPanel");
        throw null;
    }

    public C82189WNl(C82188WNk c82188WNk) {
        this.LIZ = c82188WNk;
    }

    @Override // X.WGL
    public final int LIZJ(float f) {
        return (int) (this.LIZ.LJLLILLLL * f);
    }

    @Override // X.WGL
    public final void LIZLLL(float f) {
        String str;
        C82188WNk c82188WNk = this.LIZ;
        int i = (int) (c82188WNk.LJLLILLLL * f);
        if (i > c82188WNk.LJLJLJ) {
            str = "right";
        } else {
            str = "left";
        }
        c82188WNk.LJLJLJ = i;
        c82188WNk.LJLILLLLZI.LIZIZ(i, c82188WNk.LJZ);
        C82188WNk c82188WNk2 = this.LIZ;
        XVD LIZ = XVD.LIZ(c82188WNk2.LLIIIJ, null, null, null, null, c82188WNk2.LLJILJIL().getEnterMethod(), null, null, 122879);
        C82188WNk c82188WNk3 = this.LIZ;
        XVC.LJ(LIZ, c82188WNk3.LJLLILLLL, c82188WNk3.LJLJLJ, str);
    }
}
