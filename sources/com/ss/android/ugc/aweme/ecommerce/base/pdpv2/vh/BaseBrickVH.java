package com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vh;

import X.AbstractC27664AtQ;
import X.C16880lQ;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C214298b3;
import X.C221108m2;
import X.C27667AtT;
import X.C27668AtU;
import X.C27669AtV;
import X.C27670AtW;
import X.C27671AtX;
import X.C27672AtY;
import X.C27673AtZ;
import X.C27674Ata;
import X.C27675Atb;
import X.C27676Atc;
import X.C27677Atd;
import X.C27678Ate;
import X.C27684Atk;
import X.C27685Atl;
import X.C27686Atm;
import X.C27687Atn;
import X.C27688Ato;
import X.C27689Atp;
import X.C27690Atq;
import X.C27691Atr;
import X.C27692Ats;
import X.C27693Att;
import X.C27694Atu;
import X.C27695Atv;
import X.C33Q;
import X.C3C8;
import X.C56412MCa;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C70300RiS;
import X.C76800UCe;
import X.C8YZ;
import X.C9BD;
import X.C9BE;
import X.C9XN;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC65784Pro;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.InterfaceC93923mO;
import X.KPL;
import X.OSK;
import X.OSL;
import X.OSM;
import X.TBW;
import X.YE1;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.vcloud.vctrace.BuildConfig;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.viewmodel.PdpBodyViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.viewmodel.PdpBottomViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.viewmodel.PdpHeadViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.viewmodel.PdpMainViewModel;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public abstract class BaseBrickVH<T extends AbstractC27664AtQ<?, ?>> extends PowerCell<T> implements KPL {
    public final int LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C214298b3 LJLJI;
    public final C214298b3 LJLJJI;
    public final C214298b3 LJLJJL;
    public final C214298b3 LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final C62822Ol8 LJLJLJ;

    public boolean Q() {
        return !(this instanceof BlankBrickVH);
    }

    public abstract void T(T t);

    public void U() {
    }

    public void V() {
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

    public final PdpBodyViewModel L() {
        return (PdpBodyViewModel) this.LJLJJI.getValue();
    }

    public final PdpMainViewModel M() {
        return (PdpMainViewModel) this.LJLJI.getValue();
    }

    public final C70300RiS N() {
        return (C70300RiS) this.LJLILLLLZI.getValue();
    }

    public final Fragment getFragment() {
        return (Fragment) this.LJLJL.getValue();
    }

    public BaseBrickVH() {
        C214298b3 c214298b3;
        C214298b3 c214298b32;
        C214298b3 c214298b33;
        C214298b3 c214298b34;
        this.LJLIL = -1;
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS154S0100000_4((BaseBrickVH) this, 252));
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(PdpMainViewModel.class);
        AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(LIZ, 271);
        C27670AtW c27670AtW = C27670AtW.INSTANCE;
        C9BD c9bd = C9BD.LIZ;
        if (o.LJ(c9be, c9bd)) {
            c214298b3 = new C214298b3(LIZ, aqS154S0100000_4, C27688Ato.INSTANCE, new AqS154S0100000_4((InterfaceC93923mO) this, 283), new AqS154S0100000_4((InterfaceC93923mO) this, 256), C27674Ata.INSTANCE, c27670AtW, new AqS154S0100000_4((InterfaceC93923mO) this, 270), 256);
        } else if (o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(LIZ, aqS154S0100000_4, C27691Atr.INSTANCE, new AqS154S0100000_4((InterfaceC93923mO) this, 273), new AqS154S0100000_4((InterfaceC93923mO) this, 254), C27672AtY.INSTANCE, c27670AtW, new AqS154S0100000_4((InterfaceC93923mO) this, 257), 256);
        } else if (c9be == null || o.LJ(c9be, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS154S0100000_4, C27686Atm.INSTANCE, new AqS154S0100000_4((InterfaceC93923mO) this, 260), new AqS154S0100000_4((InterfaceC93923mO) this, 263), new AqS154S0100000_4((InterfaceC93923mO) this, 265), c27670AtW, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(YE1.LIZJ("Don't support this VMScope: ", c9be, " there"));
        }
        this.LJLJI = c214298b3;
        C65776Prg LIZ2 = C65352Pkq.LIZ(PdpBodyViewModel.class);
        AqS154S0100000_4 aqS154S0100000_42 = new AqS154S0100000_4(LIZ2, 267);
        C27667AtT c27667AtT = C27667AtT.INSTANCE;
        if (o.LJ(c9be, c9bd)) {
            c214298b32 = new C214298b3(LIZ2, aqS154S0100000_42, C27690Atq.INSTANCE, new AqS154S0100000_4((InterfaceC93923mO) this, 274), new AqS154S0100000_4((InterfaceC93923mO) this, 276), C27676Atc.INSTANCE, c27667AtT, new AqS154S0100000_4((InterfaceC93923mO) this, 279), 256);
        } else if (o.LJ(c9be, c9be)) {
            c214298b32 = new C214298b3(LIZ2, aqS154S0100000_42, C27693Att.INSTANCE, new AqS154S0100000_4((InterfaceC93923mO) this, 282), new AqS154S0100000_4((InterfaceC93923mO) this, 284), C27677Atd.INSTANCE, c27667AtT, new AqS154S0100000_4((InterfaceC93923mO) this, 285), 256);
        } else if (c9be == null || o.LJ(c9be, C9XN.LIZ)) {
            c214298b32 = new C214298b3(LIZ2, aqS154S0100000_42, C27695Atv.INSTANCE, new AqS154S0100000_4((InterfaceC93923mO) this, 288), new AqS154S0100000_4((InterfaceC93923mO) this, BuildConfig.VERSION_CODE), new AqS154S0100000_4((InterfaceC93923mO) this, 248), c27667AtT, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(YE1.LIZJ("Don't support this VMScope: ", c9be, " there"));
        }
        this.LJLJJI = c214298b32;
        C65776Prg LIZ3 = C65352Pkq.LIZ(PdpBottomViewModel.class);
        AqS154S0100000_4 aqS154S0100000_43 = new AqS154S0100000_4(LIZ3, LiveCoverMinSizeSetting.DEFAULT);
        C27668AtU c27668AtU = C27668AtU.INSTANCE;
        if (o.LJ(c9be, c9bd)) {
            c214298b33 = new C214298b3(LIZ3, aqS154S0100000_43, C27685Atl.INSTANCE, new AqS154S0100000_4((InterfaceC93923mO) this, 255), new AqS154S0100000_4((InterfaceC93923mO) this, 258), C27673AtZ.INSTANCE, c27668AtU, new AqS154S0100000_4((InterfaceC93923mO) this, 261), 256);
        } else if (o.LJ(c9be, c9be)) {
            c214298b33 = new C214298b3(LIZ3, aqS154S0100000_43, C27689Atp.INSTANCE, new AqS154S0100000_4((InterfaceC93923mO) this, 268), new AqS154S0100000_4((InterfaceC93923mO) this, 269), C27675Atb.INSTANCE, c27668AtU, new AqS154S0100000_4((InterfaceC93923mO) this, 272), 256);
        } else if (c9be == null || o.LJ(c9be, C9XN.LIZ)) {
            c214298b33 = new C214298b3(LIZ3, aqS154S0100000_43, C27692Ats.INSTANCE, new AqS154S0100000_4((InterfaceC93923mO) this, 277), new AqS154S0100000_4((InterfaceC93923mO) this, 278), new AqS154S0100000_4((InterfaceC93923mO) this, 280), c27668AtU, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(YE1.LIZJ("Don't support this VMScope: ", c9be, " there"));
        }
        this.LJLJJL = c214298b33;
        C65776Prg LIZ4 = C65352Pkq.LIZ(PdpHeadViewModel.class);
        AqS154S0100000_4 aqS154S0100000_44 = new AqS154S0100000_4(LIZ4, 281);
        C27669AtV c27669AtV = C27669AtV.INSTANCE;
        if (o.LJ(c9be, c9bd)) {
            c214298b34 = new C214298b3(LIZ4, aqS154S0100000_44, C27694Atu.INSTANCE, new AqS154S0100000_4((InterfaceC93923mO) this, 286), new AqS154S0100000_4((InterfaceC93923mO) this, 287), C27678Ate.INSTANCE, c27669AtV, new AqS154S0100000_4((InterfaceC93923mO) this, 289), 256);
        } else if (o.LJ(c9be, c9be)) {
            c214298b34 = new C214298b3(LIZ4, aqS154S0100000_44, C27684Atk.INSTANCE, new AqS154S0100000_4((InterfaceC93923mO) this, 251), new AqS154S0100000_4((InterfaceC93923mO) this, 253), C27671AtX.INSTANCE, c27669AtV, new AqS154S0100000_4((InterfaceC93923mO) this, 259), 256);
        } else if (c9be == null || o.LJ(c9be, C9XN.LIZ)) {
            c214298b34 = new C214298b3(LIZ4, aqS154S0100000_44, C27687Atn.INSTANCE, new AqS154S0100000_4((InterfaceC93923mO) this, 262), new AqS154S0100000_4((InterfaceC93923mO) this, 264), new AqS154S0100000_4((InterfaceC93923mO) this, 266), c27669AtV, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(YE1.LIZJ("Don't support this VMScope: ", c9be, " there"));
        }
        this.LJLJJLL = c214298b34;
        this.LJLJL = C221108m2.LIZIZ(new AqS154S0100000_4((BaseBrickVH) this, 249));
        this.LJLJLJ = C221108m2.LIZIZ(new AqS154S0100000_4((BaseBrickVH) this, 275));
    }

    public String getModuleName() {
        return C16880lQ.LJLLJ(getClass());
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC227608wW
    public final void onCreate() {
        M();
        L();
        this.LJLJJL.getValue();
        this.LJLJJLL.getValue();
        super.onCreate();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC227608wW
    public final void onDestroy() {
        super.onDestroy();
        U();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return this.LJLIL;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        V();
    }

    public BaseBrickVH(int i) {
        this();
        this.LJLIL = i;
    }

    public View P(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        return new View(parent.getContext());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0069 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.InterfaceC57784Mm4 r6) {
        /*
            r5 = this;
            X.AtQ r6 = (X.AbstractC27664AtQ) r6
            java.lang.String r0 = "t"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            android.os.SystemClock.elapsedRealtime()
            android.view.View r1 = r5.itemView
            java.lang.String r0 = "itemView"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickStyle r0 = r6.LJII()
            if (r0 == 0) goto L67
            java.lang.Boolean r0 = r0.showDivider
            if (r0 == 0) goto L67
            boolean r0 = r0.booleanValue()
        L1f:
            X.C26508Aam.LIZ(r1, r0)
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickStyle r0 = r6.LJII()
            if (r0 == 0) goto L49
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Padding r1 = r0.padding
            if (r1 == 0) goto L49
            float r0 = r1.left
            int r4 = X.C278817o.LIZ(r0)
            float r0 = r1.right
            int r3 = X.C278817o.LIZ(r0)
            float r0 = r1.top
            int r2 = X.C278817o.LIZ(r0)
            float r0 = r1.bottom
            int r1 = X.C278817o.LIZ(r0)
            android.view.View r0 = r5.itemView
            r0.setPadding(r4, r2, r3, r1)
        L49:
            android.view.View r1 = r5.itemView
            java.lang.String r0 = "itemView.context"
            boolean r0 = X.C0F1.LIZIZ(r1, r0)
            if (r0 == 0) goto L5e
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickStyle r0 = r6.LJII()
            if (r0 == 0) goto L83
            java.lang.String r0 = r0.backgroundColorDark
        L5b:
            if (r0 == 0) goto L83
            goto L69
        L5e:
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickStyle r0 = r6.LJII()
            if (r0 == 0) goto L83
            java.lang.String r0 = r0.backgroundColor
            goto L5b
        L67:
            r0 = 0
            goto L1f
        L69:
            android.view.View r1 = r5.itemView     // Catch: java.lang.Throwable -> L78
            int r0 = android.graphics.Color.parseColor(r0)     // Catch: java.lang.Throwable -> L78
            r1.setBackgroundColor(r0)     // Catch: java.lang.Throwable -> L78
            X.UCe r0 = X.C76800UCe.LIZ     // Catch: java.lang.Throwable -> L78
            X.C3C5.m7constructorimpl(r0)     // Catch: java.lang.Throwable -> L78
            goto L80
        L78:
            r0 = move-exception
            X.3C4 r0 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r0)
        L80:
            X.C3C5.m6boximpl(r0)
        L83:
            r5.T(r6)
            boolean r0 = r5.Q()
            if (r0 == 0) goto Lac
            boolean r0 = r6.isReportShow
            if (r0 != 0) goto Lac
            X.Ol8 r0 = r5.LJLJLJ
            java.lang.Object r3 = r0.getValue()
            X.Rtn r3 = (X.InterfaceC71003Rtn) r3
            if (r3 == 0) goto La9
            X.RsS r2 = new X.RsS
            r2.<init>()
            kotlin.jvm.internal.AqS170S0100000_4 r1 = new kotlin.jvm.internal.AqS170S0100000_4
            r0 = 1047(0x417, float:1.467E-42)
            r1.<init>(r5, r0)
            X.C78946Uyc.LJJII(r3, r2, r1)
        La9:
            r0 = 1
            r6.isReportShow = r0
        Lac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vh.BaseBrickVH.onBindItemView(X.Mm4):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        if (this.LJLIL > -1) {
            return super.onCreateItemView(parent);
        }
        return P(parent);
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
