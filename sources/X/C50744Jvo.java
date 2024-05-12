package X;

import X.InterfaceC50315Jot;
import kotlin.jvm.internal.o;

/* renamed from: X.Jvo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50744Jvo<T extends InterfaceC50315Jot> {
    public final C50650JuI LIZ;
    public final EnumC50746Jvq LIZIZ;
    public final AbstractC50743Jvn<T> LIZJ;

    public final T LIZ() {
        String obj = this.LIZIZ.getSignalBinder().invoke(this.LIZ).toString();
        T t = this.LIZJ.LIZJ.get(obj);
        AbstractC50743Jvn<T> abstractC50743Jvn = this.LIZJ;
        abstractC50743Jvn.LIZJ.put(obj, abstractC50743Jvn.LIZ());
        if (t == null) {
            return this.LIZJ.LIZ();
        }
        return t;
    }

    public final T LIZIZ() {
        T t = this.LIZJ.LIZJ.get(this.LIZIZ.getSignalBinder().invoke(this.LIZ).toString());
        if (t == null) {
            return this.LIZJ.LIZ();
        }
        return t;
    }

    public C50744Jvo(C50650JuI c50650JuI, EnumC50746Jvq scopeKeyProvider, AbstractC50743Jvn<T> m) {
        o.LJIIIZ(scopeKeyProvider, "scopeKeyProvider");
        o.LJIIIZ(m, "m");
        this.LIZ = c50650JuI;
        this.LIZIZ = scopeKeyProvider;
        this.LIZJ = m;
    }
}
