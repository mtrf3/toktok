package X;

import android.util.Pair;
import java.util.Comparator;

/* renamed from: X.IbC, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C46918IbC implements Comparator {
    public final /* synthetic */ int LJLIL;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int intValue;
        int intValue2;
        switch (this.LJLIL) {
            case 0:
                intValue = ((Integer) ((Pair) obj2).second).intValue();
                intValue2 = ((Integer) ((Pair) obj).second).intValue();
                break;
            default:
                intValue = ((Integer) ((Pair) obj2).second).intValue();
                intValue2 = ((Integer) ((Pair) obj).second).intValue();
                break;
        }
        return intValue - intValue2;
    }
}
