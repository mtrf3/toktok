package X;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzau;
import java.util.Iterator;

/* renamed from: X.QpO, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68182QpO implements Iterator {
    public final Iterator LJLIL;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.LJLIL.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.LJLIL.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }

    public C68182QpO(zzau zzauVar) {
        Bundle bundle;
        bundle = zzauVar.zza;
        this.LJLIL = bundle.keySet().iterator();
    }
}
