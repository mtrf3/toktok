package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

@InterfaceC55642Lsc("now_legal_notification_on_toast")
/* renamed from: X.7qr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C198617qr extends AbstractC55363Lo7 {
    public M78 LJLIL;
    public final AqS153S0100000_3 LJLILLLLZI = new AqS153S0100000_3(this, 1627);

    @Override // X.InterfaceC55641Lsb
    public final /* bridge */ /* synthetic */ C54082LKk getPopupContext() {
        return null;
    }

    @Override // X.InterfaceC56321M8n
    public final int getPriority() {
        return 2506;
    }

    @Override // X.M72
    public final void LIZLLL(C54082LKk context, M78 wrapper) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(wrapper, "wrapper");
        ActivityC45651qj LIZJ = context.LIZJ();
        if (LIZJ == null) {
            wrapper.LIZ();
            return;
        }
        this.LJLIL = wrapper;
        C26045AKb c26045AKb = new C26045AKb(LIZJ);
        c26045AKb.LIZJ(this.LJLILLLLZI);
        c26045AKb.LJIIIIZZ(R.string.j06);
        c26045AKb.LJIIJ();
    }
}
