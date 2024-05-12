package X;

import Y.ACListenerS46S0200000_12;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerCommerceBean;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.SiV, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72851SiV {
    public final ShortVideoContext LIZ;
    public final LinearLayout LIZIZ;
    public final InterfaceC72852SiW LIZJ;
    public W5G LIZLLL;
    public TextView LJ;

    public final boolean LIZ(Effect effect) {
        FaceStickerCommerceBean faceStickerCommerceBean;
        String str;
        FaceStickerBean LIZLLL = SFS.LIZLLL(effect);
        o.LJIIIIZZ(LIZLLL, "covert(effect)");
        if (effect != null && effect.isBusiness() && (faceStickerCommerceBean = LIZLLL.getFaceStickerCommerceBean()) != null && 1 == faceStickerCommerceBean.commerceStickerType) {
            this.LIZJ.LIZJ(String.valueOf(LIZLLL.getStickerId()));
            this.LIZIZ.setVisibility(0);
            C78764Uvg.LJIIIZ(this.LIZLLL, (String) ListProtector.get(LIZLLL.getIconUrl().getUrlList(), 0), -1, -1);
            TextView textView = this.LJ;
            if (textView != null) {
                FaceStickerCommerceBean faceStickerCommerceBean2 = LIZLLL.getFaceStickerCommerceBean();
                if (faceStickerCommerceBean2 != null) {
                    str = faceStickerCommerceBean2.commerceStickerBuyText;
                } else {
                    str = null;
                }
                textView.setText(str);
            }
            C16880lQ.LJIIZILJ(this.LIZIZ, new ACListenerS46S0200000_12(this, LIZLLL, 65));
            return true;
        }
        this.LIZIZ.setVisibility(8);
        return false;
    }

    public C72851SiV(ShortVideoContext shortVideoContext, LinearLayout linearLayout, InterfaceC72852SiW mobHelper) {
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        o.LJIIIZ(mobHelper, "mobHelper");
        this.LIZ = shortVideoContext;
        this.LIZIZ = linearLayout;
        this.LIZJ = mobHelper;
        this.LIZLLL = (W5G) linearLayout.findViewById(R.id.bof);
        this.LJ = (TextView) linearLayout.findViewById(R.id.boh);
    }
}
