package Y;

import X.ARN;
import X.ActivityC45651qj;
import X.C175976vR;
import X.C176996x5;
import X.C188497aX;
import X.C188727au;
import X.C227768wm;
import X.C26045AKb;
import X.C45804HyK;
import X.C76800UCe;
import X.FMX;
import X.InterfaceC174316sl;
import X.InterfaceC88472Yns;
import android.app.Activity;
import android.view.View;
import com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment;
import com.ss.android.ugc.aweme.comment.gift.model.GiftStruct;
import com.ss.android.ugc.aweme.comment.gift.model.GiftViewModel;
import com.ss.android.ugc.aweme.comment.keyboard.ui.KeyboardDialogFragment;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionContentFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.utils.Au2S13S0200000_3;
import com.ss.android.ugc.aweme.utils.Au2S9S0300000_3;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class AObjectS121S0200000_3 implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final Object invoke$4(AObjectS121S0200000_3 aObjectS121S0200000_3, Object obj) {
        CommentListFragment.Al((CommentListFragment) aObjectS121S0200000_3.l0, (InterfaceC174316sl) aObjectS121S0200000_3.l1);
        return null;
    }

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
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS121S0200000_3 aObjectS121S0200000_3, Object obj) {
        ARN eventArgs = (ARN) obj;
        o.LJIIIZ(eventArgs, "eventArgs");
        ((Au2S9S0300000_3) aObjectS121S0200000_3.l0).onClick(((CollectionContentFragment) aObjectS121S0200000_3.l1).getView());
        eventArgs.LIZ().LIZIZ(null);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AObjectS121S0200000_3 aObjectS121S0200000_3, Object obj) {
        ARN eventArgs = (ARN) obj;
        o.LJIIIZ(eventArgs, "eventArgs");
        ((Au2S13S0200000_3) aObjectS121S0200000_3.l0).onClick(((CollectionContentFragment) aObjectS121S0200000_3.l1).getView());
        eventArgs.LIZ().LIZIZ(null);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AObjectS121S0200000_3 aObjectS121S0200000_3, Object obj) {
        String str;
        KeyboardDialogFragment keyboardDialogFragment = (KeyboardDialogFragment) aObjectS121S0200000_3.l0;
        GiftStruct giftStruct = (GiftStruct) aObjectS121S0200000_3.l1;
        keyboardDialogFragment.getClass();
        ((ARN) obj).LIZJ = true;
        ActivityC45651qj activityC45651qj = keyboardDialogFragment.LLJJL;
        if (activityC45651qj != null) {
            C188497aX.LIZ(keyboardDialogFragment.LLJJL, giftStruct.getDiamondCount(), keyboardDialogFragment.LLJJ, activityC45651qj.getSupportFragmentManager(), keyboardDialogFragment.LLJL);
        }
        Aweme aweme = keyboardDialogFragment.LLIZ;
        String str2 = "";
        if (keyboardDialogFragment.getArguments() == null) {
            str = "";
        } else {
            str = keyboardDialogFragment.getArguments().getString("enterFrom");
        }
        GiftStruct value = keyboardDialogFragment.LLJJ.jv0().getValue();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str);
        C176996x5 c176996x5 = keyboardDialogFragment.LLJILJIL;
        if (c176996x5 != null) {
            str2 = c176996x5.LLIIII;
        }
        c188727au.LJIIIZ("enter_method", str2);
        c188727au.LJIIIZ("group_id", C227768wm.LIZIZ(aweme));
        c188727au.LJ(value.getId(), "gift_id");
        c188727au.LJIIIZ("author_id", C227768wm.LIZJ(aweme));
        FMX.LJIIL("click_comment_recharge_popup", c188727au.LIZ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AObjectS121S0200000_3 aObjectS121S0200000_3, Object obj) {
        GiftViewModel giftViewModel = (GiftViewModel) aObjectS121S0200000_3.l0;
        View view = (View) aObjectS121S0200000_3.l1;
        giftViewModel.jv0().postValue(null);
        C26045AKb c26045AKb = new C26045AKb((Activity) view.getContext());
        c26045AKb.LJIIIIZZ(R.string.tpd);
        c26045AKb.LJI(R.attr.eb);
        c26045AKb.LIZLLL(3000L);
        c26045AKb.LJIIJ();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AObjectS121S0200000_3 aObjectS121S0200000_3, Object obj) {
        AObserverS64S0300000_3 aObserverS64S0300000_3 = (AObserverS64S0300000_3) aObjectS121S0200000_3.l0;
        InterfaceC174316sl interfaceC174316sl = (InterfaceC174316sl) aObjectS121S0200000_3.l1;
        ((CommentListFragment) aObserverS64S0300000_3.l2).om(interfaceC174316sl, true);
        CommentListFragment commentListFragment = (CommentListFragment) aObserverS64S0300000_3.l2;
        Comment LIZIZ = ((C175976vR) interfaceC174316sl).LIZIZ();
        commentListFragment.getClass();
        CommentListFragment.Nn(LIZIZ, "comment_restr_pin_opt_pin_anyway_click");
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AObjectS121S0200000_3 aObjectS121S0200000_3, Object obj) {
        GiftViewModel giftViewModel = (GiftViewModel) aObjectS121S0200000_3.l0;
        View view = (View) aObjectS121S0200000_3.l1;
        giftViewModel.jv0().postValue(null);
        C26045AKb c26045AKb = new C26045AKb(C45804HyK.LJIJJ(view.getContext()));
        c26045AKb.LJIIIIZZ(R.string.tpd);
        c26045AKb.LJI(R.attr.eb);
        c26045AKb.LIZLLL(3000L);
        c26045AKb.LJIIJ();
        return C76800UCe.LIZ;
    }

    public AObjectS121S0200000_3(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
