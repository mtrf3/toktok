package X;

import kotlin.jvm.internal.o;

/* renamed from: X.a7H, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92223a7H extends F9E {
    public static final /* synthetic */ int LJLJJI = 0;
    public final boolean LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;

    public C92223a7H() {
        this(true, "", "");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.LJLIL), this.LJLILLLLZI, this.LJLJI};
    }

    public C92223a7H(boolean z, String key, String message) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(message, "message");
        this.LJLIL = z;
        this.LJLILLLLZI = key;
        this.LJLJI = message;
    }
}
