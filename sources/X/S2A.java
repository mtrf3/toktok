package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.model.message.ext.PromotionItem;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommercelive.common.settings.PinCardRefactorSettings;
import java.util.List;

/* loaded from: classes13.dex */
public final class S2A extends S29<FrameLayout> {
    public S2A(FrameLayout frameLayout) {
        super(frameLayout);
    }

    public final void LJIILIIL(S2G s2g) {
        if (!PinCardRefactorSettings.LIZ().getPromotionEnable()) {
            LIZJ(false);
            return;
        }
        this.LIZLLL = false;
        this.LJFF = false;
        this.LJ = false;
        this.LJIIIIZZ.clear();
        ((ViewGroup) this.LIZ).removeAllViews();
        List<PromotionItem> list = s2g.LJLIL;
        if (!list.isEmpty()) {
            PromotionItem promotionItem = (PromotionItem) ListProtector.get(list, 0);
            if (S29.LJFF(promotionItem)) {
                this.LJFF = true;
                this.LJIIIIZZ.add(promotionItem);
                C68772mv LIZ = C68782mw.LIZ(s2g.LJLILLLLZI, s2g.LJLJI, promotionItem.getStartTime(), promotionItem.getEndTime());
                if (LIZ != null) {
                    LIZLLL(promotionItem, LIZ);
                }
            } else if (S29.LJ(promotionItem)) {
                this.LJIIIIZZ.add(promotionItem);
                LJI(promotionItem);
            } else if (!s2g.LJLJJI) {
                Integer type = promotionItem.getType();
                if (type != null && type.intValue() == 8) {
                    this.LIZLLL = true;
                }
                this.LJIIIIZZ.add(promotionItem);
                ViewGroup viewGroup = (ViewGroup) this.LIZ;
                Context context = this.LIZJ;
                EnumC70206Rgw enumC70206Rgw = EnumC70206Rgw.POP_CARD;
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -1);
                S2E s2e = this.LJIIJ.get(L3F.DEFAULT);
                if (s2e == null) {
                    s2e = new L3A();
                }
                viewGroup.addView(C70648Ro4.LIZLLL(context, promotionItem, enumC70206Rgw, marginLayoutParams, null, s2e.getTextFont(), LJIIJ()));
            }
            if (((ViewGroup) this.LIZ).getChildCount() > 0) {
                LIZJ(true);
                return;
            }
            return;
        }
        LIZJ(false);
    }
}
