package X;

import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.setting.serverpush.model.InAppPushSetting;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import com.ss.android.ugc.aweme.settingsrequest.SettingsRequestServiceImpl;
import kotlin.jvm.internal.o;
import yq4.a;

/* renamed from: X.Xnp, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85921Xnp {
    public static void LIZ(PushSettings pushSettings) {
        String str;
        boolean z;
        if (((RBX) HG3.LJIILL()).isLogin()) {
            SettingsRequestServiceImpl.LJIILLIIL().LJIIJJI(pushSettings);
            C78694UuY LIZ = C118554l1.LIZ();
            Integer valueOf = Integer.valueOf(pushSettings.imPush);
            LIZ.getClass();
            C78694UuY.LIZ().LIZJ(valueOf);
            IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
            o.LJIIIIZZ(createIIMServicebyMonsterPlugin, "get()");
            createIIMServicebyMonsterPlugin.getImChatSettingsService().LJFF(pushSettings.chatSet, pushSettings.chatSettingsPanel, pushSettings.chatUserType);
            C85940Xo8.LIZIZ.LIZJ(pushSettings);
            InAppPushSetting inAppPushSetting = pushSettings.inAppPushSetting;
            if (inAppPushSetting != null) {
                InterfaceC55617LsD imNotificationService = createIIMServicebyMonsterPlugin.getImNotificationService();
                if (inAppPushSetting.getInAppImPush() == 1) {
                    z = true;
                } else {
                    z = false;
                }
                imNotificationService.LIZLLL(z);
            }
            C78694UuY LIZ2 = C118554l1.LIZ();
            Integer valueOf2 = Integer.valueOf(pushSettings.imInnerPush);
            LIZ2.getClass();
            C78694UuY.LIZ().LJFF(valueOf2);
            C78694UuY LIZ3 = C118554l1.LIZ();
            Integer valueOf3 = Integer.valueOf(pushSettings.noticeInappPush);
            LIZ3.getClass();
            C78694UuY.LIZ().LJII(valueOf3);
            C78694UuY LIZ4 = C118554l1.LIZ();
            Integer valueOf4 = Integer.valueOf(pushSettings.friendNewVideoInappPush);
            LIZ4.getClass();
            C78694UuY.LIZ().LJI(valueOf4);
            C78694UuY LIZ5 = C118554l1.LIZ();
            Integer valueOf5 = Integer.valueOf(pushSettings.pushMessagePreviewText);
            LIZ5.getClass();
            C78694UuY.LIZ().LJIIIIZZ(valueOf5);
            if (a.LJFF().LJJIJIIJI() == 1) {
                str = "on";
            } else {
                str = "off";
            }
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("status", str);
            FMX.LJIIL("tns_remove_photosensitive_status", c188727au.LIZ);
        }
    }
}
