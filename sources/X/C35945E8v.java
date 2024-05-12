package X;

import android.os.Process;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.E8v, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35945E8v {
    public static long LIZ;
    public static final int LIZIZ;
    public static final C35940E8q LIZJ;
    public static float LIZLLL;
    public static final AtomicBoolean LJ;

    static {
        int myPid = Process.myPid();
        LIZIZ = myPid;
        LIZJ = new C35940E8q(false, new int[]{myPid}, 7);
        LIZLLL = -1.0f;
        LJ = new AtomicBoolean(false);
    }
}
