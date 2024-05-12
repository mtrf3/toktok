package X;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.X5q, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84274X5q {
    public final Object LIZ;
    public final Serializable LIZIZ;

    public final void LIZJ() {
        for (Map.Entry entry : ((ConcurrentHashMap) this.LIZ).entrySet()) {
            entry.getKey();
            ((InterfaceC84275X5r) entry.getValue()).release();
        }
        for (Map.Entry entry2 : ((ConcurrentHashMap) this.LIZIZ).entrySet()) {
            entry2.getKey();
            ((InterfaceC84275X5r) entry2.getValue()).release();
        }
        ((ConcurrentHashMap) this.LIZ).clear();
        ((ConcurrentHashMap) this.LIZIZ).clear();
    }

    public /* synthetic */ C84274X5q() {
        this.LIZ = new ConcurrentHashMap();
        this.LIZIZ = new ConcurrentHashMap();
    }

    public final void LIZIZ(String musicId) {
        o.LJIIIZ(musicId, "musicId");
        InterfaceC84275X5r interfaceC84275X5r = (InterfaceC84275X5r) ((ConcurrentHashMap) this.LIZ).remove(musicId);
        if (interfaceC84275X5r != null) {
            interfaceC84275X5r.cancel();
        }
        InterfaceC84275X5r interfaceC84275X5r2 = (InterfaceC84275X5r) ((ConcurrentHashMap) this.LIZIZ).remove(musicId);
        if (interfaceC84275X5r2 != null) {
            interfaceC84275X5r2.cancel();
        }
    }

    public /* synthetic */ C84274X5q(List list, Integer num) {
        this.LIZ = list;
        this.LIZIZ = num;
    }

    public final void LIZ(String musicId, InterfaceC84275X5r task) {
        o.LJIIIZ(musicId, "musicId");
        o.LJIIIZ(task, "task");
        if (task instanceof C84857XSb) {
            ((ConcurrentHashMap) this.LIZ).put(musicId, task);
        } else {
            ((ConcurrentHashMap) this.LIZIZ).put(musicId, task);
        }
    }

    public final void LIZLLL(String musicId, InterfaceC84275X5r task) {
        o.LJIIIZ(musicId, "musicId");
        o.LJIIIZ(task, "task");
        if (task instanceof C84857XSb) {
            ((ConcurrentHashMap) this.LIZ).remove(musicId);
        } else {
            ((ConcurrentHashMap) this.LIZIZ).remove(musicId);
        }
    }
}
