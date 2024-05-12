package X;

import Y.AgS106S0200000_1;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.powerpage.SelectChatMsgFragment;
import com.ss.android.ugc.aweme.im.sdk.common.data.manager.keva.IMCriticalFlowKeva;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.services.BaseUserService;
import kotlin.jvm.internal.o;

/* renamed from: X.3uA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C98743uA {
    public static boolean LIZ(C98593tv p) {
        String str;
        SmartRoute buildRoute;
        int i;
        Activity LJIJJ;
        o.LJIIIZ(p, "p");
        C82223Ko c82223Ko = C99033ud.Companion;
        String sessionId = p.getSessionId();
        c82223Ko.getClass();
        ActivityC45651qj activityC45651qj = null;
        if (C82223Ko.LIZ(sessionId)) {
            QCU.LJFF("You can not start bot chat by start method!!! see IMTakoService", null, 6);
            return false;
        }
        if (!BaseUserService.createIUserServicebyMonsterPlugin(false).isLogin()) {
            Context context = p.getContext();
            if (context != null && (LJIJJ = C45804HyK.LJIJJ(context)) != null) {
                String enterFromForMob = p.getEnterFromForMob();
                if (enterFromForMob == null) {
                    enterFromForMob = "chat";
                }
                String enterMethodForMob = p.getEnterMethodForMob();
                if (enterMethodForMob == null) {
                    enterMethodForMob = "enter_chat";
                }
                J9P.LIZIZ(LJIJJ, enterFromForMob, enterMethodForMob, null, null);
            }
            return false;
        }
        String sessionId2 = p.getSessionId();
        String str2 = "";
        if (sessionId2 == null) {
            sessionId2 = "";
        }
        IMCriticalFlowKeva.LJI(sessionId2);
        if (C115494g5.LIZ()) {
            C98783uE.LIZ().LIZ(p);
        } else {
            C99693vh.LIZ(p);
        }
        if (p.getKeepEnterFrom()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        C3Y4.LJ("keep_enter_from", str);
        if (!p.getNoEvent()) {
            IMUser imUser = p.getImUser();
            if (imUser == null || p.isTCM()) {
                i = -1;
            } else {
                i = imUser.getFollowStatus();
            }
            String sessionId3 = p.getSessionId();
            if (sessionId3 != null) {
                str2 = sessionId3;
            }
            AbstractC90763hI conversationModel = C81273Gx.LIZ(str2);
            int chatType = p.getChatType();
            if (chatType != 1 && chatType != 3) {
                C98583tu.LIZ(p, i, conversationModel, 234);
            } else {
                String LIZ = C3Y4.LIZ();
                C3Q9.LIZ.getClass();
                C75782yE.LIZ();
                C4WC c4wc = C4WC.LIZIZ;
                C85323Wm onEventV3 = C772831o.LIZ();
                XIA dispatcher = C78613UtF.LIZJ;
                o.LJIIIZ(conversationModel, "conversationModel");
                o.LJIIIZ(onEventV3, "onEventV3");
                o.LJIIIZ(dispatcher, "dispatcher");
                XKX.LIZLLL(C48841JEv.LIZ(dispatcher), null, null, new C783935v(p, i, LIZ, new C1HQ(), c4wc, conversationModel, onEventV3, true, null), 3);
            }
        }
        C54502LaE.LIZ("im_chat_room");
        InterfaceC97983sw LIZ2 = LFH.LIZIZ.LIZLLL().LJIIIIZZ().LIZ();
        if (LIZ2 != null && (p.getEnterFrom() == 3 || p.getEnterFrom() == 15)) {
            if (p.getForceRefresh() || !LIZ2.LIZJ(String.valueOf(p.getSessionId()))) {
                C10K.LJII(100L).LJ(new AgS106S0200000_1(LIZ2, p, 1), C10K.LJIIIIZZ, null);
            } else {
                LIZ2.LJI();
            }
            return true;
        }
        Context context2 = p.getContext();
        if (context2 == null) {
            context2 = EF7.LIZIZ();
        }
        if (p.isReportPage() && ((Boolean) C98883uO.LIZ.getValue()).booleanValue()) {
            Activity LJIJJ2 = C45804HyK.LJIJJ(context2);
            if (LJIJJ2 instanceof ActivityC45651qj) {
                activityC45651qj = (ActivityC45651qj) LJIJJ2;
            }
            if (activityC45651qj != null) {
                SelectChatMsgFragment selectChatMsgFragment = new SelectChatMsgFragment();
                Bundle bundle = new Bundle();
                bundle.putSerializable("key_enter_chat_params", p);
                selectChatMsgFragment.setArguments(bundle);
                int height = (int) (activityC45651qj.getWindow().getDecorView().getHeight() * 0.9d);
                ASL asl = new ASL();
                asl.LIZ.LJLLILLLL = selectChatMsgFragment;
                asl.LJFF(48);
                asl.LIZ.LJZI = false;
                asl.LJI(2);
                asl.LIZJ(height, height);
                TuxSheet tuxSheet = asl.LIZ;
                tuxSheet.LJZL = true;
                C1DG.LJII(activityC45651qj, "activity.supportFragmentManager", tuxSheet, "report_page_sheet");
            }
        } else {
            if (p.isReportPage()) {
                buildRoute = SmartRouter.buildRoute(context2, "//im/select/chat/msg");
            } else {
                buildRoute = SmartRouter.buildRoute(context2, "//im/chat/room");
            }
            buildRoute.withParam("key_enter_chat_params", p);
            if (context2 instanceof ActivityC45651qj) {
                buildRoute.addFlags(536870912);
                buildRoute.open(1101);
            } else {
                buildRoute.addFlags(268435456);
                buildRoute.open();
            }
        }
        return true;
    }

    public static boolean LIZIZ(Context context, C99003ua p) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(p, "p");
        if (!BaseUserService.createIUserServicebyMonsterPlugin(false).isLogin()) {
            Activity LJIJJ = C45804HyK.LJIJJ(context);
            if (LJIJJ != null) {
                J9P.LIZIZ(LJIJJ, p.getEnterFrom(), p.getEnterMethod(), null, null);
            }
            return false;
        }
        IMCriticalFlowKeva.LJI(p.getSessionId());
        C98593tv LJJIJIL = C78949Uyf.LJJIJIL(p);
        if (C115494g5.LIZ()) {
            C98783uE.LIZ().LIZ(LJJIJIL);
        } else {
            C99693vh.LIZ(C78949Uyf.LJJIJIL(p));
        }
        C98583tu.LIZ(C78949Uyf.LJJIJIL(p), 0, C81273Gx.LIZ(p.getSessionId()), 238);
        C54502LaE.LIZ("im_chat_room");
        SmartRoute buildRoute = SmartRouter.buildRoute(context, "//im/chat/room");
        buildRoute.withParam("key_enter_bot_chat_params", p);
        if (C45804HyK.LJJIFFI(context) != null) {
            buildRoute.addFlags(536870912);
            buildRoute.open(1101);
            return true;
        }
        buildRoute.addFlags(268435456);
        buildRoute.open();
        return true;
    }
}
