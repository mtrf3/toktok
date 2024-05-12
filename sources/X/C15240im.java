package X;

import Y.IDRunnableS4S1100000;
import android.view.View;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.0im, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15240im {
    public static void LIZ(C17040lg c17040lg, C15210ij c15210ij) {
        String eventName = c17040lg.getEventName();
        if (eventName != null) {
            String btm = c15210ij.LIZ;
            java.util.Map<String, String> params = c17040lg.getParams();
            o.LJIIIZ(btm, "btm");
            o.LJIIIZ(params, "params");
            HashMap hashMap = new HashMap(params);
            hashMap.put("btm", btm);
            C38995FSd.LIZLLL().submit(new IDRunnableS4S1100000(hashMap, eventName, 8));
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("commit event:");
        LIZ.append(c17040lg.getEventName());
        LIZ.append(",btm: ");
        LIZ.append(c15210ij.LIZ);
        String s = X1D.LIZIZ(LIZ);
        o.LJIIIZ(s, "s");
        View view = c17040lg.getViewRef().get();
        String itemID = c15210ij.LIZ;
        o.LJIIIZ(itemID, "itemID");
        Iterator it = ((HashSet) C19540pi.LIZ.getValue()).iterator();
        while (it.hasNext()) {
            ((InterfaceC19530ph) it.next()).LIZ(view, itemID);
        }
        InterfaceC19530ph onExposeCallback = c17040lg.getOnExposeCallback();
        if (onExposeCallback != null) {
            onExposeCallback.LIZ(c17040lg.getViewRef().get(), c15210ij.LIZ);
        }
    }

    public static void LIZIZ(EnumC17030lf eventType, C15210ij c15210ij, C17040lg exposeView) {
        o.LJIIIZ(eventType, "eventType");
        o.LJIIIZ(exposeView, "exposeView");
        int i = C15230il.LIZIZ[eventType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            int i2 = C15230il.LIZ[c15210ij.LIZIZ.ordinal()];
            if (i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                if (c15210ij.LJ || c15210ij.LJIIJ) {
                    c15210ij.LIZ(EnumC15220ik.DEF);
                    c15210ij.LJIIJ = false;
                    c15210ij.LJIIIZ = true;
                }
                if (!c15210ij.LJIIIZ) {
                    return;
                }
                c15210ij.LJIIIZ = false;
                InterfaceC19520pg onDismissCallback = exposeView.getOnDismissCallback();
                if (onDismissCallback == null) {
                    return;
                }
                onDismissCallback.LIZ(System.currentTimeMillis() - c15210ij.LIZJ);
                return;
            }
            if (System.currentTimeMillis() - c15210ij.LIZJ >= c15210ij.LJI) {
                c15210ij.LIZ(EnumC15220ik.DONE);
                LIZ(exposeView, c15210ij);
                return;
            } else {
                c15210ij.LIZ(EnumC15220ik.DEF);
                return;
            }
        }
        int i3 = C15230il.LIZ[c15210ij.LIZIZ.ordinal()];
        if (i3 != 1) {
            if (i3 != 2 || System.currentTimeMillis() - c15210ij.LIZJ < c15210ij.LJI) {
                return;
            }
            c15210ij.LIZ(EnumC15220ik.DONE);
            LIZ(exposeView, c15210ij);
            return;
        }
        c15210ij.LIZ(EnumC15220ik.SHOWING);
        c15210ij.LIZJ = System.currentTimeMillis();
    }
}
