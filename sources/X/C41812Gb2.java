package X;

import com.ss.android.ugc.aweme.account.login.auth.ui.ru_instant_login.GetTicketResponse;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Gb2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41812Gb2<T> implements InterfaceC66992k3 {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    public C41812Gb2(String str, String str2, String str3) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
    }

    @Override // X.InterfaceC66992k3
    public final void subscribe(InterfaceC65052gv<GetTicketResponse> interfaceC65052gv) {
        C82727WdP.LJFF = AbstractC73672Svk.LJJIJIIJI(1L, TimeUnit.SECONDS).LJJJJZI(new C82724WdM(this.LJLIL, this.LJLILLLLZI, this.LJLJI, (C73578SuE) interfaceC65052gv));
    }
}
