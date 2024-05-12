package X;

import Y.ACListenerS23S0100000_3;
import Y.AObserverS35S0400000_3;
import Y.AObserverS67S0200000_3;
import Y.AObserverS71S0100000_3;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.comment.gift.model.GiftViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.71p, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1792171p {
    public final Fragment LIZ;
    public final ViewGroup LIZIZ;
    public final ActivityC45651qj LIZJ;
    public final GiftViewModel LIZLLL;
    public final InterfaceC1792471s LJ;
    public final boolean LJFF;
    public C7DC LJI;
    public View LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public final C188487aW LJIIJ;

    public final C177336xd LIZJ() {
        InterfaceC55251LmJ LIZLLL = C55247LmF.LIZLLL(C55230Lly.LIZJ(this.LIZ, null), C177336xd.class, "source_default_key");
        if (LIZLLL == null) {
            return null;
        }
        return (C177336xd) LIZLLL.getSource();
    }

    public final void LJ() {
        String str;
        this.LJ.P0();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_method", "gift_dialog");
        C177336xd LIZJ = LIZJ();
        if (LIZJ == null || (str = LIZJ.LJLJJLL) == null) {
            str = "";
        }
        c188727au.LJIIIZ("enter_from", str);
        c188727au.LJIIIZ("group_id", LIZIZ());
        c188727au.LJIIIZ("author_id", LIZ());
        c188727au.LJFF(this.LIZLLL.iv0().getValue(), "current_balance");
        FMX.LJIIL("video_gift_send_click", c188727au.LIZ);
    }

    public final String LIZ() {
        Aweme aweme;
        String authorUid;
        C177336xd LIZJ = LIZJ();
        if (LIZJ == null || (aweme = LIZJ.LJLLI) == null || (authorUid = aweme.getAuthorUid()) == null) {
            return "";
        }
        return authorUid;
    }

    public final String LIZIZ() {
        Aweme aweme;
        String aid;
        C177336xd LIZJ = LIZJ();
        if (LIZJ == null || (aweme = LIZJ.LJLLI) == null || (aid = aweme.getAid()) == null) {
            return "";
        }
        return aid;
    }

    public final void LIZLLL(String str) {
        String str2;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_method", str);
        C177336xd LIZJ = LIZJ();
        if (LIZJ == null || (str2 = LIZJ.LJLJJLL) == null) {
            str2 = "";
        }
        c188727au.LJIIIZ("enter_from", str2);
        c188727au.LJIIIZ("group_id", LIZIZ());
        c188727au.LJIIIZ("author_id", LIZ());
        c188727au.LJFF(this.LIZLLL.iv0().getValue(), "current_balance");
        FMX.LJIIL("enter_coin_recharge", c188727au.LIZ);
    }

    public C1792171p(Fragment fragment, ViewGroup panelContainer, ActivityC45651qj context, GiftViewModel giftViewModel, InterfaceC1792471s callback, boolean z) {
        C80261Vej c80261Vej;
        C1794972r c1794972r;
        C8ID c8id;
        C8ID c8id2;
        TextView textView;
        SY4 sy4;
        TextView textView2;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        View findViewById;
        C72W c72w;
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(panelContainer, "panelContainer");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(giftViewModel, "giftViewModel");
        o.LJIIIZ(callback, "callback");
        this.LIZ = fragment;
        this.LIZIZ = panelContainer;
        this.LIZJ = context;
        this.LIZLLL = giftViewModel;
        this.LJ = callback;
        this.LJFF = z;
        C188487aW c188487aW = new C188487aW(fragment, context, giftViewModel);
        this.LJIIJ = c188487aW;
        View LIZ = C28289B8j.LIZ(panelContainer, R.layout.ps, panelContainer, false);
        this.LJII = LIZ;
        if (LIZ != null) {
            c80261Vej = (C80261Vej) LIZ.findViewById(R.id.dvg);
        } else {
            c80261Vej = null;
        }
        o.LJII(c80261Vej, "null cannot be cast to non-null type com.google.android.material.tabs.TabLayout");
        View view = this.LJII;
        if (view != null) {
            c1794972r = (C1794972r) view.findViewById(R.id.dvm);
        } else {
            c1794972r = null;
        }
        o.LJII(c1794972r, "null cannot be cast to non-null type com.ss.android.ugc.aweme.comment.gift.GiftChooseViewPager");
        View view2 = this.LJII;
        if (view2 != null) {
            c8id = (C8ID) view2.findViewById(R.id.du8);
        } else {
            c8id = null;
        }
        o.LJII(c8id, "null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.DmtLoadingLayout");
        View view3 = this.LJII;
        if (view3 != null) {
            c8id2 = (C8ID) view3.findViewById(R.id.bgl);
        } else {
            c8id2 = null;
        }
        o.LJII(c8id2, "null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.DmtLoadingLayout");
        View view4 = this.LJII;
        if (view4 != null) {
            textView = (TextView) view4.findViewById(R.id.bgj);
        } else {
            textView = null;
        }
        o.LJII(textView, "null cannot be cast to non-null type android.widget.TextView");
        if (C1792271q.LIZ()) {
            ViewGroup.LayoutParams layoutParams2 = c1794972r.getLayoutParams();
            layoutParams2.height = (int) KL2.LIZJ(context, 302.0f);
            layoutParams2.width = -1;
            c1794972r.setLayoutParams(layoutParams2);
        }
        c1794972r.setScrollable(true);
        C7DC c7dc = new C7DC(fragment, context, giftViewModel, c8id, c188487aW, z);
        this.LJI = c7dc;
        c1794972r.setAdapter(c7dc);
        giftViewModel.lv0().observe(context, new AObserverS35S0400000_3(c8id, c80261Vej, this, c1794972r, 0));
        giftViewModel.LJLLL.observe(context, new AObserverS71S0100000_3(c1794972r, 76));
        giftViewModel.lv0().observe(context, new AObserverS35S0400000_3(c8id, c80261Vej, this, c1794972r, 1));
        View view5 = this.LJII;
        if (view5 != null) {
            sy4 = (SY4) view5.findViewById(R.id.jo7);
        } else {
            sy4 = null;
        }
        o.LJII(sy4, "null cannot be cast to non-null type com.bytedance.tux.button.TuxButton");
        c188487aW.LIZLLL = sy4;
        giftViewModel.jv0().observe(context, new AObserverS67S0200000_3(this, sy4, 13));
        giftViewModel.iv0().observe(context, new AObserverS35S0400000_3(this, sy4, c8id2, textView, 2));
        C16880lQ.LJJIZ(sy4, new ACListenerS23S0100000_3(this, 321));
        View view6 = this.LJII;
        if (view6 != null) {
            textView2 = (TextView) view6.findViewById(R.id.ipu);
        } else {
            textView2 = null;
        }
        o.LJII(textView2, "null cannot be cast to non-null type android.widget.TextView");
        C16880lQ.LJIJI(textView2, new ACListenerS23S0100000_3(this, 322));
        giftViewModel.ov0(0, 0L, context, "");
        if (z) {
            View view7 = this.LJII;
            if (view7 != null && (c72w = (C72W) view7.findViewById(R.id.dv1)) != null) {
                C110614Vt c110614Vt = new C110614Vt();
                c110614Vt.LIZIZ = Integer.valueOf(R.attr.cc);
                c110614Vt.LIZJ = C61328O5c.LIZJ(6);
                c72w.setBackground(c110614Vt.LIZ(context));
                c72w.LIZ(giftViewModel, context, true);
            }
            View view8 = this.LJII;
            if (view8 != null && (findViewById = view8.findViewById(R.id.aq7)) != null) {
                layoutParams = findViewById.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            } else {
                marginLayoutParams = null;
            }
            if (marginLayoutParams != null) {
                marginLayoutParams.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(10)));
                marginLayoutParams.setMarginEnd(O6R.LJJIIZ(C32151Nz.LJIIZILJ(10)));
                marginLayoutParams.height = O6R.LJJIIZ(C32151Nz.LJIIZILJ(60));
            }
            c1794972r.setPaddingRelative(0, C7MY.LIZIZ(10), 0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(10)));
            textView2.setTextColor(C04330Ez.LIZIZ(context, R.color.cs));
        }
        giftViewModel.jv0().observe(context, new AObserverS71S0100000_3(this, 74));
        ((LiveData) giftViewModel.LJLJJL.getValue()).observe(context, new AObserverS71S0100000_3(this, 75));
    }
}
