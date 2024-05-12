package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.pns.universalpopup.api.UniversalPopupService2;
import com.ss.android.ugc.aweme.pns.universalpopup.api.network.UniversalPopupApi;
import com.ss.android.ugc.aweme.pns.universalpopup.core.UniversalPopupManager2;
import kotlin.jvm.internal.o;

/* renamed from: X.FcC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39336FcC extends AbstractC65781Prl implements InterfaceC65784Pro<UniversalPopupService2> {
    public static final C39336FcC LJLIL = new C39336FcC();

    public C39336FcC() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final UniversalPopupService2 invoke() {
        UniversalPopupService2 invoke$lambda$0 = UniversalPopupManager2.LIZLLL();
        o.LJIIIIZZ(invoke$lambda$0, "invoke$lambda$0");
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        invoke$lambda$0.LIZJ((UniversalPopupApi) C77800Ug8.LIZIZ(str, "API_URL_PREFIX_SI", LIZLLL, str, UniversalPopupApi.class), false);
        C39339FcF.LIZ(invoke$lambda$0);
        return invoke$lambda$0;
    }
}
