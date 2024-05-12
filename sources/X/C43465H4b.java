package X;

import kotlin.jvm.internal.o;

/* renamed from: X.H4b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43465H4b {
    public static final int LIZ() {
        Boolean bool = C41658GWo.LIZLLL().LJ;
        o.LJIIIIZZ(bool, "inst().isInShoutout");
        if (bool.booleanValue()) {
            H78.LIZ("record 3min disabled, reason: shoutout");
            return 0;
        }
        if (C1DG.LJIIIIZZ()) {
            return 0;
        }
        if (!C43464H4a.LIZ()) {
            H78.LIZ("record 3min disabled, reason: long video not allowed");
            return 0;
        }
        return 1;
    }

    public static final boolean LIZIZ() {
        if (LIZ() != 0) {
            return true;
        }
        return false;
    }
}
