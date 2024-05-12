package X;

import com.ss.android.ugc.aweme.im.service.model.IMUser;
import kotlin.jvm.internal.o;

/* renamed from: X.3WJ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3WJ extends AbstractC1038245q {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C3WJ(X.C98523to r3, android.view.View r4, androidx.lifecycle.LifecycleOwner r5) {
        /*
            r2 = this;
            java.lang.String r0 = "currentSessionInfo"
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
        throw new UnsupportedOperationException("Method not decompiled: X.C3WJ.<init>(X.3to, android.view.View, androidx.lifecycle.LifecycleOwner):void");
    }

    @Override // X.AbstractC1038245q
    public final void LLD(AbstractC1041546x holder, IMUser iMUser, C109544Rq msg, C109544Rq c109544Rq) {
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(msg, "msg");
        if (msg.isSelf()) {
            holder.U(iMUser, msg);
        } else {
            holder.U(this.LJLJLLL.getSingleChatFromUser(), msg);
        }
    }
}
