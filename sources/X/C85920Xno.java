package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.request_combine.request.individual.FetchUserSettingRequest;
import com.ss.android.ugc.aweme.setting.serverpush.model.InAppPushSetting;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import kotlin.jvm.internal.o;

/* renamed from: X.Xno, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85920Xno implements EUJ {
    public final /* synthetic */ FetchUserSettingRequest LJLIL;

    public C85920Xno(FetchUserSettingRequest fetchUserSettingRequest) {
        this.LJLIL = fetchUserSettingRequest;
    }

    @Override // X.EUJ
    public final void A1(PushSettings settings) {
        String curUserId;
        o.LJIIIZ(settings, "settings");
        C78694UuY LIZ = C118554l1.LIZ();
        Integer valueOf = Integer.valueOf(settings.imPush);
        LIZ.getClass();
        C78694UuY.LIZ().LIZJ(valueOf);
        Context LIZIZ = EF7.LIZIZ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("imbase_");
        RBY LJFF = AccountService.LJIJ().LJFF();
        if (LJFF == null) {
            curUserId = "-1";
        } else {
            curUserId = LJFF.getCurUserId();
        }
        LIZ2.append(CastLongProtector.parseLong(curUserId));
        boolean z = false;
        F9J.LIZIZ(LIZIZ, 0, X1D.LIZIZ(LIZ2));
        IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
        InAppPushSetting inAppPushSetting = settings.inAppPushSetting;
        if (inAppPushSetting != null) {
            InterfaceC55617LsD imNotificationService = createIIMServicebyMonsterPlugin.getImNotificationService();
            if (inAppPushSetting.getInAppImPush() == 1) {
                z = true;
            }
            imNotificationService.LIZLLL(z);
        }
        C78694UuY LIZ3 = C118554l1.LIZ();
        Integer valueOf2 = Integer.valueOf(settings.imInnerPush);
        LIZ3.getClass();
        C78694UuY.LIZ().LJFF(valueOf2);
        C78694UuY LIZ4 = C118554l1.LIZ();
        Integer valueOf3 = Integer.valueOf(settings.noticeInappPush);
        LIZ4.getClass();
        C78694UuY.LIZ().LJII(valueOf3);
        C78694UuY LIZ5 = C118554l1.LIZ();
        Integer valueOf4 = Integer.valueOf(settings.friendNewVideoInappPush);
        LIZ5.getClass();
        C78694UuY.LIZ().LJI(valueOf4);
        C78694UuY LIZ6 = C118554l1.LIZ();
        Integer valueOf5 = Integer.valueOf(settings.pushMessagePreviewText);
        LIZ6.getClass();
        C78694UuY.LIZ().LJIIIIZZ(valueOf5);
        this.LJLIL.getClass();
        FetchUserSettingRequest.LIZLLL();
    }

    @Override // X.EUJ
    public final void onFailed(Exception e) {
        o.LJIIIZ(e, "e");
        this.LJLIL.getClass();
        FetchUserSettingRequest.LIZLLL();
    }
}
