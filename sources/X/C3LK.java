package X;

import android.content.Context;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.3LK, reason: invalid class name */
/* loaded from: classes2.dex */
public class C3LK extends C3L3 {
    @Override // X.C3L3, X.C3L4
    public int LJIIIIZZ() {
        return 1;
    }

    @Override // X.C3L3, X.C3L4
    public C3OB LIZJ() {
        return new C3OB() { // from class: X.3OX
            public TuxActionSheet LIZ;

            @Override // X.C3OB
            public final void LIZ(ActivityC45651qj activity, C3L4 session, int i, java.util.Map<String, String> map) {
                String str;
                String str2;
                TuxActionSheet tuxActionSheet;
                TuxActionSheet tuxActionSheet2;
                o.LJIIIZ(activity, "activity");
                o.LJIIIZ(session, "session");
                IMUser LJIJI = C3LK.this.LJIJI();
                if (i != 0) {
                    boolean z = false;
                    if (i != 1 && i != 2) {
                        if (i != 3 || (tuxActionSheet = this.LIZ) == null || !tuxActionSheet.isVisible() || (tuxActionSheet2 = this.LIZ) == null) {
                            return;
                        }
                        tuxActionSheet2.dismiss();
                        return;
                    }
                    if (LJIJI == null) {
                        C34B.LIZJ("StrangerSession", "doAction click user invalid");
                        return;
                    }
                    LJIJI.setType(4);
                    InterfaceC98813uH imChatService = IMService.createIIMServicebyMonsterPlugin(false).getImChatService();
                    C98593tv c98593tv = new C98593tv((Context) activity, LJIJI);
                    C3LK c3lk = C3LK.this;
                    c98593tv.setEnterFrom(2);
                    HashMap<String, String> hashMap = session.LJZ;
                    String str3 = "";
                    if (hashMap == null || (str = hashMap.get("enter_from")) == null) {
                        str = "";
                    }
                    c98593tv.setEnterFromForMob(str);
                    HashMap<String, String> hashMap2 = session.LJZ;
                    if (hashMap2 != null && (str2 = hashMap2.get("enter_method")) != null) {
                        str3 = str2;
                    }
                    c98593tv.setEnterMethodForMob(str3);
                    c98593tv.setSessionId(session.LJFF());
                    c98593tv.setUnreadCount(session.LJLLILLLL);
                    c98593tv.setUnreadViewState(session.LLF);
                    c98593tv.setFollowStatus(LJIJI.getFollowStatus());
                    c98593tv.setStickyTop(session.LJLLLL);
                    if (session.LJLLLLLL == 25) {
                        z = true;
                    }
                    c98593tv.setTCM(z);
                    c98593tv.setFiltered(session.LLI);
                    c98593tv.setChatType(1);
                    c98593tv.setHighRiskConversation(c3lk.LJIILL());
                    c98593tv.setMediaMsgMasking(session.LLIFFJFJJ);
                    imChatService.LJFF(c98593tv);
                    return;
                }
                this.LIZ = C83253On.LIZ(activity, C3LK.this.LJIJI(), session, AnonymousClass367.ChatSession, null);
            }
        };
    }

    @Override // X.C3L3
    /* renamed from: LJIIZILJ */
    public C3L3 clone() {
        C3LK c3lk = new C3LK(LJIJI(), this.LLIIIILZ);
        LJIJ(c3lk);
        return c3lk;
    }

    @Override // X.C3L4
    public String LJ() {
        IMUser LJIJI = LJIJI();
        if (LJIJI == null) {
            C34B.LIZJ("StrangerSession", "getName user invalid");
            return "";
        }
        String nickName = LJIJI.getNickName();
        o.LJIIIIZZ(nickName, "user.nickName");
        return nickName;
    }

    @Override // X.C3L3
    public /* bridge */ /* synthetic */ Object clone() {
        return clone();
    }

    public C3LK(IMUser iMUser, String str) {
        super(iMUser, str);
    }
}
