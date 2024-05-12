package X;

import java.util.Collection;
import kotlin.jvm.internal.IDqS416S0100000;

/* renamed from: X.1oQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC44221oQ<E> extends InterfaceC37411dR<E>, Collection, InterfaceC90533gv {
    InterfaceC44221oQ LJJJJ(IDqS416S0100000 iDqS416S0100000);

    InterfaceC44221oQ<E> LJJJJIZL(int i);

    @Override // java.util.List
    InterfaceC44221oQ<E> add(int i, E e);

    @Override // java.util.List, java.util.Collection
    InterfaceC44221oQ<E> add(E e);

    @Override // java.util.List, java.util.Collection
    InterfaceC44221oQ<E> addAll(Collection<? extends E> collection);

    C2HH builder();

    @Override // java.util.List, java.util.Collection
    InterfaceC44221oQ<E> remove(E e);

    @Override // java.util.List, java.util.Collection
    InterfaceC44221oQ<E> removeAll(Collection<? extends E> collection);

    @Override // java.util.List
    InterfaceC44221oQ<E> set(int i, E e);
}
