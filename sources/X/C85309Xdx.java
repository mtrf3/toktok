package X;

import android.app.Dialog;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.o;

@InterfaceC55642Lsc("feed_location_permission_hint")
/* renamed from: X.Xdx, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85309Xdx extends AbstractC56325M8r<Dialog> {
    public final ActivityC45651qj LJLIL;
    public final boolean LJLILLLLZI;
    public final String LJLJI;
    public final InterfaceC88472Yns<ActivityC45651qj, C76800UCe> LJLJJI;
    public final int LJLJJL;

    @Override // X.InterfaceC55641Lsb
    public final C54082LKk getPopupContext() {
        ActivityC45651qj activityC45651qj = this.LJLIL;
        return C54081LKj.LIZ(activityC45651qj, activityC45651qj);
    }

    @Override // X.InterfaceC56321M8n
    public final int getPriority() {
        return this.LJLJJL;
    }

    @Override // com.bytedance.poplayer.IPopupTask
    public final Object showPopup(C54082LKk context) {
        o.LJIIIZ(context, "context");
        C26227ARb LIZ = C3AW.LIZ(this.LJLIL);
        LIZ.LJ(R.string.sdt);
        String str = this.LJLJI;
        if (str == null) {
            str = "";
        }
        LIZ.LIZIZ(str);
        LIZ.LJII = false;
        C77123UOp.LJIILL(LIZ, new AqS181S0100000_15(this, 241));
        LIZ.LIZLLL(C85310Xdy.LJLIL);
        return LIZ.LJI().LJ();
    }

    public C85309Xdx(ActivityC45651qj activityC45651qj, boolean z, String str, C85305Xdt requestFineLocationPermission) {
        o.LJIIIZ(requestFineLocationPermission, "requestFineLocationPermission");
        this.LJLIL = activityC45651qj;
        this.LJLILLLLZI = z;
        this.LJLJI = str;
        this.LJLJJI = requestFineLocationPermission;
        this.LJLJJL = 210;
    }
}
