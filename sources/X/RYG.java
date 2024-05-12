package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RYG<T, R> implements InterfaceC48038ItG {
    public static final RYG<T, R> LJLIL = new RYG<>();

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        T t;
        Response it = (Response) obj;
        o.LJIIIZ(it, "it");
        if (it.isCodeOK() && (t = it.data) != null) {
            return t;
        }
        C78983UzD.LJIILL(String.valueOf(it.code));
        throw new C69887Rbn(it, "code is not ok | data is null");
    }
}
