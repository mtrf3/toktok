package X;

import java.util.NoSuchElementException;

/* loaded from: classes7.dex */
public final class G3T {
    public static G3S LIZ(int i) {
        for (G3S g3s : G3S.values()) {
            if (g3s.getValue() == i) {
                return g3s;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }
}
