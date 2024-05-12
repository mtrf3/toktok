package X;

import android.util.SparseArray;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1C7, reason: invalid class name */
/* loaded from: classes.dex */
public class C1C7 implements C0B9 {
    public final SparseArray<List<C0AQ>> LIZ = new SparseArray<>();

    @Override // X.C0B9
    public final C0AQ LIZ(int i) {
        List<C0AQ> list = this.LIZ.get(i);
        if (list != null && !list.isEmpty()) {
            return (C0AQ) ListProtector.get(list, 0);
        }
        throw new IllegalArgumentException(KMP.LJ("Cannot find the wrapper for global view type ", i));
    }

    @Override // X.C0B9
    public final C0B8 LIZIZ(final C0AQ c0aq) {
        return new C0B8(c0aq) { // from class: X.1C6
            public final C0AQ LIZ;

            @Override // X.C0B8
            public final int LIZIZ(int i) {
                return i;
            }

            @Override // X.C0B8
            public final void dispose() {
                C1C7 c1c7 = C1C7.this;
                C0AQ c0aq2 = this.LIZ;
                int size = c1c7.LIZ.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        List<C0AQ> valueAt = c1c7.LIZ.valueAt(size);
                        if (valueAt.remove(c0aq2) && valueAt.isEmpty()) {
                            c1c7.LIZ.removeAt(size);
                        }
                    } else {
                        return;
                    }
                }
            }

            @Override // X.C0B8
            public final int LIZ(int i) {
                List<C0AQ> list = C1C7.this.LIZ.get(i);
                if (list == null) {
                    list = new ArrayList<>();
                    C1C7.this.LIZ.put(i, list);
                }
                if (!list.contains(this.LIZ)) {
                    list.add(this.LIZ);
                }
                return i;
            }

            {
                this.LIZ = c0aq;
            }
        };
    }
}
