package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.commercialize.model.AdTagStruct;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class N0D {
    public static final void LIZ(AwemeRawAd awemeRawAd, int i, int i2) {
        List<AdTagStruct> adTags;
        int i3;
        boolean add;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (awemeRawAd != null && (adTags = awemeRawAd.getAdTags()) != null) {
            ArrayList arrayList3 = new ArrayList();
            Iterator<AdTagStruct> it = adTags.iterator();
            while (true) {
                i3 = 0;
                if (!it.hasNext()) {
                    break;
                }
                AdTagStruct next = it.next();
                if (next.getPosition() == i) {
                    arrayList3.add(next);
                }
            }
            ArrayList arrayList4 = new ArrayList(C32I.LJJL(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                AdTagStruct adTagStruct = (AdTagStruct) it2.next();
                if (!TextUtils.isEmpty(adTagStruct.getTagText())) {
                    int i4 = i3 + 1;
                    if (i3 < i2) {
                        add = arrayList.add(adTagStruct.getType());
                        i3 = i4;
                        arrayList4.add(Boolean.valueOf(add));
                    } else {
                        i3 = i4;
                    }
                }
                add = arrayList2.add(adTagStruct.getType());
                arrayList4.add(Boolean.valueOf(add));
            }
        }
        C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "othershow", awemeRawAd);
        LIZLLL.LIZJ("tag", "refer");
        HashMap hashMap = new HashMap();
        hashMap.put("tag_position", Integer.valueOf(i));
        hashMap.put("success_type_list", ORZ.LLD(arrayList, ",", null, null, null, 62));
        hashMap.put("fail_type_list", ORZ.LLD(arrayList2, ",", null, null, null, 62));
        LIZLLL.LIZ(hashMap);
        LIZLLL.LJI();
    }
}
