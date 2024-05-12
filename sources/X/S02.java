package X;

import Y.AObserverS80S0100000_12;
import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.anchor.viewmodel.ECommerceAnchorPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowExtraModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.utils.Au2S20S0100000_12;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S02 implements S0E {
    public final S04 LIZ;
    public S08 LIZIZ;

    @Override // X.S0E
    public final String LJI() {
        return "click_list";
    }

    @Override // X.S0E
    public final void LIZIZ() {
        S08 s08 = this.LIZIZ;
        if (s08 != null) {
            C45804HyK.LJJIJIIJIL(s08.LIZ(R.id.a3s));
            C45804HyK.LJJLL(s08.LIZ(R.id.a22));
        }
        this.LIZ.getViewModel().LJLL = null;
    }

    @Override // X.S0E
    public final void LIZJ() {
        Aweme aweme;
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
            S08 s08 = this.LIZIZ;
            if (s08 != null) {
                s08.LIZIZ();
            }
            ECommerceAnchorPanelViewModel viewModel = this.LIZ.getViewModel();
            S08 s082 = this.LIZIZ;
            if (s082 != null) {
                str = s082.getPromotionStyleInfo();
            }
            ECommerceAnchorPanelViewModel.wv0(viewModel, true, str, 0, 0, 12);
        }
    }

    @Override // X.S0E
    public final void LIZLLL() {
        Context context = this.LIZ.getContext();
        o.LJIIIIZZ(context, "rootView.context");
        S08 s08 = new S08(context);
        this.LIZIZ = s08;
        this.LIZ.addView(s08);
    }

    @Override // X.S0E
    public final HashMap<String, String> LJ() {
        OSZ<Boolean, Integer> titleShowStateInfo$ecommerce_video_release;
        String str;
        HashMap<String, String> hashMap = new HashMap<>();
        S08 s08 = this.LIZIZ;
        if (s08 != null && (titleShowStateInfo$ecommerce_video_release = s08.getTitleShowStateInfo$ecommerce_video_release()) != null) {
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
        Aweme aweme;
        S08 s08;
        Aweme aweme2;
        String str;
        ECommerceAnchorPanelViewModel viewModel = this.LIZ.getViewModel();
        S08 s082 = this.LIZIZ;
        Aweme aweme3 = null;
        if (s082 != null) {
            tuxIconView = s082.getIconView();
        } else {
            tuxIconView = null;
        }
        S08 s083 = this.LIZIZ;
        if (s083 != null) {
            smartImageView = s083.getBubbleIconView();
        } else {
            smartImageView = null;
        }
        viewModel.lv0(tuxIconView, smartImageView);
        S08 s084 = this.LIZIZ;
        if (s084 != null) {
            String xv0 = this.LIZ.getViewModel().xv0();
            C71361RzZ c71361RzZ = C71361RzZ.LIZ;
            InterfaceC44105HSr interfaceC44105HSr = this.LIZ.getViewModel().LJLIL;
            if (interfaceC44105HSr != null) {
                aweme2 = interfaceC44105HSr.LJJLL();
            } else {
                aweme2 = null;
            }
            c71361RzZ.getClass();
            if (C71361RzZ.LJIIL(aweme2)) {
                str = C86V.LJFF(R.string.f_9);
            } else {
                str = null;
            }
            s084.LIZLLL(xv0, str);
        }
        C71361RzZ c71361RzZ2 = C71361RzZ.LIZ;
        InterfaceC44105HSr interfaceC44105HSr2 = this.LIZ.getViewModel().LJLIL;
        if (interfaceC44105HSr2 != null) {
            aweme = interfaceC44105HSr2.LJJLL();
        } else {
            aweme = null;
        }
        c71361RzZ2.getClass();
        if (C71361RzZ.LJIILIIL(aweme)) {
            this.LIZ.getViewModel().kv0(false, false);
            MutableLiveData<ShopWindowExtraModel> mutableLiveData = this.LIZ.getViewModel().LJLJJLL;
            Context context = this.LIZ.getContext();
            o.LJIIIIZZ(context, "rootView.context");
            ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
            if (LJJIFFI != null) {
                mutableLiveData.observe(LJJIFFI, new AObserverS80S0100000_12(this, 72));
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        InterfaceC44105HSr interfaceC44105HSr3 = this.LIZ.getViewModel().LJLIL;
        if (interfaceC44105HSr3 != null) {
            aweme3 = interfaceC44105HSr3.LJJLL();
        }
        if (C71361RzZ.LJIIZILJ(aweme3, this.LIZ.getViewModel().LJLJJL, true) && (s08 = this.LIZIZ) != null) {
            C16880lQ.LJIIJ(new Au2S20S0100000_12(this, 47, 42), s08);
        }
    }

    public S02(S04 rootView) {
        o.LJIIIZ(rootView, "rootView");
        this.LIZ = rootView;
    }

    @Override // X.S0E
    public final void LIZ(C188727au c188727au) {
        OSZ<Boolean, Integer> osz;
        HashMap hashMap;
        if (this.LIZ.isShown()) {
            S08 s08 = this.LIZIZ;
            if (s08 != null) {
                osz = s08.getTitleShowStateInfo$ecommerce_video_release();
            } else {
                osz = null;
            }
            ECommerceAnchorPanelViewModel viewModel = this.LIZ.getViewModel();
            if (osz != null) {
                hashMap = new HashMap();
                hashMap.put("is_content_truncate", osz.getFirst());
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
