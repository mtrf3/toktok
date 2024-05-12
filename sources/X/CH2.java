package X;

import android.os.Bundle;

/* loaded from: classes6.dex */
public final class CH2 extends AbstractC65781Prl implements InterfaceC65784Pro<java.util.Map<String, ? extends String>> {
    public static final CH2 INSTANCE = new CH2();

    public CH2() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final java.util.Map<String, ? extends String> invoke() {
        Boolean LJIILIIL;
        String str;
        String str2;
        String obj;
        Bundle bundle = new Bundle();
        C05060Hu c05060Hu = C05060Hu.LJIILIIL;
        C05060Hu c05060Hu2 = C05060Hu.LJIIJJI;
        C05060Hu c05060Hu3 = C05060Hu.LJIIL;
        C05060Hu[] c05060HuArr = {c05060Hu, c05060Hu2, c05060Hu3};
        InterfaceC09240Xw interfaceC09240Xw = (InterfaceC09240Xw) C44989HlB.LIZ.getValue();
        if (interfaceC09240Xw == null || (LJIILIIL = interfaceC09240Xw.LJIILIIL(c05060HuArr, bundle)) == null || !LJIILIIL.booleanValue()) {
            return C113554cx.LJJJLIIL();
        }
        OSZ[] oszArr = new OSZ[3];
        Object LLJJIII = C16880lQ.LLJJIII(bundle, c05060Hu.LIZ);
        String str3 = "-1";
        if (LLJJIII == null || (str = LLJJIII.toString()) == null) {
            str = "-1";
        }
        oszArr[0] = new OSZ("remain_memory", str);
        Object LLJJIII2 = C16880lQ.LLJJIII(bundle, c05060Hu2.LIZ);
        if (LLJJIII2 == null || (str2 = LLJJIII2.toString()) == null) {
            str2 = "-1";
        }
        oszArr[1] = new OSZ("temperature", str2);
        Object LLJJIII3 = C16880lQ.LLJJIII(bundle, c05060Hu3.LIZ);
        if (LLJJIII3 != null && (obj = LLJJIII3.toString()) != null) {
            str3 = obj;
        }
        oszArr[2] = new OSZ("battery_level", str3);
        return C113554cx.LJJLIIIIJ(oszArr);
    }
}
