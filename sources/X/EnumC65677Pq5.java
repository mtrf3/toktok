package X;

import defpackage.g0;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Pq5, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class EnumC65677Pq5 implements Iterator<Object> {
    public static final EnumC65677Pq5 LJLIL;
    public static final /* synthetic */ EnumC65677Pq5[] LJLILLLLZI;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final void remove() {
        g0.LJIIJ(false);
    }

    static {
        EnumC65677Pq5 enumC65677Pq5 = new EnumC65677Pq5();
        LJLIL = enumC65677Pq5;
        LJLILLLLZI = new EnumC65677Pq5[]{enumC65677Pq5};
    }

    public static EnumC65677Pq5[] values() {
        return (EnumC65677Pq5[]) LJLILLLLZI.clone();
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    public static EnumC65677Pq5 valueOf(String str) {
        return (EnumC65677Pq5) V0N.LJJJ(EnumC65677Pq5.class, str);
    }
}
