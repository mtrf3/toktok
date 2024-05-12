package X;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.agK, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94396agK implements InterfaceC93636aU4 {
    public final /* synthetic */ C94961apR LIZ;
    public final /* synthetic */ List LIZIZ;

    public C94396agK(C94961apR c94961apR, List list) {
        this.LIZ = c94961apR;
        this.LIZIZ = list;
    }

    @Override // X.InterfaceC93636aU4
    public final void LIZ(C93633aU1 c93633aU1, int i) {
        Context requireContext = this.LIZ.LJLILLLLZI.requireContext();
        o.LJIIIIZZ(requireContext, "requireContext()");
        C94202adC c94202adC = new C94202adC(requireContext, null);
        c94202adC.getTabName().setText((CharSequence) ((OSZ) ListProtector.get(this.LIZIZ, i)).getFirst());
        c94202adC.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        c93633aU1.LIZLLL = c94202adC;
        C93634aU2 c93634aU2 = c93633aU1.LJI;
        if (c93634aU2 != null) {
            c93634aU2.LIZ();
        }
    }
}
