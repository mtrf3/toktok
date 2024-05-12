package X;

import com.bytedance.retrofit2.mime.TypedInput;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.PdZ, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64901PdZ<T> {
    public final PY0 LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final C34821Yg LIZLLL;
    public final TypedInput LJ;
    public final Object LJFF;
    public final T LJI;
    public final TypedInput LJII;
    public final C64797Pbt<T> LJIIIIZZ;

    public final C64797Pbt<T> LIZ() {
        C36910EeA c36910EeA = new C36910EeA(this.LIZ.LIZIZ(), this.LIZIZ, this.LIZJ, this.LIZLLL.LJFF(), this.LJ);
        c36910EeA.LJFF = this.LJFF;
        if (this.LJIIIIZZ.LIZIZ()) {
            return C64797Pbt.LIZLLL(this.LJI, c36910EeA);
        }
        return C64797Pbt.LIZ(this.LJII, c36910EeA);
    }

    public C64901PdZ(C64797Pbt<T> originSsResponse) {
        o.LJIIIZ(originSsResponse, "originSsResponse");
        this.LJIIIIZZ = originSsResponse;
        C36910EeA c36910EeA = originSsResponse.LIZ;
        o.LJIIIIZZ(c36910EeA, "originSsResponse.raw()");
        this.LIZ = PY0.LIZJ(c36910EeA.LIZ);
        this.LIZIZ = c36910EeA.LIZIZ;
        String str = c36910EeA.LIZJ;
        o.LJIIIIZZ(str, "originResponse.reason");
        this.LIZJ = str;
        List<EJ6> list = c36910EeA.LIZLLL;
        o.LJIIIIZZ(list, "originResponse.headers");
        this.LIZLLL = new C34821Yg(list);
        this.LJ = c36910EeA.LJ;
        this.LJFF = c36910EeA.LJFF;
        this.LJI = originSsResponse.LIZIZ;
        this.LJII = originSsResponse.LIZJ;
    }
}
