package Y;

import X.ARI;
import X.ARN;
import X.AbstractC73672Svk;
import X.ActivityC45651qj;
import X.C188497aX;
import X.C192487gy;
import X.C193277iF;
import X.C47261Igj;
import X.C73320Sq4;
import X.C73422Sri;
import X.C73969T1h;
import X.C76800UCe;
import X.C78999UzT;
import X.InterfaceC174316sl;
import X.InterfaceC88472Yns;
import X.RTU;
import X.T16;
import android.content.res.Resources;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment;
import com.ss.android.ugc.aweme.comment.detailpage.ui.CommentInputFragment;
import com.ss.android.ugc.aweme.comment.gift.model.GiftStruct;
import com.ss.android.ugc.aweme.comment.gift.model.GiftViewModel;
import com.ss.android.ugc.aweme.favorites.business.collection.AllFavoriteFragment;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionContentFragment;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionManageRequest;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class AObjectS85S0300000_3 implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS85S0300000_3 aObjectS85S0300000_3, Object obj) {
        AbstractC73672Svk<BaseResponse> unFavorites;
        ARN eventArgs = (ARN) obj;
        o.LJIIIZ(eventArgs, "eventArgs");
        C193277iF c193277iF = new C192487gy().LIZJ;
        String aid = ((Aweme) aObjectS85S0300000_3.l0).getAid();
        o.LJIIIIZZ(aid, "aweme.aid");
        String str = ((CollectionContentFragment) aObjectS85S0300000_3.l1).Ml().id;
        c193277iF.getClass();
        if (str != null) {
            AbstractC73672Svk<BaseResponse> unFavorites2 = c193277iF.LJLIL.LIZ.unFavorites(aid, 0);
            C73422Sri LJJJIL = c193277iF.LJJJIL(new CollectionManageRequest(11, str, null, null, null, null, C47261Igj.LJJIJ(aid), null, null, 444, null));
            RTU rtu = new RTU() { // from class: X.7hg
                @Override // X.RTU
                public final Object apply(Object unfavoriteResp, Object manageResp) {
                    o.LJIIIZ(unfavoriteResp, "unfavoriteResp");
                    o.LJIIIZ(manageResp, "manageResp");
                    return unfavoriteResp;
                }
            };
            unFavorites2.getClass();
            C73320Sq4.LIZ(LJJJIL, "other is null");
            unFavorites = AbstractC73672Svk.LJJLL(unFavorites2, LJJJIL, rtu);
        } else {
            unFavorites = c193277iF.LJLIL.LIZ.unFavorites(aid, 0);
        }
        C78999UzT.LJFF(unFavorites.LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS52S0200000_3((CollectionContentFragment) aObjectS85S0300000_3.l1, (Aweme) aObjectS85S0300000_3.l0, 7), new AfS53S0100000_1((ActivityC45651qj) aObjectS85S0300000_3.l2, 22)), ((CollectionContentFragment) aObjectS85S0300000_3.l1).Kl());
        eventArgs.LIZ().LIZIZ(null);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AObjectS85S0300000_3 aObjectS85S0300000_3, Object obj) {
        ARN eventArgs = (ARN) obj;
        o.LJIIIZ(eventArgs, "eventArgs");
        C193277iF c193277iF = new C192487gy().LIZJ;
        String aid = ((Aweme) aObjectS85S0300000_3.l0).getAid();
        o.LJIIIIZZ(aid, "aweme.aid");
        C78999UzT.LJFF(c193277iF.LJLIL.LIZ.unFavorites(aid, 0).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS52S0200000_3((Aweme) aObjectS85S0300000_3.l0, (AllFavoriteFragment) aObjectS85S0300000_3.l1, 8), new AfS53S0100000_1((ActivityC45651qj) aObjectS85S0300000_3.l2, 23)), ((AllFavoriteFragment) aObjectS85S0300000_3.l1).Kl());
        eventArgs.LIZ().LIZIZ(null);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AObjectS85S0300000_3 aObjectS85S0300000_3, Object obj) {
        CommentInputFragment commentInputFragment = (CommentInputFragment) aObjectS85S0300000_3.l0;
        GiftStruct giftStruct = (GiftStruct) aObjectS85S0300000_3.l1;
        GiftViewModel giftViewModel = (GiftViewModel) aObjectS85S0300000_3.l2;
        commentInputFragment.getClass();
        ((ARN) obj).LIZJ = true;
        C188497aX.LIZ(commentInputFragment.mo49getActivity(), giftStruct.getDiamondCount(), giftViewModel, commentInputFragment.mo49getActivity().getSupportFragmentManager(), false);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AObjectS85S0300000_3 aObjectS85S0300000_3, Object obj) {
        CommentListFragment commentListFragment = (CommentListFragment) aObjectS85S0300000_3.l0;
        Resources resources = (Resources) aObjectS85S0300000_3.l1;
        InterfaceC174316sl interfaceC174316sl = (InterfaceC174316sl) aObjectS85S0300000_3.l2;
        ARI ari = (ARI) obj;
        commentListFragment.getClass();
        ari.LJI = true;
        ari.LJII(resources.getString(R.string.dky), new AObjectS121S0200000_3(commentListFragment, interfaceC174316sl, 4));
        ari.LJIIIZ(resources.getString(R.string.dkx), new AObjectS42S0101000_5(4, commentListFragment, 32));
        return null;
    }

    public static final Object invoke$4(AObjectS85S0300000_3 aObjectS85S0300000_3, Object obj) {
        CommentListFragment commentListFragment = (CommentListFragment) aObjectS85S0300000_3.l0;
        GiftStruct giftStruct = (GiftStruct) aObjectS85S0300000_3.l1;
        GiftViewModel giftViewModel = (GiftViewModel) aObjectS85S0300000_3.l2;
        commentListFragment.getClass();
        ((ARN) obj).LIZJ = true;
        ActivityC45651qj activityC45651qj = commentListFragment.LLLLJ;
        if (activityC45651qj != null) {
            C188497aX.LIZ(commentListFragment.LLLLJ, giftStruct.getDiamondCount(), giftViewModel, activityC45651qj.getSupportFragmentManager(), commentListFragment.LJLILLLLZI.isSplitMode());
        }
        return C76800UCe.LIZ;
    }

    public AObjectS85S0300000_3(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
