package X;

import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: X.9M3, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9M3 extends AbstractC65781Prl implements InterfaceC65784Pro<C9M1> {
    public static final C9M3 LJLIL = new C9M3();

    public C9M3() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.9M1] */
    @Override // X.InterfaceC65784Pro
    public final C9M1 invoke() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        C9M1 c9m1 = C9M2.LIZ;
        ?? LJIIIIZZ = LIZLLL.LJIIIIZZ("new_maf_notification_setting_on_ffp", C9M1.class, c9m1);
        if (LJIIIIZZ == 0) {
            return c9m1;
        }
        return LJIIIIZZ;
    }
}
