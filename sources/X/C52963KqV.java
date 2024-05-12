package X;

import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: X.KqV, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C52963KqV extends AbstractC65781Prl implements InterfaceC65784Pro<C52962KqU> {
    public static final C52963KqV LJLIL = new C52963KqV();

    public C52963KqV() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.KqU, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final C52962KqU invoke() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        C52962KqU c52962KqU = C52962KqU.LJLJJI;
        ?? LJIIIIZZ = LIZLLL.LJIIIIZZ("kv_storage_settings", C52962KqU.class, c52962KqU);
        if (LJIIIIZZ == 0) {
            return c52962KqU;
        }
        return LJIIIIZZ;
    }
}
