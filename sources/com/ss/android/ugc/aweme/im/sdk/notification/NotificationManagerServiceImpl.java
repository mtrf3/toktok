package com.ss.android.ugc.aweme.im.sdk.notification;

import X.C34B;
import X.C48841JEv;
import X.C49E;
import X.C58096Mr6;
import X.C66082ia;
import X.C78613UtF;
import X.C83393Pb;
import X.InterfaceC55058LjC;
import X.X1D;
import X.XKX;
import android.app.Activity;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.im.INotificationManagerService;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class NotificationManagerServiceImpl implements INotificationManagerService {
    @Override // com.ss.android.ugc.aweme.im.INotificationManagerService
    public final void LIZ() {
        C83393Pb.LIZ().getClass();
    }

    public static INotificationManagerService LJIIIZ() {
        Object LIZ = C58096Mr6.LIZ(INotificationManagerService.class, false);
        if (LIZ != null) {
            return (INotificationManagerService) LIZ;
        }
        if (C58096Mr6.k1 == null) {
            synchronized (INotificationManagerService.class) {
                if (C58096Mr6.k1 == null) {
                    C58096Mr6.k1 = new NotificationManagerServiceImpl();
                }
            }
        }
        return C58096Mr6.k1;
    }

    @Override // com.ss.android.ugc.aweme.im.INotificationManagerService
    public final void LIZIZ(PushSettings setting) {
        boolean z;
        o.LJIIIZ(setting, "setting");
        C49E LIZ = C83393Pb.LIZ();
        LIZ.getClass();
        boolean z2 = false;
        if (setting.imPush == 1) {
            z = true;
        } else {
            z = false;
        }
        LIZ.LIZ = z;
        if (setting.pushMessagePreviewText == 1) {
            z2 = true;
        }
        LIZ.LIZIZ = z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0013, code lost:
    
        if (r4.intValue() == 1) goto L5;
     */
    @Override // com.ss.android.ugc.aweme.im.INotificationManagerService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(java.lang.Integer r4) {
        /*
            r3 = this;
            X.49E r2 = X.C83393Pb.LIZ()
            if (r4 != 0) goto Lb
        L7:
            r1 = 0
        L8:
            r2.LIZ = r1
            return
        Lb:
            r2.getClass()
            int r0 = r4.intValue()
            r1 = 1
            if (r0 != r1) goto L7
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.notification.NotificationManagerServiceImpl.LIZJ(java.lang.Integer):void");
    }

    @Override // com.ss.android.ugc.aweme.im.INotificationManagerService
    public final void LIZLLL(boolean z) {
        C49E LIZ = C83393Pb.LIZ();
        if (!z) {
            LIZ.getClass();
            XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZ), null, null, new C66082ia(LIZ, z, null), 3);
        } else {
            LIZ.LIZJ = z;
        }
    }

    @Override // com.ss.android.ugc.aweme.im.INotificationManagerService
    public final void LJ(Integer num) {
        C83393Pb.LIZ().getClass();
        if (num == null) {
            return;
        }
        num.intValue();
    }

    @Override // com.ss.android.ugc.aweme.im.INotificationManagerService
    public final void LJFF(Integer num) {
        C83393Pb.LIZ().getClass();
        if (num == null) {
            return;
        }
        num.intValue();
    }

    @Override // com.ss.android.ugc.aweme.im.INotificationManagerService
    public final void LJI(Integer num) {
        C83393Pb.LIZ().getClass();
        if (num == null) {
            return;
        }
        num.intValue();
    }

    @Override // com.ss.android.ugc.aweme.im.INotificationManagerService
    public final void LJII(Integer num) {
        C83393Pb.LIZ().getClass();
        if (num == null) {
            return;
        }
        num.intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0013, code lost:
    
        if (r4.intValue() == 1) goto L5;
     */
    @Override // com.ss.android.ugc.aweme.im.INotificationManagerService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(java.lang.Integer r4) {
        /*
            r3 = this;
            X.49E r2 = X.C83393Pb.LIZ()
            if (r4 != 0) goto Lb
        L7:
            r1 = 0
        L8:
            r2.LIZIZ = r1
            return
        Lb:
            r2.getClass()
            int r0 = r4.intValue()
            r1 = 1
            if (r0 != r1) goto L7
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.notification.NotificationManagerServiceImpl.LJIIIIZZ(java.lang.Integer):void");
    }

    @Override // com.ss.android.ugc.aweme.im.INotificationManagerService
    public final void onActivityResumed(Activity activity) {
        String str;
        String str2;
        String str3;
        C49E LIZ = C83393Pb.LIZ();
        LIZ.getClass();
        new WeakReference(activity);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(" mIsColdStart: ");
        LIZ2.append(LIZ.LIZLLL);
        LIZ2.append(" activity: ");
        String str4 = null;
        if (activity != null) {
            str = activity.getLocalClassName();
        } else {
            str = null;
        }
        LIZ2.append(str);
        C34B.LIZIZ("NotificationManager", X1D.LIZIZ(LIZ2));
        if ((activity instanceof InterfaceC55058LjC) && LIZ.LIZLLL) {
            LIZ.LIZLLL = false;
            return;
        }
        if (IMService.createIIMServicebyMonsterPlugin(false).getImNotificationService().LJ()) {
            C34B.LIZIZ("NotificationManager", " MessageQueue is empty");
            return;
        }
        if (activity != null) {
            str2 = activity.getLocalClassName();
        } else {
            str2 = null;
        }
        if (!TextUtils.equals(str2, "miniapp.views.MiniAppListH5Activity")) {
            if (activity != null) {
                str3 = activity.getLocalClassName();
            } else {
                str3 = null;
            }
            if (!TextUtils.equals(str3, "miniapp.RecentlyUsedMicroAppActivity") && !C49E.LIZ(activity)) {
                if (activity != null) {
                    str4 = activity.getLocalClassName();
                }
                if (TextUtils.equals(str4, "shortvideo.ui.VideoRecordNewActivity")) {
                    return;
                }
                IExternalService LIZ3 = AVExternalServiceImpl.LIZ();
                if (LIZ3.configService().shortVideoConfig().isRecording()) {
                    return;
                }
                if ((activity != null && LIZ3.publishService().inPublishPage(activity)) || LIZ.LIZJ) {
                    return;
                }
                IMService.createIIMServicebyMonsterPlugin(false).getImNotificationService().LJI(0L, false);
                return;
            }
        }
        IMService.createIIMServicebyMonsterPlugin(false).getImNotificationService().LJII();
    }
}
