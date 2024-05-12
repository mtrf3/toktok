package X;

import java.util.NoSuchElementException;

/* renamed from: X.XqV, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86087XqV {
    public static EnumC86086XqU LIZ(int i) {
        for (EnumC86086XqU enumC86086XqU : EnumC86086XqU.values()) {
            if (enumC86086XqU.getType() == i) {
                return enumC86086XqU;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }
}
