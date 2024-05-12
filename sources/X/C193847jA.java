package X;

import java.util.Objects;

/* renamed from: X.7jA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C193847jA extends AbstractC193947jK {
    public final AbstractC194007jQ LIZIZ;

    public final int hashCode() {
        return Objects.hash(this.LIZIZ);
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("BlurCellState:%s", this.LIZIZ);
    }

    public C193847jA(AbstractC194007jQ abstractC194007jQ) {
        super(abstractC194007jQ);
        this.LIZIZ = abstractC194007jQ;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C193847jA)) {
            return false;
        }
        return C78966Uyw.LJIIIZ(new Object[]{((C193847jA) obj).LIZIZ}, new Object[]{this.LIZIZ});
    }
}
