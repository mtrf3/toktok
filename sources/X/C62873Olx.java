package X;

import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.IAVMobService;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import kotlin.jvm.internal.o;

/* renamed from: X.Olx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62873Olx {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public long LIZLLL;

    public final void LIZ(int i, ExceptionResult exceptionResult) {
        Integer num;
        IAVMobService aVMobService = AVExternalServiceImpl.LIZ().getAVMobService();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("resource_type", "effect");
        c188727au.LJ(System.currentTimeMillis() - this.LIZLLL, "duration");
        c188727au.LIZLLL(i, "status");
        String str = this.LIZIZ;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        c188727au.LJIIIZ("effect_id", str);
        String str3 = this.LIZJ;
        if (str3 != null) {
            str2 = str3;
        }
        c188727au.LJIIIZ("music_id", str2);
        c188727au.LJIIIZ("enter_from", this.LIZ);
        if (i == 1) {
            String str4 = null;
            if (exceptionResult != null) {
                num = Integer.valueOf(exceptionResult.getErrorCode());
            } else {
                num = null;
            }
            c188727au.LJFF(num, "error_code");
            if (exceptionResult != null) {
                str4 = exceptionResult.getMsg();
            }
            c188727au.LJI("error_msg", str4);
        }
        aVMobService.onEventV3("tool_performance_resource_download", c188727au.LIZ);
    }

    public C62873Olx(String enterForm, String str, String str2) {
        o.LJIIIZ(enterForm, "enterForm");
        this.LIZ = enterForm;
        this.LIZIZ = str;
        this.LIZJ = str2;
    }
}
