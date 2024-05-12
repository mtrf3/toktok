package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.Jvm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50742Jvm {
    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(InterfaceC50310Joo interfaceC50310Joo, C50650JuI c50650JuI) {
        C50650JuI c50650JuI2;
        Object invoke;
        InterfaceC88472Yns<C50650JuI, Object> signalBinder;
        Iterator<AbstractC50743Jvn<?>> it = AbstractC50743Jvn.LJ.iterator();
        while (it.hasNext()) {
            AbstractC50743Jvn<?> next = it.next();
            if (c50650JuI == null) {
                c50650JuI2 = new C50650JuI(null, null, null, null, null, null, null, 127, null);
            } else {
                c50650JuI2 = c50650JuI;
            }
            next.getClass();
            ArrayList<EnumC50746Jvq> arrayList = next.LIZIZ;
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
            Iterator<EnumC50746Jvq> it2 = arrayList.iterator();
            while (true) {
                Object obj = null;
                if (!it2.hasNext()) {
                    break;
                }
                EnumC50746Jvq next2 = it2.next();
                if (next2 != null && (signalBinder = next2.getSignalBinder()) != null) {
                    obj = signalBinder.invoke(c50650JuI2);
                }
                arrayList2.add(String.valueOf(obj));
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                Object next3 = it3.next();
                if (!o.LJ(next3, "")) {
                    arrayList3.add(next3);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                Object next4 = it4.next();
                if (!o.LJ(next4, CardStruct.IStatusCode.DEFAULT)) {
                    arrayList4.add(next4);
                }
            }
            ArrayList arrayList5 = new ArrayList(C32I.LJJL(arrayList4, 10));
            Iterator it5 = arrayList4.iterator();
            while (it5.hasNext()) {
                Object key = it5.next();
                if (!next.LIZJ.containsKey(key)) {
                    next.LIZJ.put(key, next.LIZ());
                }
                C50745Jvp<?> c50745Jvp = next.LIZLLL;
                Object state = next.LIZJ.get(key);
                if (state == null) {
                    state = next.LIZ();
                }
                c50745Jvp.getClass();
                o.LJIIIZ(key, "key");
                o.LJIIIZ(state, "state");
                InterfaceC88471Ynr<?, InterfaceC50310Joo, ?> interfaceC88471Ynr = c50745Jvp.LIZ.get(C65352Pkq.LIZ(interfaceC50310Joo.getClass()).LIZLLL());
                if (interfaceC88471Ynr != null && (invoke = interfaceC88471Ynr.invoke(state, interfaceC50310Joo)) != null) {
                    state = invoke;
                }
                arrayList5.add(new OSZ(key, state));
            }
            C113554cx.LJJLIIIJJIZ(arrayList5, next.LIZJ);
        }
    }
}
