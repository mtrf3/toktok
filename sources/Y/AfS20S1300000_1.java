package Y;

import X.C227738wj;
import X.C26227ARb;
import X.C40680Fxs;
import X.C5S1;
import X.C68322mC;
import X.C78996UzQ;
import X.C793339l;
import X.C793439m;
import X.InterfaceC64592gB;
import X.InterfaceC88472Yns;
import X.UC0;
import X.V1B;
import X.X1D;
import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.donation.token.DonationTokenBean;
import com.ss.android.ugc.aweme.donation.token.DonationTokenResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.business.tcm.CheckTCMOrderDeleteStatusResp;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS105S0300000_1;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.AqS44S1200000_1;
import ujb.s;

/* loaded from: classes2.dex */
public class AfS20S1300000_1 implements InterfaceC64592gB {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS20S1300000_1 afS20S1300000_1, Object obj) {
        CheckTCMOrderDeleteStatusResp checkTCMOrderDeleteStatusResp = (CheckTCMOrderDeleteStatusResp) obj;
        int i = checkTCMOrderDeleteStatusResp.deleteStatus;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                    C26227ARb c26227ARb = new C26227ARb((Context) afS20S1300000_1.l2);
                    c26227ARb.LIZ(R.string.egi);
                    UC0.LIZJ(c26227ARb, new AqS167S0100000_1(checkTCMOrderDeleteStatusResp, 306));
                    c26227ARb.LJI().LIZLLL();
                    return;
                }
                C26227ARb c26227ARb2 = new C26227ARb((Context) afS20S1300000_1.l2);
                c26227ARb2.LIZ(R.string.egb);
                UC0.LIZJ(c26227ARb2, new AqS167S0100000_1(checkTCMOrderDeleteStatusResp, 304));
                c26227ARb2.LJI().LIZLLL();
                return;
            }
            C26227ARb c26227ARb3 = new C26227ARb((Context) afS20S1300000_1.l2);
            c26227ARb3.LIZ(R.string.egj);
            C793439m c793439m = (C793439m) afS20S1300000_1.l3;
            UC0.LIZJ(c26227ARb3, new AqS105S0300000_1((Context) afS20S1300000_1.l2, (Aweme) afS20S1300000_1.l1, c793439m, 10));
            c26227ARb3.LJI().LIZLLL();
            return;
        }
        if (C793339l.LIZ((Aweme) afS20S1300000_1.l1) && C78996UzQ.LJJIIZI((Aweme) afS20S1300000_1.l1)) {
            C26227ARb c26227ARb4 = new C26227ARb((Context) afS20S1300000_1.l2);
            c26227ARb4.LIZ(R.string.efn);
            UC0.LIZJ(c26227ARb4, new AqS44S1200000_1((C793439m) afS20S1300000_1.l3, (Aweme) afS20S1300000_1.l1, afS20S1300000_1.s0, 2));
            c26227ARb4.LJI().LIZLLL();
            return;
        }
        C227738wj.LJFF((Aweme) afS20S1300000_1.l1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$1(AfS20S1300000_1 afS20S1300000_1, Object obj) {
        String str;
        String str2;
        DonationTokenResponse donationTokenResponse = (DonationTokenResponse) obj;
        Dialog dialog = (Dialog) ((C68322mC) afS20S1300000_1.l1).element;
        if (dialog != null) {
            V1B.LJLILLLLZI(dialog);
        }
        if (donationTokenResponse.status_code == 0) {
            DonationTokenBean data = donationTokenResponse.getData();
            String str3 = null;
            if (data != null) {
                str = data.getToken();
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("callback invoke: ");
                DonationTokenBean data2 = donationTokenResponse.getData();
                if (data2 != null) {
                    str2 = data2.getToken();
                } else {
                    str2 = null;
                }
                LIZ.append(str2);
                X1D.LIZIZ(LIZ);
                InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) afS20S1300000_1.l2;
                String str4 = afS20S1300000_1.s0;
                DonationTokenBean data3 = donationTokenResponse.getData();
                if (data3 != null) {
                    str3 = data3.getToken();
                }
                if (str4 != null && C40680Fxs.LIZIZ(str4) && !TextUtils.isEmpty(str3)) {
                    StringBuilder sb = new StringBuilder(str4);
                    if (!s.LJJJLZIJ(str4, "?", false)) {
                        sb.append("?");
                    } else {
                        sb.append("&");
                    }
                    sb.append(str3);
                    str4 = sb.toString();
                }
                interfaceC88472Yns.invoke(str4);
                return;
            }
        }
        Context context = (Context) afS20S1300000_1.l3;
        if (context == null) {
            return;
        }
        C5S1 c5s1 = new C5S1(context);
        c5s1.LIZLLL(context.getString(R.string.pei));
        c5s1.LJ();
    }

    public AfS20S1300000_1(Object obj, Object obj2, Object obj3, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.l3 = obj3;
        this.s0 = str;
    }
}
