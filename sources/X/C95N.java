package X;

import com.bytedance.touchpoint.core.model.ReferralFeedBanner;
import com.bytedance.touchpoint.core.model.TouchPoint;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.95N, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C95N implements C94Y {
    public final List<Integer> LIZ = C47261Igj.LJJIJIIJI(8, 17, 18, 22, 28);

    @Override // X.C94Y
    public final void LIZ(HashMap<Integer, TouchPoint> touchPointsMap) {
        String str;
        int i;
        o.LJIIIZ(touchPointsMap, "touchPointsMap");
        try {
            List<Integer> list = this.LIZ;
            ArrayList arrayList = new ArrayList();
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                TouchPoint touchPoint = touchPointsMap.get(Integer.valueOf(it.next().intValue()));
                if (touchPoint != null) {
                    arrayList.add(touchPoint);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                TouchPoint touchPoint2 = (TouchPoint) it2.next();
                ReferralFeedBanner referralFeedBanner = (ReferralFeedBanner) C62819Ol5.LJIIL(touchPoint2.data, ReferralFeedBanner.class);
                if (referralFeedBanner != null) {
                    referralFeedBanner.LIZ = touchPoint2.touchPointId;
                    referralFeedBanner.LIZ(touchPoint2.touchPointName);
                    Integer num = touchPoint2.launchPlanId;
                    if (num != null) {
                        i = num.intValue();
                    } else {
                        i = -1;
                    }
                    referralFeedBanner.LIZJ = Integer.valueOf(i);
                    String str2 = touchPoint2.abVersions;
                    if (str2 == null) {
                        str2 = "";
                    }
                    referralFeedBanner.LIZLLL = str2;
                }
                C2MW.LIZ().LIZ(touchPoint2.touchPointId, referralFeedBanner);
                int i2 = touchPoint2.touchPointId;
                if (i2 == 8 || i2 == 28) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    AbstractC247499nV abstractC247499nV = (AbstractC247499nV) C95J.LIZ(0);
                    String str3 = null;
                    if (abstractC247499nV != null) {
                        str = abstractC247499nV.LJIIJ();
                    } else {
                        str = null;
                    }
                    linkedHashMap.put("region", str);
                    if (referralFeedBanner != null) {
                        str3 = referralFeedBanner.notificationName;
                    }
                    linkedHashMap.put("activity_name", str3);
                    InterfaceC247459nR interfaceC247459nR = C95J.LIZ;
                    if (interfaceC247459nR != null) {
                        interfaceC247459nR.LIZIZ("receive_activation_video", linkedHashMap);
                    }
                }
            }
        } catch (Exception unused) {
        }
    }
}
