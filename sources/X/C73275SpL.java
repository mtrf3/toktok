package X;

import X.C73365Sqn;
import android.util.SparseArray;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.SpL, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73275SpL<T, VH extends C73365Sqn<T>> {
    public int LIZ;
    public final SparseArray<InterfaceC88472Yns<ViewGroup, VH>> LIZIZ = new SparseArray<>();
    public final List<C72813Sht<VH>> LIZJ;

    public C73275SpL() {
        this.LIZ = 11513600;
        C73277SpN c73277SpN = C73277SpN.LJLIL;
        C73276SpM c73276SpM = C73276SpM.LJLIL;
        int i = this.LIZ;
        this.LIZ = i + 1;
        this.LIZJ = C47261Igj.LJJIJIL(new C72813Sht(c73277SpN, c73276SpM, i));
    }

    public final void LIZ(InterfaceC88472Yns<? super Integer, Boolean> matcher, InterfaceC88472Yns<? super ViewGroup, ? extends VH> interfaceC88472Yns) {
        o.LJIIIZ(matcher, "matcher");
        int size = this.LIZJ.size();
        int i = this.LIZ;
        this.LIZ = i + 1;
        ListProtector.add(this.LIZJ, size - 1, new C72813Sht(interfaceC88472Yns, matcher, i));
    }
}
