package X;

import java.util.NoSuchElementException;

/* renamed from: X.T8j, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74153T8j {
    public static EnumC74154T8k LIZ(Integer num) {
        if (num != null) {
            num.intValue();
            for (EnumC74154T8k enumC74154T8k : EnumC74154T8k.values()) {
                if (enumC74154T8k.ordinal() == num.intValue()) {
                    return enumC74154T8k;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        return null;
    }
}
