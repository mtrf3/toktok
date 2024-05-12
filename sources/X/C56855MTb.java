package X;

import com.ss.android.ugc.aweme.notification.creator.model.response.NoticeFilterModel;
import com.ss.android.ugc.aweme.notification.creator.model.response.NoticeSortModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.MTb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56855MTb extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ List<C56859MTf> LJLIL;
    public final /* synthetic */ List<C56859MTf> LJLILLLLZI;
    public final /* synthetic */ C56854MTa LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ List<Integer> LJLJJL;
    public final /* synthetic */ List<NoticeSortModel> LJLJJLL;
    public final /* synthetic */ List<NoticeFilterModel> LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56855MTb(List<C56859MTf> list, List<C56859MTf> list2, C56854MTa c56854MTa, int i, List<Integer> list3, List<NoticeSortModel> list4, List<NoticeFilterModel> list5) {
        super(0);
        this.LJLIL = list;
        this.LJLILLLLZI = list2;
        this.LJLJI = c56854MTa;
        this.LJLJJI = i;
        this.LJLJJL = list3;
        this.LJLJJLL = list4;
        this.LJLJL = list5;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        if (this.LJLIL.size() != this.LJLILLLLZI.size() && (!this.LJLILLLLZI.isEmpty())) {
            C03150Al LIZ = C03200Aq.LIZ(new C56858MTe(this.LJLIL, this.LJLILLLLZI), true);
            ((ArrayList) this.LJLJI.LJLILLLLZI).clear();
            ((ArrayList) this.LJLJI.LJLILLLLZI).addAll(this.LJLILLLLZI);
            LIZ.LIZJ(this.LJLJI);
        } else {
            ((ArrayList) this.LJLJI.LJLILLLLZI).clear();
            ((ArrayList) this.LJLJI.LJLILLLLZI).addAll(this.LJLILLLLZI);
            ViewOnClickListenerC86063Xq7 viewOnClickListenerC86063Xq7 = this.LJLJI.LJLJI;
            if (viewOnClickListenerC86063Xq7 != null) {
                viewOnClickListenerC86063Xq7.L(new C56859MTf(this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL));
            }
        }
        return C76800UCe.LIZ;
    }
}
