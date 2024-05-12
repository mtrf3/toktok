package Y;

import X.A8R;
import X.ActivityC45651qj;
import X.AnonymousClass391;
import X.AnonymousClass927;
import X.AnonymousClass928;
import X.AnonymousClass979;
import X.C03880Dg;
import X.C06540Nm;
import X.C139825eE;
import X.C161586Vu;
import X.C16530kr;
import X.C16880lQ;
import X.C17N;
import X.C188727au;
import X.C1DD;
import X.C1FJ;
import X.C1IZ;
import X.C208088Eq;
import X.C214348b8;
import X.C222588oQ;
import X.C2300591d;
import X.C2300991h;
import X.C2301091i;
import X.C2313195z;
import X.C243869he;
import X.C245189jm;
import X.C247289nA;
import X.C247339nF;
import X.C247609ng;
import X.C249849rI;
import X.C252519vb;
import X.C25738A8g;
import X.C26045AKb;
import X.C26338AVi;
import X.C26685Add;
import X.C27387Aox;
import X.C27388Aoy;
import X.C2MW;
import X.C2NU;
import X.C2U8;
import X.C32044Chs;
import X.C32151Nz;
import X.C40340FsO;
import X.C43I;
import X.C44172HVg;
import X.C44384HbQ;
import X.C45631qh;
import X.C45804HyK;
import X.C47135Ieh;
import X.C47261Igj;
import X.C51029K0z;
import X.C55096Ljo;
import X.C56448MDk;
import X.C56449MDl;
import X.C56975MXr;
import X.C56976MXs;
import X.C56977MXt;
import X.C57092Lx;
import X.C59222Uc;
import X.C5S1;
import X.C60996Nwm;
import X.C61447O9r;
import X.C62814Ol0;
import X.C63081OpJ;
import X.C65300Pk0;
import X.C65352Pkq;
import X.C6W5;
import X.C70920RsS;
import X.C71799SFv;
import X.C71898SJq;
import X.C72190SUw;
import X.C73062Slu;
import X.C75792yF;
import X.C76732zl;
import X.C76930UHe;
import X.C78473Uqz;
import X.C78565UsT;
import X.C78841Uwv;
import X.C78939UyV;
import X.C78946Uyc;
import X.C78983UzD;
import X.C7MY;
import X.C82682Wcg;
import X.C8D3;
import X.C8O4;
import X.C8PQ;
import X.C90193gN;
import X.C92N;
import X.C94D;
import X.C94E;
import X.C95I;
import X.C95J;
import X.C96V;
import X.DialogC25756A8y;
import X.EF7;
import X.EnumC111394Yt;
import X.EnumC221088m0;
import X.EnumC245179jl;
import X.FKM;
import X.FMX;
import X.InterfaceC2302191t;
import X.InterfaceC245209jo;
import X.InterfaceC55235Lm3;
import X.InterfaceC88472Yns;
import X.JKG;
import X.KL2;
import X.KRA;
import X.O6R;
import X.SY4;
import X.T5T;
import X.W5N;
import X.W5O;
import X.W8E;
import X.WHL;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.text.Editable;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.cla.et.ETParamsProvider;
import com.ss.android.ugc.aweme.commerce.BizAccountInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitState;
import com.ss.android.ugc.aweme.ecommerce.base.osp.widget.OrderSubmitBottomWidget;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.desc.ProductDescVideoViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerPromotionItem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.strategy.SkuPanelFragment;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictFragment;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictPage;
import com.ss.android.ugc.aweme.ecommerce.tts.pdp.us.module.promotion.UsSellerPromotionVH;
import com.ss.android.ugc.aweme.ecommerce.us.logistic.module.logisticselectzipcode.USLogisticSelectByZipcodeVH;
import com.ss.android.ugc.aweme.experiments.LandscapeOptExperiment;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.aweme.feed.landscape.LandscapeVideoViewCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.prompt.FeedPromptViewModel;
import com.ss.android.ugc.aweme.feed.prompt.data.PromptStruct;
import com.ss.android.ugc.aweme.feed.prompt.panel.PromptTextEditFragment;
import com.ss.android.ugc.aweme.feed.ui.LongPressLayout;
import com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter;
import com.ss.android.ugc.aweme.kids.profile.utils.MyProfileReportWidget;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.v2.I18nUserProfileFragmentV2;
import com.ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget;
import com.ss.android.ugc.aweme.profile.widgets.navbar.base.ProfileNavActionAssem;
import com.ss.android.ugc.aweme.profile.widgets.navbar.entrances.mine.MineNavBarNicknameAssem;
import com.ss.android.ugc.aweme.profile.widgets.navbar.entrances.mine.MineNavBarSuggestBAAssem;
import com.ss.android.ugc.aweme.profile.widgets.qrcode.ProfileUserQrcodeEntranceAssem;
import com.ss.android.ugc.aweme.rss.link.ui.RssLinkAssem;
import com.ss.android.ugc.aweme.story.feed.guidecard.component.StoryGuideVideoComponent;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class ARunnableS23S0200000_4 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;

    public final void LIZ$1() {
        int i;
        int i2;
        int i3;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        ((A8R) this.l1).LIZ(R.id.a46).measure(makeMeasureSpec, makeMeasureSpec2);
        ((A8R) this.l1).LIZ(R.id.a3g).measure(makeMeasureSpec, makeMeasureSpec2);
        ((A8R) this.l1).LIZ(R.id.a3h).measure(makeMeasureSpec, makeMeasureSpec2);
        int measuredHeight = ((A8R) this.l1).LIZ(R.id.a3g).getMeasuredHeight();
        int width = ((A8R) this.l1).LIZ(R.id.a3h).getWidth() + ((A8R) this.l1).LIZ(R.id.a3g).getMeasuredWidth();
        View anchor_price_div = ((A8R) this.l1).LIZ(R.id.a3h);
        o.LJIIIIZZ(anchor_price_div, "anchor_price_div");
        ViewGroup.LayoutParams layoutParams = anchor_price_div.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            i = C16530kr.LIZJ((ViewGroup.MarginLayoutParams) layoutParams);
        } else {
            i = 0;
        }
        int i4 = width + i;
        View anchor_price_div2 = ((A8R) this.l1).LIZ(R.id.a3h);
        o.LJIIIIZZ(anchor_price_div2, "anchor_price_div");
        ViewGroup.LayoutParams layoutParams2 = anchor_price_div2.getLayoutParams();
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            i2 = C16530kr.LIZIZ((ViewGroup.MarginLayoutParams) layoutParams2);
        } else {
            i2 = 0;
        }
        int measuredWidth = ((A8R) this.l1).LIZ(R.id.a46).getMeasuredWidth() + i4 + i2;
        View anchor_subtitle_flow = ((A8R) this.l1).LIZ(R.id.a44);
        o.LJIIIIZZ(anchor_subtitle_flow, "anchor_subtitle_flow");
        ViewGroup.LayoutParams layoutParams3 = anchor_subtitle_flow.getLayoutParams();
        if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
            i3 = C16530kr.LIZJ((ViewGroup.MarginLayoutParams) layoutParams3);
        } else {
            i3 = 0;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.addUpdateListener(new AUListenerS8S0102000_4((A8R) this.l1, measuredHeight, measuredWidth + i3, 0));
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(((A8R) this.l1).LIZ(R.id.a44), "alpha", 0.0f, 1.0f);
        ofFloat2.setStartDelay(50L);
        ofFloat2.setDuration(300L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.addListener(new IDAListenerS73S0100000_4((A8R) this.l1, 1));
        animatorSet.start();
    }

    public final void LIZ$10() {
        C2MW.LIZ().LIZIZ();
        Iterator<? extends InterfaceC245209jo> it = ((C247609ng) this.l0).LIZ.iterator();
        while (it.hasNext()) {
            it.next().LJIJJ((EnumC245179jl) this.l1);
        }
        ((ArrayList) C249849rI.LIZ).clear();
        C247339nF.LJI.getClass();
        Iterator LJ = C06540Nm.LJ((HashMap) C247339nF.LJFF.getValue(), "instanceMap.values");
        while (LJ.hasNext()) {
            C247339nF c247339nF = (C247339nF) LJ.next();
            c247339nF.LIZIZ = 0;
            c247339nF.LIZ = 0;
        }
        int i = 8;
        C247289nA c247289nA = (C247289nA) C95J.LIZ(8);
        if (c247289nA != null) {
            c247289nA.LJI();
        }
        C247609ng c247609ng = (C247609ng) this.l0;
        EnumC245179jl type = (EnumC245179jl) this.l1;
        o.LJIIIZ(type, "type");
        int i2 = C245189jm.LIZ[type.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                i = 1;
            }
        } else {
            i = 7;
        }
        Integer valueOf = Integer.valueOf(i);
        c247609ng.getClass();
        C95I.LIZ().LIZIZ(valueOf);
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            case 8:
                run$8(this);
                return;
            case 9:
                run$9(this);
                return;
            case 10:
                run$10(this);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                run$11(this);
                return;
            case 12:
                run$12(this);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                run$13(this);
                return;
            case 14:
                run$14(this);
                return;
            case 15:
                run$15(this);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                run$16(this);
                return;
            case 17:
                run$17(this);
                return;
            case 18:
                run$18(this);
                return;
            case 19:
                run$19(this);
                return;
            case 20:
                run$20(this);
                return;
            case 21:
                run$21(this);
                return;
            case 22:
                run$22(this);
                return;
            case 23:
                run$23(this);
                return;
            case 24:
                run$24(this);
                return;
            case 25:
                run$25(this);
                return;
            case 26:
                run$26(this);
                return;
            case 27:
                run$27(this);
                return;
            case 28:
                run$28(this);
                return;
            case 29:
                run$29(this);
                return;
            case 30:
                run$30(this);
                return;
            case 31:
                run$31(this);
                return;
            case 32:
                run$32(this);
                return;
            case 33:
                run$33(this);
                return;
            case 34:
                run$34(this);
                return;
            case 35:
                run$35(this);
                return;
            case 36:
                run$36(this);
                return;
            case 37:
                run$37(this);
                return;
            case 38:
                run$38(this);
                return;
            case 39:
                run$39(this);
                return;
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                run$40(this);
                return;
            case 41:
                run$41(this);
                return;
            case 42:
                run$42(this);
                return;
            case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                run$43(this);
                return;
            case 44:
                run$44(this);
                return;
            case 45:
                run$45(this);
                return;
            case 46:
                run$46(this);
                return;
            case 47:
                run$47(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        InputMethodManager inputMethodManager;
        ((T5T) this.l0).requestFocus();
        USLogisticSelectByZipcodeVH uSLogisticSelectByZipcodeVH = (USLogisticSelectByZipcodeVH) this.l1;
        T5T t5t = (T5T) this.l0;
        uSLogisticSelectByZipcodeVH.getClass();
        try {
            Object LLILL = C16880lQ.LLILL(EF7.LIZIZ(), "input_method");
            if ((LLILL instanceof InputMethodManager) && (inputMethodManager = (InputMethodManager) LLILL) != null) {
                inputMethodManager.showSoftInput(t5t, 1);
            }
        } catch (Exception e) {
            C78983UzD.LJIIZILJ(new RuntimeException(C1DD.LJ("GECC EditText.openKeyboard(), ", e)));
        }
    }

    public final void LIZ$11() {
        int LIZIZ;
        if (((C72190SUw) this.l1).LJLJJLL == null) {
            return;
        }
        if (C8PQ.LIZ()) {
            LIZIZ = C7MY.LIZIZ(12);
        } else {
            LIZIZ = C7MY.LIZIZ(15);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(C47135Ieh.LIZ(6, C47135Ieh.LIZ(4, C47135Ieh.LIZ(20, C47135Ieh.LIZ(100, C60996Nwm.LIZIZ(((C72190SUw) this.l1).getContext()) - LIZIZ)))) - O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)), LiveLayoutPreloadThreadPriority.DEFAULT);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        TuxTextView tuxTextView = ((C72190SUw) this.l1).LJLJJLL;
        if (tuxTextView != null) {
            tuxTextView.measure(makeMeasureSpec, makeMeasureSpec2);
        }
        TuxTextView tuxTextView2 = ((C72190SUw) this.l1).LJLJJLL;
        if (tuxTextView2 == null) {
            return;
        }
        int measuredHeight = tuxTextView2.getMeasuredHeight();
        TuxTextView tuxTextView3 = ((C72190SUw) this.l1).LJLJJLL;
        if (tuxTextView3 == null) {
            return;
        }
        int measuredWidth = tuxTextView3.getMeasuredWidth();
        TuxTextView tuxTextView4 = ((C72190SUw) this.l1).LJLJJL;
        if (tuxTextView4 == null) {
            return;
        }
        int measuredWidth2 = tuxTextView4.getMeasuredWidth();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.addUpdateListener(new AUListenerS1S0103000_4((C72190SUw) this.l1, measuredWidth, measuredWidth2, measuredHeight, 0));
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(((C72190SUw) this.l1).LJLJJLL, "alpha", 0.0f, 1.0f);
        ofFloat2.setStartDelay(50L);
        ofFloat2.setDuration(300L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.addListener(new ALAdapterS3S0100000_4((C72190SUw) this.l1, 16));
        animatorSet.start();
    }

    public final void LIZ$12() {
        int LIZIZ;
        if (((C25738A8g) this.l1).LJLJJLL == null) {
            return;
        }
        if (C8PQ.LIZ()) {
            LIZIZ = C7MY.LIZIZ(12);
        } else {
            LIZIZ = C7MY.LIZIZ(15);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(C47135Ieh.LIZ(4, C47135Ieh.LIZ(4, C47135Ieh.LIZ(20, C47135Ieh.LIZ(100, C60996Nwm.LIZIZ(((C25738A8g) this.l1).getContext()) - LIZIZ)))) - O6R.LJJIIZ(C32151Nz.LJIIZILJ(6)), LiveLayoutPreloadThreadPriority.DEFAULT);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        TuxTextView tuxTextView = ((C25738A8g) this.l1).LJLJJLL;
        if (tuxTextView != null) {
            tuxTextView.measure(makeMeasureSpec, makeMeasureSpec2);
        }
        TuxTextView tuxTextView2 = ((C25738A8g) this.l1).LJLJJLL;
        if (tuxTextView2 == null) {
            return;
        }
        int measuredHeight = tuxTextView2.getMeasuredHeight();
        TuxTextView tuxTextView3 = ((C25738A8g) this.l1).LJLJJLL;
        if (tuxTextView3 == null) {
            return;
        }
        int measuredWidth = tuxTextView3.getMeasuredWidth();
        TuxTextView tuxTextView4 = ((C25738A8g) this.l1).LJLJJL;
        if (tuxTextView4 == null) {
            return;
        }
        int measuredWidth2 = tuxTextView4.getMeasuredWidth();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.addUpdateListener(new AUListenerS1S0103000_4((C25738A8g) this.l1, measuredWidth, measuredWidth2, measuredHeight, 1));
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(((C25738A8g) this.l1).LJLJJLL, "alpha", 0.0f, 1.0f);
        ofFloat2.setStartDelay(50L);
        ofFloat2.setDuration(300L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.addListener(new ALAdapterS3S0100000_4((C25738A8g) this.l1, 17));
        animatorSet.start();
    }

    public final void LIZ$13() {
        if (((UsSellerPromotionVH) this.l0)._$_findCachedViewById(R.id.icd).getParent() != null) {
            C76732zl c76732zl = new C76732zl();
            int childCount = ((ViewGroup) ((UsSellerPromotionVH) this.l0)._$_findCachedViewById(R.id.icd)).getChildCount();
            c76732zl.element = childCount;
            if (childCount > ((C26685Add) this.l1).LIZJ.size()) {
                c76732zl.element = ((C26685Add) this.l1).LIZJ.size();
            }
            List<SellerPromotionItem> subList = ((C26685Add) this.l1).LIZJ.subList(0, c76732zl.element);
            View promotion_flow_layout = ((UsSellerPromotionVH) this.l0)._$_findCachedViewById(R.id.icd);
            o.LJIIIIZZ(promotion_flow_layout, "promotion_flow_layout");
            C78946Uyc.LJJIIJ(promotion_flow_layout, new C70920RsS(), new AqS135S0200000_4(subList, c76732zl, 240));
        }
    }

    public final void LIZ$14() {
        DialogC25756A8y dialogC25756A8y = ((C243869he) this.l0).LJLIL;
        if (dialogC25756A8y != null) {
            dialogC25756A8y.dismiss();
        }
        ((C243869he) this.l0).LJLIL = new DialogC25756A8y((Activity) this.l1);
        DialogC25756A8y dialogC25756A8y2 = ((C243869he) this.l0).LJLIL;
        if (dialogC25756A8y2 == null || new C03880Dg(2).LIZJ(300000, "com/bytedance/tux/status/loading/TuxLoadingDialogHUD", "show", dialogC25756A8y2, new Object[0], "void", new C65300Pk0(false, "()V", "-3496703728244603251")).LIZ) {
            return;
        }
        dialogC25756A8y2.show();
    }

    public final void LIZ$15() {
        Rect rect = new Rect();
        ((View) this.l0).getHitRect(rect);
        rect.left -= 10;
        rect.top -= 10;
        rect.right += 10;
        rect.bottom += 10;
        ((View) this.l1).setTouchDelegate(new TouchDelegate(rect, (View) this.l0));
    }

    public final void LIZ$16() {
        Rect rect = new Rect();
        ((View) this.l0).getHitRect(rect);
        rect.left -= 10;
        rect.top -= 10;
        rect.right += 10;
        rect.bottom += 10;
        ((View) this.l1).setTouchDelegate(new TouchDelegate(rect, (View) this.l0));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|2|3|(8:5|6|(6:8|9|10|(2:13|11)|14|15)|18|19|(1:21)|23|(7:25|26|27|(2:30|28)|31|32|33)(1:37))|40|6|(0)|18|19|(0)|23|(0)(0)) */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007b A[Catch: all -> 0x007f, TRY_LEAVE, TryCatch #3 {all -> 0x007f, blocks: (B:19:0x0068, B:21:0x007b), top: B:18:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$17() {
        /*
            r9 = this;
            java.lang.Object r1 = r9.l1
            X.Eam r1 = (X.AbstractC36700Eam) r1
            java.lang.Object r0 = r9.l0
            X.6Gi r0 = (X.C157566Gi) r0
            r1.getClass()
            r0.getClass()
            r8 = 0
            com.bytedance.ies.abmock.SettingsManager r2 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()     // Catch: java.lang.Throwable -> L27
            java.lang.String r1 = "default_cover_urls"
            java.lang.Class<com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel[]> r0 = com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel[].class
            r2.getClass()     // Catch: java.lang.Throwable -> L27
            java.lang.Object r0 = com.bytedance.ies.abmock.SettingsManager.LJII(r1, r0)     // Catch: java.lang.Throwable -> L27
            com.ss.android.ugc.aweme.base.model.UrlModel[] r0 = (com.ss.android.ugc.aweme.base.model.UrlModel[]) r0     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L27
            java.util.List r1 = java.util.Arrays.asList(r0)     // Catch: java.lang.Throwable -> L27
            goto L28
        L27:
            r1 = r8
        L28:
            boolean r0 = X.C79004UzY.LJJIFFI(r1)
            java.lang.String r7 = "profile"
            r5 = 0
            if (r0 != 0) goto L68
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            java.util.Iterator r4 = r1.iterator()     // Catch: java.lang.Exception -> L57
            r3 = 0
        L3b:
            boolean r0 = r4.hasNext()     // Catch: java.lang.Exception -> L57
            if (r0 == 0) goto L57
            java.lang.Object r2 = r4.next()     // Catch: java.lang.Exception -> L57
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = (com.ss.android.ugc.aweme.base.model.UrlModel) r2     // Catch: java.lang.Exception -> L57
            com.ss.android.ugc.aweme.profile.model.UrlModelWrap r0 = new com.ss.android.ugc.aweme.profile.model.UrlModelWrap     // Catch: java.lang.Exception -> L57
            int r1 = r3 + 1
            r0.<init>(r3, r2)     // Catch: java.lang.Exception -> L57
            java.lang.String r0 = r0.toJsonString()     // Catch: java.lang.Exception -> L57
            r6.add(r0)     // Catch: java.lang.Exception -> L57
            r3 = r1
            goto L3b
        L57:
            X.KUN r0 = X.C1A7.LJIILLIIL(r7)
            android.content.SharedPreferences$Editor r1 = r0.LIZLLL()
            java.lang.String r0 = "default_profile_cover_url"
            android.content.SharedPreferences$Editor r0 = r1.putStringSet(r0, r6)
            r0.apply()
        L68:
            com.bytedance.ies.abmock.SettingsManager r2 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()     // Catch: java.lang.Throwable -> L7f
            java.lang.String r1 = "white_cover_urls"
            java.lang.Class<com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel> r0 = com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel.class
            r2.getClass()     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r0 = com.bytedance.ies.abmock.SettingsManager.LJII(r1, r0)     // Catch: java.lang.Throwable -> L7f
            com.ss.android.ugc.aweme.base.model.UrlModel[] r0 = (com.ss.android.ugc.aweme.base.model.UrlModel[]) r0     // Catch: java.lang.Throwable -> L7f
            if (r0 == 0) goto L7f
            java.util.List r8 = java.util.Arrays.asList(r0)     // Catch: java.lang.Throwable -> L7f
        L7f:
            boolean r0 = X.C79004UzY.LJJIFFI(r8)
            if (r0 != 0) goto Lbc
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.Iterator r3 = r8.iterator()     // Catch: java.lang.Exception -> Laa
        L8e:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Exception -> Laa
            if (r0 == 0) goto Lab
            java.lang.Object r2 = r3.next()     // Catch: java.lang.Exception -> Laa
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = (com.ss.android.ugc.aweme.base.model.UrlModel) r2     // Catch: java.lang.Exception -> Laa
            com.ss.android.ugc.aweme.profile.model.UrlModelWrap r0 = new com.ss.android.ugc.aweme.profile.model.UrlModelWrap     // Catch: java.lang.Exception -> Laa
            int r1 = r5 + 1
            r0.<init>(r5, r2)     // Catch: java.lang.Exception -> Laa
            java.lang.String r0 = r0.toJsonString()     // Catch: java.lang.Exception -> Laa
            r4.add(r0)     // Catch: java.lang.Exception -> Laa
            r5 = r1
            goto L8e
        Laa:
        Lab:
            X.KUN r0 = X.C1A7.LJIILLIIL(r7)
            android.content.SharedPreferences$Editor r1 = r0.LIZLLL()
            java.lang.String r0 = "default_profile_cover_url_white"
            android.content.SharedPreferences$Editor r0 = r1.putStringSet(r0, r4)
            r0.apply()
        Lbc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS23S0200000_4.LIZ$17():void");
    }

    public final void LIZ$18() {
        String prompt;
        FeedPromptViewModel feedPromptViewModel = ((PromptTextEditFragment) this.l0).LJLIL;
        int i = 0;
        if (feedPromptViewModel == null || !o.LJ(feedPromptViewModel.LJLJLLL, Boolean.TRUE)) {
            prompt = ((PromptStruct) ((Serializable) this.l1)).getPrompt();
        } else {
            prompt = "";
        }
        TextView textView = (TextView) ((PromptTextEditFragment) this.l0)._$_findCachedViewById(R.id.l4k);
        if (textView != null) {
            textView.setText(prompt);
        }
        EditText editText = (EditText) ((PromptTextEditFragment) this.l0)._$_findCachedViewById(R.id.l4k);
        if (editText != null) {
            if (prompt != null) {
                i = prompt.length();
            }
            editText.setSelection(i);
        }
        FeedPromptViewModel feedPromptViewModel2 = ((PromptTextEditFragment) this.l0).LJLIL;
        if (feedPromptViewModel2 == null) {
            return;
        }
        feedPromptViewModel2.LJLJLLL = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r15v26 */
    /* JADX WARN: Type inference failed for: r15v27 */
    /* JADX WARN: Type inference failed for: r15v28 */
    public final void LIZ$2() {
        C59222Uc c59222Uc;
        DataCenter dataCenter;
        C2301091i c2301091i;
        Display display;
        WindowManager windowManager;
        Display display2;
        WindowManager windowManager2;
        TextView textView;
        ViewGroup.LayoutParams layoutParams;
        int i;
        boolean z;
        LongPressLayout longPressLayout;
        View childAt;
        C56448MDk c56448MDk;
        C59222Uc c59222Uc2;
        TuxTextView tuxTextView;
        C56448MDk c56448MDk2;
        LandscapeVideoViewCell component = (LandscapeVideoViewCell) this.l0;
        o.LJIIIZ(component, "component");
        C214348b8.LIZJ(component, C65352Pkq.LIZ(VideoEventDispatchViewModel.class), C92N.INSTANCE, EnumC221088m0.SYNCHRONIZED).getValue();
        component.getClass();
        ((LandscapeVideoViewCell) this.l0).LLIIIJ = ((C222588oQ) this.l1).LIZJ.getContext();
        LandscapeVideoViewCell landscapeVideoViewCell = (LandscapeVideoViewCell) this.l0;
        C222588oQ c222588oQ = (C222588oQ) this.l1;
        landscapeVideoViewCell.LLIIL = c222588oQ.LJII;
        landscapeVideoViewCell.LLJJIJI = c222588oQ.LJFF;
        View view = landscapeVideoViewCell.LLILII;
        if (view != null) {
            landscapeVideoViewCell.LLD = view.findViewById(R.id.gradual_bottom);
            View view2 = landscapeVideoViewCell.LLILII;
            if (view2 != null) {
                landscapeVideoViewCell.LLF = (ViewGroup) view2.findViewById(R.id.dy6);
                View view3 = landscapeVideoViewCell.LLILII;
                if (view3 != null) {
                    landscapeVideoViewCell.LLFF = view3.findViewById(R.id.dy7);
                    View view4 = landscapeVideoViewCell.LLILII;
                    if (view4 != null) {
                        landscapeVideoViewCell.LLFFF = view4.findViewById(R.id.gradual_top);
                        View view5 = landscapeVideoViewCell.LLILII;
                        if (view5 != null) {
                            landscapeVideoViewCell.LLJILJILJ = (C2313195z) view5.findViewById(R.id.k0b);
                            View view6 = landscapeVideoViewCell.LLILII;
                            if (view6 != null) {
                                LinearLayout linearLayout = (LinearLayout) view6.findViewById(R.id.lfa);
                                landscapeVideoViewCell.LLI = linearLayout;
                                if (linearLayout != null) {
                                    c59222Uc = (C59222Uc) linearLayout.findViewById(R.id.adq);
                                } else {
                                    c59222Uc = null;
                                }
                                landscapeVideoViewCell.LLII = c59222Uc;
                                View view7 = landscapeVideoViewCell.LLILII;
                                if (view7 != null) {
                                    landscapeVideoViewCell.LLIFFJFJJ = (FrameLayout) view7.findViewById(R.id.view_rootview);
                                    View view8 = landscapeVideoViewCell.LLILII;
                                    if (view8 != null) {
                                        landscapeVideoViewCell.LLFII = (FrameLayout) view8.findViewById(R.id.n4p);
                                        View view9 = landscapeVideoViewCell.LLILII;
                                        if (view9 != null) {
                                            landscapeVideoViewCell.LLJILJIL = (SmartImageView) view9.findViewById(R.id.cover);
                                            View view10 = landscapeVideoViewCell.LLILII;
                                            if (view10 != null) {
                                                landscapeVideoViewCell.LLILLIZIL = (C94D) view10.findViewById(R.id.ian);
                                                View view11 = landscapeVideoViewCell.LLILII;
                                                if (view11 != null) {
                                                    landscapeVideoViewCell.LLILZIL = (TuxIconView) view11.findViewById(R.id.hj4);
                                                    View view12 = landscapeVideoViewCell.LLILII;
                                                    if (view12 != null) {
                                                        landscapeVideoViewCell.LLILLJJLI = (C56448MDk) view12.findViewById(R.id.n7r);
                                                        if (LandscapeOptExperiment.LIZIZ() && (c56448MDk2 = landscapeVideoViewCell.LLILLJJLI) != null) {
                                                            c56448MDk2.setVisibility(8);
                                                        }
                                                        View view13 = landscapeVideoViewCell.LLILII;
                                                        if (view13 != null) {
                                                            landscapeVideoViewCell.LLILLL = (ViewGroup) view13.findViewById(R.id.hs7);
                                                            View view14 = landscapeVideoViewCell.LLILII;
                                                            if (view14 != null) {
                                                                landscapeVideoViewCell.LLILZ = (ViewGroup) view14.findViewById(R.id.hs2);
                                                                View view15 = landscapeVideoViewCell.LLILII;
                                                                if (view15 != null) {
                                                                    landscapeVideoViewCell.LLILZLL = (TuxTextView) view15.findViewById(R.id.iao);
                                                                    View view16 = landscapeVideoViewCell.LLILII;
                                                                    if (view16 != null) {
                                                                        landscapeVideoViewCell.LLIZ = (TuxTextView) view16.findViewById(R.id.ib6);
                                                                        View view17 = landscapeVideoViewCell.LLILII;
                                                                        if (view17 != null) {
                                                                            landscapeVideoViewCell.LLIZLLLIL = (TuxTextView) view17.findViewById(R.id.k_f);
                                                                            View view18 = landscapeVideoViewCell.LLILII;
                                                                            if (view18 != null) {
                                                                                landscapeVideoViewCell.LLJ = view18.findViewById(R.id.lay);
                                                                                View view19 = landscapeVideoViewCell.LLILII;
                                                                                if (view19 != null) {
                                                                                    landscapeVideoViewCell.LLJI = (ImageView) view19.findViewById(R.id.n7v);
                                                                                    View view20 = landscapeVideoViewCell.LLILII;
                                                                                    if (view20 != null) {
                                                                                        ImageView imageView = (ImageView) view20.findViewById(R.id.hrs);
                                                                                        if (imageView != null) {
                                                                                            C78841Uwv.LIZIZ(imageView.getContext(), imageView);
                                                                                        } else {
                                                                                            imageView = null;
                                                                                        }
                                                                                        landscapeVideoViewCell.LLJIJIL = imageView;
                                                                                        View view21 = landscapeVideoViewCell.LLILII;
                                                                                        if (view21 != null) {
                                                                                            landscapeVideoViewCell.LLFZ = (C94E) view21.findViewById(R.id.eq0);
                                                                                            if (C90193gN.LIZ() && (tuxTextView = landscapeVideoViewCell.LLILZLL) != null) {
                                                                                                tuxTextView.setGravity(8388613);
                                                                                            }
                                                                                            Set<View> set = landscapeVideoViewCell.LLJJJIL;
                                                                                            set.add(landscapeVideoViewCell.LLI);
                                                                                            set.add(landscapeVideoViewCell.LLD);
                                                                                            set.add(landscapeVideoViewCell.LLFFF);
                                                                                            set.add(landscapeVideoViewCell.LJZL);
                                                                                            set.add(landscapeVideoViewCell.LLILLIZIL);
                                                                                            set.add(landscapeVideoViewCell.LLF);
                                                                                            set.add(landscapeVideoViewCell.LLILZ);
                                                                                            if (C208088Eq.LIZ() && (c59222Uc2 = landscapeVideoViewCell.LLII) != null) {
                                                                                                c59222Uc2.setDispatchOnTouchListener(new IDTListenerS114S0100000_4(landscapeVideoViewCell, 2));
                                                                                            }
                                                                                            C2300991h.LIZ.getClass();
                                                                                            if (C2300991h.LIZIZ && (c56448MDk = landscapeVideoViewCell.LLILLJJLI) != null) {
                                                                                                c56448MDk.setForceDispatchTouchEvent(true);
                                                                                                c56448MDk.setEnableClickToSeek(true);
                                                                                            }
                                                                                            C56448MDk c56448MDk3 = landscapeVideoViewCell.LLILLJJLI;
                                                                                            ViewGroup viewGroup = landscapeVideoViewCell.LLILLL;
                                                                                            TuxTextView tuxTextView2 = landscapeVideoViewCell.LLILZLL;
                                                                                            TuxTextView tuxTextView3 = landscapeVideoViewCell.LLIZ;
                                                                                            TuxIconView tuxIconView = landscapeVideoViewCell.LLILZIL;
                                                                                            ImageView imageView2 = landscapeVideoViewCell.LLJI;
                                                                                            VideoItemParams videoItemParams = landscapeVideoViewCell.LJLLJ;
                                                                                            if (videoItemParams != null) {
                                                                                                dataCenter = videoItemParams.dataCenter;
                                                                                            } else {
                                                                                                dataCenter = null;
                                                                                            }
                                                                                            if (c56448MDk3 != null && viewGroup != null && tuxTextView2 != null && tuxTextView3 != null && tuxIconView != null && imageView2 != null) {
                                                                                                c2301091i = new C2301091i(new C56449MDl(c56448MDk3, viewGroup, tuxTextView2, tuxTextView3, tuxIconView, imageView2, dataCenter));
                                                                                            } else {
                                                                                                c2301091i = null;
                                                                                            }
                                                                                            landscapeVideoViewCell.LLJJIII = c2301091i;
                                                                                            C2300591d c2300591d = landscapeVideoViewCell.LLIIJI;
                                                                                            Context context = landscapeVideoViewCell.LLIIIJ;
                                                                                            if (context == null) {
                                                                                                c2300591d.getClass();
                                                                                            } else if (c2300591d.LIZ <= 0 || c2300591d.LIZIZ <= 0) {
                                                                                                C63081OpJ.LJJJJLI(context);
                                                                                                if (C32044Chs.LJ()) {
                                                                                                    Activity LJIJJ = C45804HyK.LJIJJ(context);
                                                                                                    if (LJIJJ != null && (windowManager2 = LJIJJ.getWindowManager()) != null) {
                                                                                                        display2 = windowManager2.getDefaultDisplay();
                                                                                                    } else {
                                                                                                        display2 = null;
                                                                                                    }
                                                                                                    DisplayMetrics displayMetrics = new DisplayMetrics();
                                                                                                    if (display2 != null) {
                                                                                                        display2.getRealMetrics(displayMetrics);
                                                                                                    }
                                                                                                    c2300591d.LIZIZ = C32044Chs.LJII();
                                                                                                    c2300591d.LIZ = C32044Chs.LJIIIIZZ();
                                                                                                } else {
                                                                                                    Activity LJIJJ2 = C45804HyK.LJIJJ(context);
                                                                                                    if (LJIJJ2 != null && (windowManager = LJIJJ2.getWindowManager()) != null) {
                                                                                                        display = windowManager.getDefaultDisplay();
                                                                                                    } else {
                                                                                                        display = null;
                                                                                                    }
                                                                                                    DisplayMetrics displayMetrics2 = new DisplayMetrics();
                                                                                                    if (display != null) {
                                                                                                        display.getRealMetrics(displayMetrics2);
                                                                                                    }
                                                                                                    c2300591d.LIZIZ = displayMetrics2.heightPixels;
                                                                                                    c2300591d.LIZ = displayMetrics2.widthPixels;
                                                                                                }
                                                                                            }
                                                                                            ViewGroup viewGroup2 = landscapeVideoViewCell.LLF;
                                                                                            ?? r15 = 0;
                                                                                            boolean z2 = false;
                                                                                            r15 = 0;
                                                                                            r15 = 0;
                                                                                            r15 = 0;
                                                                                            r15 = 0;
                                                                                            r15 = 0;
                                                                                            if (viewGroup2 != null && viewGroup2.getChildCount() > 0 && (childAt = viewGroup2.getChildAt(0)) != null) {
                                                                                                childAt.setVisibility(8);
                                                                                            }
                                                                                            LandscapeVideoViewCell landscapeVideoViewCell2 = (LandscapeVideoViewCell) this.l0;
                                                                                            LongPressLayout longPressLayout2 = landscapeVideoViewCell2.LLIIII;
                                                                                            if (longPressLayout2 != null) {
                                                                                                longPressLayout2.setEnableSimulateClick(false);
                                                                                            }
                                                                                            LongPressLayout longPressLayout3 = landscapeVideoViewCell2.LLIIII;
                                                                                            if (longPressLayout3 != null) {
                                                                                                longPressLayout3.setTimeInterval(3600000);
                                                                                            }
                                                                                            C94D c94d = landscapeVideoViewCell2.LLILLIZIL;
                                                                                            if (c94d != null && (longPressLayout = landscapeVideoViewCell2.LLIIII) != null) {
                                                                                                C2301091i c2301091i2 = landscapeVideoViewCell2.LLJJIII;
                                                                                                InterfaceC2302191t interfaceC2302191t = landscapeVideoViewCell2.LLJJIJI;
                                                                                                if (interfaceC2302191t != null) {
                                                                                                    longPressLayout.setTapListener(new AnonymousClass927(c94d, c2301091i2, new AnonymousClass928(landscapeVideoViewCell2, interfaceC2302191t)));
                                                                                                } else {
                                                                                                    o.LJIJI("iHandlePlay");
                                                                                                    throw null;
                                                                                                }
                                                                                            }
                                                                                            LandscapeVideoViewCell landscapeVideoViewCell3 = (LandscapeVideoViewCell) this.l0;
                                                                                            Fragment fragment = landscapeVideoViewCell3.LJLLLLLL;
                                                                                            if (fragment != null && fragment.mo49getActivity() != null) {
                                                                                                WidgetManager Gl = WidgetManager.Gl(landscapeVideoViewCell3.LLIFFJFJJ, landscapeVideoViewCell3.LJLLLLLL);
                                                                                                DataCenter dataCenter2 = landscapeVideoViewCell3.LLIL;
                                                                                                if (dataCenter2 != null) {
                                                                                                    Gl.Hl(dataCenter2);
                                                                                                    landscapeVideoViewCell3.LLJJJJLIIL = true;
                                                                                                    WidgetManager Gl2 = WidgetManager.Gl(landscapeVideoViewCell3.LLIFFJFJJ, landscapeVideoViewCell3.LJLLLLLL);
                                                                                                    o.LJIIIIZZ(Gl2, "of(fragment, rootView)");
                                                                                                    landscapeVideoViewCell3.LLJJIJIIJIL = Gl2;
                                                                                                    DataCenter dataCenter3 = landscapeVideoViewCell3.LLIL;
                                                                                                    if (dataCenter3 != null) {
                                                                                                        dataCenter3.iv0("feed_internal_event", landscapeVideoViewCell3, false);
                                                                                                        dataCenter3.iv0("to_profile", landscapeVideoViewCell3, false);
                                                                                                        dataCenter3.iv0("update_diig_view", landscapeVideoViewCell3, false);
                                                                                                        dataCenter3.iv0("video_comment_list", landscapeVideoViewCell3, false);
                                                                                                        dataCenter3.iv0("video_share_click", landscapeVideoViewCell3, false);
                                                                                                        dataCenter3.iv0("video_digg", landscapeVideoViewCell3, false);
                                                                                                        dataCenter3.iv0("video_on_pause_play", landscapeVideoViewCell3, false);
                                                                                                        dataCenter3.iv0("click_landscape_caption_toggle", landscapeVideoViewCell3, false);
                                                                                                        dataCenter3.iv0("title_view_click", landscapeVideoViewCell3, false);
                                                                                                        dataCenter3.iv0("video_favorite_click", landscapeVideoViewCell3, false);
                                                                                                        dataCenter3.iv0("click_land_scape_see_more", landscapeVideoViewCell3, false);
                                                                                                        dataCenter3.iv0("enter_play_mode", landscapeVideoViewCell3, false);
                                                                                                    } else {
                                                                                                        o.LJIJI("dataCenter");
                                                                                                        throw null;
                                                                                                    }
                                                                                                } else {
                                                                                                    o.LJIJI("dataCenter");
                                                                                                    throw null;
                                                                                                }
                                                                                            }
                                                                                            LandscapeVideoViewCell landscapeVideoViewCell4 = (LandscapeVideoViewCell) this.l0;
                                                                                            landscapeVideoViewCell4.getClass();
                                                                                            if (C208088Eq.LIZ()) {
                                                                                                C59222Uc c59222Uc3 = landscapeVideoViewCell4.LLII;
                                                                                                if (c59222Uc3 != null) {
                                                                                                    C26338AVi.LJI(c59222Uc3, null, 0, null, null, false, 29);
                                                                                                }
                                                                                                if (C8D3.LIZIZ()) {
                                                                                                    LinearLayout linearLayout2 = landscapeVideoViewCell4.LLI;
                                                                                                    if (linearLayout2 != null) {
                                                                                                        z2 = false;
                                                                                                        C26338AVi.LJI(linearLayout2, C1FJ.LIZIZ(12), 0, C1FJ.LIZIZ(12), C1FJ.LIZIZ(0), false, 16);
                                                                                                    }
                                                                                                    if (C208088Eq.LIZIZ()) {
                                                                                                        C94D c94d2 = landscapeVideoViewCell4.LLILLIZIL;
                                                                                                        if (c94d2 != null) {
                                                                                                            Integer LIZIZ = C1FJ.LIZIZ(12);
                                                                                                            Integer LIZIZ2 = C1FJ.LIZIZ(12);
                                                                                                            Integer LIZIZ3 = C1FJ.LIZIZ(0);
                                                                                                            i = R.id.ffl;
                                                                                                            boolean z3 = z2 ? 1 : 0;
                                                                                                            C26338AVi.LJI(c94d2, LIZIZ, 0, LIZIZ2, LIZIZ3, z3, 16);
                                                                                                            z = z3;
                                                                                                        } else {
                                                                                                            i = R.id.ffl;
                                                                                                            z = z2;
                                                                                                        }
                                                                                                        View view22 = landscapeVideoViewCell4.LLILII;
                                                                                                        if (view22 != null) {
                                                                                                            View findViewById = view22.findViewById(i);
                                                                                                            r15 = z;
                                                                                                            if (findViewById != null) {
                                                                                                                C26338AVi.LJI(findViewById, C1FJ.LIZIZ(0), C1FJ.LIZIZ(0), AnonymousClass391.LIZJ(18), AnonymousClass391.LIZJ(75), z, 16);
                                                                                                                r15 = z;
                                                                                                            }
                                                                                                        } else {
                                                                                                            o.LJIJI("view");
                                                                                                            throw null;
                                                                                                        }
                                                                                                    } else if (C208088Eq.LIZJ()) {
                                                                                                        C94D c94d3 = landscapeVideoViewCell4.LLILLIZIL;
                                                                                                        boolean z4 = z2;
                                                                                                        if (c94d3 != null) {
                                                                                                            Integer LIZIZ4 = C1FJ.LIZIZ(12);
                                                                                                            Integer LIZIZ5 = C1FJ.LIZIZ(12);
                                                                                                            Integer LIZJ = AnonymousClass391.LIZJ(4);
                                                                                                            boolean z5 = z2 ? 1 : 0;
                                                                                                            C26338AVi.LJI(c94d3, LIZIZ4, 0, LIZIZ5, LIZJ, z5, 16);
                                                                                                            z4 = z5;
                                                                                                        }
                                                                                                        View view23 = landscapeVideoViewCell4.LLILII;
                                                                                                        if (view23 != null) {
                                                                                                            View findViewById2 = view23.findViewById(R.id.ffl);
                                                                                                            r15 = z4;
                                                                                                            if (findViewById2 != null) {
                                                                                                                C26338AVi.LJI(findViewById2, C1FJ.LIZIZ(0), C1FJ.LIZIZ(0), C1FJ.LIZIZ(12), AnonymousClass391.LIZJ(4), z4 ? 1 : 0, 16);
                                                                                                                r15 = z4;
                                                                                                            }
                                                                                                        } else {
                                                                                                            o.LJIJI("view");
                                                                                                            throw null;
                                                                                                        }
                                                                                                    } else {
                                                                                                        r15 = z2;
                                                                                                        if (C208088Eq.LIZLLL()) {
                                                                                                            C94D c94d4 = landscapeVideoViewCell4.LLILLIZIL;
                                                                                                            boolean z6 = z2;
                                                                                                            if (c94d4 != null) {
                                                                                                                Integer LIZIZ6 = C1FJ.LIZIZ(12);
                                                                                                                Integer LIZIZ7 = C1FJ.LIZIZ(12);
                                                                                                                Integer LIZIZ8 = C1FJ.LIZIZ(0);
                                                                                                                boolean z7 = z2 ? 1 : 0;
                                                                                                                C26338AVi.LJI(c94d4, LIZIZ6, 0, LIZIZ7, LIZIZ8, z7, 16);
                                                                                                                z6 = z7;
                                                                                                            }
                                                                                                            View view24 = landscapeVideoViewCell4.LLILII;
                                                                                                            if (view24 != null) {
                                                                                                                View findViewById3 = view24.findViewById(R.id.ffl);
                                                                                                                r15 = z6;
                                                                                                                if (findViewById3 != null) {
                                                                                                                    C26338AVi.LJI(findViewById3, C1FJ.LIZIZ(12), C1FJ.LIZIZ(0), C1FJ.LIZIZ(12), C1FJ.LIZIZ(0), z6 ? 1 : 0, 16);
                                                                                                                    r15 = z6;
                                                                                                                }
                                                                                                            } else {
                                                                                                                o.LJIJI("view");
                                                                                                                throw null;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            } else if (C8D3.LIZIZ()) {
                                                                                                C94D c94d5 = landscapeVideoViewCell4.LLILLIZIL;
                                                                                                if (c94d5 != null) {
                                                                                                    C26338AVi.LJI(c94d5, C1FJ.LIZIZ(12), 0, C1FJ.LIZIZ(12), C1FJ.LIZIZ(12), false, 16);
                                                                                                }
                                                                                                LinearLayout linearLayout3 = landscapeVideoViewCell4.LLI;
                                                                                                if (linearLayout3 != null) {
                                                                                                    C26338AVi.LJI(linearLayout3, C1FJ.LIZIZ(12), C1FJ.LIZIZ(12), 0, C1FJ.LIZIZ(12), false, 16);
                                                                                                }
                                                                                                if (C47135Ieh.LIZ(194, O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(KL2.LJIIJJI(landscapeVideoViewCell4.LLIIIJ))))) <= C7MY.LIZIZ(432)) {
                                                                                                    C59222Uc c59222Uc4 = landscapeVideoViewCell4.LLII;
                                                                                                    if (c59222Uc4 != null && (layoutParams = c59222Uc4.getLayoutParams()) != null) {
                                                                                                        layoutParams.width = C47135Ieh.LIZ(194, O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(KL2.LJIIJJI(landscapeVideoViewCell4.LLIIIJ)))));
                                                                                                    }
                                                                                                    C59222Uc c59222Uc5 = landscapeVideoViewCell4.LLII;
                                                                                                    if (c59222Uc5 != null && (textView = (TextView) c59222Uc5.findViewById(R.id.desc)) != null) {
                                                                                                        textView.setWidth(-1);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            LandscapeVideoViewCell landscapeVideoViewCell5 = (LandscapeVideoViewCell) this.l0;
                                                                                            landscapeVideoViewCell5.getClass();
                                                                                            InterfaceC55235Lm3 LJIJ = C55096Ljo.LJIJ(landscapeVideoViewCell5);
                                                                                            ETParamsProvider[] eTParamsProviderArr = new ETParamsProvider[1];
                                                                                            eTParamsProviderArr[r15] = landscapeVideoViewCell5;
                                                                                            C62814Ol0.LJJIIJZLJL(LJIJ, ETParamsProvider.class, C47261Igj.LJJIJIL(eTParamsProviderArr));
                                                                                            return;
                                                                                        }
                                                                                        o.LJIJI("view");
                                                                                        throw null;
                                                                                    }
                                                                                    o.LJIJI("view");
                                                                                    throw null;
                                                                                }
                                                                                o.LJIJI("view");
                                                                                throw null;
                                                                            }
                                                                            o.LJIJI("view");
                                                                            throw null;
                                                                        }
                                                                        o.LJIJI("view");
                                                                        throw null;
                                                                    }
                                                                    o.LJIJI("view");
                                                                    throw null;
                                                                }
                                                                o.LJIJI("view");
                                                                throw null;
                                                            }
                                                            o.LJIJI("view");
                                                            throw null;
                                                        }
                                                        o.LJIJI("view");
                                                        throw null;
                                                    }
                                                    o.LJIJI("view");
                                                    throw null;
                                                }
                                                o.LJIJI("view");
                                                throw null;
                                            }
                                            o.LJIJI("view");
                                            throw null;
                                        }
                                        o.LJIJI("view");
                                        throw null;
                                    }
                                    o.LJIJI("view");
                                    throw null;
                                }
                                o.LJIJI("view");
                                throw null;
                            }
                            o.LJIJI("view");
                            throw null;
                        }
                        o.LJIJI("view");
                        throw null;
                    }
                    o.LJIJI("view");
                    throw null;
                }
                o.LJIJI("view");
                throw null;
            }
            o.LJIJI("view");
            throw null;
        }
        o.LJIJI("view");
        throw null;
    }

    public final void LIZ$3() {
        C139825eE c139825eE = new C139825eE((Context) this.l0);
        c139825eE.LIZIZ((SY4) this.l1);
        c139825eE.LJI(WHL.TOP);
        String string = FKM.LIZJ().getString(R.string.qqb);
        o.LJIIIIZZ(string, "resources.getString(R.st…_seriesDashAlert_tooltip)");
        c139825eE.LIZJ = string;
        C82682Wcg c82682Wcg = c139825eE.LIZ;
        c82682Wcg.LJIIIZ = true;
        c82682Wcg.LJII = 10000L;
        c82682Wcg.LJIJJLI = false;
        c139825eE.LIZJ().show();
    }

    public final void LIZ$4() {
        ((BaseMyProfileGuideWidget) this.l0).LJLLLLLL = new AnimatorSet();
        View view = ((BaseMyProfileGuideWidget) this.l0).LJLLLL;
        o.LJI(view);
        C57092Lx.LIZ.getClass();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", C61447O9r.LIZ(), 0.0f);
        View view2 = ((BaseMyProfileGuideWidget) this.l0).LJLLLL;
        o.LJI(view2);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view2, "alpha", 0.0f, 1.0f);
        AnimatorSet animatorSet = ((BaseMyProfileGuideWidget) this.l0).LJLLLLLL;
        if (animatorSet != null) {
            animatorSet.playTogether(ofFloat2, ofFloat);
        }
        AnimatorSet animatorSet2 = ((BaseMyProfileGuideWidget) this.l0).LJLLLLLL;
        if (animatorSet2 != null) {
            animatorSet2.setDuration(200L);
        }
        AnimatorSet animatorSet3 = ((BaseMyProfileGuideWidget) this.l0).LJLLLLLL;
        if (animatorSet3 != null) {
            animatorSet3.start();
        }
        View view3 = (View) this.l1;
        if (view3 == null) {
            return;
        }
        view3.setVisibility(0);
    }

    public final void LIZ$5() {
        BizAccountInfo bizAccountInfo;
        MineNavBarSuggestBAAssem mineNavBarSuggestBAAssem = (MineNavBarSuggestBAAssem) this.l0;
        User user = (User) this.l1;
        if (!mineNavBarSuggestBAAssem.LJLIL.getBoolean("has_shown_tips", false) && user != null && (bizAccountInfo = user.getBizAccountInfo()) != null && bizAccountInfo.getSuggestedAccountsEntranceTipType() == 1) {
            String str = null;
            ProfileNavActionAssem.showAlertBadge$default(mineNavBarSuggestBAAssem, true, 0, 2, null);
            C188727au c188727au = new C188727au();
            if (user != null) {
                str = user.getCategory();
            }
            c188727au.LJIIIZ("user_category", str);
            FMX.LJIIL("ttelite_BA_add_business_red_dot_show", c188727au.LIZ);
        }
    }

    public final void LIZ$6() {
        Rect rect = new Rect();
        TuxIconView tuxIconView = ((ProfileUserQrcodeEntranceAssem) this.l0).LJLIL;
        if (tuxIconView != null) {
            tuxIconView.setEnabled(true);
        }
        TuxIconView tuxIconView2 = ((ProfileUserQrcodeEntranceAssem) this.l0).LJLIL;
        if (tuxIconView2 != null) {
            tuxIconView2.getGlobalVisibleRect(rect);
        }
        Rect rect2 = new Rect();
        ((View) this.l1).getGlobalVisibleRect(rect2);
        rect.left -= (int) C44384HbQ.LJJJLL(4);
        rect.right += (int) C44384HbQ.LJJJLL(16);
        rect.top -= rect2.top;
        rect.bottom -= rect2.top;
        ((View) this.l1).setTouchDelegate(new TouchDelegate(rect, ((ProfileUserQrcodeEntranceAssem) this.l0).LJLIL));
    }

    public final void LIZ$7() {
        ActivityC45651qj LIZ;
        Aweme aweme;
        String aid;
        C8O4 a1 = ((StoryGuideVideoComponent) this.l0).a1();
        o.LJIIIZ(a1, "<this>");
        KRA LIZIZ = a1.LIZIZ();
        if (LIZIZ == null || (LIZ = LIZIZ.LIZ()) == null || LIZ.isFinishing() || ((Aweme) this.l1) != ((VideoItemParams) C51029K0z.LJIILLIIL((StoryGuideVideoComponent) this.l0)).getAweme()) {
            return;
        }
        EnumC111394Yt enumC111394Yt = C2NU.LIZ.LIZJ;
        if (enumC111394Yt == EnumC111394Yt.NOT_AVAILABLE) {
            C26045AKb c26045AKb = new C26045AKb(LIZ);
            c26045AKb.LJIIIIZZ(R.string.dtf);
            c26045AKb.LJIIJ();
            C40340FsO.LIZ(R.string.dtf);
            return;
        }
        if (enumC111394Yt == EnumC111394Yt.FAKE) {
            C26045AKb c26045AKb2 = new C26045AKb(LIZ);
            c26045AKb2.LJIIIIZZ(R.string.dtd);
            c26045AKb2.LJIIJ();
            C40340FsO.LIZ(R.string.dtd);
            return;
        }
        if (enumC111394Yt != EnumC111394Yt.AVAILABLE || (aweme = ((VideoItemParams) C51029K0z.LJIILLIIL((StoryGuideVideoComponent) this.l0)).getAweme()) == null || (aid = aweme.getAid()) == null) {
            return;
        }
        C252519vb.LIZ(LIZ, aid);
    }

    public final void LIZ$8() {
        View view = (View) this.l0;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = -2;
        view.setLayoutParams(layoutParams);
        View bottomNextGroup = (View) this.l0;
        o.LJIIIIZZ(bottomNextGroup, "bottomNextGroup");
        C26338AVi.LJIIIZ(bottomNextGroup, C1FJ.LIZIZ(14), C1FJ.LIZIZ(14), C1FJ.LIZIZ(14), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(14))), 16);
        ((TuxTextView) this.l1).setVisibility(8);
    }

    public final void LIZ$9() {
        ((MyProfileReportWidget) this.l0).LJLILLLLZI = new AnimatorSet();
        View view = ((MyProfileReportWidget) this.l0).LJLIL;
        o.LJI(view);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        AnimatorSet animatorSet = ((MyProfileReportWidget) this.l0).LJLILLLLZI;
        if (animatorSet != null) {
            animatorSet.playTogether(ofFloat);
        }
        AnimatorSet animatorSet2 = ((MyProfileReportWidget) this.l0).LJLILLLLZI;
        if (animatorSet2 != null) {
            animatorSet2.setDuration(200L);
        }
        AnimatorSet animatorSet3 = ((MyProfileReportWidget) this.l0).LJLILLLLZI;
        if (animatorSet3 != null) {
            animatorSet3.start();
        }
        ((View) this.l1).setVisibility(0);
    }

    public static final void run$0(ARunnableS23S0200000_4 aRunnableS23S0200000_4) {
        boolean LIZ;
        try {
            aRunnableS23S0200000_4.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS23S0200000_4 aRunnableS23S0200000_4) {
        boolean LIZ;
        try {
            aRunnableS23S0200000_4.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$10(ARunnableS23S0200000_4 aRunnableS23S0200000_4) {
        boolean LIZ;
        try {
            aRunnableS23S0200000_4.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$11(ARunnableS23S0200000_4 aRunnableS23S0200000_4) {
        boolean LIZ;
        try {
            VideoItemParams videoItemParams = ((LandscapeVideoViewCell) aRunnableS23S0200000_4.l0).LJLLJ;
            if (videoItemParams != null) {
                videoItemParams.setwidgetAweme((Aweme) aRunnableS23S0200000_4.l1);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$12(ARunnableS23S0200000_4 aRunnableS23S0200000_4) {
        boolean LIZ;
        SlimRoom slimRoom;
        try {
            FollowListAdapter.FollowItemViewHolder followItemViewHolder = (FollowListAdapter.FollowItemViewHolder) aRunnableS23S0200000_4.l0;
            String str = ((User) aRunnableS23S0200000_4.l1).roomData;
            o.LJIIIIZZ(str, "item.roomData");
            try {
                slimRoom = (SlimRoom) C75792yF.LIZ(str, SlimRoom.class);
            } catch (Exception unused) {
                slimRoom = null;
            }
            followItemViewHolder.LJLLL = slimRoom;
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$13(ARunnableS23S0200000_4 aRunnableS23S0200000_4) {
        boolean LIZ;
        try {
            ((T5T) aRunnableS23S0200000_4.l0).requestFocus();
            KeyboardUtils.LIZLLL((T5T) ((View) aRunnableS23S0200000_4.l1).findViewById(R.id.czx));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$14(ARunnableS23S0200000_4 aRunnableS23S0200000_4) {
        boolean LIZ;
        try {
            aRunnableS23S0200000_4.LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$15(ARunnableS23S0200000_4 aRunnableS23S0200000_4) {
        boolean LIZ;
        try {
            Assembler assembler = (Assembler) aRunnableS23S0200000_4.l0;
            I18nUserProfileFragmentV2 i18nUserProfileFragmentV2 = (I18nUserProfileFragmentV2) aRunnableS23S0200000_4.l1;
            assembler.wv0(i18nUserProfileFragmentV2, new AqS170S0100000_4(i18nUserProfileFragmentV2, 606));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$16(ARunnableS23S0200000_4 aRunnableS23S0200000_4) {
        boolean LIZ;
        try {
            aRunnableS23S0200000_4.LIZ$4();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$17(ARunnableS23S0200000_4 aRunnableS23S0200000_4) {
        boolean LIZ;
        try {
            aRunnableS23S0200000_4.LIZ$5();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$18(ARunnableS23S0200000_4 aRunnableS23S0200000_4) {
        boolean LIZ;
        try {
            ((MineNavBarNicknameAssem) aRunnableS23S0200000_4.l0).C3((User) aRunnableS23S0200000_4.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$19(ARunnableS23S0200000_4 aRunnableS23S0200000_4) {
        boolean LIZ;
        try {
            aRunnableS23S0200000_4.LIZ$6();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS23S0200000_4 aRunnableS23S0200000_4) {
        boolean LIZ;
        try {
            LandscapeVideoViewCell landscapeVideoViewCell = (LandscapeVideoViewCell) aRunnableS23S0200000_4.l0;
            ViewGroup viewGroup = (ViewGroup) aRunnableS23S0200000_4.l1;
            landscapeVideoViewCell.getClass();
            LandscapeVideoViewCell.LLFFF(viewGroup);
            C56448MDk c56448MDk = ((LandscapeVideoViewCell) aRunnableS23S0200000_4.l0).LLILLJJLI;
            if (c56448MDk != null) {
                LandscapeVideoViewCell.LLFFF(c56448MDk);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$20(ARunnableS23S0200000_4 aRunnableS23S0200000_4) {
        boolean LIZ;
        InputMethodManager inputMethodManager;
        int i;
        try {
            if (((T5T) aRunnableS23S0200000_4.l0).requestFocus()) {
                T5T t5t = (T5T) aRunnableS23S0200000_4.l0;
                Editable text = t5t.getText();
                if (text != null) {
                    i = text.length();
                } else {
                    i = 0;
                }
                t5t.setSelection(i);
            }
            Context context = ((RssLinkAssem) aRunnableS23S0200000_4.l1).getContext();
            Object obj = null;
            if (context != null) {
                obj = C16880lQ.LLILL(context, "input_method");
            }
            if ((obj instanceof InputMethodManager) && (inputMethodManager = (InputMethodManager) obj) != null) {
                inputMethodManager.showSoftInput((T5T) aRunnableS23S0200000_4.l0, 1);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$21(ARunnableS23S0200000_4 aRunnableS23S0200000_4) {
        boolean LIZ;
        try {
            aRunnableS23S0200000_4.LIZ$7();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$22(ARunnableS23S0200000_4 aRunnableS23S0200000_4) {
        boolean LIZ;
        try {
            aRunnableS23S0200000_4.LIZ$8();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$23(ARunnableS23S0200000_4 aRunnableS23S0200000_4) {
        boolean LIZ;
        C45631qh c45631qh;
        try {
            LinearLayout linearLayout = (LinearLayout) aRunnableS23S0200000_4.l0;
            if (linearLayout != null && (c45631qh = (C45631qh) aRunnableS23S0200000_4.l1) != null) {
                c45631qh.scrollTo(0, linearLayout.getTop());
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$24(ARunnableS23S0200000_4 aRunnableS23S0200000_4) {
        boolean LIZ;
        try {
            aRunnableS23S0200000_4.LIZ$9();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$25(ARunnableS23S0200000_4 aRunnableS23S0200000_4) {
        boolean LIZ;
        try {
            int height = ((JKG) aRunnableS23S0200000_4.l0).s0().getHeight();
            int LJIILL = C17N.LJIILL(20.0d) + (height - ((LinearLayout) aRunnableS23S0200000_4.l1).getTop());
            if (LJIILL > 0 && LJIILL < height) {
                C71898SJq p0 = ((JKG) aRunnableS23S0200000_4.l0).p0();
                p0.getLayoutParams().height = LJIILL;
                p0.setVisibility(0);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$26(ARunnableS23S0200000_4 aRunnableS23S0200000_4) {
        boolean LIZ;
        int i;
        try {
            C45631qh c45631qh = (C45631qh) ((SkuPanelFragment) aRunnableS23S0200000_4.l0).LJLJJLL._$_findCachedViewById(R.id.k3r);
            if (c45631qh != null) {
                Integer num = (Integer) aRunnableS23S0200000_4.l1;
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 0;
                }
                c45631qh.LJIILLIIL(-c45631qh.getScrollX(), i - c45631qh.getScrollY(), false);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$27(ARunnableS23S0200000_4 aRunnableS23S0200000_4) {
        boolean LIZ;
        try {
            aRunnableS23S0200000_4.LIZ$10();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$28(ARunnableS23S0200000_4 aRunnableS23S0200000_4) {
        boolean LIZ;
        try {
            boolean LJII = W8E.LJII().LJIIIZ().LJII(W5N.LJI().LIZ(W5O.LIZ((Uri) aRunnableS23S0200000_4.l0), null));
            C6W5 c6w5 = (C6W5) aRunnableS23S0200000_4.l1;
            Boolean valueOf = Boolean.valueOf(LJII);
            Runnable runnable = (Runnable) ((C161586Vu) c6w5).LIZ;
            if (!valueOf.booleanValue()) {
                runnable.run();
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$29(ARunnableS23S0200000_4 aRunnableS23S0200000_4) {
        boolean LIZ;
        try {
            ((InterfaceC88472Yns) aRunnableS23S0200000_4.l0).invoke(0);
            C5S1 c5s1 = new C5S1(C44172HVg.LIZ);
            c5s1.LIZLLL(((ActivityC45651qj) aRunnableS23S0200000_4.l1).getString(R.string.jh));
            c5s1.LJ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS23S0200000_4 aRunnableS23S0200000_4) {
        boolean LIZ;
        try {
            ((OrderSubmitBottomWidget) aRunnableS23S0200000_4.l0).trackPlaceOrderButtonClick((OrderSubmitState) aRunnableS23S0200000_4.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$30(ARunnableS23S0200000_4 aRunnableS23S0200000_4) {
        boolean LIZ;
        try {
            aRunnableS23S0200000_4.LIZ$11();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$31(ARunnableS23S0200000_4 aRunnableS23S0200000_4) {
        boolean LIZ;
        try {
            aRunnableS23S0200000_4.LIZ$12();
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void run$32(ARunnableS23S0200000_4 aRunnableS23S0200000_4) {
        boolean LIZ;
        try {
            ((C56977MXt) aRunnableS23S0200000_4.l0).l0(((Number) ((C43I) aRunnableS23S0200000_4.l1).LIZ).intValue());
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void run$33(ARunnableS23S0200000_4 aRunnableS23S0200000_4) {
        boolean LIZ;
        try {
            ((C56975MXr) aRunnableS23S0200000_4.l0).l0(((Number) ((C43I) aRunnableS23S0200000_4.l1).LIZ).intValue());
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void run$34(ARunnableS23S0200000_4 aRunnableS23S0200000_4) {
        boolean LIZ;
        try {
            ((C56976MXs) aRunnableS23S0200000_4.l0).l0(((Number) ((C43I) aRunnableS23S0200000_4.l1).LIZ).intValue());
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$35(ARunnableS23S0200000_4 aRunnableS23S0200000_4) {
        boolean LIZ;
        try {
            DistrictFragment districtFragment = (DistrictFragment) aRunnableS23S0200000_4.l0;
            C78565UsT.LJJIJIIJIL(districtFragment, new C27387Aox(districtFragment, (DistrictPage) aRunnableS23S0200000_4.l1, null));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$36(ARunnableS23S0200000_4 aRunnableS23S0200000_4) {
        boolean LIZ;
        try {
            DistrictFragment districtFragment = (DistrictFragment) aRunnableS23S0200000_4.l0;
            C78565UsT.LJJIJIIJIL(districtFragment, new C27388Aoy(districtFragment, (DistrictPage) aRunnableS23S0200000_4.l1, null));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$37(ARunnableS23S0200000_4 aRunnableS23S0200000_4) {
        boolean LIZ;
        try {
            aRunnableS23S0200000_4.LIZ$13();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$38(ARunnableS23S0200000_4 aRunnableS23S0200000_4) {
        boolean LIZ;
        try {
            aRunnableS23S0200000_4.LIZ$14();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$39(ARunnableS23S0200000_4 aRunnableS23S0200000_4) {
        boolean LIZ;
        try {
            AnonymousClass979 anonymousClass979 = (AnonymousClass979) aRunnableS23S0200000_4.l0;
            C96V c96v = (C96V) aRunnableS23S0200000_4.l1;
            anonymousClass979.getClass();
            if (c96v == null) {
                return;
            }
            c96v.post(new ARunnableS40S0100000_4(c96v, 150));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS23S0200000_4 aRunnableS23S0200000_4) {
        boolean LIZ;
        boolean z;
        try {
            LiveOuterService.LJJJLL().LJJJIL();
            Boolean LIZ2 = C78473Uqz.LIZ();
            if (LIZ2 != null) {
                z = LIZ2.booleanValue();
            } else {
                z = false;
            }
            ProductDescVideoViewHolder productDescVideoViewHolder = (ProductDescVideoViewHolder) aRunnableS23S0200000_4.l0;
            C73062Slu c73062Slu = (C73062Slu) aRunnableS23S0200000_4.l1;
            productDescVideoViewHolder.getClass();
            if (!ProductDescVideoViewHolder.M(c73062Slu) && !z) {
                ((C73062Slu) aRunnableS23S0200000_4.l1).LJIIIIZZ();
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$40(ARunnableS23S0200000_4 aRunnableS23S0200000_4) {
        boolean LIZ;
        try {
            aRunnableS23S0200000_4.LIZ$15();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$41(ARunnableS23S0200000_4 aRunnableS23S0200000_4) {
        boolean LIZ;
        try {
            aRunnableS23S0200000_4.LIZ$16();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$42(ARunnableS23S0200000_4 aRunnableS23S0200000_4) {
        boolean LIZ;
        try {
            C71799SFv view = (C71799SFv) aRunnableS23S0200000_4.l0;
            o.LJIIIIZZ(view, "view");
            C71799SFv.LJIIJ(view, C78939UyV.LJ(((User) aRunnableS23S0200000_4.l1).getAvatarThumb()), null, false, null, 126);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$43(ARunnableS23S0200000_4 aRunnableS23S0200000_4) {
        boolean LIZ;
        try {
            ((ArrayList) ((C76930UHe) aRunnableS23S0200000_4.l0).LJLJJLL).add((ViewPropertyAnimator) aRunnableS23S0200000_4.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$44(ARunnableS23S0200000_4 aRunnableS23S0200000_4) {
        boolean LIZ;
        try {
            ((ArrayList) ((C76930UHe) aRunnableS23S0200000_4.l0).LJLJJLL).add((ViewPropertyAnimator) aRunnableS23S0200000_4.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$45(ARunnableS23S0200000_4 aRunnableS23S0200000_4) {
        boolean LIZ;
        try {
            List<ViewPropertyAnimator> list = ((C76930UHe) aRunnableS23S0200000_4.l0).LJLJJLL;
            ViewPropertyAnimator it = (ViewPropertyAnimator) aRunnableS23S0200000_4.l1;
            o.LJIIIIZZ(it, "it");
            ((ArrayList) list).add(it);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$46(ARunnableS23S0200000_4 aRunnableS23S0200000_4) {
        boolean LIZ;
        try {
            aRunnableS23S0200000_4.LIZ$17();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$47(ARunnableS23S0200000_4 aRunnableS23S0200000_4) {
        boolean LIZ;
        try {
            aRunnableS23S0200000_4.LIZ$18();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS23S0200000_4 aRunnableS23S0200000_4) {
        boolean LIZ;
        boolean z;
        try {
            LiveOuterService.LJJJLL().LJJJIL();
            Boolean LIZ2 = C78473Uqz.LIZ();
            if (LIZ2 != null) {
                z = LIZ2.booleanValue();
            } else {
                z = false;
            }
            ProductDescVideoViewHolder productDescVideoViewHolder = (ProductDescVideoViewHolder) aRunnableS23S0200000_4.l0;
            C73062Slu c73062Slu = (C73062Slu) aRunnableS23S0200000_4.l1;
            productDescVideoViewHolder.getClass();
            if (ProductDescVideoViewHolder.M(c73062Slu)) {
                ((C73062Slu) aRunnableS23S0200000_4.l1).LJII();
            } else if (!z) {
                ((C73062Slu) aRunnableS23S0200000_4.l1).LJIIIIZZ();
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(ARunnableS23S0200000_4 aRunnableS23S0200000_4) {
        boolean LIZ;
        try {
            C1IZ c1iz = (C1IZ) aRunnableS23S0200000_4.l0;
            c1iz.getClass();
            C2U8.LIZ(c1iz);
            ((VideoViewCell) aRunnableS23S0200000_4.l1).LLJLILLLLZIIL.J2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(ARunnableS23S0200000_4 aRunnableS23S0200000_4) {
        boolean LIZ;
        try {
            VideoViewCell videoViewCell = (VideoViewCell) aRunnableS23S0200000_4.l1;
            videoViewCell.LJLZ((Aweme) aRunnableS23S0200000_4.l0, videoViewCell.LJLLLL, true);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$8(ARunnableS23S0200000_4 aRunnableS23S0200000_4) {
        boolean LIZ;
        try {
            VideoItemParams videoItemParams = ((VideoViewCell) aRunnableS23S0200000_4.l1).LJLLJ;
            if (videoItemParams != null) {
                videoItemParams.setwidgetAweme((Aweme) aRunnableS23S0200000_4.l0);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$9(ARunnableS23S0200000_4 aRunnableS23S0200000_4) {
        boolean LIZ;
        try {
            ((VideoViewCell) aRunnableS23S0200000_4.l1).LLLIL((Aweme) aRunnableS23S0200000_4.l0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS23S0200000_4(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
