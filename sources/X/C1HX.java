package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.1HX, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1HX implements C0MG {
    public final InterfaceC88472Yns<Object, Boolean> LIZ;
    public final java.util.Map<String, List<Object>> LIZIZ;
    public final java.util.Map<String, List<InterfaceC65784Pro<Object>>> LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C0MG
    public final java.util.Map<String, List<Object>> LIZJ() {
        java.util.Map<String, List<Object>> LJJLIL = C113554cx.LJJLIL(this.LIZIZ);
        for (Map.Entry entry : ((LinkedHashMap) this.LIZJ).entrySet()) {
            Object key = entry.getKey();
            List list = (List) entry.getValue();
            if (list.size() == 1) {
                Object invoke = ((InterfaceC65784Pro) ListProtector.get(list, 0)).invoke();
                if (invoke == null) {
                    continue;
                } else if (LIZ(invoke)) {
                    LJJLIL.put(key, C47261Igj.LJII(invoke));
                } else {
                    "Check failed.".toString();
                    throw new IllegalStateException("Check failed.");
                }
            } else {
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    Object invoke2 = ((InterfaceC65784Pro) ListProtector.get(list, i)).invoke();
                    if (invoke2 == null || LIZ(invoke2)) {
                        arrayList.add(invoke2);
                    } else {
                        "Check failed.".toString();
                        throw new IllegalStateException("Check failed.");
                    }
                }
                LJJLIL.put(key, arrayList);
            }
        }
        return LJJLIL;
    }

    @Override // X.C0MG
    public final boolean LIZ(Object value) {
        o.LJIIIZ(value, "value");
        return this.LIZ.invoke(value).booleanValue();
    }

    @Override // X.C0MG
    public final Object LJFF(String key) {
        o.LJIIIZ(key, "key");
        List<Object> remove = this.LIZIZ.remove(key);
        if (remove != null && (!remove.isEmpty())) {
            if (remove.size() > 1) {
                this.LIZIZ.put(key, remove.subList(1, remove.size()));
            }
            return ListProtector.get(remove, 0);
        }
        return null;
    }

    public C1HX(java.util.Map<String, ? extends List<? extends Object>> map, InterfaceC88472Yns<Object, Boolean> interfaceC88472Yns) {
        java.util.Map<String, List<Object>> linkedHashMap;
        this.LIZ = interfaceC88472Yns;
        if (map != null) {
            linkedHashMap = C113554cx.LJJLIL(map);
        } else {
            linkedHashMap = new LinkedHashMap<>();
        }
        this.LIZIZ = linkedHashMap;
        this.LIZJ = new LinkedHashMap();
    }

    @Override // X.C0MG
    public final C0MF LIZLLL(final String key, final InterfaceC65784Pro<? extends Object> interfaceC65784Pro) {
        o.LJIIIZ(key, "key");
        if (!ujb.o.LJJJJJL(key)) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.LIZJ;
            Object obj = linkedHashMap.get(key);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(key, obj);
            }
            ((List) obj).add(interfaceC65784Pro);
            return new C0MF() { // from class: X.1HW
                @Override // X.C0MF
                public final void LIZIZ() {
                    List<InterfaceC65784Pro<Object>> remove = C1HX.this.LIZJ.remove(key);
                    if (remove != null) {
                        remove.remove(interfaceC65784Pro);
                        if (!remove.isEmpty()) {
                            C1HX.this.LIZJ.put(key, remove);
                        }
                    }
                }
            };
        }
        "Registered key is empty or blank".toString();
        throw new IllegalArgumentException("Registered key is empty or blank");
    }
}
