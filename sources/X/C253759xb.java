package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.compliance.consent.countrylist.service.RegionListAPI;
import com.zhiliaoapp.musically.R;
import java.util.List;
import yq4.a;

/* renamed from: X.9xb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C253759xb extends AbstractC029409q<C253769xc> {
    public final List<RegionListAPI.Country> LJLIL;
    public final int LJLILLLLZI = R.layout.ag_;
    public Context LJLJI;
    public C78432UqK LJLJJI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.size();
    }

    public C253759xb(List list) {
        this.LJLIL = list;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C253769xc c253769xc, int i) {
        C253769xc c253769xc2 = c253769xc;
        RegionListAPI.Country country = (RegionListAPI.Country) ListProtector.get(this.LJLIL, i);
        int i2 = 1;
        if (country.countryCode.equals(this.LJLJI.getString(R.string.pyl))) {
            c253769xc2.LJLIL.setVisibility(0);
            c253769xc2.LJLIL.setText(this.LJLJI.getString(R.string.pyl));
        } else if (i == 1 && TextUtils.equals(((RegionListAPI.Country) ListProtector.get(this.LJLIL, 0)).countryCode, this.LJLJI.getString(R.string.pyl))) {
            c253769xc2.LJLIL.setVisibility(0);
            c253769xc2.LJLIL.setText(country.countryName.substring(0, 1));
        } else {
            String substring = country.countryName.substring(0, 1);
            if (i == 0 || !TextUtils.equals(((RegionListAPI.Country) ListProtector.get(this.LJLIL, i - 1)).countryName.substring(0, 1), substring)) {
                c253769xc2.LJLIL.setVisibility(0);
                c253769xc2.LJLIL.setText(substring);
            } else {
                c253769xc2.LJLIL.setVisibility(8);
            }
        }
        if (!TextUtils.isEmpty(country.countryName)) {
            c253769xc2.LJLILLLLZI.setText(country.countryName);
        } else if (this.LJLJI != null && !TextUtils.isEmpty(country.countryName)) {
            c253769xc2.LJLILLLLZI.setText(country.countryName);
        }
        if (country.countryCode.equalsIgnoreCase(a.LIZIZ().LJIILL())) {
            c253769xc2.LJLJI.setVisibility(0);
        } else {
            c253769xc2.LJLJI.setVisibility(4);
        }
        if (country.countryCode.equals(this.LJLJI.getString(R.string.pyl))) {
            c253769xc2.LJLJI.setVisibility(0);
        }
        C16880lQ.LJIIJ(new C14B(i2, this, country), c253769xc2.itemView);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C253769xc com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        View LLLZIIL = C16880lQ.LLLZIIL(this.LJLILLLLZI, C16880lQ.LLZIL(viewGroup.getContext()), null);
        this.LJLJI = viewGroup.getContext();
        C253769xc c253769xc = new C253769xc(LLLZIIL);
        C0AX.LIZ(viewGroup, c253769xc.itemView, R.id.lj7);
        View view = c253769xc.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c253769xc.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C253769xc.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c253769xc.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c253769xc.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C253769xc.class.getName();
        return c253769xc;
    }
}
