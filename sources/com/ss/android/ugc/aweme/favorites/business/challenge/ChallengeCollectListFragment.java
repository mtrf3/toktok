package com.ss.android.ugc.aweme.favorites.business.challenge;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C213538Zp;
import X.C29S;
import X.C3C5;
import X.C40342FsQ;
import X.C40343FsR;
import X.C60788NtQ;
import X.C61164NzU;
import X.C61167NzX;
import X.C76800UCe;
import X.C8Z6;
import X.C8Z9;
import X.C90903hW;
import X.FRW;
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
import android.widget.ScrollView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.experiment.DiscoverCollectTemplateConfig;
import com.zhiliaoapp.musically.R;
import defpackage.b1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import ujb.s;

/* loaded from: classes11.dex */
public final class ChallengeCollectListFragment extends BaseFragment implements C8Z9, OGG {
    public SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LJLIL;
    public InterfaceC60761Nsz LJLILLLLZI;
    public long LJLJI;
    public int LJLJJI;
    public ViewGroup LJLJJLL;
    public View LJLJL;
    public final Map<Integer, View> LJLJLJ = new LinkedHashMap();
    public final boolean LJLJJL = true;

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJLJ).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJLJ;
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

    @Override // X.OGG
    public final View LJIJJ() {
        View view = this.LJLJL;
        if (view != null) {
            return view;
        }
        RecyclerView LIZ = C8Z6.LIZ(this.LJLIL);
        if (LIZ != null) {
            this.LJLJL = LIZ;
            return LIZ;
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
                    vl();
                }
                if (C76800UCe.LIZ != null) {
                    return;
                }
            }
            wl();
        }
    }

    public final void wl() {
        ViewParent viewParent;
        ViewGroup viewGroup;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLIL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
            viewParent = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getParent();
        } else {
            viewParent = null;
        }
        if ((viewParent instanceof ViewGroup) && (viewGroup = (ViewGroup) viewParent) != null) {
            viewGroup.removeAllViews();
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 = this.LJLIL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2.LIZIZ();
        }
        ViewGroup viewGroup2 = this.LJLJJLL;
        if (viewGroup2 != null) {
            viewGroup2.addView(this.LJLIL, new ViewGroup.LayoutParams(-1, -1));
        } else {
            o.LJIJI("challengeContainer");
            throw null;
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLIL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS);
        }
        EventBus LIZJ = EventBus.LIZJ();
        if (LIZJ != null && LIZJ.LJI(this)) {
            LIZJ.LJIJ(this);
        }
    }

    public final void vl() {
        Context context = getContext();
        if (context != null) {
            C40342FsQ c40342FsQ = C40343FsR.LJIILJJIL;
            SparkContext sparkContext = new SparkContext();
            DiscoverCollectTemplateConfig.LIZ.getClass();
            DiscoverCollectTemplateConfig.Config config = (DiscoverCollectTemplateConfig.Config) SettingsManager.LIZLLL().LJIIIIZZ("discovery_collect_template", DiscoverCollectTemplateConfig.Config.class, null);
            if (config == null) {
                config = new DiscoverCollectTemplateConfig.Config(null, null);
            }
            String str = "aweme://lynxview/?hide_nav_bar=1&channel=discovery_hashtag_collect&bundle=pages%2Fchallenge_collection%2Ftemplate.js&dynamic=1&group=discovery_hashtag_collect";
            if (!TextUtils.isEmpty(config.hashtagCdnUrl)) {
                StringBuilder LIZJ = b1.LIZJ("aweme://lynxview/?hide_nav_bar=1&channel=discovery_hashtag_collect&bundle=pages%2Fchallenge_collection%2Ftemplate.js&dynamic=1&group=discovery_hashtag_collect", "&surl=");
                DiscoverCollectTemplateConfig.Config config2 = (DiscoverCollectTemplateConfig.Config) SettingsManager.LIZLLL().LJIIIIZZ("discovery_collect_template", DiscoverCollectTemplateConfig.Config.class, null);
                if (config2 == null) {
                    config2 = new DiscoverCollectTemplateConfig.Config(null, null);
                }
                LIZJ.append(config2.hashtagCdnUrl);
                str = X1D.LIZIZ(LIZJ);
            }
            sparkContext.LJJIJLIJ(str);
            sparkContext.LJJIJIL(new C60788NtQ());
            sparkContext.LJIL(new C61164NzU(this, context));
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LIZJ2 = KMP.LIZJ(c40342FsQ, context, sparkContext);
            SparkContext sparkContext2 = LIZJ2.getSparkContext();
            if (sparkContext2 != null) {
                LIZJ2.LJIIJJI(sparkContext2);
            }
            FRW.LIZLLL("discovery_collect_hashtag_load_lynx");
            this.LJLJI = System.currentTimeMillis();
            this.LJLIL = LIZJ2;
            wl();
        }
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
                ArrayList arrayList = new ArrayList();
                String cid = challenge.getCid();
                o.LJIIIIZZ(cid, "challenge.cid");
                arrayList.add(cid);
                kitView2.LJIIJ("UnChallengeCollect", arrayList);
                return;
            }
            return;
        }
        if (challenge.getCollectStatus() != 1 || (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLIL) == null || (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView()) == null) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String cid2 = challenge.getCid();
        o.LJIIIIZZ(cid2, "challenge.cid");
        arrayList2.add(cid2);
        kitView.LJIIJ("onChallengeCollect", arrayList2);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        fragmentConfiguration(C61167NzX.LJLIL);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        EventBus LIZJ = EventBus.LIZJ();
        if (LIZJ != null && !LIZJ.LJI(this)) {
            LIZJ.LJIILJJIL(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        o.LJIIIZ(inflater, "inflater");
        boolean z = false;
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.av0, viewGroup, false);
        View findViewById = LLLLIILL.findViewById(R.id.b8o);
        o.LJIIIIZZ(findViewById, "this.findViewById(R.id.challenge_collect_root)");
        this.LJLJJLL = (ViewGroup) findViewById;
        C29S c29s = null;
        if (!this.LJLJJL) {
            if (this.LJLIL == null) {
                z = true;
            }
            if (z) {
                view = LLLLIILL;
            } else {
                view = null;
            }
            if (view != null) {
                vl();
            }
        }
        try {
            ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
            C10A.LIZIZ(LLLLIILL, this);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity instanceof C29S) {
                c29s = (C29S) mo49getActivity;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return LLLLIILL;
    }
}
