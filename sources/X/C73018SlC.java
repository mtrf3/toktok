package X;

import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.ies.powerlist.PowerStub;
import kotlin.jvm.internal.o;

/* renamed from: X.SlC, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73018SlC implements InterfaceC115514g7<Object, InterfaceC73019SlD> {
    public final /* synthetic */ PowerCell LIZ;

    public C73018SlC(PowerCell powerCell) {
        this.LIZ = powerCell;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.4ia, X.SlD] */
    @Override // X.InterfaceC115514g7
    public final InterfaceC73019SlD LIZ(Object obj, InterfaceC74236TBo property) {
        o.LJIIIZ(property, "property");
        PowerStub stub = this.LIZ.getStub();
        if (stub != null) {
            return stub.LIZLLL(InterfaceC73019SlD.class);
        }
        return null;
    }
}
