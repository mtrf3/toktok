package X;

import android.app.Activity;
import android.os.Bundle;
import kotlin.jvm.internal.o;

/* renamed from: X.XOg, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84758XOg extends C36360EOu {
    public final /* synthetic */ C84759XOh LJLIL;

    public C84758XOg(C84759XOh c84759XOh) {
        this.LJLIL = c84759XOh;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        o.LJIIIZ(activity, "activity");
        InterfaceC84760XOi interfaceC84760XOi = this.LJLIL.LIZ;
        if (interfaceC84760XOi != null) {
            interfaceC84760XOi.onActivityDestroyed(activity);
        }
    }

    @Override // X.C36360EOu, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        o.LJIIIZ(activity, "activity");
        InterfaceC84760XOi interfaceC84760XOi = this.LJLIL.LIZ;
        if (interfaceC84760XOi != null) {
            interfaceC84760XOi.LIZ(activity);
        }
    }
}
