package X;

/* renamed from: X.Qqi, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68264Qqi extends YIR implements YIK {
    public final long LJIIJJI() {
        return ((C68260Qqe) this.LJLILLLLZI).zzi;
    }

    public final long LJIIL() {
        return ((C68260Qqe) this.LJLILLLLZI).zzh;
    }

    public final String LJIJ() {
        return ((C68260Qqe) this.LJLILLLLZI).zzg;
    }

    public C68264Qqi() {
        super(C68260Qqe.LJIJI());
    }

    public /* synthetic */ C68264Qqi(int i) {
        super(C68260Qqe.LJIJI());
    }

    public final void LJIILIIL(C68281Qqz c68281Qqz) {
        if (this.LJLJI) {
            LJIIJ();
            this.LJLJI = false;
        }
        C68260Qqe c68260Qqe = (C68260Qqe) this.LJLILLLLZI;
        YIN LJIIIIZZ = c68281Qqz.LJIIIIZZ();
        c68260Qqe.LJJII();
        c68260Qqe.zzf.add(LJIIIIZZ);
    }

    public final void LJIILJJIL(int i) {
        if (this.LJLJI) {
            LJIIJ();
            this.LJLJI = false;
        }
        C68260Qqe c68260Qqe = (C68260Qqe) this.LJLILLLLZI;
        c68260Qqe.LJJII();
        c68260Qqe.zzf.remove(i);
    }

    public final void LJIILL(String str) {
        if (this.LJLJI) {
            LJIIJ();
            this.LJLJI = false;
        }
        C68260Qqe.LJIJJ((C68260Qqe) this.LJLILLLLZI, str);
    }

    public final C68257Qqb LJIIZILJ(int i) {
        return (C68257Qqb) ((C68260Qqe) this.LJLILLLLZI).zzf.get(i);
    }

    public final void LJIILLIIL(int i, C68257Qqb c68257Qqb) {
        if (this.LJLJI) {
            LJIIJ();
            this.LJLJI = false;
        }
        C68260Qqe c68260Qqe = (C68260Qqe) this.LJLILLLLZI;
        c68260Qqe.LJJII();
        c68260Qqe.zzf.set(i, c68257Qqb);
    }
}
