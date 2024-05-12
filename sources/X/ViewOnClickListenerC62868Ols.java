package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.ss.android.ugc.aweme.donation.DonateResponse;
import com.ss.android.ugc.aweme.donation.NgoStruct;
import com.ss.android.ugc.aweme.donation.detail.DonationFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS176S0100000_10;
import org.json.JSONObject;

/* renamed from: X.Ols, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class ViewOnClickListenerC62868Ols implements View.OnClickListener {
    public final /* synthetic */ View LJLIL;
    public final /* synthetic */ DonationFragment LJLILLLLZI;
    public final /* synthetic */ Context LJLJI;
    public final /* synthetic */ C68322mC<String> LJLJJI;
    public final /* synthetic */ C76732zl LJLJJL;
    public final /* synthetic */ JSONObject LJLJJLL;

    public ViewOnClickListenerC62868Ols(View view, DonationFragment donationFragment, Context context, C68322mC<String> c68322mC, C76732zl c76732zl, JSONObject jSONObject) {
        this.LJLIL = view;
        this.LJLILLLLZI = donationFragment;
        this.LJLJI = context;
        this.LJLJJI = c68322mC;
        this.LJLJJL = c76732zl;
        this.LJLJJLL = jSONObject;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        String Al;
        String str2;
        String str3;
        String str4;
        NgoStruct ngoStruct;
        if (C6ZT.LIZ(this.LJLIL)) {
            return;
        }
        NgoStruct ngoStruct2 = ((DonateResponse) this.LJLILLLLZI.LJLIL.LJLIL.getData()).ngo;
        String str5 = null;
        if (ngoStruct2 != null) {
            str = ngoStruct2.donationLink;
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str) && ((ngoStruct = ((DonateResponse) this.LJLILLLLZI.LJLIL.LJLIL.getData()).ngo) == null || ngoStruct.orgId == null)) {
            C26045AKb c26045AKb = new C26045AKb(this.LJLILLLLZI);
            c26045AKb.LJIIIZ(this.LJLJI.getString(R.string.ex5));
            c26045AKb.LJIIJ();
            return;
        }
        C188727au c188727au = new C188727au();
        String vl = this.LJLILLLLZI.vl();
        String str6 = "";
        if (vl == null) {
            vl = "";
        }
        c188727au.LJIIIZ("group_id", vl);
        Aweme aweme = this.LJLILLLLZI.getAweme();
        if ((aweme != null && (Al = aweme.getAuthorUid()) != null) || (Al = this.LJLILLLLZI.Al()) != null) {
            str6 = Al;
        }
        c188727au.LJIIIZ("author_id", str6);
        NgoStruct ngoStruct3 = ((DonateResponse) this.LJLILLLLZI.LJLIL.LJLIL.getData()).ngo;
        if (ngoStruct3 != null) {
            str2 = ngoStruct3.donationLink;
        } else {
            str2 = null;
        }
        c188727au.LJIIIZ("link", str2);
        c188727au.LJIIIZ("link_type", "nonprofit");
        c188727au.LJIIIZ("enter_from", this.LJLILLLLZI.getEnterFrom());
        c188727au.LJIIIZ("enter_method", this.LJLILLLLZI.LJLJI);
        c188727au.LJIIIZ("log_pb", (String) this.LJLILLLLZI.LJLJJI.getValue());
        NgoStruct ngoStruct4 = ((DonateResponse) this.LJLILLLLZI.LJLIL.LJLIL.getData()).ngo;
        if (ngoStruct4 != null) {
            str3 = ngoStruct4.ngoName;
        } else {
            str3 = null;
        }
        c188727au.LJIIIZ("ngo_name", str3);
        c188727au.LJIIIZ("powered_by", (String) this.LJLILLLLZI.LJLJLLL.getValue());
        c188727au.LJIIIZ("anchor_type", (String) this.LJLILLLLZI.LJLLL.getValue());
        FMX.LJIIL("donation_panel_donate_click", c188727au.LIZ);
        DonationFragment donationFragment = this.LJLILLLLZI;
        if (!donationFragment.LJLLLLLL) {
            donationFragment.LJLLLLLL = true;
        }
        donationFragment.getClass();
        if (this.LJLJJI.element != null && this.LJLJJL.element > 0) {
            String str7 = ((C62869Olt) this.LJLILLLLZI.LJLIL.LJLIL).LJLJJI;
            if (str7 != null && TextUtils.equals(str7, "PERCENT")) {
                str4 = "PERCENT";
            } else {
                str4 = "TILTIFY";
            }
            if (TextUtils.equals(str4, "PERCENT")) {
                NgoStruct ngoStruct5 = ((DonateResponse) this.LJLILLLLZI.LJLIL.LJLIL.getData()).ngo;
                if (ngoStruct5 != null) {
                    str5 = ngoStruct5.orgId;
                }
            } else {
                NgoStruct ngoStruct6 = ((DonateResponse) this.LJLILLLLZI.LJLIL.LJLIL.getData()).ngo;
                if (ngoStruct6 != null) {
                    str5 = ngoStruct6.donationLink;
                }
            }
            C3AP.LIZ(this.LJLILLLLZI.mo49getActivity(), this.LJLJJI.element, this.LJLJJL.element, str5, str4, this.LJLJJLL.toString(), null, new AqS176S0100000_10(this.LJLILLLLZI, 43));
        }
    }
}
