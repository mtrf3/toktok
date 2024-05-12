package X;

import com.bytedance.ies.android.base.runtime.depend.IALogDepend;
import kotlin.jvm.internal.o;

/* renamed from: X.N0b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58649N0b {
    public static final /* synthetic */ int LIZ = 0;

    public static InterfaceC58549MyP LIZ(InterfaceC58549MyP... interfaceC58549MyPArr) {
        int i = 1;
        if (interfaceC58549MyPArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        InterfaceC58549MyP interfaceC58549MyP = interfaceC58549MyPArr[0];
        int length = interfaceC58549MyPArr.length - 1;
        if (1 > length) {
            return interfaceC58549MyP;
        }
        while (true) {
            InterfaceC58549MyP other = interfaceC58549MyPArr[i];
            o.LJIIIZ(interfaceC58549MyP, "<this>");
            o.LJIIIZ(other, "other");
            C58550MyQ c58550MyQ = new C58550MyQ(interfaceC58549MyP, other);
            if (i != length) {
                i++;
                interfaceC58549MyP = c58550MyQ;
            } else {
                return c58550MyQ;
            }
        }
    }

    public static C58648N0a LIZIZ(String str) {
        IALogDepend iALogDepend = (IALogDepend) C59835Ne3.LJIIIZ.LIZ();
        if (iALogDepend != null) {
            return new C58648N0a(iALogDepend, str);
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
