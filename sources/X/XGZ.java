package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XGZ {
    public final List<InterfaceC84544XGa> LIZ;
    public int LIZIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public XGZ(List<? extends InterfaceC84544XGa> list) {
        this.LIZ = list;
    }

    public final <D extends InterfaceC57357MfB> InterfaceC65462ha<XGX<D>> LIZ(XGS request) {
        o.LJIIIZ(request, "request");
        List<InterfaceC84544XGa> list = this.LIZ;
        int i = this.LIZIZ;
        this.LIZIZ = i + 1;
        return ((InterfaceC84544XGa) ListProtector.get(list, i)).LIZIZ(request, this);
    }
}
