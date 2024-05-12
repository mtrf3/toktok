package com.ss.android.ugc.aweme.mix.createmix.viewholder;

import X.AML;
import X.AbstractC26082ALm;
import X.C116724i4;
import X.C157166Eu;
import X.C214298b3;
import X.C221108m2;
import X.C228108xK;
import X.C62822Ol8;
import X.C62846OlW;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72419SbX;
import X.C72420SbY;
import X.C72421SbZ;
import X.C72422Sba;
import X.C72423Sbb;
import X.C72424Sbc;
import X.C72425Sbd;
import X.C73140SnA;
import X.C73157SnR;
import X.C73165SnZ;
import X.C76800UCe;
import X.C77339UWx;
import X.C78765Uvh;
import X.C86V;
import X.C9BD;
import X.C9BE;
import X.C9XN;
import X.InterfaceC151715xP;
import X.InterfaceC228398xn;
import X.InterfaceC61312at;
import X.InterfaceC65784Pro;
import X.InterfaceC73141SnB;
import X.InterfaceC73149SnJ;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC92693kP;
import X.InterfaceC93923mO;
import X.TBW;
import X.TMG;
import X.W1T;
import Y.IDTListenerS113S0100000_3;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.mix.createmix.viewmodel.MixCreateViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class MixFeedOrderCell extends PowerCell<C228108xK> implements InterfaceC151715xP, InterfaceC228398xn {
    public final C62822Ol8 LJLIL;
    public final C72423Sbb LJLILLLLZI;

    @Override // X.InterfaceC73141SnB
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final InterfaceC73141SnB getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC73149SnJ
    public final AML getReceiver() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final InterfaceC73149SnJ<AML> getReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // X.InterfaceC228398xn
    public final void LJIIJJI() {
        this.itemView.setBackgroundColor(((Number) this.LJLIL.getValue()).intValue());
    }

    @Override // X.InterfaceC228398xn
    public final void LJIJI() {
        this.itemView.setBackgroundColor(0);
    }

    public MixFeedOrderCell() {
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(MixCreateViewModel.class);
        AqS162S0100000_12 aqS162S0100000_12 = new AqS162S0100000_12(LIZ, 763);
        C72422Sba c72422Sba = C72422Sba.INSTANCE;
        if (o.LJ(c9bd, c9bd)) {
            new C214298b3(LIZ, aqS162S0100000_12, C72420SbY.INSTANCE, new AqS162S0100000_12((InterfaceC93923mO) this, 764), new AqS162S0100000_12((InterfaceC93923mO) this, 765), C72425Sbd.INSTANCE, c72422Sba, new AqS162S0100000_12((InterfaceC93923mO) this, 766), 256);
        } else if (o.LJ(c9bd, C9BE.LIZ)) {
            new C214298b3(LIZ, aqS162S0100000_12, C72421SbZ.INSTANCE, new AqS162S0100000_12((InterfaceC93923mO) this, 767), new AqS162S0100000_12((InterfaceC93923mO) this, 758), C72424Sbc.INSTANCE, c72422Sba, new AqS162S0100000_12((InterfaceC93923mO) this, 759), 256);
        } else if (c9bd == null || o.LJ(c9bd, C9XN.LIZ)) {
            new C214298b3(LIZ, aqS162S0100000_12, C72419SbX.INSTANCE, new AqS162S0100000_12((InterfaceC93923mO) this, 760), new AqS162S0100000_12((InterfaceC93923mO) this, 761), new AqS162S0100000_12((InterfaceC93923mO) this, 762), c72422Sba, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(C77339UWx.LIZLLL("Don't support this VMScope: ", c9bd, " there"));
        }
        this.LJLIL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 757));
        this.LJLILLLLZI = new C72423Sbb();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        Lifecycle lifecycle;
        LifecycleOwner currentLifecycleOwner = getCurrentLifecycleOwner();
        if (currentLifecycleOwner == null || (lifecycle = currentLifecycleOwner.getLifecycle()) == null) {
            return this.LJLILLLLZI;
        }
        return lifecycle;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C228108xK c228108xK) {
        UrlModel urlModel;
        boolean z;
        C228108xK t = c228108xK;
        o.LJIIIZ(t, "t");
        C62846OlW c62846OlW = (C62846OlW) this.itemView.findViewById(R.id.bxv);
        C228108xK item = getItem();
        if (item != null) {
            urlModel = item.LJLJJI;
        } else {
            urlModel = null;
        }
        C78765Uvh.LJFF(c62846OlW, urlModel);
        String str = t.LJLJJL;
        if (str != null && str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.itemView.findViewById(R.id.gkg).setVisibility(0);
            TextView textView = (TextView) this.itemView.findViewById(R.id.gkg);
            C116724i4 c116724i4 = new C116724i4();
            String str2 = t.LJLJJL;
            if (str2 == null) {
                str2 = "";
            }
            c116724i4.LIZIZ(str2);
            textView.setText(c116724i4.LIZ);
        } else {
            this.itemView.findViewById(R.id.gkg).setVisibility(8);
        }
        ((TextView) this.itemView.findViewById(R.id.gkk)).setText(C86V.LJ().getQuantityString(R.plurals.jx, (int) t.LJLIL.getStatistics().getPlayCount(), t.LJLJJLL));
        ((ImageView) this.itemView.findViewById(R.id.f5u)).setVisibility(0);
        this.itemView.findViewById(R.id.f5u).setOnTouchListener(new IDTListenerS113S0100000_3(this, 21));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        return inflateItemView(parent, R.layout.bte);
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73157SnR.LJIIJJI(vm1, interfaceC88472Yns);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at> InterfaceC92693kP subscribe(JediViewModel<S> jediViewModel, C73165SnZ<S> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C73157SnR.LJI(this, jediViewModel, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C73157SnR.LIZIZ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C73165SnZ<TMG> c73165SnZ, InterfaceC88473Ynt<? super AML, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C73157SnR.LIZJ(this, jediViewModel, tbw, tbw2, c73165SnZ, interfaceC88473Ynt);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, T> InterfaceC92693kP asyncSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends AbstractC26082ALm<? extends T>> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super Throwable, C76800UCe> interfaceC88471Ynr, InterfaceC88472Yns<? super AML, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super AML, ? super T, C76800UCe> interfaceC88471Ynr2) {
        return C73157SnR.LIZ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr, interfaceC88472Yns, interfaceC88471Ynr2);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C73165SnZ<C157166Eu> c73165SnZ, InterfaceC88474Ynu<? super AML, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C73157SnR.LIZLLL(this, jediViewModel, tbw, tbw2, tbw3, c73165SnZ, interfaceC88474Ynu);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C, D> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C73165SnZ<W1T> c73165SnZ, InterfaceC88475Ynv<? super AML, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C73157SnR.LJ(this, jediViewModel, tbw, tbw2, tbw3, tbw4, c73165SnZ, interfaceC88475Ynv);
    }
}
