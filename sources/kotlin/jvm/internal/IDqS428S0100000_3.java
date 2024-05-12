package kotlin.jvm.internal;

import X.AbstractC177926ya;
import X.AbstractC65781Prl;
import X.AnonymousClass833;
import X.C0JU;
import X.C16880lQ;
import X.C174366sq;
import X.C177336xd;
import X.C177876yV;
import X.C177886yW;
import X.C177896yX;
import X.C177906yY;
import X.C177916yZ;
import X.C178166yy;
import X.C188727au;
import X.C193187i6;
import X.C198807rA;
import X.C198847rE;
import X.C200647u8;
import X.C2050482y;
import X.C212418Vh;
import X.C228108xK;
import X.C228428xq;
import X.C32151Nz;
import X.C32I;
import X.C33Q;
import X.C43001GuD;
import X.C43I;
import X.C47135Ieh;
import X.C53258KvG;
import X.C55096Ljo;
import X.C55247LmF;
import X.C61325O4z;
import X.C71Y;
import X.C72808Sho;
import X.C76800UCe;
import X.C78685UuP;
import X.C7EP;
import X.C7F7;
import X.C7F8;
import X.C7F9;
import X.C7MY;
import X.C88463da;
import X.C8VV;
import X.C8YE;
import X.EnumC1796673i;
import X.EnumC84576XHg;
import X.FMX;
import X.InterfaceC55251LmJ;
import X.InterfaceC57784Mm4;
import X.InterfaceC88473Ynt;
import X.KL2;
import X.O6R;
import X.S1E;
import X.S1T;
import X.S1U;
import X.SY4;
import X.SYL;
import X.X1D;
import Y.ACListenerS1S2300000_3;
import Y.ACListenerS23S0100000_3;
import Y.ACListenerS38S0200000_3;
import Y.ARunnableS14S0300000_3;
import Y.ARunnableS39S0100000_3;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.CommentKeyboardMultiPanelAssem;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.CommentMentionAssem;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardV2Ability;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IRefactorKeyboardFragment;
import com.ss.android.ugc.aweme.explore.ui.ExploreFeedCell;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionListFragmentForMineProfile;
import com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionListViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.sdk.common.ui.titlebar.TitleBarLeftAssem;
import com.ss.android.ugc.aweme.mix.mixdetail.MixFeedManagerFragment;
import com.ss.android.ugc.aweme.mix.mixdetail.viewholder.MixFeedManageCell;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailContentHeaderBaseAssemV3;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.old.PoiDetailContentHeaderBaseAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.p005new.PoiDetailContentHeaderNewRegionalAssem;
import com.ss.android.ugc.aweme.poi.detail.reviews.PoiDetailReviewsAssem;
import com.ss.android.ugc.aweme.poi.detail.reviews.PoiDetailReviewsViewModel;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewListItemCell;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.utils.Au2S9S0300000_3;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class IDqS428S0100000_3 extends AbstractC65781Prl implements InterfaceC88473Ynt {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            case 3:
                return invoke$3(this, obj, obj2, obj3);
            case 4:
                return invoke$4(this, obj, obj2, obj3);
            case 5:
                return invoke$5(this, obj, obj2, obj3);
            case 6:
                return invoke$6(this, obj, obj2, obj3);
            case 7:
                return invoke$7(this, obj, obj2, obj3);
            case 8:
                return invoke$8(this, obj, obj2, obj3);
            case 9:
                return invoke$9(this, obj, obj2, obj3);
            case 10:
                return invoke$10(this, obj, obj2, obj3);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this, obj, obj2, obj3);
            case 12:
                return invoke$12(this, obj, obj2, obj3);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return invoke$13(this, obj, obj2, obj3);
            case 14:
                return invoke$14(this, obj, obj2, obj3);
            case 15:
                return invoke$15(this, obj, obj2, obj3);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return invoke$16(this, obj, obj2, obj3);
            case 17:
                return invoke$17(this, obj, obj2, obj3);
            case 18:
                return invoke$18(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS428S0100000_3(C7F9 c7f9, int i) {
        super(3);
        this.$t = i;
        this.l0 = c7f9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS428S0100000_3(C193187i6 c193187i6, int i) {
        super(3);
        this.$t = i;
        this.l0 = c193187i6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS428S0100000_3(C8YE c8ye, C8YE<S, ITEM> c8ye2) {
        super(3);
        this.$t = c8ye2;
        this.l0 = c8ye;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS428S0100000_3(UIAssem uIAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = uIAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS428S0100000_3(CommentKeyboardMultiPanelAssem commentKeyboardMultiPanelAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = commentKeyboardMultiPanelAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS428S0100000_3(CommentMentionAssem commentMentionAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = commentMentionAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS428S0100000_3(ExploreFeedCell exploreFeedCell, int i) {
        super(3);
        this.$t = i;
        this.l0 = exploreFeedCell;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS428S0100000_3(CollectionListFragmentForMineProfile collectionListFragmentForMineProfile, int i) {
        super(3);
        this.$t = i;
        this.l0 = collectionListFragmentForMineProfile;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS428S0100000_3(TitleBarLeftAssem titleBarLeftAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = titleBarLeftAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS428S0100000_3(MixFeedManagerFragment mixFeedManagerFragment, int i) {
        super(3);
        this.$t = i;
        this.l0 = mixFeedManagerFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS428S0100000_3(MixFeedManageCell mixFeedManageCell, int i) {
        super(3);
        this.$t = i;
        this.l0 = mixFeedManageCell;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS428S0100000_3(PoiDetailContentHeaderBaseAssemV3 poiDetailContentHeaderBaseAssemV3, int i) {
        super(3);
        this.$t = i;
        this.l0 = poiDetailContentHeaderBaseAssemV3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS428S0100000_3(PoiDetailContentHeaderNewRegionalAssem poiDetailContentHeaderNewRegionalAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = poiDetailContentHeaderNewRegionalAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS428S0100000_3(PoiDetailContentHeaderBaseAssem poiDetailContentHeaderBaseAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = poiDetailContentHeaderBaseAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS428S0100000_3(PoiDetailReviewsAssem poiDetailReviewsAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = poiDetailReviewsAssem;
    }

    public static final Object invoke$0(IDqS428S0100000_3 iDqS428S0100000_3, Object selectSubscribe, Object obj, Object obj2) {
        String str;
        C177336xd c177336xd;
        C177336xd c177336xd2;
        C174366sq c174366sq;
        AbstractC177926ya panelType = (AbstractC177926ya) obj;
        ((Number) obj2).intValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(panelType, "panelType");
        CommentKeyboardMultiPanelAssem commentKeyboardMultiPanelAssem = (CommentKeyboardMultiPanelAssem) iDqS428S0100000_3.l0;
        commentKeyboardMultiPanelAssem.getClass();
        C177886yW c177886yW = C177886yW.LIZ;
        int i = 0;
        if (o.LJ(panelType, c177886yW)) {
            C8VV.LIZJ(commentKeyboardMultiPanelAssem, new AqS169S0100000_3(commentKeyboardMultiPanelAssem, 628));
            Object value = commentKeyboardMultiPanelAssem.LJLL.getValue();
            o.LJIIIIZZ(value, "<get-emojiContainer>(...)");
            ((View) value).setVisibility(0);
            Object value2 = commentKeyboardMultiPanelAssem.LJLLI.getValue();
            o.LJIIIIZZ(value2, "<get-giftContainer>(...)");
            ((View) value2).setVisibility(4);
        } else if (o.LJ(panelType, C177906yY.LIZ)) {
            Object value3 = commentKeyboardMultiPanelAssem.LJLL.getValue();
            o.LJIIIIZZ(value3, "<get-emojiContainer>(...)");
            ((View) value3).setVisibility(4);
            Object value4 = commentKeyboardMultiPanelAssem.LJLLI.getValue();
            o.LJIIIIZZ(value4, "<get-giftContainer>(...)");
            ((View) value4).setVisibility(4);
        } else if (!o.LJ(panelType, C177876yV.LIZ)) {
            if (o.LJ(panelType, C177896yX.LIZ)) {
                C8VV.LIZJ(commentKeyboardMultiPanelAssem, new AqS169S0100000_3(commentKeyboardMultiPanelAssem, 630));
                Object value5 = commentKeyboardMultiPanelAssem.LJLLI.getValue();
                o.LJIIIIZZ(value5, "<get-giftContainer>(...)");
                ((View) value5).setVisibility(0);
                Object value6 = commentKeyboardMultiPanelAssem.LJLL.getValue();
                o.LJIIIIZZ(value6, "<get-emojiContainer>(...)");
                ((View) value6).setVisibility(4);
            } else {
                o.LJ(panelType, C177916yZ.LIZ);
            }
        }
        int i2 = !o.LJ(panelType, c177886yW) ? 1 : 0;
        InterfaceC55251LmJ LIZLLL = C55247LmF.LIZLLL(C55096Ljo.LJIIZILJ(commentKeyboardMultiPanelAssem), C177336xd.class, "source_default_key");
        if (LIZLLL != null && (c177336xd2 = (C177336xd) LIZLLL.getSource()) != null && (c174366sq = c177336xd2.LJLJLJ) != null) {
            str = c174366sq.getEnterFrom();
        } else {
            str = null;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str);
        c188727au.LJIIIZ("position", "comment");
        c188727au.LIZLLL(i2, "is_fast_panel");
        FMX.LJIIL("show_emoji_board", c188727au.LIZ);
        int height = commentKeyboardMultiPanelAssem.getContainerView().getHeight();
        C177916yZ c177916yZ = C177916yZ.LIZ;
        if (!o.LJ(panelType, c177916yZ)) {
            if (o.LJ(panelType, c177886yW)) {
                commentKeyboardMultiPanelAssem.H3(height, C7EP.LIZ(), panelType);
            } else if (o.LJ(panelType, C177876yV.LIZ)) {
                commentKeyboardMultiPanelAssem.H3(height, C7EP.LIZ(), panelType);
            } else if (o.LJ(panelType, C177906yY.LIZ)) {
                commentKeyboardMultiPanelAssem.H3(height, C7EP.LIZ(), panelType);
            } else if (o.LJ(panelType, C177896yX.LIZ)) {
                InterfaceC55251LmJ LIZLLL2 = C55247LmF.LIZLLL(C55096Ljo.LJIIZILJ(commentKeyboardMultiPanelAssem), C177336xd.class, "source_default_key");
                if (LIZLLL2 != null) {
                    c177336xd = (C177336xd) LIZLLL2.getSource();
                } else {
                    c177336xd = null;
                }
                int LIZIZ = C7MY.LIZIZ(366);
                View findViewById = commentKeyboardMultiPanelAssem.getContainerView().findViewById(R.id.n5s);
                findViewById.measure(View.MeasureSpec.makeMeasureSpec(commentKeyboardMultiPanelAssem.getContainerView().getWidth(), LiveLayoutPreloadThreadPriority.DEFAULT), View.MeasureSpec.makeMeasureSpec(0, 0));
                int measuredHeight = findViewById.getMeasuredHeight() + LIZIZ;
                if (c177336xd != null && c177336xd.LJLLI != null) {
                    commentKeyboardMultiPanelAssem.H3(height, measuredHeight, panelType);
                }
            }
        }
        int height2 = commentKeyboardMultiPanelAssem.getContainerView().getHeight();
        if (o.LJ(panelType, c177916yZ)) {
            i = height2;
        }
        IKeyboardV2Ability iKeyboardV2Ability = (IKeyboardV2Ability) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(commentKeyboardMultiPanelAssem), IKeyboardV2Ability.class, null);
        if (iKeyboardV2Ability != null) {
            iKeyboardV2Ability.bI(i);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("select panel ");
        LIZ.append(panelType);
        C71Y.LIZLLL("xjccccc", X1D.LIZIZ(LIZ));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x007f, code lost:
    
        if (r3 < r5) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.IDqS428S0100000_3 r8, java.lang.Object r9, java.lang.Object r10, java.lang.Object r11) {
        /*
            java.lang.Number r10 = (java.lang.Number) r10
            int r7 = r10.intValue()
            java.lang.Number r11 = (java.lang.Number) r11
            int r6 = r11.intValue()
            java.lang.String r0 = "$this$selectSubscribe"
            kotlin.jvm.internal.o.LJIIIZ(r9, r0)
            java.lang.Object r0 = r8.l0
            com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.CommentMentionAssem r0 = (com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.CommentMentionAssem) r0
            X.70G r4 = r0.x3()
            java.lang.Object r8 = r8.l0
            com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.CommentMentionAssem r8 = (com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.CommentMentionAssem) r8
            r8.getClass()
            r0 = 1130102784(0x435c0000, float:220.0)
            float r5 = X.C17N.LJIJJLI(r0)
            android.content.Context r0 = r8.getContext()
            if (r0 != 0) goto L33
        L2c:
            int r3 = (int) r5
        L2d:
            r4.LJI(r3)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L33:
            int r9 = X.C7EP.LJFF
            if (r9 > 0) goto L42
            com.bytedance.keva.Keva r2 = X.C7EP.LIZIZ()
            java.lang.String r1 = "keyboard_container_height"
            r0 = 0
            int r9 = r2.getInt(r1, r0)
        L42:
            int r3 = r9 - r7
            int r3 = r3 - r6
            android.content.Context r0 = r8.getContext()
            int r0 = X.KL2.LJIIL(r0)
            int r3 = r3 - r0
            java.lang.String r2 = "containerHeight = "
            java.lang.String r1 = ", keyboardHeight = "
            java.lang.String r0 = ", inputHeight = "
            java.lang.StringBuilder r1 = X.C06460Ne.LIZJ(r2, r9, r1, r7, r0)
            r1.append(r6)
            java.lang.String r0 = ", stautsBarHeight = "
            r1.append(r0)
            android.content.Context r0 = r8.getContext()
            int r0 = X.KL2.LJIIL(r0)
            r1.append(r0)
            java.lang.String r0 = ", fixHeight = "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.lang.String r0 = "CommentMentionAssem"
            X.C71Y.LIZ(r0, r1)
            float r0 = (float) r3
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L2c
            goto L2d
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.IDqS428S0100000_3.invoke$1(kotlin.jvm.internal.IDqS428S0100000_3, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$10(IDqS428S0100000_3 iDqS428S0100000_3, Object obj, Object obj2, Object obj3) {
        final View view = (View) obj;
        final String str = (String) obj2;
        final String str2 = (String) obj3;
        o.LJIIIZ(view, "view");
        final PoiDetailContentHeaderNewRegionalAssem poiDetailContentHeaderNewRegionalAssem = (PoiDetailContentHeaderNewRegionalAssem) iDqS428S0100000_3.l0;
        view.setOnLongClickListener(new View.OnLongClickListener() { // from class: X.7dW
            /* JADX WARN: Type inference failed for: r0v6, types: [T, X.Wch] */
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                C68322mC c68322mC = new C68322mC();
                Context context = view2.getContext();
                o.LJIIIIZZ(context, "it.context");
                C139825eE c139825eE = new C139825eE(context);
                c139825eE.LIZ.LIZIZ = view2;
                c139825eE.LJI(WHL.TOP);
                c139825eE.LJIIJJI(R.string.ozd);
                c139825eE.LJIIIZ(R.attr.gy);
                c139825eE.LIZ.LJIJJLI = true;
                c139825eE.LJIIJ(new ACListenerS1S2300000_3(view, str, poiDetailContentHeaderNewRegionalAssem, str2, c68322mC, 1), true);
                ?? LIZJ = c139825eE.LIZJ();
                c68322mC.element = LIZJ;
                LIZJ.show();
                return true;
            }
        });
        return C76800UCe.LIZ;
    }

    public static final Object invoke$11(IDqS428S0100000_3 iDqS428S0100000_3, Object obj, Object obj2, Object obj3) {
        final View view = (View) obj;
        final String str = (String) obj2;
        final String str2 = (String) obj3;
        o.LJIIIZ(view, "view");
        final PoiDetailContentHeaderBaseAssem poiDetailContentHeaderBaseAssem = (PoiDetailContentHeaderBaseAssem) iDqS428S0100000_3.l0;
        view.setOnLongClickListener(new View.OnLongClickListener() { // from class: X.7dj
            /* JADX WARN: Type inference failed for: r0v6, types: [T, X.Wch] */
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                C68322mC c68322mC = new C68322mC();
                Context context = view2.getContext();
                o.LJIIIIZZ(context, "it.context");
                C139825eE c139825eE = new C139825eE(context);
                c139825eE.LIZ.LIZIZ = view2;
                c139825eE.LJI(WHL.TOP);
                c139825eE.LJIIJJI(R.string.ozd);
                c139825eE.LJIIIZ(R.attr.gy);
                c139825eE.LIZ.LJIJJLI = true;
                c139825eE.LJIIJ(new ACListenerS1S2300000_3(view, str, poiDetailContentHeaderBaseAssem, str2, c68322mC, 2), true);
                ?? LIZJ = c139825eE.LIZJ();
                c68322mC.element = LIZJ;
                LIZJ.show();
                return true;
            }
        });
        return C76800UCe.LIZ;
    }

    public static final Object invoke$12(IDqS428S0100000_3 iDqS428S0100000_3, Object selectSubscribe, Object obj, Object obj2) {
        boolean z;
        long j;
        C198807rA state;
        PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel;
        Long l;
        C72808Sho<InterfaceC57784Mm4> state2;
        C198807rA state3;
        PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel2;
        Long l2;
        List list = (List) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        ((PoiDetailReviewsAssem) iDqS428S0100000_3.l0).x3().setVisibility(0);
        ((PoiDetailReviewsAssem) iDqS428S0100000_3.l0).x3().findViewById(R.id.hl3).setVisibility(8);
        ((PoiDetailReviewsAssem) iDqS428S0100000_3.l0).x3().findViewById(R.id.hl6).setVisibility(8);
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            ((PoiDetailReviewsAssem) iDqS428S0100000_3.l0).M3(true);
            PoiDetailReviewsAssem poiDetailReviewsAssem = (PoiDetailReviewsAssem) iDqS428S0100000_3.l0;
            poiDetailReviewsAssem.x3().findViewById(R.id.hl3).setVisibility(0);
            SYL syl = (SYL) poiDetailReviewsAssem.x3().findViewById(R.id.hl2);
            syl.setLifecycleOwner(poiDetailReviewsAssem);
            syl.LLLF.LJZL(PoiReviewListItemCell.class);
            syl.getContext();
            syl.setLayoutManager(new LinearLayoutManager());
            syl.setItemAnimator(null);
            PoiDetailReviewsViewModel N3 = poiDetailReviewsAssem.N3();
            if (N3 != null) {
                C72808Sho state4 = syl.getState();
                o.LJIIIIZZ(state4, "this.state");
                N3.LJLIL = state4;
            }
            poiDetailReviewsAssem.LJLLJ = syl;
            SY4 sy4 = (SY4) poiDetailReviewsAssem.x3().findViewById(R.id.hl4);
            sy4.getClass();
            String string = sy4.getResources().getString(R.string.p1s);
            o.LJIIIIZZ(string, "resources.getString(R.st…oipage_header_allreviews)");
            Object[] objArr = new Object[1];
            PoiDetailReviewsViewModel N32 = poiDetailReviewsAssem.N3();
            long j2 = 0;
            if (N32 != null && (state3 = N32.getState()) != null && (poiReviewSummaryModel2 = state3.LJLJJL) != null && (l2 = poiReviewSummaryModel2.totalCount) != null) {
                j = l2.longValue();
            } else {
                j = 0;
            }
            objArr[0] = Long.valueOf(j);
            String LLLZ = C16880lQ.LLLZ(string, Arrays.copyOf(objArr, 1));
            o.LJIIIIZZ(LLLZ, "format(format, *args)");
            sy4.setText(LLLZ);
            C16880lQ.LJJIZ(sy4, new ACListenerS38S0200000_3(poiDetailReviewsAssem, sy4, 63));
            SYL syl2 = poiDetailReviewsAssem.LJLLJ;
            if (syl2 != null && (state2 = syl2.getState()) != null) {
                state2.LJIILLIIL(list);
            }
            C198847rE.LIZLLL(Integer.valueOf(list.size()), poiDetailReviewsAssem.LJLLI, poiDetailReviewsAssem.N3().getState().LJLJJI);
            String str = poiDetailReviewsAssem.LJLLI;
            PoiDetailReviewsViewModel N33 = poiDetailReviewsAssem.N3();
            if (N33 != null && (state = N33.getState()) != null && (poiReviewSummaryModel = state.LJLJJL) != null && (l = poiReviewSummaryModel.totalCount) != null) {
                j2 = l.longValue();
            }
            Integer valueOf = Integer.valueOf((int) j2);
            String str2 = poiDetailReviewsAssem.N3().getState().LJLJJI;
            LinkedHashMap LIZ = C0JU.LIZ("enter_from", "poi_detail");
            if (str != null) {
                LIZ.put("poi_id", str);
            }
            if (valueOf != null) {
                LIZ.put("review_cnt", String.valueOf(valueOf.intValue()));
            }
            if (str2 != null) {
                C43001GuD.LIZJ(str2, LIZ);
            }
            FMX.LJIIL("show_all_reviews_button", LIZ);
        } else if (o.LJ(obj2, Boolean.TRUE)) {
            ((PoiDetailReviewsAssem) iDqS428S0100000_3.l0).M3(true);
            PoiDetailReviewsAssem poiDetailReviewsAssem2 = (PoiDetailReviewsAssem) iDqS428S0100000_3.l0;
            poiDetailReviewsAssem2.x3().findViewById(R.id.hl6).setVisibility(0);
            SY4 sy42 = (SY4) poiDetailReviewsAssem2.x3().findViewById(R.id.hl5);
            sy42.getClass();
            sy42.LJJJIL(true);
            sy42.setMaxWidth(KL2.LJIIJJI(sy42.getContext()) - (O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)) * 2));
            C16880lQ.LJJIZ(sy42, new ACListenerS23S0100000_3(poiDetailReviewsAssem2, 199));
            String str3 = poiDetailReviewsAssem2.LJLLI;
            if (str3 == null) {
                str3 = "";
            }
            C198847rE.LIZJ("poi_detail", "reviews_section", str3, poiDetailReviewsAssem2.N3().getState().LJLJJI);
            C198847rE.LIZLLL(0, poiDetailReviewsAssem2.LJLLI, poiDetailReviewsAssem2.N3().getState().LJLJJI);
        } else {
            ((PoiDetailReviewsAssem) iDqS428S0100000_3.l0).M3(false);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$13(IDqS428S0100000_3 iDqS428S0100000_3, Object id, Object obj, Object obj2) {
        EnumC84576XHg operation = (EnumC84576XHg) obj2;
        o.LJIIIZ(id, "id");
        o.LJIIIZ(operation, "operation");
        C61325O4z.LJFF(new ARunnableS14S0300000_3(operation, obj, (C193187i6) iDqS428S0100000_3.l0, 3));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$14(IDqS428S0100000_3 iDqS428S0100000_3, Object obj, Object obj2, Object obj3) {
        String str;
        View view;
        C7F7 bindItems = (C7F7) obj;
        S1E item = (S1E) obj2;
        ((Number) obj3).intValue();
        o.LJIIIZ(bindItems, "$this$bindItems");
        o.LJIIIZ(item, "item");
        C7F9 chain = (C7F9) iDqS428S0100000_3.l0;
        o.LJIIIZ(chain, "chain");
        bindItems.LJLJL = chain;
        bindItems.LJLJLJ = item;
        bindItems.LJLJLLL = chain.LIZ.getAid();
        item.LIZLLL(bindItems.LJLIL);
        if (item instanceof S1T) {
            S1T s1t = (S1T) item;
            bindItems.LJLJI.setVisibility(4);
            S1U s1u = s1t.LJLJLLL;
            if (s1u != null) {
                str = s1u.LIZJ();
            } else {
                str = null;
            }
            String LIZ = s1t.LIZ();
            if (C53258KvG.LIZJ()) {
                LIZ = ujb.o.LJJJJZ(LIZ, "|", "·", false);
            }
            bindItems.LJLILLLLZI.setText(LIZ);
            if (C78685UuP.LJJJZ(str) && !o.LJ(str, s1t.LIZ())) {
                TuxTextView tuxTextView = bindItems.LJLJJI;
                tuxTextView.setText(str);
                tuxTextView.setVisibility(0);
                if (C53258KvG.LIZJ()) {
                    bindItems.LJLJJL.setVisibility(8);
                    bindItems.LJLJJLL.setVisibility(0);
                    bindItems.LJLJJLL.setText(" · ");
                    view = bindItems.LJLJJLL;
                } else {
                    bindItems.LJLJJL.setVisibility(0);
                    bindItems.LJLJJLL.setVisibility(8);
                    view = bindItems.LJLJJL;
                }
                tuxTextView.measure(0, 0);
                bindItems.LJLILLLLZI.measure(0, 0);
                view.measure(0, 0);
                int measuredWidth = tuxTextView.getMeasuredWidth();
                C7F8 c7f8 = new C7F8(tuxTextView, view.getMeasuredWidth(), view, bindItems.LJLILLLLZI.getMeasuredWidth(), measuredWidth, bindItems, s1t);
                if (tuxTextView.getWidth() > 0) {
                    c7f8.invoke();
                } else {
                    tuxTextView.post(new ARunnableS39S0100000_3((Object) c7f8, 205));
                }
            } else {
                bindItems.LJLJJL.setVisibility(8);
                bindItems.LJLJJLL.setVisibility(8);
                bindItems.LJLILLLLZI.measure(0, 0);
                int measuredWidth2 = bindItems.LJLILLLLZI.getMeasuredWidth();
                Object parent = bindItems.LJLILLLLZI.getParent();
                o.LJII(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                ((View) parent).measure(0, 0);
                Object parent2 = bindItems.LJLILLLLZI.getParent();
                o.LJII(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
                int LIZ2 = C47135Ieh.LIZ(13, ((View) parent2).getMeasuredWidth());
                if (measuredWidth2 <= LIZ2) {
                    LIZ2 = measuredWidth2;
                }
                bindItems.LJLJI.setVisibility(0);
                s1t.LJJJJJ(measuredWidth2, 0, 0, LIZ2, 0, 0);
            }
        } else {
            bindItems.LJLILLLLZI.setText(item.LIZ());
        }
        item.LJIIIZ().LJJLIIJ();
        C88463da.LIZJ(C88463da.LIZ, bindItems.LJLJI, EnumC1796673i.BUTTON, 0.0f, 12);
        C16880lQ.LJIIJ(new Au2S9S0300000_3(item, chain, bindItems, 2), bindItems.LJLJI);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$15(IDqS428S0100000_3 iDqS428S0100000_3, Object selectSubscribe, Object obj, Object obj2) {
        ArrayList arrayList;
        List list = (List) obj;
        List list2 = (List) obj2;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (list != null) {
            MixFeedManagerFragment mixFeedManagerFragment = (MixFeedManagerFragment) iDqS428S0100000_3.l0;
            if (list2 != null) {
                arrayList = new ArrayList(C32I.LJJL(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Aweme) it.next()).getAid());
                }
            } else {
                arrayList = null;
            }
            if (arrayList != null && (!arrayList.isEmpty())) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list) {
                    if (arrayList.contains(obj3)) {
                        arrayList2.add(obj3);
                    }
                }
                C228428xq c228428xq = mixFeedManagerFragment.LJLILLLLZI;
                if (c228428xq != null) {
                    c228428xq.p1(arrayList2.size());
                } else {
                    o.LJIJI("mBottomView");
                    throw null;
                }
            } else {
                C228428xq c228428xq2 = mixFeedManagerFragment.LJLILLLLZI;
                if (c228428xq2 != null) {
                    c228428xq2.p1(list.size());
                } else {
                    o.LJIJI("mBottomView");
                    throw null;
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$16(IDqS428S0100000_3 iDqS428S0100000_3, Object obj, Object obj2, Object obj3) {
        C33Q c33q = (C33Q) obj;
        o.LJIIIZ(c33q, "$this$null");
        return ((C8YE) iDqS428S0100000_3.l0).HU(c33q, obj2, (List) obj3);
    }

    public static final Object invoke$17(IDqS428S0100000_3 iDqS428S0100000_3, Object obj, Object obj2, Object obj3) {
        C33Q c33q = (C33Q) obj;
        o.LJIIIZ(c33q, "$this$null");
        return ((C8YE) iDqS428S0100000_3.l0).HU(c33q, obj2, (List) obj3);
    }

    public static final Object invoke$18(IDqS428S0100000_3 iDqS428S0100000_3, Object obj, Object obj2, Object obj3) {
        C33Q c33q = (C33Q) obj;
        o.LJIIIZ(c33q, "$this$null");
        return ((C8YE) iDqS428S0100000_3.l0).HU(c33q, obj2, (List) obj3);
    }

    public static final Object invoke$2(IDqS428S0100000_3 iDqS428S0100000_3, Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        Intent intent = (Intent) obj3;
        IRefactorKeyboardFragment LIZ = C178166yy.LIZ(C55096Ljo.LJIIZILJ((UIAssem) iDqS428S0100000_3.l0));
        if (LIZ != null) {
            LIZ.onActivityResult(intValue, intValue2, intent);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(IDqS428S0100000_3 iDqS428S0100000_3, Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        Intent intent = (Intent) obj3;
        IRefactorKeyboardFragment LIZ = C178166yy.LIZ(C55096Ljo.LJIIZILJ((UIAssem) iDqS428S0100000_3.l0));
        if (LIZ != null) {
            LIZ.onActivityResult(intValue, intValue2, intent);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(IDqS428S0100000_3 iDqS428S0100000_3, Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        Intent intent = (Intent) obj3;
        IRefactorKeyboardFragment LIZ = C178166yy.LIZ(C55096Ljo.LJIIZILJ((UIAssem) iDqS428S0100000_3.l0));
        if (LIZ != null) {
            LIZ.onActivityResult(intValue, intValue2, intent);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(IDqS428S0100000_3 iDqS428S0100000_3, Object aid, Object obj, Object obj2) {
        String str;
        Aweme aweme;
        C200647u8 state = (C200647u8) obj;
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        o.LJIIIZ(aid, "aid");
        o.LJIIIZ(state, "state");
        C2050482y item = ((ExploreFeedCell) iDqS428S0100000_3.l0).getItem();
        if (item != null && (aweme = item.LJLIL) != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        if (o.LJ(str, aid)) {
            ExploreFeedCell exploreFeedCell = (ExploreFeedCell) iDqS428S0100000_3.l0;
            exploreFeedCell.getClass();
            if (!state.LIZJ) {
                exploreFeedCell._$_findCachedViewById(R.id.c_v).setVisibility(4);
            } else {
                exploreFeedCell._$_findCachedViewById(R.id.c_v).setVisibility(0);
                ((TextView) exploreFeedCell._$_findCachedViewById(R.id.mr0)).setText(state.LIZ);
            }
            if (booleanValue) {
                ((AnonymousClass833) exploreFeedCell._$_findCachedViewById(R.id.ejj)).LIZIZ();
            } else {
                ((AnonymousClass833) exploreFeedCell._$_findCachedViewById(R.id.ejj)).setSelected(state.LIZIZ);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(IDqS428S0100000_3 iDqS428S0100000_3, Object id, Object obj, Object operation) {
        o.LJIIIZ(id, "id");
        o.LJIIIZ(operation, "operation");
        if (operation == EnumC84576XHg.Mutation) {
            VideoCollectionListViewModel.gv0(((CollectionListFragmentForMineProfile) iDqS428S0100000_3.l0).Dl(), true, false, 6);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(IDqS428S0100000_3 iDqS428S0100000_3, Object selectSubscribe, Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        String contentDesStr = (String) obj2;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(contentDesStr, "contentDesStr");
        TuxIconView tuxIconView = ((TitleBarLeftAssem) iDqS428S0100000_3.l0).LJLLI;
        if (tuxIconView != null) {
            tuxIconView.setIconRes(intValue);
            TuxIconView tuxIconView2 = ((TitleBarLeftAssem) iDqS428S0100000_3.l0).LJLLI;
            if (tuxIconView2 != null) {
                tuxIconView2.setContentDescription(contentDesStr);
                return C76800UCe.LIZ;
            }
            o.LJIJI("icon");
            throw null;
        }
        o.LJIJI("icon");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$8(IDqS428S0100000_3 iDqS428S0100000_3, Object selectSubscribe, Object obj, Object obj2) {
        C43I editType = (C43I) obj;
        List list = (List) obj2;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(editType, "editType");
        if (!((Boolean) editType.LIZ).booleanValue()) {
            ((MixFeedManageCell) iDqS428S0100000_3.l0).itemView.findViewById(R.id.e9n).setVisibility(0);
            C212418Vh.LJIIJJI((AssemViewModel) ((MixFeedManageCell) iDqS428S0100000_3.l0).LJLIL.getValue(), new AqS169S0100000_3((MixFeedManageCell) iDqS428S0100000_3.l0, 266));
        } else {
            ((MixFeedManageCell) iDqS428S0100000_3.l0).itemView.findViewById(R.id.e9n).setVisibility(8);
            ((ImageView) ((MixFeedManageCell) iDqS428S0100000_3.l0).itemView.findViewById(R.id.f5u)).setVisibility(0);
        }
        String str = null;
        if (list != null) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((Aweme) it.next()).getAid());
            }
            MixFeedManageCell mixFeedManageCell = (MixFeedManageCell) iDqS428S0100000_3.l0;
            C228108xK item = mixFeedManageCell.getItem();
            if (item != null) {
                str = item.LJLJI;
            }
            if (arrayList.contains(str) && !mixFeedManageCell.LJLJJL) {
                mixFeedManageCell.LJLJJL = true;
                mixFeedManageCell.itemView.setBackgroundColor(((Number) mixFeedManageCell.LJLILLLLZI.getValue()).intValue());
                mixFeedManageCell.itemView.postDelayed(new ARunnableS39S0100000_3(mixFeedManageCell, 220), 2000L);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(IDqS428S0100000_3 iDqS428S0100000_3, Object obj, Object obj2, Object obj3) {
        final View view = (View) obj;
        final String str = (String) obj2;
        final String str2 = (String) obj3;
        o.LJIIIZ(view, "view");
        final PoiDetailContentHeaderBaseAssemV3 poiDetailContentHeaderBaseAssemV3 = (PoiDetailContentHeaderBaseAssemV3) iDqS428S0100000_3.l0;
        view.setOnLongClickListener(new View.OnLongClickListener() { // from class: X.7di
            /* JADX WARN: Type inference failed for: r0v6, types: [T, X.Wch] */
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                C68322mC c68322mC = new C68322mC();
                Context context = view2.getContext();
                o.LJIIIIZZ(context, "it.context");
                C139825eE c139825eE = new C139825eE(context);
                c139825eE.LIZ.LIZIZ = view2;
                c139825eE.LJI(WHL.TOP);
                c139825eE.LJIIJJI(R.string.ozd);
                c139825eE.LJIIIZ(R.attr.gy);
                c139825eE.LIZ.LJIJJLI = true;
                c139825eE.LJIIJ(new ACListenerS1S2300000_3(view, str, poiDetailContentHeaderBaseAssemV3, str2, c68322mC, 0), true);
                ?? LIZJ = c139825eE.LIZJ();
                c68322mC.element = LIZJ;
                LIZJ.show();
                return true;
            }
        });
        return C76800UCe.LIZ;
    }
}
