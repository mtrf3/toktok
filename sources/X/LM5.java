package X;

import com.bytedance.tiktok.homepage.mainfragment.MFLeftIconPriority;

/* loaded from: classes10.dex */
public final class LM5 implements LML {
    public final LM4 LJLIL;

    @Override // X.LML
    public final void LIZ() {
        this.LJLIL.LIZ();
    }

    @Override // X.LML
    public final void LIZJ() {
        this.LJLIL.LIZJ();
    }

    @Override // X.LML
    public final String LJFF() {
        return this.LJLIL.getTag();
    }

    @Override // X.LML
    public final void e0() {
        this.LJLIL.LJIILJJIL();
    }

    @Override // X.LML
    public final LM4 LIZLLL() {
        return this.LJLIL;
    }

    @Override // X.LML
    public final MFLeftIconPriority LJ() {
        return MFLeftIconPriority.DYNAMIC;
    }

    @Override // X.LML
    public final LME LJI() {
        return LME.DYNAMIC;
    }

    public LM5(LM4 lm4) {
        this.LJLIL = lm4;
    }
}
