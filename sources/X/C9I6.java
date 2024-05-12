package X;

import com.ss.android.ugc.aweme.profile.widgets.signature.UserProfileSignatureAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.9I6, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9I6 extends AbstractC65781Prl implements InterfaceC88472Yns<C8V4, C76800UCe> {
    public static final C9I6 LJLIL = new C9I6();

    public C9I6() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8V4 c8v4) {
        C8V4 uiContentAssem = c8v4;
        o.LJIIIZ(uiContentAssem, "$this$uiContentAssem");
        uiContentAssem.LIZ = C65352Pkq.LIZ(UserProfileSignatureAssem.class);
        uiContentAssem.LJIIIIZZ = new UserProfileSignatureAssem();
        uiContentAssem.LJI = R.id.n0r;
        return C76800UCe.LIZ;
    }
}
