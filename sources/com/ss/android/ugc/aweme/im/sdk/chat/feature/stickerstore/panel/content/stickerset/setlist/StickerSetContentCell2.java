package com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.stickerset.setlist;

import X.C115564gC;
import X.C115584gE;
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
import X.C32I;
import X.C33Q;
import X.C3C8;
import X.C40084FoG;
import X.C43659HBn;
import X.C47261Igj;
import X.C56412MCa;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72335SaB;
import X.C72336SaC;
import X.C72337SaD;
import X.C72338SaE;
import X.C72339SaF;
import X.C72412sn;
import X.C76800UCe;
import X.C78926UyI;
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
import X.EnumC115554gB;
import X.EnumC61782be;
import X.EnumC71912rz;
import X.EnumC73222u6;
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
import X.SY4;
import X.TBW;
import X.W5F;
import X.X1D;
import X.YE1;
import Y.ACListenerS21S0100000_1;
import Y.IDTListenerS111S0100000_1;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
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
import com.ss.android.ugc.aweme.emoji.stickerstore.model.IMStickerMeta;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.SetSticker;
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
public final class StickerSetContentCell2 extends PowerCell<C72412sn> implements KPL {
    public static final int LJZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(112));
    public static final int LJZI = C7MY.LIZIZ(96);
    public static final Interpolator LJZL;
    public final C214298b3 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final C62822Ol8 LJLL;
    public final C62822Ol8 LJLLI;
    public List<? extends SmartImageView> LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public boolean LJLLL;
    public final C62822Ol8 LJLLLL;
    public final C62822Ol8 LJLLLLLL;
    public final int LJLZ;

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
        LJZL = LIZIZ;
    }

    public final StickerSetContentViewModel N() {
        return (StickerSetContentViewModel) this.LJLIL.getValue();
    }

    public final TuxIconView P() {
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-deleteBtn>(...)");
        return (TuxIconView) value;
    }

    public final SY4 Q() {
        Object value = this.LJLJJLL.getValue();
        o.LJIIIIZZ(value, "<get-opBtn>(...)");
        return (SY4) value;
    }

    public final TuxIconView T() {
        Object value = this.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-reorderBtn>(...)");
        return (TuxIconView) value;
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

    public StickerSetContentCell2() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(StickerSetContentViewModel.class);
        AqS151S0100000_1 aqS151S0100000_1 = new AqS151S0100000_1((InterfaceC65350Pko) LIZ, 202);
        C115584gE c115584gE = C115584gE.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS151S0100000_1, C72335SaB.INSTANCE, new AqS151S0100000_1((InterfaceC93923mO) this, 205), new AqS162S0100000_12(this, 591), C72338SaE.INSTANCE, c115584gE, new AqS162S0100000_12(this, 592), 256);
        } else if (o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(LIZ, aqS151S0100000_1, C72336SaC.INSTANCE, new AqS151S0100000_1((InterfaceC93923mO) this, 207), new AqS151S0100000_1((InterfaceC93923mO) this, 218), C72339SaF.INSTANCE, c115584gE, new AqS162S0100000_12(this, 593), 256);
        } else if (c9be == null || o.LJ(c9be, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS151S0100000_1, C72337SaD.INSTANCE, new AqS151S0100000_1((InterfaceC93923mO) this, 219), new AqS151S0100000_1((InterfaceC93923mO) this, 220), new AqS151S0100000_1((InterfaceC93923mO) this, 201), c115584gE, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(YE1.LIZJ("Don't support this VMScope: ", c9be, " there"));
        }
        this.LJLIL = c214298b3;
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 204));
        this.LJLJI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 215));
        this.LJLJJI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 217));
        this.LJLJJL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 216));
        this.LJLJJLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 208));
        this.LJLJL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 210));
        this.LJLJLJ = C221108m2.LIZIZ(new AqS151S0100000_1(this, 211));
        this.LJLJLLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 212));
        this.LJLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 213));
        this.LJLLI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 214));
        this.LJLLJ = C221108m2.LIZIZ(new AqS151S0100000_1(this, 209));
        this.LJLLLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 203));
        this.LJLLLLLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 206));
        this.LJLZ = C90193gN.LIZ() ? -1 : 1;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        Fragment fragment;
        U().setTextDirection(5);
        V().setTextDirection(5);
        LifecycleOwner currentLifecycleOwner = getCurrentLifecycleOwner();
        if ((currentLifecycleOwner instanceof Fragment) && (fragment = (Fragment) currentLifecycleOwner) != null) {
            N().hierarchyDataStore = (C7C3) C78926UyI.LJJ(fragment, false).invoke();
            if (C76800UCe.LIZ == null) {
                return;
            }
            C16880lQ.LJIIJ(new ACListenerS21S0100000_1(this, 55), this.itemView);
            if (C99W.LIZ) {
                Q();
            }
            C16880lQ.LJJIZ(Q(), new ACListenerS21S0100000_1(this, 56));
            C16880lQ.LJJJ(P(), new ACListenerS21S0100000_1(this, 57));
            T().setOnTouchListener(new IDTListenerS111S0100000_1(this, 2));
            Fragment LJIL = C86793Y4n.LJIL(getCurrentLifeCycleOwner());
            StickerSetContentViewModel N = N();
            AqS167S0100000_1 aqS167S0100000_1 = new AqS167S0100000_1(this, 90);
            N.getClass();
            AssemViewModel.selectSubscribe$default(N, C88443dY.LJLIL, null, LJIL, null, aqS167S0100000_1, 10, null);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC227608wW
    public final void onPause() {
        super.onPause();
        List<? extends SmartImageView> list = this.LJLLILLLL;
        if (list != null) {
            Iterator<? extends SmartImageView> it = list.iterator();
            while (it.hasNext()) {
                it.next().LJFF();
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void unBind() {
        Q().setLoading(false);
        this.LJLLL = false;
    }

    public final void L(C72412sn c72412sn) {
        C88033ct pv0;
        String string;
        SY4 Q = Q();
        Integer setStatus = c72412sn.LJLIL.getSetStatus();
        int status = EnumC71912rz.LOADING.getStatus();
        if (setStatus == null || setStatus.intValue() != status) {
            int status2 = EnumC71912rz.ADDED.getStatus();
            if (setStatus == null || setStatus.intValue() != status2) {
                Q.setButtonVariant(0);
                Q.setLoading(false);
                Q.setText(Q.getContext().getString(R.string.ro6));
                return;
            }
            if (C99W.LIZ) {
                Q.setButtonVariant(5);
            } else {
                Q.setButtonVariant(1);
            }
            Q.setLoading(false);
            C88033ct pv02 = N().pv0();
            if ((pv02 != null && pv02.LJLILLLLZI == EnumC87003bE.PERSONAL_PROFILE_NOT_FROM_STICKER_STORE.getType()) || ((pv0 = N().pv0()) != null && pv0.LJLILLLLZI == EnumC87003bE.OTHERS_PROFILE_NOT_FROM_STICKER_STORE.getType())) {
                string = Q.getContext().getString(R.string.ro7);
            } else {
                string = Q.getContext().getString(R.string.ro_);
            }
            Q.setText(string);
            return;
        }
        Q.setButtonVariant(0);
        Q.setLoading(true);
    }

    public final void Y(EnumC115554gB enumC115554gB) {
        if (!this.LJLLL) {
            return;
        }
        int ordinal = enumC115554gB.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                return;
            }
            P().setTranslationX(0.0f);
            T().setTranslationX(0.0f);
            V().setTranslationX(C32151Nz.LJIIZILJ(42) * this.LJLZ);
            U().setTranslationX(C32151Nz.LJIIZILJ(42) * this.LJLZ);
            Q().setAlpha(0.0f);
            TuxTextView V = V();
            int i = LJZI;
            C26338AVi.LJI(V, null, null, Integer.valueOf(i), null, false, 27);
            C26338AVi.LJI(U(), null, null, Integer.valueOf(i), null, false, 27);
            Q().setVisibility(8);
            P().setVisibility(0);
            T().setVisibility(0);
            return;
        }
        P().setTranslationX(C32151Nz.LJIIZILJ(-42) * this.LJLZ);
        T().setTranslationX(C32151Nz.LJIIZILJ(56) * this.LJLZ);
        V().setTranslationX(0.0f);
        U().setTranslationX(0.0f);
        Q().setAlpha(1.0f);
        TuxTextView V2 = V();
        int i2 = LJZ;
        C26338AVi.LJI(V2, null, null, Integer.valueOf(i2), null, false, 27);
        C26338AVi.LJI(U(), null, null, Integer.valueOf(i2), null, false, 27);
        Q().setVisibility(0);
        P().setVisibility(8);
        T().setVisibility(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C72412sn c72412sn) {
        List<SetSticker> stickers;
        SetSticker setSticker;
        Integer size;
        C72412sn t = c72412sn;
        o.LJIIIZ(t, "t");
        this.LJLLL = true;
        TuxTextView V = V();
        String name = t.LJLIL.getName();
        if (name == null) {
            name = "";
        }
        V.setText(name);
        IMStickerMeta stickerMeta = t.LJLIL.getStickerMeta();
        int i = 0;
        if (stickerMeta != null && (size = stickerMeta.getSize()) != null) {
            int intValue = size.intValue();
            U().setText(this.itemView.getContext().getResources().getQuantityString(R.plurals.gi, intValue, Integer.valueOf(intValue)));
        }
        Object value = this.LJLJL.getValue();
        o.LJIIIIZZ(value, "<get-previewSticker0>(...)");
        Object value2 = this.LJLJLJ.getValue();
        o.LJIIIIZZ(value2, "<get-previewSticker1>(...)");
        Object value3 = this.LJLJLLL.getValue();
        o.LJIIIIZZ(value3, "<get-previewSticker2>(...)");
        Object value4 = this.LJLL.getValue();
        o.LJIIIIZZ(value4, "<get-previewSticker3>(...)");
        Object value5 = this.LJLLI.getValue();
        o.LJIIIIZZ(value5, "<get-previewSticker4>(...)");
        List<? extends SmartImageView> LJJIJIIJI = C47261Igj.LJJIJIIJI(value, value2, value3, value4, value5);
        this.LJLLILLLL = LJJIJIIJI;
        if (LJJIJIIJI != null) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(LJJIJIIJI, 10));
            for (SmartImageView smartImageView : LJJIJIIJI) {
                int i2 = i + 1;
                C76800UCe c76800UCe = null;
                if (i >= 0) {
                    SmartImageView smartImageView2 = smartImageView;
                    IMStickerMeta stickerMeta2 = t.LJLIL.getStickerMeta();
                    if (stickerMeta2 != null && (stickers = stickerMeta2.getStickers()) != null && (setSticker = (SetSticker) ORZ.LJLLLLLL(i, stickers)) != null) {
                        M(smartImageView2, setSticker);
                        c76800UCe = C76800UCe.LIZ;
                    }
                    arrayList.add(c76800UCe);
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
        L(t);
        if (!((AnimatorSet) this.LJLLLL.getValue()).isRunning() && !((AnimatorSet) this.LJLLLLLL.getValue()).isRunning()) {
            C212418Vh.LJIIJJI(N(), new AqS167S0100000_1(this, 210));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.b67, viewGroup, false, "from(parent.context)\n   …content_2, parent, false)");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC227608wW
    public final void onResume(boolean z) {
        super.onResume(z);
        List<? extends SmartImageView> list = this.LJLLILLLL;
        if (list != null) {
            for (SmartImageView smartImageView : list) {
                smartImageView.LJ();
                smartImageView.setAttached(true);
                smartImageView.setUserVisibleHint(true);
            }
        }
    }

    public static void M(SmartImageView smartImageView, SetSticker setSticker) {
        UrlModel lowResolutionUrl;
        StickerUrlStruct animateUrl;
        Integer stickerType = setSticker.getStickerType();
        int type = EnumC73222u6.STATIC.getType();
        if (stickerType == null || stickerType.intValue() != type) {
            int type2 = EnumC73222u6.ANIMATED.getType();
            if (stickerType != null && stickerType.intValue() == type2 && (animateUrl = setSticker.getAnimateUrl()) != null) {
                lowResolutionUrl = animateUrl.getLowResolutionUrl();
            }
            lowResolutionUrl = null;
        } else {
            StickerUrlStruct staticUrl = setSticker.getStaticUrl();
            if (staticUrl != null) {
                lowResolutionUrl = staticUrl.getLowResolutionUrl();
            }
            lowResolutionUrl = null;
        }
        W5F LIZLLL = C40084FoG.LIZLLL(lowResolutionUrl, "SetStickerCell2");
        LIZLLL.LIZLLL = true;
        if (HK5.LIZIZ) {
            C43659HBn.LJIILIIL(LIZLLL, EnumC61782be.STORE_STICKER);
        }
        LIZLLL.LJIJI = Bitmap.Config.ARGB_8888;
        LIZLLL.LJJIIJ = smartImageView;
        C43659HBn.LJIJ(LIZLLL, "sticker_set_content_preview", false, null, 6);
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C72412sn c72412sn, List payloads) {
        C76800UCe c76800UCe;
        List<SetSticker> stickers;
        SetSticker setSticker;
        Integer num;
        C72412sn t = c72412sn;
        o.LJIIIZ(t, "t");
        o.LJIIIZ(payloads, "payloads");
        this.LJLLL = true;
        int i = 0;
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
                if (t.LJLIL.getStickerMeta() != null) {
                    StringBuilder LIZ = X1D.LIZ();
                    IMStickerMeta stickerMeta = t.LJLIL.getStickerMeta();
                    if (stickerMeta != null) {
                        num = stickerMeta.getSize();
                    } else {
                        num = null;
                    }
                    LIZ.append(num);
                    LIZ.append(" stickers");
                    str = X1D.LIZIZ(LIZ);
                }
                U.setText(str);
            }
            if (c115564gC.LJLJJL) {
                Object value = this.LJLJL.getValue();
                o.LJIIIIZZ(value, "<get-previewSticker0>(...)");
                Object value2 = this.LJLJLJ.getValue();
                o.LJIIIIZZ(value2, "<get-previewSticker1>(...)");
                Object value3 = this.LJLJLLL.getValue();
                o.LJIIIIZZ(value3, "<get-previewSticker2>(...)");
                Object value4 = this.LJLL.getValue();
                o.LJIIIIZZ(value4, "<get-previewSticker3>(...)");
                Object value5 = this.LJLLI.getValue();
                o.LJIIIIZZ(value5, "<get-previewSticker4>(...)");
                List LJJIJIIJI = C47261Igj.LJJIJIIJI(value, value2, value3, value4, value5);
                ArrayList arrayList = new ArrayList(C32I.LJJL(LJJIJIIJI, 10));
                for (Object obj : LJJIJIIJI) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        SmartImageView smartImageView = (SmartImageView) obj;
                        IMStickerMeta stickerMeta2 = t.LJLIL.getStickerMeta();
                        if (stickerMeta2 != null && (stickers = stickerMeta2.getStickers()) != null && (setSticker = (SetSticker) ORZ.LJLLLLLL(i, stickers)) != null) {
                            M(smartImageView, setSticker);
                            c76800UCe = C76800UCe.LIZ;
                        } else {
                            c76800UCe = null;
                        }
                        arrayList.add(c76800UCe);
                        i = i2;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
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
