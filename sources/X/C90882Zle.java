package X;

import java.util.AbstractMap;
import java.util.Map;

/* renamed from: X.Zle, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90882Zle extends AbstractC90754Zja<Map.Entry> {
    public final /* synthetic */ C90883Zlf LJLJI;

    @Override // X.AbstractC90354Zd8
    public final boolean LJIIIIZZ() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return 0;
    }

    public C90882Zle(C90883Zlf c90883Zlf) {
        this.LJLJI = c90883Zlf;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        C90329Zcj.LIZ(i, 0);
        int i2 = i + i;
        Object obj = this.LJLJI.LJLJI[i2];
        obj.getClass();
        Object obj2 = this.LJLJI.LJLJI[i2 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }
}
