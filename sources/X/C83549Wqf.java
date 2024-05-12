package X;

import android.util.SparseArray;
import kotlin.jvm.internal.AqS196S0100000_14;

/* renamed from: X.Wqf, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83549Wqf {
    public final SparseArray<C83546Wqc> LIZ;
    public final C83545Wqb LIZIZ;

    public C83549Wqf(ActivityC45651qj activityC45651qj, TEZ tez, C83589WrJ c83589WrJ, AqS196S0100000_14 aqS196S0100000_14, InterfaceC88472Yns interfaceC88472Yns, WM7 wm7) {
        SparseArray<C83546Wqc> sparseArray = new SparseArray<>();
        this.LIZ = sparseArray;
        sparseArray.put(0, new C83560Wqq(activityC45651qj, c83589WrJ));
        sparseArray.put(1, new C83556Wqm(activityC45651qj, c83589WrJ));
        sparseArray.put(2, new C83550Wqg(activityC45651qj, c83589WrJ, aqS196S0100000_14));
        this.LIZIZ = new C83545Wqb(tez, sparseArray, activityC45651qj, interfaceC88472Yns, wm7);
    }
}
