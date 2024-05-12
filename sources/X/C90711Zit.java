package X;

import java.util.NoSuchElementException;

/* renamed from: X.Zit, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90711Zit extends AbstractC90334Zco {
    public int LJLIL;
    public final int LJLILLLLZI;
    public final /* synthetic */ AbstractC90364ZdI LJLJI;

    public C90711Zit(AbstractC90364ZdI abstractC90364ZdI) {
        this.LJLJI = abstractC90364ZdI;
        this.LJLILLLLZI = abstractC90364ZdI.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.LJLIL < this.LJLILLLLZI;
    }

    @Override // X.AbstractC90334Zco
    public final byte LIZ() {
        int i = this.LJLIL;
        if (i < this.LJLILLLLZI) {
            this.LJLIL = i + 1;
            return this.LJLJI.LIZJ(i);
        }
        throw new NoSuchElementException();
    }
}
