package com.ss.android.ugc.aweme.services;

import X.C16880lQ;
import X.C26045AKb;
import X.C40680Fxs;
import X.C76800UCe;
import X.C81719W5j;
import X.InterfaceC88475Ynv;
import X.TBS;
import android.app.Activity;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.im.INotificationManagerService;
import com.ss.android.ugc.aweme.im.sdk.notification.NotificationManagerServiceImpl;
import com.zhiliaoapp.musically.R;
import java.io.File;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final /* synthetic */ class ProfileDependentComponentImpl$startCameraActivity$1 extends TBS implements InterfaceC88475Ynv<Activity, Fragment, Integer, String, String, C76800UCe> {
    public static final ProfileDependentComponentImpl$startCameraActivity$1 INSTANCE = new ProfileDependentComponentImpl$startCameraActivity$1();

    public ProfileDependentComponentImpl$startCameraActivity$1() {
        super(5, C81719W5j.class, "startCameraActivity", "startCameraActivity(Landroid/app/Activity;Landroidx/fragment/app/Fragment;ILjava/lang/String;Ljava/lang/String;)V", 1);
    }

    public final void invoke(Activity p0, Fragment fragment, int i, String p3, String p4) {
        o.LJIIIZ(p0, "p0");
        o.LJIIIZ(p3, "p3");
        o.LJIIIZ(p4, "p4");
        if (!o.LJ("mounted", C16880lQ.LLLLLLLZIL())) {
            C26045AKb c26045AKb = new C26045AKb(p0);
            c26045AKb.LJFF(R.drawable.a_v);
            c26045AKb.LJIIIIZZ(R.string.jkw);
            c26045AKb.LJIIJ();
            return;
        }
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        File file = new File(p3);
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, p4);
        intent.addFlags(1);
        intent.putExtra("output", C40680Fxs.LIZ(p0, file2));
        intent.putExtra("pns.sandbox.dataflow_id", 1207965441);
        try {
            if (fragment == null) {
                C16880lQ.LJFF(p0, i, intent);
            } else {
                C16880lQ.LJII(fragment, intent, i);
            }
            INotificationManagerService LJIIIZ = NotificationManagerServiceImpl.LJIIIZ();
            if (LJIIIZ == null) {
                return;
            }
            LJIIIZ.LIZLLL(true);
        } catch (Exception unused) {
            C26045AKb c26045AKb2 = new C26045AKb(p0);
            c26045AKb2.LJFF(R.drawable.a_v);
            c26045AKb2.LJIIIIZZ(R.string.jkt);
            c26045AKb2.LJIIJ();
        }
    }

    @Override // X.InterfaceC88475Ynv
    public /* bridge */ /* synthetic */ C76800UCe invoke(Activity activity, Fragment fragment, Integer num, String str, String str2) {
        invoke(activity, fragment, num.intValue(), str, str2);
        return C76800UCe.LIZ;
    }
}
