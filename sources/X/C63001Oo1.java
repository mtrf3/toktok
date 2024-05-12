package X;

import android.os.Bundle;
import kotlin.jvm.internal.o;

@InterfaceC55642Lsc("google_one_tap_popup")
/* renamed from: X.Oo1, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63001Oo1 extends AbstractC55363Lo7 {
    public final ActivityC45651qj LJLIL;
    public final boolean LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final InterfaceC65784Pro<C76800UCe> LJLJJL;

    @Override // X.InterfaceC56321M8n
    public final int getPriority() {
        return 202;
    }

    @Override // X.InterfaceC55641Lsb
    public final C54082LKk getPopupContext() {
        ActivityC45651qj activityC45651qj = this.LJLIL;
        return C54081LKj.LIZ(activityC45651qj, activityC45651qj);
    }

    @Override // X.M72
    public final void LIZLLL(C54082LKk context, M78 wrapper) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(wrapper, "wrapper");
        ActivityC45651qj activityC45651qj = this.LJLIL;
        C68989R5t.LIZIZ(activityC45651qj, C68989R5t.LIZ(activityC45651qj, this.LJLILLLLZI, "google_onetap", new C63026OoQ(this.LJLJI, this.LJLJJI, "auto_pop", "signup_login", "", new Bundle())));
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLJJL;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public C63001Oo1(ActivityC45651qj activity, boolean z, String enterFrom, String str, C62999Onz c62999Onz) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(enterFrom, "enterFrom");
        this.LJLIL = activity;
        this.LJLILLLLZI = z;
        this.LJLJI = enterFrom;
        this.LJLJJI = str;
        this.LJLJJL = c62999Onz;
    }
}
