package X;

import com.bytedance.ies.abmock.SettingsManager;
import java.util.List;

/* renamed from: X.E2i, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35776E2i {
    public static final List<String> LIZ() {
        Object LIZ;
        boolean z;
        try {
            LIZ = (String[]) SettingsManager.LIZLLL().LJIIIIZZ("aweme_base_conf.common_param_enabled_hosts", String[].class, null);
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        String[] strArr = (String[]) (C3C5.m12isFailureimpl(LIZ) ? null : LIZ);
        boolean z2 = true;
        if (strArr != null) {
            if (strArr.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                z2 = false;
            }
        }
        if (z2) {
            return C47261Igj.LJJIJIIJI(".tiktok.com", ".tiktokv.com", ".musical.ly");
        }
        return ORY.LJJZZIII(strArr);
    }
}
