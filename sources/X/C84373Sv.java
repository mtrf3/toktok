package X;

/* renamed from: X.3Sv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C84373Sv extends AbstractC65781Prl implements InterfaceC65784Pro<java.util.Map<String, ? extends String>> {
    public static final C84373Sv LJLIL = new C84373Sv();

    public C84373Sv() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final java.util.Map<String, ? extends String> invoke() {
        return E2C.LIZJ("error_stack", android.util.Log.getStackTraceString(new IllegalStateException()));
    }
}
