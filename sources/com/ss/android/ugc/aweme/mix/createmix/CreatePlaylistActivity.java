package com.ss.android.ugc.aweme.mix.createmix;

import X.C16880lQ;
import X.C184077Kh;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C214298b3;
import X.C214528bQ;
import X.C228688yG;
import X.C228888ya;
import X.C228918yd;
import X.C228928ye;
import X.C228958yh;
import X.C228968yi;
import X.C228978yj;
import X.C33Q;
import X.C3C8;
import X.C56412MCa;
import X.C65352Pkq;
import X.C65776Prg;
import X.C65803Ps7;
import X.C76800UCe;
import X.C78926UyI;
import X.C8C5;
import X.C8C8;
import X.C8YN;
import X.C8YZ;
import X.C94713nf;
import X.HG3;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC65784Pro;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.KPL;
import X.OSK;
import X.OSL;
import X.OSM;
import X.QD3;
import X.TBT;
import X.TBW;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mix.createmix.viewmodel.MixCreateViewModel;
import com.ss.android.ugc.aweme.mix.editname.EditPlayListNameFragment;
import com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosManageViewModel;
import com.ss.android.ugc.aweme.mix.services.MixFeedService;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS13S2100000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.AqS28S1000000_3;
import kotlin.jvm.internal.AqS60S0110000_3;
import kotlin.jvm.internal.AqS61S0110000_4;
import kotlin.jvm.internal.AqS8S0010000_3;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes4.dex */
public final class CreatePlaylistActivity extends C8C5 implements KPL {
    public final C214298b3 LJLILLLLZI;
    public final C214298b3 LJLJI;
    public String LJLJJI;
    public String LJLJJL;
    public int LJLJJLL;
    public String LJLJL;
    public Aweme LJLJLJ;
    public final Map<Integer, View> LJLJLLL = new LinkedHashMap();

    @Override // X.C8C5, X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJLLL).clear();
    }

    @Override // X.C8C5, X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJLLL;
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

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        super.onResume();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mix.createmix.CreatePlaylistActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public CreatePlaylistActivity() {
        C65776Prg LIZ = C65352Pkq.LIZ(MixCreateViewModel.class);
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(LIZ, 490);
        C228918yd c228918yd = C228918yd.INSTANCE;
        C214528bQ c214528bQ = C214528bQ.LJLIL;
        AqS61S0110000_4 LJJII = C78926UyI.LJJII(this, false);
        AqS60S0110000_3 LJJIIJZLJL = C78926UyI.LJJIIJZLJL(this, false);
        C184077Kh c184077Kh = C184077Kh.LJLIL;
        this.LJLILLLLZI = new C214298b3(LIZ, aqS153S0100000_3, c214528bQ, LJJII, LJJIIJZLJL, c184077Kh, c228918yd, (InterfaceC65784Pro) null, 384);
        C65776Prg LIZ2 = C65352Pkq.LIZ(MixVideosManageViewModel.class);
        this.LJLJI = new C214298b3(LIZ2, new AqS153S0100000_3(LIZ2, 491), c214528bQ, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), c184077Kh, C228928ye.INSTANCE, (InterfaceC65784Pro) null, 384);
        this.LJLJJI = "";
        this.LJLJJL = "";
        this.LJLJJLL = 1;
        this.LJLJL = "";
    }

    @Override // X.C8C5
    public final Fragment LLFII() {
        int i = this.LJLJJLL;
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    MixCreateViewModel LLFZ = LLFZ();
                    LLFZ.getClass();
                    LLFZ.setState(new AqS8S0010000_3(true, 44));
                    C228888ya.LJ(LLFZ().LJLILLLLZI, LLFZ().LJLJI);
                    C228888ya.LJIIIZ(LLFZ().LJLILLLLZI, LLFZ().LJLJI);
                    return C8C8.LIZIZ(EditPlayListNameFragment.LJLJL, 3, null, null, this.LJLJLJ, null, null, 54);
                }
                ((MixVideosManageViewModel) this.LJLJI.getValue()).gv0(this.LJLJL, "", this.LJLJJI);
                MixCreateViewModel LLFZ2 = LLFZ();
                String mixId = this.LJLJL;
                LLFZ2.getClass();
                o.LJIIIZ(mixId, "mixId");
                LLFZ2.setState(new AqS28S1000000_3(mixId, 20));
                LLFZ2.LJLIL = mixId;
                MixCreateViewModel LLFZ3 = LLFZ();
                LLFZ3.getClass();
                LLFZ3.setState(new AqS8S0010000_3(false, 44));
                LLFZ().LJLJJL = true;
                C228888ya.LJIIJ(((MixVideosManageViewModel) this.LJLJI.getValue()).LJLIL, "manage_video");
                return C228688yG.LIZ();
            }
            MixCreateViewModel LLFZ4 = LLFZ();
            LLFZ4.getClass();
            LLFZ4.setState(new AqS8S0010000_3(true, 44));
            C228888ya.LJ(LLFZ().LJLILLLLZI, LLFZ().LJLJI);
            ((MixVideosManageViewModel) this.LJLJI.getValue()).gv0(this.LJLJL, "", this.LJLJJI);
            MixCreateViewModel LLFZ5 = LLFZ();
            String mixId2 = this.LJLJL;
            LLFZ5.getClass();
            o.LJIIIZ(mixId2, "mixId");
            LLFZ5.setState(new AqS28S1000000_3(mixId2, 20));
            LLFZ5.LJLIL = mixId2;
            if (MixFeedService.LJJIJIIJIL().needCreateFirstMix()) {
                C228888ya.LJIIIIZZ(this.LJLJJI, this.LJLJJL);
                return C94713nf.LIZ(this.LJLJJI, LLFZ().LJLJI);
            }
            C228888ya.LJIIJ(LLFZ().LJLILLLLZI, LLFZ().LJLJI);
            return C228688yG.LIZ();
        }
        MixCreateViewModel LLFZ6 = LLFZ();
        LLFZ6.getClass();
        LLFZ6.setState(new AqS8S0010000_3(true, 44));
        C228888ya.LJ(LLFZ().LJLILLLLZI, LLFZ().LJLJI);
        if (MixFeedService.LJJIJIIJIL().needCreateFirstMix()) {
            C228888ya.LJIIIIZZ(this.LJLJJI, this.LJLJJL);
            return C94713nf.LIZ(this.LJLJJI, LLFZ().LJLJI);
        }
        C228888ya.LJIIIZ(LLFZ().LJLILLLLZI, LLFZ().LJLJI);
        return C8C8.LIZIZ(EditPlayListNameFragment.LJLJL, 1, null, null, null, null, null, 62);
    }

    public final MixCreateViewModel LLFZ() {
        return (MixCreateViewModel) this.LJLILLLLZI.getValue();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
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

    @Override // X.C8C5, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mix.createmix.CreatePlaylistActivity", "onCreate", true);
        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("enter_from")) {
            String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "enter_from");
            String str = "";
            if (LLJJIJIIJIL == null) {
                LLJJIJIIJIL = "";
            }
            this.LJLJJI = LLJJIJIIJIL;
            String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(intent, "enter_method");
            if (LLJJIJIIJIL2 == null) {
                LLJJIJIIJIL2 = "";
            }
            this.LJLJJL = LLJJIJIIJIL2;
            MixCreateViewModel LLFZ = LLFZ();
            String enterFrom = this.LJLJJI;
            String enterMethod = this.LJLJJL;
            LLFZ.getClass();
            o.LJIIIZ(enterFrom, "enterFrom");
            o.LJIIIZ(enterMethod, "enterMethod");
            LLFZ.LJLILLLLZI = enterFrom;
            LLFZ.LJLJI = enterMethod;
            this.LJLJJLL = intent.getIntExtra("open_fragment_type", 1);
            String LLJJIJIIJIL3 = C16880lQ.LLJJIJIIJIL(intent, "key_manage_mix_id");
            if (LLJJIJIIJIL3 != null) {
                str = LLJJIJIIJIL3;
            }
            this.LJLJL = str;
            Bundle LLJJIJI = C16880lQ.LLJJIJI(intent);
            if (LLJJIJI != null && LLJJIJI.getSerializable("key_mix_add_aweme_info") != null) {
                Serializable serializableExtra = intent.getSerializableExtra("key_mix_add_aweme_info");
                o.LJII(serializableExtra, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.model.Aweme");
                this.LJLJLJ = (Aweme) serializableExtra;
            }
        }
        super.onCreate(bundle);
        C8YN.LJII(this, LLFZ(), new TBT() { // from class: X.8yc
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C228798yR) obj).LJLJJLL;
            }
        }, null, new AqS185S0100000_3(this, 54), 6);
        EventBus.LIZJ().LJIILJJIL(this);
        HG3.LJIIL();
        String curUserId = HG3.LJLJL.LJFF().getCurUserId();
        HG3.LJIIL();
        String curSecUserId = HG3.LJLJL.LJFF().getCurSecUserId();
        AssemViewModel.asyncSubscribe$default(LLFZ(), new TBT() { // from class: X.8yZ
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C228798yR) obj).LJLJL;
            }
        }, null, new AqS169S0100000_3(this, 257), C228978yj.LJLIL, new AqS13S2100000_3(this, curUserId, curSecUserId, 1), 2, null);
        AssemViewModel.asyncSubscribe$default(LLFZ(), new TBT() { // from class: X.8yb
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C228798yR) obj).LJLJLJ;
            }
        }, null, new AqS169S0100000_3(this, 258), C228968yi.LJLIL, new AqS13S2100000_3(this, curUserId, curSecUserId, 0), 2, null);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mix.createmix.CreatePlaylistActivity", "onCreate", false);
    }

    @QD3
    public final void onCreateMixListSuccess(C228958yh event) {
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
