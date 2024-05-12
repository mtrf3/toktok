package com.ss.android.ugc.aweme.mix.platform;

import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C214298b3;
import X.C245239jr;
import X.C245249js;
import X.C28289B8j;
import X.C2K0;
import X.C33Q;
import X.C3C8;
import X.C47261Igj;
import X.C55096Ljo;
import X.C56412MCa;
import X.C62814Ol0;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C78926UyI;
import X.C8YZ;
import X.C9BD;
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
import X.QD3;
import X.TBW;
import Y.ARunnableS40S0100000_4;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.detail.component.bottom.protocol.IDetailBottomProtocol;
import com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes5.dex */
public final class PlaylistBottomBarComponent extends BasePanelComponent implements IDetailBottomProtocol, KPL, InterfaceC55102Lju {
    public View LJLIL;
    public final C214298b3 LJLILLLLZI;

    public PlaylistBottomBarComponent() {
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(MixVideosViewModel.class);
        this.LJLILLLLZI = C78926UyI.LJ(this, LIZ, c9bd, new AqS154S0100000_4(LIZ, 385), C245239jr.INSTANCE, null);
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

    /* JADX WARN: Removed duplicated region for block: B:11:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0046  */
    @Override // X.C8W0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onParentViewCreated() {
        /*
            r13 = this;
            r4 = r13
            super.onParentViewCreated()
            android.view.View r1 = r4.LJLIL
            r10 = 0
            if (r1 == 0) goto L88
            r0 = 2131373105(0x7f0a2c31, float:1.8366292E38)
            android.view.View r6 = r1.findViewById(r0)
            if (r6 == 0) goto L89
            r0 = 0
            r6.measure(r0, r0)
            r0 = 2131373109(0x7f0a2c35, float:1.83663E38)
            android.view.View r3 = r6.findViewById(r0)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r0 = 2131373108(0x7f0a2c34, float:1.8366298E38)
            android.view.View r2 = r6.findViewById(r0)
            r0 = 2131373106(0x7f0a2c32, float:1.8366294E38)
            android.view.View r5 = r6.findViewById(r0)
            android.widget.TextView r5 = (android.widget.TextView) r5
        L2f:
            X.8b3 r0 = r4.LJLILLLLZI
            com.bytedance.assem.arch.viewModel.AssemViewModel r8 = r0.getValue()
            X.9jv r9 = new X.TBT() { // from class: X.9jv
                static {
                    /*
                        X.9jv r0 = new X.9jv
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.9jv) X.9jv.LJLIL X.9jv
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C245279jv.<clinit>():void");
                }

                {
                    /*
                        r4 = this;
                        java.lang.Class<X.M7C> r3 = X.M7C.class
                        java.lang.String r2 = "getMixDetail()Lcom/ss/android/ugc/aweme/mix/model/MixStruct;"
                        r1 = 0
                        java.lang.String r0 = "mixDetail"
                        r4.<init>(r3, r0, r2, r1)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C245279jv.<init>():void");
                }

                @Override // X.TBT, X.TBZ, X.TBW
                public final java.lang.Object get(java.lang.Object r2) {
                    /*
                        r1 = this;
                        X.M7C r2 = (X.M7C) r2
                        com.ss.android.ugc.aweme.mix.model.MixStruct r0 = r2.LJLJL
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C245279jv.get(java.lang.Object):java.lang.Object");
                }
            }
            X.9ju r1 = new X.9ju
            r1.<init>(r2, r3, r4, r5, r6)
            r12 = 6
            r7 = r4
            r11 = r1
            X.C8YN.LJII(r7, r8, r9, r10, r11, r12)
            android.view.View r2 = r4.LJLIL
            if (r2 == 0) goto L4f
            q03.IDaS484S0100000_4 r1 = new q03.IDaS484S0100000_4
            r0 = 0
            r1.<init>(r4, r0)
            X.C16880lQ.LJIIJ(r1, r2)
        L4f:
            int r0 = X.C61447O9r.LJIILJJIL
            r3 = 42
            if (r0 != 0) goto L7a
            if (r6 != 0) goto L58
        L57:
            return
        L58:
            android.content.Context r2 = r4.getContext()
            if (r2 == 0) goto L76
            X.4Vt r1 = new X.4Vt
            r1.<init>()
            java.lang.Float r0 = X.C61328O5c.LIZJ(r3)
            r1.LIZJ = r0
            r0 = 2130968628(0x7f040034, float:1.7545915E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.LIZIZ = r0
            android.graphics.drawable.Drawable r10 = r1.LIZ(r2)
        L76:
            r6.setBackground(r10)
            goto L7c
        L7a:
            if (r6 == 0) goto L57
        L7c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            float r0 = X.C32151Nz.LJIIZILJ(r0)
            X.C78897Uxp.LJJJJL(r6, r0)
            goto L57
        L88:
            r6 = r10
        L89:
            r3 = r10
            r2 = r10
            r5 = r10
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.mix.platform.PlaylistBottomBarComponent.onParentViewCreated():void");
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        str.getClass();
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.C8W0
    public final void onCreate() {
        super.onCreate();
        EventBus.LIZJ().LJIILJJIL(this);
        C62814Ol0.LJJIIJZLJL(C55096Ljo.LJIIZILJ(this), IDetailBottomProtocol.class, C47261Igj.LJJIJIL(this));
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZJ().LJIJ(this);
    }

    @Override // com.ss.android.ugc.aweme.detail.component.bottom.protocol.IDetailBottomProtocol
    public final View K2(ViewGroup viewGroup) {
        View LIZ = C28289B8j.LIZ(viewGroup, R.layout.btg, viewGroup, false);
        this.LJLIL = LIZ;
        return LIZ;
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onClearModeEvent(C245249js event) {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator alpha;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator startDelay;
        ViewPropertyAnimator animate2;
        ViewPropertyAnimator alpha2;
        ViewPropertyAnimator duration2;
        ViewPropertyAnimator withEndAction;
        o.LJIIIZ(event, "event");
        if (event.LJLIL) {
            View view = this.LJLIL;
            if (view != null && (animate2 = view.animate()) != null && (alpha2 = animate2.alpha(0.0f)) != null && (duration2 = alpha2.setDuration(300L)) != null && (withEndAction = duration2.withEndAction(new ARunnableS40S0100000_4(this, 66))) != null) {
                withEndAction.start();
                return;
            }
            return;
        }
        View view2 = this.LJLIL;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        View view3 = this.LJLIL;
        if (view3 == null || (animate = view3.animate()) == null || (alpha = animate.alpha(1.0f)) == null || (duration = alpha.setDuration(300L)) == null || (startDelay = duration.setStartDelay(200L)) == null) {
            return;
        }
        startDelay.start();
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
