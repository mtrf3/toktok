package com.ss.android.ugc.aweme.offlinemode.ui.bottom;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C212418Vh;
import X.C212428Vi;
import X.C213178Yf;
import X.C213198Yh;
import X.C214298b3;
import X.C26222AQw;
import X.C28289B8j;
import X.C2K0;
import X.C33Q;
import X.C3C8;
import X.C47261Igj;
import X.C48263Iwt;
import X.C55096Ljo;
import X.C56412MCa;
import X.C62814Ol0;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C78926UyI;
import X.C8YN;
import X.C8YZ;
import X.C9BD;
import X.C9Y0;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC55102Lju;
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
import X.Q8U;
import X.TBT;
import X.TBW;
import Y.ACListenerS24S0100000_4;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.detail.component.bottom.protocol.IDetailBottomProtocol;
import com.ss.android.ugc.aweme.offlinemode.viewmodel.OfflineModeManagerVM;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;

/* loaded from: classes5.dex */
public final class OfflineModeDetailBottomComponent extends BasePanelComponent implements IDetailBottomProtocol, KPL, InterfaceC55102Lju {
    public static final C26222AQw LJLJJI = new C26222AQw("OfflineModeDetailBottomComponent");
    public final C214298b3 LJLIL;
    public View LJLILLLLZI;
    public TuxTextView LJLJI;

    public OfflineModeDetailBottomComponent() {
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(OfflineModeManagerVM.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9bd, new AqS154S0100000_4(LIZ, 497), C9Y0.INSTANCE, null);
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

    @Override // com.ss.android.ugc.aweme.detail.component.bottom.protocol.IDetailBottomProtocol
    public final void h1() {
    }

    @Override // X.C8W0
    public final void onParentViewCreated() {
        View view;
        int i;
        View view2;
        super.onParentViewCreated();
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null && (view2 = LIZLLL.getView()) != null) {
            view = view2.findViewById(R.id.aoo);
        } else {
            view = null;
        }
        this.LJLILLLLZI = view;
        int i2 = v3().getState().LJLILLLLZI;
        View view3 = this.LJLILLLLZI;
        if (view3 != null) {
            if (i2 > 0) {
                i = 0;
            } else {
                i = 8;
            }
            view3.setVisibility(i);
        }
        C8YN.LJII(this, v3(), new TBT() { // from class: X.9Te
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((C9S3) obj).LJLILLLLZI);
            }
        }, null, new AqS186S0100000_4(this, 133), 6);
        C8YN.LJII(this, v3(), new TBT() { // from class: X.9Td
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C9S3) obj).LJLJJLL;
            }
        }, null, new AqS186S0100000_4(this, 134), 6);
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        str.getClass();
        return null;
    }

    public final OfflineModeManagerVM v3() {
        return (OfflineModeManagerVM) this.LJLIL.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.C8W0
    public final void onCreate() {
        super.onCreate();
        C62814Ol0.LJJIIJZLJL(C55096Ljo.LJIIZILJ(this), IDetailBottomProtocol.class, C47261Igj.LJJIJIL(this));
    }

    @Override // com.ss.android.ugc.aweme.detail.component.bottom.protocol.IDetailBottomProtocol
    public final View K2(ViewGroup viewGroup) {
        View LIZ = C28289B8j.LIZ(viewGroup, R.layout.byv, viewGroup, false);
        C16880lQ.LJIIJ(new ACListenerS24S0100000_4(this, 94), LIZ.findViewById(R.id.h_2));
        ((TextView) LIZ.findViewById(R.id.h_3)).setText(R.string.j99);
        this.LJLJI = (TuxTextView) LIZ.findViewById(R.id.h_5);
        return LIZ;
    }

    public final void x3(int i, int i2) {
        String string;
        String str = null;
        LJLJJI.LIZ(null, C48263Iwt.LIZLLL("updateUnwatchVideos, watchedListSize: ", i, ", cachedVideoCount: ", i2));
        int i3 = i2 - i;
        TuxTextView tuxTextView = this.LJLJI;
        if (tuxTextView == null) {
            return;
        }
        if (i3 > 0) {
            ActivityC45651qj LIZ = C212428Vi.LIZ(this);
            if (LIZ != null && (string = LIZ.getString(R.string.j9_)) != null) {
                str = Q8U.LIZIZ(new Object[]{Integer.valueOf(i3)}, 1, string, "format(this, *args)");
            }
        } else {
            ActivityC45651qj LIZ2 = C212428Vi.LIZ(this);
            if (LIZ2 != null) {
                str = LIZ2.getString(R.string.j9a);
            }
        }
        tuxTextView.setText(str);
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
