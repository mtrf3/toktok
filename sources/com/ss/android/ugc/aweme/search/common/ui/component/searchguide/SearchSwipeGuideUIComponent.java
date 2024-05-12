package com.ss.android.ugc.aweme.search.common.ui.component.searchguide;

import X.AbstractC50059Jkl;
import X.ActivityC45651qj;
import X.C17N;
import X.C212428Vi;
import X.C214298b3;
import X.C221108m2;
import X.C221138m5;
import X.C2K0;
import X.C2S6;
import X.C49629Jdp;
import X.C50322Jp0;
import X.C51781KTx;
import X.C54258LRe;
import X.C5H3;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73411SrX;
import X.C77869UhF;
import X.C78926UyI;
import X.C7MY;
import X.C80796VnM;
import X.C84193Sd;
import X.C8MM;
import X.C8YN;
import X.C9BD;
import X.EnumC221088m0;
import X.InterfaceC55102Lju;
import X.InterfaceC65350Pko;
import X.JAK;
import X.JZ4;
import X.JZV;
import X.JZX;
import X.KNV;
import X.KP3;
import X.KP4;
import X.KP5;
import X.KPE;
import X.KU4;
import X.LRD;
import X.LSY;
import X.TBT;
import X.X1D;
import Y.ARunnableS27S0200000_8;
import android.view.View;
import android.widget.TextView;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.assem.ability.IPanelUIAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.search.detail.filter.viewmodel.FilterVM;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.ss.android.ugc.aweme.ug.guide.SwipeUpGuideStrengthenLayout;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.AqS190S0100000_8;
import kotlin.jvm.internal.AqS64S0110000_8;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class SearchSwipeGuideUIComponent extends BasePanelUIComponent implements ISearchSwipeGuideAbility, InterfaceC55102Lju {
    public final C5H3 LJLJJI;
    public final C5H3 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C214298b3 LJLJL;
    public ScrollSwitchStateManager LJLJLJ;
    public SwipeUpGuideStrengthenLayout LJLJLLL;
    public C77869UhF LJLL;
    public LSY LJLLI;
    public C73411SrX LJLLILLLL;
    public C54258LRe LJLLJ;
    public boolean LJLLL;
    public boolean LJLLLL;
    public boolean LJLLLLLL;
    public Aweme LJLZ;

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != 150134619) {
            return null;
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SearchSwipeGuideUIComponent() {
        C62822Ol8 c62822Ol8;
        C62822Ol8 c62822Ol82;
        new LinkedHashMap();
        if (JAK.LIZ()) {
            C221138m5 c221138m5 = new C221138m5(EnumC221088m0.PUBLICATION, new AqS158S0100000_8((KU4) this, 146), null);
            C51781KTx.LIZJ(this, c221138m5);
            c62822Ol8 = c221138m5;
        } else {
            c62822Ol8 = C221108m2.LIZIZ(new AqS64S0110000_8(false, (KU4) this, 1));
        }
        this.LJLJJI = c62822Ol8;
        if (JAK.LIZ()) {
            C221138m5 c221138m52 = new C221138m5(EnumC221088m0.PUBLICATION, new AqS158S0100000_8((KU4) this, 147), null);
            C51781KTx.LIZJ(this, c221138m52);
            c62822Ol82 = c221138m52;
        } else {
            c62822Ol82 = C221108m2.LIZIZ(new AqS64S0110000_8(false, (KU4) this, 2));
        }
        this.LJLJJL = c62822Ol82;
        this.LJLJJLL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 144));
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(FilterVM.class);
        this.LJLJL = C78926UyI.LJ(this, LIZ, c9bd, new AqS158S0100000_8((InterfaceC65350Pko) LIZ, 145), KP4.INSTANCE, null);
        this.LJLLLL = true;
    }

    public final void dismiss() {
        SwipeUpGuideStrengthenLayout swipeUpGuideStrengthenLayout = this.LJLJLLL;
        if (swipeUpGuideStrengthenLayout != null) {
            swipeUpGuideStrengthenLayout.animate().alpha(0.0f).setDuration(300L).withEndAction(new ARunnableS27S0200000_8(swipeUpGuideStrengthenLayout, this, 28)).start();
        }
        ScrollSwitchStateManager scrollSwitchStateManager = this.LJLJLJ;
        if (scrollSwitchStateManager != null) {
            scrollSwitchStateManager.tv0(true);
        }
    }

    public final boolean v3() {
        C54258LRe c54258LRe;
        C54258LRe c54258LRe2;
        C54258LRe c54258LRe3 = this.LJLLJ;
        if (c54258LRe3 == null || c54258LRe3.LIZLLL() || (c54258LRe = this.LJLLJ) == null || c54258LRe.LIZIZ() || (c54258LRe2 = this.LJLLJ) == null || c54258LRe2.LIZ("login_panel") || this.LJLLL) {
            return false;
        }
        return true;
    }

    public final IFeedPanelPlatformAbility x3() {
        return (IFeedPanelPlatformAbility) this.LJLJJI.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        C73411SrX c73411SrX = this.LJLLILLLL;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        C77869UhF c77869UhF = this.LJLL;
        if (c77869UhF != null) {
            c77869UhF.cancelAnimation();
        }
        this.LJLL = null;
        LSY lsy = this.LJLLI;
        if (lsy != null) {
            lsy.LIZ();
        }
        this.LJLLI = null;
    }

    public final void A3(String str) {
        JZ4 jz4;
        String str2;
        Integer num;
        String str3;
        String str4;
        JZX jzx;
        JZX jzx2;
        ISearchContextAbility LJJJJL;
        AbstractC50059Jkl<JZ4> CB;
        Aweme aweme;
        C50322Jp0 c50322Jp0 = (C50322Jp0) KNV.LIZ();
        Integer num2 = null;
        if (this.LJLZ == null) {
            IFeedPanelPlatformAbility x3 = x3();
            if (x3 != null) {
                aweme = x3.getCurrentAweme();
            } else {
                aweme = null;
            }
            this.LJLZ = aweme;
        }
        Aweme aweme2 = this.LJLZ;
        if (aweme2 != null && (LJJJJL = C17N.LJJJJL(aweme2)) != null && (CB = LJJJJL.CB()) != null) {
            jz4 = CB.LIZJ();
        } else {
            jz4 = null;
        }
        String eventType = C2S6.LIZ(getContext()).getEventType();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("rankrank aweme id = ");
        Aweme aweme3 = this.LJLZ;
        if (aweme3 != null) {
            str2 = aweme3.getAid();
        } else {
            str2 = null;
        }
        LIZ.append(str2);
        LIZ.append(" mobSwipeGuide: rank = ");
        if (jz4 != null && (jzx2 = jz4.LJLILLLLZI) != null) {
            num = jzx2.LIZJ;
        } else {
            num = null;
        }
        LIZ.append(num);
        X1D.LIZIZ(LIZ);
        Aweme aweme4 = this.LJLZ;
        if (aweme4 != null) {
            str3 = aweme4.getAid();
        } else {
            str3 = null;
        }
        String str5 = c50322Jp0.LJLJI;
        Aweme aweme5 = this.LJLZ;
        if (aweme5 != null) {
            str4 = aweme5.getAid();
        } else {
            str4 = null;
        }
        if (jz4 != null && (jzx = jz4.LJLILLLLZI) != null) {
            num2 = jzx.LIZJ;
        }
        String valueOf = String.valueOf(num2);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("enter_from", eventType);
            jSONObject.put("group_id", str3);
            jSONObject.put("search_id", str5);
            jSONObject.put("search_result_id", str4);
            jSONObject.put("rank", valueOf);
            AppLogNewUtils.onEventV3(str, jSONObject);
        } catch (Exception unused) {
        }
    }

    public final void C3(int i) {
        Aweme aweme;
        Boolean bool;
        boolean z;
        boolean z2;
        C54258LRe c54258LRe;
        IPanelUIAbility iPanelUIAbility;
        boolean z3;
        StringBuilder LJ = C7MY.LJ("tryShowGuide: \nfromType = ", i, " \nSearchSwipeGuideHelper.runtimeCheck(panel?.getCurrentAweme()) = ");
        IFeedPanelPlatformAbility x3 = x3();
        Aweme aweme2 = null;
        if (x3 != null) {
            aweme = x3.getCurrentAweme();
        } else {
            aweme = null;
        }
        LJ.append(JZV.LJ(aweme));
        LJ.append(" \nswipeUpGuide?.isVisible = ");
        SwipeUpGuideStrengthenLayout swipeUpGuideStrengthenLayout = this.LJLJLLL;
        if (swipeUpGuideStrengthenLayout != null) {
            if (swipeUpGuideStrengthenLayout.getVisibility() == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            bool = Boolean.valueOf(z3);
        } else {
            bool = null;
        }
        LJ.append(bool);
        LJ.append(" \ncheckFeedDialogState = ");
        C54258LRe c54258LRe2 = this.LJLLJ;
        if (c54258LRe2 != null && !c54258LRe2.LIZ("permission_dialog")) {
            z = true;
        } else {
            z = false;
        }
        LJ.append(z);
        LJ.append(" \ncheckFeedPanelState = ");
        LJ.append(v3());
        LJ.append(" \nhasNextFeedWithoutRequest = ");
        IPanelUIAbility iPanelUIAbility2 = (IPanelUIAbility) this.LJLJJL.getValue();
        if (iPanelUIAbility2 != null && iPanelUIAbility2.hasNextFeedWithoutRequest()) {
            z2 = true;
        } else {
            z2 = false;
        }
        LJ.append(z2);
        LJ.append(" \n");
        X1D.LIZIZ(LJ);
        if (i == KPE.LIZ()) {
            IFeedPanelPlatformAbility x32 = x3();
            if (x32 != null) {
                aweme2 = x32.getCurrentAweme();
            }
            if (JZV.LJ(aweme2)) {
                SwipeUpGuideStrengthenLayout swipeUpGuideStrengthenLayout2 = this.LJLJLLL;
                if ((swipeUpGuideStrengthenLayout2 != null && swipeUpGuideStrengthenLayout2.getVisibility() == 0) || (c54258LRe = this.LJLLJ) == null || c54258LRe.LIZ("permission_dialog") || !v3() || !JZV.LIZLLL() || (iPanelUIAbility = (IPanelUIAbility) this.LJLJJL.getValue()) == null || !iPanelUIAbility.hasNextFeedWithoutRequest()) {
                    return;
                }
                SwipeUpGuideStrengthenLayout swipeUpGuideStrengthenLayout3 = this.LJLJLLL;
                if (swipeUpGuideStrengthenLayout3 != null) {
                    this.LJLLLLLL = false;
                    C49629Jdp.LIZ.storeBoolean("has_shown_guide", true);
                    C17N.LJJLIIIJJI(swipeUpGuideStrengthenLayout3);
                    swipeUpGuideStrengthenLayout3.setAlpha(0.0f);
                    swipeUpGuideStrengthenLayout3.animate().alpha(1.0f).setDuration(300L).withEndAction(new ARunnableS27S0200000_8(swipeUpGuideStrengthenLayout3, this, 65)).start();
                    A3("swipe_up_guide_show");
                }
                ScrollSwitchStateManager scrollSwitchStateManager = this.LJLJLJ;
                if (scrollSwitchStateManager == null) {
                    return;
                }
                scrollSwitchStateManager.tv0(false);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, X.KUK
    public final void eventInit(C8MM c8mm) {
        if (KPE.LIZ() == 2) {
            c8mm.LIZ("event_on_play_progress_change", new AqS174S0100000_8(this, 71));
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        IViewPagerComponentAbility viewPagerComponentAbility;
        IViewPagerComponentAbility viewPagerComponentAbility2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            C54258LRe LIZ2 = LRD.LIZ(LIZ);
            KP5 listener = (KP5) this.LJLJJLL.getValue();
            o.LJIIIZ(listener, "listener");
            LIZ2.LJIIIIZZ("login_panel", listener);
            KP5 listener2 = (KP5) this.LJLJJLL.getValue();
            o.LJIIIZ(listener2, "listener");
            LIZ2.LJIIIIZZ("share_panel", listener2);
            KP5 listener3 = (KP5) this.LJLJJLL.getValue();
            o.LJIIIZ(listener3, "listener");
            LIZ2.LJIIIIZZ("comment_panel", listener3);
            KP5 listener4 = (KP5) this.LJLJJLL.getValue();
            o.LJIIIZ(listener4, "listener");
            LIZ2.LJIIIIZZ("permission_dialog", listener4);
            this.LJLLJ = LIZ2;
            C8YN.LJII(this, this.LJLJL.getValue(), new TBT() { // from class: X.9el
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C252449vU) obj).LJLJJLL;
                }
            }, null, new AqS190S0100000_8(this, 56), 6);
            IFeedPanelPlatformAbility x3 = x3();
            if (x3 != null && (viewPagerComponentAbility2 = x3.getViewPagerComponentAbility()) != null) {
                viewPagerComponentAbility2.De0(new KP3(this));
            }
            this.LJLJLJ = C84193Sd.LIZ(LIZ);
        }
        SwipeUpGuideStrengthenLayout swipeUpGuideStrengthenLayout = (SwipeUpGuideStrengthenLayout) view.findViewById(R.id.ji3);
        C80796VnM c80796VnM = null;
        if (swipeUpGuideStrengthenLayout != null) {
            IFeedPanelPlatformAbility x32 = x3();
            if (x32 != null && (viewPagerComponentAbility = x32.getViewPagerComponentAbility()) != null) {
                c80796VnM = viewPagerComponentAbility.mj0();
            }
            swipeUpGuideStrengthenLayout.setViewPager(c80796VnM);
        } else {
            swipeUpGuideStrengthenLayout = null;
        }
        this.LJLJLLL = swipeUpGuideStrengthenLayout;
        TextView textView = (TextView) view.findViewById(R.id.mj4);
        if (textView != null) {
            String string = textView.getResources().getString(R.string.qbh);
            o.LJIIIIZZ(string, "tv.resources.getString(R…chResultFeed_area_header)");
            textView.setText(ujb.o.LJJJJZ(string, "{query}", ((C50322Jp0) KNV.LIZ()).LJLJJI, false));
        }
    }
}
