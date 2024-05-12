package X;

import Y.AObserverS80S0100000_12;
import Y.ARunnableS11S0210000_12;
import Y.ARunnableS23S0300000_12;
import android.animation.Animator;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.anchor.viewmodel.ECommerceAnchorPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorPrivilegeItem;
import com.ss.android.ugc.aweme.ecommerce.model.PanelOpenInfo;
import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent;
import com.ss.android.ugc.aweme.utils.Au2S20S0100000_12;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S07 implements S0E {
    public final S04 LIZ;
    public S09 LIZIZ;

    @Override // X.S0E
    public final String LJI() {
        return "click_list";
    }

    @Override // X.S0E
    public final void LIZIZ() {
        TuxIconView tuxIconView;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ECommerceAnchorPanelViewModel viewModel = this.LIZ.getViewModel();
        S09 s09 = this.LIZIZ;
        if (s09 != null) {
            tuxIconView = s09.getIconView();
        } else {
            tuxIconView = null;
        }
        viewModel.lv0(tuxIconView, null);
        S09 s092 = this.LIZIZ;
        if (s092 != null) {
            Animator animator = s092.LJLJJL;
            if (animator != null) {
                animator.cancel();
            }
            View anchor_promotion_flow = s092.LIZ(R.id.a3s);
            o.LJIIIIZZ(anchor_promotion_flow, "anchor_promotion_flow");
            OUP.LJIJJLI(anchor_promotion_flow);
            ViewGroup.LayoutParams layoutParams = s092.LIZ(R.id.a2b).getLayoutParams();
            layoutParams.width = C45804HyK.LJJI(20);
            layoutParams.height = C45804HyK.LJJI(20);
            s092.LIZ(R.id.a2b).setLayoutParams(layoutParams);
            s092.LIZ(R.id.a2b).setAlpha(1.0f);
            View anchor_img_cover = s092.LIZ(R.id.a2a);
            o.LJIIIIZZ(anchor_img_cover, "anchor_img_cover");
            KL2.LJIILLIIL(4, anchor_img_cover);
            View anchor_buy_button = s092.LIZ(R.id.a1y);
            o.LJIIIIZZ(anchor_buy_button, "anchor_buy_button");
            OUP.LJIJJLI(anchor_buy_button);
            CharSequence text = ((AppCompatTextView) s092.LIZ(R.id.a3f)).getText();
            if (text != null && text.length() != 0) {
                View anchor_pre_title = s092.LIZ(R.id.a3f);
                o.LJIIIIZZ(anchor_pre_title, "anchor_pre_title");
                if (anchor_pre_title.getVisibility() != 0) {
                    View anchor_pre_title2 = s092.LIZ(R.id.a3f);
                    o.LJIIIIZZ(anchor_pre_title2, "anchor_pre_title");
                    OUP.LJJLIIIJ(anchor_pre_title2);
                    View anchor_title_div = s092.LIZ(R.id.a4o);
                    o.LJIIIIZZ(anchor_title_div, "anchor_title_div");
                    OUP.LJJLIIIJ(anchor_title_div);
                }
            }
            if (1.0f != s092.LIZ(R.id.a3f).getAlpha()) {
                s092.LIZ(R.id.a3f).setAlpha(1.0f);
            }
            ViewGroup.LayoutParams layoutParams2 = s092.LIZ(R.id.a3f).getLayoutParams();
            if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null && marginLayoutParams.getMarginStart() != 0) {
                marginLayoutParams.setMarginStart(0);
                s092.LIZ(R.id.a3f).setLayoutParams(marginLayoutParams);
            }
            S17 s17 = S17.LJLIL;
            ((TextView) s092.LIZ(R.id.a4n)).setMaxWidth(s092.LJLJJI);
            s092.post(new ARunnableS11S0210000_12((Object) s092, (C71791SFn) false, (boolean) s17, (List<ActionLinkComponent>) 3));
        }
    }

    @Override // X.S0E
    public final void LIZJ() {
        int i;
        String str;
        String privilegeText$ecommerce_video_release;
        S09 s09 = this.LIZIZ;
        if (s09 != null) {
            ShopWindowAnchorModel shopWindowAnchorModel = this.LIZ.getViewModel().LJLJL;
            String privilegeText$ecommerce_video_release2 = ((S0D) s09.LIZ(R.id.a3m)).getPrivilegeText$ecommerce_video_release();
            if ((privilegeText$ecommerce_video_release2 != null && privilegeText$ecommerce_video_release2.length() != 0) || ((privilegeText$ecommerce_video_release = ((S0D) s09.LIZ(R.id.a3n)).getPrivilegeText$ecommerce_video_release()) != null && privilegeText$ecommerce_video_release.length() != 0)) {
                s09.setPivotX(0.0f);
                s09.setPivotY(s09.getHeight());
                ConstraintLayout anchor_promotion_flow = (ConstraintLayout) s09.LIZ(R.id.a3s);
                o.LJIIIIZZ(anchor_promotion_flow, "anchor_promotion_flow");
                ViewTreeObserverOnPreDrawListenerC16840lM.LIZ(anchor_promotion_flow, new ARunnableS23S0300000_12(anchor_promotion_flow, s09, shopWindowAnchorModel, 1));
            }
        }
        C71395S0h.LIZ.getClass();
        if (C71395S0h.LIZIZ()) {
            i = 3;
        } else {
            i = 2;
        }
        ECommerceAnchorPanelViewModel viewModel = this.LIZ.getViewModel();
        S09 s092 = this.LIZIZ;
        if (s092 != null) {
            str = s092.getPromotionStyleInfo();
        } else {
            str = null;
        }
        ECommerceAnchorPanelViewModel.wv0(viewModel, true, str, 0, i, 4);
    }

    @Override // X.S0E
    public final void LIZLLL() {
        Context context = this.LIZ.getContext();
        o.LJIIIIZZ(context, "rootView.context");
        S09 s09 = new S09(context);
        this.LIZIZ = s09;
        this.LIZ.addView(s09);
    }

    @Override // X.S0E
    public final HashMap<String, String> LJ() {
        OSZ<Boolean, Integer> titleShowStateInfo$ecommerce_video_release;
        String str;
        HashMap<String, String> hashMap = new HashMap<>();
        S09 s09 = this.LIZIZ;
        if (s09 != null && (titleShowStateInfo$ecommerce_video_release = s09.getTitleShowStateInfo$ecommerce_video_release()) != null) {
            if (titleShowStateInfo$ecommerce_video_release.getFirst().booleanValue()) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            hashMap.put("is_content_truncate", str);
            hashMap.put("anchor_content_size", String.valueOf(titleShowStateInfo$ecommerce_video_release.getSecond().intValue()));
        }
        return hashMap;
    }

    public final ActivityC45651qj LJII() {
        Context context = this.LIZ.getContext();
        o.LJIIIIZZ(context, "rootView.context");
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        if (LJJIFFI != null) {
            return LJJIFFI;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.S0E
    public final void onInit() {
        TuxIconView tuxIconView;
        SY4 buyButton$ecommerce_video_release;
        String str;
        String str2;
        Aweme aweme;
        String str3;
        ECommerceAnchorPanelViewModel viewModel = this.LIZ.getViewModel();
        S09 s09 = this.LIZIZ;
        Aweme aweme2 = null;
        if (s09 != null) {
            tuxIconView = s09.getIconView();
        } else {
            tuxIconView = null;
        }
        viewModel.lv0(tuxIconView, null);
        S09 s092 = this.LIZIZ;
        if (s092 != null) {
            ShopWindowAnchorModel shopWindowAnchorModel = this.LIZ.getViewModel().LJLJL;
            if (shopWindowAnchorModel != null) {
                C71361RzZ.LIZ.getClass();
                str2 = C71361RzZ.LJJIJIIJI(shopWindowAnchorModel, false);
            } else {
                str2 = null;
            }
            C71361RzZ c71361RzZ = C71361RzZ.LIZ;
            InterfaceC44105HSr interfaceC44105HSr = this.LIZ.getViewModel().LJLIL;
            if (interfaceC44105HSr != null) {
                aweme = interfaceC44105HSr.LJJLL();
            } else {
                aweme = null;
            }
            c71361RzZ.getClass();
            if (C71361RzZ.LJIIL(aweme)) {
                str3 = C86V.LJFF(R.string.f_9);
            } else {
                str3 = null;
            }
            s092.LIZLLL(str2, str3);
        }
        S09 s093 = this.LIZIZ;
        if (s093 != null) {
            Resources resources = LJII().getResources();
            if (resources != null) {
                str = resources.getString(R.string.f72);
            } else {
                str = null;
            }
            s093.LIZJ(new AnchorPrivilegeItem(null, null, str, null), null, null);
        }
        C71361RzZ c71361RzZ2 = C71361RzZ.LIZ;
        InterfaceC44105HSr interfaceC44105HSr2 = this.LIZ.getViewModel().LJLIL;
        if (interfaceC44105HSr2 != null) {
            aweme2 = interfaceC44105HSr2.LJJLL();
        }
        c71361RzZ2.getClass();
        if (C71361RzZ.LJIILIIL(aweme2)) {
            this.LIZ.getViewModel().kv0(false, false);
            this.LIZ.getViewModel().LJLJJLL.observe(LJII(), new AObserverS80S0100000_12(this, 73));
        }
        S09 s094 = this.LIZIZ;
        if (s094 != null) {
            C16880lQ.LJIIJ(new Au2S20S0100000_12(this, 49, 42), s094);
        }
        S09 s095 = this.LIZIZ;
        if (s095 != null && (buyButton$ecommerce_video_release = s095.getBuyButton$ecommerce_video_release()) != null) {
            C16880lQ.LJIIJ(new Au2S20S0100000_12(this, 50, 42), buyButton$ecommerce_video_release);
        }
    }

    public S07(S04 rootView) {
        o.LJIIIZ(rootView, "rootView");
        this.LIZ = rootView;
    }

    @Override // X.S0E
    public final void LIZ(C188727au c188727au) {
        if (this.LIZ.isShown()) {
            ECommerceAnchorPanelViewModel.iv0(this.LIZ.getViewModel(), c188727au, null, null, 126);
        } else {
            ECommerceAnchorPanelViewModel.jv0(this.LIZ.getViewModel(), 7);
        }
    }

    @Override // X.S0E
    public final void LJFF(InterfaceC65784Pro<C76800UCe> commonClickAction) {
        o.LJIIIZ(commonClickAction, "commonClickAction");
    }

    public final void LJIIIIZZ(String str) {
        Aweme aweme;
        C71361RzZ c71361RzZ = C71361RzZ.LIZ;
        InterfaceC44105HSr interfaceC44105HSr = this.LIZ.getViewModel().LJLIL;
        Aweme aweme2 = null;
        if (interfaceC44105HSr != null) {
            aweme = interfaceC44105HSr.LJJLL();
        } else {
            aweme = null;
        }
        List<ShopWindowAnchorModel> list = this.LIZ.getViewModel().LJLJJL;
        c71361RzZ.getClass();
        if (C71361RzZ.LJIIZILJ(aweme, list, true)) {
            ECommerceAnchorPanelViewModel viewModel = this.LIZ.getViewModel();
            Context context = this.LIZ.getContext();
            o.LJIIIIZZ(context, "rootView.context");
            ECommerceAnchorPanelViewModel.tv0(viewModel, context, str, "ecom_panel", LJ(), 12);
            Context context2 = this.LIZ.getContext();
            o.LJIIIIZZ(context2, "rootView.context");
            ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context2);
            if (LJJIFFI != null) {
                PanelOpenInfo panelOpenInfo = new PanelOpenInfo(0, null, C71361RzZ.LJJIJL(this.LIZ.getViewModel().LJLJJL.size(), 2), true, 1, 3, null);
                InterfaceC44105HSr interfaceC44105HSr2 = this.LIZ.getViewModel().LJLIL;
                if (interfaceC44105HSr2 != null) {
                    aweme2 = interfaceC44105HSr2.LJJLL();
                }
                C71361RzZ.LJJJJL(c71361RzZ, LJJIFFI, C71360RzY.LJJIIZI(aweme2, this.LIZ.getViewModel().LJLIL, "video_single_anchor", panelOpenInfo, "video_single_anchor"), panelOpenInfo, this.LIZ.getViewModel().LJLIL, 16);
                return;
            }
            return;
        }
        ECommerceAnchorPanelViewModel.tv0(this.LIZ.getViewModel(), LJII(), str, "pdp", LJ(), 14);
    }
}
