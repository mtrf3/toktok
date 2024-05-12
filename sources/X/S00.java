package X;

import Y.AObserverS80S0100000_12;
import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.anchor.viewmodel.ECommerceAnchorPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowExtraModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S00 implements S0E {
    public final S03 LIZ;
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
            ECommerceAnchorPanelViewModel.wv0(viewModel, false, str, 0, 0, 12);
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
        return new HashMap<>();
    }

    @Override // X.S0E
    public final void onInit() {
        TuxIconView tuxIconView;
        SmartImageView smartImageView;
        ECommerceAnchorPanelViewModel viewModel = this.LIZ.getViewModel();
        S08 s08 = this.LIZIZ;
        Aweme aweme = null;
        if (s08 != null) {
            tuxIconView = s08.getIconView();
        } else {
            tuxIconView = null;
        }
        S08 s082 = this.LIZIZ;
        if (s082 != null) {
            smartImageView = s082.getBubbleIconView();
        } else {
            smartImageView = null;
        }
        viewModel.lv0(tuxIconView, smartImageView);
        S08 s083 = this.LIZIZ;
        if (s083 != null) {
            s083.LIZLLL(this.LIZ.getViewModel().xv0(), null);
        }
        S08 s084 = this.LIZIZ;
        if (s084 != null) {
            s084.setSuffix(this.LIZ.getViewModel().LJLJJI);
        }
        C71361RzZ c71361RzZ = C71361RzZ.LIZ;
        InterfaceC44105HSr interfaceC44105HSr = this.LIZ.getViewModel().LJLIL;
        if (interfaceC44105HSr != null) {
            aweme = interfaceC44105HSr.LJJLL();
        }
        c71361RzZ.getClass();
        if (C71361RzZ.LJIILIIL(aweme)) {
            this.LIZ.getViewModel().kv0(true, false);
            MutableLiveData<ShopWindowExtraModel> mutableLiveData = this.LIZ.getViewModel().LJLJJLL;
            Context context = this.LIZ.getContext();
            o.LJIIIIZZ(context, "rootView.context");
            ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
            if (LJJIFFI != null) {
                mutableLiveData.observe(LJJIFFI, new AObserverS80S0100000_12(this, 70));
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
    }

    public S00(S03 rootView) {
        o.LJIIIZ(rootView, "rootView");
        this.LIZ = rootView;
    }

    @Override // X.S0E
    public final void LIZ(C188727au c188727au) {
        if (this.LIZ.isShown()) {
            ECommerceAnchorPanelViewModel.iv0(this.LIZ.getViewModel(), c188727au, null, null, 110);
        } else {
            ECommerceAnchorPanelViewModel.jv0(this.LIZ.getViewModel(), 3);
        }
    }

    @Override // X.S0E
    public final void LJFF(InterfaceC65784Pro<C76800UCe> commonClickAction) {
        o.LJIIIZ(commonClickAction, "commonClickAction");
        S08 s08 = this.LIZIZ;
        if (s08 != null) {
            C16880lQ.LJIIJ(new C71371Rzj(this, commonClickAction), s08);
        }
    }
}
