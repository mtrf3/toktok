package X;

import android.os.SystemClock;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictFragment;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.District;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.SearchDistrictRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS2S2100100_4;
import kotlin.jvm.internal.o;

/* renamed from: X.Aof, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27369Aof implements InterfaceC27330Ao2 {
    public final /* synthetic */ DistrictFragment LJLIL;

    @Override // X.InterfaceC27330Ao2
    public final void LJIIZILJ() {
    }

    public C27369Aof(DistrictFragment districtFragment) {
        this.LJLIL = districtFragment;
    }

    @Override // X.InterfaceC27330Ao2
    public final void Rb(String str) {
        List list;
        List<District> list2 = this.LJLIL.Al().LJLILLLLZI;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list2, 10));
        Iterator it = ((ArrayList) list2).iterator();
        while (it.hasNext()) {
            String str2 = ((District) it.next()).geoNameId;
            if (str2 == null) {
                str2 = "";
            }
            arrayList.add(str2);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (((String) next).length() > 0) {
                arrayList2.add(next);
            }
        }
        Object LJLLLLLL = ORZ.LJLLLLLL(0, arrayList2);
        if (LJLLLLLL != null) {
            list = C47261Igj.LJJIJ(LJLLLLLL);
        } else {
            list = C61878OQg.INSTANCE;
        }
        SearchDistrictRequest searchDistrictRequest = new SearchDistrictRequest(1, list, str);
        DistrictFragment districtFragment = this.LJLIL;
        C78565UsT.LJJIJIIJIL(districtFragment, new C27368Aoe(searchDistrictRequest, districtFragment, str, null));
    }

    @Override // X.InterfaceC27330Ao2
    public final void eh(View view, String str, boolean z) {
        int i;
        String str2;
        o.LJIIIZ(view, "view");
        int i2 = 0;
        if (z) {
            DistrictFragment districtFragment = this.LJLIL;
            if (str != null) {
                i2 = str.length();
            }
            districtFragment.LL = i2;
            this.LJLIL.LJZL = SystemClock.elapsedRealtime();
            C78946Uyc.LJJIIJ(view, new C70929Rsb(), new AqS170S0100000_4(this.LJLIL, 1250));
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        DistrictFragment districtFragment2 = this.LJLIL;
        long j = elapsedRealtime - districtFragment2.LJZL;
        if (str != null) {
            i = str.length();
        } else {
            i = -districtFragment2.LL;
        }
        if (i > 0) {
            str2 = "add";
        } else if (i < 0) {
            str2 = "del";
        } else {
            str2 = "";
        }
        C78946Uyc.LJJIIJ(view, new C70930Rsc(), new AqS2S2100100_4(j, str2, str, this.LJLIL, 0));
        this.LJLIL.LLD = false;
    }
}
