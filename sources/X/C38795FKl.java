package X;

import Y.ARunnableS13S0000000_6;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import com.ss.ttvideoengine.TTVideoEngine;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.FKl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38795FKl {
    public static volatile boolean LIZJ;
    public static volatile C38795FKl LIZLLL;
    public final C73318Sq2 LIZ = new C73318Sq2();
    public C38796FKm LIZIZ = null;

    public static void LIZ(String str) {
        if (str.equals("sleep")) {
            IWF.LJJLIIIIJ().LJJL();
        } else if (str.equals("release")) {
            ArrayList arrayList = (ArrayList) C38797FKn.LIZ;
            if (arrayList.size() != 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Reference reference = (Reference) it.next();
                    if (reference.get() != null) {
                        ((IX9) reference.get()).LJI(new C74152vb());
                    }
                }
            }
            TTVideoEngine.LJJLIIIJJIZ();
        }
        new PthreadThread(new ARunnableS13S0000000_6(39), "MemoryTrimManager").start();
    }
}
