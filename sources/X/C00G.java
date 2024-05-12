package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: X.00G, reason: invalid class name */
/* loaded from: classes.dex */
public final class C00G<T> {
    public final C1UB LIZ = new C1UB(10);
    public final C0MA<T, ArrayList<T>> LIZIZ = new C0MA<>();
    public final ArrayList<T> LIZJ = new ArrayList<>();
    public final HashSet<T> LIZLLL = new HashSet<>();

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t)) {
            return;
        }
        if (!hashSet.contains(t)) {
            hashSet.add(t);
            ArrayList<T> orDefault = this.LIZIZ.getOrDefault(t, null);
            if (orDefault != null) {
                int size = orDefault.size();
                for (int i = 0; i < size; i++) {
                    LIZ(ListProtector.get(orDefault, i), arrayList, hashSet);
                }
            }
            hashSet.remove(t);
            arrayList.add(t);
            return;
        }
        throw new RuntimeException("This graph contains cyclic dependencies");
    }
}
