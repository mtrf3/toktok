package X;

/* renamed from: X.DpK, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35054DpK extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C35054DpK LJLIL = new C35054DpK();

    public C35054DpK() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        try {
            if (C35820E4a.LIZ(FKM.LIZ(), 0, "ab_replace_monster_with_aweme") == 1) {
                z = true;
            }
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
        }
        return Boolean.valueOf(z);
    }
}
