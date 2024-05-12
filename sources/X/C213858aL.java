package X;

import android.app.Dialog;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

@InterfaceC55642Lsc("store_region_changed_popup")
/* renamed from: X.8aL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C213858aL extends AbstractC56325M8r<Dialog> {
    public final ActivityC45651qj LJLIL;
    public final int LJLILLLLZI = 115;

    @Override // X.InterfaceC55641Lsb
    public final C54082LKk getPopupContext() {
        ActivityC45651qj activityC45651qj = this.LJLIL;
        return C54081LKj.LIZ(activityC45651qj, activityC45651qj);
    }

    @Override // X.InterfaceC56321M8n
    public final int getPriority() {
        return this.LJLILLLLZI;
    }

    public C213858aL(ActivityC45651qj activityC45651qj) {
        this.LJLIL = activityC45651qj;
    }

    @Override // com.bytedance.poplayer.IPopupTask
    public final Object showPopup(C54082LKk context) {
        o.LJIIIZ(context, "context");
        C36922EeM.LJ("StoreRegionChangedPopTask");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("action_type", "show");
        FMX.LJIIL("relaunch_app_prompt_page", c188727au.LIZ);
        C26227ARb LIZ = C3AW.LIZ(this.LJLIL);
        LIZ.LJFF(this.LJLIL.getString(R.string.cps));
        LIZ.LIZIZ(this.LJLIL.getString(R.string.cpr));
        C77123UOp.LJIILL(LIZ, new AqS169S0100000_3(this, 1026));
        LIZ.LJII = false;
        return LIZ.LJI().LJ();
    }
}
