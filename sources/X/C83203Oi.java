package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.stranger.ui.MessageRequestsActivity;
import kotlin.jvm.internal.o;

/* renamed from: X.3Oi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C83203Oi extends AbstractC65781Prl implements InterfaceC65784Pro<C83193Oh> {
    public static final C83203Oi LJLIL = new C83203Oi();

    public C83203Oi() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.3Oh] */
    @Override // X.InterfaceC65784Pro
    public final C83193Oh invoke() {
        return new C3OZ() { // from class: X.3Oh
            @Override // X.C3OZ, X.C2TS
            public final void LIZJ(ActivityC45651qj activityC45651qj, String sessionID) {
                o.LJIIIZ(sessionID, "sessionID");
                C83253On.LIZIZ(activityC45651qj);
            }

            @Override // X.C3OZ, X.C2TS
            public final void LIZ(ActivityC45651qj activityC45651qj, String sessionID, java.util.Map<String, String> map) {
                o.LJIIIZ(sessionID, "sessionID");
                C16880lQ.LIZJ(activityC45651qj, new Intent(activityC45651qj, (Class<?>) MessageRequestsActivity.class));
                C2U8.LIZ(new C54251LQx(11, -1));
                FMX.onEventV3("im_click_stranger_message");
            }

            @Override // X.C3OZ, X.C2TS
            public final void LIZIZ(ActivityC45651qj activityC45651qj, String sessionID, java.util.Map<String, String> map) {
                o.LJIIIZ(sessionID, "sessionID");
                LIZ(activityC45651qj, sessionID, map);
            }
        };
    }
}
