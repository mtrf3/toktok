package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Mq5, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58033Mq5 implements InterfaceC78662Uu2 {
    public final InterfaceC65784Pro<Long> LIZ;
    public long LIZIZ;
    public long LIZJ;

    static {
        new C58034Mq6();
    }

    @Override // X.InterfaceC78662Uu2
    public final long LIZ() {
        return this.LIZJ - this.LIZIZ;
    }

    @Override // X.InterfaceC78662Uu2
    public final void start() {
        this.LIZIZ = this.LIZ.invoke().longValue();
    }

    @Override // X.InterfaceC78662Uu2
    public final void stop() {
        this.LIZJ = this.LIZ.invoke().longValue();
    }

    public C58033Mq5(String tag, int i) {
        C98443tg uptime;
        tag = (i & 1) != 0 ? "DurationRecorder" : tag;
        if ((i & 2) != 0) {
            uptime = C98443tg.LJLIL;
        } else {
            uptime = null;
        }
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(uptime, "uptime");
        this.LIZ = uptime;
    }
}
