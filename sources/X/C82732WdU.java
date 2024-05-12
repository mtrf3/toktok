package X;

import Y.AfS20S1200000_11;
import Y.AfS24S1100000_11;
import Y.AfS66S0100000_14;
import com.ss.android.ugc.aweme.account.login.auth.ui.ru_instant_login.GetTicketResponse;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.WdU, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82732WdU<T> implements InterfaceC66992k3 {
    public final /* synthetic */ BaseAccountFlowFragment LJLIL;
    public final /* synthetic */ GetTicketResponse LJLILLLLZI;
    public final /* synthetic */ C68322mC<String> LJLJI;

    public C82732WdU(BaseAccountFlowFragment baseAccountFlowFragment, GetTicketResponse getTicketResponse, C68322mC<String> c68322mC) {
        this.LJLIL = baseAccountFlowFragment;
        this.LJLILLLLZI = getTicketResponse;
        this.LJLJI = c68322mC;
    }

    @Override // X.InterfaceC66992k3
    public final void subscribe(InterfaceC65052gv<Integer> interfaceC65052gv) {
        String str;
        BaseAccountFlowFragment fragment = this.LJLIL;
        GetTicketResponse.Data data = this.LJLILLLLZI.data;
        if (data == null || (str = data.ticket) == null) {
            str = "";
        }
        String str2 = this.LJLJI.element;
        o.LJIIIZ(fragment, "fragment");
        C68972R5c.LJIIIIZZ(Boolean.FALSE, "instant_login_si", fragment, false, null, 24);
        LinkedHashMap LIZ = C0JU.LIZ("ticket", str);
        if (!C78685UuP.LJJJZ(null)) {
            if (C78685UuP.LJJJZ(str2)) {
                o.LJI(str2);
                LIZ.put("token", str2);
            }
            C73578SuE c73578SuE = (C73578SuE) interfaceC65052gv;
            C73636SvA.LIZ(fragment, fragment, new C73596SuW(AbstractC73635Sv9.LJ(new C69055R8h(fragment, "/passport/carrier_auth/login_only/", LIZ)).LJIIIZ(new AfS20S1200000_11(fragment, fragment, 1)).LJIIIIZZ(new AfS24S1100000_11(fragment, 4)).LJIIIZ(new AfS66S0100000_14(c73578SuE, 28)), new C82731WdT(c73578SuE))).LJIILL();
            return;
        }
        o.LJI(null);
        throw null;
    }
}
