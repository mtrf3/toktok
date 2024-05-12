package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class PQG {
    public static java.util.Map<String, ? extends PQM> LIZJ;
    public static OM4 LIZLLL;
    public static List<? extends InterfaceC28215B5n> LJ;
    public static List<? extends InterfaceC28214B5m> LJFF;
    public static Executor LJI;
    public static List<? extends PQO> LJII;
    public static final PQG LIZ = new PQG();
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public static final java.util.Map<String, PQL> LJIIIIZZ = new LinkedHashMap();

    public static final void LIZIZ(String scene) {
        PQO pqo;
        o.LJIIIZ(scene, "scene");
        if (LIZIZ.get()) {
            List<? extends PQO> list = LJII;
            if (list != null) {
                Iterator<? extends PQO> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        pqo = it.next();
                        if (pqo.LIZ(scene)) {
                            break;
                        }
                    } else {
                        pqo = null;
                        break;
                    }
                }
                PQO pqo2 = pqo;
                if (pqo2 == null || !pqo2.LIZIZ(scene)) {
                    return;
                }
                java.util.Map<String, PQL> map = LJIIIIZZ;
                PQL pql = (PQL) ((LinkedHashMap) map).get(scene);
                if (pql == null) {
                    synchronized (map) {
                        pql = (PQL) ((LinkedHashMap) map).get(scene);
                        if (pql == null) {
                            PQM pqm = PQI.LIZ.get(scene);
                            if (pqm != null) {
                                pql = pqm.create(scene);
                            } else {
                                pql = PQI.LIZIZ.create(scene);
                            }
                            if (pql == null) {
                                return;
                            } else {
                                map.put(scene, pql);
                            }
                        }
                    }
                }
                if (!pql.start()) {
                    return;
                }
                OM4 om4 = LIZLLL;
                if (om4 != null) {
                    Iterator<PQN> it2 = om4.iterator();
                    while (it2.hasNext()) {
                        it2.next().LIZIZ(scene);
                    }
                    return;
                }
                o.LJIJI("fluencyObserverList");
                throw null;
            }
            o.LJIJI("fluencySamplers");
            throw null;
        }
    }

    public static final void LIZJ(String scene) {
        PQL pql;
        o.LJIIIZ(scene, "scene");
        if (LIZIZ.get() && (pql = (PQL) ((LinkedHashMap) LJIIIIZZ).get(scene)) != null && pql.stop()) {
            OM4 om4 = LIZLLL;
            if (om4 != null) {
                Iterator<PQN> it = om4.iterator();
                while (it.hasNext()) {
                    it.next().onStop(scene);
                }
                java.util.Map<String, PQL> map = LJIIIIZZ;
                synchronized (map) {
                    map.remove(scene);
                }
                return;
            }
            o.LJIJI("fluencyObserverList");
            throw null;
        }
    }

    public static final void LIZ(String scene, String str, String str2) {
        PQL pql;
        o.LJIIIZ(scene, "scene");
        if (str2 != null && LIZIZ.get() && (pql = (PQL) ((LinkedHashMap) LJIIIIZZ).get(scene)) != null) {
            pql.LIZ(str, str2);
        }
    }
}
