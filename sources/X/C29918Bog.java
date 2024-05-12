package X;

import java.util.Comparator;
import kotlin.jvm.internal.o;

/* renamed from: X.Bog, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29918Bog<T> implements Comparator {
    public static final C29918Bog<T> LJLIL = new C29918Bog<>();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return o.LJIIJJI(((InterfaceC29920Boi) obj).getPriority(), ((InterfaceC29920Boi) obj2).getPriority());
    }
}
