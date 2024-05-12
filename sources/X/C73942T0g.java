package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.account.agegate.ftc.FtcCreateAccountModel;
import com.ss.android.ugc.aweme.account.network.NetworkProxyAccount;
import kotlin.jvm.internal.o;

/* renamed from: X.T0g, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73942T0g<T> implements InterfaceC73650SvO {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ FtcCreateAccountModel LJLILLLLZI;

    public C73942T0g(String str, FtcCreateAccountModel ftcCreateAccountModel) {
        this.LJLIL = str;
        this.LJLILLLLZI = ftcCreateAccountModel;
    }

    @Override // X.InterfaceC73650SvO
    public final void subscribe(InterfaceC73740Swq<? super AbstractC35632Dye> interfaceC73740Swq) {
        AbstractC35632Dye c35631Dyd;
        FtcCreateAccountModel.UpdateUserNameNetworkEntity responseBody = (FtcCreateAccountModel.UpdateUserNameNetworkEntity) GsonProtectorUtils.fromJson(NetworkProxyAccount.LIZ.LJIIJJI(), this.LJLIL, FtcCreateAccountModel.UpdateUserNameNetworkEntity.class);
        FtcCreateAccountModel ftcCreateAccountModel = this.LJLILLLLZI;
        o.LJIIIIZZ(responseBody, "responseBody");
        ftcCreateAccountModel.getClass();
        FtcCreateAccountModel.UserNameDataEntity userNameDataEntity = responseBody.data;
        int i = userNameDataEntity.errorCode;
        if (i == 0) {
            c35631Dyd = C35633Dyf.LIZ;
        } else {
            c35631Dyd = new C35631Dyd(i, userNameDataEntity.description);
        }
        interfaceC73740Swq.onNext(c35631Dyd);
    }
}
