package X;

import com.bytedance.android.livesdk.livesetting.performance.WidgetSlowFuncOptSetting;
import kotlin.jvm.internal.o;

/* renamed from: X.CbX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31651CbX implements InterfaceC115514g7<Object, Object> {
    public Object LIZ;
    public final /* synthetic */ InterfaceC65784Pro<Object> LIZIZ;

    public C31651CbX(InterfaceC65784Pro<Object> interfaceC65784Pro) {
        this.LIZIZ = interfaceC65784Pro;
        if (!WidgetSlowFuncOptSetting.isEnable()) {
            this.LIZ = interfaceC65784Pro.invoke();
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
