package X;

import android.content.ComponentName;
import android.content.Context;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes7.dex */
public final class FZL {
    public static final List<Class<? extends FZX>> LIZJ;
    public static boolean LIZLLL;
    public static volatile FZL LJ;
    public volatile FZX LIZ;
    public ComponentName LIZIZ;

    static {
        LinkedList linkedList = new LinkedList();
        LIZJ = linkedList;
        LIZLLL = false;
        linkedList.add(FZK.class);
        linkedList.add(FZJ.class);
        linkedList.add(FZR.class);
        linkedList.add(FXO.class);
        linkedList.add(FZT.class);
        linkedList.add(FZN.class);
        linkedList.add(FZO.class);
        linkedList.add(FXR.class);
        linkedList.add(FZI.class);
        linkedList.add(FXQ.class);
        linkedList.add(FZS.class);
        linkedList.add(FZH.class);
        linkedList.add(FZM.class);
        linkedList.add(FXP.class);
        linkedList.add(FZP.class);
        linkedList.add(FXT.class);
        linkedList.add(FXV.class);
        linkedList.add(FXU.class);
        if (LIZLLL) {
            linkedList.add(FXS.class);
        }
    }

    public static synchronized FZL LIZJ() {
        FZL fzl;
        synchronized (FZL.class) {
            if (LJ == null) {
                synchronized (FZL.class) {
                    if (LJ == null) {
                        LJ = new FZL();
                    }
                }
            }
            fzl = LJ;
        }
        return fzl;
    }

    public final boolean LIZ(int i, Context context) {
        try {
            LIZIZ(i, context);
            return true;
        } catch (FXW e) {
            if (QSB.LIZ()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Unable to execute badge");
                LIZ.append(e);
                X1D.LIZIZ(LIZ);
                return false;
            }
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x012e, code lost:
    
        if (r4 == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(int r6, android.content.Context r7) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FZL.LIZIZ(int, android.content.Context):void");
    }
}
