package X;

import java.util.Collections;
import java.util.HashSet;

/* renamed from: X.QZd, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67205QZd {
    public static volatile C67205QZd LIZIZ;
    public final java.util.Set<AbstractC67210QZi> LIZ = new HashSet();

    public final java.util.Set<AbstractC67210QZi> LIZ() {
        java.util.Set<AbstractC67210QZi> unmodifiableSet;
        synchronized (this.LIZ) {
            unmodifiableSet = Collections.unmodifiableSet(this.LIZ);
        }
        return unmodifiableSet;
    }
}
