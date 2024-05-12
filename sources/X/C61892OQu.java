package X;

import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.OQu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61892OQu<T, K> extends AbstractC61891OQt<T> {
    public final Iterator<T> LJLJI;
    public final InterfaceC88472Yns<T, K> LJLJJI;
    public final HashSet<K> LJLJJL;

    @Override // X.AbstractC61891OQt
    public final void LIZ() {
        while (this.LJLJI.hasNext()) {
            T next = this.LJLJI.next();
            if (this.LJLJJL.add(this.LJLJJI.invoke(next))) {
                this.LJLILLLLZI = next;
                this.LJLIL = EnumC61894OQw.Ready;
                return;
            }
        }
        this.LJLIL = EnumC61894OQw.Done;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C61892OQu(Iterator<? extends T> source, InterfaceC88472Yns<? super T, ? extends K> keySelector) {
        o.LJIIIZ(source, "source");
        o.LJIIIZ(keySelector, "keySelector");
        this.LJLJI = source;
        this.LJLJJI = keySelector;
        this.LJLJJL = new HashSet<>();
    }
}
