package X;

import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.ies.powerlist.PowerStub;
import kotlin.jvm.internal.o;

/* renamed from: X.SZt, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72317SZt implements InterfaceC115514g7<Object, InterfaceC240029bS> {
    public final /* synthetic */ PowerCell LIZ;

    public C72317SZt(PowerCell powerCell) {
        this.LIZ = powerCell;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.9bS, X.4ia] */
    @Override // X.InterfaceC115514g7
    public final InterfaceC240029bS LIZ(Object obj, InterfaceC74236TBo property) {
        o.LJIIIZ(property, "property");
        PowerStub stub = this.LIZ.getStub();
        if (stub != null) {
            return stub.LIZLLL(InterfaceC240029bS.class);
        }
        return null;
    }
}
