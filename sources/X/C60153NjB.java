package X;

import com.bytedance.hybrid.web.extension.components.scc.network.DefaultNetAdapter;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.m;

/* renamed from: X.NjB, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60153NjB extends AbstractC65781Prl implements InterfaceC88472Yns<AbstractC60629Nqr<?>, C76800UCe> {
    public static final C60153NjB LJLIL = new C60153NjB();

    public C60153NjB() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(AbstractC60629Nqr<?> abstractC60629Nqr) {
        AbstractC60629Nqr<?> abstractC60629Nqr2 = abstractC60629Nqr;
        if (abstractC60629Nqr2 instanceof C60649NrB) {
            C60649NrB c60649NrB = (C60649NrB) abstractC60629Nqr2;
            SettingsManager LIZLLL = SettingsManager.LIZLLL();
            m mVar = C60154NjC.LIZ;
            m mVar2 = (m) LIZLLL.LJIIIIZZ("music_scc_sdk", m.class, mVar);
            if (mVar2 != null) {
                mVar = mVar2;
            }
            c60649NrB.LJFF(mVar);
            C60156NjE c60156NjE = new C60156NjE();
            synchronized (C60649NrB.class) {
                if (C38639FEl.LIZ() == null) {
                    C38639FEl.LIZLLL(new DefaultNetAdapter(c60156NjE));
                }
            }
            c60649NrB.LJLJLJ = new C60121Nif(abstractC60629Nqr2);
        }
        return C76800UCe.LIZ;
    }
}
