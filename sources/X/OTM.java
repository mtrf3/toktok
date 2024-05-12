package X;

import Y.IDComparatorS38S0000000_10;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.authorize.viewmodel.AuthCommonViewModel;
import com.ss.android.ugc.aweme.openauthorize.entity.AuthorizedPage;
import com.ss.android.ugc.aweme.openauthorize.entity.AuthorizedPageDetail;
import com.ss.android.ugc.aweme.openauthorize.entity.AuthorizedScope;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OTM implements InterfaceC61956OTg {
    public final /* synthetic */ boolean LIZ;
    public final /* synthetic */ AuthCommonViewModel LIZIZ;
    public final /* synthetic */ String LIZJ;

    @Override // X.InterfaceC61956OTg
    public final void LIZ(AuthorizedPage response) {
        o.LJIIIZ(response, "response");
        this.LIZIZ.LJLJLJ.postValue(response);
    }

    @Override // X.InterfaceC61956OTg
    public final void LIZIZ(AuthorizedPage response) {
        boolean z;
        List<AuthorizedScope> scopeList;
        o.LJIIIZ(response, "response");
        Boolean isLite = response.isLite();
        if (isLite != null) {
            z = isLite.booleanValue();
            if (z && this.LIZ) {
                AuthCommonViewModel authCommonViewModel = this.LIZIZ;
                authCommonViewModel.gv0(authCommonViewModel.LJLJI);
                return;
            }
        } else {
            z = false;
        }
        AuthorizedPageDetail pageDetail = response.getPageDetail();
        if (pageDetail == null || pageDetail.getScopeList() == null || z) {
            this.LIZIZ.LJLJLJ.postValue(response);
            return;
        }
        AuthorizedPageDetail pageDetail2 = response.getPageDetail();
        if (pageDetail2 != null && (scopeList = pageDetail2.getScopeList()) != null) {
            String str = this.LIZJ;
            AuthCommonViewModel authCommonViewModel2 = this.LIZIZ;
            boolean z2 = this.LIZ;
            List LLJILJILJ = ORZ.LLJILJILJ(scopeList);
            int size = scopeList.size();
            for (int i = 0; i < size; i++) {
                if (!o.LJ(((AuthorizedScope) ListProtector.get(scopeList, i)).isEnabled(), Boolean.FALSE)) {
                    str = C60652Zp.LIZ(i, str, scopeList);
                }
            }
            OT6 ot6 = authCommonViewModel2.LJLJI;
            ot6.LJII = str;
            if (z2) {
                authCommonViewModel2.gv0(ot6);
                return;
            }
            AuthorizedPageDetail pageDetail3 = response.getPageDetail();
            if (pageDetail3 != null) {
                pageDetail3.setScopeList(ORZ.LLJILJILJ(ORZ.LLILII(new IDComparatorS38S0000000_10(15), LLJILJILJ)));
            }
            authCommonViewModel2.LJLJLJ.postValue(response);
        }
    }

    public OTM(boolean z, AuthCommonViewModel authCommonViewModel, String str) {
        this.LIZ = z;
        this.LIZIZ = authCommonViewModel;
        this.LIZJ = str;
    }
}
