package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import defpackage.g;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.NAs, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58926NAs extends g {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        String LIZIZ;
        g.b bVar = (g.b) xBaseParamModel;
        o.LJIIIZ(type, "type");
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        if (interfaceC38263Ezz == null || (LIZIZ = interfaceC38263Ezz.LIZIZ()) == null) {
            return;
        }
        List<Number> timeList = bVar.getTimeList();
        C2U8.LIZ(new N9D(this.LJLILLLLZI, LIZIZ, bVar));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("containerID:");
        LIZ.append(LIZIZ);
        LIZ.append(", timeList:");
        LIZ.append(timeList);
        C242549fW.LIZ(X1D.LIZIZ(LIZ));
    }
}
