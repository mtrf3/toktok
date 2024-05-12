package X;

import com.ss.android.ugc.aweme.share.SharePlatform;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Hs1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45413Hs1 implements Comparator<String> {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(C45414Hs2.LJLIL);

    public final int LIZ(String str) {
        for (SharePlatform sharePlatform : (List) this.LJLIL.getValue()) {
            if (o.LJ(sharePlatform.platformId, str)) {
                return ((List) this.LJLIL.getValue()).indexOf(sharePlatform);
            }
        }
        return Integer.MAX_VALUE;
    }

    @Override // java.util.Comparator
    public final int compare(String str, String str2) {
        String lhs = str;
        String rhs = str2;
        o.LJIIIZ(lhs, "lhs");
        o.LJIIIZ(rhs, "rhs");
        return LIZ(lhs) - LIZ(rhs);
    }
}
