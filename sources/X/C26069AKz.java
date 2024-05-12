package X;

import kotlin.jvm.internal.o;

/* renamed from: X.AKz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26069AKz extends F9E {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, Integer.valueOf(this.LJLJI), Integer.valueOf(this.LJLJJI)};
    }

    public C26069AKz(String url) {
        o.LJIIIZ(url, "url");
        this.LJLIL = "web_promote";
        this.LJLILLLLZI = url;
        this.LJLJI = 600;
        this.LJLJJI = 8;
    }
}
