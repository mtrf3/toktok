package X;

import kotlin.jvm.internal.o;

/* renamed from: X.JrV, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50477JrV extends F9E implements KK7 {
    public final String LJLIL;
    public final String LJLILLLLZI;

    public C50477JrV() {
        this(0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    @Override // X.KK7
    public final boolean isLog() {
        return true;
    }

    static {
        C17N.LJJJJLI().iL().LIZIZ(C65352Pkq.LIZ(C50477JrV.class), C50484Jrc.LJLIL);
    }

    public /* synthetic */ C50477JrV(int i) {
        this("", "");
    }

    public C50477JrV(String hintWord, String hintWordId) {
        o.LJIIIZ(hintWord, "hintWord");
        o.LJIIIZ(hintWordId, "hintWordId");
        this.LJLIL = hintWord;
        this.LJLILLLLZI = hintWordId;
    }
}
