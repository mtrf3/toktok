package X;

import kotlin.jvm.internal.o;

/* renamed from: X.7bG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C188947bG extends F9E {
    public final String LJLIL;
    public boolean LJLILLLLZI;

    public C188947bG() {
        this("", false);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Boolean.valueOf(this.LJLILLLLZI)};
    }

    public C188947bG(String speedText, boolean z) {
        o.LJIIIZ(speedText, "speedText");
        this.LJLIL = speedText;
        this.LJLILLLLZI = z;
    }
}
