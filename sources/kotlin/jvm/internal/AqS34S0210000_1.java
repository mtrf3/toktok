package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C112424b8;
import X.C16880lQ;
import X.C3L4;
import X.C76800UCe;
import X.C86550Xxy;
import X.C97933sr;
import X.InterfaceC65784Pro;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.specact.SpecActServiceImpl;
import java.util.List;

/* loaded from: classes2.dex */
public class AqS34S0210000_1 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

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

    public final void invoke$0() {
        C112424b8 c112424b8 = (C112424b8) this.l0;
        ViewGroup viewGroup = c112424b8.LIZIZ;
        if (viewGroup != null) {
            C16880lQ.LJLLL(c112424b8.LIZJ, viewGroup);
        }
        ((C112424b8) this.l0).LIZ = false;
        C86550Xxy.LIZIZ.LIZ(false, this.z2);
        SpecActServiceImpl.LJJJIL().LJIILIIL(false);
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) this.l1;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x003f, code lost:
    
        if ((!((java.util.List) r8.l0).isEmpty()) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AqS34S0210000_1 r8) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS34S0210000_1.invoke$0(kotlin.jvm.internal.AqS34S0210000_1):java.lang.Object");
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AqS34S0210000_1 aqS34S0210000_1) {
        aqS34S0210000_1.invoke$0();
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS34S0210000_1(C112424b8 c112424b8, C112424b8 c112424b82, boolean z, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(0);
        this.$t = interfaceC65784Pro;
        this.l0 = c112424b8;
        this.z2 = c112424b82;
        this.l1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS34S0210000_1(boolean z, boolean z2, List<C3L4> list, C97933sr c97933sr) {
        super(0);
        this.$t = c97933sr;
        this.z2 = z;
        this.l0 = z2;
        this.l1 = list;
    }
}
