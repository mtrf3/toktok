package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.Serializable;
import java.util.List;

/* renamed from: X.PnI, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65504PnI<T> implements InterfaceC65503PnH<T>, Serializable {
    public static final long serialVersionUID = 0;
    public final List<? extends InterfaceC65503PnH<? super T>> LJLIL;

    public C65504PnI() {
        throw null;
    }

    public final int hashCode() {
        return this.LJLIL.hashCode() + 306654252;
    }

    public final String toString() {
        List<? extends InterfaceC65503PnH<? super T>> list = this.LJLIL;
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z = true;
        for (InterfaceC65503PnH<? super T> interfaceC65503PnH : list) {
            if (!z) {
                sb.append(',');
            }
            sb.append(interfaceC65503PnH);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }

    public C65504PnI(List list) {
        this.LJLIL = list;
    }

    @Override // X.InterfaceC65503PnH
    public final boolean apply(T t) {
        for (int i = 0; i < this.LJLIL.size(); i++) {
            if (!((InterfaceC65503PnH) ListProtector.get(this.LJLIL, i)).apply(t)) {
                return false;
            }
        }
        return true;
    }

    @Override // X.InterfaceC65503PnH
    public final boolean equals(Object obj) {
        if (obj instanceof C65504PnI) {
            return this.LJLIL.equals(((C65504PnI) obj).LJLIL);
        }
        return false;
    }
}
