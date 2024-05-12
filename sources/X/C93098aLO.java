package X;

import android.app.Dialog;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

@InterfaceC55642Lsc("BNPLSessionExpiredTask")
/* renamed from: X.aLO, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C93098aLO extends AbstractC56325M8r<Dialog> {
    public final ActivityC45651qj LJLIL;

    @Override // X.InterfaceC56321M8n
    public final int getPriority() {
        return 7000;
    }

    @Override // X.InterfaceC55641Lsb
    public final C54082LKk getPopupContext() {
        ActivityC45651qj activityC45651qj = this.LJLIL;
        return C54081LKj.LIZ(activityC45651qj, activityC45651qj);
    }

    public C93098aLO(ActivityC45651qj activityC45651qj) {
        this.LJLIL = activityC45651qj;
    }

    @Override // com.bytedance.poplayer.IPopupTask
    public final Object showPopup(C54082LKk context) {
        o.LJIIIZ(context, "context");
        this.LJLIL.setTheme(R.style.uk);
        C26227ARb LIZ = C3AW.LIZ(this.LJLIL);
        LIZ.LIZIZ(C86V.LJFF(R.string.js4));
        LIZ.LJII = false;
        UC0.LIZJ(LIZ, C92750aFm.LJLIL);
        return LIZ.LJI().LJ();
    }
}
