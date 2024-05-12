package X;

import java.util.PriorityQueue;
import kotlin.jvm.internal.o;

/* renamed from: X.Zr1, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91215Zr1 {
    public static InterfaceC91212Zqy LIZIZ;
    public static boolean LIZ = true;
    public static final PriorityQueue<InterfaceC91212Zqy> LIZJ = new PriorityQueue<>();

    public static void LIZJ() {
        InterfaceC91212Zqy poll;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("internalShowDialog ,canShowMusicDspDialog is ");
        LIZ2.append(LIZ);
        LIZ2.append("mShowDialog is ");
        LIZ2.append(LIZIZ);
        X1D.LIZIZ(LIZ2);
        InterfaceC91212Zqy interfaceC91212Zqy = LIZIZ;
        if (interfaceC91212Zqy != null) {
            interfaceC91212Zqy.dismiss();
            PriorityQueue<InterfaceC91212Zqy> priorityQueue = LIZJ;
            if ((!priorityQueue.isEmpty()) && LIZ) {
                InterfaceC91212Zqy poll2 = priorityQueue.poll();
                LIZIZ = poll2;
                if (poll2 != null) {
                    poll2.show();
                    return;
                }
                return;
            }
            LIZIZ = null;
            return;
        }
        PriorityQueue<InterfaceC91212Zqy> priorityQueue2 = LIZJ;
        if (!(!priorityQueue2.isEmpty()) || !LIZ || (poll = priorityQueue2.poll()) == null) {
            return;
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("firstShowDialog musicDspDialog is ");
        LIZ3.append(poll);
        X1D.LIZIZ(LIZ3);
        LIZIZ = poll;
        poll.show();
    }

    public static void LIZ(boolean z) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("canShowMusicDspDialog canShow is ");
        LIZ2.append(z);
        X1D.LIZIZ(LIZ2);
        if (LIZ != z) {
            LIZ = z;
            LIZJ();
        }
    }

    public static void LIZIZ(InterfaceC91212Zqy musicDspDialog) {
        o.LJIIIZ(musicDspDialog, "musicDspDialog");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("dismissDialog musicDialog is ");
        LIZ2.append(musicDspDialog);
        X1D.LIZIZ(LIZ2);
        if (o.LJ(musicDspDialog, LIZIZ)) {
            LIZJ();
        } else {
            LIZJ.remove(musicDspDialog);
        }
    }

    public static void LIZLLL(InterfaceC91212Zqy interfaceC91212Zqy) {
        int i;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("showDialog ");
        LIZ2.append(interfaceC91212Zqy);
        X1D.LIZIZ(LIZ2);
        PriorityQueue<InterfaceC91212Zqy> priorityQueue = LIZJ;
        if (priorityQueue.contains(interfaceC91212Zqy)) {
            return;
        }
        priorityQueue.add(interfaceC91212Zqy);
        if (LIZIZ != null) {
            int LLLLZLL = interfaceC91212Zqy.LLLLZLL();
            InterfaceC91212Zqy interfaceC91212Zqy2 = LIZIZ;
            if (interfaceC91212Zqy2 != null) {
                i = interfaceC91212Zqy2.LLLLZLL();
            } else {
                i = 0;
            }
            if (LLLLZLL >= i) {
                return;
            }
        }
        LIZJ();
    }
}
