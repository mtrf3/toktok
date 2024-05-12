package X;

import java.util.NoSuchElementException;

/* renamed from: X.4Fb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C106274Fb {
    public static C4FY LIZ(int i) {
        for (C4FY c4fy : C4FY.values()) {
            if (c4fy.getValue() == i) {
                return c4fy;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }
}
