package com.ss.android.ugc.aweme.im.sdk.chatdetail.group.header;

import X.AnonymousClass636;
import X.C16880lQ;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C214298b3;
import X.C221108m2;
import X.C33Q;
import X.C3C8;
import X.C3IY;
import X.C43659HBn;
import X.C45S;
import X.C4AS;
import X.C56412MCa;
import X.C62822Ol8;
import X.C63088OpQ;
import X.C63120Opw;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72365Saf;
import X.C72366Sag;
import X.C72367Sah;
import X.C72368Sai;
import X.C72369Saj;
import X.C72370Sak;
import X.C72371Sal;
import X.C72372Sam;
import X.C72373San;
import X.C72374Sao;
import X.C76800UCe;
import X.C77339UWx;
import X.C78939UyV;
import X.C81093Gf;
import X.C8YN;
import X.C8YZ;
import X.C90233gR;
import X.C95233oV;
import X.C95833pT;
import X.C96313qF;
import X.C96323qG;
import X.C96343qI;
import X.C9BD;
import X.C9BE;
import X.C9XN;
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
import X.OSK;
import X.OSL;
import X.OSM;
import X.TBT;
import X.TBW;
import X.W5F;
import Y.ACListenerS21S0100000_1;
import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.group.functions.GroupDetailViewModel;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.group.header.GroupTitleCell;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.group.member.MemberListVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS164S0200000_1;
import kotlin.jvm.internal.AqS183S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class GroupTitleCell extends PowerCell<C95233oV> implements KPL {
    public final C214298b3 LJLIL;
    public final C214298b3 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final C62822Ol8 LJLL;

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
        return R.layout.b9m;
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
        C8YN.LJII(this, this.LJLILLLLZI.getValue(), new TBT() { // from class: X.3nR
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C94453nF) obj).LJLILLLLZI;
            }
        }, null, new AqS183S0100000_1(this, 32), 6);
        C8YN.LJII(this, Q(), new TBT() { // from class: X.3oc
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C95293ob) obj).LJZI;
            }
        }, null, new AqS183S0100000_1(this, 33), 6);
    }

    public final C96343qI L() {
        return (C96343qI) this.LJLJLJ.getValue();
    }

    public final TuxIconView M() {
        return (TuxIconView) this.LJLJLLL.getValue();
    }

    public final TuxTextView N() {
        return (TuxTextView) this.LJLJJLL.getValue();
    }

    public final TuxTextView P() {
        return (TuxTextView) this.LJLJJI.getValue();
    }

    public final GroupDetailViewModel Q() {
        return (GroupDetailViewModel) this.LJLIL.getValue();
    }

    public GroupTitleCell() {
        C214298b3 c214298b3;
        C214298b3 c214298b32;
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(GroupDetailViewModel.class);
        AqS151S0100000_1 aqS151S0100000_1 = new AqS151S0100000_1((InterfaceC65350Pko) LIZ, 470);
        C96313qF c96313qF = C96313qF.INSTANCE;
        if (o.LJ(c9bd, c9bd)) {
            c214298b3 = new C214298b3(LIZ, aqS151S0100000_1, C72365Saf.INSTANCE, new AqS151S0100000_1((InterfaceC93923mO) this, 484), new AqS162S0100000_12(this, 612), C72371Sal.INSTANCE, c96313qF, new AqS162S0100000_12(this, 614), 256);
        } else if (o.LJ(c9bd, C9BE.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS151S0100000_1, C72367Sah.INSTANCE, new AqS151S0100000_1((InterfaceC93923mO) this, 487), new AqS151S0100000_1((InterfaceC93923mO) this, 485), C72370Sak.INSTANCE, c96313qF, new AqS162S0100000_12(this, 613), 256);
        } else if (c9bd == null || o.LJ(c9bd, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS151S0100000_1, C72366Sag.INSTANCE, new AqS151S0100000_1((InterfaceC93923mO) this, 486), new AqS151S0100000_1((InterfaceC93923mO) this, 488), new AqS151S0100000_1((InterfaceC93923mO) this, 490), c96313qF, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(C77339UWx.LIZLLL("Don't support this VMScope: ", c9bd, " there"));
        }
        this.LJLIL = c214298b3;
        C65776Prg LIZ2 = C65352Pkq.LIZ(MemberListVM.class);
        AqS151S0100000_1 aqS151S0100000_12 = new AqS151S0100000_1((InterfaceC65350Pko) LIZ2, 491);
        C96323qG c96323qG = C96323qG.INSTANCE;
        if (o.LJ(c9bd, c9bd)) {
            c214298b32 = new C214298b3(LIZ2, aqS151S0100000_12, C72372Sam.INSTANCE, new AqS151S0100000_1((InterfaceC93923mO) this, 472), new AqS162S0100000_12(this, 609), C72368Sai.INSTANCE, c96323qG, new AqS162S0100000_12(this, 610), 256);
        } else if (o.LJ(c9bd, C9BE.LIZ)) {
            c214298b32 = new C214298b3(LIZ2, aqS151S0100000_12, C72373San.INSTANCE, new AqS151S0100000_1((InterfaceC93923mO) this, 478), new AqS151S0100000_1((InterfaceC93923mO) this, 480), C72369Saj.INSTANCE, c96323qG, new AqS162S0100000_12(this, 611), 256);
        } else if (c9bd == null || o.LJ(c9bd, C9XN.LIZ)) {
            c214298b32 = new C214298b3(LIZ2, aqS151S0100000_12, C72374Sao.INSTANCE, new AqS151S0100000_1((InterfaceC93923mO) this, 481), new AqS151S0100000_1((InterfaceC93923mO) this, 482), new AqS151S0100000_1((InterfaceC93923mO) this, 483), c96323qG, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(C77339UWx.LIZLLL("Don't support this VMScope: ", c9bd, " there"));
        }
        this.LJLILLLLZI = c214298b32;
        this.LJLJI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 471));
        this.LJLJJI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 489));
        this.LJLJJL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 473));
        this.LJLJJLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 479));
        this.LJLJL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 475));
        this.LJLJLJ = C221108m2.LIZIZ(new AqS151S0100000_1(this, 476));
        this.LJLJLLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 477));
        this.LJLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 474));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C95233oV c95233oV) {
        C95233oV t = c95233oV;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        C63120Opw LIZLLL = Q().LJLIL.LJLILLLLZI.LIZLLL();
        if (LIZLLL == null) {
            C8YN.LJII(this, Q(), new TBT() { // from class: X.3nS
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C95293ob) obj).LL;
                }
            }, null, new AqS164S0200000_1(this, t, 15), 6);
        } else {
            T(t, LIZLLL);
        }
    }

    public final void T(C95233oV c95233oV, C63120Opw c63120Opw) {
        String str;
        InputMethodManager inputMethodManager;
        C95833pT c95833pT = c95233oV.LJLIL;
        Context context = this.itemView.getContext();
        String string = context.getString(R.string.gv8);
        o.LJIIIIZZ(string, "context.getString(R.stri…p_chat_26_add_group_name)");
        C81093Gf.LIZ().getClass();
        String LIZIZ = C3IY.LIZIZ(c63120Opw);
        W5F LJ = C45S.LJ((SmartImageView) this.LJLJI.getValue(), C78939UyV.LJ(C4AS.LJIIJ(LIZIZ)), 0, 0, Q().LJLJJLL, 12);
        LJ.LJJIII = EnumC62195Ob1.SMALL;
        String str2 = null;
        C43659HBn.LJIJI(LJ, "GroupTitleModel", null, 6);
        Q().LJLJJLL = LIZIZ;
        String str3 = "";
        int i = 0;
        if (c95833pT.LJLJJI) {
            P().setVisibility(8);
            ((ImageView) this.LJLJJL.getValue()).setVisibility(8);
            M().setVisibility(8);
            N().setVisibility(8);
            ((View) this.LJLJL.getValue()).setVisibility(0);
            ((View) this.LJLL.getValue()).setVisibility(0);
            L().setEnabled(false);
            L().LJI();
            if (c95833pT.LJLILLLLZI) {
                C96343qI L = L();
                String str4 = Q().LJLJJL;
                if (str4 != null) {
                    str3 = str4;
                }
                L.setText(str3);
                return;
            }
            L().setHint(string);
            return;
        }
        if (c95833pT.LJLJI) {
            P().setVisibility(8);
            ((ImageView) this.LJLJJL.getValue()).setVisibility(8);
            N().setVisibility(8);
            ((View) this.LJLJL.getValue()).setVisibility(0);
            ((View) this.LJLL.getValue()).setVisibility(8);
            L().setText("");
            L().setEnabled(true);
            C16880lQ.LJJJ(M(), new ACListenerS21S0100000_1(this, 83));
            if (c95833pT.LJLILLLLZI) {
                C96343qI L2 = L();
                C63088OpQ coreInfo = c63120Opw.getCoreInfo();
                if (coreInfo != null) {
                    str2 = coreInfo.getName();
                }
                L2.setText(str2);
                M().setVisibility(0);
            } else {
                L().setHint(string);
                M().setVisibility(8);
            }
            L().LJI();
            L().addTextChangedListener(new C90233gR() { // from class: X.3q0
                @Override // X.C90233gR, android.text.TextWatcher
                public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                    CharSequence charSequence2;
                    GroupDetailViewModel Q = GroupTitleCell.this.Q();
                    if (charSequence == null) {
                        charSequence2 = "";
                    } else {
                        charSequence2 = charSequence;
                    }
                    Q.getClass();
                    Q.LJLJJL = charSequence2.toString();
                    if (charSequence != null && charSequence.length() > 0) {
                        GroupTitleCell.this.M().setVisibility(0);
                    } else {
                        GroupTitleCell.this.M().setVisibility(8);
                    }
                }
            });
            L().setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: X.3q1
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                    if (i2 == 6) {
                        GroupTitleCell.this.Q().hv0();
                        KeyboardUtils.LIZIZ(textView);
                        return true;
                    }
                    return false;
                }
            });
            if (!L().hasFocus()) {
                L().requestFocus();
                Object LLILL = C16880lQ.LLILL(context, "input_method");
                if ((LLILL instanceof InputMethodManager) && (inputMethodManager = (InputMethodManager) LLILL) != null) {
                    inputMethodManager.toggleSoftInput(1, 0);
                }
                C96343qI L3 = L();
                Editable text = L().getText();
                if (text != null) {
                    i = text.length();
                }
                L3.setSelection(i);
                return;
            }
            return;
        }
        P().setVisibility(0);
        ((ImageView) this.LJLJJL.getValue()).setVisibility(0);
        N().setVisibility(0);
        ((View) this.LJLJL.getValue()).setVisibility(8);
        ((View) this.LJLL.getValue()).setVisibility(8);
        L().setEnabled(false);
        if (c95833pT.LJLILLLLZI) {
            TuxTextView P = P();
            C63088OpQ coreInfo2 = c63120Opw.getCoreInfo();
            if (coreInfo2 != null) {
                str = coreInfo2.getName();
            } else {
                str = null;
            }
            P.setText(str);
            P().setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.go, context));
        } else {
            P().setText(string);
            P().setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.gv, context));
        }
        TuxTextView N = N();
        Resources resources = context.getResources();
        if (resources != null) {
            str2 = resources.getQuantityString(R.plurals.g9, c63120Opw.getMemberCount(), Integer.valueOf(c63120Opw.getMemberCount()));
        }
        N.setText(str2);
        C16880lQ.LJJJJI(P(), new ACListenerS21S0100000_1(this, 84));
        C16880lQ.LJJJ((TuxIconView) this.LJLJJL.getValue(), new ACListenerS21S0100000_1(this, 85));
        KeyboardUtils.LIZIZ(L());
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
