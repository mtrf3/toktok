package X;

import kotlin.jvm.internal.o;

/* renamed from: X.9GP, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9GP extends F9E implements InterfaceC87283bg {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final boolean LJLJI;

    public C9GP() {
        this("", "", false);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, Boolean.valueOf(this.LJLJI)};
    }

    public C9GP(String contentName, String contentValue, boolean z) {
        o.LJIIIZ(contentName, "contentName");
        o.LJIIIZ(contentValue, "contentValue");
        this.LJLIL = contentName;
        this.LJLILLLLZI = contentValue;
        this.LJLJI = z;
    }
}
