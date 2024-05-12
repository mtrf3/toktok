package X;

import androidx.fragment.app.Fragment;
import com.bytedance.router.fragment.NavigationUtils;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.main.MainPageFragment;
import com.ss.android.ugc.aweme.main.TabChangeManager;

/* renamed from: X.LQa, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54228LQa extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ C54229LQb LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54228LQa(C54229LQb c54229LQb, boolean z, String str) {
        super(0);
        this.LJLIL = c54229LQb;
        this.LJLILLLLZI = z;
        this.LJLJI = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        ActivityC45651qj activityC45651qj;
        String str;
        ActivityC45651qj mo49getActivity;
        C54229LQb c54229LQb = this.LJLIL;
        boolean z = this.LJLILLLLZI;
        String str2 = this.LJLJI;
        c54229LQb.getClass();
        int LJIIJJI = C54362LVe.LJIIJJI();
        int LJIIJ = C54362LVe.LJIIJ();
        int LJIILIIL = C54362LVe.LJIILIIL(260);
        C68322mC c68322mC = new C68322mC();
        String str3 = "";
        c68322mC.element = "";
        MainPageFragment mainPageFragment = c54229LQb.LIZ;
        Fragment fragment = null;
        if (mainPageFragment != null && (mo49getActivity = mainPageFragment.mo49getActivity()) != null) {
            InterfaceC36571c5 findTopFragment = NavigationUtils.findTopFragment(com.bytedance.hox.Hox.LJLLI.LIZ(mo49getActivity).Ja("NOTIFICATION"));
            T t = str3;
            if (findTopFragment instanceof InterfaceC27853AwT) {
                InterfaceC27853AwT interfaceC27853AwT = (InterfaceC27853AwT) findTopFragment;
                t = str3;
                if (interfaceC27853AwT != null) {
                    String pageName = interfaceC27853AwT.getPageName();
                    t = str3;
                    if (pageName != null) {
                        t = pageName;
                    }
                }
            }
            c68322mC.element = t;
        }
        EnumC57165Mc5 enumC57165Mc5 = EnumC57165Mc5.CONTACTS;
        MainPageFragment mainPageFragment2 = c54229LQb.LIZ;
        if (mainPageFragment2 != null) {
            activityC45651qj = mainPageFragment2.mo49getActivity();
        } else {
            activityC45651qj = null;
        }
        if (enumC57165Mc5.decideDisplay(activityC45651qj, c54229LQb.LIZ) != EnumC56648MLc.GONE) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        TabChangeManager tabChangeManager = c54229LQb.LIZIZ;
        if (tabChangeManager != null) {
            fragment = tabChangeManager.Ja("NOTIFICATION");
        }
        FMX.LIZIZ().execute(new LQY(z, LJIIJJI, LJIILIIL, LJIIJ, fragment, str, str2, c68322mC));
        return C76800UCe.LIZ;
    }
}
