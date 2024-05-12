package X;

import android.content.DialogInterface;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import kotlin.jvm.internal.o;

/* renamed from: X.3Ob, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C83133Ob extends AbstractC65781Prl implements InterfaceC65784Pro<C3OY> {
    public static final C83133Ob LJLIL = new C83133Ob();

    public C83133Ob() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.3OY] */
    @Override // X.InterfaceC65784Pro
    public final C3OY invoke() {
        return new C3OZ() { // from class: X.3OY
            @Override // X.C3OZ, X.C2TS
            public final void LIZJ(ActivityC45651qj activityC45651qj, String sessionID) {
                IMConversation iMConversation;
                o.LJIIIZ(sessionID, "sessionID");
                C3L4 LIZJ = C771431a.LIZ().LIZJ(sessionID);
                if (LIZJ == null) {
                    return;
                }
                C3Q9.LIZ.getClass();
                C75782yE.LIZ();
                C63120Opw LIZ = C4WC.LIZIZ.LIZ(LIZJ.LJLILLLLZI);
                if (LIZ != null) {
                    iMConversation = C3K0.LIZIZ(LIZ);
                } else {
                    iMConversation = null;
                }
                C3K3.LIZ().LJLJJLL = C83253On.LIZ(activityC45651qj, iMConversation, LIZJ, AnonymousClass367.ChatSession, new DialogInterface.OnDismissListener() { // from class: X.3Oa
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        C3K3.LIZ().LJLJJLL = null;
                    }
                });
            }

            @Override // X.C3OZ, X.C2TS
            public final void LIZ(ActivityC45651qj activityC45651qj, String sessionID, java.util.Map<String, String> map) {
                o.LJIIIZ(sessionID, "sessionID");
                C3MY c3my = (C3MY) C771431a.LIZ().LIZJ(sessionID);
                if (c3my == null) {
                    return;
                }
                InterfaceC98813uH imChatService = IMService.createIIMServicebyMonsterPlugin(false).getImChatService();
                C98593tv c98593tv = new C98593tv(activityC45651qj, 3, c3my.LJLILLLLZI);
                c98593tv.setEnterFrom(3);
                c98593tv.setEnterFromForMob("notification_page");
                c98593tv.setEnterMethodForMob("cell");
                c98593tv.setUnreadCount(c3my.LJLLILLLL);
                c98593tv.setUnreadViewState(c3my.LLF);
                c98593tv.setStickyTop(c3my.LJLLLL);
                c98593tv.setHighRiskConversation(c3my.LJIILL());
                c98593tv.setMediaMsgMasking(c3my.LLIFFJFJJ);
                c98593tv.setDissolvedGroup(c3my.LLIIJI);
                imChatService.LJFF(c98593tv);
            }

            @Override // X.C3OZ, X.C2TS
            public final void LIZIZ(ActivityC45651qj activityC45651qj, String sessionID, java.util.Map<String, String> map) {
                o.LJIIIZ(sessionID, "sessionID");
                LIZ(activityC45651qj, sessionID, map);
            }
        };
    }
}
