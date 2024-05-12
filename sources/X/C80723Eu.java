package X;

import com.ss.android.ugc.aweme.im.service.model.IMUser;
import kotlin.jvm.internal.o;

/* renamed from: X.3Eu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C80723Eu {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(IMUser iMUser) {
        LIZ(iMUser, C772831o.LIZ());
    }

    public static void LIZ(IMUser iMUser, InterfaceC75532xp eventSender) {
        o.LJIIIZ(eventSender, "eventSender");
        C1HQ c1hq = new C1HQ();
        c1hq.put("enter_from", "chat");
        c1hq.put("enter_method", "button");
        if (iMUser != null && C3UE.LIZIZ()) {
            String recType = iMUser.getRecType();
            if (recType == null) {
                recType = "";
            }
            c1hq.put("rec_type", recType);
            c1hq.put("relation_tag", String.valueOf(iMUser.getFollowStatus()));
        }
        eventSender.LIZIZ("click_report", c1hq);
    }
}
