package X;

import java.util.Collection;
import java.util.Map;

/* renamed from: X.Pp9, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65619Pp9<K, V> extends C65620PpA<K, V> {
    @Override // X.C65620PpA
    public final Collection<V> LIZ() {
        return new C65657Ppl();
    }

    public final C65609Poz<K, V> LIZLLL() {
        return C65609Poz.LJII(this.LIZ.entrySet());
    }

    @Override // X.C65620PpA
    public final void LIZJ(Map.Entry entry) {
        super.LIZJ(entry);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C65620PpA
    public final C65620PpA LIZIZ(Object obj, Object obj2) {
        super.LIZIZ(obj, obj2);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJ(Object obj, Object obj2) {
        super.LIZIZ(obj, obj2);
    }
}
