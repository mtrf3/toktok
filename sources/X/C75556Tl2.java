package X;

import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestUseLinkmicAloggerSetting;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.Tl2, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C75556Tl2 {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C75557Tl3.LJLIL);

    public final HashMap<String, Object> LIZJ() {
        return (HashMap) this.LIZ.getValue();
    }

    public static String LJFF(int i) {
        if (MultiGuestUseLinkmicAloggerSetting.INSTANCE.isEnable()) {
            StackTraceElement LJ = C32014ChO.LJ();
            StringBuilder LIZ = X1D.LIZ();
            return C77800Ug8.LIZLLL(U44.BIZ, LIZ, "_Injector_", LJ, LIZ);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        return C17M.LIZ(U44.BIZ, LIZ2, "_Injector_", i, LIZ2);
    }

    public final Object LIZ(String str) {
        return LIZJ().get(str);
    }

    public final <T> T LIZIZ(String str) {
        T t = (T) LIZJ().get(str);
        if (t == null) {
            return null;
        }
        return t;
    }

    public final void LIZLLL(Object target) {
        boolean z;
        String str;
        o.LJIIIZ(target, "target");
        ArrayList arrayList = new ArrayList();
        for (Class<?> cls = target.getClass(); cls != null && !o.LJ(cls, Object.class); cls = cls.getSuperclass()) {
            Field[] declaredFields = cls.getDeclaredFields();
            o.LJIIIIZZ(declaredFields, "clazz.declaredFields");
            ORS.LJJLIIIJJIZ(arrayList, declaredFields);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((Field) next).getAnnotation(InterfaceC75558Tl4.class) != null) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(C32I.LJJL(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Field field = (Field) it2.next();
            InterfaceC75558Tl4 interfaceC75558Tl4 = (InterfaceC75558Tl4) field.getAnnotation(InterfaceC75558Tl4.class);
            if (interfaceC75558Tl4 != null) {
                str = interfaceC75558Tl4.name();
            } else {
                str = null;
            }
            arrayList3.add(new OSZ(field, str));
        }
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            OSZ osz = (OSZ) it3.next();
            Object obj = LIZJ().get(osz.getSecond());
            InterfaceC75558Tl4 interfaceC75558Tl42 = (InterfaceC75558Tl4) ((Field) osz.getFirst()).getAnnotation(InterfaceC75558Tl4.class);
            if (interfaceC75558Tl42 != null) {
                z = interfaceC75558Tl42.nullable();
            } else {
                z = false;
            }
            if (obj == null) {
                if (!z) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append((String) osz.getSecond());
                    LIZ.append(" has not provided, please check it's provider. Provider size is:");
                    LIZ.append(LIZJ().size());
                    LIZ.append(",provider's key is: ");
                    LIZ.append(LIZJ().keySet());
                    throw new IllegalStateException(X1D.LIZIZ(LIZ));
                }
            } else {
                ((AccessibleObject) osz.getFirst()).setAccessible(true);
                ((Field) osz.getFirst()).set(target, LIZJ().get(osz.getSecond()));
            }
        }
    }

    public final void LJ(Object target) {
        o.LJIIIZ(target, "target");
        ArrayList arrayList = new ArrayList();
        for (Class<?> cls = target.getClass(); cls != null && !o.LJ(cls, Object.class); cls = cls.getSuperclass()) {
            Field[] declaredFields = cls.getDeclaredFields();
            o.LJIIIIZZ(declaredFields, "clazz.declaredFields");
            ORS.LJJLIIIJJIZ(arrayList, declaredFields);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((Field) next).getAnnotation(InterfaceC75138TeI.class) != null) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(C32I.LJJL(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (true) {
            String str = null;
            if (!it2.hasNext()) {
                break;
            }
            Field field = (Field) it2.next();
            InterfaceC75138TeI interfaceC75138TeI = (InterfaceC75138TeI) field.getAnnotation(InterfaceC75138TeI.class);
            if (interfaceC75138TeI != null) {
                str = interfaceC75138TeI.name();
            }
            arrayList3.add(new OSZ(field, str));
        }
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            OSZ osz = (OSZ) it3.next();
            if (LIZJ().get(osz.getSecond()) == null) {
                String LJFF = LJFF(69);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append((String) osz.getSecond());
                LIZ.append(" has not provided, please check it's provider. Provider size is:");
                LIZ.append(LIZJ().size());
                LIZ.append(",provider's key is: ");
                LIZ.append(LIZJ().keySet());
                C32014ChO.LIZJ(LJFF, X1D.LIZIZ(LIZ), null);
            } else {
                ((AccessibleObject) osz.getFirst()).setAccessible(true);
                ((Field) osz.getFirst()).set(target, LIZJ().get(osz.getSecond()));
            }
        }
    }

    public final void LJI(Object injectableInstance, String str) {
        String name;
        o.LJIIIZ(injectableInstance, "injectableInstance");
        InterfaceC75560Tl6 interfaceC75560Tl6 = (InterfaceC75560Tl6) injectableInstance.getClass().getAnnotation(InterfaceC75560Tl6.class);
        if (interfaceC75560Tl6 == null || (name = interfaceC75560Tl6.name()) == null) {
            if (str == null) {
                return;
            }
        } else {
            str = name;
        }
        if (LIZJ().get(str) != null) {
            String LJFF = LJFF(24);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("warning: ");
            LIZ.append(str);
            LIZ.append(" already provided and updated");
            C32014ChO.LIZJ(LJFF, X1D.LIZIZ(LIZ), null);
        }
        LIZJ().put(str, injectableInstance);
    }
}
