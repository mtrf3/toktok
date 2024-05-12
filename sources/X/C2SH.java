package X;

import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: X.2SH, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2SH {
    public static final boolean LIZ() {
        Object LIZ;
        try {
            SettingsManager.LIZLLL().getClass();
            LIZ = Boolean.valueOf(SettingsManager.LIZ("ec_pdp_viewholder_enable_lynx_air", false));
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        Boolean bool = Boolean.FALSE;
        if (C3C5.m12isFailureimpl(LIZ)) {
            LIZ = bool;
        }
        return ((Boolean) LIZ).booleanValue();
    }
}
