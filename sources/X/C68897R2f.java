package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.R2f, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C68897R2f<V> extends AbstractC68898R2g<C76800UCe, V> {
    public List<? extends V> LIZJ;

    @Override // X.AbstractC68898R2g
    public final List<OSZ<C76800UCe, List<V>>> LJIIIIZZ() {
        List<? extends V> list = this.LIZJ;
        if (list != null) {
            return C47261Igj.LJJIJ(new OSZ(C76800UCe.LIZ, list));
        }
        return C61878OQg.INSTANCE;
    }

    @Override // X.AbstractC68898R2g
    public final List LJII(C76800UCe k) {
        o.LJIIJ(k, "k");
        return this.LIZJ;
    }

    @Override // X.AbstractC68898R2g
    public final void LJIIIZ(C76800UCe k, List list) {
        o.LJIIJ(k, "k");
        this.LIZJ = list;
    }
}
