package Y;

import X.C237499Tt;
import X.C238049Vw;
import X.C238079Vz;
import X.C73433Srt;
import X.EnumC58085Mqv;
import X.InterfaceC73573Su9;
import X.InterfaceC86003Zc;
import X.MBB;
import X.XKX;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.userservice.UserService;
import com.ss.android.ugc.aweme.userservice.api.IUserService;
import java.util.HashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class IDuS316S0100000_4 implements InterfaceC86003Zc {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC86003Zc
    public final void subscribe(InterfaceC73573Su9<FollowStatus> interfaceC73573Su9) {
        switch (this.$t) {
            case 0:
                subscribe$0(this, interfaceC73573Su9);
                return;
            case 1:
                subscribe$1(this, interfaceC73573Su9);
                return;
            case 2:
                subscribe$2(this, interfaceC73573Su9);
                return;
            default:
                return;
        }
    }

    public IDuS316S0100000_4(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void subscribe$0(IDuS316S0100000_4 iDuS316S0100000_4, InterfaceC73573Su9 interfaceC73573Su9) {
        String str;
        String str2;
        JSONObject jSONObject = (JSONObject) iDuS316S0100000_4.l0;
        Integer num = null;
        if (jSONObject != null) {
            str = jSONObject.optString("uid");
        } else {
            str = null;
        }
        JSONObject jSONObject2 = (JSONObject) iDuS316S0100000_4.l0;
        if (jSONObject2 != null) {
            str2 = jSONObject2.optString("sec_uid");
        } else {
            str2 = null;
        }
        JSONObject jSONObject3 = (JSONObject) iDuS316S0100000_4.l0;
        if (jSONObject3 != null) {
            num = Integer.valueOf(jSONObject3.optInt("type"));
        }
        if (str != null && str2 != null && num != null) {
            IUserService LIZ = UserService.LIZ();
            o.LJIIIIZZ(LIZ, "get().getService(IUserService::class.java)");
            FollowStatus LJIIIZ = LIZ.LJIIIZ(num.intValue(), -1, -1, -1, str, str2, "", "", null, new HashMap());
            if (LJIIIZ != null) {
                interfaceC73573Su9.onNext(LJIIIZ);
            }
        }
    }

    public static final void subscribe$1(IDuS316S0100000_4 iDuS316S0100000_4, InterfaceC73573Su9 interfaceC73573Su9) {
        XKX.LJ(MBB.INSTANCE, new C237499Tt((EnumC58085Mqv) iDuS316S0100000_4.l0, interfaceC73573Su9, null));
    }

    public static final void subscribe$2(IDuS316S0100000_4 iDuS316S0100000_4, InterfaceC73573Su9 interfaceC73573Su9) {
        ((C238079Vz) iDuS316S0100000_4.l0).LIZ = new C238049Vw((C73433Srt) interfaceC73573Su9);
    }
}
