package X;

import android.app.Activity;
import android.app.Dialog;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.commercialize.ba.impl.service.BAAnchorServiceImpl;
import com.ss.android.ugc.aweme.commercialize.depend.AdTaskDependImpl;
import com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.HSb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44089HSb extends HSS {
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(new AqS157S0100000_7(this, 463));
    public boolean LJLJLLL;

    @Override // X.S1E
    public final S1E clone() {
        return new C44089HSb();
    }

    @Override // X.HSS, X.S1E
    public final int type() {
        return EnumC42934Gt8.BA_PRODUCT_ANCHOR.getTYPE();
    }

    @Override // X.HSS, X.S1E
    public final void LJ(C188727au eventMapBuilder) {
        o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        super.LJ(eventMapBuilder);
        if (LJJII().isAd()) {
            C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "othershow", LJJII().getAwemeRawAd());
            LIZLLL.LIZJ("product_link_anchor", "refer");
            LIZLLL.LJI();
        } else {
            LJJJJJ("ttelite_ba_product_link_anchor_show");
        }
        this.LJLJLLL = true;
    }

    @Override // X.S1E
    public final void LJIIIIZZ(C188727au eventMapBuilder) {
        String schema;
        String str;
        o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        HSS.LJJIZ(this, eventMapBuilder, 6);
        if (LJJII().isAd()) {
            AnchorCommonStruct anchorCommonStruct = (AnchorCommonStruct) this.LJLJLJ.getValue();
            if (anchorCommonStruct == null || (schema = anchorCommonStruct.getSchema()) == null) {
                return;
            }
            AwemeRawAd awemeRawAd = LJJII().getAwemeRawAd();
            if (awemeRawAd != null && o.LJ(awemeRawAd.getEnableSoftAdAnchorClick(), Boolean.TRUE)) {
                str = "click";
            } else {
                str = "otherclick";
            }
            C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", str, LJJII().getAwemeRawAd());
            LIZLLL.LIZJ("product_link_anchor", "refer");
            LIZLLL.LJI();
            IAdTaskDepend LJIIZILJ = AdTaskDependImpl.LJIIZILJ();
            Activity LJJI = LJJI();
            AwemeRawAd awemeRawAd2 = LJJII().getAwemeRawAd();
            String aid = LJJII().getAid();
            o.LJIIIIZZ(aid, "aweme().aid");
            LJIIZILJ.LJIIJ(LJJI, awemeRawAd2, schema, "", aid, 69);
            return;
        }
        LJJJJJ("ttelite_ba_product_link_anchor_click");
        BAAnchorServiceImpl.LJII().LIZ(LJJI(), (AnchorCommonStruct) this.LJLJLJ.getValue(), LJJII(), LJIIIZ().LJJLIIIJLLLLLLLZ());
        LJJJJJ("ttelite_ba_video_product_anchor_9_exp");
    }

    public final void LJJJJJ(String str) {
        String LJJLIIIJLLLLLLLZ = LJIIIZ().LJJLIIIJLLLLLLLZ();
        if (TextUtils.equals(str, "ttelite_ba_product_link_anchor_show") && TextUtils.equals(LJJLIIIJLLLLLLLZ, "comment_anchor")) {
            return;
        }
        new C237559Tz().LJJII(LJJII(), null, str, LJJLIIIJLLLLLLLZ);
    }

    @Override // X.HSW, X.S1E
    public final void LJIJ(Activity activity, Dialog dialog) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(dialog, "dialog");
        super.LJIJ(activity, dialog);
        this.LJLJLLL = false;
    }

    @Override // X.HSS, X.S1E
    public final void LJIIJ(ViewGroup viewGroup, Dialog dialog, C188727au c188727au, int i) {
        o.LJIIIZ(dialog, "dialog");
        super.LJIIJ(viewGroup, dialog, c188727au, i);
        if (!this.LJLJLLL) {
            LJJJJJ("ttelite_ba_product_link_anchor_show");
            this.LJLJLLL = true;
        }
    }
}
