package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Tqr, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75917Tqr {
    public static final List<LinkUser> LIZ = new ArrayList();

    public static boolean LIZ(List list) {
        ArrayList LJ = AnonymousClass391.LJ(list, "newLinkedUsers");
        LJ.addAll(LIZ);
        int size = LJ.size();
        int size2 = list.size();
        if (size == 2 && size2 == 4) {
            return true;
        }
        return false;
    }
}
