package X;

import Y.ACallableS104S0100000_1;
import Y.ARunnableS12S0300000_1;
import Y.ARunnableS1S1300000_1;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.33k, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C777633k {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, C777833m c777833m) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) C777433i.LIZ;
        C73318Sq2 c73318Sq2 = (C73318Sq2) concurrentHashMap.get(str);
        if (c73318Sq2 == null) {
            c73318Sq2 = new C73318Sq2();
            concurrentHashMap.put(str, c73318Sq2);
        }
        c73318Sq2.LIZ(c777833m);
    }

    public static void LIZIZ(String str, C60692Zt c60692Zt, Runnable runnable) {
        InterfaceC115714gR LJII = AbstractC73672Svk.LJJIIJZLJL(new ACallableS104S0100000_1(runnable, 16)).LJII(C80383Dm.LIZ(c60692Zt));
        C777833m c777833m = new C777833m(c60692Zt);
        LJII.LIZ(c777833m);
        LIZ(str, c777833m);
    }

    public static void LIZJ(String str, final C60692Zt c60692Zt, ARunnableS12S0300000_1 aRunnableS12S0300000_1, final ARunnableS1S1300000_1 aRunnableS1S1300000_1) {
        C3EO c3eo;
        CallableC73559Stv LJJIIJZLJL = AbstractC73672Svk.LJJIIJZLJL(new ACallableS104S0100000_1(aRunnableS12S0300000_1, 17));
        if (c60692Zt != null) {
            c3eo = C80383Dm.LIZ(c60692Zt);
        } else {
            c3eo = null;
        }
        InterfaceC115714gR LJII = LJJIIJZLJL.LJII(c3eo);
        C777833m<Boolean> c777833m = new C777833m<Boolean>(c60692Zt) { // from class: X.33l
            @Override // X.C777833m, X.InterfaceC116954iR
            public final void onComplete() {
                aRunnableS1S1300000_1.run();
                dispose();
            }
        };
        LJII.LIZ(c777833m);
        LIZ(str, c777833m);
    }
}
