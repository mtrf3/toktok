package X;

import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: X.2Qd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C58192Qd extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C58192Qd LJLIL = new C58192Qd();

    public C58192Qd() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        Boolean bool;
        try {
            SettingsManager.LIZLLL().getClass();
            Boolean valueOf = Boolean.valueOf(SettingsManager.LIZ("story_viewer_list_popup_show_in_country", false));
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
