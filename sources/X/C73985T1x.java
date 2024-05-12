package X;

import kotlin.jvm.internal.o;

/* renamed from: X.T1x, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73985T1x<K, V, REQ, RESP, K1, V1> {
    public static final /* synthetic */ int LIZLLL = 0;
    public final InterfaceC68907R2p<K, V, REQ, RESP> LIZ;
    public final InterfaceC68914R2w<K1, V1> LIZIZ;
    public final T20<K, RESP, K1, V1> LIZJ;

    public final C73986T1y LIZ(InterfaceC88471Ynr strategy) {
        o.LJIIJ(strategy, "strategy");
        return new C73986T1y(this, strategy);
    }

    public C73985T1x(InterfaceC68907R2p interfaceC68907R2p, InterfaceC68914R2w interfaceC68914R2w, T20 t20) {
        this.LIZ = interfaceC68907R2p;
        this.LIZIZ = interfaceC68914R2w;
        this.LIZJ = t20;
    }
}
