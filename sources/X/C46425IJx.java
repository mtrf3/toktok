package X;

import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: X.IJx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46425IJx extends AbstractC65781Prl implements InterfaceC65784Pro<java.util.Map<String, ? extends String>> {
    public static final C46425IJx LJLIL = new C46425IJx();

    public C46425IJx() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map<java.lang.String, ? extends java.lang.String>, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final java.util.Map<String, ? extends String> invoke() {
        return SettingsManager.LIZLLL().LJIIIIZZ("octr_target_language_code", java.util.Map.class, null);
    }
}
