package X;

import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.X5s, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84276X5s {
    public Object LIZ;
    public final Serializable LIZIZ;

    public /* synthetic */ C84276X5s() {
        this.LIZ = new ConcurrentHashMap();
        this.LIZIZ = new ConcurrentHashMap();
    }

    public final void LIZ(String musicId, InterfaceC84877XSv task) {
        o.LJIIIZ(musicId, "musicId");
        o.LJIIIZ(task, "task");
        if (task instanceof C84856XSa) {
            ((ConcurrentHashMap) this.LIZ).put(musicId, task);
        } else {
            ((ConcurrentHashMap) this.LIZIZ).put(musicId, task);
        }
    }

    public final void LIZIZ(String musicId, InterfaceC84877XSv task) {
        o.LJIIIZ(musicId, "musicId");
        o.LJIIIZ(task, "task");
        if (task instanceof C84856XSa) {
            ((ConcurrentHashMap) this.LIZ).remove(musicId);
        } else {
            ((ConcurrentHashMap) this.LIZIZ).remove(musicId);
        }
    }
}
