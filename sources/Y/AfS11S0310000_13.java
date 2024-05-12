package Y;

import X.C05630Jz;
import X.C0NB;
import X.C276516r;
import X.C29401Dk;
import X.C30725C4b;
import X.C30868C9o;
import X.C34K;
import X.C76265TwT;
import X.C76272Twa;
import X.C76279Twh;
import X.C76280Twi;
import X.C76324TxQ;
import X.EnumC76319TxL;
import X.InterfaceC64592gB;
import X.InterfaceC65784Pro;
import X.InterfaceC76313TxF;
import X.InterfaceC88472Yns;
import android.text.TextUtils;
import com.bytedance.android.live.liveinteract.match.model.PrepareBattleResponse;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.livesetting.linkmic.EnableSpecificGiftEntranceOptimizeSetting;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS24S0310000_13;
import kotlin.jvm.internal.AqS68S0110000_13;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class AfS11S0310000_13 implements InterfaceC64592gB {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

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
            default:
                return;
        }
    }

    public static final void accept$0(AfS11S0310000_13 afS11S0310000_13, Object obj) {
        C0NB.LJIIIZ("TwoMatchViewAnchorPrese", "punish, success");
        if (afS11S0310000_13.z3) {
            if (((C34K) afS11S0310000_13.l0).element) {
                ((C76279Twh) afS11S0310000_13.l1).LJJIIZI("punish_cut_short_request_negative", true);
            } else {
                ((C76279Twh) afS11S0310000_13.l1).LJJIIZI("punish_cut_short_request", true);
            }
        }
        boolean z = afS11S0310000_13.z3;
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LJI(jSONObject, "cut_short", String.valueOf(z ? 1 : 0));
        C05630Jz.LJFF(jSONObject, "cost", System.currentTimeMillis() - C76272Twa.LJIIJ);
        C76272Twa c76272Twa = C76272Twa.LIZ;
        C76272Twa.LJIJJ(jSONObject, false);
        C76272Twa.LJJJLIIL(c76272Twa, "punish_finish_succeed", jSONObject, false, null, 60);
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) afS11S0310000_13.l2;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$1(AfS11S0310000_13 afS11S0310000_13, Object obj) {
        PrepareBattleResponse.ResponseData responseData;
        C76280Twi c76280Twi;
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse != null) {
            responseData = (PrepareBattleResponse.ResponseData) baseResponse.data;
        } else {
            responseData = null;
        }
        C76265TwT.LJIILL = responseData;
        C76279Twh c76279Twh = (C76279Twh) afS11S0310000_13.l0;
        c76279Twh.LJIIJ.post(new ARunnableS49S0100000_13(c76279Twh, 101));
        if (EnableSpecificGiftEntranceOptimizeSetting.INSTANCE.getValue()) {
            C76265TwT.LIZLLL();
        }
        C76279Twh c76279Twh2 = (C76279Twh) afS11S0310000_13.l0;
        InterfaceC76313TxF interfaceC76313TxF = (InterfaceC76313TxF) c76279Twh2.LIZLLL;
        if (interfaceC76313TxF != null) {
            boolean z = afS11S0310000_13.z3;
            interfaceC76313TxF.LJIIIIZZ(new AqS24S0310000_13(c76279Twh2, (EnumC76319TxL) afS11S0310000_13.l1, (InterfaceC88472Yns) afS11S0310000_13.l2, z, 0), new AqS68S0110000_13((C76279Twh) afS11S0310000_13.l0, afS11S0310000_13.z3, 2), z);
        }
        ((C76279Twh) afS11S0310000_13.l0).LJIILL = false;
        C76272Twa c76272Twa = C76272Twa.LIZ;
        boolean z2 = afS11S0310000_13.z3;
        JSONObject jSONObject = new JSONObject();
        C76272Twa.LJIJJ(jSONObject, z2);
        C76272Twa.LJIJ(jSONObject);
        if (z2) {
            c76280Twi = C76265TwT.LIZIZ;
        } else {
            c76280Twi = C76265TwT.LIZ;
        }
        c76272Twa.LJIILLIIL(jSONObject, c76280Twi);
        C05630Jz.LJI(jSONObject, "invite_type", String.valueOf(z2 ? 1 : 0));
        C05630Jz.LJFF(jSONObject, "cost", C30725C4b.LIZ() - C76272Twa.LJIILL);
        C76272Twa.LJJJLIIL(c76272Twa, "prepare_succeed", jSONObject, z2, null, 56);
    }

    public static final void accept$2(AfS11S0310000_13 afS11S0310000_13, Object obj) {
        Throwable th = (Throwable) obj;
        if (((C76279Twh) afS11S0310000_13.l0).LIZLLL == 0 || th == null) {
            C76324TxQ.LIZ = -1;
            return;
        }
        C0NB.LJIIIZ("TwoMatchViewAnchorPrese", "invite, failed");
        C76265TwT.LJIIIIZZ = -1L;
        if (C76324TxQ.LIZIZ() && (th instanceof C29401Dk) && ((C276516r) th).getErrorCode() == 4004049) {
            C76265TwT.LIZ.LJIILIIL = false;
            C76265TwT.LIZIZ.LJIILIIL = false;
            C76272Twa.LJJIZ("invite_each_other", th, afS11S0310000_13.z3);
            C76324TxQ.LIZ = -1;
            return;
        }
        C76324TxQ.LIZ = -1;
        C76272Twa.LJJIZ("normal", th, afS11S0310000_13.z3);
        if (th instanceof C29401Dk) {
            C29401Dk c29401Dk = (C29401Dk) th;
            if (!TextUtils.isEmpty(c29401Dk.getPrompt())) {
                C30868C9o.LJI(c29401Dk.getPrompt());
            } else {
                C30868C9o.LIZJ(R.string.mpi);
            }
            if (c29401Dk.getErrorCode() != 4004253 || !((C76279Twh) afS11S0310000_13.l0).LJIILLIIL) {
                ((C76280Twi) afS11S0310000_13.l1).LJIIIZ("invite_failed", afS11S0310000_13.z3);
            }
            ((C76279Twh) afS11S0310000_13.l0).LJIILLIIL = false;
            return;
        }
        ((C76280Twi) afS11S0310000_13.l1).LJIIIZ("invite_failed", afS11S0310000_13.z3);
        C30868C9o.LIZJ(R.string.sqr);
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) afS11S0310000_13.l2;
        if (interfaceC88472Yns == null) {
            return;
        }
        interfaceC88472Yns.invoke(Boolean.FALSE);
    }

    public AfS11S0310000_13(Object obj, Object obj2, Object obj3, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z3 = z;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
