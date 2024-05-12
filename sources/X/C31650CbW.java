package X;

import com.bytedance.android.livesdk.livesetting.performance.RoomSlowFunctionOptSetting;
import kotlin.jvm.internal.AqS152S0200000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.CbW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31650CbW implements InterfaceC115514g7<Object, Object> {
    public Object LIZ;
    public final /* synthetic */ InterfaceC65784Pro<Object> LIZIZ;

    public C31650CbW(AqS152S0200000_5 aqS152S0200000_5) {
        this.LIZIZ = aqS152S0200000_5;
        if (!RoomSlowFunctionOptSetting.watchOpt()) {
            this.LIZ = aqS152S0200000_5.invoke();
        }
    }

    @Override // X.InterfaceC115514g7
    public final Object LIZ(Object obj, InterfaceC74236TBo<?> property) {
        o.LJIIIZ(property, "property");
        Object obj2 = this.LIZ;
        if (obj2 == null) {
            Object invoke = this.LIZIZ.invoke();
            this.LIZ = invoke;
            return invoke;
        }
        return obj2;
    }
}
