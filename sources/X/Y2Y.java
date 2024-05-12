package X;

import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y2Y extends F9E implements InterfaceC86772Y3s {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final int LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI};
    }

    @Override // X.InterfaceC86772Y3s
    public final Integer i() {
        return Integer.valueOf(this.LJLJJI);
    }

    public Y2Y(String str, String str2, String targetLang) {
        o.LJIIIZ(targetLang, "targetLang");
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = targetLang;
        this.LJLJJI = str2.length();
    }
}
