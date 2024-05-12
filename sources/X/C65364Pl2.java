package X;

import a04.IDfS0S0100000_11;
import com.twitter.sdk.android.core.TwitterSession;
import kotlin.jvm.internal.o;

/* renamed from: X.Pl2, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65364Pl2 extends AbstractC65259PjL<TwitterSession> {
    public final /* synthetic */ QXX LIZ;

    public C65364Pl2(IDfS0S0100000_11 iDfS0S0100000_11) {
        this.LIZ = iDfS0S0100000_11;
    }

    @Override // X.AbstractC65259PjL
    public final void LIZ(C65053Pg1 exception) {
        o.LJIIIZ(exception, "exception");
        this.LIZ.LLF(new C65365Pl3(exception));
    }

    @Override // X.AbstractC65259PjL
    public final void LIZIZ(H4F h4f) {
        this.LIZ.LLLLLLLLL(new C65367Pl5((TwitterSession) h4f.LIZ));
    }
}
