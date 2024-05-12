package Y;

import X.C16880lQ;
import X.C189927cq;
import X.C200567u0;
import X.C2061987j;
import X.C55096Ljo;
import X.C55230Lly;
import X.C73969T1h;
import X.InterfaceC199107re;
import X.InterfaceC64592gB;
import X.InterfaceC88471Ynr;
import X.JJ4;
import X.T16;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.collect.PoiCollectStatusViewModel;
import com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewListItemCell;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.prefab.ability.RefreshAbility;
import com.ss.android.ugc.aweme.viewmodel.PostDiggViewModel;

/* loaded from: classes4.dex */
public class IDgS137S0200000_3 implements JJ4 {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final /* synthetic */ void LIZIZ$0(IDgS137S0200000_3 iDgS137S0200000_3) {
    }

    public static final void LIZIZ$1(IDgS137S0200000_3 iDgS137S0200000_3) {
    }

    public static final /* synthetic */ void LIZIZ$2(IDgS137S0200000_3 iDgS137S0200000_3) {
    }

    public static final /* synthetic */ void LIZIZ$3(IDgS137S0200000_3 iDgS137S0200000_3) {
    }

    public static final /* synthetic */ void LIZIZ$4(IDgS137S0200000_3 iDgS137S0200000_3) {
    }

    public static final void LIZIZ$5(IDgS137S0200000_3 iDgS137S0200000_3) {
    }

    public static final void LIZIZ$6(IDgS137S0200000_3 iDgS137S0200000_3) {
    }

    public static final /* synthetic */ void LIZIZ$7(IDgS137S0200000_3 iDgS137S0200000_3) {
    }

    @Override // X.JJ4
    public final void LIZ() {
        switch (this.$t) {
            case 0:
                LIZ$0(this);
                return;
            case 1:
                LIZ$1(this);
                return;
            case 2:
                LIZ$2(this);
                return;
            case 3:
                LIZ$3(this);
                return;
            case 4:
                LIZ$4(this);
                return;
            case 5:
                LIZ$5(this);
                return;
            case 6:
                LIZ$6(this);
                return;
            case 7:
                LIZ$7(this);
                return;
            default:
                return;
        }
    }

    @Override // X.JJ4
    public final /* synthetic */ void LIZIZ() {
        switch (this.$t) {
            case 0:
                LIZIZ$0(this);
                return;
            case 1:
                LIZIZ$1(this);
                return;
            case 2:
                LIZIZ$2(this);
                return;
            case 3:
                LIZIZ$3(this);
                return;
            case 4:
                LIZIZ$4(this);
                return;
            case 5:
                LIZIZ$5(this);
                return;
            case 6:
                LIZIZ$6(this);
                return;
            case 7:
                LIZIZ$7(this);
                return;
            default:
                return;
        }
    }

    public static final void LIZ$0(IDgS137S0200000_3 iDgS137S0200000_3) {
        ((VideoDiggVM) iDgS137S0200000_3.l0).vv0((InterfaceC88471Ynr) iDgS137S0200000_3.l1);
    }

    public static final void LIZ$1(IDgS137S0200000_3 iDgS137S0200000_3) {
        View view;
        RefreshAbility refreshAbility;
        String I3 = ((PoiCollectStatusBaseAssem) iDgS137S0200000_3.l0).I3();
        if (I3 == null) {
            return;
        }
        PoiCollectStatusViewModel O3 = ((PoiCollectStatusBaseAssem) iDgS137S0200000_3.l0).O3();
        O3.getClass();
        PoiListApi.LIZ.getClass();
        C189927cq.LIZ().getPoiDetail(I3).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS55S0100000_3(O3, 66), new InterfaceC64592gB() { // from class: X.7dH
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        });
        Fragment fragment = (Fragment) iDgS137S0200000_3.l1;
        if (fragment != null && (refreshAbility = (RefreshAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(fragment, null), RefreshAbility.class, null)) != null) {
            refreshAbility.refresh();
        }
        Fragment fragment2 = (Fragment) iDgS137S0200000_3.l1;
        if (fragment2 != null && (view = fragment2.getView()) != null) {
            view.post(new ARunnableS4S1100000_3((PoiCollectStatusBaseAssem) iDgS137S0200000_3.l0, I3, 1));
        }
    }

    public static final void LIZ$2(IDgS137S0200000_3 iDgS137S0200000_3) {
        ((PostDiggViewModel) iDgS137S0200000_3.l0).kv0((InterfaceC88471Ynr) iDgS137S0200000_3.l1);
    }

    public static final void LIZ$3(IDgS137S0200000_3 iDgS137S0200000_3) {
        ((C2061987j) iDgS137S0200000_3.l0).LIZJ((Context) iDgS137S0200000_3.l1);
    }

    public static final void LIZ$4(IDgS137S0200000_3 iDgS137S0200000_3) {
        ((C200567u0) iDgS137S0200000_3.l0).LIZIZ((Aweme) iDgS137S0200000_3.l1);
    }

    public static final void LIZ$5(IDgS137S0200000_3 iDgS137S0200000_3) {
        boolean z;
        Boolean bool;
        InterfaceC199107re interfaceC199107re = ((PoiReviewListItemCell) iDgS137S0200000_3.l0).LJLIL;
        if (interfaceC199107re != null) {
            PoiReviewsApi.PoiReviewModel poiReviewModel = (PoiReviewsApi.PoiReviewModel) iDgS137S0200000_3.l1;
            PoiReviewsApi.PoiReviewUserStatusModel poiReviewUserStatusModel = poiReviewModel.userStatus;
            if (poiReviewUserStatusModel != null && (bool = poiReviewUserStatusModel.disliked) != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            interfaceC199107re.M00(poiReviewModel, z);
        }
    }

    public static final void LIZ$6(IDgS137S0200000_3 iDgS137S0200000_3) {
        boolean z;
        Boolean bool;
        InterfaceC199107re interfaceC199107re = ((PoiReviewListItemCell) iDgS137S0200000_3.l0).LJLIL;
        if (interfaceC199107re != null) {
            PoiReviewsApi.PoiReviewModel poiReviewModel = (PoiReviewsApi.PoiReviewModel) iDgS137S0200000_3.l1;
            PoiReviewsApi.PoiReviewUserStatusModel poiReviewUserStatusModel = poiReviewModel.userStatus;
            if (poiReviewUserStatusModel != null && (bool = poiReviewUserStatusModel.liked) != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            interfaceC199107re.Kl(poiReviewModel, z);
        }
    }

    public static final void LIZ$7(IDgS137S0200000_3 iDgS137S0200000_3) {
        CommentListFragment commentListFragment = (CommentListFragment) iDgS137S0200000_3.l0;
        Comment comment = (Comment) iDgS137S0200000_3.l1;
        commentListFragment.getClass();
        new Handler(C16880lQ.LLJJJJ()).postDelayed(new IDRunnableS0S0201000(2, commentListFragment, comment, 4), 500L);
    }

    public IDgS137S0200000_3(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
