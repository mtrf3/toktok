package com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view;

import X.AJ9;
import X.C16880lQ;
import X.C1DI;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C213688a4;
import X.C214298b3;
import X.C33Q;
import X.C3C8;
import X.C56412MCa;
import X.C65352Pkq;
import X.C65776Prg;
import X.C71897SJp;
import X.C72385Saz;
import X.C72386Sb0;
import X.C72387Sb1;
import X.C72388Sb2;
import X.C72389Sb3;
import X.C76800UCe;
import X.C78939UyV;
import X.C8YN;
import X.C8YZ;
import X.C91773iv;
import X.C93953mR;
import X.C97343ru;
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
import X.OSK;
import X.OSL;
import X.OSM;
import X.TBT;
import X.TBW;
import X.W5F;
import X.W5U;
import X.X1D;
import X.YE1;
import Y.ACListenerS21S0100000_1;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.ContactListViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.zhiliaoapp.musically.R;
import java.util.Set;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS183S0100000_1;
import kotlin.jvm.internal.o;
import o3.IDaS88S0000000_1;
import o3.h0;

/* loaded from: classes2.dex */
public class BaseContactListCell<T extends C91773iv> extends PowerCell<T> implements KPL {
    public final C214298b3 LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;

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
        C16880lQ.LJIIJ(new ACListenerS21S0100000_1(this, 99), this.itemView);
        C8YN.LJII(this, L(), new TBT() { // from class: X.3m9
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C91843j2) obj).LJLILLLLZI;
            }
        }, C213688a4.LIZLLL(), new AqS183S0100000_1(this, 43), 4);
    }

    public final ContactListViewModel L() {
        return (ContactListViewModel) this.LJLIL.getValue();
    }

    public BaseContactListCell() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ContactListViewModel.class);
        AqS151S0100000_1 aqS151S0100000_1 = new AqS151S0100000_1((InterfaceC65350Pko) LIZ, 647);
        C93953mR c93953mR = C93953mR.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS151S0100000_1, C72388Sb2.INSTANCE, new AqS151S0100000_1((InterfaceC93923mO) this, 648), new AqS162S0100000_12(this, 623), C72386Sb0.INSTANCE, c93953mR, new AqS162S0100000_12(this, 624), 256);
        } else if (o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(LIZ, aqS151S0100000_1, C72389Sb3.INSTANCE, new AqS151S0100000_1((InterfaceC93923mO) this, 649), new AqS151S0100000_1((InterfaceC93923mO) this, 643), C72385Saz.INSTANCE, c93953mR, new AqS162S0100000_12(this, 622), 256);
        } else if (c9be == null || o.LJ(c9be, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS151S0100000_1, C72387Sb1.INSTANCE, new AqS151S0100000_1((InterfaceC93923mO) this, 644), new AqS151S0100000_1((InterfaceC93923mO) this, 645), new AqS151S0100000_1((InterfaceC93923mO) this, 646), c93953mR, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(YE1.LIZJ("Don't support this VMScope: ", c9be, " there"));
        }
        this.LJLIL = c214298b3;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: M */
    public void onBindItemView(T item) {
        float f;
        String LJFF;
        o.LJIIIZ(item, "item");
        float f2 = 1.0f;
        this.itemView.setAlpha(1.0f);
        View view = this.itemView;
        W5F LJII = W5U.LJII(C78939UyV.LJ(item.LJLIL.getDisplayAvatar()));
        LJII.LJJIJIIJIL = true;
        LJII.LJJIIJ = (SmartImageView) view.findViewById(R.id.acf);
        C16880lQ.LLJJJ(LJII);
        TextView textView = (TextView) view.findViewById(R.id.gw7);
        if (textView != null) {
            textView.setText(item.LJLIL.getDisplayName());
            AJ9.LJ(textView.getContext(), item.LJLIL.getCustomVerify(), item.LJLIL.getEnterpriseVerifyReason(), textView);
        }
        ((TextView) view.findViewById(R.id.c9f)).setText(item.LJLIL.getUniqueId());
        IMUser user = item.LJLIL;
        o.LJIIIZ(user, "user");
        N(L().kv0(user));
        IMUser user2 = item.LJLIL;
        o.LJIIIZ(user2, "user");
        ContactListViewModel L = L();
        L.getClass();
        boolean contains = ((Set) L.LJLJJI.getValue()).contains(user2);
        this.LJLJI = contains;
        View view2 = this.itemView;
        if (contains) {
            f = 0.34f;
        } else {
            f = 1.0f;
        }
        view2.setAlpha(f);
        if (!this.LJLILLLLZI) {
            boolean gv0 = L().gv0();
            View view3 = this.itemView;
            if (gv0) {
                f2 = 0.34f;
            }
            view3.setAlpha(f2);
        }
        View view4 = this.itemView;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C97343ru.LJFF(R.string.atg));
        LIZ.append(' ');
        LIZ.append(item.LJLIL.getDisplayName());
        view4.setContentDescription(X1D.LIZIZ(LIZ));
        View view5 = this.itemView;
        if (((CompoundButton) view5.findViewById(R.id.bs4)).isChecked()) {
            LJFF = C97343ru.LJFF(R.string.b30);
        } else {
            LJFF = C97343ru.LJFF(R.string.b2v);
        }
        h0.LJJII(view5, LJFF);
        h0.LJIJI(this.itemView, new IDaS88S0000000_1(5));
    }

    public final void N(boolean z) {
        String LJFF;
        if (this.LJLILLLLZI == z) {
            return;
        }
        this.LJLILLLLZI = z;
        ((C71897SJp) this.itemView.findViewById(R.id.bs4)).setChecked(z);
        View view = this.itemView;
        if (z) {
            LJFF = C97343ru.LJFF(R.string.b30);
        } else {
            LJFF = C97343ru.LJFF(R.string.b2v);
        }
        h0.LJJII(view, LJFF);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.b3_, viewGroup, false, "from(parent.context)\n   …t_contact, parent, false)");
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
