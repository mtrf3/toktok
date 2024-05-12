package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.model.LynxSearchHorizontalCardData;
import java.util.List;

/* renamed from: X.JRf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49163JRf {
    public static final boolean LIZ;

    static {
        FFL.LJIIIZ().getClass();
        boolean z = false;
        if (FFL.LJIIJ(31744, 0, "search_hotspot_auto_play_refactor_disabled", true) == 1) {
            z = true;
        }
        LIZ = z;
    }

    public static final boolean LIZ(String str) {
        if (LIZ && JWA.LIZIZ(str)) {
            return true;
        }
        return false;
    }

    public static final boolean LIZIZ(List<C49164JRg> list) {
        String str;
        if (!LIZ || list == null || list.isEmpty()) {
            return false;
        }
        LynxSearchHorizontalCardData lynxSearchHorizontalCardData = ((C49164JRg) ListProtector.get(list, 0)).LIZ;
        if (lynxSearchHorizontalCardData != null) {
            str = lynxSearchHorizontalCardData.getSchema();
        } else {
            str = null;
        }
        if (!JWA.LIZIZ(str)) {
            return false;
        }
        return true;
    }
}
