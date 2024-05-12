package X;

import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* renamed from: X.9Xg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C238409Xg extends AbstractC238349Xa {
    public final String LIZIZ;
    public final C5H3 LIZJ;

    @Override // X.AbstractC238349Xa
    public final java.util.Map<String, String> LIZIZ() {
        Object value = this.LIZJ.getValue();
        o.LJIIIIZZ(value, "<get-params>(...)");
        return (java.util.Map) value;
    }

    @Override // X.AbstractC238349Xa
    public final String LIZ() {
        return this.LIZIZ;
    }

    public C238409Xg(C238479Xn linkParams, User user, long j, String str, Integer num) {
        boolean isLogin = ((RBX) HG3.LJIILL()).isLogin();
        o.LJIIIZ(linkParams, "linkParams");
        this.LIZIZ = "sharer_info_api_result";
        this.LIZJ = C221108m2.LIZ(EnumC221088m0.NONE, new C238489Xo(this, isLogin, linkParams, j, num, user, str));
    }
}
