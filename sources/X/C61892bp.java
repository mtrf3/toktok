package X;

import java.util.NoSuchElementException;

/* renamed from: X.2bp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C61892bp {
    public static EnumC61772bd LIZ(int i) {
        for (EnumC61772bd enumC61772bd : EnumC61772bd.values()) {
            if (enumC61772bd.getType() == i) {
                return enumC61772bd;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }
}
