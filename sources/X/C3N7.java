package X;

import android.content.Context;
import android.content.DialogInterface;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.model.IMChatExt;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import kotlin.jvm.internal.o;

/* renamed from: X.3N7, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3N7 extends AbstractC65781Prl implements InterfaceC65784Pro<C83293Or> {
    public static final C3N7 LJLIL = new C3N7();

    public C3N7() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.3Or] */
    @Override // X.InterfaceC65784Pro
    public final C83293Or invoke() {
        return new C3OZ() { // from class: X.3Or
            @Override // X.C3OZ, X.C2TS
            public final void LIZJ(ActivityC45651qj activityC45651qj, String sessionID) {
                o.LJIIIZ(sessionID, "sessionID");
                C3L3 c3l3 = (C3L3) C771431a.LIZ().LIZJ(sessionID);
                if (c3l3 == null) {
                    return;
                }
                C3K3.LIZ().LJLJJLL = C83253On.LIZ(activityC45651qj, c3l3.LLIIIZ, c3l3, AnonymousClass367.ChatSession, new DialogInterface.OnDismissListener() { // from class: X.3Ot
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        C3K3.LIZ().LJLJJLL = null;
                    }
                });
            }

            @Override // X.C3OZ, X.C2TS
            public final void LIZ(ActivityC45651qj activityC45651qj, String sessionID, java.util.Map<String, String> map) {
                boolean z;
                boolean z2;
                boolean z3;
                String str;
                String str2;
                o.LJIIIZ(sessionID, "sessionID");
                C3L3 c3l3 = (C3L3) C771431a.LIZ().LIZJ(sessionID);
                if (c3l3 == null) {
                    return;
                }
                boolean z4 = false;
                if (map != null && (str2 = map.get("has_icon")) != null) {
                    z = Boolean.parseBoolean(str2);
                } else {
                    z = false;
                }
                IMUser iMUser = c3l3.LLIIIZ;
                if (iMUser == null) {
                    iMUser = new IMUser();
                    iMUser.setUid(String.valueOf(C81273Gx.LIZLLL(sessionID)));
                    Object obj = c3l3.LJLJI;
                    if (obj instanceof UrlModel) {
                        o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.base.model.UrlModel");
                        iMUser.setAvatarThumb((UrlModel) obj);
                    }
                    iMUser.setNickName(c3l3.LJ());
                }
                iMUser.setType(-1);
                IMChatExt iMChatExt = new IMChatExt();
                iMChatExt.commerceScene = "msg_list";
                InterfaceC98813uH imChatService = IMService.createIIMServicebyMonsterPlugin(false).getImChatService();
                C98593tv c98593tv = new C98593tv((Context) activityC45651qj, iMUser);
                c98593tv.setEnterFrom(3);
                c98593tv.setEnterFromForMob("notification_page");
                c98593tv.setEnterMethodForMob("cell");
                c98593tv.setSessionId(c3l3.LJFF());
                c98593tv.setChatExt(iMChatExt);
                c98593tv.setHasCameraIcon(z);
                c98593tv.setUnreadCount(c3l3.LJLLILLLL);
                if (c3l3.LJLLI != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                c98593tv.setRecommendedChat(z2);
                c98593tv.setUnreadViewState(c3l3.LLF);
                c98593tv.setFollowStatus(iMUser.getFollowStatus());
                c98593tv.setStickyTop(c3l3.LJLLLL);
                if (c3l3.LJLLLLLL == 25) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                c98593tv.setTCM(z3);
                c98593tv.setActivityStatus(c3l3.LJLJJLL.LJLILLLLZI);
                c98593tv.setLastMessageMsgType(c3l3.LJLJLLL);
                C109544Rq LJIILJJIL = c3l3.LJIILJJIL();
                if (LJIILJJIL == null || (str = LJIILJJIL.getUuid()) == null) {
                    str = "";
                }
                c98593tv.setLastMsgUUId(str);
                if (c3l3.LLII == EnumC96553qd.SEEN) {
                    z4 = true;
                }
                c98593tv.setLastMsgRead(z4);
                c98593tv.setMediaMsgMasking(c3l3.LLIFFJFJJ);
                c98593tv.setHighRiskConversation(c3l3.LJIILL());
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
