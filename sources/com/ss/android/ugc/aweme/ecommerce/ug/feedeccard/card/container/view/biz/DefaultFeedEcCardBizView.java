package com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.card.container.view.biz;

import X.AbstractC71088RvA;
import X.ActivityC45651qj;
import X.C141335gf;
import X.C16880lQ;
import X.C184077Kh;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C214298b3;
import X.C214528bQ;
import X.C223338pd;
import X.C25600zU;
import X.C26059AKp;
import X.C32151Nz;
import X.C33Q;
import X.C3C5;
import X.C3C8;
import X.C45804HyK;
import X.C56412MCa;
import X.C65352Pkq;
import X.C65776Prg;
import X.C71066Ruo;
import X.C71067Rup;
import X.C71074Ruw;
import X.C71076Ruy;
import X.C71087Rv9;
import X.C76800UCe;
import X.C78926UyI;
import X.C78983UzD;
import X.C8YZ;
import X.C9BD;
import X.C9BE;
import X.EnumC72807Shn;
import X.ExecutorC142245i8;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC60061Nhh;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.KL0;
import X.KPL;
import X.O6R;
import X.OLQ;
import X.OSK;
import X.OSL;
import X.OSM;
import X.SY4;
import X.TBW;
import X.W5F;
import X.W5U;
import X.XKS;
import Y.ARunnableS48S0100000_12;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.bean.FeedEcCardConfig;
import com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.bean.FeedEcCardData;
import com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.bean.FeedEcCardStyle;
import com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.card.container.view.biz.vm.DefaultFeedEcCardBizVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.utils.Au2S5S0400000_12;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public final class DefaultFeedEcCardBizView extends AbstractC71088RvA implements KPL, LifecycleEventObserver, InterfaceC60061Nhh {
    public final C214298b3 LJLJI;
    public C71076Ruy LJLJJI;
    public XKS LJLJJL;
    public volatile boolean LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;

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

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        Lifecycle lifecycle = this.LJLILLLLZI.getLifecycle();
        o.LJIIIIZZ(lifecycle, "fragment.lifecycle");
        return lifecycle;
    }

    public final void LIZLLL(boolean z) {
        if (z) {
            C223338pd c223338pd = (C223338pd) this.LJLIL.findViewById(R.id.nau);
            if (!c223338pd.LJLJLJ) {
                c223338pd.setVisibility(0);
                c223338pd.LIZIZ();
                this.LJLIL.findViewById(R.id.j9j).setVisibility(8);
                return;
            }
            return;
        }
        C223338pd c223338pd2 = (C223338pd) this.LJLIL.findViewById(R.id.nau);
        if (!c223338pd2.LJLJLJ) {
            return;
        }
        this.LJLIL.findViewById(R.id.j9j).setVisibility(0);
        c223338pd2.LIZJ();
        c223338pd2.setVisibility(8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultFeedEcCardBizView(ViewGroup shellViewGroup, Fragment fragment) {
        super(shellViewGroup, fragment);
        C214298b3 c214298b3;
        o.LJIIIZ(shellViewGroup, "shellViewGroup");
        o.LJIIIZ(fragment, "fragment");
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(DefaultFeedEcCardBizVM.class);
        AqS162S0100000_12 aqS162S0100000_12 = new AqS162S0100000_12(LIZ, 543);
        C71087Rv9 c71087Rv9 = C71087Rv9.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(aqS162S0100000_12, C214528bQ.LJLIL, C78926UyI.LJJII(fragment, true), C78926UyI.LJJIIJZLJL(fragment, true), C184077Kh.LJLIL, C78926UyI.LJJ(fragment, true), C78926UyI.LJIILLIIL(fragment, true), c71087Rv9, LIZ);
        } else if (c9be == null || o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(aqS162S0100000_12, C214528bQ.LJLIL, C78926UyI.LJJII(fragment, false), C78926UyI.LJJIIJZLJL(fragment, false), C184077Kh.LJLIL, C78926UyI.LJJ(fragment, false), C78926UyI.LJIILLIIL(fragment, false), c71087Rv9, LIZ);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLJI = c214298b3;
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(new C25600zU(shellViewGroup.getContext(), R.style.vt)), R.layout.aph, shellViewGroup, true);
    }

    public final void LIZIZ(Aweme aweme, FeedEcCardData feedEcCardData) {
        boolean z;
        int i;
        int i2;
        o.LJIIIZ(aweme, "aweme");
        FeedEcCardConfig cardConfig = feedEcCardData.getCardConfig();
        FeedEcCardStyle cardStyle = feedEcCardData.getCardStyle();
        boolean z2 = false;
        int i3 = 0;
        z2 = false;
        DefaultFeedEcCardBizView defaultFeedEcCardBizView = this;
        if (cardConfig != null && cardStyle != null) {
            Long cardContentCountdownSeconds = cardStyle.getCardContentCountdownSeconds();
            if (cardContentCountdownSeconds != null && cardContentCountdownSeconds.longValue() > 0) {
                z = true;
            } else {
                z = false;
            }
            OLQ.LJ(defaultFeedEcCardBizView.LJLIL, cardStyle.getCardBgStartColor(), cardStyle.getCardBgCenterColor(), cardStyle.getCardBgEndColor(), "#FFFF7B69", null, 0, 48);
            OLQ.LIZIZ(defaultFeedEcCardBizView.LJLIL, cardStyle.getCardBgImg());
            TuxTextView tuxTextView = (TuxTextView) defaultFeedEcCardBizView.LJLIL.findViewById(R.id.m1r);
            tuxTextView.setText(cardStyle.getCardTitleText());
            OLQ.LJFF(tuxTextView, cardStyle.getCardTitleTextColor(), Integer.valueOf(R.attr.dj));
            Float cardTitleTextSize = cardStyle.getCardTitleTextSize();
            if (cardTitleTextSize == null || cardTitleTextSize.floatValue() <= 0.0f) {
                cardTitleTextSize = Float.valueOf(24.0f);
            }
            float floatValue = cardTitleTextSize.floatValue();
            if (floatValue < 17.0f) {
                floatValue = 17.0f;
            }
            tuxTextView.LJJJ(floatValue);
            tuxTextView.setMinTextSize(17.0f);
            TuxTextView tuxTextView2 = (TuxTextView) defaultFeedEcCardBizView.LJLIL.findViewById(R.id.m1q);
            tuxTextView2.setText(cardStyle.getCardSubtitleText());
            OLQ.LJFF(tuxTextView2, cardStyle.getCardSubtitleTextColor(), Integer.valueOf(R.attr.dj));
            View findViewById = defaultFeedEcCardBizView.LJLIL.findViewById(R.id.k88);
            if (z) {
                i = 38;
            } else {
                i = 10;
            }
            C45804HyK.LJJLIIIJ(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(i))), findViewById);
            SmartImageView smartImageView = (SmartImageView) defaultFeedEcCardBizView.LJLIL.findViewById(R.id.ezu);
            smartImageView.setTranslationX(C32151Nz.LJIIZILJ(6));
            Image cardBgPendantImg = cardStyle.getCardBgPendantImg();
            EnumC72807Shn scaleType = EnumC72807Shn.FIT_CENTER;
            o.LJIIIZ(scaleType, "scaleType");
            if (cardBgPendantImg != null) {
                W5F LJIIIZ = W5U.LJIIIZ(cardBgPendantImg.toImageUrlModel());
                Integer width = cardBgPendantImg.getWidth();
                if (width != null) {
                    i2 = width.intValue();
                } else {
                    i2 = 0;
                }
                Integer height = cardBgPendantImg.getHeight();
                if (height != null) {
                    i3 = height.intValue();
                }
                if (i2 > 0 && i3 > 0) {
                    LJIIIZ.LJIIIZ = i2;
                    LJIIIZ.LJIIJ = i3;
                }
                LJIIIZ.LJIJJ = scaleType;
                LJIIIZ.LJJI = KL0.HIGH;
                LJIIIZ.LIZIZ("feed_ec_card");
                LJIIIZ.LJJIIJ = smartImageView;
                C16880lQ.LLJJJ(LJIIIZ);
            }
            SY4 sy4 = (SY4) defaultFeedEcCardBizView.LJLIL.findViewById(R.id.axj);
            sy4.setText(cardStyle.getCardBtnNoInterestText());
            OLQ.LJFF(sy4, cardStyle.getCardBtnNoInterestTextColor(), Integer.valueOf(R.attr.d4));
            OLQ.LIZLLL(sy4, cardStyle.getCardBtnNoInterestBgColor(), null, Integer.valueOf(R.attr.dm), 8, 102);
            C16880lQ.LJIIJ(new Au2S5S0400000_12(aweme, cardConfig, cardStyle, defaultFeedEcCardBizView, 6), sy4);
            SY4 sy42 = (SY4) defaultFeedEcCardBizView.LJLIL.findViewById(R.id.ayz);
            sy42.setText(cardStyle.getCardBtnSeeMoreText());
            OLQ.LJFF(sy42, cardStyle.getCardBtnSeeMoreTextColor(), Integer.valueOf(R.attr.eb));
            OLQ.LIZLLL(sy42, cardStyle.getCardBtnSeeMoreBgColor(), null, Integer.valueOf(R.attr.dk), 8, 102);
            defaultFeedEcCardBizView = defaultFeedEcCardBizView;
            C16880lQ.LJIIJ(new C71067Rup(sy42, cardStyle, aweme, cardConfig, defaultFeedEcCardBizView), sy42);
            TuxIconView tuxIconView = (TuxIconView) defaultFeedEcCardBizView.LJLIL.findViewById(R.id.faw);
            o.LJIIIIZZ(tuxIconView, "shellViewGroup.iv_swipe_up");
            Integer LIZ = OLQ.LIZ(cardStyle.getCardSwipeUpColor(), null, tuxIconView.getContext(), Integer.valueOf(R.attr.d7));
            if (LIZ != null) {
                tuxIconView.setTintColor(LIZ.intValue());
            }
            TuxTextView tuxTextView3 = (TuxTextView) defaultFeedEcCardBizView.LJLIL.findViewById(R.id.mm_);
            tuxTextView3.setText(cardStyle.getCardSwipeUpText());
            OLQ.LJFF(tuxTextView3, cardStyle.getCardSwipeUpColor(), Integer.valueOf(R.attr.d7));
            ViewGroup viewGroup = (ViewGroup) defaultFeedEcCardBizView.LJLIL.findViewById(R.id.fh9);
            o.LJIIIIZZ(viewGroup, "this");
            OLQ.LJ(viewGroup, cardStyle.getCardContentBgStartColor(), null, cardStyle.getCardContentBgEndColor(), null, Integer.valueOf(R.attr.dm), 16, 10);
            OLQ.LIZIZ(viewGroup, cardStyle.getCardContentBgImg());
            C71076Ruy LIZ2 = C71074Ruw.LIZ(aweme);
            defaultFeedEcCardBizView.LJLJJI = LIZ2;
            defaultFeedEcCardBizView.LIZ(aweme, feedEcCardData, cardConfig, cardStyle, LIZ2, LIZ2.LIZLLL, true);
            z2 = true;
        }
        defaultFeedEcCardBizView.LJLJJLL = z2;
    }

    @Override // X.InterfaceC60061Nhh
    public final void onEvent(String eventName, String str) {
        Aweme aweme;
        FeedEcCardConfig feedEcCardConfig;
        FeedEcCardData feedEcCardData;
        FeedEcCardData feedEcCardData2;
        o.LJIIIZ(eventName, "eventName");
        if (o.LJ(eventName, "ec_sku_panel_close")) {
            C71066Ruo.LIZJ = false;
            try {
                if (new JSONObject(str).optInt("close_from", 0) == 1) {
                    C71076Ruy c71076Ruy = this.LJLJJI;
                    FeedEcCardStyle feedEcCardStyle = null;
                    if (c71076Ruy != null) {
                        aweme = c71076Ruy.LIZ.get();
                    } else {
                        aweme = null;
                    }
                    C71076Ruy c71076Ruy2 = this.LJLJJI;
                    if (c71076Ruy2 != null && (feedEcCardData2 = c71076Ruy2.LIZJ) != null) {
                        feedEcCardConfig = feedEcCardData2.getCardConfig();
                    } else {
                        feedEcCardConfig = null;
                    }
                    C71076Ruy c71076Ruy3 = this.LJLJJI;
                    if (c71076Ruy3 != null && (feedEcCardData = c71076Ruy3.LIZJ) != null) {
                        feedEcCardStyle = feedEcCardData.getCardStyle();
                    }
                    C71066Ruo.LIZIZ(true, c71076Ruy, aweme, feedEcCardConfig, feedEcCardStyle, "click", null, "buy_button", 64);
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        o.LJIIIZ(source, "source");
        o.LJIIIZ(event, "event");
        if (C71066Ruo.LIZJ && event == Lifecycle.Event.ON_STOP) {
            try {
                ExecutorC142245i8.LJLILLLLZI.execute(new ARunnableS48S0100000_12(this, 34));
            } catch (Throwable unused) {
            }
        }
    }

    public final void LIZJ(boolean z, Aweme aweme, FeedEcCardData feedEcCardData) {
        FeedEcCardConfig feedEcCardConfig;
        FeedEcCardStyle feedEcCardStyle;
        ActivityC45651qj LJJIFFI;
        Lifecycle lifecycle;
        if (!this.LJLJJLL) {
            return;
        }
        this.LJLJLJ = false;
        try {
            ActivityC45651qj mo49getActivity = this.LJLILLLLZI.mo49getActivity();
            if (mo49getActivity != null && (LJJIFFI = C45804HyK.LJJIFFI(mo49getActivity)) != null && (lifecycle = LJJIFFI.getLifecycle()) != null) {
                lifecycle.removeObserver(this);
            }
            C26059AKp.LIZ().LIZIZ("ec_sku_panel_close", this);
            C3C5.m7constructorimpl(Boolean.TRUE);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        boolean z2 = this.LJLJL;
        C71076Ruy c71076Ruy = this.LJLJJI;
        if (feedEcCardData != null) {
            feedEcCardConfig = feedEcCardData.getCardConfig();
            feedEcCardStyle = feedEcCardData.getCardStyle();
        } else {
            feedEcCardConfig = null;
            feedEcCardStyle = null;
        }
        C71066Ruo.LIZIZ(z2, c71076Ruy, aweme, feedEcCardConfig, feedEcCardStyle, "draw", Boolean.valueOf(z), null, 128);
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

    /* JADX WARN: Removed duplicated region for block: B:42:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.ss.android.ugc.aweme.feed.model.Aweme r26, com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.bean.FeedEcCardData r27, com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.bean.FeedEcCardConfig r28, com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.bean.FeedEcCardStyle r29, X.C71076Ruy r30, java.util.List<? extends java.lang.Object> r31, boolean r32) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.card.container.view.biz.DefaultFeedEcCardBizView.LIZ(com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.bean.FeedEcCardData, com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.bean.FeedEcCardConfig, com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.bean.FeedEcCardStyle, X.Ruy, java.util.List, boolean):void");
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
