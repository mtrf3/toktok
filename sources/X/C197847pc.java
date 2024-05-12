package X;

import android.app.Dialog;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

@InterfaceC55642Lsc("global_group_chat_invite")
/* renamed from: X.7pc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C197847pc extends AbstractC56325M8r<Dialog> {
    public final ActivityC45651qj LJLIL;
    public final int LJLILLLLZI = 300;

    @Override // X.InterfaceC55641Lsb
    public final C54082LKk getPopupContext() {
        ActivityC45651qj activityC45651qj = this.LJLIL;
        return C54081LKj.LIZ(activityC45651qj, activityC45651qj);
    }

    @Override // X.InterfaceC56321M8n
    public final int getPriority() {
        return this.LJLILLLLZI;
    }

    public C197847pc(ActivityC45651qj activityC45651qj) {
        this.LJLIL = activityC45651qj;
    }

    @Override // com.bytedance.poplayer.IPopupTask
    public final Object showPopup(C54082LKk context) {
        o.LJIIIZ(context, "context");
        C26227ARb c26227ARb = new C26227ARb(this.LJLIL);
        c26227ARb.LIZ(R.string.hiu);
        UC0.LIZJ(c26227ARb, new AqS167S0100000_1(this, 11));
        c26227ARb.LJII = false;
        return c26227ARb.LJI().LJ();
    }
}
