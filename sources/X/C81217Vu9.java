package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.compliance.consent.countrylist.MusCountryListActivity;
import com.ss.android.ugc.aweme.compliance.consent.countrylist.service.RegionListAPI;

/* renamed from: X.Vu9, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* synthetic */ class C81217Vu9 implements InterfaceC81216Vu8 {
    public final /* synthetic */ MusCountryListActivity LIZ;

    public final void LIZ(String str) {
        MusCountryListActivity musCountryListActivity = this.LIZ;
        for (int i = 0; i < musCountryListActivity.LJLJI.size(); i++) {
            if (((RegionListAPI.Country) ListProtector.get(musCountryListActivity.LJLJI, i)).countryName.startsWith(str)) {
                ((LinearLayoutManager) musCountryListActivity.LJLIL.getLayoutManager()).LJFF(i, 0);
                return;
            }
        }
    }
}
