package X;

import android.os.Bundle;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* renamed from: X.Fod, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40107Fod extends G46 {
    public final C62822Ol8 LIZJ = C221108m2.LIZIZ(new AqS156S0100000_6(this, 21));

    @Override // X.G46, X.G48, X.InterfaceC86124Xr6
    public final void onActivityDestroyed(ActivityC86117Xqz activity) {
        o.LJIIIZ(activity, "activity");
        this.LIZIZ = null;
        EventBus LIZJ = EventBus.LIZJ();
        if (((Boolean) this.LIZJ.getValue()).booleanValue() && LIZJ.LJI(activity)) {
            LIZJ.LJIJ(activity);
        }
    }

    @Override // X.G46, X.G48, X.InterfaceC86124Xr6
    public final void onActivityCreated(ActivityC86117Xqz activity, Bundle bundle) {
        o.LJIIIZ(activity, "activity");
        super.onActivityCreated(activity, bundle);
        EventBus LIZJ = EventBus.LIZJ();
        if (!LIZJ.LJI(activity) && ((Boolean) this.LIZJ.getValue()).booleanValue()) {
            LIZJ.LJIILJJIL(activity);
        }
    }
}
