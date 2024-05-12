package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.account.login.v2.network.CheckUserNameResponse;
import com.ss.android.ugc.aweme.account.network.NetworkProxyAccount;

/* renamed from: X.Sxx, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73809Sxx<T> implements InterfaceC73650SvO {
    public final /* synthetic */ String LJLIL;

    public C73809Sxx(String str) {
        this.LJLIL = str;
    }

    @Override // X.InterfaceC73650SvO
    public final void subscribe(InterfaceC73740Swq<? super CheckUserNameResponse> interfaceC73740Swq) {
        Object fromJson = GsonProtectorUtils.fromJson(NetworkProxyAccount.LIZ.LJIIJJI(), this.LJLIL, (Class<Object>) CheckUserNameResponse.class);
        if (fromJson == null) {
            fromJson = new CheckUserNameResponse(null, null);
        }
        interfaceC73740Swq.onNext(fromJson);
    }
}
