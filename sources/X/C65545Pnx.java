package X;

import java.util.Comparator;

/* renamed from: X.Pnx, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65545Pnx extends AbstractC65550Po2<Object> {
    public final /* synthetic */ Comparator LJLIL;
    public final /* synthetic */ java.util.Map LJLILLLLZI;

    public C65545Pnx(C65546Pny c65546Pny, java.util.Map map) {
        this.LJLIL = c65546Pny;
        this.LJLILLLLZI = map;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.LJLIL.compare(this.LJLILLLLZI.get(obj), this.LJLILLLLZI.get(obj2));
    }
}
