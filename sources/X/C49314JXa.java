package X;

import com.ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.JXa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49314JXa extends C49315JXb {
    public static final C49314JXa LIZJ = new C49314JXa();

    @QD3
    public final void onFollowStatusEvent(FollowStatusEvent event) {
        o.LJIIIZ(event, "event");
        LIZIZ(event.status);
    }

    @QD3
    public final void onReceiveRoomStatusEvent(C1IZ event) {
        o.LJIIIZ(event, "event");
        LIZIZ(event);
    }

    @QD3
    public final void onReceiveVideoEvent(C50420Jqa event) {
        o.LJIIIZ(event, "event");
        LIZIZ(event);
    }
}
