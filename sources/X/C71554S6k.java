package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.s;

/* renamed from: X.S6k, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71554S6k implements InterfaceC88763e4 {
    public static final C71559S6p LJJJIL() {
        String string = C71569S6z.LIZ().getString("key_last_use_effect_record", null);
        if (string == null) {
            return null;
        }
        try {
            Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), string, C65330PkU.LIZJ(C65352Pkq.LJI(C71559S6p.class)));
            if (!(fromJson instanceof C71559S6p)) {
                fromJson = null;
            }
            return (C71559S6p) fromJson;
        } catch (s unused) {
            return null;
        }
    }
}
