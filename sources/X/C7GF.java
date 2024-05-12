package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.7GF, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7GF extends F9E implements InterfaceC54035LIp {
    public final Aweme LJLIL;

    @Override // X.InterfaceC54035LIp
    public final boolean LLD() {
        return false;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL};
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLLLIL() {
        C51556KLg.LIZ.getClass();
        java.util.Map<String, Object> LJIIJJI = C51556KLg.LIZ().LJIIJJI(this.LJLIL, null);
        if (!LJIIJJI.isEmpty()) {
            return LJIIJJI;
        }
        return C113554cx.LJJJLIIL();
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLJZ() {
        return LLLILZ();
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLLILZ() {
        return C113554cx.LJJJLIIL();
    }

    public C7GF(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        this.LJLIL = aweme;
    }
}
