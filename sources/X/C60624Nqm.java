package X;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeMap;

/* renamed from: X.Nqm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60624Nqm implements InterfaceC37736ErU {
    public final C60625Nqn LIZ;
    public final InterfaceC60638Nr0 LIZIZ;
    public final ArrayList<InterfaceC37737ErV> LIZJ;
    public final HashMap<Class, WeakReference<InterfaceC37737ErV>> LIZLLL;
    public HashMap<Class<? extends AbstractC60629Nqr>, InterfaceC60639Nr1> LJ;
    public java.util.Map<String, TreeMap<Integer, AbstractC60536NpM>> LJFF;

    static {
        new WeakReference(null);
    }

    public final void LIZ(LinkedHashSet<Class<? extends AbstractC60629Nqr>> linkedHashSet) {
        if (linkedHashSet != null) {
            Iterator<Class<? extends AbstractC60629Nqr>> it = linkedHashSet.iterator();
            while (it.hasNext()) {
                Class<? extends AbstractC60629Nqr> next = it.next();
                AbstractC60629Nqr abstractC60629Nqr = (AbstractC60629Nqr) C60626Nqo.LIZIZ(next);
                if (abstractC60629Nqr != null) {
                    LIZIZ(next, abstractC60629Nqr);
                } else {
                    throw new Error(C09K.LIZIZ("extension init fail: ", next));
                }
            }
        }
        Iterator it2 = new ArrayList(this.LIZJ).iterator();
        while (it2.hasNext()) {
            InterfaceC37737ErV interfaceC37737ErV = (InterfaceC37737ErV) it2.next();
            if (interfaceC37737ErV instanceof AbstractC60629Nqr) {
                C60637Nqz.LIZ((AbstractC60629Nqr) interfaceC37737ErV);
            }
        }
    }

    public C60624Nqm(C60625Nqn c60625Nqn, InterfaceC60638Nr0 interfaceC60638Nr0) {
        ArrayList<InterfaceC37737ErV> arrayList = new ArrayList<>();
        this.LIZJ = arrayList;
        this.LIZLLL = new HashMap<>();
        this.LIZ = c60625Nqn;
        this.LIZIZ = interfaceC60638Nr0;
        if (interfaceC60638Nr0 instanceof InterfaceC37737ErV) {
            arrayList.add(interfaceC60638Nr0);
            return;
        }
        throw new Error("! extendable instanceof IContextItem");
    }

    public final void LIZIZ(Class<? extends AbstractC60629Nqr> cls, AbstractC60629Nqr abstractC60629Nqr) {
        InterfaceC60639Nr1 interfaceC60639Nr1;
        LinkedHashSet<InterfaceC60639Nr1> linkedHashSet;
        LinkedHashSet<InterfaceC60639Nr1> linkedHashSet2 = this.LIZ.LIZLLL;
        if (linkedHashSet2 != null) {
            Iterator<InterfaceC60639Nr1> it = linkedHashSet2.iterator();
            while (it.hasNext()) {
                it.next().LIZ(abstractC60629Nqr);
            }
        }
        HashMap<Class<? extends AbstractC60629Nqr>, LinkedHashSet<InterfaceC60639Nr1>> hashMap = this.LIZ.LJ;
        if (hashMap != null && (linkedHashSet = hashMap.get(cls)) != null) {
            Iterator<InterfaceC60639Nr1> it2 = linkedHashSet.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ(abstractC60629Nqr);
            }
        }
        HashMap<Class<? extends AbstractC60629Nqr>, InterfaceC60639Nr1> hashMap2 = this.LJ;
        if (hashMap2 != null && (interfaceC60639Nr1 = hashMap2.get(cls)) != null) {
            interfaceC60639Nr1.LIZ(abstractC60629Nqr);
        }
        this.LIZJ.add(abstractC60629Nqr);
        this.LIZLLL.put(cls, new WeakReference<>(abstractC60629Nqr));
        abstractC60629Nqr.LJLIL = this;
    }
}
