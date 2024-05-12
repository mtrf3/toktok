package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.2c6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C62062c6 extends F9E implements InterfaceC54035LIp {
    public final String LJLIL;
    public final Aweme LJLILLLLZI;

    @Override // X.InterfaceC54035LIp
    public final boolean LLD() {
        return false;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLLLIL() {
        C188727au c188727au = new C188727au();
        V0N.LJI(c188727au, this.LJLILLLLZI);
        java.util.Map<String, String> map = c188727au.LIZ;
        o.LJIIIIZZ(map, "EventMapBuilder().append…eme, enterFrom).builder()");
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

    public C62062c6(String enterFrom, Aweme aweme) {
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(aweme, "aweme");
        this.LJLIL = enterFrom;
        this.LJLILLLLZI = aweme;
    }
}
