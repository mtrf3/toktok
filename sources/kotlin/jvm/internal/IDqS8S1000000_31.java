package kotlin.jvm.internal;

import X.ARN;
import X.AbstractC65781Prl;
import X.C113554cx;
import X.C76800UCe;
import X.C91924a2S;
import X.C92209a73;
import X.C92264a7w;
import X.C92273a85;
import X.C92289a8L;
import X.EnumC91916a2K;
import X.EnumC92024a44;
import X.InterfaceC88472Yns;
import X.OSZ;

/* loaded from: classes20.dex */
public class IDqS8S1000000_31 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public String s0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS8S1000000_31(String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
    }

    public static final Object invoke$0(IDqS8S1000000_31 iDqS8S1000000_31, Object obj) {
        return Boolean.valueOf(o.LJ(obj, iDqS8S1000000_31.s0));
    }

    public static final Object invoke$1(IDqS8S1000000_31 iDqS8S1000000_31, Object obj) {
        C92209a73 setState = (C92209a73) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C92209a73.LIZ(setState, EnumC91916a2K.ERROR, iDqS8S1000000_31.s0, false, null, null, null, 0L, null, null, null, null, null, null, null, null, null, null, false, 262140);
    }

    public static final Object invoke$2(IDqS8S1000000_31 iDqS8S1000000_31, Object obj) {
        C92273a85 setState = (C92273a85) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C92273a85.LIZ(setState, null, false, EnumC92024a44.API_ERROR, null, iDqS8S1000000_31.s0, 11);
    }

    public static final Object invoke$3(IDqS8S1000000_31 iDqS8S1000000_31, Object obj) {
        ARN it = (ARN) obj;
        o.LJIIIZ(it, "it");
        String str = iDqS8S1000000_31.s0;
        if (str == null) {
            str = "";
        }
        C91924a2S.LIZ(C91924a2S.LIZ, "fp_sdk_bnpl_popup_click", "bnpl_account_home", str, C113554cx.LJJLIIIJLLLLLLLZ(C113554cx.LJJLIIIIJ(new OSZ("obj_id", "got_it"), new OSZ("popup_id", ""))), 8);
        it.LIZ().LIZIZ(null);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(IDqS8S1000000_31 iDqS8S1000000_31, Object obj) {
        C92264a7w setState = (C92264a7w) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C92264a7w.LIZ(setState, false, EnumC91916a2K.ERROR, false, null, iDqS8S1000000_31.s0, 13);
    }

    public static final Object invoke$5(IDqS8S1000000_31 iDqS8S1000000_31, Object obj) {
        C92289a8L setState = (C92289a8L) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C92289a8L.LIZ(setState, iDqS8S1000000_31.s0, null, null, null, EnumC91916a2K.SUCCESS, 0L, 46);
    }
}
