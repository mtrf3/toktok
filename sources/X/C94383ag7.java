package X;

import kotlin.jvm.internal.o;

/* renamed from: X.ag7, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94383ag7 extends F9E {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final boolean LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, Boolean.valueOf(this.LJLJJI)};
    }

    public C94383ag7(String iconUrl, String name, String str) {
        o.LJIIIZ(iconUrl, "iconUrl");
        o.LJIIIZ(name, "name");
        this.LJLIL = iconUrl;
        this.LJLILLLLZI = name;
        this.LJLJI = str;
        this.LJLJJI = true;
    }
}
