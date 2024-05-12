package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.WnE, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83336WnE extends AbstractC83335WnD {
    public C83336WnE(View view) {
        super(view);
    }

    @Override // X.AbstractC83335WnD
    public final void L(AbstractC83369Wnl message) {
        o.LJIIIZ(message, "message");
        if (!(message instanceof C83357WnZ)) {
            return;
        }
        M().setText(((C83357WnZ) message).LIZJ);
    }
}
