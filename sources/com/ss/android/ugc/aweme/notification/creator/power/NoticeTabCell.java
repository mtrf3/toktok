package com.ss.android.ugc.aweme.notification.creator.power;

import X.C16880lQ;
import X.C1FJ;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C213688a4;
import X.C214298b3;
import X.C26338AVi;
import X.C32151Nz;
import X.C33Q;
import X.C3C8;
import X.C56204M4a;
import X.C56412MCa;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C77339UWx;
import X.C79045V0n;
import X.C8YN;
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
import X.KPL;
import X.MUI;
import X.MUL;
import X.MUM;
import X.MUN;
import X.MUO;
import X.MUP;
import X.MUQ;
import X.MUR;
import X.O6R;
import X.OSK;
import X.OSL;
import X.OSM;
import X.TBT;
import X.TBW;
import X.X1D;
import Y.ACListenerS29S0100000_9;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.notification.creator.model.response.NoticeTabModel;
import com.ss.android.ugc.aweme.notification.creator.vm.CreatorNoticeTabVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.AqS191S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class NoticeTabCell extends PowerCell<MUI> implements KPL {
    public TuxTextView LJLIL;
    public final C214298b3 LJLILLLLZI;

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
        TuxTextView tuxTextView = this.LJLIL;
        if (tuxTextView != null) {
            C16880lQ.LJJJJI(tuxTextView, new ACListenerS29S0100000_9(this, 27));
            AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LJLILLLLZI.getValue(), new TBT() { // from class: X.MUH
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((MT8) obj).LJLJI;
                }
            }, C213688a4.LIZLLL(), null, null, new AqS175S0100000_9(this, 159), 12, null);
            C8YN.LJII(this, (AssemViewModel) this.LJLILLLLZI.getValue(), new TBT() { // from class: X.MUJ
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((MT8) obj).LJLIL;
                }
            }, C213688a4.LIZLLL(), new AqS191S0100000_9(this, 39), 4);
            return;
        }
        o.LJIJI("tabText");
        throw null;
    }

    public NoticeTabCell() {
        C214298b3 c214298b3;
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(CreatorNoticeTabVM.class);
        AqS159S0100000_9 aqS159S0100000_9 = new AqS159S0100000_9(LIZ, 397);
        MUO muo = MUO.INSTANCE;
        if (o.LJ(c9bd, c9bd)) {
            c214298b3 = new C214298b3(LIZ, aqS159S0100000_9, MUM.INSTANCE, new AqS159S0100000_9(this, 398), new AqS159S0100000_9(this, 399), MUQ.INSTANCE, muo, new AqS159S0100000_9(this, LiveChatShowDelayForHotLiveSetting.DEFAULT), 256);
        } else if (o.LJ(c9bd, C9BE.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS159S0100000_9, MUN.INSTANCE, new AqS159S0100000_9(this, 401), new AqS159S0100000_9(this, 392), MUP.INSTANCE, muo, new AqS159S0100000_9(this, 393), 256);
        } else if (c9bd == null || o.LJ(c9bd, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS159S0100000_9, MUL.INSTANCE, new AqS159S0100000_9(this, 394), new AqS159S0100000_9(this, 395), new AqS159S0100000_9(this, 396), muo, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(C77339UWx.LIZLLL("Don't support this VMScope: ", c9bd, " there"));
        }
        this.LJLILLLLZI = c214298b3;
    }

    public final int L() {
        MUR mur;
        MUI item = getItem();
        if (item != null && (mur = item.LJLIL) != null && mur.LIZIZ) {
            return R.drawable.zi;
        }
        return R.drawable.yv;
    }

    public static String N(NoticeTabModel noticeTabModel) {
        int i;
        if (noticeTabModel.isAllTab || (i = noticeTabModel.unReadCount) == 0) {
            String str = noticeTabModel.tabName;
            if (str == null) {
                return "";
            }
            return str;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(noticeTabModel.tabName);
        LIZ.append(' ');
        LIZ.append(C56204M4a.LJI(i));
        return X1D.LIZIZ(LIZ);
    }

    public final int M(Context context) {
        MUR mur;
        MUI item = getItem();
        if (item != null && (mur = item.LJLIL) != null && mur.LIZIZ) {
            Integer LJI = C79045V0n.LJI(R.attr.c8, context);
            if (LJI == null) {
                return 0;
            }
            return LJI.intValue();
        }
        Integer LJI2 = C79045V0n.LJI(R.attr.go, context);
        if (LJI2 == null) {
            return 0;
        }
        return LJI2.intValue();
    }

    public final void P(boolean z) {
        MUR mur;
        MUI item = getItem();
        if (item != null && (mur = item.LJLIL) != null) {
            mur.LIZIZ = z;
        }
        TuxTextView tuxTextView = this.LJLIL;
        if (tuxTextView != null) {
            Context context = tuxTextView.getContext();
            o.LJIIIIZZ(context, "tabText.context");
            tuxTextView.setTextColor(M(context));
            TuxTextView tuxTextView2 = this.LJLIL;
            if (tuxTextView2 != null) {
                tuxTextView2.setBackgroundResource(L());
                TuxTextView tuxTextView3 = this.LJLIL;
                if (tuxTextView3 != null) {
                    tuxTextView3.setSelected(true);
                    return;
                } else {
                    o.LJIJI("tabText");
                    throw null;
                }
            }
            o.LJIJI("tabText");
            throw null;
        }
        o.LJIJI("tabText");
        throw null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(MUI mui) {
        MUI t = mui;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        TuxTextView tuxTextView = this.LJLIL;
        if (tuxTextView != null) {
            tuxTextView.setText(N(t.LJLIL.LIZ));
            TuxTextView tuxTextView2 = this.LJLIL;
            if (tuxTextView2 != null) {
                Context context = tuxTextView2.getContext();
                o.LJIIIIZZ(context, "tabText.context");
                tuxTextView2.setTextColor(M(context));
                TuxTextView tuxTextView3 = this.LJLIL;
                if (tuxTextView3 != null) {
                    tuxTextView3.setBackgroundResource(L());
                    C212418Vh.LJIIJJI((AssemViewModel) this.LJLILLLLZI.getValue(), new AqS175S0100000_9(this, 453));
                    return;
                } else {
                    o.LJIJI("tabText");
                    throw null;
                }
            }
            o.LJIJI("tabText");
            throw null;
        }
        o.LJIJI("tabText");
        throw null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        Context context = parent.getContext();
        o.LJIIIIZZ(context, "parent.context");
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        tuxTextView.setMaxLines(1);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setGravity(8388611);
        C26338AVi.LJIIIZ(tuxTextView, C1FJ.LIZIZ(16), C1FJ.LIZIZ(8), C1FJ.LIZIZ(16), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8))), 16);
        tuxTextView.setTuxFont(62);
        this.LJLIL = tuxTextView;
        return tuxTextView;
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
