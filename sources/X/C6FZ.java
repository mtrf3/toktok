package X;

import kotlin.jvm.internal.o;

/* renamed from: X.6FZ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6FZ {
    public static final /* synthetic */ int LIZIZ = 0;
    public final C1HQ<String, Boolean> LIZ = new C1HQ<>();

    public final void LIZ(int i, long j, String str, boolean z) {
        if (z && o.LJ(this.LIZ.getOrDefault(str, null), Boolean.TRUE)) {
            return;
        }
        this.LIZ.put(str, Boolean.TRUE);
        C6FQ.LIZ(i, j, str);
    }

    public static /* synthetic */ void LIZIZ(C6FZ c6fz, String str, long j, boolean z, int i) {
        int i2;
        boolean z2 = z;
        if ((i & 4) != 0) {
            z2 = false;
        }
        if ((i & 8) != 0) {
            i2 = -1;
        } else {
            i2 = 0;
        }
        c6fz.LIZ(i2, j, str, z2);
    }
}
