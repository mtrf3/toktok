package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EEM {
    public Context LIZ;
    public final java.util.Map<String, EEP> LIZIZ = new ConcurrentHashMap();
    public final java.util.Map<String, EEP> LIZJ = new ConcurrentHashMap();
    public final java.util.Map<EFK, List<String>> LIZLLL = new HashMap();

    public final boolean LIZ(EFK type) {
        o.LJIIIZ(type, "type");
        o.LJI(((HashMap) this.LIZLLL).get(type));
        return !((List) r0).isEmpty();
    }

    public final EEP LIZIZ(String name) {
        EEP eep;
        o.LJIIIZ(name, "name");
        Object obj = ((ConcurrentHashMap) this.LIZJ).get(name);
        o.LJI(obj);
        EEP eep2 = (EEP) obj;
        FCD.LJI(EF7.LIZIZ());
        synchronized (eep2) {
            if (!((ConcurrentHashMap) this.LIZIZ).containsKey(name)) {
                if (EEQ.LIZ || EEQ.LIZ(eep2)) {
                    C36093EEn.LIZ.getClass();
                    EEA eea = C36093EEn.LJI;
                    if (eea != null) {
                        eea.LIZIZ(eep2);
                    }
                    Context context = this.LIZ;
                    if (context != null) {
                        eep2.run(context);
                        List<EEY> triggerOtherLegoComponents = eep2.triggerOtherLegoComponents();
                        if (triggerOtherLegoComponents != null && triggerOtherLegoComponents.size() > 0) {
                            C36089EEj LJIIIZ = C36093EEn.LJIIIZ();
                            for (EEY component : triggerOtherLegoComponents) {
                                o.LJIIIIZZ(component, "component");
                                LJIIIZ.LIZ(component);
                            }
                            LJIIIZ.LIZJ();
                        }
                        C36093EEn.LIZ.getClass();
                        EEA eea2 = C36093EEn.LJI;
                        if (eea2 != null) {
                            eea2.LIZ(eep2);
                        }
                    } else {
                        o.LJIJI("context");
                        throw null;
                    }
                }
                ((ConcurrentHashMap) this.LIZIZ).put(name, eep2);
            }
            Object obj2 = ((ConcurrentHashMap) this.LIZIZ).get(name);
            o.LJI(obj2);
            eep = (EEP) obj2;
        }
        return eep;
    }

    public final String LIZJ(EFK type) {
        o.LJIIIZ(type, "type");
        synchronized (this.LIZLLL) {
            Object obj = ((HashMap) this.LIZLLL).get(type);
            o.LJI(obj);
            if (!((List) obj).isEmpty()) {
                Object obj2 = ((HashMap) this.LIZLLL).get(type);
                o.LJI(obj2);
                return (String) ((List) obj2).remove(0);
            }
            return null;
        }
    }

    public final List<String> LIZLLL(EFK type) {
        ArrayList arrayList;
        o.LJIIIZ(type, "type");
        synchronized (this.LIZLLL) {
            Object obj = ((HashMap) this.LIZLLL).get(type);
            o.LJI(obj);
            arrayList = new ArrayList((Collection) obj);
            Object obj2 = ((HashMap) this.LIZLLL).get(type);
            o.LJI(obj2);
            ((List) obj2).clear();
        }
        return arrayList;
    }
}
