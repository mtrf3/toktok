package X;

import com.ss.android.ugc.aweme.user.SignificantUserInfo;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class R43 extends AbstractC65781Prl implements InterfaceC88472Yns<SignificantUserInfo, CharSequence> {
    public static final R43 LJLIL = new R43();

    public R43() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(SignificantUserInfo significantUserInfo) {
        SignificantUserInfo it = significantUserInfo;
        o.LJIIIZ(it, "it");
        return it.uid;
    }
}
