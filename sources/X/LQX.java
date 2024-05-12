package X;

import com.bytedance.ies.abmock.SettingsManager;

/* loaded from: classes10.dex */
public final class LQX extends AbstractC65781Prl implements InterfaceC65784Pro<LQV> {
    public static final LQX LJLIL = new LQX();

    public LQX() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.LQV, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final LQV invoke() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        LQV lqv = LQW.LIZ;
        ?? LJIIIIZZ = LIZLLL.LJIIIIZZ("me_tab_red_dot_settings", LQV.class, lqv);
        if (LJIIIIZZ == 0) {
            return lqv;
        }
        return LJIIIIZZ;
    }
}
