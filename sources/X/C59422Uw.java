package X;

import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: X.2Uw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C59422Uw extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C59422Uw LJLIL = new C59422Uw();

    public C59422Uw() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        Integer num;
        try {
            SettingsManager.LIZLLL().getClass();
            Integer valueOf = Integer.valueOf(SettingsManager.LJ("tt_friends_tab_preload_with_insert_config", 0));
            C3C5.m7constructorimpl(valueOf);
            num = valueOf;
        } catch (Throwable th) {
            C3C4 LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
            num = LIZ;
        }
        if (C3C5.m10exceptionOrNullimpl(num) == null) {
            return num;
        }
        return 0;
    }
}
