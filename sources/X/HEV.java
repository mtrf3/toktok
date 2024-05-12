package X;

import com.ss.android.ugc.aweme.shortvideo.model.Initial;
import com.ss.android.ugc.aweme.shortvideo.model.Loading;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HEV<T> implements InterfaceC73592SuS {
    public static final HEV<T> LJLIL = new HEV<>();

    @Override // X.InterfaceC73592SuS
    public final boolean test(Object it) {
        o.LJIIIZ(it, "it");
        if (!(it instanceof Loading) && !(it instanceof Initial)) {
            return true;
        }
        return false;
    }
}
