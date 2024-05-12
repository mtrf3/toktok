package X;

import kotlin.jvm.internal.o;

/* renamed from: X.9zV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C254939zV {
    public long LIZIZ;
    public long LIZJ;
    public int LJ;
    public int LJFF;
    public int LJII;
    public String LIZ = "chat";
    public String LIZLLL = "";
    public String LJI = "";

    public final void LIZ(EnumC254909zS stage, long j) {
        o.LJIIIZ(stage, "stage");
        int i = C254919zT.LIZ[stage.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            this.LIZJ = j;
            return;
        }
        this.LIZIZ = j;
    }
}
