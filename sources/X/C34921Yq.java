package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1Yq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34921Yq implements InterfaceC17120lo {
    public static final C34921Yq LIZ = new C34921Yq();

    @Override // X.InterfaceC17120lo
    public void onEvent(String eventName) {
        o.LJIIIZ(eventName, "eventName");
        if (!C20990s3.LIZIZ().LJ()) {
            return;
        }
        if (o.LJ(eventName, "livesdk_live_duration")) {
            C20990s3.LIZIZ().LIZJ(false);
        } else {
            if (!o.LJ(eventName, "livesdk_enter_room_duration")) {
                return;
            }
            C20990s3.LIZIZ().LIZJ(true);
        }
    }
}
