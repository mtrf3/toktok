package com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.stickerset.setlist;

import X.C115564gC;
import X.C115574gD;
import X.C16880lQ;
import X.C18950ol;
import X.C1DI;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C214298b3;
import X.C221108m2;
import X.C26338AVi;
import X.C32151Nz;
import X.C33Q;
import X.C3C8;
import X.C43659HBn;
import X.C56412MCa;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72330Sa6;
import X.C72331Sa7;
import X.C72332Sa8;
import X.C72333Sa9;
import X.C72334SaA;
import X.C72412sn;
import X.C76800UCe;
import X.C78926UyI;
import X.C78939UyV;
import X.C7C3;
import X.C7MY;
import X.C86793Y4n;
import X.C88033ct;
import X.C88443dY;
import X.C8YZ;
import X.C90193gN;
import X.C99W;
import X.C9BD;
import X.C9BE;
import X.C9XN;
import X.EnumC115544gA;
import X.EnumC61782be;
import X.EnumC71912rz;
import X.EnumC87003bE;
import X.HK5;
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
import X.ORZ;
import X.OSK;
import X.OSL;
import X.OSM;
import X.OUP;
import X.SY4;
import X.TBW;
import X.W5F;
import X.W5U;
import X.YE1;
import Y.ACListenerS21S0100000_1;
import Y.IDTListenerS111S0100000_1;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.StickerUrlStruct;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.stickerset.viewmodel.StickerSetContentViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class StickerSetContentCell extends PowerCell<C72412sn> implements KPL {
    public static final int LJLLJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(112));
    public static final int LJLLL = C7MY.LIZIZ(96);
    public static final Interpolator LJLLLL;
    public final C214298b3 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final C62822Ol8 LJLJLJ;
    public boolean LJLJLLL;
    public final C62822Ol8 LJLL;
    public final C62822Ol8 LJLLI;
    public final int LJLLILLLL;

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

    static {
        PathInterpolator LIZIZ = C18950ol.LIZIZ(0.4f, 0.0f, 0.2f, 1.0f);
        o.LJIIIIZZ(LIZIZ, "create(0.4f, 0f, 0.2f, 1f)");
        LJLLLL = LIZIZ;
    }

    public final StickerSetContentViewModel M() {
        return (StickerSetContentViewModel) this.LJLIL.getValue();
    }

    public final TuxIconView N() {
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-deleteBtn>(...)");
        return (TuxIconView) value;
    }

    public final SY4 P() {
        Object value = this.LJLJL.getValue();
        o.LJIIIIZZ(value, "<get-opBtn>(...)");
        return (SY4) value;
    }

    public final TuxIconView Q() {
        Object value = this.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-reorderBtn>(...)");
        return (TuxIconView) value;
    }

    public final SmartImageView T() {
        Object value = this.LJLJJLL.getValue();
        o.LJIIIIZZ(value, "<get-setCover>(...)");
        return (SmartImageView) value;
    }

    public final TuxTextView U() {
        Object value = this.LJLJJL.getValue();
        o.LJIIIIZZ(value, "<get-setDesc>(...)");
        return (TuxTextView) value;
    }

    public final TuxTextView V() {
        Object value = this.LJLJJI.getValue();
        o.LJIIIIZZ(value, "<get-setName>(...)");
        return (TuxTextView) value;
    }

    public StickerSetContentCell() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(StickerSetContentViewModel.class);
        AqS151S0100000_1 aqS151S0100000_1 = new AqS151S0100000_1((InterfaceC65350Pko) LIZ, 200);
        C115574gD c115574gD = C115574gD.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS151S0100000_1, C72334SaA.INSTANCE, new AqS151S0100000_1((InterfaceC93923mO) this, 185), new AqS162S0100000_12(this, 588), C72330Sa6.INSTANCE, c115574gD, new AqS162S0100000_12(this, 589), 256);
        } else if (o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(LIZ, aqS151S0100000_1, C72332Sa8.INSTANCE, new AqS151S0100000_1((InterfaceC93923mO) this, 189), new AqS151S0100000_1((InterfaceC93923mO) this, 196), C72331Sa7.INSTANCE, c115574gD, new AqS162S0100000_12(this, 590), 256);
        } else if (c9be == null || o.LJ(c9be, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS151S0100000_1, C72333Sa9.INSTANCE, new AqS151S0100000_1((InterfaceC93923mO) this, 197), new AqS151S0100000_1((InterfaceC93923mO) this, 198), new AqS151S0100000_1((InterfaceC93923mO) this, 199), c115574gD, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(YE1.LIZJ("Don't support this VMScope: ", c9be, " there"));
        }
        this.LJLIL = c214298b3;
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 187));
        this.LJLJI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 192));
        this.LJLJJI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 195));
        this.LJLJJL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 194));
        this.LJLJJLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 193));
        this.LJLJL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 190));
        this.LJLJLJ = C221108m2.LIZIZ(new AqS151S0100000_1(this, 191));
        this.LJLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 186));
        this.LJLLI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 188));
        this.LJLLILLLL = C90193gN.LIZ() ? -1 : 1;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        Fragment fragment;
        U().setTextDirection(5);
        V().setTextDirection(5);
        LifecycleOwner currentLifecycleOwner = getCurrentLifecycleOwner();
        if ((currentLifecycleOwner instanceof Fragment) && (fragment = (Fragment) currentLifecycleOwner) != null) {
            M().hierarchyDataStore = (C7C3) C78926UyI.LJJ(fragment, false).invoke();
            if (C76800UCe.LIZ == null) {
                return;
            }
            C16880lQ.LJIIJ(new ACListenerS21S0100000_1(this, 52), this.itemView);
            if (C99W.LIZ) {
                P();
                OUP.LJJJJLI(T(), Float.valueOf(C32151Nz.LJIIZILJ(4)), null, null, 30);
            }
            C16880lQ.LJJIZ(P(), new ACListenerS21S0100000_1(this, 53));
            C16880lQ.LJJJ(N(), new ACListenerS21S0100000_1(this, 54));
            Q().setOnTouchListener(new IDTListenerS111S0100000_1(this, 1));
            Fragment LJIL = C86793Y4n.LJIL(getCurrentLifeCycleOwner());
            StickerSetContentViewModel M = M();
            AqS167S0100000_1 aqS167S0100000_1 = new AqS167S0100000_1(this, 87);
            M.getClass();
            AssemViewModel.selectSubscribe$default(M, C88443dY.LJLIL, null, LJIL, null, aqS167S0100000_1, 10, null);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void unBind() {
        P().setLoading(false);
        this.LJLJLLL = false;
    }

    public final void L(C72412sn c72412sn) {
        C88033ct pv0;
        String string;
        SY4 P = P();
        Integer setStatus = c72412sn.LJLIL.getSetStatus();
        int status = EnumC71912rz.LOADING.getStatus();
        if (setStatus == null || setStatus.intValue() != status) {
            int status2 = EnumC71912rz.ADDED.getStatus();
            if (setStatus == null || setStatus.intValue() != status2) {
                P.setButtonVariant(0);
                P.setLoading(false);
                P.setText(P.getContext().getString(R.string.ro6));
                return;
            }
            if (C99W.LIZ) {
                P.setButtonVariant(5);
            } else {
                P.setButtonVariant(1);
            }
            P.setLoading(false);
            C88033ct pv02 = M().pv0();
            if ((pv02 != null && pv02.LJLILLLLZI == EnumC87003bE.PERSONAL_PROFILE_NOT_FROM_STICKER_STORE.getType()) || ((pv0 = M().pv0()) != null && pv0.LJLILLLLZI == EnumC87003bE.OTHERS_PROFILE_NOT_FROM_STICKER_STORE.getType())) {
                string = P.getContext().getString(R.string.ro7);
            } else {
                string = P.getContext().getString(R.string.ro_);
            }
            P.setText(string);
            return;
        }
        P.setButtonVariant(0);
        P.setLoading(true);
    }

    public final void Y(EnumC115544gA enumC115544gA) {
        if (!this.LJLJLLL) {
            return;
        }
        int ordinal = enumC115544gA.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                return;
            }
            N().setTranslationX(0.0f);
            Q().setTranslationX(0.0f);
            V().setTranslationX(C32151Nz.LJIIZILJ(32) * this.LJLLILLLL);
            U().setTranslationX(C32151Nz.LJIIZILJ(32) * this.LJLLILLLL);
            T().setTranslationX(C32151Nz.LJIIZILJ(32) * this.LJLLILLLL);
            P().setAlpha(0.0f);
            TuxTextView V = V();
            int i = LJLLL;
            C26338AVi.LJI(V, null, null, Integer.valueOf(i), null, false, 27);
            C26338AVi.LJI(U(), null, null, Integer.valueOf(i), null, false, 27);
            P().setVisibility(8);
            N().setVisibility(0);
            Q().setVisibility(0);
            return;
        }
        N().setTranslationX(C32151Nz.LJIIZILJ(-42) * this.LJLLILLLL);
        Q().setTranslationX(C32151Nz.LJIIZILJ(56) * this.LJLLILLLL);
        V().setTranslationX(0.0f);
        U().setTranslationX(0.0f);
        T().setTranslationX(0.0f);
        P().setAlpha(1.0f);
        TuxTextView V2 = V();
        int i2 = LJLLJ;
        C26338AVi.LJI(V2, null, null, Integer.valueOf(i2), null, false, 27);
        C26338AVi.LJI(U(), null, null, Integer.valueOf(i2), null, false, 27);
        P().setVisibility(0);
        N().setVisibility(8);
        Q().setVisibility(8);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C72412sn c72412sn) {
        String desc;
        UrlModel urlModel;
        C72412sn t = c72412sn;
        o.LJIIIZ(t, "t");
        this.LJLJLLL = true;
        TuxTextView V = V();
        String name = t.LJLIL.getName();
        String str = "";
        if (name == null) {
            name = "";
        }
        V.setText(name);
        TuxTextView U = U();
        C88033ct pv0 = M().pv0();
        if (pv0 == null || pv0.LJLILLLLZI != EnumC87003bE.STICKER_STORE.getType() ? (desc = t.LJLIL.getDesc()) != null : (desc = t.LJLIL.getAuthorName()) != null) {
            str = desc;
        }
        U.setText(str);
        StickerUrlStruct iconUrl = t.LJLIL.getIconUrl();
        if (iconUrl != null) {
            urlModel = iconUrl.getMidResolutionUrl();
        } else {
            urlModel = null;
        }
        W5F LJII = W5U.LJII(C78939UyV.LJ(urlModel));
        LJII.LJJIIJ = T();
        C43659HBn.LJIJ(LJII, "sticker_store_sticker_set_cover", false, null, 6);
        L(t);
        if (!((AnimatorSet) this.LJLL.getValue()).isRunning() && !((AnimatorSet) this.LJLLI.getValue()).isRunning()) {
            C212418Vh.LJIIJJI(M(), new AqS167S0100000_1(this, 209));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.b66, viewGroup, false, "from(parent.context)\n   …t_content, parent, false)");
    }

    public final void X(AnimatorSet animatorSet, float f) {
        ValueAnimator valueAnimator;
        if (!animatorSet.isRunning()) {
            if (Build.VERSION.SDK_INT >= 22) {
                ArrayList<Animator> childAnimations = animatorSet.getChildAnimations();
                o.LJIIIIZZ(childAnimations, "childAnimations");
                Iterator<Animator> it = childAnimations.iterator();
                while (it.hasNext()) {
                    Animator next = it.next();
                    if ((next instanceof ValueAnimator) && (valueAnimator = (ValueAnimator) next) != null) {
                        valueAnimator.setCurrentFraction(f);
                    }
                }
            }
            animatorSet.start();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C72412sn c72412sn, List payloads) {
        UrlModel urlModel;
        String desc;
        C72412sn t = c72412sn;
        o.LJIIIZ(t, "t");
        o.LJIIIZ(payloads, "payloads");
        this.LJLJLLL = true;
        Object LJLLLLLL = ORZ.LJLLLLLL(0, payloads);
        if (LJLLLLLL instanceof C115564gC) {
            C115564gC c115564gC = (C115564gC) LJLLLLLL;
            String str = "";
            if (c115564gC.LJLIL) {
                TuxTextView V = V();
                String name = t.LJLIL.getName();
                if (name == null) {
                    name = "";
                }
                V.setText(name);
            }
            if (c115564gC.LJLILLLLZI) {
                TuxTextView U = U();
                C88033ct pv0 = M().pv0();
                if (pv0 == null || pv0.LJLILLLLZI != EnumC87003bE.STICKER_STORE.getType() ? (desc = t.LJLIL.getDesc()) != null : (desc = t.LJLIL.getAuthorName()) != null) {
                    str = desc;
                }
                U.setText(str);
            }
            if (c115564gC.LJLJI) {
                StickerUrlStruct iconUrl = t.LJLIL.getIconUrl();
                if (iconUrl != null) {
                    urlModel = iconUrl.getMidResolutionUrl();
                } else {
                    urlModel = null;
                }
                W5F LJII = W5U.LJII(C78939UyV.LJ(urlModel));
                int LIZIZ = C7MY.LIZIZ(64);
                int LIZIZ2 = C7MY.LIZIZ(64);
                LJII.LJII = LIZIZ;
                LJII.LJIIIIZZ = LIZIZ2;
                LJII.LIZIZ("StickerSetContentCell");
                if (HK5.LIZIZ) {
                    C43659HBn.LJIILIIL(LJII, EnumC61782be.STORE_STICKER);
                }
                LJII.LJJIIJ = T();
                C43659HBn.LJIJ(LJII, "sticker_store_sticker_set_cover", false, null, 6);
            }
            if (c115564gC.LJLJJI) {
                L(t);
            }
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
