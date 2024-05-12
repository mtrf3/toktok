package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C170576mj;
import X.C2068389v;
import X.C34K;
import X.C62Q;
import X.C76732zl;
import X.C76800UCe;
import X.C78688UuS;
import X.C83146WkA;
import X.HYV;
import X.InterfaceC88471Ynr;
import X.WI2;
import X.WIM;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.beauty.ComposerBeautyExtraBeautify;
import com.zhiliaoapp.musically.R;

/* loaded from: classes15.dex */
public class AqS176S0200000_14 extends AbstractC65781Prl implements InterfaceC88471Ynr {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    public final void LIZ$0(ComposerBeauty composerBeauty, ComposerBeautyExtraBeautify.ItemsBean beautifyBean) {
        o.LJIIIZ(composerBeauty, "composerBeauty");
        o.LJIIIZ(beautifyBean, "beautifyBean");
        float U7 = ((C83146WkA) this.l0).U7(composerBeauty, beautifyBean.getTag(), beautifyBean.getValue());
        if (beautifyBean.getValue() != U7) {
            if (U7 != 0.0f) {
                ((C76732zl) this.l1).element = 1;
                return;
            }
            C76732zl c76732zl = (C76732zl) this.l1;
            if (c76732zl.element == 1) {
                return;
            }
            c76732zl.element = 2;
            return;
        }
        if (U7 == 0.0f) {
            return;
        }
        C76732zl c76732zl2 = (C76732zl) this.l1;
        if (c76732zl2.element != 2) {
            return;
        }
        c76732zl2.element = 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS176S0200000_14(C34K c34k, WIM wim, int i) {
        super(2);
        this.$t = i;
        this.l0 = c34k;
        this.l1 = wim;
    }

    public static final Object invoke$0(AqS176S0200000_14 aqS176S0200000_14, Object obj, Object obj2) {
        C62Q view = (C62Q) obj;
        o.LJIIIZ(view, "view");
        o.LJIIIZ(obj2, "<anonymous parameter 1>");
        if (HYV.LIZ()) {
            ((C34K) aqS176S0200000_14.l0).element = !r1.element;
            WIM wim = (WIM) aqS176S0200000_14.l1;
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZIZ = (int) C170576mj.LIZ(C78688UuS.LJJIII(wim), 32.0f);
            c2068389v.LIZJ = (int) C170576mj.LIZ(C78688UuS.LJJIII(wim), 32.0f);
            c2068389v.LIZ = WI2.LIZ();
            c2068389v.LJ = Integer.valueOf(R.attr.dj);
            view.setIcon(c2068389v.LIZ(C78688UuS.LJJIII((WIM) aqS176S0200000_14.l1)));
            view.LIZ(((C34K) aqS176S0200000_14.l0).element);
            ((WIM) aqS176S0200000_14.l1).LJZI();
        } else {
            ((WIM) aqS176S0200000_14.l1).LJZI();
        }
        return C76800UCe.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$1(AqS176S0200000_14 aqS176S0200000_14, Object obj, Object obj2) {
        aqS176S0200000_14.LIZ$0((ComposerBeauty) obj, (ComposerBeautyExtraBeautify.ItemsBean) obj2);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS176S0200000_14(C83146WkA c83146WkA, C76732zl c76732zl, int i) {
        super(2);
        this.$t = i;
        this.l0 = c83146WkA;
        this.l1 = c76732zl;
    }
}
