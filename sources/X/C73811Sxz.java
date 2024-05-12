package X;

import com.ss.android.ugc.aweme.account.network.NetworkProxyAccount;
import kotlin.jvm.internal.o;

/* renamed from: X.Sxz, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73811Sxz<T> implements InterfaceC73650SvO {
    public final /* synthetic */ String LJLIL;

    public C73811Sxz(String str) {
        this.LJLIL = str;
    }

    @Override // X.InterfaceC73650SvO
    public final void subscribe(InterfaceC73740Swq<? super String> interfaceC73740Swq) {
        try {
            NetworkProxyAccount networkProxyAccount = NetworkProxyAccount.LIZ;
            String url = this.LJLIL;
            o.LJIIIIZZ(url, "url");
            interfaceC73740Swq.onNext(networkProxyAccount.LJ(url));
        } catch (Throwable th) {
            interfaceC73740Swq.onError(th);
        }
    }
}
