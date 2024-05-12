package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.account.login.v2.network.Check2SvPushClickResponse;
import com.ss.android.ugc.aweme.account.login.v2.network.Check2SvPushClickResponseWrap;
import com.ss.android.ugc.aweme.account.network.NetworkProxyAccount;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class T1Q<T> implements InterfaceC73650SvO {
    public final /* synthetic */ String LJLIL;

    public T1Q(String str) {
        this.LJLIL = str;
    }

    @Override // X.InterfaceC73650SvO
    public final void subscribe(InterfaceC73740Swq<? super Check2SvPushClickResponse> interfaceC73740Swq) {
        int i;
        String str;
        Integer num;
        Object fromJson = GsonProtectorUtils.fromJson(NetworkProxyAccount.LIZ.LJIIJJI(), this.LJLIL, (Class<Object>) Check2SvPushClickResponseWrap.class);
        o.LJIIIIZZ(fromJson, "NetworkProxyAccount.gson…ResponseWrap::class.java)");
        Check2SvPushClickResponseWrap check2SvPushClickResponseWrap = (Check2SvPushClickResponseWrap) fromJson;
        if (TextUtils.equals(check2SvPushClickResponseWrap.message, "success")) {
            interfaceC73740Swq.onNext(check2SvPushClickResponseWrap.data);
        } else {
            Check2SvPushClickResponse check2SvPushClickResponse = check2SvPushClickResponseWrap.data;
            if (check2SvPushClickResponse != null && (num = check2SvPushClickResponse.error_code) != null) {
                i = num.intValue();
            } else {
                i = -1;
            }
            Check2SvPushClickResponse check2SvPushClickResponse2 = check2SvPushClickResponseWrap.data;
            if (check2SvPushClickResponse2 != null) {
                str = check2SvPushClickResponse2.description;
            } else {
                str = null;
            }
            interfaceC73740Swq.onError(new C69084R9k(i, str, EnumC69116RAq.LOGIN, EnumC69113RAn.PUSH_VERIFY, null, null, 32, null));
        }
        interfaceC73740Swq.onComplete();
    }
}
