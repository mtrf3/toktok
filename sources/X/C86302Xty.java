package X;

import android.app.Activity;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.compliance.protection.familypairing.FamilyPiaringManager;
import kotlin.jvm.internal.o;

/* renamed from: X.Xty, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86302Xty implements InterfaceC53832LAu {
    public final /* synthetic */ DialogC254019y1 LJLIL;
    public final /* synthetic */ Activity LJLILLLLZI;

    @Override // X.InterfaceC53832LAu
    public final void onSuccess() {
        String str;
        String str2;
        String str3;
        this.LJLIL.dismiss();
        FamilyPiaringManager.LIZ.getClass();
        EnumC62934Omw LIZJ = FamilyPiaringManager.LIZJ();
        if (LIZJ == EnumC62934Omw.CHILD) {
            Activity activity = this.LJLILLLLZI;
            try {
                str3 = C2YJ.LIZIZ.LIZ.getFeConfigCollection().getGuardianChild().getSchema();
                o.LJIIIIZZ(str3, "{\n            SettingsRe…ianChild.schema\n        }");
            } catch (C158056If unused) {
                str3 = "aweme://webview/?url=https%3A%2F%2Fwww.tiktok.com%2Ffalcon%2Frn%2Fguardian_child_t%2F%3Fhide_nav_bar%3D1&hide_nav_bar=1";
            }
            SmartRouter.buildRoute(activity, str3).open();
            return;
        }
        if (LIZJ == EnumC62934Omw.PARENT) {
            Activity activity2 = this.LJLILLLLZI;
            try {
                str2 = C2YJ.LIZIZ.LIZ.getFeConfigCollection().getGuardianParent().getSchema();
                o.LJIIIIZZ(str2, "{\n            SettingsRe…anParent.schema\n        }");
            } catch (C158056If unused2) {
                str2 = "aweme://webview/?url=https%3A%2F%2Fwww.tiktok.com%2Ffalcon%2Frn%2Fguardian_parent_t%2F%3Fhide_nav_bar%3D1&hide_nav_bar=1";
            }
            SmartRouter.buildRoute(activity2, str2).open();
            return;
        }
        Activity activity3 = this.LJLILLLLZI;
        try {
            str = C2YJ.LIZIZ.LIZ.getFeConfigCollection().getGuardianEntrance().getSchema();
            o.LJIIIIZZ(str, "{\n            SettingsRe…Entrance.schema\n        }");
        } catch (C158056If unused3) {
            str = "aweme://webview/?url=https%3A%2F%2Fwww.tiktok.com%2Ffalcon%2Fmain%2Fguardian_entrance%2F%3Fhide_nav_bar%3D1&hide_nav_bar=1";
        }
        SmartRouter.buildRoute(activity3, str).open();
    }

    @Override // X.InterfaceC53832LAu
    public final void onFailed(Exception e) {
        o.LJIIIZ(e, "e");
        this.LJLIL.dismiss();
        C1A7.LJIJJ(this.LJLILLLLZI, e);
    }

    public C86302Xty(DialogC254019y1 dialogC254019y1, ActivityC45651qj activityC45651qj) {
        this.LJLIL = dialogC254019y1;
        this.LJLILLLLZI = activityC45651qj;
    }
}
