package X;

import com.google.gson.j;
import com.google.gson.m;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class E2A<T, R> implements InterfaceC48038ItG {
    public static final E2A<T, R> LJLIL = new E2A<>();

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        E29 it = (E29) obj;
        o.LJIIIZ(it, "it");
        String str = it.LJLIL;
        j jVar = it.LJLILLLLZI;
        o.LJII(jVar, "null cannot be cast to non-null type com.google.gson.JsonObject");
        return new E2B(str, (m) jVar);
    }
}
