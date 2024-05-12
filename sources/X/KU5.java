package X;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AqS158S0100000_8;

/* loaded from: classes9.dex */
public final class KU5 {
    public final String LIZ;
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(KUA.LJLIL);
    public final C62822Ol8 LIZJ = C221108m2.LIZIZ(KU6.LJLIL);
    public final C62822Ol8 LIZLLL = C221108m2.LIZIZ(KU7.LJLIL);
    public final C62822Ol8 LJ = C221108m2.LIZIZ(new AqS158S0100000_8(this, 704));

    public final ConcurrentHashMap<String, CopyOnWriteArraySet<XJL<Object>>> LIZ() {
        return (ConcurrentHashMap) this.LIZJ.getValue();
    }

    public final ConcurrentHashMap<String, CopyOnWriteArraySet<KU9>> LIZIZ() {
        return (ConcurrentHashMap) this.LIZLLL.getValue();
    }

    public KU5(String str) {
        this.LIZ = str;
    }
}
