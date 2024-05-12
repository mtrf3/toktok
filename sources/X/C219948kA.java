package X;

import kotlin.jvm.internal.o;

/* renamed from: X.8kA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C219948kA extends F9E {
    public final long LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.LJLIL), this.LJLILLLLZI, this.LJLJI, this.LJLJJI};
    }

    public C219948kA(long j, String targetLang, String originalStr, String str) {
        o.LJIIIZ(targetLang, "targetLang");
        o.LJIIIZ(originalStr, "originalStr");
        this.LJLIL = j;
        this.LJLILLLLZI = targetLang;
        this.LJLJI = originalStr;
        this.LJLJJI = str;
    }
}
