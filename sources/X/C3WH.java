package X;

import com.ss.android.ugc.aweme.im.service.model.IMUser;
import kotlin.jvm.internal.o;

/* renamed from: X.3WH, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3WH extends AbstractC1038245q {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C3WH(X.C98563ts r3, android.view.View r4, androidx.lifecycle.LifecycleOwner r5) {
        /*
            r2 = this;
            java.lang.String r0 = "sessionInfo"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            java.lang.String r0 = "rootView"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            java.lang.String r0 = "owner"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            android.content.Context r1 = r4.getContext()
            java.lang.String r0 = "rootView.context"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r2.<init>(r3, r5, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3WH.<init>(X.3ts, android.view.View, androidx.lifecycle.LifecycleOwner):void");
    }

    @Override // X.AbstractC1038245q
    public final void LLD(final AbstractC1041546x holder, IMUser iMUser, final C109544Rq msg, final C109544Rq c109544Rq) {
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(msg, "msg");
        if (msg.isSelf()) {
            holder.U(iMUser, msg);
            return;
        }
        C81143Gk c81143Gk = C81143Gk.LIZ;
        EnumC81073Gd mode = EnumC81073Gd.AT_MOST_DB;
        InterfaceC81233Gt interfaceC81233Gt = new InterfaceC81233Gt() { // from class: X.3WI
            @Override // X.InterfaceC81233Gt
            public final void LIZ(C81243Gu imMember, EnumC81193Gp reason) {
                o.LJIIIZ(imMember, "imMember");
                o.LJIIIZ(reason, "reason");
                AbstractC1041546x.this.T(imMember, msg, c109544Rq);
            }
        };
        c81143Gk.getClass();
        o.LJIIIZ(mode, "mode");
        C81143Gk.LIZ(mode, new C81183Go(msg.getConversationId(), String.valueOf(msg.getSender()), msg.getSecSender()), interfaceC81233Gt);
    }
}
