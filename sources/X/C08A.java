package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.08A, reason: invalid class name */
/* loaded from: classes.dex */
public class C08A implements Runnable {
    public final List<AnonymousClass089> LJLIL;
    public final int LJLILLLLZI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            int size = ((ArrayList) this.LJLIL).size();
            int i = 0;
            if (this.LJLILLLLZI != 1) {
                while (i < size) {
                    ((AnonymousClass089) ListProtector.get(this.LJLIL, i)).LIZ();
                    i++;
                }
            } else {
                while (i < size) {
                    ((AnonymousClass089) ListProtector.get(this.LJLIL, i)).LIZIZ();
                    i++;
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public C08A(Collection<AnonymousClass089> collection, int i, Throwable th) {
        TMC.LJIIIZ(collection, "initCallbacks cannot be null");
        this.LJLIL = new ArrayList(collection);
        this.LJLILLLLZI = i;
    }
}
