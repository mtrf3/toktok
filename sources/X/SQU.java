package X;

import X.AbstractC73265SpB;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import k72.a;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public abstract class SQU<T, BUILDER extends a<T, BUILDER, VH>, VH extends AbstractC73265SpB<T>> {
    public final List<OSJ<InterfaceC88472Yns<ViewGroup, VH>, InterfaceC88471Ynr<Integer, Object, Boolean>, InterfaceC88471Ynr<Integer, RecyclerView, C76800UCe>>> LIZ = new ArrayList();
    public final C73246Sos<T> LIZIZ;

    public SQU(C73246Sos c73246Sos) {
        this.LIZIZ = c73246Sos;
    }

    public static void LIZ(C70846RrG c70846RrG, InterfaceC88471Ynr typeMatcher, InterfaceC88472Yns factory) {
        o.LJIIJ(typeMatcher, "typeMatcher");
        o.LJIIJ(factory, "factory");
        ((ArrayList) c70846RrG.LIZ).add(new OSJ(factory, typeMatcher, null));
    }
}
