package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;

/* renamed from: X.492, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass492 {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(AnonymousClass493.LJLIL);

    public static int LIZ(long j) {
        Keva kevaRepo = (Keva) LIZ.getValue();
        o.LJIIIIZZ(kevaRepo, "kevaRepo");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("inactivity_count");
        LIZ2.append(j);
        return kevaRepo.getInt(X1D.LIZIZ(LIZ2), 0);
    }
}
