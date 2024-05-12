package Y;

import X.C10I;
import X.C10K;
import X.C26045AKb;
import X.C56743MOt;
import X.C56760MPk;
import X.C76800UCe;
import android.content.Context;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.inbox.widget.multi.InboxFollowerAdapter;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.zhiliaoapp.musically.R;

/* loaded from: classes10.dex */
public class AgS76S0300000_9 implements C10I {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.C10I
    public final Object then(C10K c10k) {
        switch (this.$t) {
            case 0:
                return then$0(this, c10k);
            case 1:
                return then$1(this, c10k);
            default:
                return null;
        }
    }

    public static final Object then$0(AgS76S0300000_9 agS76S0300000_9, C10K c10k) {
        if (c10k.LJIIJ() != null) {
            C26045AKb c26045AKb = new C26045AKb(((InboxFollowerAdapter) agS76S0300000_9.l0).mFragment);
            c26045AKb.LJIIIZ(((Context) agS76S0300000_9.l1).getString(R.string.hfw));
            c26045AKb.LJIIJ();
        }
        C56760MPk.LIZLLL((MusNotice) agS76S0300000_9.l2, (BaseResponse) c10k.LJIIJJI(), c10k.LJIIJ());
        return C76800UCe.LIZ;
    }

    public static final Object then$1(AgS76S0300000_9 agS76S0300000_9, C10K c10k) {
        if (c10k.LJIIJ() != null) {
            C26045AKb c26045AKb = new C26045AKb(((C56743MOt) agS76S0300000_9.l0).LJLIL);
            c26045AKb.LJIIIZ(((Context) agS76S0300000_9.l1).getString(R.string.hfw));
            c26045AKb.LJIIJ();
        }
        C56760MPk.LIZLLL((MusNotice) agS76S0300000_9.l2, (BaseResponse) c10k.LJIIJJI(), c10k.LJIIJ());
        return C76800UCe.LIZ;
    }

    public AgS76S0300000_9(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
