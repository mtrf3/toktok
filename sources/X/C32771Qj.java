package X;

import java.util.ArrayList;

/* renamed from: X.1Qj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32771Qj extends C12360e8 {
    public static volatile boolean LIZIZ;

    static {
        new ArrayList();
    }

    public static void LIZ() {
        if (LIZIZ) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("c++_shared");
        arrayList.add("bytemonitor");
        arrayList.add("worker");
        arrayList.add("bytebench");
        if (!C12350e7.LIZ(arrayList)) {
            LIZIZ = false;
        } else {
            LIZIZ = true;
        }
    }
}
