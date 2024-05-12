package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C112254ar;
import X.C112264as;
import X.C17N;
import X.C3H1;
import X.C42625Go9;
import X.C4AJ;
import X.C76800UCe;
import X.HG3;
import X.InterfaceC88474Ynu;
import X.ORY;
import com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.StickerCardFallbackInfoComponent;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.InputView;

/* loaded from: classes2.dex */
public class IDqS448S0100000_1 extends AbstractC65781Prl implements InterfaceC88474Ynu {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC88474Ynu
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3, obj4);
            case 1:
                return invoke$1(this, obj, obj2, obj3, obj4);
            case 2:
                return invoke$2(this, obj, obj2, obj3, obj4);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS448S0100000_1(C4AJ c4aj, int i) {
        super(4);
        this.$t = i;
        this.l0 = c4aj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS448S0100000_1(C112254ar c112254ar, int i) {
        super(4);
        this.$t = i;
        this.l0 = c112254ar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS448S0100000_1(InputView inputView, int i) {
        super(4);
        this.$t = i;
        this.l0 = inputView;
    }

    public static final Object invoke$0(IDqS448S0100000_1 iDqS448S0100000_1, Object obj, Object obj2, Object obj3, Object obj4) {
        CharSequence charSequence = (CharSequence) obj;
        int intValue = ((Number) obj2).intValue();
        int intValue2 = ((Number) obj3).intValue();
        int intValue3 = ((Number) obj4).intValue();
        if (charSequence != null && charSequence.length() != 0 && intValue3 > 0 && intValue2 < charSequence.length() && charSequence.charAt((intValue + intValue3) - 1) == '@') {
            InputView inputView = (InputView) iDqS448S0100000_1.l0;
            if (!inputView.LLILII) {
                if (inputView.LLIL) {
                    C3H1.LIZIZ = "typing_box";
                    inputView.LLIL = false;
                } else {
                    C3H1.LIZIZ = "keyword";
                }
                inputView.LJJIL();
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS448S0100000_1 iDqS448S0100000_1, Object obj, Object obj2, Object obj3, Object obj4) {
        StickerCardFallbackInfoComponent stickerCardFallbackInfoComponent;
        StickerTemplate stickerTemplate = ((C4AJ) iDqS448S0100000_1.l0).LLIIL;
        if (stickerTemplate != null) {
            stickerCardFallbackInfoComponent = stickerTemplate.fallbackInfo;
        } else {
            stickerCardFallbackInfoComponent = null;
        }
        StickerCardFallbackInfoComponent.Companion.getClass();
        if (!o.LJ(stickerCardFallbackInfoComponent, StickerCardFallbackInfoComponent.EMPTY_FALLBACK)) {
            C17N.LJJLIIIJJI(((C4AJ) iDqS448S0100000_1.l0).LLIIIZ);
            C17N.LJJIIJZLJL(((C4AJ) iDqS448S0100000_1.l0).LLIIIL);
            C17N.LJJIIJZLJL(((C4AJ) iDqS448S0100000_1.l0).LLIIJI);
        } else {
            C17N.LJJLIIIJJI(((C4AJ) iDqS448S0100000_1.l0).LLIIIL);
            C17N.LJJIIJZLJL(((C4AJ) iDqS448S0100000_1.l0).LLIIIZ);
            C17N.LJJIIJZLJL(((C4AJ) iDqS448S0100000_1.l0).LLIIJI);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(IDqS448S0100000_1 iDqS448S0100000_1, Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj).intValue();
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        ((Number) obj3).intValue();
        if (ORY.LJJIJIIJIL(Integer.valueOf(intValue), new Integer[]{3, 2}) && booleanValue) {
            C112254ar c112254ar = (C112254ar) iDqS448S0100000_1.l0;
            c112254ar.getClass();
            C42625Go9.LIZJ(c112254ar);
            HG3.LJIIL();
            HG3.LJLJL.LJIILLIIL(new C112264as(c112254ar.LIZLLL));
        }
        return C76800UCe.LIZ;
    }
}
