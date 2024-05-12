package X;

import kotlin.jvm.internal.AqS158S0100000_8;

/* loaded from: classes9.dex */
public final class KOI extends AbstractC13940gg {
    public final float LJ = 0.01f;
    public final boolean LJFF = true;
    public final boolean LJI = true;
    public final int LJII = 10;
    public InterfaceC65784Pro<String> LJIIIIZZ;
    public final KOJ LJIIIZ;
    public final KOH LJIIJ;

    @Override // X.AbstractC13940gg
    public final int LIZIZ() {
        return this.LJII;
    }

    @Override // X.AbstractC13940gg
    public final InterfaceC65784Pro<String> LIZJ() {
        return this.LJIIIIZZ;
    }

    @Override // X.AbstractC13940gg
    public final /* bridge */ /* synthetic */ InterfaceC19520pg LIZLLL() {
        return this.LJIIJ;
    }

    @Override // X.AbstractC13940gg
    public final /* bridge */ /* synthetic */ InterfaceC19530ph LJ() {
        return this.LJIIIZ;
    }

    @Override // X.AbstractC13940gg
    public final boolean LJI() {
        return this.LJI;
    }

    @Override // X.AbstractC13940gg
    public final boolean LJII() {
        return this.LJFF;
    }

    @Override // X.AbstractC13940gg
    public final float LJIIIZ() {
        return this.LJ;
    }

    @Override // X.AbstractC13940gg
    public final void LJIIJJI(InterfaceC65784Pro<String> interfaceC65784Pro) {
        this.LJIIIIZZ = interfaceC65784Pro;
    }

    public KOI(SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, KOE koe) {
        this.LJIIIIZZ = new AqS158S0100000_8(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, 655);
        this.LJIIIZ = new KOJ(koe);
        this.LJIIJ = new KOH(koe);
    }
}
