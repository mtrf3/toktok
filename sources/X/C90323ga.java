package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.qainvitation.service.IQAInvitationService;
import java.util.List;

/* renamed from: X.3ga, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C90323ga {
    public static /* synthetic */ void LIZIZ(IQAInvitationService iQAInvitationService, Activity activity, String str, String str2, long j, long j2, List list) {
        iQAInvitationService.LIZ(activity, str, str2, j, j2, list, null);
    }

    public static /* synthetic */ void LIZ(IQAInvitationService iQAInvitationService, Activity activity, String str, String str2, EnumC90333gb enumC90333gb, Long l, Long l2, List list, com.ss.android.ugc.aweme.qna.model.Qna qna, InterfaceC88472Yns interfaceC88472Yns, int i) {
        Long l3 = l2;
        Long l4 = l;
        List list2 = list;
        com.ss.android.ugc.aweme.qna.model.Qna qna2 = qna;
        InterfaceC88472Yns interfaceC88472Yns2 = null;
        if ((i & 16) != 0) {
            l4 = null;
        }
        if ((i & 32) != 0) {
            l3 = null;
        }
        if ((i & 64) != 0) {
            list2 = null;
        }
        if ((i & 128) != 0) {
            qna2 = null;
        }
        if ((i & 256) == 0) {
            interfaceC88472Yns2 = interfaceC88472Yns;
        }
        iQAInvitationService.LIZJ(activity, str, str2, enumC90333gb, l4, l3, list2, qna2, interfaceC88472Yns2);
    }
}
