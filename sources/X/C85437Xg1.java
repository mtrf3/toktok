package X;

import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.ies.powerlist.PowerStub;
import kotlin.jvm.internal.o;

/* renamed from: X.Xg1, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85437Xg1 implements InterfaceC115514g7<Object, InterfaceC85435Xfz> {
    public final /* synthetic */ PowerCell LIZ;

    public C85437Xg1(PowerCell powerCell) {
        this.LIZ = powerCell;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.Xfz, X.4ia] */
    @Override // X.InterfaceC115514g7
    public final InterfaceC85435Xfz LIZ(Object obj, InterfaceC74236TBo property) {
        o.LJIIIZ(property, "property");
        PowerStub stub = this.LIZ.getStub();
        if (stub != null) {
            return stub.LIZLLL(InterfaceC85435Xfz.class);
        }
        return null;
    }
}
