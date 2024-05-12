package X;

import android.os.Bundle;
import com.google.ar.core.exceptions.FatalException;
import com.google.ar.core.v;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.agu, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class BinderC94432agu extends AbstractBinderC94367afr {
    public final /* synthetic */ AtomicBoolean LJLIL;
    public final /* synthetic */ RunnableC93525aSH LJLILLLLZI;

    @Override // X.InterfaceC93987aZj
    public final void LJJJJJL(Bundle bundle) {
    }

    @Override // X.InterfaceC93987aZj
    public final void LJJJJLL(Bundle bundle) {
        if (this.LJLIL.getAndSet(true)) {
            return;
        }
        int i = bundle.getInt("error.code", -100);
        int i2 = bundle.getInt("install.status", 0);
        if (i2 == 4) {
            this.LJLILLLLZI.LJLILLLLZI.LIZ(EnumC93540aSW.COMPLETED);
            return;
        }
        if (i != 0) {
            RunnableC93525aSH runnableC93525aSH = this.LJLILLLLZI;
            v.i(runnableC93525aSH.LJLJI, runnableC93525aSH.LJLIL, runnableC93525aSH.LJLILLLLZI);
            return;
        }
        if (bundle.containsKey("resolution.intent")) {
            RunnableC93525aSH runnableC93525aSH2 = this.LJLILLLLZI;
            v.j(runnableC93525aSH2.LJLJI, runnableC93525aSH2.LJLIL, bundle, runnableC93525aSH2.LJLILLLLZI);
            return;
        }
        if (i2 != 10) {
            switch (i2) {
                case 1:
                case 2:
                case 3:
                    this.LJLILLLLZI.LJLILLLLZI.LIZ(EnumC93540aSW.ACCEPTED);
                    return;
                case 4:
                    this.LJLILLLLZI.LJLILLLLZI.LIZ(EnumC93540aSW.COMPLETED);
                    return;
                case 5:
                    this.LJLILLLLZI.LJLILLLLZI.LIZIZ(new FatalException("Unexpected FAILED install status without error."));
                    return;
                case 6:
                    this.LJLILLLLZI.LJLILLLLZI.LIZ(EnumC93540aSW.CANCELLED);
                    return;
                default:
                    C93538aSU c93538aSU = this.LJLILLLLZI.LJLILLLLZI;
                    StringBuilder sb = new StringBuilder(38);
                    sb.append("Unexpected install status: ");
                    sb.append(i2);
                    c93538aSU.LIZIZ(new FatalException(sb.toString()));
                    return;
            }
        }
        this.LJLILLLLZI.LJLILLLLZI.LIZIZ(new FatalException("Unexpected REQUIRES_UI_INTENT install status without an intent."));
    }

    public BinderC94432agu(RunnableC93525aSH runnableC93525aSH, AtomicBoolean atomicBoolean) {
        this.LJLILLLLZI = runnableC93525aSH;
        this.LJLIL = atomicBoolean;
    }
}
