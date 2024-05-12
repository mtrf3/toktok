package X;

import Y.ARunnableS18S0101000_14;
import Y.ARunnableS6S0001000_11;
import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS39S1300000_6;

/* renamed from: X.FKz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38809FKz implements FL4 {
    public static final C38809FKz LIZ = new C38809FKz();
    public static final CopyOnWriteArrayList<InterfaceC65784Pro<C76800UCe>> LIZIZ = new CopyOnWriteArrayList<>();

    static {
        new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS6S0001000_11(1, 0));
    }

    @Override // X.FL4
    public final Object LIZ(Integer num, String str, InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro interfaceC65784Pro2) {
        int intValue;
        if (interfaceC65784Pro != null) {
            LIZIZ.add(new AqS39S1300000_6(str, (String) interfaceC65784Pro, (InterfaceC65784Pro<Object>) interfaceC65784Pro, (InterfaceC65784Pro<Object>) interfaceC65784Pro2, (InterfaceC65784Pro<Object>) 1));
        } else {
            if (interfaceC65784Pro2 == null) {
                return null;
            }
            LIZIZ.add(new AqS39S1300000_6(str, (String) interfaceC65784Pro2, (InterfaceC65784Pro<Object>) interfaceC65784Pro, (InterfaceC65784Pro<Object>) interfaceC65784Pro2, (InterfaceC65784Pro<Object>) 2));
        }
        Object LLFF = ORZ.LLFF(LIZIZ);
        if (num != null && (intValue = num.intValue()) > 0) {
            C38805FKv.LIZ.getClass();
            C38805FKv.LIZLLL().postDelayed(new ARunnableS18S0101000_14(3, LLFF, 23), intValue);
            return null;
        }
        return null;
    }
}
