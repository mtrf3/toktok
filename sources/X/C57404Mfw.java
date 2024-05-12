package X;

import Y.AfS27S0110000_9;
import Y.AfS61S0100000_9;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.compliance.protection.common.model.UserNightScreenTimeSettings;
import com.ss.android.ugc.aweme.compliance.protection.timelock.api.NightReminder;
import com.ss.android.ugc.aweme.compliance.protection.timelock.api.NightScreenTimeApi;
import com.ss.android.ugc.aweme.compliance.protection.timelock.api.UpdateUserAction;
import kotlin.jvm.internal.o;

/* renamed from: X.Mfw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57404Mfw {
    public static final NightScreenTimeApi LIZ;
    public static int LIZIZ;

    static {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        LIZ = (NightScreenTimeApi) C77800Ug8.LIZIZ(str, "API_URL_PREFIX_SI", LIZLLL, str, NightScreenTimeApi.class);
        LIZIZ = 3;
    }

    public static void LIZ(UserNightScreenTimeSettings sleepTimeSettings, boolean z) {
        o.LJIIIZ(sleepTimeSettings, "sleepTimeSettings");
        LIZ.getNightReiminderSettings(new NightReminder(sleepTimeSettings, (int) (System.currentTimeMillis() / 1000))).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS61S0100000_9(sleepTimeSettings, 2), new AfS27S0110000_9(sleepTimeSettings, z, 0));
    }

    public static void LIZIZ(EnumC57405Mfx userAction, UserNightScreenTimeSettings userNightScreenTimeSettings) {
        o.LJIIIZ(userAction, "userAction");
        LIZ.updateUserDialogAction(new UpdateUserAction(userAction.getValue(), userNightScreenTimeSettings, (int) (System.currentTimeMillis() / 1000))).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(C57403Mfv.LJLIL, C57406Mfy.LJLIL);
    }
}
