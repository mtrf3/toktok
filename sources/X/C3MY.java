package X;

import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.3MY, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3MY extends C3L5 {
    public int LLIIIILZ;
    public boolean LLIIIJ = true;
    public boolean LLIIIL;
    public boolean LLIIIZ;
    public boolean LLIIJI;

    @Override // X.C3L4
    public final int LJIIIIZZ() {
        return 20;
    }

    @Override // X.C3L4
    public final C3OB LIZJ() {
        final C68322mC c68322mC = new C68322mC();
        return new C3OB() { // from class: X.3OW
            /* JADX WARN: Type inference failed for: r0v7, types: [T, com.bytedance.tux.sheet.actionsheet.TuxActionSheet] */
            @Override // X.C3OB
            public final void LIZ(ActivityC45651qj activity, C3L4 session, int i, java.util.Map<String, String> map) {
                IMConversation iMConversation;
                String str;
                String str2;
                TuxActionSheet tuxActionSheet;
                TuxActionSheet tuxActionSheet2;
                o.LJIIIZ(activity, "activity");
                o.LJIIIZ(session, "session");
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i != 3 || (tuxActionSheet = c68322mC.element) == null || !tuxActionSheet.isVisible() || (tuxActionSheet2 = c68322mC.element) == null) {
                            return;
                        }
                        tuxActionSheet2.dismiss();
                        return;
                    }
                    InterfaceC98813uH imChatService = IMService.createIIMServicebyMonsterPlugin(false).getImChatService();
                    C98593tv c98593tv = new C98593tv(activity, 3, C3MY.this.LJLILLLLZI);
                    C3MY c3my = C3MY.this;
                    c98593tv.setEnterFrom(3);
                    HashMap<String, String> hashMap = session.LJZ;
                    if (hashMap == null || (str = hashMap.get("enter_from")) == null) {
                        str = "message";
                    }
                    c98593tv.setEnterFromForMob(str);
                    HashMap<String, String> hashMap2 = session.LJZ;
                    if (hashMap2 == null || (str2 = hashMap2.get("enter_method")) == null) {
                        str2 = "chat_list";
                    }
                    c98593tv.setEnterMethodForMob(str2);
                    c98593tv.setUnreadCount(session.LJLLILLLL);
                    c98593tv.setUnreadViewState(session.LLF);
                    c98593tv.setStickyTop(session.LJLLLL);
                    c98593tv.setHighRiskConversation(c3my.LJIILL());
                    c98593tv.setMediaMsgMasking(c3my.LLIFFJFJJ);
                    c98593tv.setDissolvedGroup(c3my.LLIIJI);
                    imChatService.LJFF(c98593tv);
                    return;
                }
                C3Q9.LIZ.getClass();
                C75782yE.LIZ();
                C63120Opw LIZ = C4WC.LIZIZ.LIZ(C3MY.this.LJLILLLLZI);
                if (LIZ != null) {
                    iMConversation = C3K0.LIZIZ(LIZ);
                } else {
                    iMConversation = null;
                }
                c68322mC.element = C83253On.LIZ(activity, iMConversation, session, AnonymousClass367.ChatSession, null);
            }
        };
    }
}
