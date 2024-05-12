package X;

import java.lang.reflect.Array;
import java.util.AbstractList;

/* renamed from: X.Fgl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39619Fgl extends AbstractList {
    public final /* synthetic */ Object LJLIL;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return Array.getLength(this.LJLIL);
    }

    public C39619Fgl(Object obj) {
        this.LJLIL = obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return Array.get(this.LJLIL, i);
    }
}
