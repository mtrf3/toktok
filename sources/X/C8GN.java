package X;

import kotlin.jvm.internal.o;

/* renamed from: X.8GN, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8GN extends F9E {
    public final String LJLIL;
    public final boolean LJLILLLLZI;
    public final String LJLJI;
    public final java.util.Map<String, String> LJLJJI;

    public C8GN() {
        this(null, null, false, 15);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Boolean.valueOf(this.LJLILLLLZI), this.LJLJI, this.LJLJJI};
    }

    public C8GN(String text, String actionId, boolean z, int i) {
        C93833mF extra;
        text = (i & 1) != 0 ? "" : text;
        z = (i & 2) != 0 ? false : z;
        actionId = (i & 4) != 0 ? "" : actionId;
        if ((i & 8) != 0) {
            extra = C113554cx.LJJJLIIL();
        } else {
            extra = null;
        }
        o.LJIIIZ(text, "text");
        o.LJIIIZ(actionId, "actionId");
        o.LJIIIZ(extra, "extra");
        this.LJLIL = text;
        this.LJLILLLLZI = z;
        this.LJLJI = actionId;
        this.LJLJJI = extra;
    }
}
