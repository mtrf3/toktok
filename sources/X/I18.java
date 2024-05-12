package X;

import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class I18 implements I1C {
    public final /* synthetic */ I15 LIZ;

    @Override // X.I1C
    public final void LIZJ() {
        I15 i15 = this.LIZ;
        if (i15.LJIIJJI) {
            return;
        }
        I19 i19 = i15.LJIILJJIL;
        i19.LIZLLL = true;
        i19.LIZIZ = null;
        i19.LIZJ = null;
        i15.LJIIIZ(0, System.currentTimeMillis() - this.LIZ.LJIIIIZZ, "music");
        this.LIZ.LJIILIIL();
    }

    @Override // X.I1C
    public final void LIZLLL() {
        I15 i15 = this.LIZ;
        if (i15.LJIIJJI) {
            return;
        }
        I19 i19 = i15.LJIILJJIL;
        i19.LJ = true;
        i19.LIZ = null;
        i15.LJIIIZ(0, System.currentTimeMillis() - this.LIZ.LJIIIZ, "effect");
        this.LIZ.LJIILIIL();
    }

    @Override // X.I1C
    public final void LJ() {
        I15 i15 = this.LIZ;
        if (i15.LJIIJJI) {
            return;
        }
        I19 i19 = i15.LJIILJJIL;
        i19.LIZLLL = true;
        i19.LIZIZ = null;
        i19.LIZJ = null;
        i19.LJFF = true;
        i15.LJIILIIL();
    }

    @Override // X.I1C
    public final void LJI() {
        I15 i15 = this.LIZ;
        if (i15.LJIIJJI) {
            return;
        }
        I19 i19 = i15.LJIILJJIL;
        i19.LJ = true;
        i19.LIZ = null;
        i15.LJIIIZ(0, System.currentTimeMillis() - this.LIZ.LJIIIZ, "effect");
        this.LIZ.LJIILIIL();
    }

    @Override // X.I1C
    public final void LJII() {
        I15 i15 = this.LIZ;
        if (i15.LJIIJJI) {
            return;
        }
        I19 i19 = i15.LJIILJJIL;
        i19.LIZLLL = true;
        i19.LIZIZ = null;
        i19.LIZJ = null;
        i15.LJIIIZ(0, System.currentTimeMillis() - this.LIZ.LJIIIIZZ, "music");
        this.LIZ.LJIILIIL();
    }

    public I18(I15 i15) {
        this.LIZ = i15;
    }

    @Override // X.I1C
    public final void LIZ(AVMusic avMusic) {
        o.LJIIIZ(avMusic, "avMusic");
        if (this.LIZ.LJIIJJI) {
            return;
        }
        String LJIIJJI = C44172HVg.LJI.LJIIJJI(avMusic);
        if (C1B6.LIZIZ(LJIIJJI) && LJIIJJI != null) {
            LJFF(avMusic, LJIIJJI);
            return;
        }
        I15 i15 = this.LIZ;
        i15.getClass();
        C44172HVg.LJI.LJIILL(i15.LIZLLL, avMusic, 6, false, new I1B(this, i15, avMusic));
    }

    @Override // X.I1C
    public final void LIZIZ(Effect effect) {
        I15 i15 = this.LIZ;
        if (i15.LJIIJJI) {
            return;
        }
        i15.LJ(effect, this);
    }

    @Override // X.I1C
    public final void LJIIIIZZ(Effect effect) {
        o.LJIIIZ(effect, "effect");
        I15 i15 = this.LIZ;
        if (i15.LJIIJJI) {
            return;
        }
        i15.LJIILLIIL(100, "effect");
        I15 i152 = this.LIZ;
        I19 i19 = i152.LJIILJJIL;
        i19.LJ = true;
        i19.LIZ = effect;
        i152.LJIIIZ(1, System.currentTimeMillis() - this.LIZ.LJIIIZ, "effect");
        this.LIZ.LJIILIIL();
    }

    @Override // X.I1C
    public final void LJFF(AVMusic avMusic, String musicFile) {
        o.LJIIIZ(avMusic, "avMusic");
        o.LJIIIZ(musicFile, "musicFile");
        I15 i15 = this.LIZ;
        if (i15.LJIIJJI) {
            return;
        }
        i15.LJIILLIIL(100, "music");
        I15 i152 = this.LIZ;
        I19 i19 = i152.LJIILJJIL;
        i19.LIZLLL = true;
        i19.LIZIZ = avMusic;
        i19.LIZJ = musicFile;
        i152.LJIIIZ(1, System.currentTimeMillis() - this.LIZ.LJIIIIZZ, "music");
        this.LIZ.LJIILIIL();
    }
}
