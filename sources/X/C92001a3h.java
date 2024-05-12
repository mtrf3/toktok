package X;

import java.util.NoSuchElementException;

/* renamed from: X.a3h, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92001a3h {
    public static EnumC92259a7r LIZ(int i) {
        for (EnumC92259a7r enumC92259a7r : EnumC92259a7r.values()) {
            if (enumC92259a7r.getValue() == i) {
                return enumC92259a7r;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }
}
