package X;

import com.ss.android.ttve.common.TECloudCtrlInvoker;

/* renamed from: X.P7s, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C63944P7s {
    public static volatile C63944P7s LIZLLL;
    public static final String[] LJ = {"vesdk_log_command"};
    public boolean LIZ;
    public final TECloudCtrlInvoker LIZIZ = new TECloudCtrlInvoker();
    public String LIZJ;

    public static C63944P7s LIZ() {
        if (LIZLLL == null) {
            synchronized (C63944P7s.class) {
                if (LIZLLL == null) {
                    LIZLLL = new C63944P7s();
                }
            }
        }
        return LIZLLL;
    }
}
