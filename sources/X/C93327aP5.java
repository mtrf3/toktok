package X;

import com.bytedance.pitaya.api.PTYDIDCallback;
import com.bytedance.pitaya.api.bean.PTYSetupInfo;

/* renamed from: X.aP5, reason: case insensitive filesystem */
/* loaded from: classes30.dex */
public final class C93327aP5 implements InterfaceC64016PAm {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ PTYSetupInfo LIZIZ;
    public final /* synthetic */ String LIZJ;

    @Override // X.InterfaceC64016PAm
    public final java.util.Map<String, String> getCommonParams() {
        String str;
        OSZ[] oszArr = new OSZ[6];
        oszArr[0] = new OSZ("oversea", this.LIZ);
        PTYDIDCallback didCallback = this.LIZIZ.getDidCallback();
        if (didCallback == null || (str = didCallback.getDid()) == null) {
            str = "";
        }
        oszArr[1] = new OSZ("device_id", str);
        oszArr[2] = new OSZ("host_aid", this.LIZIZ.getAid());
        oszArr[3] = new OSZ("channel", this.LIZIZ.getChannel());
        oszArr[4] = new OSZ("app_version", this.LIZIZ.getAppVersion());
        oszArr[5] = new OSZ("sdk_version", this.LIZJ);
        return C113554cx.LJJLIIIIJ(oszArr);
    }

    @Override // X.InterfaceC64016PAm
    public final String getSessionId() {
        return "";
    }

    public C93327aP5(String str, PTYSetupInfo pTYSetupInfo, String str2) {
        this.LIZ = str;
        this.LIZIZ = pTYSetupInfo;
        this.LIZJ = str2;
    }
}
