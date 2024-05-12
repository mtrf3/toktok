package X;

import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.pns.universalpopup.api.UniversalPopupService2;
import com.ss.android.ugc.aweme.pns.universalpopup.api.network.UniversalPopupApi;
import com.ss.android.ugc.aweme.pns.universalpopup.core.UniversalPopupManager2;

/* renamed from: X.FcA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39334FcA extends AbstractC65781Prl implements InterfaceC65784Pro<UniversalPopupService2> {
    public static final C39334FcA LJLIL = new C39334FcA();

    public C39334FcA() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final UniversalPopupService2 invoke() {
        UniversalPopupService2 LIZLLL = UniversalPopupManager2.LIZLLL();
        LIZLLL.LIZJ((UniversalPopupApi) RetrofitFactory.LIZLLL().create(AFI.LIZ).create(UniversalPopupApi.class), true);
        C39339FcF.LIZ(LIZLLL);
        return LIZLLL;
    }
}
