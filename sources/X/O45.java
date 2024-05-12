package X;

import com.bytedance.forest.chain.fetchers.CDNFetcher;
import com.bytedance.forest.model.Request;
import java.io.InputStream;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class O45 implements O4N {
    @Override // X.O4N
    public final OSZ<InputStream, Boolean> LIZ(C61295O3v response, Throwable th) {
        Object LIZ;
        O44 o44;
        o.LJIIJ(response, "response");
        Request request = response.LJZI;
        C61296O3w c61296O3w = response.LJLJJLL;
        O4O N = response.N();
        InputStream inputStream = null;
        if (N == null || ((!(th instanceof C64802Pby) && !(th instanceof C64799Pbv)) || C61325O4z.LIZIZ() || !(response.LJLJLLL instanceof CDNFetcher) || !(request.getNetDepender() instanceof C61298O3y) || c61296O3w == null || c61296O3w.LJII || c61296O3w.LIZ == O4F.CANCEL || c61296O3w.LIZLLL.LJFF <= 0 || !N.LJIILIIL())) {
            return null;
        }
        AbstractC40713FyP LIZLLL = C61298O3y.LIZLLL(c61296O3w, request.getWebResourceRequest());
        if (LIZLLL != null) {
            try {
                LIZ = C61298O3y.LJFF(c61296O3w, LIZLLL);
                C3C5.m7constructorimpl(LIZ);
            } catch (Throwable th2) {
                LIZ = C141335gf.LIZ(th2);
                C3C5.m7constructorimpl(LIZ);
            }
            if (C3C5.m12isFailureimpl(LIZ)) {
                LIZ = null;
            }
            o44 = (O44) LIZ;
        } else {
            o44 = null;
        }
        if (o44 != null) {
            inputStream = o44.LIZIZ();
        }
        return new OSZ<>(inputStream, Boolean.FALSE);
    }
}
