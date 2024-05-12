package com.ss.android.ugc.aweme.mix.videodetail;

import X.C16880lQ;
import X.C184077Kh;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C214298b3;
import X.C214528bQ;
import X.C228628yA;
import X.C229208z6;
import X.C33Q;
import X.C3C8;
import X.C55442LpO;
import X.C55443LpP;
import X.C56412MCa;
import X.C65352Pkq;
import X.C65776Prg;
import X.C65803Ps7;
import X.C76800UCe;
import X.C78926UyI;
import X.C8YZ;
import X.C90193gN;
import X.DZ8;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC229748zy;
import X.InterfaceC40934G4s;
import X.InterfaceC65784Pro;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.KPL;
import X.M7B;
import X.M7D;
import X.M7K;
import X.M89;
import X.OSK;
import X.OSL;
import X.OSM;
import X.QD3;
import X.TBW;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.detail.ui.DetailActivity;
import com.ss.android.ugc.aweme.detail.ui.DetailFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes10.dex */
public final class MixVideoDetailActivity extends DetailActivity implements InterfaceC229748zy, KPL, InterfaceC40934G4s {
    public static final /* synthetic */ int LLI = 0;
    public final C214298b3 LLFII;
    public final Map<Integer, View> LLFZ = new LinkedHashMap();

    @Override // X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLFZ).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLFZ;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.KPL, X.C8YZ
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final C8YZ getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.KPL, X.InterfaceC212848Wy
    public final C3C8 getActualReceiver() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final InterfaceC212848Wy<C3C8> getActualReceiverHolder() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final C3C8 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C8YM
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailActivity, X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailActivity, X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        super.onResume();
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailActivity, X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailActivity, X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mix.videodetail.MixVideoDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public MixVideoDetailActivity() {
        C65776Prg LIZ = C65352Pkq.LIZ(MixVideosViewModel.class);
        this.LLFII = new C214298b3(LIZ, new AqS159S0100000_9(LIZ, 328), C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C55443LpP.INSTANCE, (InterfaceC65784Pro) null, 384);
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailActivity, X.ActivityC86117Xqz, android.app.Activity
    public final void finish() {
        int i;
        super.finish();
        if (o.LJ(C16880lQ.LLJJIJIIJIL(getIntent(), "video_from"), "from_search_playlist")) {
            return;
        }
        if (C90193gN.LIZIZ(this)) {
            i = R.anim.g0;
        } else {
            i = R.anim.g2;
        }
        overridePendingTransition(0, i);
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailActivity, X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        try {
            super.onDestroy();
            EventBus.LIZJ().LJIJ(this);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailActivity, X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStop() {
        C65803Ps7.LJFF(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable unused2) {
        }
    }

    @Override // X.InterfaceC229748zy
    public final void LJJII(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        ((AssemViewModel) this.LLFII.getValue()).setState(M7K.LJLIL);
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailActivity
    public final DetailFragment LLFII(M89 m89) {
        M7D m7d;
        String str;
        String str2;
        String str3;
        long j;
        String enterGroupId;
        Serializable serializableExtra = getIntent().getSerializableExtra("mix_video_list_params");
        if (serializableExtra instanceof M7D) {
            m7d = (M7D) serializableExtra;
        } else {
            m7d = null;
        }
        String str4 = "";
        if (m7d == null || (str = m7d.getMVideoFrom()) == null) {
            str = "";
        }
        m89.setFrom(str);
        if (m7d == null || (str2 = m7d.getMSecUid()) == null) {
            str2 = "";
        }
        m89.setSecUid(str2);
        if (m7d == null || (str3 = m7d.getMUsrId()) == null) {
            str3 = "";
        }
        m89.setUid(str3);
        if (m7d != null && (enterGroupId = m7d.getEnterGroupId()) != null) {
            str4 = enterGroupId;
        }
        m89.setPlaylistEnterGroupId(str4);
        MixVideosViewModel mixVideosViewModel = (MixVideosViewModel) this.LLFII.getValue();
        if (m7d != null) {
            j = m7d.getPageStartTime();
        } else {
            j = -1;
        }
        mixVideosViewModel.LJLLLLLL = j;
        if (m7d != null) {
            ((MixVideosViewModel) this.LLFII.getValue()).LL = m7d.getFromShare();
            ((MixVideosViewModel) this.LLFII.getValue()).LLD = m7d.getShowLast();
            ((MixVideosViewModel) this.LLFII.getValue()).LLF = m7d.getTotalVideoCount();
        }
        Bundle bundle = new Bundle();
        bundle.putSerializable("mix_video_list_params", m7d);
        bundle.putSerializable("feed_param", m89);
        MixVideoPlayFragment mixVideoPlayFragment = new MixVideoPlayFragment();
        mixVideoPlayFragment.setArguments(bundle);
        return mixVideoPlayFragment;
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void manageVideoDoneClick(C228628yA event) {
        o.LJIIIZ(event, "event");
        finish();
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailActivity, X.YUC, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mix.videodetail.MixVideoDetailActivity", "onCreate", true);
        super.onCreate(bundle);
        if (getIntent().getBooleanExtra("key_play_next", false) || DZ8.LIZ) {
            activityConfiguration(C55442LpO.LJLIL);
        }
        EventBus.LIZJ().LJIILJJIL(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mix.videodetail.MixVideoDetailActivity", "onCreate", false);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onDeleteMix(M7B event) {
        o.LJIIIZ(event, "event");
        finish();
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onReomveFeedFromMixDetailSuccess(C229208z6 event) {
        o.LJIIIZ(event, "event");
        finish();
    }

    @Override // X.C8YM
    public final <S extends C33Q> InterfaceC222288nw subscribe(AssemViewModel<S> assemViewModel, C56412MCa<S> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJIIIIZZ(this, assemViewModel, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LIZJ(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJII(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C56412MCa<C213198Yh<A, B>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88473Ynt<? super C3C8, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C212418Vh.LIZIZ(assemViewModel, this, c56412MCa, interfaceC88472Yns, interfaceC88473Ynt, tbw, tbw2);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C56412MCa<OSK<A, B, C>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88474Ynu<? super C3C8, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C212418Vh.LIZLLL(this, assemViewModel, tbw, tbw2, tbw3, c56412MCa, interfaceC88472Yns, interfaceC88474Ynu);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C56412MCa<OSL<A, B, C, D>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88475Ynv<? super C3C8, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C212418Vh.LJ(this, assemViewModel, tbw, tbw2, tbw3, tbw4, c56412MCa, interfaceC88472Yns, interfaceC88475Ynv);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D, E> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, TBW<S, ? extends E> tbw5, C56412MCa<OSM<A, B, C, D, E>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88476Ynw<? super C3C8, ? super A, ? super B, ? super C, ? super D, ? super E, C76800UCe> interfaceC88476Ynw) {
        return C212418Vh.LJFF(this, assemViewModel, tbw, tbw2, tbw3, tbw4, tbw5, c56412MCa, interfaceC88472Yns, interfaceC88476Ynw);
    }
}
