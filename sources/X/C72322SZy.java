package X;

import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.ies.powerlist.PowerStub;
import kotlin.jvm.internal.o;

/* renamed from: X.SZy, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72322SZy implements InterfaceC115514g7<Object, InterfaceC72323SZz> {
    public final /* synthetic */ PowerCell LIZ;

    public C72322SZy(PowerCell powerCell) {
        this.LIZ = powerCell;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.SZz, X.4ia] */
    @Override // X.InterfaceC115514g7
    public final InterfaceC72323SZz LIZ(Object obj, InterfaceC74236TBo property) {
        o.LJIIIZ(property, "property");
        PowerStub stub = this.LIZ.getStub();
        if (stub != null) {
            return stub.LIZLLL(InterfaceC72323SZz.class);
        }
        return null;
    }
}
