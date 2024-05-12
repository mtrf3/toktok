package X;

import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.Sza, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC73910Sza<K, V> implements InterfaceC68914R2w<K, V> {
    public final WeakReference<QDR<OSZ<K, V>>> LIZ;

    @Override // X.InterfaceC68914R2w
    public final QDR<OSZ<K, V>> LIZIZ() {
        return this.LIZ.get();
    }

    public AbstractC73910Sza(QDR<OSZ<K, V>> qdr) {
        this.LIZ = new WeakReference<>(qdr);
    }

    public static AbstractC73430Srq LJIIIIZZ(C73805Sxt c73805Sxt, boolean z) {
        if (z) {
            AbstractC73672Svk LJJZ = new C73893SzJ().LJJZ();
            int i = AbstractC73745Swv.LJLIL;
            C73320Sq4.LIZIZ(i, "bufferSize");
            new C73909SzZ(c73805Sxt, i).LJJIII(J7I.LJLJI, false).LIZ(LJJZ);
            return LJJZ.LJ(100L, TimeUnit.MILLISECONDS).LJJIFFI(T2J.LJLILLLLZI);
        }
        return c73805Sxt.LJJIJL(new InterfaceC48038ItG<T, R>() { // from class: X.3gq
            @Override // X.InterfaceC48038ItG
            public final Object apply(Object it) {
                o.LJIIJ(it, "it");
                return C47261Igj.LJJIJ(it);
            }
        });
    }
}
