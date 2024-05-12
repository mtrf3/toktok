package X;

import Y.AfS54S0200000_5;
import com.bytedance.android.livesdk.game.api.GameLivePartnershipRetrofitApi;
import com.bytedance.android.livesdk.game.model.UserInfo;
import kotlin.jvm.internal.AqS168S0200000_5;
import org.json.JSONObject;

/* renamed from: X.Bdj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29239Bdj implements InterfaceC05250In {
    public final /* synthetic */ InterfaceC88471Ynr<JSONObject, UserInfo, C76800UCe> LIZ;

    @Override // X.InterfaceC05250In
    public final C76800UCe LJI() {
        C0NB.LIZIZ("PartnershipDialogUtils", "canceled dialog for edit dob");
        return C76800UCe.LIZ;
    }

    public C29239Bdj(AqS168S0200000_5 aqS168S0200000_5) {
        this.LIZ = aqS168S0200000_5;
    }

    @Override // X.InterfaceC05250In
    public final C76800UCe onFailed(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("edit dob failed and msg:");
        LIZ.append(str);
        C0NB.LJ("PartnershipDialogUtils", X1D.LIZIZ(LIZ));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC05250In
    public final C76800UCe LJFF(String str, String str2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" enter edit dob succeed and dob:");
        LIZ.append(str);
        LIZ.append(", appealUrl:");
        LIZ.append(str2);
        C0NB.LIZIZ("PartnershipDialogUtils", X1D.LIZIZ(LIZ));
        C78963Uyt.LJLIL = true;
        C78963Uyt.LJLILLLLZI = true;
        JSONObject LIZJ = C65232Piu.LIZJ("taskId", "");
        LIZJ.put("userId", String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()));
        LIZJ.put("isFromApp", 1);
        C65814PsI.LIZ().getClass();
        AbstractC73672Svk LIZ2 = C1EW.LIZ(((GameLivePartnershipRetrofitApi) C65814PsI.LIZJ(GameLivePartnershipRetrofitApi.class)).requestUserInfo());
        InterfaceC88471Ynr<JSONObject, UserInfo, C76800UCe> interfaceC88471Ynr = this.LIZ;
        LIZ2.LJJJLIIL(new AfS54S0200000_5(LIZJ, interfaceC88471Ynr, 41), new AfS54S0200000_5(LIZJ, interfaceC88471Ynr, 42));
        return C76800UCe.LIZ;
    }
}
