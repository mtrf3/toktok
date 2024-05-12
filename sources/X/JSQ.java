package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public class JSQ extends JSR {
    public final List<JSR> LJLILLLLZI;

    @Override // X.JSR
    public final void LJ() {
        Iterator it = ((ArrayList) this.LJLILLLLZI).iterator();
        while (it.hasNext()) {
            ((JSR) it.next()).LJ();
        }
    }

    public JSQ(JTS jts) {
        super(jts);
        this.LJLILLLLZI = new ArrayList();
    }
}
