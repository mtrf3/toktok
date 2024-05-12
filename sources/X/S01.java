package X;

import Y.AObserverS80S0100000_12;
import Y.ARunnableS27S0200000_8;
import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.anchor.viewmodel.ECommerceAnchorPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowExtraModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S01 implements S0E {
    public final S03 LIZ;
    public S0A LIZIZ;

    @Override // X.S0E
    public final void LIZIZ() {
        S0A s0a = this.LIZIZ;
        if (s0a != null) {
            C45804HyK.LJJIJIIJIL(s0a.LIZ(R.id.a3s));
            C45804HyK.LJJLL(s0a.LIZ(R.id.a22));
        }
        this.LIZ.getViewModel().LJLL = null;
    }

    @Override // X.S0E
    public final void LIZJ() {
        Aweme aweme;
        String privilegeText$ecommerce_video_release;
        String privilegeText$ecommerce_video_release2;
        C71361RzZ c71361RzZ = C71361RzZ.LIZ;
        InterfaceC44105HSr interfaceC44105HSr = this.LIZ.getViewModel().LJLIL;
        String str = null;
        if (interfaceC44105HSr != null) {
            aweme = interfaceC44105HSr.LJJLL();
        } else {
            aweme = null;
        }
        c71361RzZ.getClass();
        if (C71361RzZ.LJIILJJIL(aweme)) {
            S0A s0a = this.LIZIZ;
            if (s0a != null && (((privilegeText$ecommerce_video_release = ((S0D) s0a.LIZ(R.id.a3m)).getPrivilegeText$ecommerce_video_release()) != null && privilegeText$ecommerce_video_release.length() != 0) || ((privilegeText$ecommerce_video_release2 = ((S0D) s0a.LIZ(R.id.a3n)).getPrivilegeText$ecommerce_video_release()) != null && privilegeText$ecommerce_video_release2.length() != 0))) {
                s0a.setPivotX(0.0f);
                s0a.setPivotY(s0a.getHeight());
                C119774mz anchor_promotion_flow = (C119774mz) s0a.LIZ(R.id.a3s);
                o.LJIIIIZZ(anchor_promotion_flow, "anchor_promotion_flow");
                ViewTreeObserverOnPreDrawListenerC16840lM.LIZ(anchor_promotion_flow, new ARunnableS27S0200000_8(s0a, anchor_promotion_flow, 69));
            }
            ECommerceAnchorPanelViewModel viewModel = this.LIZ.getViewModel();
            S0A s0a2 = this.LIZIZ;
            if (s0a2 != null) {
                str = s0a2.getPromotionStyleInfo();
            }
            ECommerceAnchorPanelViewModel.wv0(viewModel, false, str, 1, 0, 8);
        }
    }

    @Override // X.S0E
    public final void LIZLLL() {
        Context context = this.LIZ.getContext();
        o.LJIIIIZZ(context, "rootView.context");
        S0A s0a = new S0A(context);
        this.LIZIZ = s0a;
        this.LIZ.addView(s0a);
    }

    @Override // X.S0E
    public final HashMap<String, String> LJ() {
        OSZ<Boolean, Integer> titleShowStateInfo$ecommerce_video_release;
        String str;
        HashMap<String, String> hashMap = new HashMap<>();
        S0A s0a = this.LIZIZ;
        if (s0a != null && (titleShowStateInfo$ecommerce_video_release = s0a.getTitleShowStateInfo$ecommerce_video_release()) != null) {
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

    @Override // X.S0E
    public final String LJI() {
        S0A s0a = this.LIZIZ;
        if (s0a != null && s0a.LJLJI) {
            return "click_anchor";
        }
        return "click_list";
    }

    @Override // X.S0E
    public final void onInit() {
        TuxIconView tuxIconView;
        SmartImageView smartImageView;
        ECommerceAnchorPanelViewModel viewModel = this.LIZ.getViewModel();
        S0A s0a = this.LIZIZ;
        Aweme aweme = null;
        if (s0a != null) {
            tuxIconView = s0a.getIconView();
        } else {
            tuxIconView = null;
        }
        S0A s0a2 = this.LIZIZ;
        if (s0a2 != null) {
            smartImageView = s0a2.getBubbleIconView();
        } else {
            smartImageView = null;
        }
        viewModel.lv0(tuxIconView, smartImageView);
        S0A s0a3 = this.LIZIZ;
        if (s0a3 != null) {
            s0a3.LIZIZ(this.LIZ.getViewModel().yv0(), null);
        }
        S0A s0a4 = this.LIZIZ;
        if (s0a4 != null) {
            s0a4.setSuffix(this.LIZ.getViewModel().LJLJJI);
        }
        C71361RzZ c71361RzZ = C71361RzZ.LIZ;
        InterfaceC44105HSr interfaceC44105HSr = this.LIZ.getViewModel().LJLIL;
        if (interfaceC44105HSr != null) {
            aweme = interfaceC44105HSr.LJJLL();
        }
        c71361RzZ.getClass();
        if (C71361RzZ.LJIILIIL(aweme)) {
            this.LIZ.getViewModel().kv0(true, true);
            MutableLiveData<ShopWindowExtraModel> mutableLiveData = this.LIZ.getViewModel().LJLJJLL;
            Context context = this.LIZ.getContext();
            o.LJIIIIZZ(context, "rootView.context");
            ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
            if (LJJIFFI != null) {
                mutableLiveData.observe(LJJIFFI, new AObserverS80S0100000_12(this, 71));
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
    }

    public S01(S03 rootView) {
        o.LJIIIZ(rootView, "rootView");
        this.LIZ = rootView;
    }

    @Override // X.S0E
    public final void LIZ(C188727au c188727au) {
        OSZ<Boolean, Integer> osz;
        if (this.LIZ.isShown()) {
            S0A s0a = this.LIZIZ;
            HashMap hashMap = null;
            if (s0a != null) {
                osz = s0a.getTitleShowStateInfo$ecommerce_video_release();
            } else {
                osz = null;
            }
            ECommerceAnchorPanelViewModel viewModel = this.LIZ.getViewModel();
            if (osz != null) {
                hashMap = new HashMap();
                hashMap.put("is_content_truncate", osz.getFirst());
                hashMap.put("anchor_content_size", osz.getSecond());
            }
            ECommerceAnchorPanelViewModel.iv0(viewModel, c188727au, "video_main_anchor", hashMap, 14);
            return;
        }
        ECommerceAnchorPanelViewModel.jv0(this.LIZ.getViewModel(), 3);
    }

    @Override // X.S0E
    public final void LJFF(InterfaceC65784Pro<C76800UCe> commonClickAction) {
        o.LJIIIZ(commonClickAction, "commonClickAction");
        S0A s0a = this.LIZIZ;
        if (s0a != null) {
            C16880lQ.LJIIJ(new C71369Rzh(this, commonClickAction), s0a);
        }
    }
}
