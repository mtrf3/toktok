package com.ss.android.ugc.aweme.im.sdk.chatlist.feature.groupchat.recommend.assem;

import X.C107724Kq;
import X.C112244aq;
import X.C119354mJ;
import X.C16880lQ;
import X.C1DI;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C214298b3;
import X.C221108m2;
import X.C32151Nz;
import X.C33Q;
import X.C3B2;
import X.C3B3;
import X.C3C8;
import X.C43659HBn;
import X.C4SH;
import X.C4SI;
import X.C56412MCa;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C71897SJp;
import X.C76800UCe;
import X.C78939UyV;
import X.C78946Uyc;
import X.C7WT;
import X.C7WU;
import X.C7WV;
import X.C7WW;
import X.C7WX;
import X.C87063bK;
import X.C8YZ;
import X.C9BD;
import X.C9BE;
import X.C9XN;
import X.EnumC112364b2;
import X.EnumC62195Ob1;
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
import X.O6R;
import X.OSK;
import X.OSL;
import X.OSM;
import X.OUP;
import X.TBW;
import X.W5F;
import X.W5U;
import X.YE1;
import Y.ACListenerS21S0100000_1;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.im.service.model.ActivityStatus;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS132S0200000_1;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class RecommendUserCell extends PowerCell<C87063bK> implements KPL {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 543));
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 542));
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 545));
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 544));
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 541));
    public final C214298b3 LJLJJLL;
    public final C62822Ol8 LJLJL;
    public LiveData<ActivityStatus> LJLJLJ;
    public final C62822Ol8 LJLJLLL;

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

    public final C119354mJ L() {
        Object value = this.LJLJJL.getValue();
        o.LJIIIIZZ(value, "<get-activityStatusView>(...)");
        return (C119354mJ) value;
    }

    public final C71897SJp M() {
        Object value = this.LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-checkBox>(...)");
        return (C71897SJp) value;
    }

    public RecommendUserCell() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(RecommendUserListViewModel.class);
        AqS151S0100000_1 aqS151S0100000_1 = new AqS151S0100000_1((InterfaceC65350Pko) LIZ, 551);
        C4SI c4si = C4SI.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS151S0100000_1, C7WU.INSTANCE, new AqS151S0100000_1((InterfaceC93923mO) this, 552), new AqS153S0100000_3((InterfaceC93923mO) this, 432), C7WX.INSTANCE, c4si, new AqS153S0100000_3((InterfaceC93923mO) this, 433), 256);
        } else if (o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(LIZ, aqS151S0100000_1, C7WV.INSTANCE, new AqS151S0100000_1((InterfaceC93923mO) this, 553), new AqS151S0100000_1((InterfaceC93923mO) this, 547), C7WW.INSTANCE, c4si, new AqS153S0100000_3((InterfaceC93923mO) this, 431), 256);
        } else if (c9be == null || o.LJ(c9be, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS151S0100000_1, C7WT.INSTANCE, new AqS151S0100000_1((InterfaceC93923mO) this, 548), new AqS151S0100000_1((InterfaceC93923mO) this, 549), new AqS151S0100000_1((InterfaceC93923mO) this, 550), c4si, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(YE1.LIZJ("Don't support this VMScope: ", c9be, " there"));
        }
        this.LJLJJLL = c214298b3;
        this.LJLJL = C221108m2.LIZIZ(C4SH.LJLIL);
        this.LJLJLLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 546));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C16880lQ.LJIIJ(new ACListenerS21S0100000_1(this, 86), this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void unBind() {
        super.unBind();
        L().setTag(R.id.eg1, null);
        LiveData<ActivityStatus> liveData = this.LJLJLJ;
        if (liveData != null) {
            liveData.removeObserver((Observer) this.LJLJLLL.getValue());
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C87063bK c87063bK) {
        String str;
        IMUser iMUser;
        ActivityStatus value;
        C87063bK t = c87063bK;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        W5F LJII = W5U.LJII(C78939UyV.LJ(t.LJLIL.getDisplayAvatar()));
        Object value2 = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value2, "<get-avatarIv>(...)");
        LJII.LJJIIJ = (SmartImageView) value2;
        LJII.LJJIII = EnumC62195Ob1.SMALL;
        int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(48));
        int LJJIIZ2 = O6R.LJJIIZ(C32151Nz.LJIIZILJ(48));
        LJII.LJII = LJJIIZ;
        LJII.LJIIIIZZ = LJJIIZ2;
        C43659HBn.LJIIZILJ(LJII, "RecommendUserCell", t.LJLIL.getUid(), 0, null, 28);
        Object value3 = this.LJLJI.getValue();
        o.LJIIIIZZ(value3, "<get-nameTv>(...)");
        ((TextView) value3).setText(t.LJLIL.getDisplayName());
        Object value4 = this.LJLJJI.getValue();
        o.LJIIIIZZ(value4, "<get-detailTv>(...)");
        ((TextView) value4).setText(t.LJLIL.getUniqueId());
        C212418Vh.LJIIJJI((AssemViewModel) this.LJLJJLL.getValue(), new AqS132S0200000_1(this, t, 37));
        C112244aq.LIZ(L(), t.LJLIL.getUid(), Boolean.valueOf(t.LJLIL.isOnline()));
        C3B2 c3b2 = (C3B2) this.LJLJL.getValue();
        String uid = t.LJLIL.getUid();
        o.LJIIIIZZ(uid, "t.contact.uid");
        ActivityStatus LJIIJ = c3b2.LJIIJ(uid);
        boolean z = false;
        if (LJIIJ != null && OUP.LJJII(LJIIJ, null, null, 3)) {
            L().setActive(true);
            L().setVisibility(0);
        } else {
            L().setVisibility(8);
        }
        C3B2 c3b22 = (C3B2) this.LJLJL.getValue();
        String uid2 = t.LJLIL.getUid();
        o.LJIIIIZZ(uid2, "t.contact.uid");
        LiveData<ActivityStatus> LIZ = C3B3.LIZ(c3b22, uid2, null, null, 14);
        LIZ.observe(this, (Observer) this.LJLJLLL.getValue());
        this.LJLJLJ = LIZ;
        C107724Kq c107724Kq = new C107724Kq(getCurrentLifecycleOwner());
        LiveData<ActivityStatus> liveData = this.LJLJLJ;
        if (liveData != null && (value = liveData.getValue()) != null) {
            z = OUP.LJJII(value, null, null, 3);
        }
        c107724Kq.LJI = Boolean.valueOf(z);
        c107724Kq.LIZIZ = EnumC112364b2.GROUP_CHAT_RECOMMENDATION_PANEL;
        C87063bK item = getItem();
        if (item == null || (iMUser = item.LJLIL) == null || (str = iMUser.getUid()) == null) {
            str = "";
        }
        c107724Kq.LIZJ = str;
        c107724Kq.LJFF = Integer.valueOf(getBindingAdapterPosition());
        C78946Uyc.LJJIJL(c107724Kq);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.b5g, viewGroup, false, "from(parent.context)\n   …roup_chat, parent, false)");
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
