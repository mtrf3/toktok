package X;

import com.ss.android.ugc.aweme.services.draft.IDraftListener;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.31s, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C773231s implements GNI {
    public static final C773231s LIZ = new C773231s();
    public static final List<IDraftListener> LIZIZ = new ArrayList();

    @Override // X.GNI
    public final void registerListener(IDraftListener listener) {
        o.LJIIIZ(listener, "listener");
        List<IDraftListener> list = LIZIZ;
        if (!((ArrayList) list).contains(listener)) {
            ((ArrayList) list).add(listener);
        }
    }

    @Override // X.GNI
    public final void unregisterListener(IDraftListener listener) {
        o.LJIIIZ(listener, "listener");
        ((ArrayList) LIZIZ).remove(listener);
    }
}
