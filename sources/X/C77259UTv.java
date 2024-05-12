package X;

import kotlin.jvm.internal.o;

/* renamed from: X.UTv, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77259UTv extends F9E {
    public final C77157UPx LJLIL;
    public final String LJLILLLLZI;
    public final boolean LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, Boolean.valueOf(this.LJLJI)};
    }

    public C77259UTv(C77157UPx response, String str, boolean z) {
        o.LJIIIZ(response, "response");
        this.LJLIL = response;
        this.LJLILLLLZI = str;
        this.LJLJI = z;
    }

    public /* synthetic */ C77259UTv(C77157UPx c77157UPx, String str, boolean z, int i) {
        this((i & 1) != 0 ? new C77157UPx(null, new C77150UPq(false, 0, 0, null, 30)) : c77157UPx, str, (i & 4) != 0 ? false : z);
    }
}
