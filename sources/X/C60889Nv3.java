package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Nv3, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60889Nv3 extends F9E {
    public String LJLIL;
    public String LJLILLLLZI;
    public boolean LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, Boolean.valueOf(this.LJLJI)};
    }

    public final String L() {
        if (this.LJLJI) {
            return this.LJLILLLLZI;
        }
        return null;
    }

    public C60889Nv3(String channel, String bundlePath, boolean z) {
        o.LJIIJ(channel, "channel");
        o.LJIIJ(bundlePath, "bundlePath");
        this.LJLIL = channel;
        this.LJLILLLLZI = bundlePath;
        this.LJLJI = z;
    }
}
