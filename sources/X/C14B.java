package X;

import android.view.View;
import com.bytedance.android.live.design.app.LiveDialog;
import com.ss.android.ugc.aweme.compliance.consent.countrylist.MusCountryListActivity;
import com.ss.android.ugc.aweme.compliance.consent.countrylist.service.RegionListAPI;
import yq4.a;

/* renamed from: X.14B, reason: invalid class name */
/* loaded from: classes.dex */
public final /* synthetic */ class C14B implements View.OnClickListener {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ Object LJLJI;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.LJLIL) {
            case 0:
                LiveDialog liveDialog = (LiveDialog) this.LJLILLLLZI;
                AnonymousClass174 anonymousClass174 = (AnonymousClass174) this.LJLJI;
                liveDialog.getClass();
                anonymousClass174.LIZJ.LJIILLIIL(liveDialog);
                return;
            default:
                C253759xb c253759xb = (C253759xb) this.LJLILLLLZI;
                RegionListAPI.Country country = (RegionListAPI.Country) this.LJLJI;
                C78432UqK c78432UqK = c253759xb.LJLJJI;
                if (c78432UqK != null) {
                    KMV kmv = (KMV) c78432UqK.LIZ;
                    kmv.getClass();
                    if (country != null) {
                        if (MusCountryListActivity.LJLL != null) {
                            C198517qh c198517qh = new C198517qh();
                            c198517qh.LIZ.put("enter_from", "signup_login_page");
                            c198517qh.LIZ.put("origin_region", a.LIZIZ().LJIILL());
                            c198517qh.LIZ.put("region_selected", country.countryCode);
                            FMX.LJIILJJIL("select_account_region", c198517qh.LJ());
                            MusCountryListActivity.LJLL.onChanged(country.countryCode, country.countryName);
                        }
                        kmv.onBackPressed();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public /* synthetic */ C14B(int i, Object obj, Object obj2) {
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
        this.LJLJI = obj2;
    }
}
