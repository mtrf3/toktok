package com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.videosticker.stickerlist;

import X.C018905p;
import X.C16880lQ;
import X.C17N;
import X.C1DI;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C214298b3;
import X.C221108m2;
import X.C252659vp;
import X.C2NU;
import X.C31811Ce7;
import X.C33Q;
import X.C34B;
import X.C3C8;
import X.C43659HBn;
import X.C49606JdS;
import X.C4AS;
import X.C56412MCa;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72340SaG;
import X.C72341SaH;
import X.C72342SaI;
import X.C72343SaJ;
import X.C72344SaK;
import X.C76800UCe;
import X.C78926UyI;
import X.C78939UyV;
import X.C7C3;
import X.C87083bM;
import X.C87123bQ;
import X.C87183bW;
import X.C88033ct;
import X.C88963eO;
import X.C8YZ;
import X.C93893mL;
import X.C9BD;
import X.C9BE;
import X.C9XN;
import X.EnumC111394Yt;
import X.EnumC61782be;
import X.EnumC73222u6;
import X.EnumC87003bE;
import X.EnumC87173bV;
import X.EnumC87323bk;
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
import X.ORZ;
import X.OSK;
import X.OSL;
import X.OSM;
import X.TBW;
import X.W5F;
import X.W5U;
import X.X1D;
import X.YE1;
import Y.ACListenerS21S0100000_1;
import Y.ACListenerS36S0200000_1;
import Y.IDCListenerS294S0100000_1;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.StickerUrlStruct;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.VideoSticker;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.videosticker.fragment.VideoStickerContentFragment;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.videosticker.viewmodel.VideoStickerContentViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS12S2100000_1;
import kotlin.jvm.internal.AqS132S0200000_1;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS55S1100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class VideoStickerContentCell extends PowerCell<C87123bQ> implements KPL {
    public final C214298b3 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public int LJLJL;
    public boolean LJLJLJ;
    public VideoSticker LJLJLLL;

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

    public final VideoStickerContentViewModel Q() {
        return (VideoStickerContentViewModel) this.LJLIL.getValue();
    }

    public final int T() {
        return ((Number) this.LJLJJLL.getValue()).intValue();
    }

    public final TuxIconView U() {
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-favIcon>(...)");
        return (TuxIconView) value;
    }

    public final TuxIconView V() {
        Object value = this.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-notVisibleIcon>(...)");
        return (TuxIconView) value;
    }

    public final SmartImageView a0() {
        Object value = this.LJLJJI.getValue();
        o.LJIIIIZZ(value, "<get-videoStickerView>(...)");
        return (SmartImageView) value;
    }

    public VideoStickerContentCell() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(VideoStickerContentViewModel.class);
        AqS151S0100000_1 aqS151S0100000_1 = new AqS151S0100000_1((InterfaceC65350Pko) LIZ, 233);
        C93893mL c93893mL = C93893mL.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS151S0100000_1, C72343SaJ.INSTANCE, new AqS151S0100000_1((InterfaceC93923mO) this, 234), new AqS162S0100000_12(this, 595), C72341SaH.INSTANCE, c93893mL, new AqS162S0100000_12(this, 596), 256);
        } else if (o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(LIZ, aqS151S0100000_1, C72344SaK.INSTANCE, new AqS151S0100000_1((InterfaceC93923mO) this, 235), new AqS151S0100000_1((InterfaceC93923mO) this, 229), C72340SaG.INSTANCE, c93893mL, new AqS162S0100000_12(this, 594), 256);
        } else if (c9be == null || o.LJ(c9be, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS151S0100000_1, C72342SaI.INSTANCE, new AqS151S0100000_1((InterfaceC93923mO) this, 230), new AqS151S0100000_1((InterfaceC93923mO) this, 231), new AqS151S0100000_1((InterfaceC93923mO) this, 232), c93893mL, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(YE1.LIZJ("Don't support this VMScope: ", c9be, " there"));
        }
        this.LJLIL = c214298b3;
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 227));
        this.LJLJI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 228));
        this.LJLJJI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 225));
        this.LJLJJL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 224));
        this.LJLJJLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 226));
        this.LJLJL = -1;
    }

    public final boolean N() {
        C88033ct lv0 = Q().lv0();
        if (lv0 != null && lv0.LJLILLLLZI == EnumC87003bE.STICKER_STORE.getType()) {
            return true;
        }
        return false;
    }

    public final boolean P() {
        Fragment fragment;
        LifecycleOwner currentLifecycleOwner = getCurrentLifecycleOwner();
        if (currentLifecycleOwner instanceof Fragment) {
            fragment = (Fragment) currentLifecycleOwner;
        } else {
            fragment = null;
        }
        if (fragment == null) {
            return false;
        }
        if (C2NU.LIZ.LIZJ == EnumC111394Yt.NOT_AVAILABLE) {
            C31811Ce7.LIZJ(fragment, R.string.dtf);
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        Fragment fragment;
        LifecycleOwner currentLifecycleOwner = getCurrentLifecycleOwner();
        if ((currentLifecycleOwner instanceof Fragment) && (fragment = (Fragment) currentLifecycleOwner) != null) {
            Q().hierarchyDataStore = (C7C3) C78926UyI.LJJ(fragment, false).invoke();
            if (C76800UCe.LIZ == null) {
                return;
            }
            C16880lQ.LJJIJLIJ(a0(), new ACListenerS36S0200000_1(fragment, this, 2));
            a0().setOnLongClickListener(new IDCListenerS294S0100000_1(this, 0));
            Object value = this.LJLJJL.getValue();
            o.LJIIIIZZ(value, "<get-videoStickerHotArea>(...)");
            C16880lQ.LJIL((ConstraintLayout) value, new ACListenerS36S0200000_1(fragment, this, 3));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC227608wW
    public final void onPause() {
        super.onPause();
        if (C88963eO.LJFF()) {
            a0().LJFF();
        }
    }

    public final void L(Integer num) {
        EnumC87173bV enumC87173bV = EnumC87173bV.FAVORITE;
        int status = enumC87173bV.getStatus();
        VideoSticker videoSticker = null;
        if (num == null || num.intValue() != status) {
            EnumC87173bV enumC87173bV2 = EnumC87173bV.NOT_FAVORITE;
            int status2 = enumC87173bV2.getStatus();
            if (num == null || num.intValue() != status2) {
                C17N.LJJIIJZLJL(U());
                return;
            }
            C17N.LJJLIIIJJI(U());
            TuxIconView U = U();
            U.setIconRes(R.raw.icon_star);
            U.setTintColorRes(R.attr.dm);
            U.LIZIZ(true);
            VideoSticker videoSticker2 = this.LJLJLLL;
            if (videoSticker2 != null) {
                videoSticker = VideoSticker.copy$default(videoSticker2, null, null, null, null, null, null, null, null, null, Integer.valueOf(enumC87173bV2.getStatus()), null, null, null, null, 15871, null);
            }
            this.LJLJLLL = videoSticker;
            return;
        }
        C17N.LJJLIIIJJI(U());
        TuxIconView U2 = U();
        U2.setIconRes(R.raw.icon_star_fill);
        U2.setTintColorRes(R.attr.dj);
        U2.LIZIZ(true);
        VideoSticker videoSticker3 = this.LJLJLLL;
        if (videoSticker3 != null) {
            videoSticker = VideoSticker.copy$default(videoSticker3, null, null, null, null, null, null, null, null, null, Integer.valueOf(enumC87173bV.getStatus()), null, null, null, null, 15871, null);
        }
        this.LJLJLLL = videoSticker;
    }

    public final void M(Integer num) {
        int status = EnumC87323bk.HIDDEN.getStatus();
        if (num == null || num.intValue() != status) {
            C17N.LJJIIJZLJL(V());
        } else {
            C17N.LJJLIIIJJI(V());
            V().setIconRes(R.raw.icon_eye_slash);
        }
    }

    public final C252659vp Y(String str) {
        C252659vp LIZIZ = C49606JdS.LIZIZ(R.raw.icon_paperplane, R.string.h1h);
        LIZIZ.LJ = new ACListenerS21S0100000_1(new AqS55S1100000_1(this, str, 1), (InterfaceC88472Yns<? super View, C76800UCe>) 27);
        return LIZIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x012d, code lost:
    
        if (r12.intValue() != r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f0(java.lang.Integer r12) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.videosticker.stickerlist.VideoStickerContentCell.f0(java.lang.Integer):void");
    }

    public final void g0(VideoSticker videoSticker) {
        List<Fragment> LJJJJLI;
        Fragment fragment;
        Fragment parentFragment;
        FragmentManager fragmentManager = null;
        try {
            LifecycleOwner currentLifecycleOwner = getCurrentLifecycleOwner();
            if ((currentLifecycleOwner instanceof Fragment) && (fragment = (Fragment) currentLifecycleOwner) != null && (parentFragment = fragment.getParentFragment()) != null) {
                fragmentManager = parentFragment.getChildFragmentManager();
            }
        } catch (Exception e) {
            C34B.LJ("VideoStickerContentCell", e);
        }
        C87083bM.LIZIZ(videoSticker);
        if (fragmentManager != null && (LJJJJLI = fragmentManager.LJJJJLI()) != null) {
            for (Fragment fragment2 : LJJJJLI) {
                if (videoSticker != null && videoSticker.getVideoStickerId() != null && (fragment2 instanceof VideoStickerContentFragment)) {
                    VideoStickerContentViewModel videoStickerContentViewModel = (VideoStickerContentViewModel) ((VideoStickerContentFragment) fragment2).LJLJJI.getValue();
                    o.LJIIIZ(videoSticker, "videoSticker");
                    videoStickerContentViewModel.withState(new AqS132S0200000_1(videoSticker, videoStickerContentViewModel, 73));
                }
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C87123bQ c87123bQ) {
        UrlModel midResolutionUrl;
        String str;
        int T;
        int T2;
        C018905p c018905p;
        String str2;
        C87123bQ t = c87123bQ;
        o.LJIIIZ(t, "t");
        this.LJLJLJ = false;
        VideoSticker videoSticker = t.LJLIL;
        this.LJLJLLL = videoSticker;
        Integer stickerType = videoSticker.getStickerType();
        int type = EnumC73222u6.VIDEO_STICKER_ANIMATED.getType();
        Integer num = null;
        if (stickerType == null || stickerType.intValue() != type) {
            StickerUrlStruct staticUrl = t.LJLIL.getStaticUrl();
            if (staticUrl != null) {
                midResolutionUrl = staticUrl.getMidResolutionUrl();
            }
            midResolutionUrl = null;
        } else {
            StickerUrlStruct animateUrl = t.LJLIL.getAnimateUrl();
            if (animateUrl != null) {
                midResolutionUrl = animateUrl.getMidResolutionUrl();
            }
            midResolutionUrl = null;
        }
        if (N()) {
            str = "sticker_store_panel_video_sticker";
        } else {
            str = "sticker_store_profile_video_sticker";
        }
        if (midResolutionUrl != null) {
            T = midResolutionUrl.getWidth();
        } else {
            T = T();
        }
        float f = T;
        if (midResolutionUrl != null) {
            T2 = midResolutionUrl.getHeight();
        } else {
            T2 = T();
        }
        float f2 = T2;
        if (f != 0.0f) {
            float f3 = f2 / f;
            ViewGroup.LayoutParams layoutParams = a0().getLayoutParams();
            if (layoutParams instanceof C018905p) {
                c018905p = (C018905p) layoutParams;
                if (c018905p != null) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("H, 1:");
                    LIZ.append(f3);
                    c018905p.dimensionRatio = X1D.LIZIZ(LIZ);
                    ((ViewGroup.MarginLayoutParams) c018905p).width = T();
                }
            } else {
                c018905p = null;
            }
            this.LJLJL = (int) (T() * f3);
            a0().setLayoutParams(c018905p);
            SmartImageView a0 = a0();
            Context context = getContext();
            if (context != null) {
                str2 = context.getString(R.string.rnc);
            } else {
                str2 = null;
            }
            a0.setContentDescription(str2);
        }
        if (HK5.LIZIZ) {
            W5F LJII = W5U.LJII(C78939UyV.LJ(midResolutionUrl));
            LJII.LJJIIJ = a0();
            int i = this.LJLJL;
            LJII.LJII = i;
            LJII.LJIIIIZZ = i;
            LJII.LIZLLL = true;
            C43659HBn.LJIILIIL(LJII, EnumC61782be.STORE_STICKER);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(str);
            LIZ2.append("_opt");
            C43659HBn.LJIJ(LJII, X1D.LIZIZ(LIZ2), false, null, 6);
        } else {
            C4AS.LIZIZ(a0(), midResolutionUrl, str, T(), this.LJLJL, 0, 0, null, 480);
        }
        C88033ct lv0 = Q().lv0();
        if (lv0 != null) {
            num = Integer.valueOf(lv0.LJLILLLLZI);
        }
        int type2 = EnumC87003bE.STICKER_STORE.getType();
        if (num == null || num.intValue() != type2) {
            int type3 = EnumC87003bE.OTHERS_PROFILE_FROM_STICKER_STORE.getType();
            if (num == null || num.intValue() != type3) {
                int type4 = EnumC87003bE.OTHERS_PROFILE_NOT_FROM_STICKER_STORE.getType();
                if (num == null || num.intValue() != type4) {
                    int type5 = EnumC87003bE.PERSONAL_PROFILE_FROM_STICKER_STORE.getType();
                    if (num == null || num.intValue() != type5) {
                        int type6 = EnumC87003bE.PERSONAL_PROFILE_NOT_FROM_STICKER_STORE.getType();
                        if (num == null || num.intValue() != type6) {
                            return;
                        }
                    }
                    C17N.LJJIIJZLJL(U());
                    M(t.LJLIL.getStatus());
                    return;
                }
            }
            L(t.LJLIL.getHaveFavorite());
            C17N.LJJIIJZLJL(V());
            return;
        }
        L(t.LJLIL.getHaveFavorite());
        C17N.LJJIIJZLJL(V());
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.b6k, viewGroup, false, "from(parent.context)\n   …r_content, parent, false)");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC227608wW
    public final void onResume(boolean z) {
        super.onResume(z);
        if (C88963eO.LJFF()) {
            a0().setAttached(true);
            a0().setUserVisibleHint(true);
            a0().LJ();
        }
    }

    public final C252659vp X(String str, String str2) {
        C252659vp LIZIZ = C49606JdS.LIZIZ(R.raw.icon_flag, R.string.rok);
        LIZIZ.LJ = new ACListenerS21S0100000_1(new AqS12S2100000_1(this, str, str2, 0), (InterfaceC88472Yns<? super View, C76800UCe>) 27);
        return LIZIZ;
    }

    public final C252659vp c0(String str, String str2) {
        C252659vp LIZIZ = C49606JdS.LIZIZ(R.raw.icon_play_circle, R.string.roj);
        LIZIZ.LJ = new ACListenerS21S0100000_1(new AqS12S2100000_1(this, str, str2, 1), (InterfaceC88472Yns<? super View, C76800UCe>) 27);
        return LIZIZ;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C87123bQ c87123bQ, List payloads) {
        C87123bQ t = c87123bQ;
        o.LJIIIZ(t, "t");
        o.LJIIIZ(payloads, "payloads");
        super.onBindItemView(t, payloads);
        this.LJLJLJ = false;
        Object LJLLLLLL = ORZ.LJLLLLLL(0, payloads);
        if ((LJLLLLLL instanceof C87183bW) && ((C87183bW) LJLLLLLL).LIZ) {
            L(t.LJLIL.getHaveFavorite());
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
