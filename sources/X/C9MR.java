package X;

import com.bytedance.touchpoint.core.model.TextLink;
import com.bytedance.touchpoint.core.model.TouchPoint;
import com.bytedance.touchpoint.core.textlink.TextLinkViewModel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.9MR, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9MR {
    public static void LIZ(List textLinkTouchPointList) {
        int i;
        o.LJIIIZ(textLinkTouchPointList, "textLinkTouchPointList");
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((ArrayList) textLinkTouchPointList).iterator();
            while (it.hasNext()) {
                TouchPoint touchPoint = (TouchPoint) it.next();
                if (touchPoint != null) {
                    TextLink textLink = (TextLink) C62819Ol5.LJIIL(touchPoint.data, TextLink.class);
                    if (textLink != null) {
                        textLink.LIZ = touchPoint.touchPointId;
                        textLink.LIZ(touchPoint.touchPointName);
                        Integer num = touchPoint.launchPlanId;
                        if (num != null) {
                            i = num.intValue();
                        } else {
                            i = -1;
                        }
                        textLink.LIZJ = Integer.valueOf(i);
                        String str = touchPoint.abVersions;
                        if (str == null) {
                            str = "";
                        }
                        textLink.LIZLLL = str;
                        HashSet hashSet = new HashSet();
                        List<String> list = textLink.videoIds;
                        if (list != null) {
                            hashSet.addAll(list);
                        }
                        textLink.LJII = hashSet;
                        HashSet hashSet2 = new HashSet();
                        List<String> list2 = textLink.hashtagIds;
                        if (list2 != null) {
                            hashSet2.addAll(list2);
                        }
                        textLink.LJI = hashSet2;
                    }
                    o.LJIIIIZZ(textLink, "textLink");
                    arrayList.add(textLink);
                }
            }
            C2MW.LIZ().LJI.put(5, arrayList);
            C246049lA c246049lA = C246049lA.LJLILLLLZI;
            ((TextLinkViewModel) new C214378bB(C65352Pkq.LIZ(TextLinkViewModel.class), null, C214528bQ.LJLIL, C78926UyI.LJJII(c246049lA, false), C184077Kh.LJLIL, C9MS.INSTANCE, null, null).getValue()).setState(C9OY.LJLIL);
        } catch (Exception unused) {
        }
    }
}
