package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.discover.model.SearchChallenge;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.JZe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49370JZe {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C49371JZf.LJLIL);

    public static final void LIZ(List<? extends SearchChallenge> list) {
        if (list == null) {
            return;
        }
        Iterator<? extends SearchChallenge> it = list.iterator();
        while (it.hasNext()) {
            List<Aweme> awemes = it.next().getAwemes();
            if (awemes != null) {
                int i = 0;
                for (Aweme aweme : awemes) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        Object value = LIZ.getValue();
                        o.LJIIIIZZ(value, "<get-mAwemeManager>(...)");
                        ListProtector.set(awemes, i, ((IAwemeService) value).R1(aweme));
                        i = i2;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
            }
        }
    }
}
