package X;

import Y.AfS0S0201100_13;
import com.ss.avframework.livestreamv2.core.interact.Client;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U9T implements Client.Listener {
    public final /* synthetic */ U9S LIZ;

    public U9T(U9S u9s) {
        this.LIZ = u9s;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client.Listener
    public final void onError(Client client, int i, long j, Exception exc) {
        this.LIZ.LIZIZ.LIZ(AbstractC73672Svk.LJJIJIL(1).LJJJ(C73969T1h.LIZ(C76766UAw.LIZJ.LIZIZ())).LJJJLIIL(new AfS0S0201100_13(i, this.LIZ, j, exc, 3), U9W.LJLIL));
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.Client.Listener
    public final void onInfo(Client client, int i, long j, Object... obj) {
        o.LJIIIZ(obj, "obj");
        this.LIZ.LIZIZ.LIZ(AbstractC73672Svk.LJJIJIL(1).LJJJ(C73969T1h.LIZ(C76766UAw.LIZJ.LIZIZ())).LJJJLIIL(new AfS0S0201100_13(i, this.LIZ, j, obj, 4), U9V.LJLIL));
    }
}
