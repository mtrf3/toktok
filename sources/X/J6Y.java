package X;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class J6Y extends J6W {
    public static final java.util.Set<String> LIZJ = C77275UUl.LJIIIIZZ("enter_homepage_familiar", "enter_homepage_hot", "enter_homepage_message", "enter_homepage_follow", "enter_homepage_fresh", "enter_personal_homepage", "shoot");
    public final ConcurrentHashMap<String, AtomicInteger> LIZIZ = new ConcurrentHashMap<>();

    public final void LIZ(String event) {
        o.LJIIIZ(event, "event");
        if (!this.LIZ || !LIZJ.contains(event)) {
            return;
        }
        if (!this.LIZIZ.containsKey(event)) {
            this.LIZIZ.put(event, new AtomicInteger(1));
            return;
        }
        AtomicInteger atomicInteger = this.LIZIZ.get(event);
        if (atomicInteger == null) {
            return;
        }
        atomicInteger.incrementAndGet();
    }
}
