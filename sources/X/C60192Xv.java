package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.service.CommonFeedApiService;
import kotlin.jvm.internal.o;

/* renamed from: X.2Xv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C60192Xv extends F9E implements InterfaceC54035LIp {
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
        CommonFeedApiService.LIZ().LJ(c188727au, this.LJLIL);
        java.util.Map<String, String> map = c188727au.LIZ;
        o.LJIIIIZZ(map, "EventMapBuilder().apply …weme)\n        }.builder()");
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

    public C60192Xv(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        this.LJLIL = aweme;
    }
}
