package X;

import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.search.model.SearchUserSugResponse;
import kotlin.jvm.internal.o;

/* renamed from: X.9sz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C250899sz extends C8BR<C250839st, InterfaceC250909t0> implements InterfaceC90243gS {
    public final C62822Ol8 LJLJJI;

    @Override // X.InterfaceC90243gS
    public final boolean LIZ() {
        SearchUserSugResponse searchUserSugResponse;
        T t = this.LJLIL;
        if (t == 0 || (searchUserSugResponse = (SearchUserSugResponse) t.getData()) == null || !searchUserSugResponse.LIZ()) {
            return false;
        }
        return true;
    }

    @Override // X.C8BR, X.InterfaceC223218pR
    public final void LJII() {
        InterfaceC250909t0 interfaceC250909t0;
        C250839st c250839st = (C250839st) this.LJLIL;
        if (c250839st != null && c250839st.LJLIL && (interfaceC250909t0 = (InterfaceC250909t0) this.LJLILLLLZI) != null) {
            interfaceC250909t0.LLIIZ();
        }
    }

    @Override // X.C8BR, X.C8BT
    public final void onSuccess() {
        String str;
        LogPbBean logPbBean;
        SearchUserSugResponse searchUserSugResponse = (SearchUserSugResponse) ((C8BS) this.LJLJJI.getValue()).getData();
        if (searchUserSugResponse == null) {
            return;
        }
        C250839st c250839st = (C250839st) this.LJLIL;
        if (c250839st != null && c250839st.LJLIL && (logPbBean = searchUserSugResponse.logPbBean) != null) {
            logPbBean.getImprId();
        }
        String str2 = searchUserSugResponse.requestId;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        C3A5.LIZ.LJFF(str2, searchUserSugResponse.logPbBean);
        InterfaceC250909t0 interfaceC250909t0 = (InterfaceC250909t0) this.LJLILLLLZI;
        if (interfaceC250909t0 != null) {
            C250859sv c250859sv = ((C250839st) this.LJLJJI.getValue()).LJLILLLLZI;
            if (c250859sv != null && (str = c250859sv.LIZJ) != null) {
                str3 = str;
            }
            interfaceC250909t0.hn0(searchUserSugResponse, str3);
        }
        InterfaceC250909t0 interfaceC250909t02 = (InterfaceC250909t0) this.LJLILLLLZI;
        if (interfaceC250909t02 != null) {
            interfaceC250909t02.h40(true);
        }
    }

    public C250899sz() {
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(C250919t1.LJLIL);
        this.LJLJJI = LIZIZ;
        LJJ((C8BS) LIZIZ.getValue());
    }

    @Override // X.InterfaceC90243gS
    public final boolean LJIJJLI() {
        return LJIL();
    }

    @Override // X.InterfaceC90243gS
    public final void LIZJ(C90253gT view) {
        o.LJIIIZ(view, "view");
        this.LJLILLLLZI = view;
    }

    @Override // X.C8BR, X.C8BT
    public final void onFailed(Exception exc) {
        InterfaceC250909t0 interfaceC250909t0 = (InterfaceC250909t0) this.LJLILLLLZI;
        if (interfaceC250909t0 != null) {
            interfaceC250909t0.LLJJI(exc);
        }
        InterfaceC250909t0 interfaceC250909t02 = (InterfaceC250909t0) this.LJLILLLLZI;
        if (interfaceC250909t02 != null) {
            interfaceC250909t02.h40(false);
        }
    }

    @Override // X.InterfaceC90243gS
    public final void LJIILJJIL(boolean z, C250859sv c250859sv) {
        LJIILL(Boolean.valueOf(z), c250859sv);
    }
}
