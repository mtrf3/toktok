package X;

import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.detail.platform.DetailPageComponent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.screenshot.IScreenshotService;
import com.ss.android.ugc.aweme.screenshot.ScreenShotContent;
import kotlin.jvm.internal.o;

/* renamed from: X.LnG, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55310LnG extends AbstractC62641OiD {
    public final /* synthetic */ DetailPageComponent LJLIL;
    public final /* synthetic */ IScreenshotService LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    @Override // X.AbstractC62641OiD
    public final java.util.Map<String, String> mobExtalParams() {
        String str;
        java.util.Map<String, String> LJJJLIIL;
        LogPbBean logPbBean;
        String imprId;
        OSZ[] oszArr = new OSZ[4];
        oszArr[0] = new OSZ("enter_from", this.LJLJI);
        Aweme aweme = this.LJLIL.getAweme();
        Integer num = null;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        String str2 = "";
        if (str == null) {
            str = "";
        }
        oszArr[1] = new OSZ("group_id", str);
        Aweme aweme2 = this.LJLIL.getAweme();
        if (aweme2 != null && (logPbBean = aweme2.getLogPbBean()) != null && (imprId = logPbBean.getImprId()) != null) {
            str2 = imprId;
        }
        oszArr[2] = new OSZ("request_id", str2);
        Aweme aweme3 = this.LJLIL.getAweme();
        if (aweme3 != null) {
            num = Integer.valueOf(aweme3.getAwemeType());
        }
        oszArr[3] = new OSZ("aweme_type", String.valueOf(num));
        java.util.Map<String, String> LJJLIIIIJ = C113554cx.LJJLIIIIJ(oszArr);
        DetailFragmentPanel detailFragmentPanel = this.LJLIL.LJZL;
        if (detailFragmentPanel == null || (LJJJLIIL = detailFragmentPanel.LJLJLLL()) == null) {
            LJJJLIIL = C113554cx.LJJJLIIL();
        }
        LJJLIIIIJ.putAll(LJJJLIIL);
        return LJJLIIIIJ;
    }

    @Override // X.AbstractC62641OiD
    public final boolean onShot(String imagePath) {
        o.LJIIIZ(imagePath, "imagePath");
        Aweme aweme = this.LJLIL.getAweme();
        ActivityC45651qj activity = this.LJLIL.getActivity();
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("DetailPageComponent", "screenshot, onShot on Profile, try show share entry");
        if (aweme != null && activity != null && this.LJLILLLLZI.LIZJ(activity, aweme)) {
            if (C86951YAp.LIZIZ.LJ() && o.LJ(this.LJLIL.getPanelContext().LIZ, "SCENE_DETAIL_OFFLINE_MODE")) {
                return false;
            }
            IScreenshotService service = this.LJLILLLLZI;
            o.LJIIIIZZ(service, "service");
            return service.LJII(activity, new ScreenShotContent(imagePath, aweme, C78840Uwu.LJIJ(aweme, this.LJLJI)), this.LJLJI);
        }
        return false;
    }

    public C55310LnG(DetailPageComponent detailPageComponent, IScreenshotService iScreenshotService, String str) {
        this.LJLIL = detailPageComponent;
        this.LJLILLLLZI = iScreenshotService;
        this.LJLJI = str;
    }
}
