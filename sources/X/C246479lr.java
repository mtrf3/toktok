package X;

import kotlin.jvm.internal.o;

@InterfaceC55642Lsc("video_link")
/* renamed from: X.9lr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C246479lr extends AbstractC55363Lo7 {
    public final ActivityC45651qj LJLIL;
    public final InterfaceC65784Pro<C76800UCe> LJLILLLLZI;
    public final int LJLJI = 1;

    @Override // X.InterfaceC55641Lsb
    public final C54082LKk getPopupContext() {
        ActivityC45651qj activityC45651qj = this.LJLIL;
        return C54081LKj.LIZ(activityC45651qj, activityC45651qj);
    }

    @Override // X.InterfaceC56321M8n
    public final int getPriority() {
        return this.LJLJI;
    }

    @Override // X.M72
    public final void LIZLLL(C54082LKk context, M78 wrapper) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(wrapper, "wrapper");
        this.LJLILLLLZI.invoke();
    }

    public C246479lr(ActivityC45651qj activityC45651qj, C26231ARf c26231ARf, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LJLIL = activityC45651qj;
        this.LJLILLLLZI = interfaceC65784Pro;
    }
}
