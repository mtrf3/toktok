package X;

import Y.AObserverS77S0100000_9;
import Y.ARunnableS28S0200000_9;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.tiktok.homepage.mainfragment.toolbar.search.SearchIconTipsHelper;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl;
import com.ss.android.ugc.aweme.search.model.FeedSearchIconViewModel;
import com.ss.android.ugc.aweme.share.viewmodel.FeedPanelStateViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS190S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LP3 extends AbstractC54129LMf {
    public TuxIconView LJLJJL;
    public InterfaceC82683Wch LJLJJLL;
    public boolean LJLJL;
    public final LP8 LJLJLJ;
    public final LP8 LJLJLLL;
    public final LP8 LJLL;
    public final LP8 LJLLI;
    public final LP8 LJLLILLLL;
    public final LP8 LJLLJ;
    public long LJLLL;
    public final List<LP8> LJLLLL;
    public final C62822Ol8 LJLLLLLL;
    public final C62822Ol8 LJLZ;
    public final C62822Ol8 LJZ;
    public final C62822Ol8 LJZI;
    public final C62822Ol8 LJZL;

    @Override // X.AbstractC54129LMf, X.LM4
    public final void LIZ() {
        TuxIconView tuxIconView = this.LJLJJL;
        if (tuxIconView != null) {
            tuxIconView.LIZIZ(false);
            Context context = tuxIconView.getContext();
            o.LJIIIIZZ(context, "context");
            Integer LJI = C79045V0n.LJI(R.attr.d4, context);
            if (LJI != null) {
                tuxIconView.setTintColor(LJI.intValue());
            }
        }
    }

    @Override // X.AbstractC54129LMf, X.LM4
    public final void LIZJ() {
        TuxIconView tuxIconView = this.LJLJJL;
        if (tuxIconView != null) {
            tuxIconView.LIZIZ(true);
            Context context = tuxIconView.getContext();
            o.LJIIIIZZ(context, "context");
            Integer LJI = C79045V0n.LJI(R.attr.dj, context);
            if (LJI != null) {
                tuxIconView.setTintColor(LJI.intValue());
            }
        }
    }

    @Override // X.LM4
    public final View LJII() {
        TuxIconView tuxIconView;
        TuxIconView tuxIconView2;
        ViewParent viewParent;
        ViewGroup viewGroup;
        ActivityC45651qj activity = this.LJLIL.getActivity();
        if (activity == null) {
            return null;
        }
        if (C35056DpM.LIZ == 2) {
            View inflatedSearchIcon = HomePageUIFrameServiceImpl.LIZ().getInflatedSearchIcon(activity);
            if (inflatedSearchIcon instanceof TuxIconView) {
                tuxIconView2 = (TuxIconView) inflatedSearchIcon;
            } else {
                tuxIconView2 = null;
            }
            this.LJLJJL = tuxIconView2;
            if (tuxIconView2 != null) {
                viewParent = tuxIconView2.getParent();
            } else {
                viewParent = null;
            }
            if ((viewParent instanceof ViewGroup) && (viewGroup = (ViewGroup) viewParent) != null) {
                C16880lQ.LJLLL(this.LJLJJL, viewGroup);
            }
        } else {
            View buildSearchIcon = HomePageUIFrameServiceImpl.LIZ().buildSearchIcon(activity);
            if (buildSearchIcon instanceof TuxIconView) {
                tuxIconView = (TuxIconView) buildSearchIcon;
            } else {
                tuxIconView = null;
            }
            this.LJLJJL = tuxIconView;
        }
        LiveOuterService.LJJJLL().LJJJJLL(false).getClass();
        LQM.LJIIL = null;
        if (LJIIIIZZ().LJJLL()) {
            SearchIconTipsHelper searchIconTipsHelper = SearchIconTipsHelper.LJLIL;
            TuxIconView tuxIconView3 = this.LJLJJL;
            o.LJI(tuxIconView3);
            LP4 lp4 = new LP4(this);
            searchIconTipsHelper.getClass();
            activity.getLifecycle().addObserver(searchIconTipsHelper);
            SearchIconTipsHelper.LJLJJI = activity;
            SearchIconTipsHelper.LJLJJL = tuxIconView3;
            SearchIconTipsHelper.LJLJJLL = lp4;
            if (LJIIIIZZ().LLLLLZIL()) {
                ActivityC45651qj activityC45651qj = SearchIconTipsHelper.LJLJJI;
                o.LJI(activityC45651qj);
                C142425iQ c142425iQ = new C142425iQ(activityC45651qj);
                TuxIconView tuxIconView4 = SearchIconTipsHelper.LJLJJL;
                o.LJI(tuxIconView4);
                c142425iQ.LIZ.LIZIZ = tuxIconView4;
                c142425iQ.LJI(WHL.BOTTOM);
                c142425iQ.LIZ.LJII = 5000L;
                c142425iQ.LIZ.LJIIIIZZ = C17N.LJIILL(8.0d);
                c142425iQ.LJIIIZ(R.attr.eh);
                View LLLZIIL = C16880lQ.LLLZIIL(R.layout.cqh, C16880lQ.LLZIL(SearchIconTipsHelper.LJLJJI), null);
                o.LJII(LLLZIIL, "null cannot be cast to non-null type com.bytedance.tux.input.TuxTextView");
                ActivityC45651qj activityC45651qj2 = SearchIconTipsHelper.LJLJJI;
                o.LJI(activityC45651qj2);
                ((TextView) LLLZIIL).setText(activityC45651qj2.getText(R.string.a1g));
                c142425iQ.LIZ.LJIJ = LLLZIIL;
                int i = -C17N.LJIILL(12.0d);
                C82682Wcg c82682Wcg = c142425iQ.LIZ;
                c82682Wcg.LJFF = i;
                c82682Wcg.LJIJJLI = true;
                c142425iQ.LJ(LP9.LJLIL);
                InterfaceC82683Wch LIZJ = c142425iQ.LIZJ();
                LIZJ.LJ(new LP5(this));
                this.LJLJJLL = LIZJ;
                LJIJI();
            }
        }
        TuxIconView tuxIconView5 = this.LJLJJL;
        if (tuxIconView5 != null) {
            C78897Uxp.LJJJJLI(tuxIconView5, new AqS190S0100000_8(this, 89));
        }
        return this.LJLJJL;
    }

    public final void LJIJI() {
        TuxIconView tuxIconView;
        ActivityC45651qj activity;
        ActivityC45651qj activity2 = this.LJLIL.getActivity();
        if (activity2 == null) {
            return;
        }
        Aweme LIZIZ = LNH.LIZIZ(activity2);
        if (LIZIZ != null && LIZIZ.isAd()) {
            if (this.LJLILLLLZI != null || (activity = this.LJLIL.getActivity()) == null || this.LJLILLLLZI != null) {
                return;
            }
            AObserverS77S0100000_9 aObserverS77S0100000_9 = new AObserverS77S0100000_9(this, 24);
            LNH.LIZJ(activity).observe(activity, aObserverS77S0100000_9);
            this.LJLILLLLZI = aObserverS77S0100000_9;
            return;
        }
        LJIIIZ();
        if ((!this.LJLJL) && !SearchIconTipsHelper.LJLIL.LIZJ()) {
            this.LJLJL = true;
            return;
        }
        SearchIconTipsHelper.LJLIL.getClass();
        if (SearchIconTipsHelper.LIZIZ()) {
            LJIILL(((FeedPanelStateViewModel) ViewModelProviders.of(activity2).get(FeedPanelStateViewModel.class)).LJLILLLLZI, activity2, (Observer) this.LJLLLLLL.getValue());
            return;
        }
        ActivityC45651qj activityC45651qj = SearchIconTipsHelper.LJLJJI;
        if (activityC45651qj == null || !o.LJ(((FeedPanelStateViewModel) ViewModelProviders.of(activityC45651qj).get(FeedPanelStateViewModel.class)).LJZ.getValue(), Boolean.TRUE)) {
            FeedPanelStateViewModel feedPanelStateViewModel = (FeedPanelStateViewModel) ViewModelProviders.of(activity2).get(FeedPanelStateViewModel.class);
            this.LJLLILLLL.LIZ = SearchIconTipsHelper.LIZ();
            if (this.LJLLILLLL.LIZ) {
                LJIILL(feedPanelStateViewModel.LJLLILLLL, activity2, (Observer) this.LJZ.getValue());
            }
            this.LJLLJ.LIZ = SearchIconTipsHelper.LIZLLL();
            if (this.LJLLJ.LIZ) {
                LJIILL(feedPanelStateViewModel.LJLJL, activity2, (Observer) this.LJZI.getValue());
            }
            List<LP8> list = this.LJLLLL;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<LP8> it = list.iterator();
                while (it.hasNext()) {
                    if (it.next().LIZ) {
                        return;
                    }
                }
            }
            if (!o.LJ(((LiveData) LJIIIIZZ().LLLLLJLJLL(activity2).LJLILLLLZI.getValue()).getValue(), Boolean.TRUE) && (tuxIconView = this.LJLJJL) != null) {
                tuxIconView.postDelayed(new ARunnableS28S0200000_9(activity2, this, 73), 500L);
                return;
            }
            return;
        }
        LJIILL(((FeedPanelStateViewModel) ViewModelProviders.of(activity2).get(FeedPanelStateViewModel.class)).LJZ, activity2, (Observer) this.LJLZ.getValue());
    }

    public final void LJIILIIL() {
        LJIIIIZZ().LJJLIIIJL();
        ActivityC45651qj activity = this.LJLIL.getActivity();
        if (activity == null) {
            return;
        }
        FeedPanelStateViewModel feedPanelStateViewModel = (FeedPanelStateViewModel) ViewModelProviders.of(activity).get(FeedPanelStateViewModel.class);
        feedPanelStateViewModel.LJLILLLLZI.removeObserver((Observer) this.LJLLLLLL.getValue());
        feedPanelStateViewModel.LJLLILLLL.removeObserver((Observer) this.LJZ.getValue());
        feedPanelStateViewModel.LJLJL.removeObserver((Observer) this.LJZI.getValue());
        feedPanelStateViewModel.LJZ.removeObserver((Observer) this.LJLZ.getValue());
        FeedSearchIconViewModel LLLLLJLJLL = LJIIIIZZ().LLLLLJLJLL(activity);
        ((LiveData) LLLLLJLJLL.LJLIL.getValue()).postValue(2);
        ((LiveData) LLLLLJLJLL.LJLJI.getValue()).removeObserver((Observer) this.LJZL.getValue());
        LJIIIZ();
    }

    public LP3(LNP lnp) {
        super(lnp);
        LP8 lp8 = new LP8("recommend-users-process");
        this.LJLJLJ = lp8;
        LP8 lp82 = new LP8("recommend-users-show");
        this.LJLJLLL = lp82;
        LP8 lp83 = new LP8("swipe-up");
        this.LJLL = lp83;
        LP8 lp84 = new LP8("not-interested");
        this.LJLLI = lp84;
        LP8 lp85 = new LP8("open-follow");
        this.LJLLILLLL = lp85;
        LP8 lp86 = new LP8("privacy");
        this.LJLLJ = lp86;
        this.LJLLLL = C47261Igj.LJJIJIIJI(lp8, lp82, lp83, lp85, lp86, lp84);
        this.LJLLLLLL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 996));
        this.LJLZ = C221108m2.LIZIZ(new AqS159S0100000_9(this, 992));
        this.LJZ = C221108m2.LIZIZ(new AqS159S0100000_9(this, 991));
        this.LJZI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 993));
        C221108m2.LIZIZ(new AqS159S0100000_9(this, 994));
        C221108m2.LIZIZ(new AqS159S0100000_9(this, 995));
        this.LJZL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 997));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
    
        if (r5 != null) goto L16;
     */
    @Override // X.LM4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(android.view.View r34) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LP3.LJFF(android.view.View):void");
    }

    @Override // X.AbstractC54129LMf
    public final void LJIIJJI(int i) {
        TuxIconView tuxIconView;
        TuxIconView tuxIconView2 = this.LJLJJL;
        if (tuxIconView2 == null) {
            return;
        }
        C55511LqV.LJIIJJI(i, tuxIconView2);
        if (i != 4 || (tuxIconView = this.LJLJJL) == null) {
            return;
        }
        tuxIconView.setAlpha(1.0f);
    }

    public final void LJIILLIIL(LP8 lp8) {
        lp8.LIZ = false;
        Iterator<LP8> it = this.LJLLLL.iterator();
        while (it.hasNext()) {
            if (it.next().LIZ) {
                return;
            }
        }
        ActivityC45651qj activity = this.LJLIL.getActivity();
        if (activity == null) {
            return;
        }
        FeedSearchIconViewModel LLLLLJLJLL = LJIIIIZZ().LLLLLJLJLL(activity);
        if (o.LJ(((LiveData) LLLLLJLJLL.LJLILLLLZI.getValue()).getValue(), Boolean.TRUE)) {
            return;
        }
        ((LiveData) LLLLLJLJLL.LJLIL.getValue()).postValue(1);
        LJIILL((MutableLiveData) LLLLLJLJLL.LJLJI.getValue(), activity, (Observer) this.LJZL.getValue());
    }

    @Override // X.LNI
    public final void LJJLIIIJ(Aweme aweme) {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onAwemeChange aid(");
        Boolean bool = null;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(") ads: ");
        if (aweme != null) {
            bool = Boolean.valueOf(aweme.isAd());
        }
        LIZ.append(bool);
        X1D.LIZIZ(LIZ);
        LJIJI();
    }

    public static void LJIILL(MutableLiveData mutableLiveData, ActivityC45651qj activityC45651qj, Observer observer) {
        if (mutableLiveData == null) {
            return;
        }
        if (o.LJ(C16880lQ.LLJJJJ(), Looper.myLooper())) {
            mutableLiveData.observe(activityC45651qj, observer);
        } else {
            XKX.LJ(C36636EZk.LIZ, new C63182du(mutableLiveData, activityC45651qj, observer, null));
        }
    }
}
