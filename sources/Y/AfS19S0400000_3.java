package Y;

import X.A2G;
import X.ActivityC45651qj;
import X.C191937g5;
import X.C26045AKb;
import X.C2U8;
import X.C68322mC;
import X.FMX;
import X.InterfaceC64592gB;
import X.InterfaceC67352kd;
import X.OSZ;
import com.ss.android.ugc.aweme.comment.likelist.model.LikeListResponse;
import com.ss.android.ugc.aweme.comment.likelist.ui.LikeListFragment;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionContentFragment;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionDetail;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionManageRequest;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* loaded from: classes4.dex */
public class AfS19S0400000_3 implements InterfaceC64592gB {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS19S0400000_3 afS19S0400000_3, Object obj) {
        long j;
        CollectionDetail.Statistic statistic;
        Long l;
        FMX.LJIILL("collection_move_videos", new OSZ("collection_video", "enter_from"), new OSZ(((CollectionContentFragment) afS19S0400000_3.l0).LJLJJI, "from"), new OSZ("", "to"));
        C2U8.LIZ(new C191937g5((CollectionManageRequest) afS19S0400000_3.l1, null));
        CollectionDetail Ml = ((CollectionContentFragment) afS19S0400000_3.l0).Ml();
        if (Ml != null && (statistic = Ml.statistic) != null && (l = statistic.total) != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        CollectionDetail.Statistic statistic2 = ((CollectionContentFragment) afS19S0400000_3.l0).Ml().statistic;
        if (statistic2 != null) {
            statistic2.total = Long.valueOf(j - ((List) afS19S0400000_3.l2).size());
        }
        ((CollectionContentFragment) afS19S0400000_3.l0).Ll().gv0(true);
        C26045AKb c26045AKb = new C26045AKb((ActivityC45651qj) afS19S0400000_3.l3);
        c26045AKb.LJIIIZ(((CollectionContentFragment) afS19S0400000_3.l0).getResources().getQuantityString(R.plurals.fp, ((List) afS19S0400000_3.l2).size(), Integer.valueOf(((List) afS19S0400000_3.l2).size())));
        c26045AKb.LJIIJ();
    }

    public static final void accept$1(AfS19S0400000_3 afS19S0400000_3, Object obj) {
        ((LikeListFragment) afS19S0400000_3.l0).Il((LikeListResponse) obj, null, (InterfaceC67352kd) afS19S0400000_3.l1, (List) afS19S0400000_3.l2, (List) ((C68322mC) afS19S0400000_3.l3).element);
    }

    public static final void accept$2(AfS19S0400000_3 afS19S0400000_3, Object obj) {
        Throwable th = (Throwable) obj;
        LikeListResponse jv0 = ((LikeListFragment) afS19S0400000_3.l0).Al().jv0();
        if (jv0 != null) {
            ((LikeListFragment) afS19S0400000_3.l0).Il(jv0, null, (InterfaceC67352kd) afS19S0400000_3.l1, (List) afS19S0400000_3.l2, (List) ((C68322mC) afS19S0400000_3.l3).element);
        } else {
            ((LikeListFragment) afS19S0400000_3.l0).Il(null, th, (InterfaceC67352kd) afS19S0400000_3.l1, (List) afS19S0400000_3.l2, (List) ((C68322mC) afS19S0400000_3.l3).element);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AfS19S0400000_3(Object obj, LikeListFragment likeListFragment, InterfaceC67352kd<? super A2G<List<User>>> interfaceC67352kd, List<? extends User> list, C68322mC<List<String>> c68322mC) {
        this.$t = c68322mC;
        this.l0 = obj;
        this.l1 = likeListFragment;
        this.l2 = interfaceC67352kd;
        this.l3 = list;
    }
}
