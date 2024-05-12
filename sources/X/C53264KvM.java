package X;

import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: X.KvM, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53264KvM extends AbstractC65781Prl implements InterfaceC65784Pro<java.util.Map<String, ? extends String>> {
    public static final C53264KvM LJLIL = new C53264KvM();

    public C53264KvM() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map<java.lang.String, ? extends java.lang.String>, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final java.util.Map<String, ? extends String> invoke() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        java.util.Map<String, String> map = C53265KvN.LIZ;
        ?? LJIIIIZZ = LIZLLL.LJIIIIZZ("tiktok_account_sec_share_limit_pkg_config", java.util.Map.class, map);
        if (LJIIIIZZ == 0) {
            return map;
        }
        return LJIIIIZZ;
    }
}
