package X;

import Y.ARunnableS23S0200000_4;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictFragment;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictPage;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.District;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.DistrictData;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS15S0202000_4;
import kotlin.jvm.internal.AqS3S0101100_4;
import kotlin.jvm.internal.o;

/* renamed from: X.Aon, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27377Aon implements InterfaceC27359AoV<District> {
    public final /* synthetic */ DistrictFragment LJLIL;

    @Override // X.InterfaceC27359AoV
    public final void c7() {
    }

    public C27377Aon(DistrictFragment districtFragment) {
        this.LJLIL = districtFragment;
    }

    @Override // X.InterfaceC27359AoV
    public final void hg(int i) {
        DistrictFragment districtFragment = this.LJLIL;
        districtFragment.LLFF = false;
        if (districtFragment.LLFFF != 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            DistrictFragment districtFragment2 = this.LJLIL;
            long j = elapsedRealtime - districtFragment2.LLFFF;
            View view = districtFragment2.getView();
            if (view != null) {
                C78946Uyc.LJJIIJ(view, new C70991Rtb(), new AqS3S0101100_4(i, j, this.LJLIL, 1));
            }
            this.LJLIL.LLFFF = 0L;
        }
    }

    @Override // X.InterfaceC27359AoV
    public final void ke(C27356AoS<District> result, int i, int i2) {
        DistrictPage districtPage;
        DistrictData districtData;
        List<District> list;
        String str;
        View childAt;
        DistrictData districtData2;
        List<District> list2;
        District district;
        o.LJIIIZ(result, "result");
        DistrictFragment districtFragment = this.LJLIL;
        districtFragment.LLD = true;
        districtFragment.LLF = result;
        View view = districtFragment.getView();
        if (view != null) {
            C78946Uyc.LJJIIJ(view, new C70990Rta(), new AqS15S0202000_4(i, i2, (int) this.LJLIL, (DistrictFragment) result, (C27356AoS<District>) 2));
        }
        ((ArrayList) this.LJLIL.Al().LL).clear();
        District district2 = result.LIZ;
        ArrayList arrayList = new ArrayList();
        District district3 = (District) ORZ.LJLLLLLL(0, this.LJLIL.Al().LJLILLLLZI);
        if (district3 != null && (districtData2 = district3.response) != null && (list2 = districtData2.districts) != null && (district = (District) ORZ.LJLLLLLL(0, list2)) != null) {
            DistrictFragment districtFragment2 = this.LJLIL;
            if (o.LJ(district.districtKey, "region")) {
                ListProtector.add(districtFragment2.Al().LL, 0, district);
                arrayList.add(new Region(district.name, district.geoNameId, district.code, null, district.longitude, district.latitude, 8, null));
            }
        }
        if (o.LJ(district2.hasNextLevel, Boolean.FALSE)) {
            List<District> list3 = district2.parRegions;
            if (list3 != null) {
                for (District district4 : list3) {
                    arrayList.add(new Region(district4.name, district4.geoNameId, district4.code, null, district4.longitude, district4.latitude, 8, null));
                }
            }
            arrayList.add(new Region(district2.name, district2.geoNameId, district2.code, null, district2.longitude, district2.latitude, 8, null));
            this.LJLIL.xl().invoke(arrayList);
            return;
        }
        List<Fragment> LJJJJLI = this.LJLIL.getChildFragmentManager().LJJJJLI();
        o.LJIIIIZZ(LJJJJLI, "childFragmentManager.fragments");
        Object LJLLJ = ORZ.LJLLJ(LJJJJLI);
        if (LJLLJ instanceof DistrictPage) {
            districtPage = (DistrictPage) LJLLJ;
        } else {
            districtPage = null;
        }
        List<District> list4 = district2.parRegions;
        if (list4 != null) {
            DistrictFragment districtFragment3 = this.LJLIL;
            for (District district5 : list4) {
                district5.code = null;
                ((ArrayList) districtFragment3.Al().LL).add(district5);
            }
        }
        district2.code = null;
        ((ArrayList) this.LJLIL.Al().LL).add(district2);
        if (districtPage != null) {
            this.LJLIL.Al().getClass();
            C27570Aru.LJIIIIZZ(0, districtPage);
        }
        if (this.LJLIL.Al().gv0().LJLJJI != 0) {
            this.LJLIL.Al().LLF = true;
            this.LJLIL.Al().gv0().submitList(C47261Igj.LJJIJIL(((District) ListProtector.get(this.LJLIL.Al().LL, 0)).name));
            ViewGroup viewGroup = (ViewGroup) this.LJLIL._$_findCachedViewById(R.id.kze);
            if (viewGroup != null && (childAt = viewGroup.getChildAt(0)) != null) {
                childAt.performClick();
            }
            this.LJLIL.vl();
            return;
        }
        District district6 = (District) ORZ.LJLLLLLL(0, this.LJLIL.Al().LJLILLLLZI);
        if (district6 != null && (districtData = district6.response) != null && (list = districtData.districts) != null) {
            DistrictFragment districtFragment4 = this.LJLIL;
            int i3 = 0;
            for (District district7 : list) {
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    String str2 = district7.geoNameId;
                    District district8 = (District) ORZ.LJLLLLLL(0, districtFragment4.Al().LL);
                    if (district8 != null) {
                        str = district8.geoNameId;
                    } else {
                        str = null;
                    }
                    if (o.LJ(str2, str) && districtPage != null) {
                        View _$_findCachedViewById = districtPage._$_findCachedViewById(R.id.isf);
                        if (_$_findCachedViewById != null) {
                            _$_findCachedViewById.post(new ARunnableS23S0200000_4(districtFragment4, districtPage, 35));
                        }
                        districtPage.vl(i3);
                    }
                    i3 = i4;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
        this.LJLIL.vl();
    }
}
