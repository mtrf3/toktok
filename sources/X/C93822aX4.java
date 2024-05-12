package X;

import java.util.NoSuchElementException;

/* renamed from: X.aX4, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93822aX4 {
    public static EnumC93823aX5 LIZ(int i) {
        for (EnumC93823aX5 enumC93823aX5 : EnumC93823aX5.values()) {
            if (enumC93823aX5.getValue() == i) {
                return enumC93823aX5;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }
}
