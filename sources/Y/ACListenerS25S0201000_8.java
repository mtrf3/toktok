package Y;

import X.C188727au;
import X.C2NU;
import X.C50597JtR;
import X.C51612KNk;
import X.C51618KNq;
import X.C51767KTj;
import X.C51769KTl;
import X.C5S1;
import X.FMX;
import X.InterfaceC159606Oe;
import X.InterfaceC50599JtT;
import X.JJK;
import X.JK5;
import X.JKA;
import X.KUV;
import X.KUW;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam;
import com.ss.android.ugc.aweme.commercialize.challenge.service.CommerceChallengeServiceImpl;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.discover.model.FeedbackMultipleChoice;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.common.feedback.core.ui.SearchFeedbackOptionalFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS125S0300000_8;
import kotlin.jvm.internal.IDqS37S0300000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public class ACListenerS25S0201000_8 implements View.OnClickListener {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            case 2:
                onClick$2(this, view);
                return;
            case 3:
                onClick$3(this, view);
                return;
            case 4:
                onClick$4(this, view);
                return;
            case 5:
                onClick$5(this, view);
                return;
            case 6:
                onClick$6(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS25S0201000_8 aCListenerS25S0201000_8, View it) {
        if (C2NU.LIZ.LIZIZ()) {
            JJK jjk = ((JKA) aCListenerS25S0201000_8.l0).LJLJJLL;
            int i = aCListenerS25S0201000_8.i2;
            o.LJIIIIZZ(it, "it");
            jjk.LIZJ(i, it, (Aweme) aCListenerS25S0201000_8.l1, ((JKA) aCListenerS25S0201000_8.l0).LJLLJ);
            return;
        }
        C5S1 c5s1 = new C5S1(((JKA) aCListenerS25S0201000_8.l0).LJLJJI);
        c5s1.LIZJ(R.string.img);
        c5s1.LJ();
    }

    public static final void onClick$1(ACListenerS25S0201000_8 aCListenerS25S0201000_8, View view) {
        if (aCListenerS25S0201000_8.i2 == ((ArrayList) ((SearchFeedbackOptionalFragment) aCListenerS25S0201000_8.l0).LJLL).size() - 1) {
            AqS125S0300000_8 aqS125S0300000_8 = ((SearchFeedbackOptionalFragment) aCListenerS25S0201000_8.l0).LJLLILLLL;
            if (aqS125S0300000_8 != null) {
                aqS125S0300000_8.invoke((FeedbackMultipleChoice) aCListenerS25S0201000_8.l1, Integer.valueOf(aCListenerS25S0201000_8.i2));
                return;
            }
            return;
        }
        SearchFeedbackOptionalFragment searchFeedbackOptionalFragment = (SearchFeedbackOptionalFragment) aCListenerS25S0201000_8.l0;
        IDqS37S0300000_8 iDqS37S0300000_8 = searchFeedbackOptionalFragment.LJLLI;
        if (iDqS37S0300000_8 == null) {
            return;
        }
        iDqS37S0300000_8.invoke(searchFeedbackOptionalFragment, (FeedbackMultipleChoice) aCListenerS25S0201000_8.l1, Integer.valueOf(aCListenerS25S0201000_8.i2));
    }

    public static final void onClick$2(ACListenerS25S0201000_8 aCListenerS25S0201000_8, View it) {
        if (C2NU.LIZ.LIZIZ()) {
            JJK jjk = ((JK5) aCListenerS25S0201000_8.l0).LJLJJLL;
            int i = aCListenerS25S0201000_8.i2;
            o.LJIIIIZZ(it, "it");
            jjk.LIZJ(i, it, (Aweme) aCListenerS25S0201000_8.l1, ((JK5) aCListenerS25S0201000_8.l0).LJLLJ);
            return;
        }
        C5S1 c5s1 = new C5S1(((JK5) aCListenerS25S0201000_8.l0).LJLJJI);
        c5s1.LIZJ(R.string.img);
        c5s1.LJ();
    }

    public static final void onClick$3(ACListenerS25S0201000_8 aCListenerS25S0201000_8, View view) {
        InterfaceC50599JtT interfaceC50599JtT = ((C51767KTj) aCListenerS25S0201000_8.l0).LJLJJI;
        if (interfaceC50599JtT != null) {
            View view2 = ((RecyclerView.ViewHolder) aCListenerS25S0201000_8.l1).itemView;
            o.LJIIIIZZ(view2, "holder.itemView");
            interfaceC50599JtT.LIZ(aCListenerS25S0201000_8.i2, view2);
        }
    }

    public static final void onClick$4(ACListenerS25S0201000_8 aCListenerS25S0201000_8, View view) {
        InterfaceC50599JtT interfaceC50599JtT = ((C51769KTl) aCListenerS25S0201000_8.l0).LJLJJI;
        if (interfaceC50599JtT != null) {
            View view2 = ((RecyclerView.ViewHolder) aCListenerS25S0201000_8.l1).itemView;
            o.LJIIIIZZ(view2, "holder.itemView");
            interfaceC50599JtT.LIZ(aCListenerS25S0201000_8.i2, view2);
        }
    }

    public static final void onClick$5(ACListenerS25S0201000_8 aCListenerS25S0201000_8, View view) {
        switch (aCListenerS25S0201000_8.i2) {
            case 0:
                C51612KNk c51612KNk = (C51612KNk) aCListenerS25S0201000_8.l0;
                View.OnClickListener onClickListener = (View.OnClickListener) aCListenerS25S0201000_8.l1;
                if (onClickListener != null) {
                    c51612KNk.LJZI = true;
                    onClickListener.onClick(view);
                    return;
                } else {
                    c51612KNk.getClass();
                    return;
                }
            case 1:
                C51618KNq c51618KNq = (C51618KNq) aCListenerS25S0201000_8.l0;
                Challenge challenge = (Challenge) aCListenerS25S0201000_8.l1;
                c51618KNq.getClass();
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("related_tag_id", challenge.getCid());
                c188727au.LJIIIZ("tag_id", c51618KNq.LJLJI);
                FMX.LJIIL("click_related_tag", c188727au.LIZ);
                Context context = c51618KNq.LJLILLLLZI;
                String str = c51618KNq.LJLJI;
                CommerceChallengeServiceImpl.LIZIZ().LIZLLL(challenge);
                SmartRoute buildRoute = SmartRouter.buildRoute(context, "//challenge/detail");
                buildRoute.withNavArg(new ChallengeDetailParam(challenge.getCid(), "from_related_tag", challenge.getType(), str));
                buildRoute.open();
                return;
            default:
                KUV kuv = (KUV) aCListenerS25S0201000_8.l0;
                KUW kuw = (KUW) aCListenerS25S0201000_8.l1;
                kuv.LIZ();
                KUV.LIZIZ(view, false);
                ((KUW) view).LJLJJL = true;
                view.setSelected(true);
                InterfaceC159606Oe interfaceC159606Oe = kuv.LJLJJI;
                if (interfaceC159606Oe != null) {
                    interfaceC159606Oe.LIZ(((Integer) view.getTag()).intValue());
                }
                kuv.LJLJL.LIZ(kuw);
                return;
        }
    }

    public static final void onClick$6(ACListenerS25S0201000_8 aCListenerS25S0201000_8, View view) {
        InterfaceC50599JtT interfaceC50599JtT = ((C50597JtR) aCListenerS25S0201000_8.l0).LJLJJI;
        if (interfaceC50599JtT != null) {
            View view2 = ((RecyclerView.ViewHolder) aCListenerS25S0201000_8.l1).itemView;
            o.LJIIIIZZ(view2, "holder.itemView");
            interfaceC50599JtT.LIZ(aCListenerS25S0201000_8.i2, view2);
        }
    }

    public ACListenerS25S0201000_8(int i, Object obj, Object obj2, int i2) {
        this.$t = i2;
        this.i2 = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
