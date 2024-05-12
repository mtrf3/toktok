package X;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.view.ContextThemeWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.EEs, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36098EEs {
    public Context LIZ;
    public final java.util.Map<String, InterfaceC36101EEv> LIZIZ = new ConcurrentHashMap();
    public final java.util.Map<String, InterfaceC36101EEv> LIZJ = new ConcurrentHashMap();
    public final java.util.Map<Class<? extends Activity>, WeakReference<Activity>> LIZLLL = new HashMap();

    public final InterfaceC36101EEv LIZ(String str) {
        InterfaceC36101EEv interfaceC36101EEv;
        Object obj = ((ConcurrentHashMap) this.LIZJ).get(str);
        o.LJI(obj);
        InterfaceC36101EEv interfaceC36101EEv2 = (InterfaceC36101EEv) obj;
        FCD.LJI(EF7.LIZIZ());
        synchronized (interfaceC36101EEv2) {
            if (!((ConcurrentHashMap) this.LIZIZ).containsKey(str)) {
                if (EEQ.LIZ || EEQ.LIZ(interfaceC36101EEv2)) {
                    Context context = this.LIZ;
                    Activity activity = null;
                    if (context != null) {
                        if (interfaceC36101EEv2.LIZIZ() != 0) {
                            Context context2 = this.LIZ;
                            if (context2 != null) {
                                context = new ContextThemeWrapper(context2, interfaceC36101EEv2.LIZIZ());
                            } else {
                                o.LJIJI("context");
                                throw null;
                            }
                        }
                        WeakReference weakReference = (WeakReference) ((HashMap) this.LIZLLL).get(interfaceC36101EEv2.LIZ());
                        if (weakReference != null) {
                            activity = (Activity) weakReference.get();
                        }
                        C36093EEn.LIZ.getClass();
                        EEA eea = C36093EEn.LJI;
                        if (eea != null) {
                            eea.LIZIZ(interfaceC36101EEv2);
                        }
                        C62822Ol8 c62822Ol8 = DSG.LJIIL;
                        if (((Boolean) c62822Ol8.getValue()).booleanValue() && !EEZ.LIZIZ() && !o.LJ(C16880lQ.LLJJJJ(), Looper.myLooper())) {
                            C35801E3h.LJFF();
                        }
                        interfaceC36101EEv2.LJFF(activity, context);
                        if (((Boolean) c62822Ol8.getValue()).booleanValue() && !EEZ.LIZIZ() && !o.LJ(C16880lQ.LLJJJJ(), Looper.myLooper())) {
                            C35801E3h.LJI();
                        }
                        EEA eea2 = C36093EEn.LJI;
                        if (eea2 != null) {
                            eea2.LIZ(interfaceC36101EEv2);
                        }
                    } else {
                        o.LJIJI("context");
                        throw null;
                    }
                }
                synchronized (this.LIZIZ) {
                    ((ConcurrentHashMap) this.LIZIZ).put(str, interfaceC36101EEv2);
                }
            }
            Object obj2 = ((ConcurrentHashMap) this.LIZIZ).get(str);
            o.LJI(obj2);
            interfaceC36101EEv = (InterfaceC36101EEv) obj2;
        }
        return interfaceC36101EEv;
    }
}
