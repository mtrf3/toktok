package X;

import com.ss.android.ugc.aweme.account.network.NetworkProxyAccount;
import kotlin.jvm.internal.o;

/* renamed from: X.Sxy, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73810Sxy<T> implements InterfaceC73650SvO {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ java.util.Map<String, String> LJLILLLLZI;

    public C73810Sxy(String str, java.util.Map<String, String> map) {
        this.LJLIL = str;
        this.LJLILLLLZI = map;
    }

    @Override // X.InterfaceC73650SvO
    public final void subscribe(InterfaceC73740Swq<? super String> interfaceC73740Swq) {
        try {
            NetworkProxyAccount networkProxyAccount = NetworkProxyAccount.LIZ;
            String url = this.LJLIL;
            o.LJIIIIZZ(url, "url");
            interfaceC73740Swq.onNext(networkProxyAccount.LJIIIIZZ(url, this.LJLILLLLZI));
        } catch (Throwable th) {
            interfaceC73740Swq.onError(th);
        }
    }
}
