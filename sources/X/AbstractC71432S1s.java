package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommercelive.common.data.DaInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.data.SellingItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.S1s, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC71432S1s<T extends ViewGroup> extends S2R<T, C71438S1y> {
    public static final java.util.Set<Integer> LJI = C77275UUl.LJIIIIZZ(4, 0);
    public final java.util.Map<String, String> LIZLLL;
    public final ArrayList<SellingItem> LJ;
    public InterfaceC71429S1p LJFF;

    public final void LJ() {
        java.util.Map<String, String> map;
        DaInfo daInfo;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        int childCount = ((ViewGroup) this.LIZ).getChildCount();
        int i = 0;
        int i2 = 0;
        while (true) {
            HashMap hashMap2 = null;
            if (i >= childCount || i >= this.LJ.size()) {
                break;
            }
            if (((ViewGroup) this.LIZ).getChildAt(i).getWidth() > 0) {
                SellingItem sellingItem = (SellingItem) ORZ.LJLLLLLL(i, this.LJ);
                if (sellingItem != null && (daInfo = sellingItem.daInfo) != null) {
                    String str = daInfo.extra;
                    if (str != null) {
                        try {
                            Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), str, C65330PkU.LIZJ(C65352Pkq.LJIIIIZZ(HashMap.class, C65340Pke.LIZ(C65352Pkq.LJI(String.class)), C65340Pke.LIZ(C65352Pkq.LJI(String.class)))));
                            if (!(fromJson instanceof HashMap)) {
                                fromJson = null;
                            }
                            hashMap2 = (HashMap) fromJson;
                        } catch (s unused) {
                        }
                        if (hashMap2 != null) {
                            for (Map.Entry entry : hashMap2.entrySet()) {
                                hashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                    }
                    String str2 = daInfo.name;
                    if (str2 != null) {
                        arrayList.add(str2);
                    }
                }
                i2++;
            }
            i++;
        }
        if (!hashMap.containsKey("sold_amt_type")) {
            hashMap.put("sold_amt_type", "no_volume");
        }
        java.util.Map<String, String> map2 = this.LIZLLL;
        if (map2 != null) {
            map2.put("selling_point_da_info", C27739Aud.LJI(hashMap));
            map2.put("sellingpoint_cnt", String.valueOf(i2));
        }
        if (arrayList.size() >= 1 && (map = this.LIZLLL) != null) {
            map.put("pos_selling_point", ORZ.LLD(arrayList, ",", null, null, null, 62));
        }
    }

    public final void LIZLLL(View view) {
        ((ViewGroup) this.LIZ).addView(view, new ViewGroup.MarginLayoutParams(-2, this.LJFF.getItemHeight()));
    }

    public AbstractC71432S1s(T t, java.util.Map<String, String> map) {
        super(t);
        this.LIZLLL = map;
        this.LJ = new ArrayList<>();
        this.LJFF = new C53614L2k();
    }
}
