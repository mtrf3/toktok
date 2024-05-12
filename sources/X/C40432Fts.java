package X;

import android.app.Dialog;
import kotlin.jvm.internal.AqS172S0100000_6;
import kotlin.jvm.internal.o;

@InterfaceC55642Lsc("global_tcp_not_kr")
/* renamed from: X.Fts, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40432Fts extends AbstractC56325M8r<Dialog> {
    public final ActivityC45651qj LJLIL;
    public final InterfaceC88472Yns<Long, C76800UCe> LJLILLLLZI;

    @Override // X.InterfaceC56321M8n
    public final int getPriority() {
        return 0;
    }

    @Override // X.InterfaceC55641Lsb
    public final C54082LKk getPopupContext() {
        ActivityC45651qj activityC45651qj = this.LJLIL;
        return C54081LKj.LIZ(activityC45651qj, activityC45651qj);
    }

    @Override // com.bytedance.poplayer.IPopupTask
    public final Object showPopup(C54082LKk context) {
        o.LJIIIZ(context, "context");
        ActivityC45651qj LIZJ = context.LIZJ();
        if (LIZJ == null) {
            return null;
        }
        return C39271Fb9.LIZIZ(LIZJ, this.LJLILLLLZI);
    }

    public C40432Fts(ActivityC45651qj activity, AqS172S0100000_6 aqS172S0100000_6) {
        o.LJIIIZ(activity, "activity");
        this.LJLIL = activity;
        this.LJLILLLLZI = aqS172S0100000_6;
    }
}
