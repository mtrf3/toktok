package X;

import kotlin.jvm.internal.o;

@InterfaceC55642Lsc("prompt_bind_email_phone_phase2")
/* loaded from: classes14.dex */
public final class UZ5 extends AbstractC55363Lo7 {
    public final UZ8 LJLIL;
    public final ActivityC45651qj LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final int LJLJJL;

    @Override // X.InterfaceC55641Lsb
    public final C54082LKk getPopupContext() {
        ActivityC45651qj activityC45651qj = this.LJLILLLLZI;
        return C54081LKj.LIZ(activityC45651qj, activityC45651qj);
    }

    @Override // X.InterfaceC56321M8n
    public final int getPriority() {
        return this.LJLJJL;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01f0  */
    @Override // X.M72
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(X.C54082LKk r21, X.M78 r22) {
        /*
            Method dump skipped, instructions count: 782
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UZ5.LIZLLL(X.LKk, X.M78):void");
    }

    public UZ5(UZ8 promptType, ActivityC45651qj fragmentActivity, String str, String enterFrom) {
        o.LJIIIZ(promptType, "promptType");
        o.LJIIIZ(fragmentActivity, "fragmentActivity");
        o.LJIIIZ(enterFrom, "enterFrom");
        this.LJLIL = promptType;
        this.LJLILLLLZI = fragmentActivity;
        this.LJLJI = str;
        this.LJLJJI = enterFrom;
        this.LJLJJL = 851;
    }
}
