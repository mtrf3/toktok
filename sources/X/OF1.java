package X;

import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class OF1 implements InterfaceC153055zZ {
    public final Object LJLIL;

    @Override // X.InterfaceC153055zZ
    public final Object a() {
        Context context = ((C40646FxK) ((InterfaceC153055zZ) this.LJLIL)).LJLIL.LIZ;
        C40654FxS.LJI(context);
        return new C40571Fw7(context);
    }

    public /* synthetic */ OF1(InterfaceC88472Yns getter) {
        o.LJIIIZ(getter, "getter");
        this.LJLIL = getter;
    }

    public /* synthetic */ OF1(List sourceTrace) {
        o.LJIIIZ(sourceTrace, "sourceTrace");
        this.LJLIL = sourceTrace;
    }

    public final Object LIZ(InterfaceC41034G8o thisVal, InterfaceC74236TBo property) {
        o.LJIIIZ(thisVal, "thisVal");
        o.LJIIIZ(property, "property");
        return ((InterfaceC88472Yns) this.LJLIL).invoke(thisVal.L9());
    }
}
