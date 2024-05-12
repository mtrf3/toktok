package X;

import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.o;

/* renamed from: X.RrF, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70845RrF {
    public static C70846RrG LIZ(InterfaceC73150SnK parent, AbstractC03160Am diffCallback) {
        o.LJIIJ(parent, "parent");
        o.LJIIJ(diffCallback, "diffCallback");
        if (!(parent instanceof LifecycleOwner)) {
            parent = null;
        }
        LifecycleOwner lifecycleOwner = (LifecycleOwner) parent;
        if (lifecycleOwner != null) {
            return new C70846RrG(lifecycleOwner, C73340SqO.LJIIIIZZ(diffCallback));
        }
        throw new IllegalStateException();
    }
}
