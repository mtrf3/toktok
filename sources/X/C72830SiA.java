package X;

import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.SiA, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72830SiA implements XOK {
    public W4W<C81392Vwy<W5A>> LIZ;
    public final int LIZIZ = Math.min(JF5.LIZJ(EF7.LIZIZ()) / 3, 300);

    @Override // X.XOK
    public final void cancel() {
        W4W<C81392Vwy<W5A>> w4w = this.LIZ;
        if (w4w != null) {
            w4w.close();
        }
        this.LIZ = null;
    }

    @Override // X.XOK
    public final void LIZ(String url, AqS181S0100000_15 aqS181S0100000_15) {
        o.LJIIIZ(url, "url");
        W4W<C81392Vwy<W5A>> w4w = this.LIZ;
        if (w4w != null) {
            w4w.close();
        }
        W6J LIZ = W5I.LIZ();
        W5P LIZLLL = W5P.LIZLLL(UriProtector.parse(url));
        int i = this.LIZIZ;
        LIZLLL.LIZJ = new C79238V7y(i, i);
        W4W<C81392Vwy<W5A>> LJ = LIZ.LJ(LIZLLL.LIZ(), null);
        ((AbstractC48384Iyq) LJ).LJ(new C72829Si9(aqS181S0100000_15), C79561VKj.LJLIL);
        this.LIZ = LJ;
    }
}
