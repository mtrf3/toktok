package X;

import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.M5k, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56240M5k extends AbstractC56238M5i {
    @Override // X.AbstractC56238M5i
    public final void LIZ(android.net.Uri uri) {
        Object obj;
        Object obj2;
        HashMap<String, Object> hashMap;
        HashMap<String, Object> hashMap2;
        M5X m5x = this.LIZ;
        if (m5x == null || (hashMap2 = m5x.LJLJJL) == null || (obj = hashMap2.get("is_from_self")) == null) {
            obj = Boolean.FALSE;
        }
        M5X m5x2 = this.LIZ;
        if (m5x2 == null || (hashMap = m5x2.LJLJJL) == null || (obj2 = hashMap.get("in_app_enter_from")) == null) {
            obj2 = "";
        }
        if (((Boolean) obj).booleanValue()) {
            C56251M5v.LJ = "others.inapp";
            String LIZ = C38758FJa.LIZ(uri);
            o.LJIIIZ(LIZ, "<set-?>");
            C56251M5v.LJIIIIZZ = LIZ;
            C56251M5v.LJFF = (String) obj2;
            return;
        }
        if (o.LJ(uri.getHost(), "livewallpaper")) {
            C56251M5v.LJ = "others.wallpaper";
        } else {
            C56251M5v.LJ = "others.unknown";
        }
    }
}
