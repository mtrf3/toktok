package X;

import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: X.2R6, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2R6 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C2R6 LJLIL = new C2R6();

    public C2R6() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        Boolean bool;
        try {
            SettingsManager.LIZLLL().getClass();
            Boolean valueOf = Boolean.valueOf(SettingsManager.LIZ("story_viewer_list_popup_enable", false));
            C3C5.m7constructorimpl(valueOf);
            bool = valueOf;
        } catch (Throwable th) {
            C3C4 LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
            bool = LIZ;
        }
        if (C3C5.m10exceptionOrNullimpl(bool) == null) {
            return bool;
        }
        return Boolean.FALSE;
    }
}
