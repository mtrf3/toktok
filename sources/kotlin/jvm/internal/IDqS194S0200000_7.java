package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C16880lQ;
import X.C34K;
import X.C41944GdA;
import X.C45828Hyi;
import X.C45831Hyl;
import X.C46245ICz;
import X.C76800UCe;
import X.HB7;
import X.InterfaceC139745e6;
import X.InterfaceC45328Hqe;
import X.InterfaceC45841Hyv;
import X.InterfaceC88474Ynu;
import android.content.Context;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* loaded from: classes8.dex */
public class IDqS194S0200000_7 extends AbstractC65781Prl implements InterfaceC88474Ynu {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC88474Ynu
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3, obj4);
            case 1:
                return invoke$1(this, obj, obj2, obj3, obj4);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS194S0200000_7(C34K c34k, C45831Hyl c45831Hyl, int i) {
        super(4);
        this.$t = i;
        this.l0 = c34k;
        this.l1 = c45831Hyl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS194S0200000_7(C46245ICz c46245ICz, C46245ICz c46245ICz2, InterfaceC139745e6<InterfaceC45328Hqe> interfaceC139745e6) {
        super(4);
        this.$t = interfaceC139745e6;
        this.l0 = c46245ICz;
        this.l1 = c46245ICz2;
    }

    public final void invoke$0(Effect effect, String key, String path, boolean z) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(path, "path");
        String LIZIZ = C41944GdA.LIZIZ(HB7.LIZ);
        Context LLLLLIL = C16880lQ.LLLLLIL(((C46245ICz) this.l0).LJLLILLLL);
        o.LJIIIIZZ(LLLLLIL, "activity.applicationContext");
        C41944GdA.LIZLLL(path, LIZIZ, null, LLLLLIL, new AqS173S0100000_7((InterfaceC139745e6) this.l1, key, 470));
    }

    public static final Object invoke$0(IDqS194S0200000_7 iDqS194S0200000_7, Object obj, Object obj2, Object obj3, Object obj4) {
        ((Number) obj2).longValue();
        int intValue = ((Number) obj3).intValue();
        String errorMsg = (String) obj4;
        o.LJIIIZ(obj, "<anonymous parameter 0>");
        o.LJIIIZ(errorMsg, "errorMsg");
        ((C34K) iDqS194S0200000_7.l0).element = true;
        if (intValue != -12) {
            ((InterfaceC45841Hyv) iDqS194S0200000_7.l1).LIZ(C45828Hyi.LIZ(C45828Hyi.LJIILIIL, 0, null, errorMsg, 7));
        }
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(IDqS194S0200000_7 iDqS194S0200000_7, Object obj, Object obj2, Object obj3, Object obj4) {
        iDqS194S0200000_7.invoke$0((Effect) obj, (String) obj2, (String) obj3, ((Boolean) obj4).booleanValue());
        return C76800UCe.LIZ;
    }
}
