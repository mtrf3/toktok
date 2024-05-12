package X;

import android.content.Intent;
import android.os.Bundle;
import kotlin.jvm.internal.o;

/* renamed from: X.NOc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59274NOc extends NOS {
    @Override // X.AbstractC59248NNc
    public final void LIZ(boolean z) {
    }

    @Override // X.AbstractC59248NNc
    public final boolean LIZIZ() {
        if (this.LIZJ.length() == 0) {
            return false;
        }
        return C59275NOd.LIZ(this.LIZJ);
    }

    @Override // X.AbstractC59249NNd
    public final C59289NOr LIZJ() {
        Intent LIZLLL = LIZLLL();
        String str = this.LIZJ;
        if (str != null && str.length() != 0) {
            C61291O3r.LIZIZ();
            C61291O3r.LIZ(new C2WU(str, "Jump directly to open the landing page"));
        }
        C59280NOi c59280NOi = C59280NOi.LIZIZ;
        if (c59280NOi.LJIILL()) {
            c59280NOi.LIZLLL(this.LIZIZ, this.LIZJ, this.LIZLLL, C16880lQ.LLJJIJI(LIZLLL));
            return new C59289NOr(true);
        }
        return C59275NOd.LIZIZ(this.LIZIZ, LIZLLL);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59274NOc(InterfaceC59247NNb taskContext, Bundle bundle) {
        super(taskContext, bundle);
        o.LJIIIZ(taskContext, "taskContext");
    }
}
