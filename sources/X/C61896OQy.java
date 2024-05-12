package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.OQy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61896OQy<T> extends AbstractC61884OQm<T> {
    public final List<T> LJLILLLLZI;

    @Override // X.OQZ
    public final int LIZJ() {
        return this.LJLILLLLZI.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C61896OQy(List<? extends T> delegate) {
        o.LJIIIZ(delegate, "delegate");
        this.LJLILLLLZI = delegate;
    }

    @Override // X.AbstractC61884OQm, java.util.List
    public final T get(int i) {
        return (T) ListProtector.get(this.LJLILLLLZI, ORS.LJJZZI(i, this));
    }
}
