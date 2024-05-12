package X;

import android.os.MessageQueue;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EE7 implements MessageQueue.IdleHandler {
    public final /* synthetic */ EE6 LJLIL;

    public EE7(EE6 ee6) {
        this.LJLIL = ee6;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        EE1 ee12;
        if (this.LJLIL.LJLIL && EEZ.LIZIZ()) {
            this.LJLIL.LJII();
        } else if (C33778DNm.LIZ() != 0) {
            EE6 ee6 = this.LJLIL;
            if (ee6.LJLILLLLZI) {
                C36093EEn.LIZ.getClass();
                EE9 ee9 = C36093EEn.LIZIZ;
                synchronized (ee9.LIZIZ) {
                    java.util.Map<EFK, List<EEY>> map = ee9.LIZIZ;
                    EFK efk = EFK.IDLE;
                    Object obj = ((ConcurrentHashMap) map).get(efk);
                    o.LJI(obj);
                    if (!((List) obj).isEmpty()) {
                        C76732zl c76732zl = new C76732zl();
                        Object obj2 = ((ConcurrentHashMap) ee9.LIZIZ).get(efk);
                        o.LJI(obj2);
                        Iterator it = ((Iterable) obj2).iterator();
                        while (it.hasNext()) {
                            if (((EEY) it.next()) instanceof EE8) {
                                Object obj3 = ((ConcurrentHashMap) ee9.LIZIZ).get(EFK.IDLE);
                                o.LJI(obj3);
                                EEY eey = (EEY) ((List) obj3).remove(c76732zl.element);
                                synchronized (ee9.LIZJ) {
                                    java.util.Map<EFK, List<EEY>> map2 = ee9.LIZJ;
                                    o.LJII(eey, "null cannot be cast to non-null type com.ss.android.ugc.aweme.lego.LegoTask");
                                    Object obj4 = ((ConcurrentHashMap) map2).get(EE9.LIZ((EE1) eey));
                                    if (obj4 != null) {
                                        ((List) obj4).add(eey);
                                    } else {
                                        "Required value was null.".toString();
                                        throw new IllegalArgumentException("Required value was null.");
                                    }
                                }
                                ee12 = (EE1) eey;
                            } else {
                                c76732zl.element++;
                            }
                        }
                    }
                    ee12 = null;
                }
                ee6.LJI(ee12, false);
            }
        }
        return true;
    }
}
