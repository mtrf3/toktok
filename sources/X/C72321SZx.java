package X;

import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.ies.powerlist.PowerStub;
import kotlin.jvm.internal.o;

/* renamed from: X.SZx, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72321SZx implements InterfaceC115514g7<Object, InterfaceC72324Sa0> {
    public final /* synthetic */ PowerCell LIZ;

    public C72321SZx(PowerCell powerCell) {
        this.LIZ = powerCell;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.Sa0, X.4ia] */
    @Override // X.InterfaceC115514g7
    public final InterfaceC72324Sa0 LIZ(Object obj, InterfaceC74236TBo property) {
        o.LJIIIZ(property, "property");
        PowerStub stub = this.LIZ.getStub();
        if (stub != null) {
            return stub.LIZLLL(InterfaceC72324Sa0.class);
        }
        return null;
    }
}
