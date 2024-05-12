package com.ss.android.ugc.aweme.feed.assem.friendstab;

import X.ActivityC45651qj;
import X.C10K;
import X.C16880lQ;
import X.C17N;
import X.C199897sv;
import X.C19N;
import X.C210468Nu;
import X.C210478Nv;
import X.C212428Vi;
import X.C213688a4;
import X.C214348b8;
import X.C225738tV;
import X.C226068u2;
import X.C29701Eo;
import X.C32151Nz;
import X.C5H3;
import X.C61447O9r;
import X.C65352Pkq;
import X.C8YN;
import X.InterfaceC36571c5;
import X.InterfaceC54054LJi;
import X.LFH;
import X.LJK;
import X.LXS;
import X.LXU;
import X.O6R;
import X.QD3;
import X.TBT;
import Y.ACListenerS23S0100000_3;
import Y.ACallableS2S1000000_3;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.hox.Hox;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.friendstab.service.FriendsFeedServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS61S0000000_3;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes4.dex */
public final class GoToFriendsGuideAssem extends FeedBaseAssem<GoToFriendsGuideAssem> {
    public final C5H3 LLFFF;
    public final C5H3 LLFII;
    public C29701Eo LLFZ;
    public C199897sv LLI;
    public boolean LLIFFJFJJ;
    public boolean LLII;
    public String LLIIII;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.ab4;
    }

    public GoToFriendsGuideAssem() {
        new LinkedHashMap();
        this.LLFFF = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), C210468Nu.INSTANCE);
        this.LLFII = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoPlayViewModel.class), C210478Nv.INSTANCE);
        this.LLIIII = "";
    }

    public final void LJLLL() {
        if (getContainerView().getVisibility() == 0) {
            C29701Eo c29701Eo = this.LLFZ;
            if (c29701Eo != null) {
                c29701Eo.cancelAnimation();
            }
            C17N.LJJIIJZLJL(getContainerView());
            LXS LIZ = LXU.LIZ();
            if (LIZ == null) {
                return;
            }
            LIZ.LJFF(false);
        }
    }

    public final void p4() {
        LJLLL();
        Context context = getContext();
        if (context != null) {
            FriendsFeedServiceImpl.LJJJIL().LJJIIJ();
            SmartRoute buildRoute = SmartRouter.buildRoute(context, "//friends_tab");
            buildRoute.withParam("insert_ids", this.LLIIII);
            buildRoute.withParam("insert_asc", true);
            buildRoute.withParam("enter_method", "click_fyp_enter_guide");
            buildRoute.open();
        }
        C226068u2.LIZ();
        C10K.LIZJ(new ACallableS2S1000000_3("click_button", 1));
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseAssem, X.C8XO
    public final void unBind() {
        EventBus.LIZJ().LJIJ(this);
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        EventBus.LIZJ().LJIILJJIL(this);
    }

    @QD3
    public final void onRefreshEvent(LJK event) {
        InterfaceC54054LJi interfaceC54054LJi;
        o.LJIIIZ(event, "event");
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            InterfaceC36571c5 Ja = Hox.LJLLI.LIZ(LIZ).Ja("HOME");
            if (Ja instanceof InterfaceC54054LJi) {
                interfaceC54054LJi = (InterfaceC54054LJi) Ja;
            } else {
                interfaceC54054LJi = null;
            }
            int i = event.LJLIL;
            if (i == 2 || (i == 1 && interfaceC54054LJi != null && interfaceC54054LJi.Oe())) {
                LJLLL();
                C226068u2.LIZLLL();
            }
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        o.LJIIIZ(view, "view");
        C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, 206), view);
        View findViewById = view.findViewById(R.id.n25);
        if (findViewById != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setGradientType(0);
            Integer LIZIZ = C19N.LIZIZ(findViewById, "context", R.attr.d4);
            if (LIZIZ != null) {
                i = LIZIZ.intValue();
            } else {
                i = 0;
            }
            gradientDrawable.setColors(new int[]{0, i});
            findViewById.setBackground(gradientDrawable);
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.bcx);
        if (constraintLayout != null) {
            C16880lQ.LJIL(constraintLayout, new ACListenerS23S0100000_3(this, 207));
        }
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.awi);
        if (tuxTextView != null) {
            C16880lQ.LJJJJI(tuxTextView, new ACListenerS23S0100000_3(this, 208));
        }
        if (C61447O9r.LJIIIZ || LFH.LIZIZ.LIZLLL().LJIJ().LIZLLL() != 0) {
            int i2 = C61447O9r.LJIIJ;
            ViewGroup.LayoutParams layoutParams = view.findViewById(R.id.g6h).getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.bottomMargin = O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(i2 + 16)));
            }
        }
        C29701Eo c29701Eo = (C29701Eo) view.findViewById(R.id.g_z);
        this.LLFZ = c29701Eo;
        if (c29701Eo != null) {
            c29701Eo.setRepeatCount(-1);
        }
        this.LLI = (C199897sv) view.findViewById(R.id.do8);
        C8YN.LJII(this, (AssemViewModel) this.LLFFF.getValue(), new TBT() { // from class: X.8tb
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJI;
            }
        }, C213688a4.LIZLLL(), new AqS61S0000000_3(2), 4);
        C8YN.LJII(this, (AssemViewModel) this.LLFFF.getValue(), new TBT() { // from class: X.8tc
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJJI;
            }
        }, C213688a4.LIZLLL(), new AqS61S0000000_3(this, 3), 4);
        C8YN.LJIIJJI(this, (AssemViewModel) this.LLFII.getValue(), new TBT() { // from class: X.8td
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C212208Um) obj).LJLJLLL;
            }
        }, new TBT() { // from class: X.8ti
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C212208Um) obj).LJLL;
            }
        }, new TBT() { // from class: X.8tk
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C212208Um) obj).LJLLI;
            }
        }, C213688a4.LIZLLL(), new C225738tV(), 16);
    }
}
