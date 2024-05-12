package X;

import java.util.NoSuchElementException;

/* renamed from: X.0eP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12530eP {
    public static EnumC12540eQ LIZ(int i) {
        for (EnumC12540eQ enumC12540eQ : EnumC12540eQ.values()) {
            if (enumC12540eQ.getValue() == i) {
                return enumC12540eQ;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }
}
