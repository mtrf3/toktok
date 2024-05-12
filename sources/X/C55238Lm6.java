package X;

import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.Lm6, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C55238Lm6 implements InterfaceC55235Lm3 {
    public final String LJLIL;
    public final Object LJLILLLLZI;
    public final C62822Ol8 LJLJI;

    @Override // X.InterfaceC55235Lm3
    public C55252LmK getTree() {
        return (C55252LmK) this.LJLJI.getValue();
    }

    @Override // X.InterfaceC55235Lm3
    public Object getHost() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC55235Lm3
    public final String getKey() {
        return this.LJLIL;
    }

    public C55238Lm6(String key) {
        o.LJIIIZ(key, "key");
        this.LJLIL = key;
        this.LJLILLLLZI = null;
        this.LJLJI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 799));
    }
}
