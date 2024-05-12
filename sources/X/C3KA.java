package X;

import androidx.lifecycle.Observer;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import kotlin.jvm.internal.o;

/* renamed from: X.3KA, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3KA<T> {
    public final ConcurrentHashSet<Observer<T>> LIZ;
    public final C64962gm LIZIZ;
    public T LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    public C3KA(C194227jm c194227jm) {
        XIF coroutineContext = EXV.LIZ;
        o.LJIIIZ(coroutineContext, "coroutineContext");
        this.LIZ = new ConcurrentHashSet<>();
        this.LIZIZ = C48841JEv.LIZ(coroutineContext);
        this.LIZJ = c194227jm;
    }
}
