package X;

/* renamed from: X.Fm0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39944Fm0 implements InterfaceC39940Flw {
    public static final C39944Fm0 LIZ = new C39944Fm0();

    @Override // X.InterfaceC39940Flw
    public final void loadLibrary(String str) {
        try {
            C16880lQ.LLJJJIL(str);
        } catch (Throwable th) {
            String message = th.getMessage();
            if (message != null) {
                C39048FUe.LIZIZ.LIZ(message, EnumC39866Fkk.E, "LynxKitEnv");
            }
        }
    }
}
