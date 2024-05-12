package X;

import Y.ARunnableS23S0200000_4;
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
import kotlin.jvm.internal.AqS55S0201000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.Aop, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27379Aop implements InterfaceC27363AoZ {
    public final /* synthetic */ DistrictFragment LIZ;

    public C27379Aop(DistrictFragment districtFragment) {
        this.LIZ = districtFragment;
    }

    @Override // X.InterfaceC27363AoZ
    public final void onItemClick(int i) {
        C27356AoS<District> c27356AoS;
        DistrictPage districtPage;
        DistrictData districtData;
        List<District> list;
        String str;
        View childAt;
        DistrictData districtData2;
        List<District> list2;
        District district;
        List<C27356AoS<District>> list3 = this.LIZ.LJLLI;
        if (list3 == null || (c27356AoS = (C27356AoS) ORZ.LJLLLLLL(i, list3)) == null || !c27356AoS.LJ) {
            return;
        }
        this.LIZ.Gl(true);
        this.LIZ.Hl(false, false);
        DistrictFragment districtFragment = this.LIZ;
        districtFragment.LLD = true;
        districtFragment.LLF = c27356AoS;
        View view = districtFragment.getView();
        if (view != null) {
            C78946Uyc.LJJIIJ(view, new C70990Rta(), new AqS55S0201000_4(i, (int) this.LIZ, (DistrictFragment) c27356AoS, (C27356AoS<District>) 3));
        }
        ((ArrayList) this.LIZ.Al().LL).clear();
        District district2 = c27356AoS.LIZ;
        ArrayList arrayList = new ArrayList();
        District district3 = (District) ORZ.LJLLLLLL(0, this.LIZ.Al().LJLILLLLZI);
        if (district3 != null && (districtData2 = district3.response) != null && (list2 = districtData2.districts) != null && (district = (District) ORZ.LJLLLLLL(0, list2)) != null) {
            DistrictFragment districtFragment2 = this.LIZ;
            if (o.LJ(district.districtKey, "region")) {
                ListProtector.add(districtFragment2.Al().LL, 0, district);
                arrayList.add(new Region(district.name, district.geoNameId, district.code, null, district.longitude, district.latitude, 8, null));
            }
        }
        if (o.LJ(district2.hasNextLevel, Boolean.FALSE)) {
            List<District> list4 = district2.parRegions;
            if (list4 != null) {
                for (District district4 : list4) {
                    arrayList.add(new Region(district4.name, district4.geoNameId, district4.code, null, district4.longitude, district4.latitude, 8, null));
                }
            }
            arrayList.add(new Region(district2.name, district2.geoNameId, district2.code, null, district2.longitude, district2.latitude, 8, null));
            this.LIZ.xl().invoke(arrayList);
            return;
        }
        List<Fragment> LJJJJLI = this.LIZ.getChildFragmentManager().LJJJJLI();
        o.LJIIIIZZ(LJJJJLI, "childFragmentManager.fragments");
        Object LJLLJ = ORZ.LJLLJ(LJJJJLI);
        if (LJLLJ instanceof DistrictPage) {
            districtPage = (DistrictPage) LJLLJ;
        } else {
            districtPage = null;
        }
        List<District> list5 = district2.parRegions;
        if (list5 != null) {
            DistrictFragment districtFragment3 = this.LIZ;
            for (District district5 : list5) {
                district5.code = null;
                ((ArrayList) districtFragment3.Al().LL).add(district5);
            }
        }
        district2.code = null;
        ((ArrayList) this.LIZ.Al().LL).add(district2);
        if (districtPage != null) {
            this.LIZ.Al().getClass();
            C27570Aru.LJIIIIZZ(0, districtPage);
        }
        if (this.LIZ.Al().gv0().LJLJJI != 0) {
            this.LIZ.Al().LLF = true;
            this.LIZ.Al().gv0().submitList(C47261Igj.LJJIJIL(((District) ListProtector.get(this.LIZ.Al().LL, 0)).name));
            ViewGroup viewGroup = (ViewGroup) this.LIZ._$_findCachedViewById(R.id.kze);
            if (viewGroup != null && (childAt = viewGroup.getChildAt(0)) != null) {
                childAt.performClick();
            }
            this.LIZ.vl();
            return;
        }
        District district6 = (District) ORZ.LJLLLLLL(0, this.LIZ.Al().LJLILLLLZI);
        if (district6 == null || (districtData = district6.response) == null || (list = districtData.districts) == null) {
            return;
        }
        DistrictFragment districtFragment4 = this.LIZ;
        int i2 = 0;
        for (District district7 : list) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
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
                        _$_findCachedViewById.post(new ARunnableS23S0200000_4(districtFragment4, districtPage, 36));
                    }
                    districtPage.vl(i2);
                }
                i2 = i3;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
    }
}
