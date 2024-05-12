package com.ss.android.ugc.aweme.offlinemode.ui;

import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C214298b3;
import X.C221108m2;
import X.C221138m5;
import X.C252369vM;
import X.C26222AQw;
import X.C2MJ;
import X.C2MX;
import X.C33Q;
import X.C3C8;
import X.C42625Go9;
import X.C46276IEe;
import X.C47261Igj;
import X.C51781KTx;
import X.C56412MCa;
import X.C5H3;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C78926UyI;
import X.C8YN;
import X.C8YZ;
import X.C9BD;
import X.C9SV;
import X.EnumC221088m0;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.JAK;
import X.KPL;
import X.KR8;
import X.KU4;
import X.OSK;
import X.OSL;
import X.OSM;
import X.QD3;
import X.TBT;
import X.TBW;
import android.hardware.display.DisplayManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.offlinemode.ui.OfflineModeContentComponent;
import com.ss.android.ugc.aweme.offlinemode.viewmodel.OfflineModeManagerVM;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.system.SystemComponentAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.AqS61S0110000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class OfflineModeContentComponent extends BasePanelComponent implements KPL, DisplayManager.DisplayListener {
    public static final C26222AQw LJLJL = new C26222AQw("OfflineModeContentComponent");
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 493));
    public final C5H3 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C214298b3 LJLJJI;
    public boolean LJLJJL;
    public final C221138m5 LJLJJLL;

    /* JADX WARN: Multi-variable type inference failed */
    public OfflineModeContentComponent() {
        C62822Ol8 c62822Ol8;
        if (JAK.LIZ()) {
            C221138m5 c221138m5 = new C221138m5(EnumC221088m0.PUBLICATION, new AqS154S0100000_4((KU4) this, 492), null);
            C51781KTx.LIZJ(this, c221138m5);
            c62822Ol8 = c221138m5;
        } else {
            c62822Ol8 = C221108m2.LIZIZ(new AqS61S0110000_4(false, (KU4) this, 1));
        }
        this.LJLILLLLZI = c62822Ol8;
        this.LJLJI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 489));
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(OfflineModeManagerVM.class);
        this.LJLJJI = C78926UyI.LJ(this, LIZ, c9bd, new AqS154S0100000_4(LIZ, 491), C252369vM.INSTANCE, null);
        this.LJLJJLL = KR8.LJIIJJI(new AqS154S0100000_4(this, 490));
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

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.C8W0
    public final void onCreate() {
        super.onCreate();
        SystemComponentAbility systemComponentAbility = (SystemComponentAbility) this.LJLILLLLZI.getValue();
        if (systemComponentAbility != null) {
            systemComponentAbility.registerDisplayListener(this);
        }
        if (C2MX.LIZ().LIZIZ) {
            this.LJLJJL = true;
            LJLJL.LIZLLL("video pause because of screenRecording");
            DetailFragmentPanel v3 = v3();
            if (v3 != null) {
                v3.LJLILLLLZI = true;
                v3.pausePlayer();
            }
            DetailFragmentPanel v32 = v3();
            if (v32 != null) {
                v32.handlePause(true);
            }
            ((OfflineModeManagerVM) this.LJLJJI.getValue()).tv0(C9SV.SCREEN_RECORDING_TOAST);
        }
        C8YN.LJII(this, (AssemViewModel) this.LJLJJI.getValue(), new TBT() { // from class: X.9Tx
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((C9S3) obj).LJLILLLLZI);
            }
        }, null, new AqS186S0100000_4(this, 129), 6);
        C42625Go9.LIZIZ(this);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
    }

    public final DetailFragmentPanel v3() {
        return (DetailFragmentPanel) this.LJLJJLL.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        C42625Go9.LIZJ(this);
        SystemComponentAbility systemComponentAbility = (SystemComponentAbility) this.LJLILLLLZI.getValue();
        if (systemComponentAbility != null) {
            systemComponentAbility.unregisterDisplayListener(this);
        }
    }

    @Override // X.C8W0
    public final void onParentViewCreated() {
        super.onParentViewCreated();
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LJLIL.getValue();
        if (iViewPagerComponentAbility != null) {
            iViewPagerComponentAbility.De0(new C2MJ() { // from class: X.9Sq
                @Override // X.C2MJ
                public final void J8(int i) {
                }

                @Override // X.C2MJ
                public final void e(int i, boolean z) {
                }

                @Override // X.C2MJ, X.C0C3
                public final void onPageScrollStateChanged(int i) {
                }

                @Override // X.C2MJ, X.C0C3
                public final void onPageScrolled(int i, float f, int i2) {
                }

                @Override // X.C2MJ
                public final void Ye(C2MA selectedHolder) {
                    o.LJIIIZ(selectedHolder, "selectedHolder");
                }

                @Override // X.C2MJ, X.C0C3
                public final void onPageSelected(int i) {
                    String str;
                    Aweme currentAweme;
                    OfflineModeManagerVM offlineModeManagerVM = (OfflineModeManagerVM) OfflineModeContentComponent.this.LJLJJI.getValue();
                    IViewPagerComponentAbility iViewPagerComponentAbility2 = (IViewPagerComponentAbility) OfflineModeContentComponent.this.LJLIL.getValue();
                    if (iViewPagerComponentAbility2 != null && (currentAweme = iViewPagerComponentAbility2.getCurrentAweme()) != null) {
                        str = currentAweme.getAid();
                    } else {
                        str = null;
                    }
                    OfflineModeManagerVM.LJLJJI.LIZ(str, "toggleUpdateWatchState aid");
                    if (str == null) {
                        return;
                    }
                    XKX.LIZLLL(ViewModelKt.getViewModelScope(offlineModeManagerVM), C78613UtF.LIZJ, null, new C9Q5(offlineModeManagerVM, str, null), 2);
                }
            });
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
        LJLJL.LJIIIIZZ("video pause because of screenRecording");
        this.LJLJJL = true;
        DetailFragmentPanel v3 = v3();
        if (v3 != null) {
            v3.LJLILLLLZI = true;
            v3.pausePlayer();
        }
        DetailFragmentPanel v32 = v3();
        if (v32 != null) {
            v32.handlePause(true);
        }
        ((OfflineModeManagerVM) this.LJLJJI.getValue()).tv0(C9SV.SCREEN_RECORDING_TOAST);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
        this.LJLJJL = false;
        DetailFragmentPanel v3 = v3();
        if (v3 != null) {
            v3.LJLILLLLZI = false;
            v3.tryResumePlay();
        }
    }

    @QD3
    public final void onVideoPlayerEvent(C46276IEe status) {
        DetailFragmentPanel v3;
        o.LJIIIZ(status, "status");
        if (C47261Igj.LJJIJIIJI(3, 10).contains(Integer.valueOf(status.LJLIL)) && this.LJLJJL && (v3 = v3()) != null) {
            v3.handlePause(true);
        }
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
