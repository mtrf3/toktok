package X;

import com.ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.JzU, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50972JzU extends C50973JzV {
    public static final C50972JzU LIZJ = new C50972JzU();

    @QD3
    public final void onFollowStatusEvent(FollowStatusEvent event) {
        o.LJIIIZ(event, "event");
        LIZ(event.status);
    }

    @QD3
    public final void onReceiveRoomStatusEvent(C1IZ event) {
        o.LJIIIZ(event, "event");
        LIZ(event);
    }

    @QD3
    public final void onReceiveVideoEvent(C50420Jqa event) {
        o.LJIIIZ(event, "event");
        LIZ(event);
    }
}
