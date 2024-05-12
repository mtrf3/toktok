package X;

import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.util.function.Predicate;
import kotlin.jvm.internal.o;

/* renamed from: X.Hth, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45517Hth<T> implements Predicate {
    public static final C45517Hth<T> LIZ = new C45517Hth<>();

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        MediaModel it = (MediaModel) obj;
        o.LJIIIZ(it, "it");
        C45495HtL c45495HtL = it.libraryState;
        if (c45495HtL != null && c45495HtL.isFailed()) {
            return true;
        }
        return false;
    }
}
