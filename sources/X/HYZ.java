package X;

import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HYZ {
    public static final int LIZ() {
        Boolean bool = C41658GWo.LIZLLL().LJ;
        o.LJIIIIZZ(bool, "inst().isInShoutout");
        if (bool.booleanValue()) {
            H78.LIZ("record 10min disabled, reason: shoutout");
            return 0;
        }
        if (C1DG.LJIIIIZZ()) {
            return 0;
        }
        C62822Ol8 c62822Ol8 = C44254HYk.LIZ;
        if (600000 != ((Number) c62822Ol8.getValue()).longValue() || Math.max(((Number) c62822Ol8.getValue()).longValue(), 180000L) > C152345yQ.LIZ()) {
            return 0;
        }
        return 1;
    }
}
