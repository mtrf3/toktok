package X;

import kotlin.jvm.internal.o;

/* renamed from: X.LIt, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54039LIt extends F9E {
    public final boolean LJLIL;
    public final String LJLILLLLZI;
    public final CharSequence LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.LJLIL), this.LJLILLLLZI, this.LJLJI};
    }

    public C54039LIt(CharSequence visibilityToggleDesc, String visibilityToggleTitle, boolean z) {
        o.LJIIIZ(visibilityToggleTitle, "visibilityToggleTitle");
        o.LJIIIZ(visibilityToggleDesc, "visibilityToggleDesc");
        this.LJLIL = z;
        this.LJLILLLLZI = visibilityToggleTitle;
        this.LJLJI = visibilityToggleDesc;
    }
}
