package X;

import android.content.Context;
import com.lynx.jsbridge.LynxModule;
import com.lynx.jsbridge.LynxModuleManager;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Ff1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39511Ff1 {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(LynxModuleManager lynxModuleManager, List wrappers) {
        C3C4 c3c4;
        VNS LJI;
        o.LJIIIZ(lynxModuleManager, "lynxModuleManager");
        o.LJIIIZ(wrappers, "wrappers");
        try {
            Object declaredField = lynxModuleManager.getClass().getDeclaredField("weakContext");
            Object obj = null;
            if (declaredField != 0) {
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(lynxModuleManager);
                if (obj2 != null && (obj2 instanceof WeakReference)) {
                    Context context = (Context) ((WeakReference) obj2).get();
                    if (!(context instanceof VNU)) {
                        context = null;
                    }
                    VNU vnu = (VNU) context;
                    if (vnu != null && (LJI = vnu.LJI()) != null) {
                        Object tag = LJI.getTag(R.id.nhy);
                        if (C65777Prh.LJI(tag)) {
                            obj = tag;
                        }
                        List list = (List) obj;
                        if (list == null) {
                            list = new ArrayList();
                        }
                        Iterator it = wrappers.iterator();
                        while (it.hasNext()) {
                            C39523FfD c39523FfD = (C39523FfD) it.next();
                            String name = c39523FfD.LIZ;
                            Class<? extends LynxModule> module = c39523FfD.LIZIZ;
                            o.LJIIIIZZ(module, "module");
                            String LJLLILLLL = C16880lQ.LJLLILLLL(module);
                            if (LJLLILLLL == null) {
                                LJLLILLLL = module.getName();
                            }
                            o.LJIIIIZZ(name, "name");
                            list.add(new C39515Ff5(LJLLILLLL, name));
                            LJI.setTag(R.id.nhy, list);
                        }
                    }
                }
            } else {
                declaredField = 0;
            }
            C3C5.m7constructorimpl(declaredField);
            c3c4 = declaredField;
        } catch (Throwable th) {
            C3C4 LIZ2 = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ2);
            c3c4 = LIZ2;
        }
        C3C5.m10exceptionOrNullimpl(c3c4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZIZ(LynxModuleManager lynxModuleManager, String str, Class cls) {
        C3C4 c3c4;
        C3C4 c3c42;
        o.LJIIIZ(lynxModuleManager, "lynxModuleManager");
        try {
            Field declaredField = lynxModuleManager.getClass().getDeclaredField("weakContext");
            Object obj = null;
            if (declaredField != 0) {
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                Object obj2 = declaredField.get(lynxModuleManager);
                c3c42 = declaredField;
                if (obj2 != null) {
                    c3c42 = declaredField;
                    if (obj2 instanceof WeakReference) {
                        Context context = (Context) ((WeakReference) obj2).get();
                        if (!(context instanceof VNU)) {
                            context = null;
                        }
                        VNU vnu = (VNU) context;
                        c3c42 = declaredField;
                        if (vnu != null) {
                            VNS LJI = vnu.LJI();
                            c3c42 = declaredField;
                            if (LJI != null) {
                                Object tag = LJI.getTag(R.id.nhy);
                                if (C65777Prh.LJI(tag)) {
                                    obj = tag;
                                }
                                List list = (List) obj;
                                if (list == null) {
                                    list = new ArrayList();
                                }
                                String LJLLILLLL = C16880lQ.LJLLILLLL(cls);
                                if (LJLLILLLL == null) {
                                    LJLLILLLL = cls.getName();
                                }
                                list.add(new C39515Ff5(LJLLILLLL, str));
                                LJI.setTag(R.id.nhy, list);
                                c3c42 = declaredField;
                            }
                        }
                    }
                }
            } else {
                c3c42 = null;
            }
            C3C5.m7constructorimpl(c3c42);
            c3c4 = c3c42;
        } catch (Throwable th) {
            C3C4 LIZ2 = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ2);
            c3c4 = LIZ2;
        }
        C3C5.m10exceptionOrNullimpl(c3c4);
    }
}
