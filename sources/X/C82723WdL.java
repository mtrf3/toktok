package X;

import com.ss.android.ugc.aweme.account.login.auth.ui.ru_instant_login.GetTicketResponse;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.WdL, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82723WdL<T, R> implements InterfaceC48038ItG {
    public final /* synthetic */ BaseAccountFlowFragment LJLIL;
    public final /* synthetic */ C68322mC<String> LJLILLLLZI;

    public C82723WdL(BaseAccountFlowFragment baseAccountFlowFragment, C68322mC<String> c68322mC) {
        this.LJLIL = baseAccountFlowFragment;
        this.LJLILLLLZI = c68322mC;
    }

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        String str;
        GetTicketResponse getTicketResponse = (GetTicketResponse) obj;
        o.LJIIIZ(getTicketResponse, "getTicketResponse");
        if (getTicketResponse.code == 0) {
            GetTicketResponse.Data data = getTicketResponse.data;
            if (data == null || (str = data.ticket) == null || str.length() == 0) {
                throw new C36241EKf(-1, "ticket is empty", "polling si login ticket error");
            }
            return AbstractC73638SvC.LJI(new C82732WdU(this.LJLIL, getTicketResponse, this.LJLILLLLZI));
        }
        throw new C36241EKf(getTicketResponse.code, getTicketResponse.message, "polling si login ticket error");
    }
}
