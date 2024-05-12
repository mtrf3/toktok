package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.account.network.NetworkProxyAccount;
import com.ss.android.ugc.aweme.user.password.QueryUserPasswordSetStatusResponse;

/* renamed from: X.SzG, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73890SzG<T> implements InterfaceC73650SvO {
    public final /* synthetic */ String LJLIL;

    public C73890SzG(String str) {
        this.LJLIL = str;
    }

    @Override // X.InterfaceC73650SvO
    public final void subscribe(InterfaceC73740Swq<? super QueryUserPasswordSetStatusResponse> interfaceC73740Swq) {
        Object obj;
        Gson LJIIJJI;
        C68542QvC.LIZ.getClass();
        QQC qqc = C68542QvC.LIZJ;
        if (qqc != null && (LJIIJJI = ((NetworkProxyAccount) qqc).LJIIJJI()) != null) {
            obj = GsonProtectorUtils.fromJson(LJIIJJI, this.LJLIL, (Class<Object>) QueryUserPasswordSetStatusResponse.class);
        } else {
            obj = null;
        }
        interfaceC73740Swq.onNext(obj);
    }
}
