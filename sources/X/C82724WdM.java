package X;

import Y.AfS66S0100000_14;
import com.ss.android.ugc.aweme.account.login.auth.ui.ru_instant_login.GetTicketResponse;
import com.ss.android.ugc.aweme.account.login.auth.ui.ru_instant_login.IRuInstantLoginApi;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.WdM, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82724WdM<T> implements InterfaceC64592gB {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ InterfaceC65052gv<GetTicketResponse> LJLJJI;

    public C82724WdM(String str, String str2, String str3, C73578SuE c73578SuE) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
        this.LJLJJI = c73578SuE;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        XJ3 xj3 = IRuInstantLoginApi.LIZ;
        String vendorId = this.LJLIL;
        String token = this.LJLILLLLZI;
        String str = this.LJLJI;
        xj3.getClass();
        o.LJIIIZ(vendorId, "vendorId");
        o.LJIIIZ(token, "token");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("vendor_id", vendorId);
        linkedHashMap.put("mode", "si");
        linkedHashMap.put("token", token);
        if (C78685UuP.LJJJZ(str)) {
            o.LJI(str);
            linkedHashMap.put("other", str);
        }
        AbstractC73638SvC<GetTicketResponse> loginTicket = XJ3.LIZIZ.getLoginTicket(linkedHashMap);
        InterfaceC65052gv<GetTicketResponse> interfaceC65052gv = this.LJLJJI;
        loginTicket.LJJII(new AfS66S0100000_14(interfaceC65052gv, 29), new AfS66S0100000_14(interfaceC65052gv, 30));
    }
}
