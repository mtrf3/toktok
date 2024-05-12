package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.7GE, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7GE extends F9E implements InterfaceC54035LIp {
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
        if (o.LJ(this.LJLIL, "homepage_nearby")) {
            HashMap<String, String> hashMap = new HashMap<>();
            LQA.LIZIZ.LJII(this.LJLIL, hashMap, this.LJLILLLLZI, true);
            return hashMap;
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

    public C7GE(String enterFrom, Aweme aweme) {
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(aweme, "aweme");
        this.LJLIL = enterFrom;
        this.LJLILLLLZI = aweme;
    }
}
