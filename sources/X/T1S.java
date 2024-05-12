package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.account.login.v2.network.CommitUserNameData;
import com.ss.android.ugc.aweme.account.login.v2.network.CommitUserNameResponse;
import com.ss.android.ugc.aweme.account.network.NetworkProxyAccount;

/* loaded from: classes13.dex */
public final class T1S<T> implements InterfaceC73650SvO {
    public final /* synthetic */ String LJLIL;

    public T1S(String str) {
        this.LJLIL = str;
    }

    @Override // X.InterfaceC73650SvO
    public final void subscribe(InterfaceC73740Swq<? super CommitUserNameResponse> interfaceC73740Swq) {
        int i;
        String str;
        Integer num;
        CommitUserNameResponse commitUserNameResponse = (CommitUserNameResponse) GsonProtectorUtils.fromJson(NetworkProxyAccount.LIZ.LJIIJJI(), this.LJLIL, CommitUserNameResponse.class);
        if (TextUtils.equals(commitUserNameResponse.message, "success")) {
            interfaceC73740Swq.onNext(commitUserNameResponse);
        } else {
            CommitUserNameData commitUserNameData = commitUserNameResponse.data;
            if (commitUserNameData != null && (num = commitUserNameData.error_code) != null) {
                i = num.intValue();
            } else {
                i = -1;
            }
            CommitUserNameData commitUserNameData2 = commitUserNameResponse.data;
            if (commitUserNameData2 != null) {
                str = commitUserNameData2.description;
            } else {
                str = null;
            }
            interfaceC73740Swq.onError(new C69084R9k(i, str, EnumC69116RAq.SIGN_UP, EnumC69113RAn.NONE, null, null, 32, null));
        }
        interfaceC73740Swq.onComplete();
    }
}
