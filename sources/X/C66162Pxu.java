package X;

import android.app.Service;
import android.content.Intent;
import kotlin.jvm.internal.o;

/* renamed from: X.Pxu, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66162Pxu implements InterfaceC66182PyE {
    @Override // X.InterfaceC66182PyE
    public final void LIZ(Service service, Intent intent, int i, int i2) {
        o.LJIIIZ(service, "service");
        HandlerThreadC64418PPy.LIZ();
        HandlerThreadC64418PPy.LJLJJI.post(new RunnableC66125PxJ(service, intent, i, i2));
    }
}
