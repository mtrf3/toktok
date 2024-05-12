package X;

import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.ies.powerlist.PowerStub;
import kotlin.jvm.internal.o;

/* renamed from: X.9hq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C243989hq implements InterfaceC115514g7<Object, InterfaceC243979hp> {
    public final /* synthetic */ PowerCell LIZ;

    public C243989hq(PowerCell powerCell) {
        this.LIZ = powerCell;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.9hp, X.4ia] */
    @Override // X.InterfaceC115514g7
    public final InterfaceC243979hp LIZ(Object obj, InterfaceC74236TBo property) {
        o.LJIIIZ(property, "property");
        PowerStub stub = this.LIZ.getStub();
        if (stub != null) {
            return stub.LIZLLL(InterfaceC243979hp.class);
        }
        return null;
    }
}
