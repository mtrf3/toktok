package X;

import java.util.HashMap;
import java.util.List;

/* renamed from: X.Euw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37950Euw extends C37944Euq {
    public final Y7M LJLIL;

    @Override // X.C37944Euq
    public final List<Class<? extends InterfaceC37666EqM>> LJII() {
        return C47261Igj.LJJIJ(Y7I.class);
    }

    @Override // X.C37944Euq
    public final java.util.Map<Class<?>, C37924EuW<?>> LJIIIIZZ() {
        HashMap hashMap = new HashMap();
        hashMap.put(C37951Eux.class, new C37924EuW(new C37951Eux(this.LJLIL)));
        return hashMap;
    }

    public C37950Euw(Y7M y7m) {
        this.LJLIL = y7m;
    }
}
