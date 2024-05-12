package X;

import android.app.Activity;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.compliance.api.expriements.DigitalWellbeingEntranceSettings;
import com.ss.android.ugc.aweme.compliance.protection.perception.PerceptionPopup;
import com.ss.android.ugc.aweme.compliance.protection.perception.UserPerceptionApiManager;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.2wL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C74612wL {
    public static void LIZ() {
        UserPerceptionApiManager.LIZ.getUserPerceptionPopup().LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new InterfaceC64592gB() { // from class: X.4gd
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                List<PerceptionPopup> list;
                PerceptionPopup perceptionPopup;
                String str;
                UserPerceptionApiManager.UserPerceptionPopupResponse userPerceptionPopupResponse = (UserPerceptionApiManager.UserPerceptionPopupResponse) obj;
                if (userPerceptionPopupResponse == null || (list = userPerceptionPopupResponse.popupList) == null || (perceptionPopup = (PerceptionPopup) ORZ.LJLLLL(list)) == null || (str = perceptionPopup.popupUrl) == null) {
                    return;
                }
                DigitalWellbeingEntranceSettings.LIZ.getClass();
                String LIZ = DigitalWellbeingEntranceSettings.LIZ(str);
                Activity validTopActivity = ActivityStack.getValidTopActivity();
                if (!(validTopActivity instanceof InterfaceC55058LjC) || !o.LJ(C116694i1.LIZ((ActivityC45651qj) validTopActivity).nv0(), "HOME")) {
                    return;
                }
                SmartRouter.buildRoute(validTopActivity, LIZ).open();
            }
        }, new InterfaceC64592gB() { // from class: X.2wM
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        });
    }
}
