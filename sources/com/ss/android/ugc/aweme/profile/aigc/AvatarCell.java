package com.ss.android.ugc.aweme.profile.aigc;

import X.C110614Vt;
import X.C16880lQ;
import X.C1DI;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C214298b3;
import X.C221018lt;
import X.C32151Nz;
import X.C33Q;
import X.C3C8;
import X.C56412MCa;
import X.C65352Pkq;
import X.C65776Prg;
import X.C71897SJp;
import X.C76800UCe;
import X.C8YN;
import X.C8YZ;
import X.C9BD;
import X.C9BE;
import X.C9XN;
import X.EnumC72807Shn;
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
import X.SI6;
import X.SI7;
import X.SI8;
import X.SI9;
import X.SID;
import X.SIE;
import X.SIF;
import X.SIG;
import X.SIH;
import X.SIK;
import X.SIL;
import X.SR2;
import X.TBT;
import X.TBW;
import X.W5F;
import X.W5U;
import X.X1D;
import X.YE1;
import Y.ACListenerS46S0200000_12;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;
import java.util.Set;
import kotlin.jvm.internal.AqS159S0200000_12;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.IDqS455S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class AvatarCell extends PowerCell<SIF> implements KPL {
    public final C214298b3 LJLIL;
    public boolean LJLILLLLZI;
    public C71897SJp LJLJI;
    public SmartImageView LJLJJI;
    public SIK LJLJJL;

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

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        View findViewById = this.itemView.findViewById(R.id.b_d);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.check_box)");
        this.LJLJI = (C71897SJp) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.egd);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.image)");
        this.LJLJJI = (SmartImageView) findViewById2;
        C8YN.LJIIJJI(this, M(), new TBT() { // from class: X.SIA
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((SIN) obj).LJLJJI;
            }
        }, new TBT() { // from class: X.SIB
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((SIN) obj).LJLJI;
            }
        }, new TBT() { // from class: X.SIC
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((SIN) obj).LJLILLLLZI;
            }
        }, null, new IDqS455S0100000_12(this, 2), 24);
    }

    public final ProfileAigcAvatarViewModel M() {
        return (ProfileAigcAvatarViewModel) this.LJLIL.getValue();
    }

    public AvatarCell() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ProfileAigcAvatarViewModel.class);
        AqS162S0100000_12 aqS162S0100000_12 = new AqS162S0100000_12(LIZ, 805);
        SID sid = SID.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS162S0100000_12, SI8.INSTANCE, new AqS162S0100000_12(this, 806), new AqS162S0100000_12(this, 807), SIH.INSTANCE, sid, new AqS162S0100000_12(this, 808), 256);
        } else if (o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(LIZ, aqS162S0100000_12, SI9.INSTANCE, new AqS162S0100000_12(this, 809), new AqS162S0100000_12(this, 800), SIG.INSTANCE, sid, new AqS162S0100000_12(this, 801), 256);
        } else if (c9be == null || o.LJ(c9be, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS162S0100000_12, SI7.INSTANCE, new AqS162S0100000_12(this, 802), new AqS162S0100000_12(this, 803), new AqS162S0100000_12(this, 804), sid, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(YE1.LIZJ("Don't support this VMScope: ", c9be, " there"));
        }
        this.LJLIL = c214298b3;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(SIF sif) {
        SIL sil;
        SIE sie;
        SIF t = sif;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("bind item with id:");
        LIZ.append(t.LJLIL.LIZ);
        C221018lt.LIZ("AvatarCell", X1D.LIZIZ(LIZ));
        this.LJLJJL = new SIK();
        W5F LJIIIIZZ = W5U.LJIIIIZZ(t.LJLIL.LIZIZ);
        SmartImageView smartImageView = this.LJLJJI;
        if (smartImageView != null) {
            LJIIIIZZ.LJJIIJ = smartImageView;
            LJIIIIZZ.LJIJJ = EnumC72807Shn.CENTER_CROP;
            SIK sik = this.LJLJJL;
            if (sik != null) {
                sil = sik.LJ;
            } else {
                sil = null;
            }
            LJIIIIZZ.LJJIZ = sil;
            Context context = this.itemView.getContext();
            o.LJIIIIZZ(context, "itemView.context");
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZJ = Float.valueOf(C32151Nz.LJIIZILJ(Float.valueOf(16.0f)));
            c110614Vt.LIZIZ = Integer.valueOf(R.attr.cg);
            LJIIIIZZ.LJIILIIL = c110614Vt.LIZ(context);
            SIK sik2 = this.LJLJJL;
            if (sik2 != null) {
                sie = sik2.LJFF;
            } else {
                sie = null;
            }
            LJIIIIZZ.LJFF(sie);
            C212418Vh.LJIIJJI(M(), new AqS178S0100000_12(this, 13));
            C16880lQ.LJIIJ(new ACListenerS46S0200000_12(t, this, 2), this.itemView);
            C71897SJp c71897SJp = this.LJLJI;
            if (c71897SJp != null) {
                c71897SJp.setInterceptToggleListener(new AqS159S0200000_12(this, t, 3));
                return;
            } else {
                o.LJIJI("checkBox");
                throw null;
            }
        }
        o.LJIJI("image");
        throw null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.c31, viewGroup, false, "from(parent.context)\n   …atar_item, parent, false)");
    }

    public final void L(SR2 sr2, SI6 si6, Set<SI6> set) {
        SI6 si62;
        SIF item = getItem();
        if (item != null && (si62 = item.LJLIL) != null) {
            if (sr2.isDownload()) {
                C71897SJp c71897SJp = this.LJLJI;
                if (c71897SJp != null) {
                    c71897SJp.setVisibility(0);
                    boolean contains = set.contains(si62);
                    this.LJLILLLLZI = contains;
                    C71897SJp c71897SJp2 = this.LJLJI;
                    if (c71897SJp2 != null) {
                        c71897SJp2.setChecked(contains);
                        this.itemView.setBackgroundResource(R.drawable.bw6);
                        return;
                    } else {
                        o.LJIJI("checkBox");
                        throw null;
                    }
                }
                o.LJIJI("checkBox");
                throw null;
            }
            C71897SJp c71897SJp3 = this.LJLJI;
            if (c71897SJp3 != null) {
                c71897SJp3.setVisibility(4);
                if (o.LJ(si6, si62)) {
                    this.itemView.setBackgroundResource(R.drawable.bw5);
                    return;
                } else {
                    this.itemView.setBackgroundResource(R.drawable.bw6);
                    return;
                }
            }
            o.LJIJI("checkBox");
            throw null;
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
