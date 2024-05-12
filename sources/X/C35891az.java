package X;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.1az, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35891az implements Iterable<Object>, InterfaceC90533gv {
    public final C35871ax LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        C35871ax c35871ax = this.LJLIL;
        if (c35871ax.LJLJL == this.LJLJI) {
            int i = this.LJLILLLLZI;
            return new C35981b8(i + 1, C78847Ux1.LIZLLL(i, c35871ax.LJLIL) + i, c35871ax);
        }
        throw new ConcurrentModificationException();
    }

    public C35891az(int i, int i2, C35871ax table) {
        o.LJIIIZ(table, "table");
        this.LJLIL = table;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
    }
}
