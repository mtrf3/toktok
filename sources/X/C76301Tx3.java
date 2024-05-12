package X;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.liveinteract.match.business.event.BattleDrawTimeLeftChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattlePunishTimeLeftChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleStateChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleTimeLeftChannel;
import com.bytedance.android.live.liveinteract.multihost.biz.feed.InteractionFeedTitleViewModel;
import com.bytedance.android.live.liveinteract.multihost.event.MultiCoHostStateChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.Tx3, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76301Tx3 extends FrameLayout {
    public final C62822Ol8 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C76309TxB LJLJJI;
    public final C76456TzY LJLJJL;
    public final C75726Tnm LJLJJLL;
    public InterfaceC75871Tq7 LJLJL;
    public C76299Tx1 LJLJLJ;
    public final C76300Tx2 LJLJLLL;
    public EnumC75620Tm4 LJLL;

    private final FrameLayout getCohostContainer() {
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-cohostContainer>(...)");
        return (FrameLayout) value;
    }

    public final void LIZIZ() {
        C0NB.LJIIIZ("MultiHostFeedView", "onDestroy");
        C75870Tq6 c75870Tq6 = new C75870Tq6();
        c75870Tq6.LJIILL(this.LJLJL);
        c75870Tq6.LJIILJJIL("cohost_widget_unload");
        C75726Tnm c75726Tnm = this.LJLJJLL;
        c75726Tnm.getClass();
        C66612QCi.LIZIZ(C75728Tno.class, c75726Tnm.LIZLLL);
        C66612QCi.LIZIZ(C75593Tld.class, c75726Tnm.LJFF);
        C66612QCi.LIZIZ(C75588TlY.class, c75726Tnm.LJ);
        c75726Tnm.LIZ = null;
        c75726Tnm.LIZIZ = null;
        c75726Tnm.LIZJ = null;
        C76309TxB c76309TxB = this.LJLJJI;
        c76309TxB.LIZ.LJLJI.removeObserver(c76309TxB.LJIIIZ);
        InteractionFeedTitleViewModel interactionFeedTitleViewModel = c76309TxB.LIZ;
        DataChannel dataChannel = interactionFeedTitleViewModel.LJLIL;
        if (dataChannel != null) {
            dataChannel.jv0(interactionFeedTitleViewModel);
        }
        interactionFeedTitleViewModel.LJLIL = null;
        this.LJLJJL.LJFF();
        C76299Tx1 c76299Tx1 = this.LJLJLJ;
        if (c76299Tx1.LIZLLL.compareTo(EnumC76178Tv4.START) >= 0) {
            c76299Tx1.LIZLLL.compareTo(EnumC76178Tv4.END);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("match_widget_destroy, battle_id = ");
        LIZ.append(C76316TxI.LIZ.LIZ());
        C0NB.LIZIZ("MatchFeedWidget", X1D.LIZIZ(LIZ));
        C76312TxE c76312TxE = c76299Tx1.LIZIZ;
        c76312TxE.getClass();
        C0NB.LJIIIZ("MatchFeedWidgetPresenter", "detachView");
        c76312TxE.LIZIZ.LIZLLL();
        c76312TxE.LIZJ.removeCallbacksAndMessages(null);
        c76312TxE.LIZ = null;
        AbstractC76298Tx0 abstractC76298Tx0 = c76299Tx1.LIZJ;
        if (abstractC76298Tx0 != null) {
            abstractC76298Tx0.LJIILL();
        }
        c76299Tx1.LIZJ = null;
        this.LJLJL = null;
        this.LJLL = EnumC75620Tm4.None;
    }

    public final U2A getBattleHealthBar() {
        Object value = this.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-battleHealthBar>(...)");
        return (U2A) value;
    }

    public final ViewGroup getLayoutContainer() {
        Object value = this.LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-layoutContainer>(...)");
        return (ViewGroup) value;
    }

    public final C75726Tnm getFeedWindowManager() {
        return this.LJLJJLL;
    }

    public final InterfaceC76112Tu0 getLayoutChangedListener() {
        return this.LJLJLLL;
    }

    public final C76299Tx1 getMatchFeedViewHandler() {
        return this.LJLJLJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76301Tx3(Context context) {
        super(context, null, 0);
        new LinkedHashMap();
        this.LJLIL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 381));
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS163S0100000_13(this, 380));
        this.LJLJI = C221108m2.LIZIZ(new AqS163S0100000_13(this, 379));
        this.LJLJJI = new C76309TxB();
        this.LJLJJL = new C76456TzY();
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(new ContextThemeWrapper(context, C259710f.LIZ.LJFF(context))), R.layout.dpg, this, true);
        getBattleHealthBar().setIsFromFeed(true);
        this.LJLJJLL = new C75726Tnm();
        this.LJLJLJ = new C76299Tx1(new C76337Txd(this));
        this.LJLJLLL = new C76300Tx2(this);
        this.LJLL = EnumC75620Tm4.None;
    }

    public final void LIZ(C76111Ttz feedInfoProvider) {
        DataChannel dataChannel;
        DataChannel dataChannel2;
        DataChannel dataChannel3;
        o.LJIIIZ(feedInfoProvider, "feedInfoProvider");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onCreate, rootContainer = ");
        LIZ.append(getLayoutContainer());
        LIZ.append(",  cohostContainer = ");
        LIZ.append(getCohostContainer());
        C0NB.LJIIIZ("MultiHostFeedView", X1D.LIZIZ(LIZ));
        this.LJLJL = feedInfoProvider;
        C76309TxB c76309TxB = this.LJLJJI;
        View findViewById = findViewById(R.id.fjc);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.layout_link_title_new)");
        c76309TxB.getClass();
        c76309TxB.LIZIZ = feedInfoProvider;
        c76309TxB.LIZJ = (FrameLayout) findViewById;
        c76309TxB.LJI = (C47061t0) findViewById.findViewById(R.id.f5b);
        View findViewById2 = findViewById.findViewById(R.id.fjd);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.layout_linkmic_set)");
        c76309TxB.LJFF = (ConstraintLayout) findViewById2;
        View findViewById3 = findViewById.findViewById(R.id.fgu);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.layout_battle_countdown)");
        c76309TxB.LIZLLL = (ConstraintLayout) findViewById3;
        View findViewById4 = findViewById.findViewById(R.id.fgv);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.l…_battle_punish_countdown)");
        c76309TxB.LJ = (LinearLayout) findViewById4;
        C15490jB.LJFF(c76309TxB.LJI, "tiktok_live_interaction_normal_1", "ttlive_icon_in_multi_co_host.webp", ImageView.ScaleType.CENTER_CROP, new C75631TmF());
        ConstraintLayout constraintLayout = c76309TxB.LIZLLL;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
            LinearLayout linearLayout = c76309TxB.LJ;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
                C76388TyS c76388TyS = c76309TxB.LJII;
                View findViewById5 = findViewById.findViewById(R.id.fgu);
                o.LJIIIIZZ(findViewById5, "view.findViewById(R.id.layout_battle_countdown)");
                InterfaceC75871Tq7 interfaceC75871Tq7 = c76309TxB.LIZIZ;
                c76388TyS.getClass();
                if (interfaceC75871Tq7 != null) {
                    dataChannel = interfaceC75871Tq7.LJIIL();
                } else {
                    dataChannel = null;
                }
                c76388TyS.LJIIIIZZ = dataChannel;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) findViewById5;
                c76388TyS.LJFF = constraintLayout2;
                View findViewById6 = findViewById5.findViewById(R.id.f8n);
                o.LJIIIIZZ(findViewById6, "view.findViewById(R.id.iv_pk_fist)");
                c76388TyS.LIZ = (ImageView) findViewById6;
                View findViewById7 = findViewById5.findViewById(R.id.f8k);
                o.LJIIIIZZ(findViewById7, "view.findViewById(R.id.iv_pk_calculate_clock)");
                c76388TyS.LIZIZ = (C2A4) findViewById7;
                View findViewById8 = findViewById5.findViewById(R.id.me1);
                o.LJIIIIZZ(findViewById8, "view.findViewById(R.id.tv_pk_only_gift)");
                c76388TyS.LIZJ = (C47121t6) findViewById8;
                View findViewById9 = findViewById5.findViewById(R.id.me0);
                o.LJIIIIZZ(findViewById9, "view.findViewById(R.id.tv_pk_countdown_value)");
                c76388TyS.LIZLLL = (C47121t6) findViewById9;
                View findViewById10 = findViewById5.findViewById(R.id.mcp);
                o.LJIIIIZZ(findViewById10, "view.findViewById(R.id.tv_only_gift_tip)");
                c76388TyS.LJ = (CMV) findViewById10;
                c76388TyS.LJIIIZ = C04270Et.LIZIZ(constraintLayout2.getContext(), R.drawable.cfo);
                C259910h.LIZIZ(R.attr.ar7, constraintLayout2.getContext());
                c76388TyS.LJIIJ = Integer.valueOf(C259910h.LIZIZ(R.attr.ape, constraintLayout2.getContext()));
                C81705W4v LIZJ = W5I.LIZJ();
                LIZJ.LJII(C15510jD.LJIIIZ("tiktok_live_match_resource", "ttlive_match_calculating_clock.webp"));
                c76388TyS.LJII = LIZJ;
                c76388TyS.LJIIJJI = "";
                DataChannel dataChannel4 = c76388TyS.LJIIIIZZ;
                if (dataChannel4 != null) {
                    dataChannel4.mv0(BattleTimeLeftChannel.class, c76388TyS, new AqS179S0100000_13(c76388TyS, 473));
                    dataChannel4.mv0(BattleDrawTimeLeftChannel.class, c76388TyS, new AqS179S0100000_13(c76388TyS, 474));
                    dataChannel4.mv0(BattleStateChannel.class, c76388TyS, new AqS179S0100000_13(c76388TyS, 475));
                }
                C76356Txw c76356Txw = c76309TxB.LJIIIIZZ;
                View findViewById11 = findViewById.findViewById(R.id.fgv);
                o.LJIIIIZZ(findViewById11, "view.findViewById(R.id.l…_battle_punish_countdown)");
                InterfaceC75871Tq7 interfaceC75871Tq72 = c76309TxB.LIZIZ;
                c76356Txw.getClass();
                if (interfaceC75871Tq72 != null) {
                    dataChannel2 = interfaceC75871Tq72.LJIIL();
                } else {
                    dataChannel2 = null;
                }
                c76356Txw.LIZLLL = dataChannel2;
                c76356Txw.LIZJ = (LinearLayout) findViewById11;
                View findViewById12 = findViewById11.findViewById(R.id.me2);
                o.LJIIIIZZ(findViewById12, "view.findViewById(R.id.t…k_punish_countdown_value)");
                c76356Txw.LIZ = (C47121t6) findViewById12;
                View findViewById13 = findViewById11.findViewById(R.id.me3);
                o.LJIIIIZZ(findViewById13, "view.findViewById(R.id.tv_pk_punish_title)");
                c76356Txw.LIZIZ = (C47121t6) findViewById13;
                DataChannel dataChannel5 = c76356Txw.LIZLLL;
                if (dataChannel5 != null) {
                    dataChannel5.mv0(BattlePunishTimeLeftChannel.class, c76356Txw, new AqS179S0100000_13(c76356Txw, 476));
                }
                InteractionFeedTitleViewModel interactionFeedTitleViewModel = c76309TxB.LIZ;
                InterfaceC75871Tq7 interfaceC75871Tq73 = c76309TxB.LIZIZ;
                if (interfaceC75871Tq73 != null) {
                    dataChannel3 = interfaceC75871Tq73.LJIIL();
                } else {
                    dataChannel3 = null;
                }
                interactionFeedTitleViewModel.LJLIL = dataChannel3;
                if (dataChannel3 != null) {
                    dataChannel3.mv0(MultiCoHostStateChannel.class, interactionFeedTitleViewModel, new AqS179S0100000_13(interactionFeedTitleViewModel, 408));
                    dataChannel3.mv0(BattleStateChannel.class, interactionFeedTitleViewModel, new AqS179S0100000_13(interactionFeedTitleViewModel, 409));
                    dataChannel3.mv0(BattleTimeLeftChannel.class, interactionFeedTitleViewModel, new AqS179S0100000_13(interactionFeedTitleViewModel, 410));
                }
                c76309TxB.LIZ.LJLJI.observeForever(c76309TxB.LJIIIZ);
                C76456TzY c76456TzY = this.LJLJJL;
                View findViewById14 = findViewById(R.id.fii);
                o.LJIIIIZZ(findViewById14, "findViewById(R.id.layout_float_container)");
                c76456TzY.getClass();
                c76456TzY.LIZIZ = feedInfoProvider.LJIIL();
                c76456TzY.LIZJ = (C29701Eo) findViewById14.findViewById(R.id.f5s);
                c76456TzY.LIZLLL = (C29701Eo) findViewById14.findViewById(R.id.f4j);
                DataChannel dataChannel6 = c76456TzY.LIZIZ;
                if (dataChannel6 != null) {
                    dataChannel6.mv0(BattleTimeLeftChannel.class, c76456TzY, new AqS179S0100000_13(c76456TzY, 488));
                    dataChannel6.mv0(BattleStateChannel.class, c76456TzY, new AqS179S0100000_13(c76456TzY, 489));
                }
                c76456TzY.LIZ.LJLJJI.observeForever(c76456TzY.LJI);
                C75726Tnm c75726Tnm = this.LJLJJLL;
                FrameLayout cohostContainer = getCohostContainer();
                c75726Tnm.LIZ = null;
                c75726Tnm.LIZIZ = cohostContainer;
                c75726Tnm.LIZJ = feedInfoProvider;
                C66612QCi.LIZ(C75728Tno.class, c75726Tnm.LIZLLL);
                C66612QCi.LIZ(C75593Tld.class, c75726Tnm.LJFF);
                C66612QCi.LIZ(C75588TlY.class, c75726Tnm.LJ);
                InterfaceC75579TlP interfaceC75579TlP = feedInfoProvider.LIZ.LJLJJL;
                if (interfaceC75579TlP != null) {
                    interfaceC75579TlP.n1(getLayoutContainer(), getCohostContainer(), feedInfoProvider.LIZ.LL);
                    return;
                }
                return;
            }
            o.LJIJI("battlePunishCountDownLayout");
            throw null;
        }
        o.LJIJI("battleCountDownLayout");
        throw null;
    }

    public final void setMatchFeedViewHandler(C76299Tx1 c76299Tx1) {
        o.LJIIIZ(c76299Tx1, "<set-?>");
        this.LJLJLJ = c76299Tx1;
    }
}
