package X;

import com.ss.android.ugc.aweme.account.login.loginmethods.EncryptedLoginMethod;
import com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.QtN, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68429QtN<TResult> implements InterfaceC67677QhF {
    public static final C68429QtN<TResult> LJLIL = new C68429QtN<>();

    @Override // X.InterfaceC67677QhF
    public final void onSuccess(Object obj) {
        List<EncryptedLoginMethod> it = (List) obj;
        C68518Quo c68518Quo = C68517Qun.LIZIZ;
        List<BaseLoginMethod> list = C68517Qun.LIZJ;
        o.LJIIIIZZ(it, "it");
        C68517Qun.LIZJ = ORZ.LLJILJILJ(c68518Quo.LIZIZ(list, it));
        C68517Qun.LIZ.LJIILJJIL(true);
    }
}
