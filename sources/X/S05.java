package X;

import android.content.Context;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.anchor.viewmodel.ECommerceAnchorPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.utils.Au2S20S0100000_12;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S05 implements S0E {
    public final S04 LIZ;
    public S0B LIZIZ;

    @Override // X.S0E
    public final void LIZIZ() {
    }

    @Override // X.S0E
    public final void LIZJ() {
    }

    @Override // X.S0E
    public final String LJI() {
        return "click_list";
    }

    @Override // X.S0E
    public final void LIZLLL() {
        Context context = this.LIZ.getContext();
        o.LJIIIIZZ(context, "rootView.context");
        S0B s0b = new S0B(context);
        this.LIZIZ = s0b;
        this.LIZ.addView(s0b);
    }

    @Override // X.S0E
    public final HashMap<String, String> LJ() {
        OSZ<Boolean, Integer> titleShowStateInfo$ecommerce_video_release;
        String str;
        HashMap<String, String> hashMap = new HashMap<>();
        S0B s0b = this.LIZIZ;
        if (s0b != null && (titleShowStateInfo$ecommerce_video_release = s0b.getTitleShowStateInfo$ecommerce_video_release()) != null) {
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
    public final void onInit() {
        TuxIconView tuxIconView;
        SmartImageView smartImageView;
        S0B s0b;
        ECommerceAnchorPanelViewModel viewModel = this.LIZ.getViewModel();
        S0B s0b2 = this.LIZIZ;
        Aweme aweme = null;
        if (s0b2 != null) {
            tuxIconView = s0b2.getIconView();
        } else {
            tuxIconView = null;
        }
        S0B s0b3 = this.LIZIZ;
        if (s0b3 != null) {
            smartImageView = s0b3.getBubbleIconView();
        } else {
            smartImageView = null;
        }
        viewModel.lv0(tuxIconView, smartImageView);
        S0B s0b4 = this.LIZIZ;
        if (s0b4 != null) {
            s0b4.LIZIZ(this.LIZ.getViewModel().xv0(), null);
        }
        C71361RzZ c71361RzZ = C71361RzZ.LIZ;
        InterfaceC44105HSr interfaceC44105HSr = this.LIZ.getViewModel().LJLIL;
        if (interfaceC44105HSr != null) {
            aweme = interfaceC44105HSr.LJJLL();
        }
        List<ShopWindowAnchorModel> list = this.LIZ.getViewModel().LJLJJL;
        c71361RzZ.getClass();
        if (C71361RzZ.LJIIZILJ(aweme, list, true) && (s0b = this.LIZIZ) != null) {
            C16880lQ.LJIIJ(new Au2S20S0100000_12(this, 48, 42), s0b);
        }
    }

    public S05(S04 rootView) {
        o.LJIIIZ(rootView, "rootView");
        this.LIZ = rootView;
    }

    @Override // X.S0E
    public final void LIZ(C188727au c188727au) {
        OSZ<Boolean, Integer> osz;
        HashMap hashMap;
        if (this.LIZ.isShown()) {
            S0B s0b = this.LIZIZ;
            if (s0b != null) {
                osz = s0b.getTitleShowStateInfo$ecommerce_video_release();
            } else {
                osz = null;
            }
            ECommerceAnchorPanelViewModel viewModel = this.LIZ.getViewModel();
            if (osz != null) {
                hashMap = new HashMap();
                hashMap.put("is_content_truncate", Integer.valueOf(osz.getFirst().booleanValue() ? 1 : 0));
                hashMap.put("anchor_content_size", osz.getSecond());
            } else {
                hashMap = null;
            }
            ECommerceAnchorPanelViewModel.iv0(viewModel, c188727au, null, hashMap, 62);
            return;
        }
        ECommerceAnchorPanelViewModel.jv0(this.LIZ.getViewModel(), 7);
    }

    @Override // X.S0E
    public final void LJFF(InterfaceC65784Pro<C76800UCe> commonClickAction) {
        o.LJIIIZ(commonClickAction, "commonClickAction");
    }
}
