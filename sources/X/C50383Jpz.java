package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.viewmodel.SearchSeparateTabHorizontalVM;
import java.util.List;

/* renamed from: X.Jpz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50383Jpz implements C8BT {
    public final /* synthetic */ SearchSeparateTabHorizontalVM LJLIL;
    public final /* synthetic */ InterfaceC67352kd<List<? extends Aweme>> LJLILLLLZI;

    @Override // X.C8BT
    public final void onSuccess() {
        List<Aweme> list;
        C49825Jgz LIZJ;
        C49825Jgz LIZJ2;
        InterfaceC50390Jq6 interfaceC50390Jq6 = this.LJLIL.LJLZ;
        if (interfaceC50390Jq6 != null && (LIZJ2 = interfaceC50390Jq6.LIZJ()) != null) {
            LIZJ2.clearNotifyListener(this);
        }
        InterfaceC67352kd<List<? extends Aweme>> interfaceC67352kd = this.LJLILLLLZI;
        InterfaceC50390Jq6 interfaceC50390Jq62 = this.LJLIL.LJLZ;
        if (interfaceC50390Jq62 != null && (LIZJ = interfaceC50390Jq62.LIZJ()) != null) {
            list = LIZJ.getAwemeList();
        } else {
            list = null;
        }
        C3C5.m7constructorimpl(list);
        interfaceC67352kd.resumeWith(list);
    }

    @Override // X.C8BT
    public final void onFailed(Exception exc) {
        C49825Jgz LIZJ;
        InterfaceC50390Jq6 interfaceC50390Jq6 = this.LJLIL.LJLZ;
        if (interfaceC50390Jq6 != null && (LIZJ = interfaceC50390Jq6.LIZJ()) != null) {
            LIZJ.clearNotifyListener(this);
        }
        InterfaceC67352kd<List<? extends Aweme>> interfaceC67352kd = this.LJLILLLLZI;
        C3C5.m7constructorimpl(null);
        interfaceC67352kd.resumeWith(null);
    }

    public C50383Jpz(SearchSeparateTabHorizontalVM searchSeparateTabHorizontalVM, C84654XKg c84654XKg) {
        this.LJLIL = searchSeparateTabHorizontalVM;
        this.LJLILLLLZI = c84654XKg;
    }
}
