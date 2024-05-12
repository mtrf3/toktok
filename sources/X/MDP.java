package X;

import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.I18nAbsProfileFragmentV2;
import com.ss.android.ugc.aweme.screenshot.IScreenshotService;
import com.ss.android.ugc.aweme.screenshot.ScreenShotContent;
import com.ss.android.ugc.aweme.screenshot.ScreenShotShareMobParam;
import com.ss.android.ugc.aweme.setting.model.ShareConfig;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MDP extends AbstractC62641OiD {
    public final /* synthetic */ IScreenshotService LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ I18nAbsProfileFragmentV2 LJLJI;

    @Override // X.AbstractC62641OiD
    public final java.util.Map<String, String> mobExtalParams() {
        return new MDQ(this);
    }

    @Override // X.AbstractC62641OiD
    public final boolean onShot(String str) {
        User user;
        Integer num;
        ActivityC45651qj mo49getActivity = this.LJLJI.mo49getActivity();
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("I18nAbsProfileFragmentV2", "screenshot, onShot on Profile");
        if (mo49getActivity == null || (user = this.LJLJI.LJLL) == null || !this.LJLIL.LJFF(user, mo49getActivity) || this.LJLJI.LJLJLJ != 0) {
            return false;
        }
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("I18nAbsProfileFragmentV2", "screenshot, onShot on Profile, try show share entry");
        IScreenshotService iScreenshotService = this.LJLIL;
        User user2 = this.LJLJI.LJLL;
        String enterFrom = this.LJLILLLLZI;
        o.LJIIIZ(user2, "<this>");
        o.LJIIIZ(enterFrom, "enterFrom");
        String uid = user2.getUid();
        if (uid == null) {
            uid = "";
        }
        EnumC62617Ohp enumC62617Ohp = (EnumC62617Ohp) ((java.util.Map) ShareConfig.LIZ.getValue()).get("user");
        if (enumC62617Ohp != null) {
            num = Integer.valueOf(enumC62617Ohp.getNum());
        } else {
            num = null;
        }
        return iScreenshotService.LJII(mo49getActivity, new ScreenShotContent(str, user2, new ScreenShotShareMobParam(enterFrom, uid, String.valueOf(num))), this.LJLILLLLZI);
    }

    public MDP(I18nAbsProfileFragmentV2 i18nAbsProfileFragmentV2, IScreenshotService iScreenshotService, String str) {
        this.LJLJI = i18nAbsProfileFragmentV2;
        this.LJLIL = iScreenshotService;
        this.LJLILLLLZI = str;
    }
}
