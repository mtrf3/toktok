package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.B83;
import X.C14480hY;
import X.C1DJ;
import X.C20Q;
import X.C225138sX;
import X.C29374Bfu;
import X.C2A4;
import X.C33611Tp;
import X.C73976T1o;
import X.C76800UCe;
import X.C76846UDy;
import X.InterfaceC11360cW;
import X.InterfaceC88471Ynr;
import X.TV3;
import X.V6O;
import Y.ARunnableS24S0300000_13;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.live.base.model.user.User;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.viewmodel.MentionFavoriteVideoVM;
import java.util.List;

/* loaded from: classes14.dex */
public class AqS80S0400000_13 extends AbstractC65781Prl implements InterfaceC88471Ynr {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS80S0400000_13 aqS80S0400000_13, Object obj, Object obj2) {
        C76846UDy c76846UDy = (C76846UDy) aqS80S0400000_13.l0;
        FrameLayout frameLayout = (FrameLayout) aqS80S0400000_13.l1;
        C2A4 c2a4 = (C2A4) aqS80S0400000_13.l2;
        c76846UDy.getClass();
        if (frameLayout != null) {
            frameLayout.post(new ARunnableS24S0300000_13(frameLayout, c2a4, c76846UDy, 7));
        }
        C33611Tp c33611Tp = (C33611Tp) aqS80S0400000_13.l3;
        int i = c33611Tp.LJLJI;
        User LJ = ((C29374Bfu) B83.LIZ().LIZIZ()).LJ();
        o.LJIIIIZZ(LJ, "getInstance().user().currentUserOpt");
        C14480hY.LIZIZ(c33611Tp, 4, i, 2, TV3.LJIIIIZZ(LJ));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS80S0400000_13 aqS80S0400000_13, Object obj, Object it) {
        InterfaceC11360cW PagingLazyVerticalGrid = (InterfaceC11360cW) obj;
        o.LJIIIZ(PagingLazyVerticalGrid, "$this$PagingLazyVerticalGrid");
        o.LJIIIZ(it, "it");
        List list = (List) ((V6O) aqS80S0400000_13.l0).LJLJJI.getValue();
        PagingLazyVerticalGrid.LIZIZ(list.size(), new AqS170S0100000_4(list, (List<? extends Object>) 1602), null, C20Q.LJLIL, C1DJ.LJFF(new C73976T1o(list, (MentionFavoriteVideoVM) aqS80S0400000_13.l1, (IAVPublishService) aqS80S0400000_13.l2, (View) aqS80S0400000_13.l3), -566447075, true));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS80S0400000_13(C225138sX c225138sX, MentionFavoriteVideoVM mentionFavoriteVideoVM, IAVPublishService iAVPublishService, View view, int i) {
        super(2);
        this.$t = i;
        this.l0 = c225138sX;
        this.l1 = mentionFavoriteVideoVM;
        this.l2 = iAVPublishService;
        this.l3 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS80S0400000_13(C76846UDy c76846UDy, FrameLayout frameLayout, C2A4 c2a4, C33611Tp c33611Tp, int i) {
        super(2);
        this.$t = i;
        this.l0 = c76846UDy;
        this.l1 = frameLayout;
        this.l2 = c2a4;
        this.l3 = c33611Tp;
    }
}
