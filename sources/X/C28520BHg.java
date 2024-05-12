package X;

import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.game.IGameTopicService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;

/* renamed from: X.BHg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28520BHg implements InterfaceC28918BWo {
    @Override // X.InterfaceC28918BWo
    public final boolean LIZ() {
        return true;
    }

    @Override // X.InterfaceC28918BWo
    public final int getErrorCode() {
        return 112;
    }

    @Override // X.InterfaceC28918BWo
    public final Object LIZIZ(BIK bik, AbstractC65782Prm abstractC65782Prm) {
        C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(abstractC65782Prm));
        LiveMode LJIL = C78934UyQ.LJIL(bik.LIZIZ);
        FragmentManager fragmentManager = null;
        if (LJIL != null) {
            BHZ.Companion.getClass();
            BHZ LIZ = BHW.LIZ(LJIL);
            if (LIZ != null && !LIZ.isSelectFinish()) {
                IGameTopicService iGameTopicService = (IGameTopicService) CN1.LIZ(IGameTopicService.class);
                ActivityC45651qj LIZIZ = C29306Beo.LIZIZ(bik.LIZ);
                if (LIZIZ != null) {
                    fragmentManager = LIZIZ.getSupportFragmentManager();
                }
                C28516BHc c28516BHc = new C28516BHc(LIZ, c84654XKg, bik);
                LiveMode LJIL2 = C78934UyQ.LJIL(bik.LIZIZ);
                if (LJIL2 == null) {
                    LJIL2 = LiveMode.SCREEN_RECORD;
                }
                iGameTopicService.zu0(fragmentManager, c28516BHc, LIZ, LJIL2);
                return c84654XKg.LIZ();
            }
        }
        Boolean bool = Boolean.FALSE;
        C3C5.m7constructorimpl(bool);
        c84654XKg.resumeWith(bool);
        return c84654XKg.LIZ();
    }
}
