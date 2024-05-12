package X;

import Y.AfS16S1200000_5;
import Y.AfS17S0001000_5;
import com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.IRetrofit;
import com.ss.android.ugc.aweme.live.api.ILivePermissionApi;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.RetrofitService;

/* renamed from: X.CJq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31130CJq {
    public static final C31130CJq LIZIZ = new C31130CJq();
    public static boolean LIZJ = false;
    public IRetrofit LIZ;

    public C31130CJq() {
        if (C73548Stk.LIZ == null) {
            C73548Stk.LIZ = new AfS17S0001000_5(1, 1);
        }
        IAccountService LJIJ = AccountService.LJIJ();
        if (LJIJ != null) {
            LJIJ.LJIILJJIL(new LEA() { // from class: X.CJr
                @Override // X.LEA
                public final void onAccountResult(int i, boolean z, int i2, User user) {
                    C31130CJq.LIZJ = false;
                }
            });
        }
    }

    public static void LIZIZ(String str, Throwable th) {
        if (!"shoot".equals(str)) {
            return;
        }
        String str2 = "";
        if (!(th instanceof C29401Dk)) {
            Throwable cause = th.getCause();
            if ((cause != null && (str2 = cause.getMessage()) == null) || str2.isEmpty()) {
                str2 = "unknown_reason";
            }
            if (str2.length() > 50) {
                str2 = "error_msg_too_long";
            }
        }
        if (!str2.isEmpty()) {
            C78920UyC.LJI("livesdk_shoot_no_live_tab_reason", str2, "no_live_tab_reason");
        }
    }

    public final void LIZJ(C44 c44, String str) {
        IRetrofit iRetrofit = this.LIZ;
        if (iRetrofit == null) {
            iRetrofit = RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit("https://webcast.tiktokv.com");
            this.LIZ = iRetrofit;
        }
        ((ILivePermissionApi) iRetrofit.create(ILivePermissionApi.class)).getLivePodCast().LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new C31129CJp(this, c44, str, 1), new AfS16S1200000_5(this, c44, str, 0));
    }

    public static void LIZ(int i, int i2, String str, boolean z) {
        if (!LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_broadcast_path_get_live_podcast_response", LiveLogMonitorSampleSetting.getSAMPLE_100())) {
            return;
        }
        String str2 = "normal";
        BZI LIZIZ2 = C0N3.LIZIZ("livesdk_broadcast_path_get_live_podcast_response", "normal", "enter_from");
        LIZIZ2.LJIJJ(Integer.valueOf(i), "is_success");
        if (z) {
            str2 = "smooth";
        }
        C78895Uxn.LIZIZ(LIZIZ2, str2, "is_smooth", i2, "can_live");
        LIZIZ2.LJIJJ(str, "error");
        LIZIZ2.LJJIIJZLJL();
    }
}
