package X;

import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [T] */
/* renamed from: X.PkM, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65322PkM<T> implements Iterable<T> {
    public final /* synthetic */ Object LJLIL;

    @Override // java.lang.Iterable
    public final Iterator<T> iterator() {
        return new C65323PkN(this);
    }

    public C65322PkM(Object obj) {
        this.LJLIL = obj;
    }
}
