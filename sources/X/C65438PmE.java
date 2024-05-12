package X;

import com.bytedance.retrofit2.client.Request;

/* renamed from: X.PmE, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65438PmE extends AbstractC65440PmG {
    public C65438PmE(AbstractC65440PmG abstractC65440PmG) {
        super(abstractC65440PmG);
    }

    @Override // X.AbstractC65440PmG
    public final C65442PmI LIZ(C65441PmH c65441PmH, Request request, C64797Pbt c64797Pbt) {
        long j = c65441PmH.LIZIZ;
        if (j > 0) {
            C1E4.LJLILLLLZI = j;
            C1E4.LJLJI = System.currentTimeMillis();
        }
        return AbstractC65440PmG.LIZIZ;
    }
}
