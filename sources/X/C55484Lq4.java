package X;

import android.util.SparseArray;
import kotlin.jvm.internal.o;

/* renamed from: X.Lq4, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55484Lq4 extends AbstractC65781Prl implements InterfaceC88471Ynr<SparseArray<C123134sP>, java.util.Map<String, Object>, C76800UCe> {
    public static final C55484Lq4 LJLIL = new C55484Lq4();

    public C55484Lq4() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(SparseArray<C123134sP> sparseArray, java.util.Map<String, Object> map) {
        int i;
        SparseArray<C123134sP> sparseArray2 = sparseArray;
        java.util.Map<String, Object> extra = map;
        o.LJIIIZ(sparseArray2, "$this$null");
        o.LJIIIZ(extra, "extra");
        if (!sparseArray2.contains(8)) {
            i = 0;
        } else if (sparseArray2.get(8).LJLILLLLZI > sparseArray2.get(5).LJLILLLLZI) {
            i = 1;
        } else {
            i = 2;
        }
        extra.put("preload_status", Integer.valueOf(i));
        return C76800UCe.LIZ;
    }
}
