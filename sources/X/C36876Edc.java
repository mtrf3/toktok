package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Edc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36876Edc extends F9E {
    public static final /* synthetic */ int LJLJI = 0;
    public final String LJLIL;
    public final long LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Long.valueOf(this.LJLILLLLZI)};
    }

    public C36876Edc(String awemeId, long j) {
        o.LJIIIZ(awemeId, "awemeId");
        this.LJLIL = awemeId;
        this.LJLILLLLZI = j;
    }
}
