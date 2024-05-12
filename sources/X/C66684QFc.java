package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.QFc, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66684QFc<E> implements Iterable<E> {
    public int LJLJI;
    public boolean LJLJJI;
    public final List<E> LJLIL = new ArrayList();
    public boolean LJLJJL = true;
    public final C66685QFd LJLILLLLZI = new C66685QFd();

    @Override // java.lang.Iterable
    public final Iterator<E> iterator() {
        if (this.LJLJJL) {
            this.LJLILLLLZI.getClass();
        }
        return new C66683QFb(this);
    }
}
