package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.account.agegate.ftc.FtcCreateAccountModel;
import com.ss.android.ugc.aweme.account.network.NetworkProxyAccount;
import java.util.List;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.AqS197S0100000_15;
import org.json.JSONObject;

/* renamed from: X.R3y, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68942R3y extends AbstractC67055QTj<C68922R3e> {
    public final /* synthetic */ InterfaceC88471Ynr<List<String>, String, C76800UCe> LIZ;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LIZIZ;

    @Override // X.AbstractC67055QTj
    public final void onSuccess(C68922R3e c68922R3e) {
        if (c68922R3e == null) {
            this.LIZ.invoke(null, null);
        } else {
            this.LIZIZ.invoke();
        }
    }

    public C68942R3y(AqS165S0100000_15 aqS165S0100000_15, AqS197S0100000_15 aqS197S0100000_15) {
        this.LIZ = aqS197S0100000_15;
        this.LIZIZ = aqS165S0100000_15;
    }

    @Override // X.AbstractC67055QTj
    public final void onError(C68922R3e c68922R3e, int i) {
        JSONObject jSONObject;
        List<String> list;
        C68922R3e c68922R3e2 = c68922R3e;
        String str = null;
        if (c68922R3e2 != null) {
            jSONObject = c68922R3e2.LJIILJJIL;
        } else {
            jSONObject = null;
        }
        FtcCreateAccountModel.LoginNameCheckData loginNameCheckData = (FtcCreateAccountModel.LoginNameCheckData) GsonProtectorUtils.fromJson(NetworkProxyAccount.LIZ.LJIIJJI(), String.valueOf(jSONObject), FtcCreateAccountModel.LoginNameCheckData.class);
        if (loginNameCheckData != null) {
            list = loginNameCheckData.suggestions;
        } else {
            list = null;
        }
        InterfaceC88471Ynr<List<String>, String, C76800UCe> interfaceC88471Ynr = this.LIZ;
        if (c68922R3e2 != null) {
            str = c68922R3e2.LJFF;
        }
        interfaceC88471Ynr.invoke(list, str);
    }
}
