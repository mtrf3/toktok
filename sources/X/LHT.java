package X;

/* loaded from: classes10.dex */
public final class LHT implements F67 {
    public static final LHT LJLIL = new LHT();

    @Override // X.F67
    public final void onChanged() {
        LHR.LJ.incrementAndGet();
        LHR.LIZ.onEvent("off_changed");
    }
}
