package Y;

import X.AFJ;
import X.C38306F1q;
import X.C61878OQg;
import X.InterfaceC64592gB;
import X.ORZ;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.compliance.business.banappeal.ComplianceBusinessActivityAssem;
import com.ss.android.ugc.aweme.kids.discovery.list.DiscoverViewModel;
import com.ss.android.ugc.aweme.kids.discovery.model.Category;
import com.ss.android.ugc.aweme.kids.discovery.model.CategoryList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public class AfS6S0100100_10 implements InterfaceC64592gB {
    public final int $t;
    public long j1;
    public Object l0;

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
            case 3:
                accept$3(this, obj);
                return;
            case 4:
                accept$4(this, obj);
                return;
            case 5:
                accept$5(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS6S0100100_10 afS6S0100100_10, Object obj) {
        boolean z;
        CategoryList categoryList = (CategoryList) obj;
        ArrayList arrayList = new ArrayList();
        List<Category> value = ((DiscoverViewModel) afS6S0100100_10.l0).LJLJJLL.getValue();
        if (value != null) {
            arrayList.addAll(value);
        }
        List list = categoryList.items;
        if (list == null) {
            list = C61878OQg.INSTANCE;
        }
        DiscoverViewModel discoverViewModel = (DiscoverViewModel) afS6S0100100_10.l0;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            z = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (true ^ discoverViewModel.gv0((Category) next)) {
                arrayList2.add(next);
            }
        }
        arrayList.addAll(arrayList2);
        ((DiscoverViewModel) afS6S0100100_10.l0).LJLJJLL.postValue(arrayList);
        ((DiscoverViewModel) afS6S0100100_10.l0).LJLJJL.postValue(Boolean.TRUE);
        MutableLiveData<Boolean> mutableLiveData = ((DiscoverViewModel) afS6S0100100_10.l0).LJLJI;
        if (categoryList.hasMore != 1) {
            z = false;
        }
        mutableLiveData.postValue(Boolean.valueOf(z));
        ((DiscoverViewModel) afS6S0100100_10.l0).LJLJL = categoryList.cursor;
        AFJ.LIZ(2, 0, afS6S0100100_10.j1, "kids_api_category_list");
    }

    public static final void accept$1(AfS6S0100100_10 afS6S0100100_10, Object obj) {
        ((DiscoverViewModel) afS6S0100100_10.l0).LJLJJL.postValue(Boolean.FALSE);
        AFJ.LIZ(2, -1, afS6S0100100_10.j1, "kids_api_category_list");
    }

    public static final void accept$2(AfS6S0100100_10 afS6S0100100_10, Object obj) {
        ComplianceBusinessActivityAssem complianceBusinessActivityAssem = (ComplianceBusinessActivityAssem) afS6S0100100_10.l0;
        long currentTimeMillis = System.currentTimeMillis() - afS6S0100100_10.j1;
        int i = ((BaseResponse) obj).status_code;
        complianceBusinessActivityAssem.getClass();
        ComplianceBusinessActivityAssem.A3(0, i, currentTimeMillis);
    }

    public static final void accept$3(AfS6S0100100_10 afS6S0100100_10, Object obj) {
        int i;
        Throwable th = (Throwable) obj;
        ComplianceBusinessActivityAssem complianceBusinessActivityAssem = (ComplianceBusinessActivityAssem) afS6S0100100_10.l0;
        long currentTimeMillis = System.currentTimeMillis() - afS6S0100100_10.j1;
        if (th instanceof C38306F1q) {
            i = ((C38306F1q) th).getErrorCode();
        } else {
            i = -1;
        }
        complianceBusinessActivityAssem.getClass();
        ComplianceBusinessActivityAssem.A3(1, i, currentTimeMillis);
    }

    public static final void accept$4(AfS6S0100100_10 afS6S0100100_10, Object obj) {
        boolean z;
        CategoryList categoryList = (CategoryList) obj;
        DiscoverViewModel discoverViewModel = (DiscoverViewModel) afS6S0100100_10.l0;
        MutableLiveData<List<Category>> mutableLiveData = discoverViewModel.LJLJJLL;
        List list = categoryList.items;
        if (list == null) {
            list = C61878OQg.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (true ^ discoverViewModel.gv0((Category) obj2)) {
                arrayList.add(obj2);
            }
        }
        mutableLiveData.postValue(ORZ.LLJILJILJ(arrayList));
        ((DiscoverViewModel) afS6S0100100_10.l0).LJLJJI.postValue(Boolean.TRUE);
        MutableLiveData<Boolean> mutableLiveData2 = ((DiscoverViewModel) afS6S0100100_10.l0).LJLJI;
        if (categoryList.hasMore == 1) {
            z = true;
        } else {
            z = false;
        }
        mutableLiveData2.postValue(Boolean.valueOf(z));
        ((DiscoverViewModel) afS6S0100100_10.l0).LJLJL = categoryList.cursor;
        AFJ.LIZ(1, 0, afS6S0100100_10.j1, "kids_api_category_list");
    }

    public static final void accept$5(AfS6S0100100_10 afS6S0100100_10, Object obj) {
        ((DiscoverViewModel) afS6S0100100_10.l0).LJLJJI.postValue(Boolean.FALSE);
        AFJ.LIZ(1, -1, afS6S0100100_10.j1, "kids_api_category_list");
    }

    public AfS6S0100100_10(Object obj, long j, int i) {
        this.$t = i;
        this.l0 = obj;
        this.j1 = j;
    }
}
