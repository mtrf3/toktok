package X;

import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.ies.powerlist.PowerStub;
import kotlin.jvm.internal.o;

/* renamed from: X.Sd6, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72516Sd6 implements InterfaceC115514g7<Object, C72513Sd3> {
    public final /* synthetic */ PowerCell LIZ;

    public C72516Sd6(PowerCell powerCell) {
        this.LIZ = powerCell;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.Sd3, X.4ia] */
    @Override // X.InterfaceC115514g7
    public final C72513Sd3 LIZ(Object obj, InterfaceC74236TBo property) {
        o.LJIIIZ(property, "property");
        PowerStub stub = this.LIZ.getStub();
        if (stub != null) {
            return stub.LIZLLL(C72513Sd3.class);
        }
        return null;
    }
}
