package X;

import com.ss.avframework.livestreamv2.core.interact.Client;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes14.dex */
public final class U84 {
    public static int LIZ;
    public static final List<UA2> LIZIZ;
    public static Client LIZJ;

    static {
        ArrayList arrayList = new ArrayList();
        LIZIZ = arrayList;
        arrayList.add(new UA2(0, 1));
        arrayList.add(new UA2(2, 1));
        arrayList.add(new UA2(1, 2));
    }

    public static void LIZ(int i) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("transitionTo mState=");
        LIZ2.append(LIZ);
        LIZ2.append(" state=");
        LIZ2.append(i);
        U4R.LIZLLL("RtcStateMachine", X1D.LIZIZ(LIZ2));
        List<UA2> list = LIZIZ;
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((UA2) next).LJLIL == LIZ) {
                arrayList.add(next);
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                if (((UA2) next2).LJLILLLLZI == i) {
                    if (next2 != null) {
                        LIZ = i;
                        return;
                    }
                    return;
                }
            }
        }
    }
}
