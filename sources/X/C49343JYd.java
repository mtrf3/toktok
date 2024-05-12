package X;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* renamed from: X.JYd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49343JYd<T> {
    public static final /* synthetic */ int LJ = 0;
    public final ConcurrentHashMap<Integer, CopyOnWriteArrayList<Future<JYV<T>>>> LIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<Integer, Boolean> LIZIZ = new ConcurrentHashMap<>();
    public final InterfaceC88474Ynu<? super Integer, ? super Integer, ? super Integer, ? super Boolean, Boolean> LIZJ;
    public final ExecutorService LIZLLL;

    public C49343JYd(C49348JYi c49348JYi) {
        this.LIZJ = c49348JYi.LIZ;
        this.LIZLLL = c49348JYi.LIZIZ;
    }

    public final CopyOnWriteArrayList<Future<JYV<T>>> LIZ(int i) {
        CopyOnWriteArrayList<Future<JYV<T>>> copyOnWriteArrayList = this.LIZ.get(Integer.valueOf(i));
        if (copyOnWriteArrayList == null) {
            CopyOnWriteArrayList<Future<JYV<T>>> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
            this.LIZ.put(Integer.valueOf(i), copyOnWriteArrayList2);
            return copyOnWriteArrayList2;
        }
        return copyOnWriteArrayList;
    }
}
