package X;

import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.OfU, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62472OfU extends C0CJ {
    public final /* synthetic */ C62473OfV LJLIL;

    public C62472OfU(C62473OfV c62473OfV) {
        this.LJLIL = c62473OfV;
    }

    @Override // X.C0CJ
    public final void LIZJ(int i) {
        BaseSharePackage sharePackage = this.LJLIL.getSharePackage();
        if (sharePackage != null) {
            C62473OfV c62473OfV = this.LJLIL;
            String str = "";
            if (i >= c62473OfV.LJLJI.size()) {
                sharePackage.extras.putString("share_campaign_id", "");
                sharePackage.extras.putString("share_template_id", "");
                sharePackage.extras.putString("share_display_tag_id", "");
                sharePackage.extras.putString("share_copy_id", "");
            } else {
                sharePackage.extras.putString("share_campaign_id", c62473OfV.LJLJJI);
                if (i < c62473OfV.LJLJI.size()) {
                    str = (String) ListProtector.get(c62473OfV.LJLJI, i);
                    sharePackage.extras.putString("share_template_id", str);
                    sharePackage.extras.putString("share_copy_id", (String) ListProtector.get(c62473OfV.LJLJI, i));
                }
                sharePackage.extras.putString("share_display_tag_id", c62473OfV.LJLJJL);
            }
            C62467OfP.LIZ(sharePackage, str, i);
        }
        if (i == 0) {
            View ttv_card_view_tip = this.LJLIL.LIZ(R.id.lt_);
            o.LJIIIIZZ(ttv_card_view_tip, "ttv_card_view_tip");
            ttv_card_view_tip.setVisibility(0);
        } else {
            View ttv_card_view_tip2 = this.LJLIL.LIZ(R.id.lt_);
            o.LJIIIIZZ(ttv_card_view_tip2, "ttv_card_view_tip");
            ttv_card_view_tip2.setVisibility(4);
        }
    }
}
