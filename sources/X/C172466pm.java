package X;

/* renamed from: X.6pm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C172466pm {
    public static InterfaceC172536pt LIZ;

    public static final void LIZIZ(String str) {
        InterfaceC172536pt interfaceC172536pt = LIZ;
        if (interfaceC172536pt != null) {
            if (str == null) {
                str = "";
            }
            interfaceC172536pt.i(str);
            return;
        }
        throw new IllegalStateException("Log service not initialized");
    }

    public static final void LIZ(String str, String str2) {
        InterfaceC172536pt interfaceC172536pt = LIZ;
        if (interfaceC172536pt != null) {
            if (str2 == null) {
                str2 = "";
            }
            interfaceC172536pt.d(str, str2);
            return;
        }
        throw new IllegalStateException("Log service not initialized");
    }
}
