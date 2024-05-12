package X;

import java.util.Comparator;

/* renamed from: X.RvR, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71105RvR<T> implements Comparator {
    public static final C71105RvR<T> LJLIL = new C71105RvR<>();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i;
        C71104RvQ c71104RvQ = (C71104RvQ) obj;
        C71104RvQ c71104RvQ2 = (C71104RvQ) obj2;
        int i2 = Integer.MAX_VALUE;
        if (c71104RvQ != null) {
            i = c71104RvQ.LIZ;
        } else {
            i = Integer.MAX_VALUE;
        }
        if (c71104RvQ2 != null) {
            i2 = c71104RvQ2.LIZ;
        }
        return i - i2;
    }
}
