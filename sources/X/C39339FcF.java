package X;

import com.ss.android.ugc.aweme.pns.universalpopup.api.UniversalPopupService;
import com.ss.android.ugc.aweme.pns.universalpopup.api.UniversalPopupService2;
import com.ss.android.ugc.aweme.pns.universalpopup.uiextension.defaultui.UniversalPopupBottomSheetUI;
import com.ss.android.ugc.aweme.pns.universalpopup.uiextension.defaultui.UniversalPopupDialogUI;
import com.ss.android.ugc.aweme.pns.universalpopup.uiextension.defaultui.UniversalPopupFullscreenUI;

/* renamed from: X.FcF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39339FcF {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(UniversalPopupService2 universalPopupService2) {
        universalPopupService2.LIZ(UniversalPopupFullscreenUI.class, EnumC39340FcG.FULLSCREEN.getValue());
        universalPopupService2.LIZ(UniversalPopupBottomSheetUI.class, EnumC39340FcG.BOTTOM_SHEET.getValue());
        universalPopupService2.LIZ(UniversalPopupDialogUI.class, EnumC39340FcG.DIALOG.getValue());
    }

    public static void LIZIZ(UniversalPopupService universalPopupService) {
        universalPopupService.LIZ(UniversalPopupFullscreenUI.class, EnumC39340FcG.FULLSCREEN.getValue());
        universalPopupService.LIZ(UniversalPopupBottomSheetUI.class, EnumC39340FcG.BOTTOM_SHEET.getValue());
        universalPopupService.LIZ(UniversalPopupDialogUI.class, EnumC39340FcG.DIALOG.getValue());
    }
}
