package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.7GD, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7GD extends F9E implements InterfaceC54035LIp {
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
        C188727au c188727au = new C188727au();
        Z9N.LIZIZ.LJJIFFI().LIZ(c188727au, this.LJLIL);
        java.util.Map<String, String> map = c188727au.LIZ;
        o.LJIIIIZZ(map, "EventMapBuilder().apply …this)\n        }.builder()");
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

    public C7GD(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        this.LJLIL = aweme;
    }
}
