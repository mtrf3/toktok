package X;

import androidx.lifecycle.LifecycleOwner;
import defpackage.i0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.5G5, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5G5 {
    public static final C5G5 LIZ = new C5G5();
    public static final ConcurrentHashMap<String, ArrayList<InterfaceC132255Gz>> LIZIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, C5G6> LIZJ = new ConcurrentHashMap<>();
    public static final Stack<String> LIZLLL = new Stack<>();

    public static LifecycleOwner LIZIZ() {
        WM7 lifecycleOwner;
        String peek = LIZLLL.peek();
        ConcurrentHashMap<String, C5G6> concurrentHashMap = LIZJ;
        if (concurrentHashMap.containsKey(peek)) {
            C5G6 c5g6 = concurrentHashMap.get(peek);
            if (c5g6 != null && (lifecycleOwner = c5g6.getLifecycleOwner()) != null) {
                return lifecycleOwner;
            }
            "CKLifecycleManager lifecycleProvider is null ".toString();
            throw new IllegalArgumentException("CKLifecycleManager lifecycleProvider is null ");
        }
        throw new IllegalStateException(i0.LJFF("CKLifecycleManager#lifecycleProviderMap does not contains key = ", peek));
    }

    public static void LIZJ() {
        Integer num;
        String peek = LIZLLL.peek();
        ConcurrentHashMap<String, ArrayList<InterfaceC132255Gz>> concurrentHashMap = LIZIZ;
        if (concurrentHashMap.containsKey(peek)) {
            ArrayList<InterfaceC132255Gz> arrayList = concurrentHashMap.get(peek);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("CKLifecycleManager#notifyOnShow, size = ");
            if (arrayList != null) {
                num = Integer.valueOf(arrayList.size());
            } else {
                num = null;
            }
            LIZ2.append(num);
            X1D.LIZIZ(LIZ2);
            if (arrayList != null) {
                Iterator<InterfaceC132255Gz> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().onShow();
                }
                return;
            }
            return;
        }
        throw new IllegalStateException(i0.LJFF("CKLifecycleManager#notifyOnShow->does not contains key = ", peek));
    }

    public static void LIZ(InterfaceC132255Gz observer) {
        ArrayList<InterfaceC132255Gz> arrayList;
        o.LJIIIZ(observer, "observer");
        String peek = LIZLLL.peek();
        ConcurrentHashMap<String, ArrayList<InterfaceC132255Gz>> concurrentHashMap = LIZIZ;
        if (concurrentHashMap.containsKey(peek) && (arrayList = concurrentHashMap.get(peek)) != null && !arrayList.contains(observer)) {
            arrayList.add(observer);
        }
    }
}
