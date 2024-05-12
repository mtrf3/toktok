package X;

import android.app.Activity;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.screenshot.IScreenshotService;
import com.ss.android.ugc.aweme.screenshot.ScreenShotContent;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.feed.platform.panel.screenshot.ScreenShotPanelComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import kotlin.jvm.internal.o;

/* renamed from: X.LnF, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55309LnF extends AbstractC62641OiD {
    public final /* synthetic */ ScreenShotPanelComponent LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    @Override // X.AbstractC62641OiD
    public final java.util.Map<String, String> mobExtalParams() {
        String str;
        String str2;
        Aweme currentAweme;
        Aweme currentAweme2;
        Activity validTopActivity = ActivityStack.getValidTopActivity();
        Integer num = null;
        if ((validTopActivity instanceof ActivityC45651qj) && validTopActivity != null) {
            str = C16880lQ.LJLLJ(validTopActivity.getClass());
        } else {
            str = null;
        }
        if (TextUtils.equals(str, this.LJLILLLLZI)) {
            OSZ[] oszArr = new OSZ[3];
            oszArr[0] = new OSZ("enter_from", this.LJLJI);
            IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LJLIL.LJLJI.getValue();
            if (iViewPagerComponentAbility == null || (currentAweme2 = iViewPagerComponentAbility.getCurrentAweme()) == null || (str2 = currentAweme2.getAid()) == null) {
                str2 = "";
            }
            oszArr[1] = new OSZ("group_id", str2);
            IViewPagerComponentAbility iViewPagerComponentAbility2 = (IViewPagerComponentAbility) this.LJLIL.LJLJI.getValue();
            if (iViewPagerComponentAbility2 != null && (currentAweme = iViewPagerComponentAbility2.getCurrentAweme()) != null) {
                num = Integer.valueOf(currentAweme.getAwemeType());
            }
            oszArr[2] = new OSZ("aweme_type", String.valueOf(num));
            return C113554cx.LJJL(oszArr);
        }
        return C113554cx.LJJJLIIL();
    }

    @Override // X.AbstractC62641OiD
    public final boolean onShot(String imagePath) {
        Aweme aweme;
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility;
        o.LJIIIZ(imagePath, "imagePath");
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LJLIL.LJLJI.getValue();
        ActivityC45651qj activityC45651qj = null;
        if (iViewPagerComponentAbility != null) {
            aweme = iViewPagerComponentAbility.getCurrentAweme();
        } else {
            aweme = null;
        }
        Activity validTopActivity = ActivityStack.getValidTopActivity();
        if (validTopActivity instanceof ActivityC45651qj) {
            activityC45651qj = (ActivityC45651qj) validTopActivity;
        }
        C221018lt.LJFF("ScreenShotPanelComponent", "screenshot, onShot on Feed");
        if (aweme == null || activityC45651qj == null || !TextUtils.equals(C16880lQ.LJLLJ(activityC45651qj.getClass()), this.LJLILLLLZI) || (iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LJLIL.LJLIL.getValue()) == null || !iFeedPanelPlatformAbility.isNoDialogPopup() || !((IScreenshotService) this.LJLIL.LJLILLLLZI.getValue()).LIZJ(activityC45651qj, aweme) || (C86951YAp.LIZIZ.LJ() && o.LJ(this.LJLIL.getPanelContext().LIZ, "SCENE_DETAIL_OFFLINE_MODE"))) {
            return false;
        }
        C221018lt.LJFF("ScreenShotPanelComponent", "screenshot, onShot on Feed, try show share entry");
        IScreenshotService screenShotService = (IScreenshotService) this.LJLIL.LJLILLLLZI.getValue();
        o.LJIIIIZZ(screenShotService, "screenShotService");
        String enterFrom = this.LJLJI;
        o.LJIIIIZZ(enterFrom, "enterFrom");
        ScreenShotContent screenShotContent = new ScreenShotContent(imagePath, aweme, C78840Uwu.LJIJ(aweme, enterFrom));
        String enterFrom2 = this.LJLJI;
        o.LJIIIIZZ(enterFrom2, "enterFrom");
        return screenShotService.LJII(activityC45651qj, screenShotContent, enterFrom2);
    }

    public C55309LnF(ScreenShotPanelComponent screenShotPanelComponent, String str, String str2) {
        this.LJLIL = screenShotPanelComponent;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
    }
}
