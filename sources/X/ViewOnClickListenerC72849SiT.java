package X;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.ss.android.ugc.aweme.commerce.tools.common.CommerceToolsModel;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerCommerceBean;
import kotlin.jvm.internal.o;

/* renamed from: X.SiT, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class ViewOnClickListenerC72849SiT implements View.OnClickListener {
    public final /* synthetic */ CommerceToolsModel LJLIL;
    public final /* synthetic */ FaceStickerBean LJLILLLLZI;
    public final /* synthetic */ C72850SiU LJLJI;
    public final /* synthetic */ C143945ks LJLJJI;
    public final /* synthetic */ FaceStickerCommerceBean LJLJJL;

    public ViewOnClickListenerC72849SiT(CommerceToolsModel commerceToolsModel, FaceStickerBean faceStickerBean, C72850SiU c72850SiU, C143945ks c143945ks, FaceStickerCommerceBean faceStickerCommerceBean) {
        this.LJLIL = commerceToolsModel;
        this.LJLILLLLZI = faceStickerBean;
        this.LJLJI = c72850SiU;
        this.LJLJJI = c143945ks;
        this.LJLJJL = faceStickerCommerceBean;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.LJLIL.setShowedCommerceTransformButton(true);
        this.LJLIL.setShowedCommerceTransformBottomButton(false);
        C145995oB c145995oB = new C145995oB();
        c145995oB.LIZIZ(this.LJLILLLLZI.getStickerId(), "prop_id");
        c145995oB.LJI("shoot_way", this.LJLJI.LIZ);
        c145995oB.LJI("carrier_type", "video_shoot_page");
        GXR.LIZ("click_transform_link", c145995oB.LIZ);
        HF0 hf0 = C44172HVg.LJIIIZ;
        Activity requireActivity = this.LJLJJI.requireActivity();
        String str = this.LJLJJL.commerceStickerOpenUrl;
        hf0.getClass();
        if (!NO5.LJI(requireActivity, str, false)) {
            HF0 hf02 = C44172HVg.LJIIIZ;
            Activity requireActivity2 = this.LJLJJI.requireActivity();
            C143945ks c143945ks = this.LJLJJI;
            String str2 = this.LJLJJL.commerceStickerWebUrl;
            o.LJIIIIZZ(str2, "commerceBean.commerceStickerWebUrl");
            String valueOf = String.valueOf(this.LJLILLLLZI.getStickerId());
            c143945ks.getClass();
            if (!TextUtils.isEmpty(str2)) {
                Uri.Builder LIZIZ = C1EU.LIZIZ(str2, "enter_from", "commerce_sticker_button");
                if (TextUtils.isEmpty(valueOf)) {
                    valueOf = "";
                }
                str2 = LIZIZ.appendQueryParameter("sticker_id", valueOf).build().toString();
            }
            o.LJIIIIZZ(str2, "if (!TextUtils.isEmpty(u… else {\n        url\n    }");
            hf02.getClass();
            NO5.LJII(requireActivity2, str2, null);
        }
    }
}
