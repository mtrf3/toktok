package X;

import android.app.Activity;
import android.app.Dialog;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.settingsrequest.model.PopupSetting;
import com.ss.android.ugc.aweme.ug.amplify.api.AmplifyApi;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.XpL, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class DialogC86015XpL extends Dialog implements GHC {
    public final PopupSetting LJLIL;
    public final C73318Sq2 LJLILLLLZI;

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        this.LJLILLLLZI.dispose();
    }

    public static C73605Suf LIZ(InterfaceC88472Yns interfaceC88472Yns) {
        AmplifyApi.LIZ.getClass();
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        return ((AbstractC73547Stj) interfaceC88472Yns.invoke(C770830u.LIZJ(str, "API_URL_PREFIX_SI", LIZLLL, str).LIZ.LIZ(AmplifyApi.class))).LJIILIIL(T16.LIZ()).LJII(C73969T1h.LIZIZ()).LJIIIIZZ();
    }

    public final void LIZIZ(String str) {
        SmartRoute buildRoute = SmartRouter.buildRoute(getContext(), "aweme://webview/");
        buildRoute.withParam(UriProtector.parse(str));
        buildRoute.open();
    }

    public final void LIZJ(String str) {
        if (this.LJLIL.popupBatch == 2 && o.LJ(str, "next_time")) {
            str = "NO";
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("toast_type", "copyright_permission_introduction");
        c188727au.LIZLLL(this.LJLIL.popupBatch, "toast_mode");
        c188727au.LJIIIZ("click_position", str);
        FMX.LJIIL("toast_click", c188727au.LIZ);
    }

    public final void LIZLLL(String str) {
        Boolean bool;
        String str2;
        List<PopupSetting.ButtonStruct> list;
        PopupSetting.ButtonActionStruct buttonActionStruct;
        PopupSetting.PopupText popupText = this.LJLIL.popupText;
        if (popupText != null && (list = popupText.buttons) != null) {
            boolean z = false;
            if (!list.isEmpty()) {
                Iterator<PopupSetting.ButtonStruct> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    PopupSetting.ButtonStruct next = it.next();
                    if (next != null && (buttonActionStruct = next.buttonActionStruct) != null && buttonActionStruct.actionType == 3) {
                        z = true;
                        break;
                    }
                }
            }
            bool = Boolean.valueOf(z);
        } else {
            bool = null;
        }
        boolean LJ = o.LJ(str, "/aweme/v2/ug/ugc/permission/item/perm/submit");
        if (o.LJ(bool, Boolean.TRUE)) {
            str2 = "discover_tiktok_amplify";
        } else if (LJ) {
            str2 = "YES";
        } else {
            str2 = "join_project";
        }
        LIZJ(str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x013c, code lost:
    
        if (r4 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0137, code lost:
    
        if (r4 != null) goto L30;
     */
    @Override // android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r16) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DialogC86015XpL.onCreate(android.os.Bundle):void");
    }

    public DialogC86015XpL(Activity activity, PopupSetting popupSetting) {
        super(activity);
        this.LJLIL = popupSetting;
        this.LJLILLLLZI = new C73318Sq2();
    }
}
