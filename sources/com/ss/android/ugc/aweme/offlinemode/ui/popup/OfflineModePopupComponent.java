package com.ss.android.ugc.aweme.offlinemode.ui.popup;

import X.AbstractC244919jL;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C214298b3;
import X.C221108m2;
import X.C237139Sj;
import X.C238589Xy;
import X.C26222AQw;
import X.C2L4;
import X.C33Q;
import X.C3C8;
import X.C56412MCa;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C76965UIn;
import X.C78926UyI;
import X.C8YN;
import X.C8YZ;
import X.C9BD;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
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
import X.TBT;
import X.TBW;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.offlinemode.ui.popup.OfflineModePopupComponent;
import com.ss.android.ugc.aweme.offlinemode.viewmodel.OfflineModeManagerVM;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.RootPanelScope;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import java.util.List;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;

/* loaded from: classes5.dex */
public final class OfflineModePopupComponent extends BasePanelComponent implements KPL, C2L4 {
    public static final C26222AQw LJLL = new C26222AQw("OfflineModePopupComponent");
    public final C214298b3 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final C238589Xy LJLJLLL;

    /* JADX WARN: Type inference failed for: r0v14, types: [X.9Xy] */
    public OfflineModePopupComponent() {
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(OfflineModeManagerVM.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9bd, new AqS154S0100000_4(LIZ, 508), C237139Sj.INSTANCE, null);
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 505));
        this.LJLJI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 507));
        this.LJLJJI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 509));
        this.LJLJJLL = true;
        this.LJLJL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 506));
        this.LJLJLJ = C221108m2.LIZIZ(new AqS154S0100000_4(this, 504));
        this.LJLJLLL = new AbstractC244919jL() { // from class: X.9Xy
            @Override // X.AbstractC244919jL, X.InterfaceC55109Lk1
            public final void onHide() {
                int i;
                boolean z;
                OfflineModePopupComponent offlineModePopupComponent = OfflineModePopupComponent.this;
                if (!offlineModePopupComponent.LJLJJL) {
                    return;
                }
                offlineModePopupComponent.LJLJJL = false;
                int i2 = offlineModePopupComponent.v3().getState().LJLILLLLZI;
                if (i2 == 0) {
                    return;
                }
                IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) OfflineModePopupComponent.this.LJLJI.getValue();
                if (iFeedPanelPlatformAbility != null) {
                    i = iFeedPanelPlatformAbility.getCurIndex();
                } else {
                    i = -1;
                }
                if (i + 1 >= i2) {
                    z = true;
                } else {
                    z = false;
                }
                C26222AQw c26222AQw = OfflineModePopupComponent.LJLL;
                StringBuilder LJI = JBR.LJI("[DefaultLoadMoreUiListener.onHide] reachedEnd ", z, ", canPopToast ");
                LJI.append(OfflineModePopupComponent.this.LJLJJLL);
                c26222AQw.LIZ(null, X1D.LIZIZ(LJI));
                if (z) {
                    OfflineModePopupComponent offlineModePopupComponent2 = OfflineModePopupComponent.this;
                    if (offlineModePopupComponent2.LJLJJLL) {
                        offlineModePopupComponent2.LJLJJLL = false;
                        offlineModePopupComponent2.v3().tv0(C9SV.WATCH_ALL_OFFLINE_VIDEOS_TOAST);
                        return;
                    }
                    OfflineModePopupComponent offlineModePopupComponent3 = OfflineModePopupComponent.this;
                    if (offlineModePopupComponent3.LJLJJLL) {
                        return;
                    }
                    offlineModePopupComponent3.LJLJJLL = true;
                    IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) offlineModePopupComponent3.LJLJJI.getValue();
                    if (iViewPagerComponentAbility == null) {
                        return;
                    }
                    iViewPagerComponentAbility.ar0(0, false);
                }
            }

            @Override // X.AbstractC244919jL, X.InterfaceC55109Lk1
            public final void onShow() {
                OfflineModePopupComponent.this.LJLJJL = true;
            }
        };
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
        LJLL.LIZ(null, "onCreate");
        C8YN.LJII(this, v3(), new TBT() { // from class: X.9S4
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C9S3) obj).LJLL;
            }
        }, null, new AqS186S0100000_4(this, 137), 6);
        C8YN.LJII(this, v3(), new TBT() { // from class: X.9S5
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C9S3) obj).LJLLILLLL;
            }
        }, null, new AqS186S0100000_4(this, 138), 6);
    }

    @Override // X.C8W0
    public final void onParentViewCreated() {
        super.onParentViewCreated();
        C8YN.LJII(this, v3(), new TBT() { // from class: X.9Ty
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((C9S3) obj).LJLILLLLZI);
            }
        }, null, new AqS186S0100000_4(this, 139), 6);
        ILoadMoreAbility iLoadMoreAbility = (ILoadMoreAbility) this.LJLILLLLZI.getValue();
        if (iLoadMoreAbility != null) {
            iLoadMoreAbility.Up0(this.LJLJLLL);
        }
    }

    @Override // X.C2L4
    public final List<Class<Object>> getScopeDefine() {
        return C76965UIn.LIZ(RootPanelScope.class);
    }

    public final OfflineModeManagerVM v3() {
        return (OfflineModeManagerVM) this.LJLIL.getValue();
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
