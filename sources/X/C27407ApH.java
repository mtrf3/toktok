package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictPage;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.District;
import java.util.List;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.ApH, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27407ApH extends C0A6 {
    public final /* synthetic */ DistrictPage LJLIL;
    public final /* synthetic */ C27415ApP LJLILLLLZI;

    public C27407ApH(DistrictPage districtPage, C27415ApP c27415ApP) {
        this.LJLIL = districtPage;
        this.LJLILLLLZI = c27415ApP;
    }

    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        InterfaceC71003Rtn interfaceC71003Rtn;
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i == 0) {
            DistrictPage districtPage = this.LJLIL;
            districtPage.LJLJJLL = false;
            InterfaceC36571c5 parentFragment = districtPage.getParentFragment();
            if ((parentFragment instanceof InterfaceC71003Rtn) && (interfaceC71003Rtn = (InterfaceC71003Rtn) parentFragment) != null) {
                C78946Uyc.LJJII(interfaceC71003Rtn, new C70992Rtc(), new AqS170S0100000_4(this.LJLIL, 339));
            }
        }
    }

    @Override // X.C0A6
    public final void LJIILL(RecyclerView recyclerView, int i, int i2) {
        boolean z;
        int LLILL;
        String str;
        o.LJIIIZ(recyclerView, "recyclerView");
        DistrictPage districtPage = this.LJLIL;
        if (i2 < 0) {
            z = true;
        } else {
            z = false;
        }
        districtPage.LJLJL = z;
        if (districtPage.LJLJJLL) {
            return;
        }
        C0A2 layoutManager = recyclerView.getLayoutManager();
        if ((layoutManager instanceof LinearLayoutManager) && (LLILL = ((LinearLayoutManager) layoutManager).LLILL()) >= 0) {
            List<District> currentList = this.LJLILLLLZI.getCurrentList();
            o.LJIIIIZZ(currentList, "adapter.currentList");
            District district = (District) ORZ.LJLLLLLL(LLILL, currentList);
            if (district != null && (str = district.index) != null && (!o.LJ(str, this.LJLIL.LJLJJL))) {
                this.LJLIL.LJLJJI.LJZI(str);
            }
        }
    }
}
