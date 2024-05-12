package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.account.login.v2.network.Request2svPushChallengeResponse;
import com.ss.android.ugc.aweme.account.login.v2.network.Request2svPushChallengeResponseWarp;
import com.ss.android.ugc.aweme.account.network.NetworkProxyAccount;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class T1R<T> implements InterfaceC73650SvO {
    public final /* synthetic */ String LJLIL;

    public T1R(String str) {
        this.LJLIL = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC73650SvO
    public final void subscribe(InterfaceC73740Swq<? super Request2svPushChallengeResponse> interfaceC73740Swq) {
        int i;
        String str;
        Integer num;
        Object fromJson = GsonProtectorUtils.fromJson(NetworkProxyAccount.LIZ.LJIIJJI(), this.LJLIL, (Class<Object>) Request2svPushChallengeResponseWarp.class);
        o.LJIIIIZZ(fromJson, "NetworkProxyAccount.gson…                        )");
        Request2svPushChallengeResponseWarp request2svPushChallengeResponseWarp = (Request2svPushChallengeResponseWarp) fromJson;
        if (TextUtils.equals(request2svPushChallengeResponseWarp.message, "success")) {
            interfaceC73740Swq.onNext(request2svPushChallengeResponseWarp.data);
        } else {
            Request2svPushChallengeResponse request2svPushChallengeResponse = request2svPushChallengeResponseWarp.data;
            if (request2svPushChallengeResponse != null && (num = request2svPushChallengeResponse.error_code) != null) {
                i = num.intValue();
            } else {
                i = -1;
            }
            Request2svPushChallengeResponse request2svPushChallengeResponse2 = request2svPushChallengeResponseWarp.data;
            if (request2svPushChallengeResponse2 != null) {
                str = request2svPushChallengeResponse2.description;
            } else {
                str = null;
            }
            interfaceC73740Swq.onError(new C69084R9k(i, str, EnumC69116RAq.LOGIN, EnumC69113RAn.PUSH_VERIFY, null, 0 == true ? 1 : 0, 32, 0 == true ? 1 : 0));
        }
        interfaceC73740Swq.onComplete();
    }
}
