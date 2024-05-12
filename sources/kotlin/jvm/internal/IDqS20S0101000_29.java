package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C76800UCe;
import X.C91139Zpn;
import X.C91506Zvi;
import X.InterfaceC65784Pro;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.dsp.playpage.card.upsell.UpsellLandingPageSlotAssem;

/* loaded from: classes22.dex */
public class IDqS20S0101000_29 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(IDqS20S0101000_29 iDqS20S0101000_29) {
        UpsellLandingPageSlotAssem upsellLandingPageSlotAssem = (UpsellLandingPageSlotAssem) iDqS20S0101000_29.l0;
        int i = iDqS20S0101000_29.i1;
        upsellLandingPageSlotAssem.getClass();
        float f = i * 0.037f;
        C91139Zpn c91139Zpn = upsellLandingPageSlotAssem.LLIFFJFJJ;
        if (c91139Zpn != null) {
            ViewGroup.LayoutParams layoutParams = c91139Zpn.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                int i2 = (int) f;
                marginLayoutParams.setMarginStart(i2);
                marginLayoutParams.setMarginEnd(i2);
                c91139Zpn.setLayoutParams(marginLayoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS20S0101000_29 iDqS20S0101000_29) {
        ((C91506Zvi) iDqS20S0101000_29.l0).LJJIIZI(iDqS20S0101000_29.i1);
        ((C91506Zvi) iDqS20S0101000_29.l0).LJJIIZ(iDqS20S0101000_29.i1);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS20S0101000_29(C91506Zvi c91506Zvi, int i) {
        super(0);
        this.$t = i;
        this.l0 = c91506Zvi;
        this.i1 = 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS20S0101000_29(UpsellLandingPageSlotAssem upsellLandingPageSlotAssem, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = upsellLandingPageSlotAssem;
        this.i1 = i;
    }
}
