package X;

import kotlin.jvm.internal.AqS161S0100000_11;
import kotlin.jvm.internal.AqS177S0100000_11;

/* loaded from: classes12.dex */
public final class RC3 extends AbstractC69028R7g {
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LIZ;
    public final /* synthetic */ InterfaceC88472Yns<String, C76800UCe> LIZIZ;

    @Override // X.QQE
    public final void onResponse(R40<C69024R7c> r40) {
        String str;
        if (r40 != null && r40.LIZIZ) {
            this.LIZ.invoke();
            return;
        }
        InterfaceC88472Yns<String, C76800UCe> interfaceC88472Yns = this.LIZIZ;
        if (r40 != null) {
            str = r40.LJFF;
        } else {
            str = null;
        }
        interfaceC88472Yns.invoke(str);
    }

    public RC3(AqS161S0100000_11 aqS161S0100000_11, AqS177S0100000_11 aqS177S0100000_11) {
        this.LIZ = aqS161S0100000_11;
        this.LIZIZ = aqS177S0100000_11;
    }
}
