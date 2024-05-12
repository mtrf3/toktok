package Y;

import X.C1JI;
import X.C66851QLn;
import X.C86804Y4y;
import android.text.Editable;
import com.ss.android.ugc.aweme.account.login.ui.CountryListSheetFragment;
import com.ss.android.ugc.aweme.account.login.ui.MusCountryListActivity;
import com.ss.android.ugc.aweme.share.SharePlatform;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class IDComparatorS340S0100000_7 implements Comparator {
    public final int $t;
    public Object l0;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return compare$0(this, obj, obj2);
            case 1:
                return compare$1(this, obj, obj2);
            case 2:
                return compare$2(this, obj, obj2);
            case 3:
                return compare$3(this, obj, obj2);
            default:
                return 0;
        }
    }

    public IDComparatorS340S0100000_7(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final int compare$0(IDComparatorS340S0100000_7 iDComparatorS340S0100000_7, Object obj, Object obj2) {
        Editable editable = (Editable) iDComparatorS340S0100000_7.l0;
        return editable.getSpanStart(obj) - editable.getSpanStart(obj2);
    }

    public static final int compare$1(IDComparatorS340S0100000_7 iDComparatorS340S0100000_7, Object obj, Object obj2) {
        List list = (List) iDComparatorS340S0100000_7.l0;
        String str = ((SharePlatform) obj).platformId;
        o.LJIIIIZZ(str, "it.platformId");
        Integer valueOf = Integer.valueOf(C1JI.LJI(str, list));
        List list2 = (List) iDComparatorS340S0100000_7.l0;
        String str2 = ((SharePlatform) obj2).platformId;
        o.LJIIIIZZ(str2, "it.platformId");
        return C66851QLn.LJFF(valueOf, Integer.valueOf(C1JI.LJI(str2, list2)));
    }

    public static final int compare$2(IDComparatorS340S0100000_7 iDComparatorS340S0100000_7, Object obj, Object obj2) {
        int i = ((C86804Y4y) obj).LJLIL;
        int i2 = ((C86804Y4y) obj2).LJLIL;
        String string = ((CountryListSheetFragment) iDComparatorS340S0100000_7.l0).getString(i);
        String string2 = ((CountryListSheetFragment) iDComparatorS340S0100000_7.l0).getString(i2);
        o.LJIIIIZZ(string2, "getString(nameRes2)");
        return string.compareTo(string2);
    }

    public static final int compare$3(IDComparatorS340S0100000_7 iDComparatorS340S0100000_7, Object obj, Object obj2) {
        MusCountryListActivity musCountryListActivity = (MusCountryListActivity) iDComparatorS340S0100000_7.l0;
        return musCountryListActivity.getResources().getString(((C86804Y4y) obj).LJLIL).compareTo(musCountryListActivity.getResources().getString(((C86804Y4y) obj2).LJLIL));
    }
}
