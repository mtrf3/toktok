package X;

import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import kotlin.jvm.internal.o;

/* renamed from: X.XcX, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85221XcX {
    public final Context LIZ = EF7.LIZIZ();
    public final ILocationBaseServiceForMT LIZIZ;
    public EnumC85222XcY LIZJ;

    public final EnumC85222XcY LIZ() {
        if (!C85256Xd6.LIZIZ(this.LIZ)) {
            return EnumC85222XcY.NOT_GRANTED;
        }
        boolean isSystemPrecise = this.LIZIZ.isSystemPrecise(this.LIZ);
        boolean inAppPreciseUnknown = this.LIZIZ.inAppPreciseUnknown();
        boolean isInAppPrecise = this.LIZIZ.isInAppPrecise();
        if (!inAppPreciseUnknown && isInAppPrecise && isSystemPrecise) {
            return EnumC85222XcY.PRECISE;
        }
        return EnumC85222XcY.COARSE;
    }

    public C85221XcX() {
        Object service = ServiceManager.get().getService(ILocationBaseServiceForMT.class);
        o.LJIIIIZZ(service, "get().getService(ILocati…ServiceForMT::class.java)");
        this.LIZIZ = (ILocationBaseServiceForMT) service;
        this.LIZJ = LIZ();
    }
}
