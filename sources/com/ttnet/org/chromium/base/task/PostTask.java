package com.ttnet.org.chromium.base.task;

import X.C79498VHy;
import X.FSH;
import X.InterfaceC79499VHz;
import X.VI6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes15.dex */
public class PostTask {
    public static volatile boolean LIZJ;
    public static final AtomicReferenceArray<InterfaceC79499VHz> LJ;
    public static final Object LIZ = new Object();
    public static List<VI6> LIZIZ = new ArrayList();
    public static final FSH LIZLLL = new FSH();

    public static void onNativeSchedulerReady() {
        List<VI6> list;
        LIZJ = true;
        synchronized (LIZ) {
            list = LIZIZ;
            LIZIZ = null;
        }
        Iterator<VI6> it = list.iterator();
        while (it.hasNext()) {
            it.next().LIZJ();
        }
    }

    static {
        AtomicReferenceArray<InterfaceC79499VHz> atomicReferenceArray = new AtomicReferenceArray<>(5);
        atomicReferenceArray.set(0, new C79498VHy());
        LJ = atomicReferenceArray;
    }

    public static void onNativeSchedulerShutdownForTesting() {
        synchronized (LIZ) {
            LIZIZ = new ArrayList();
        }
        LIZJ = false;
        LJ.set(0, new C79498VHy());
        int i = 1;
        while (true) {
            AtomicReferenceArray<InterfaceC79499VHz> atomicReferenceArray = LJ;
            if (i < atomicReferenceArray.length()) {
                atomicReferenceArray.set(i, null);
                i++;
            } else {
                return;
            }
        }
    }
}
