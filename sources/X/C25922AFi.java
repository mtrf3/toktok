package X;

import android.app.Activity;
import android.view.View;
import com.bytedance.router.SmartRouter;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.AFi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25922AFi implements InterfaceC25921AFh {
    public final Activity LIZ;
    public final String LIZIZ = "aweme://lynxview/?channel=fe_kids_mode_lynx&bundle=kids-settings-account/template.js&dynamic=1&hide_nav_bar=1&use_spark=1&enable_canvas=1";

    @Override // X.InterfaceC25921AFh
    public final void LIZ() {
    }

    @Override // X.InterfaceC25921AFh
    public final String LIZLLL() {
        return "manage_account";
    }

    @Override // X.InterfaceC25921AFh
    public final CharSequence LJ() {
        return null;
    }

    @Override // X.InterfaceC25921AFh
    public final void LJI() {
    }

    @Override // X.InterfaceC25921AFh
    public final boolean LJII() {
        return false;
    }

    @Override // X.InterfaceC25921AFh
    public final int getVisibility() {
        return 0;
    }

    @Override // X.InterfaceC25921AFh
    public final void LIZIZ() {
        SmartRouter.buildRoute(this.LIZ, this.LIZIZ).open();
    }

    @Override // X.InterfaceC25921AFh
    public final Activity getActivity() {
        return this.LIZ;
    }

    public C25922AFi(Activity activity) {
        this.LIZ = activity;
    }

    @Override // X.InterfaceC25921AFh
    public final AI8 LIZJ(View view) {
        AI8 ai8 = (AI8) view.findViewById(R.id.n1);
        o.LJIIIIZZ(ai8, "view.account_and_safety");
        return ai8;
    }

    @Override // X.InterfaceC25921AFh
    public final void LJFF(String str, String str2, Boolean bool, Boolean bool2) {
        C25914AFa.LIZ(this, str, str2, bool, bool2);
    }
}
