package X;

import com.ss.android.ugc.aweme.im.service.model.ActivityStatus;
import java.util.List;

/* renamed from: X.3jK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C92023jK implements InterfaceC112734bd {
    public static final C92023jK LIZ = new C92023jK();
    public static final List<String> LIZIZ = C47261Igj.LJJIJIIJI("interaction_name", "interaction_type", "enter_from", "enter_method", "message_type", "interaction_type", "interaction_name");
    public static final C85323Wm LIZJ = C772831o.LIZ();

    @Override // X.InterfaceC112734bd
    public final int LIZ(ActivityStatus activityStatus) {
        C4FY c4fy;
        if (activityStatus != null && (c4fy = C3KP.LIZ(activityStatus, null, EF7.LIZIZ(), 3).LJLILLLLZI) != null) {
            return c4fy.getValue();
        }
        return 0;
    }

    @Override // X.InterfaceC112734bd
    public final String LIZIZ(ActivityStatus activityStatus) {
        return String.valueOf(LIZ(activityStatus));
    }

    @Override // X.InterfaceC112734bd
    public final void LIZJ(String str, String str2, String str3, String str4, String str5) {
        LIZJ.LIZIZ("reply_friend_im", C113554cx.LJJL(new OSZ("enter_from", str), new OSZ("enter_method", str2), new OSZ("event_type", str3), new OSZ("active_status", str4), new OSZ("to_user_id", str5)));
    }
}
