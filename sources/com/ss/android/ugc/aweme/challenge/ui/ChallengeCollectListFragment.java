package com.ss.android.ugc.aweme.challenge.ui;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C186627Uc;
import X.C213538Zp;
import X.C29S;
import X.C3C5;
import X.C40342FsQ;
import X.C40343FsR;
import X.C47261Igj;
import X.C61165NzV;
import X.C76800UCe;
import X.C8Z9;
import X.C8ZK;
import X.C90903hW;
import X.FRW;
import X.InterfaceC57784Mm4;
import X.InterfaceC60761Nsz;
import X.KMP;
import X.OGG;
import X.QD3;
import X.QX2;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import X.X1D;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.favorites.service.FavoriteServiceImpl;
import com.ss.android.ugc.aweme.favorites.service.IFavoriteService;
import com.ss.android.ugc.aweme.hybridkit.HybridKitTaskImpl;
import defpackage.b1;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import ujb.s;

/* loaded from: classes11.dex */
public final class ChallengeCollectListFragment extends BaseFragment implements C8Z9, OGG, C8ZK {
    public SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LJLIL;
    public InterfaceC60761Nsz LJLILLLLZI;
    public long LJLJI;
    public int LJLJJI;
    public View LJLJL;
    public boolean LJLJLJ;
    public final Map<Integer, View> LJLJLLL = new LinkedHashMap();
    public boolean LJLJJL = true;
    public final IFavoriteService LJLJJLL = FavoriteServiceImpl.LJIJJLI();

    @Override // X.C8ZK
    public final void Od() {
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJLLL).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJLLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.LJLJL = null;
        this.LJLJLJ = false;
        super.onDestroyView();
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLIL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS);
        }
        EventBus LIZJ = EventBus.LIZJ();
        if (LIZJ != null && LIZJ.LJI(this)) {
            LIZJ.LJIJ(this);
        }
        _$_clearFindViewByIdCache();
    }

    @Override // X.OGG
    public final View LJIJJ() {
        View view = this.LJLJL;
        if (view != null && this.LJLJLJ) {
            return view;
        }
        RecyclerView vl = vl(this.LJLIL);
        if (vl != null) {
            this.LJLJL = vl;
            this.LJLJLJ = true;
            return vl;
        }
        ScrollView scrollView = new ScrollView(getContext());
        this.LJLJL = scrollView;
        return scrollView;
    }

    @Override // X.C8Z9
    public final void LJJIJL() {
        if (this.LJLJJL) {
            if (this.LJLIL == null) {
                if (this.viewValid) {
                    wl(null);
                }
            } else {
                xl(null);
            }
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLIL;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
                sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LIZIZ();
            }
        }
    }

    public static RecyclerView vl(View view) {
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                RecyclerView vl = vl(viewGroup.getChildAt(i));
                if (vl != null) {
                    return vl;
                }
            }
            return null;
        }
        return null;
    }

    @QD3
    public final void onAntiCrawlerEvent(QX2 qx2) {
        String str;
        InterfaceC60761Nsz kitView;
        if (qx2 != null && (str = qx2.LJLIL) != null && s.LJJJLZIJ(str, "/aweme/v1/challenge/listcollection/?", false)) {
            EventBus.LIZJ().LIZIZ(qx2);
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLIL;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView()) != null) {
                kitView.LJIIJ("AntiCrawlerEvent", null);
            }
        }
    }

    @QD3
    public final void onChallengeCollectEvent(C213538Zp event) {
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        InterfaceC60761Nsz kitView;
        InterfaceC60761Nsz kitView2;
        o.LJIIIZ(event, "event");
        if (!this.viewValid) {
            return;
        }
        Challenge challenge = event.LJLIL;
        if (challenge.getCollectStatus() == 0) {
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 = this.LJLIL;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 != null && (kitView2 = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2.getKitView()) != null) {
                kitView2.LJIIJ("UnChallengeCollect", C47261Igj.LJJIJ(challenge.getCid()));
                return;
            }
            return;
        }
        if (challenge.getCollectStatus() != 1 || (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLIL) == null || (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView()) == null) {
            return;
        }
        kitView.LJIIJ("onChallengeCollect", C47261Igj.LJJIJ(challenge.getCid()));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        ChallengeCollectListFragmentData challengeCollectListFragmentData;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null && (challengeCollectListFragmentData = (ChallengeCollectListFragmentData) arguments.getParcelable("power_viewpager_default_key")) != null) {
            this.LJLJJL = challengeCollectListFragmentData.requestLazy;
        }
    }

    @Override // X.C8ZK
    public final void onPageSelected(int i) {
        LJJIJL();
    }

    public final void wl(ViewGroup viewGroup) {
        Context context = getContext();
        if (context != null) {
            C40342FsQ c40342FsQ = C40343FsR.LJIILJJIL;
            SparkContext sparkContext = new SparkContext();
            String str = "aweme://lynxview/?hide_nav_bar=1&channel=discovery_hashtag_collect&bundle=pages%2Fchallenge_collection%2Ftemplate.js&dynamic=1&group=discovery_hashtag_collect";
            if (!TextUtils.isEmpty(this.LJLJJLL.LJIIZILJ())) {
                StringBuilder LIZJ = b1.LIZJ("aweme://lynxview/?hide_nav_bar=1&channel=discovery_hashtag_collect&bundle=pages%2Fchallenge_collection%2Ftemplate.js&dynamic=1&group=discovery_hashtag_collect", "&surl=");
                LIZJ.append(this.LJLJJLL.LJIIZILJ());
                str = X1D.LIZIZ(LIZJ);
            }
            sparkContext.LJJIJLIJ(str);
            sparkContext.LJJIJIL(HybridKitTaskImpl.LJIIJJI().LJ());
            sparkContext.LJIL(new C61165NzV(this, context));
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LIZJ2 = KMP.LIZJ(c40342FsQ, context, sparkContext);
            LIZJ2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            SparkContext sparkContext2 = LIZJ2.getSparkContext();
            if (sparkContext2 != null) {
                LIZJ2.LJIIJJI(sparkContext2);
            }
            FRW.LIZLLL("discovery_collect_hashtag_load_lynx");
            this.LJLJI = System.currentTimeMillis();
            this.LJLIL = LIZJ2;
            xl(viewGroup);
        }
    }

    public final void xl(ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLIL;
        ViewParent viewParent = null;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
            viewParent = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getParent();
        }
        if ((viewParent instanceof ViewGroup) && (viewGroup2 = (ViewGroup) viewParent) != null) {
            viewGroup2.removeAllViews();
        }
        if (viewGroup == null) {
            View view = getView();
            if (!(view instanceof ViewGroup) || (viewGroup = (ViewGroup) view) == null) {
                return;
            }
        }
        viewGroup.addView(this.LJLIL);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        EventBus LIZJ = EventBus.LIZJ();
        if (LIZJ != null && !LIZJ.LJI(this)) {
            LIZJ.LJIILJJIL(this);
        }
        if (!this.LJLJJL && (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLIL) != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LIZIZ();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout;
        o.LJIIIZ(inflater, "inflater");
        Context context = getContext();
        C29S c29s = null;
        if (context != null) {
            frameLayout = new FrameLayout(context);
            wl(frameLayout);
        } else {
            frameLayout = null;
        }
        if (!(frameLayout instanceof View)) {
            frameLayout = null;
        }
        if (frameLayout != null) {
            try {
                ViewTreeLifecycleOwner.set(frameLayout, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(frameLayout, this);
                C10A.LIZIZ(frameLayout, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return frameLayout;
    }

    @Override // X.C8ZK
    public final void u7(InterfaceC57784Mm4 interfaceC57784Mm4, Lifecycle.State state, List<? extends Object> list) {
        C186627Uc.LIZ(interfaceC57784Mm4, state, list);
    }
}
