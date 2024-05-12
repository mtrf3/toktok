package X;

import java.util.AbstractSet;

/* renamed from: X.Prk, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC65780Prk<E> extends AbstractSet<E> implements java.util.Set<E>, InterfaceC65779Prj {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean add(E e);

    public abstract int getSize();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return getSize();
    }
}
