package X;

import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.Wey, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82824Wey implements InterfaceC82842WfG {
    public final /* synthetic */ C82823Wex LIZ;

    @Override // X.InterfaceC82842WfG
    public final void LIZJ() {
        C82823Wex c82823Wex = this.LIZ;
        if (c82823Wex.LJIIIIZZ) {
            return;
        }
        I19 i19 = c82823Wex.LJIIJ;
        i19.LIZLLL = true;
        i19.LIZIZ = null;
        i19.LIZJ = null;
        c82823Wex.LIZJ();
    }

    @Override // X.InterfaceC82842WfG
    public final void LIZLLL() {
        C82823Wex c82823Wex = this.LIZ;
        if (c82823Wex.LJIIIIZZ) {
            return;
        }
        I19 i19 = c82823Wex.LJIIJ;
        i19.LJ = true;
        i19.LIZ = null;
        c82823Wex.LIZJ();
    }

    @Override // X.InterfaceC82842WfG
    public final void LJ() {
        C82823Wex c82823Wex = this.LIZ;
        if (c82823Wex.LJIIIIZZ) {
            return;
        }
        I19 i19 = c82823Wex.LJIIJ;
        i19.LIZLLL = true;
        i19.LIZIZ = null;
        i19.LIZJ = null;
        i19.LJFF = true;
        c82823Wex.LIZJ();
    }

    public C82824Wey(C82823Wex c82823Wex) {
        this.LIZ = c82823Wex;
    }

    @Override // X.InterfaceC82842WfG
    public final void LIZ(AVMusic avMusic) {
        o.LJIIIZ(avMusic, "avMusic");
        if (this.LIZ.LJIIIIZZ) {
            return;
        }
        String LJIIJJI = C44172HVg.LJI.LJIIJJI(avMusic);
        if (!C1B6.LIZIZ(LJIIJJI)) {
            LJIIJJI = null;
        }
        C82823Wex c82823Wex = this.LIZ;
        c82823Wex.LJIIJ.LIZLLL = true;
        avMusic.setMusicBeginTime(c82823Wex.LIZIZ.creativeModel.reuseSoundAndEffectModel.getMusicStartTime());
        avMusic.setMusicEndTime(this.LIZ.LIZIZ.creativeModel.reuseSoundAndEffectModel.getMusicEndTime());
        C82823Wex c82823Wex2 = this.LIZ;
        I19 i19 = c82823Wex2.LJIIJ;
        i19.LIZIZ = avMusic;
        if (LJIIJJI != null) {
            i19.LIZJ = LJIIJJI;
        }
        c82823Wex2.LIZJ();
    }

    @Override // X.InterfaceC82842WfG
    public final void LIZIZ(Effect effect) {
        C82823Wex c82823Wex = this.LIZ;
        if (c82823Wex.LJIIIIZZ) {
            return;
        }
        c82823Wex.LJIIJ.LJ = true;
        if (!C44329HaX.LIZ(effect)) {
            C82823Wex c82823Wex2 = this.LIZ;
            c82823Wex2.LJIIJ.LIZ = effect;
            c82823Wex2.LIZJ.LLLLL().LJJJ(new C74389THl(C47261Igj.LJJIJ(effect), 0, 1, 26));
            this.LIZ.LJI.g00(C47261Igj.LJJIJ(effect), true);
        }
        this.LIZ.LIZJ();
    }
}
