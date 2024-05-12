package X;

import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.dot.request.RedDotPolling;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LHD<T> implements Observer {
    public static final LHD<T> LJLIL = new LHD<>();

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        Boolean success = (Boolean) obj;
        o.LJIIIIZZ(success, "success");
        if (success.booleanValue()) {
            RedDotPolling.LJLIL.getClass();
            C73411SrX c73411SrX = RedDotPolling.LJLILLLLZI;
            if (c73411SrX != null) {
                c73411SrX.dispose();
            }
        }
    }
}
