package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.router.SmartRouter;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.GyK, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43256GyK {
    public InterfaceC26329AUz LIZ;
    public InterfaceC43257GyL LIZIZ;

    public final void LIZ(Activity activity, InterfaceC26329AUz interfaceC26329AUz) {
        String[] strArr;
        String str;
        if (Build.VERSION.SDK_INT < 33) {
            strArr = new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"};
            str = "bpea-profile_video_avatar_select";
        } else {
            strArr = new String[]{"android.permission.READ_MEDIA_VIDEO"};
            str = "bpea-profile_video_avatar_select_target_33";
        }
        List<String> LIZ = C86298Xtu.LIZ(activity, strArr);
        if (LIZ == null || ((ArrayList) LIZ).isEmpty()) {
            this.LIZ = interfaceC26329AUz;
            SmartRouter.buildRoute(activity, "//profile/avatar_choose").open(2, new C43254GyI(this));
        } else {
            C61099NyR.LIZIZ.LIZIZ(activity, TokenCert.with(str)).LIZ(strArr).LIZJ(new C43258GyM(this, activity, interfaceC26329AUz));
        }
    }

    public static void LIZIZ(C43256GyK c43256GyK, int i, int i2, Intent intent) {
        InterfaceC43257GyL interfaceC43257GyL;
        c43256GyK.getClass();
        if (i2 != -1) {
            return;
        }
        if (i == 2) {
            InterfaceC26329AUz interfaceC26329AUz = c43256GyK.LIZ;
            if (interfaceC26329AUz == null) {
                return;
            }
            interfaceC26329AUz.onData(C16880lQ.LLJJIJIIJIL(intent, "mp4"));
            return;
        }
        if (i != 3 || (interfaceC43257GyL = c43256GyK.LIZIZ) == null) {
            return;
        }
        C43255GyJ c43255GyJ = (C43255GyJ) interfaceC43257GyL;
        c43255GyJ.LIZ.setResult(-1, intent);
        c43255GyJ.LIZ.finish();
    }
}
