package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N9L implements InterfaceC78910Uy2 {
    public final /* synthetic */ N9M LIZ;
    public final /* synthetic */ CompletionBlock<N9H> LIZIZ;

    @Override // X.InterfaceC78910Uy2
    public final /* synthetic */ void LIZ(String... strArr) {
    }

    @Override // X.InterfaceC78910Uy2
    public final /* synthetic */ void LIZJ(String... strArr) {
    }

    @Override // X.InterfaceC78910Uy2
    public final /* synthetic */ void LJ(String str, String... strArr) {
    }

    @Override // X.InterfaceC78910Uy2
    public final /* synthetic */ void LJFF(String... strArr) {
    }

    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    @Override // X.InterfaceC78910Uy2
    public final void LIZIZ(String... strArr) {
        o.LJIIIZ(strArr, OHQ.LIZIZ);
        this.LIZ.getClass();
        N9H n9h = (N9H) ED5.LIZJ(N9H.class, null);
        n9h.setStatus(2);
        this.LIZIZ.onSuccess(n9h, "");
    }

    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    @Override // X.InterfaceC78910Uy2
    public final void LIZLLL(String... strArr) {
        o.LJIIIZ(strArr, OHQ.LIZIZ);
        this.LIZ.getClass();
        N9H n9h = (N9H) ED5.LIZJ(N9H.class, null);
        n9h.setStatus(1);
        this.LIZIZ.onSuccess(n9h, "");
    }

    public N9L(N9M n9m, C37356ElM c37356ElM) {
        this.LIZ = n9m;
        this.LIZIZ = c37356ElM;
    }
}
