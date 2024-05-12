package X;

import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.ies.powerlist.PowerStub;
import kotlin.jvm.internal.o;

/* renamed from: X.SZs, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72316SZs implements InterfaceC115514g7<Object, SRG> {
    public final /* synthetic */ PowerCell LIZ;

    public C72316SZs(PowerCell powerCell) {
        this.LIZ = powerCell;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.4ia, X.SRG] */
    @Override // X.InterfaceC115514g7
    public final SRG LIZ(Object obj, InterfaceC74236TBo property) {
        o.LJIIIZ(property, "property");
        PowerStub stub = this.LIZ.getStub();
        if (stub != null) {
            return stub.LIZLLL(SRG.class);
        }
        return null;
    }
}
