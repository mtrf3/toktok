package X;

import java.util.NoSuchElementException;

/* renamed from: X.YHt, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87137YHt extends AbstractC87139YHv {
    public int LJLIL;
    public final int LJLILLLLZI;
    public final /* synthetic */ AbstractC87134YHq LJLJI;

    public C87137YHt(AbstractC87134YHq abstractC87134YHq) {
        this.LJLJI = abstractC87134YHq;
        this.LJLILLLLZI = abstractC87134YHq.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.LJLIL < this.LJLILLLLZI;
    }

    @Override // X.AbstractC87139YHv
    public final byte LIZ() {
        int i = this.LJLIL;
        if (i < this.LJLILLLLZI) {
            this.LJLIL = i + 1;
            return this.LJLJI.LIZJ(i);
        }
        throw new NoSuchElementException();
    }
}
