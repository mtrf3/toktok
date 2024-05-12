package com.ss.android.ugc.aweme.search.detail.filter.ui;

import X.C16880lQ;
import X.C19N;
import X.C2068389v;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C214298b3;
import X.C221108m2;
import X.C33Q;
import X.C3C8;
import X.C51659KPf;
import X.C51660KPg;
import X.C51661KPh;
import X.C51662KPi;
import X.C51663KPj;
import X.C51664KPk;
import X.C51665KPl;
import X.C51666KPm;
import X.C51667KPn;
import X.C51669KPp;
import X.C56412MCa;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C77123UOp;
import X.C77339UWx;
import X.C78939UyV;
import X.C7MY;
import X.C8YZ;
import X.C9BD;
import X.C9BE;
import X.C9XN;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC65350Pko;
import X.InterfaceC65784Pro;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.InterfaceC93923mO;
import X.KPL;
import X.KPS;
import X.KPU;
import X.KPV;
import X.KPX;
import X.MHO;
import X.ORZ;
import X.OSK;
import X.OSL;
import X.OSM;
import X.TBW;
import X.W5F;
import X.W5U;
import Y.ACListenerS28S0100000_8;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.search.detail.filter.viewmodel.FilterVM;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class FilterPowerCell extends PowerCell<KPS> implements KPL {
    public static final C62822Ol8 LJLLL = C221108m2.LIZIZ(C51664KPk.LJLIL);
    public static final C62822Ol8 LJLLLL = C221108m2.LIZIZ(C51663KPj.LJLIL);
    public final C214298b3 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C2068389v LJLJI;
    public final C2068389v LJLJJI;
    public final C2068389v LJLJJL;
    public final C2068389v LJLJJLL;
    public final C2068389v LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final C62822Ol8 LJLL;
    public final C62822Ol8 LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final C62822Ol8 LJLLJ;

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

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.cfj;
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

    public final TuxIconView L() {
        Object value = this.LJLJLLL.getValue();
        o.LJIIIIZZ(value, "<get-ivLike>(...)");
        return (TuxIconView) value;
    }

    public final TuxIconView M() {
        Object value = this.LJLLILLLL.getValue();
        o.LJIIIIZZ(value, "<get-ivPlayState>(...)");
        return (TuxIconView) value;
    }

    public FilterPowerCell() {
        C214298b3 c214298b3;
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(FilterVM.class);
        AqS158S0100000_8 aqS158S0100000_8 = new AqS158S0100000_8((InterfaceC65350Pko) LIZ, 164);
        C51662KPi c51662KPi = C51662KPi.INSTANCE;
        if (o.LJ(c9bd, c9bd)) {
            c214298b3 = new C214298b3(LIZ, aqS158S0100000_8, C51660KPg.INSTANCE, new AqS158S0100000_8((InterfaceC93923mO) this, 165), new AqS158S0100000_8((InterfaceC93923mO) this, 166), C51667KPn.INSTANCE, c51662KPi, new AqS158S0100000_8((InterfaceC93923mO) this, 167), 256);
        } else if (o.LJ(c9bd, C9BE.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS158S0100000_8, C51661KPh.INSTANCE, new AqS158S0100000_8((InterfaceC93923mO) this, 152), new AqS158S0100000_8((InterfaceC93923mO) this, 159), C51665KPl.INSTANCE, c51662KPi, new AqS158S0100000_8((InterfaceC93923mO) this, 160), 256);
        } else if (c9bd == null || o.LJ(c9bd, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS158S0100000_8, C51659KPf.INSTANCE, new AqS158S0100000_8((InterfaceC93923mO) this, 161), new AqS158S0100000_8((InterfaceC93923mO) this, 162), new AqS158S0100000_8((InterfaceC93923mO) this, 163), c51662KPi, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(C77339UWx.LIZLLL("Don't support this VMScope: ", c9bd, " there"));
        }
        this.LJLIL = c214298b3;
        this.LJLILLLLZI = C221108m2.LIZIZ(C51666KPm.LJLIL);
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_play_fill;
        c2068389v.LIZLLL = C19N.LIZIZ(this.itemView, "itemView.context", R.attr.dj);
        this.LJLJI = c2068389v;
        C2068389v c2068389v2 = new C2068389v();
        c2068389v2.LIZ = R.raw.icon_pause_fill;
        c2068389v2.LIZLLL = C19N.LIZIZ(this.itemView, "itemView.context", R.attr.dj);
        this.LJLJJI = c2068389v2;
        C2068389v c2068389v3 = new C2068389v();
        c2068389v3.LIZ = R.raw.icon_eye_slash;
        c2068389v3.LIZIZ = C7MY.LIZIZ(20);
        c2068389v3.LIZJ = C7MY.LIZIZ(20);
        c2068389v3.LIZLLL = C19N.LIZIZ(this.itemView, "itemView.context", R.attr.dj);
        this.LJLJJL = c2068389v3;
        C2068389v c2068389v4 = new C2068389v();
        c2068389v4.LIZ = R.raw.icon_heart;
        c2068389v4.LIZLLL = C19N.LIZIZ(this.itemView, "itemView.context", R.attr.dk);
        this.LJLJJLL = c2068389v4;
        C2068389v c2068389v5 = new C2068389v();
        c2068389v5.LIZ = R.raw.icon_heart_fill;
        c2068389v5.LIZLLL = C19N.LIZIZ(this.itemView, "itemView.context", R.attr.eb);
        this.LJLJL = c2068389v5;
        this.LJLJLJ = C221108m2.LIZIZ(new AqS158S0100000_8(this, 155));
        this.LJLJLLL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 156));
        this.LJLL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 153));
        this.LJLLI = C221108m2.LIZIZ(new AqS158S0100000_8(this, 158));
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 157));
        this.LJLLJ = C221108m2.LIZIZ(new AqS158S0100000_8(this, 154));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C16880lQ.LJIIJ(new ACListenerS28S0100000_8(this, 21), this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(KPS kps) {
        KPS t = kps;
        o.LJIIIZ(t, "t");
        W5F LJII = W5U.LJII(C78939UyV.LJ(t.LJLILLLLZI));
        if (t.LJLJJL) {
            LJII.LJIJI = Bitmap.Config.ARGB_8888;
            LJII.LJIIIZ = 64;
            LJII.LJIIJ = 112;
            LJII.LJII = 64;
            LJII.LJIIIIZZ = 112;
            LJII.LJIL = new MHO(25, 0);
            Object value = this.LJLJLJ.getValue();
            o.LJIIIIZZ(value, "<get-ivCover>(...)");
            ((ImageView) value).setColorFilter((ColorFilter) this.LJLILLLLZI.getValue());
        } else {
            C62822Ol8 c62822Ol8 = LJLLL;
            int intValue = ((Number) c62822Ol8.getValue()).intValue();
            C62822Ol8 c62822Ol82 = LJLLLL;
            int intValue2 = ((Number) c62822Ol82.getValue()).intValue();
            LJII.LJIIIZ = intValue;
            LJII.LJIIJ = intValue2;
            int intValue3 = ((Number) c62822Ol8.getValue()).intValue();
            int intValue4 = ((Number) c62822Ol82.getValue()).intValue();
            LJII.LJII = intValue3;
            LJII.LJIIIIZZ = intValue4;
            Object value2 = this.LJLJLJ.getValue();
            o.LJIIIIZZ(value2, "<get-ivCover>(...)");
            ((ImageView) value2).setColorFilter((ColorFilter) null);
        }
        Object value3 = this.LJLJLJ.getValue();
        o.LJIIIIZZ(value3, "<get-ivCover>(...)");
        LJII.LJJIIJ = (SmartImageView) value3;
        C16880lQ.LLJJJ(LJII);
        if (!t.LJLJJL && ((Number) C51669KPp.LIZ.getValue()).intValue() == 1) {
            L().setVisibility(0);
            Object value4 = this.LJLL.getValue();
            o.LJIIIIZZ(value4, "<get-tvLiveCount>(...)");
            ((View) value4).setVisibility(0);
            Object value5 = this.LJLLJ.getValue();
            o.LJIIIIZZ(value5, "<get-dlvBottomShadow>(...)");
            ((View) value5).setVisibility(0);
        } else {
            L().setVisibility(8);
            Object value6 = this.LJLL.getValue();
            o.LJIIIIZZ(value6, "<get-tvLiveCount>(...)");
            ((View) value6).setVisibility(8);
            Object value7 = this.LJLLJ.getValue();
            o.LJIIIIZZ(value7, "<get-dlvBottomShadow>(...)");
            ((View) value7).setVisibility(8);
        }
        N(t, t.LJLJJLL);
    }

    public final void N(KPS kps, KPU kpu) {
        long j;
        Object value = this.LJLL.getValue();
        o.LJIIIIZZ(value, "<get-tvLiveCount>(...)");
        TextView textView = (TextView) value;
        if (kps.LJLJI) {
            if (!kpu.LJLIL) {
                j = kps.LJLJJI - 1;
            }
            j = kps.LJLJJI;
        } else {
            if (kpu.LJLIL) {
                j = kps.LJLJJI + 1;
            }
            j = kps.LJLJJI;
        }
        textView.setText(C77123UOp.LJJIIJ(j));
        if (kpu.LJLIL) {
            L().setTuxIcon(this.LJLJL);
        } else {
            L().setTuxIcon(this.LJLJJLL);
        }
        Object value2 = this.LJLLI.getValue();
        o.LJIIIIZZ(value2, "<get-selectStatus>(...)");
        ((View) value2).setSelected(kpu.LJLILLLLZI);
        if (kps.LJLJJL && !kpu.LJLJJI) {
            M().setTuxIcon(this.LJLJJL);
            M().setVisibility(0);
            return;
        }
        if (kpu.LJLILLLLZI) {
            int i = KPV.LIZ[kpu.LJLJI.ordinal()];
            if (i != 1 && i != 2) {
                if (i == 3) {
                    M().setTuxIcon(this.LJLJI);
                }
            } else {
                M().setTuxIcon(this.LJLJJI);
            }
            M().setVisibility(0);
            return;
        }
        M().setVisibility(4);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(KPS kps, List payloads) {
        KPS t = kps;
        o.LJIIIZ(t, "t");
        o.LJIIIZ(payloads, "payloads");
        super.onBindItemView(t, payloads);
        Object LJLLLL2 = ORZ.LJLLLL(payloads);
        if (LJLLLL2 == null || !(LJLLLL2 instanceof KPX)) {
            return;
        }
        N(t, ((KPX) LJLLLL2).LJLIL);
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
