package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Pxm, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C66154Pxm {
    public static final C66187PyJ Companion = new C66187PyJ();
    public static C66154Pxm sInstance;

    public void startUsing(int i, String caseId, String description) {
        o.LJIIIZ(caseId, "caseId");
        o.LJIIIZ(description, "description");
    }

    public void stopUsing(int i, String caseId, String description) {
        o.LJIIIZ(caseId, "caseId");
        o.LJIIIZ(description, "description");
    }

    public static final C66154Pxm getInstance() {
        C66154Pxm c66154Pxm;
        Object obj;
        C66187PyJ c66187PyJ = Companion;
        c66187PyJ.getClass();
        if (sInstance == null) {
            synchronized (C66154Pxm.class) {
                c66187PyJ.getClass();
                if (sInstance == null) {
                    try {
                        obj = Class.forName("com.bytedance.helios.sdk.anchor.CustomAnchorMonitorImpl").getDeclaredField("INSTANCE").get(null);
                    } catch (Exception unused) {
                        c66154Pxm = new C66154Pxm();
                    }
                    if (obj != null) {
                        c66154Pxm = (C66154Pxm) obj;
                        sInstance = c66154Pxm;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.bytedance.helios.sdk.anchor.CustomAnchorMonitor");
                    }
                }
            }
        }
        C66154Pxm c66154Pxm2 = sInstance;
        o.LJI(c66154Pxm2);
        return c66154Pxm2;
    }
}
