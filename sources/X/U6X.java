package X;

import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U6X implements U6Y {
    public final /* synthetic */ U65 LJLIL;

    @Override // X.U6Y
    public final void LJJJJI(long j) {
    }

    @Override // X.U6Y
    public final void LJJJLIIL(long j) {
    }

    @Override // X.U6Y
    public final void LJJJLZIJ(long j) {
    }

    @Override // X.U6Y
    public final void LJLJL(long j, long j2) {
    }

    @Override // X.U6Y
    public final void LLIIII(long j) {
    }

    @Override // X.U6Y
    public final void LLIIIILZ(long j, long j2) {
    }

    public U6X(U65 u65) {
        this.LJLIL = u65;
    }

    @Override // X.U6Y
    public final void LJJIJIIJI(long j) {
        Iterator<U6Y> it = this.LJLIL.LJLJLJ.iterator();
        while (it.hasNext()) {
            it.next().LJJIJIIJI(j);
        }
    }

    @Override // X.U6Y
    public final void LJJJJJL(String linkMicId) {
        o.LJIIIZ(linkMicId, "linkMicId");
    }

    @Override // X.U6Y
    public final void LJLJI(long j) {
        Iterator<U6Y> it = this.LJLIL.LJLJLJ.iterator();
        while (it.hasNext()) {
            it.next().LJLJI(j);
        }
    }

    @Override // X.U6Y
    public final void LLILZIL(long j) {
        Iterator<U6Y> it = this.LJLIL.LJLJLJ.iterator();
        while (it.hasNext()) {
            it.next().LLILZIL(j);
        }
    }

    @Override // X.U6Y
    public final void LLILZLL(long j) {
        Iterator<U6Y> it = this.LJLIL.LJLJLJ.iterator();
        while (it.hasNext()) {
            it.next().LLILZLL(j);
        }
    }

    @Override // X.U6Y
    public final void LLIZ(long j, long j2) {
        Iterator<U6Y> it = this.LJLIL.LJLJLJ.iterator();
        while (it.hasNext()) {
            it.next().LLIZ(j, j2);
        }
    }

    @Override // X.U6Y
    public final void LLJ(long j, long j2) {
        Iterator<U6Y> it = this.LJLIL.LJLJLJ.iterator();
        while (it.hasNext()) {
            it.next().LLJ(j, j2);
        }
    }
}
