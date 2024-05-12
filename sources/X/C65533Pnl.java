package X;

import java.io.Serializable;
import java.util.Map;

/* renamed from: X.Pnl, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C65533Pnl implements Serializable {
    public static final long serialVersionUID = 0;
    public final Object[] LJLIL;
    public final Object[] LJLILLLLZI;

    public Object readResolve() {
        C65534Pnm c65534Pnm = new C65534Pnm(this.LJLIL.length);
        int i = 0;
        while (true) {
            Object[] objArr = this.LJLIL;
            if (i < objArr.length) {
                c65534Pnm.LIZIZ(objArr[i], this.LJLILLLLZI[i]);
                i++;
            } else {
                return c65534Pnm.LIZ();
            }
        }
    }

    public C65533Pnl(AbstractC65564PoG<?, ?> abstractC65564PoG) {
        this.LJLIL = new Object[abstractC65564PoG.size()];
        this.LJLILLLLZI = new Object[abstractC65564PoG.size()];
        AbstractC65557Po9<Map.Entry<?, ?>> it = abstractC65564PoG.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            Map.Entry<?, ?> next = it.next();
            this.LJLIL[i] = next.getKey();
            this.LJLILLLLZI[i] = next.getValue();
            i++;
        }
    }
}
