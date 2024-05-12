package Y;

import X.C72041SPd;
import X.C72042SPe;
import X.C72045SPh;
import X.C73969T1h;
import X.InterfaceC64592gB;
import X.OSZ;
import X.T16;
import X.TB5;
import X.TB6;
import X.TB7;
import X.TBB;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.tiktok.tpsc.data.usersettings.PrivacyUserSettingsResponse;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class AfS20S0001000_12 implements InterfaceC64592gB {
    public final int $t;
    public int i0;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            case 3:
                accept$3(this, obj);
                return;
            default:
                return;
        }
    }

    public AfS20S0001000_12(int i, int i2) {
        this.$t = i2;
        this.i0 = i;
    }

    public static final void accept$0(AfS20S0001000_12 afS20S0001000_12, Object obj) {
        int i;
        C72041SPd.LIZ.getClass();
        if (C72041SPd.LIZJ().LIZ()) {
            if (afS20S0001000_12.i0 == 3) {
                i = 2;
            } else {
                i = 1;
            }
            C72045SPh.LIZIZ("group_chat_invite", i).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJJZ();
        }
    }

    public static final void accept$1(AfS20S0001000_12 afS20S0001000_12, Object obj) {
        PrivacyUserSettingsResponse resp = (PrivacyUserSettingsResponse) obj;
        C72041SPd.LIZ.getClass();
        PrivacyUserSettingsV2 LJI = C72041SPd.LJI();
        if (LJI != null) {
            LJI.LJLIL.put("private_account", Integer.valueOf(afS20S0001000_12.i0));
            C72042SPe.LIZJ(LJI);
        }
        C72045SPh.LIZIZ = System.currentTimeMillis();
        if (resp != null && resp.getPrivacyUserSettings() != null) {
            o.LJIIIIZZ(resp, "resp");
            C72042SPe.LIZ(resp);
        } else {
            C72045SPh.LIZ(true);
        }
    }

    public static final void accept$2(AfS20S0001000_12 afS20S0001000_12, Object obj) {
        OSZ osz = (OSZ) obj;
        HashMap<Integer, TB5> hashMap = TB6.LIZIZ;
        TB5 tb5 = hashMap.get(Integer.valueOf(afS20S0001000_12.i0));
        if (((Boolean) osz.getSecond()).booleanValue()) {
            if (tb5 != null) {
                TB7 tb7 = tb5.LJ;
                if (tb7 != null) {
                    tb7.LIZIZ(tb5);
                }
                tb5.LIZ(TBB.CLA_REALTIME_STATUS_SUCCESS);
                return;
            }
            return;
        }
        if (tb5 != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Translation failed with status code: ");
            LIZ.append(((BaseResponse) osz.getFirst()).status_code);
            LIZ.append(", msg: ");
            LIZ.append(((BaseResponse) osz.getFirst()).status_msg);
            Throwable th = new Throwable(X1D.LIZIZ(LIZ));
            TB7 tb72 = tb5.LJ;
            if (tb72 != null) {
                tb72.LIZ(th);
            }
            tb5.LIZ(TBB.CLA_REALTIME_STATUS_FAILED);
        }
        hashMap.remove(Integer.valueOf(afS20S0001000_12.i0));
    }

    public static final void accept$3(AfS20S0001000_12 afS20S0001000_12, Object obj) {
        Throwable it = (Throwable) obj;
        HashMap<Integer, TB5> hashMap = TB6.LIZIZ;
        TB5 tb5 = hashMap.get(Integer.valueOf(afS20S0001000_12.i0));
        if (tb5 != null) {
            o.LJIIIIZZ(it, "it");
            TB7 tb7 = tb5.LJ;
            if (tb7 != null) {
                tb7.LIZ(it);
            }
            tb5.LIZ(TBB.CLA_REALTIME_STATUS_FAILED);
        }
        hashMap.remove(Integer.valueOf(afS20S0001000_12.i0));
    }
}
