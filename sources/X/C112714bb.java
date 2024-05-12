package X;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* renamed from: X.4bb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C112714bb {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(Context context, User user, String str, String str2, String str3) {
        IMUser fromUser = IMUser.fromUser(user);
        if (fromUser == null) {
            return;
        }
        InterfaceC98813uH imChatService = IMService.createIIMServicebyMonsterPlugin(false).getImChatService();
        C98593tv c98593tv = new C98593tv(context, fromUser);
        c98593tv.setEnterFromForMob(str);
        c98593tv.setEnterFromSubPage(str3);
        c98593tv.setButtonType(C221658mv.LIZ(context, user));
        c98593tv.setEnterMethodForMob(str2);
        imChatService.LJFF(c98593tv);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean LIZ(Context context, User user, String str, String str2, boolean z, int i) {
        String remarkName;
        T t = str;
        T t2 = str2;
        if ((i & 4) != 0) {
            t = "notification_page";
        }
        if ((i & 8) != 0) {
            t2 = "button";
        }
        if (user == null || !z || user.getFollowStatus() != 2) {
            return false;
        }
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = t;
        if (t == 0) {
            c68322mC.element = "notification_page";
        }
        C68322mC c68322mC2 = new C68322mC();
        c68322mC2.element = t2;
        if (t2 == 0) {
            c68322mC2.element = "button";
        }
        IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
        o.LJIIIIZZ(createIIMServicebyMonsterPlugin, "get()");
        if (C57107Mb9.LIZIZ(createIIMServicebyMonsterPlugin.getImSayHiService(), user.getUid(), 6)) {
            createIIMServicebyMonsterPlugin.getImSayhiAnalytics().LIZIZ(user.getUid(), C113554cx.LJJLIIIIJ(new OSZ("enter_from", c68322mC.element), new OSZ("enter_method", c68322mC2.element)));
            if (C3U6.LIZ) {
                if (TextUtils.isEmpty(user.getRemarkName())) {
                    remarkName = user.getNickname();
                } else {
                    remarkName = user.getRemarkName();
                }
                InterfaceC57106Mb8 imSayHiService = createIIMServicebyMonsterPlugin.getImSayHiService();
                String uid = user.getUid();
                o.LJIIIIZZ(uid, "uid");
                imSayHiService.LIZ(context, uid, remarkName, false, C113554cx.LJJLIIIIJ(new OSZ("enter_from", c68322mC.element), new OSZ("enter_method", "button"), new OSZ("message_type", "emoji"), new OSZ("message_from", "greeting_button")), false, new C112724bc(context, user, c68322mC, c68322mC2, null));
                C2U8.LIZ(new C3U3(user.getUid()));
                return true;
            }
        }
        LIZIZ(context, user, (String) c68322mC.element, (String) c68322mC2.element, null);
        return true;
    }
}
