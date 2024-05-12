package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.7GG, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7GG extends F9E implements InterfaceC54035LIp {
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
        java.util.Map<String, String> map = ((C188727au) C220488l2.LIZIZ.LJII(this.LJLIL, new C188727au())).LIZ;
        o.LJIIIIZZ(map, "EventMapBuilder().append…ursParam(aweme).builder()");
        return map;
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLJZ() {
        return LLLILZ();
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLLILZ() {
        return C113554cx.LJJJLIIL();
    }

    public C7GG(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        this.LJLIL = aweme;
    }
}
