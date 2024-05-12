package X;

import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.tiktok.ConvertHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AQY {
    public static final IAccountUserService LIZ = HG3.LJIILL();
    public static final C5H3 LIZIZ = C221108m2.LIZ(EnumC221088m0.SYNCHRONIZED, C26209AQj.LJLIL);

    public static InterfaceC26200AQa LIZJ() {
        return (InterfaceC26200AQa) LIZIZ.getValue();
    }

    public static List LIZ() {
        InterfaceC26200AQa LIZJ = LIZJ();
        String curSecUserId = LIZ.getCurSecUserId();
        if (curSecUserId == null) {
            return C61878OQg.INSTANCE;
        }
        AQV.LJLIL.getClass();
        return LIZJ.LIZJ(AQV.LJLJI, curSecUserId);
    }

    public static int LIZIZ() {
        InterfaceC26200AQa LIZJ = LIZJ();
        String curSecUserId = LIZ.getCurSecUserId();
        if (curSecUserId == null) {
            return 0;
        }
        AQV.LJLIL.getClass();
        return LIZJ.LJII(AQV.LJLJI, curSecUserId);
    }

    public static Object LJ() {
        InterfaceC26200AQa LIZJ = LIZJ();
        String curSecUserId = LIZ.getCurSecUserId();
        if (curSecUserId == null) {
            return C61878OQg.INSTANCE;
        }
        AQV.LJLIL.getClass();
        List LIZIZ2 = LIZJ.LIZIZ(AQV.LJLJI, curSecUserId);
        ArrayList arrayList = new ArrayList();
        Iterator it = LIZIZ2.iterator();
        while (it.hasNext()) {
            Aweme com$ss$ugc$aweme$proto$AwemeStructV2$$com$ss$android$ugc$aweme$feed$model$Aweme = ConvertHelper.com$ss$ugc$aweme$proto$AwemeStructV2$$com$ss$android$ugc$aweme$feed$model$Aweme(((C87526YWs) it.next()).LJLJI, null);
            if (com$ss$ugc$aweme$proto$AwemeStructV2$$com$ss$android$ugc$aweme$feed$model$Aweme != null) {
                arrayList.add(com$ss$ugc$aweme$proto$AwemeStructV2$$com$ss$android$ugc$aweme$feed$model$Aweme);
            }
        }
        return arrayList;
    }

    public static Object LJFF() {
        InterfaceC26200AQa LIZJ = LIZJ();
        String curSecUserId = LIZ.getCurSecUserId();
        if (curSecUserId == null) {
            return C61878OQg.INSTANCE;
        }
        AQV.LJLIL.getClass();
        List LJIILIIL = LIZJ.LJIILIIL(AQV.LJLJI, curSecUserId);
        ArrayList arrayList = new ArrayList();
        Iterator it = LJIILIIL.iterator();
        while (it.hasNext()) {
            Aweme com$ss$ugc$aweme$proto$AwemeStructV2$$com$ss$android$ugc$aweme$feed$model$Aweme = ConvertHelper.com$ss$ugc$aweme$proto$AwemeStructV2$$com$ss$android$ugc$aweme$feed$model$Aweme(((C87526YWs) it.next()).LJLJI, null);
            if (com$ss$ugc$aweme$proto$AwemeStructV2$$com$ss$android$ugc$aweme$feed$model$Aweme != null) {
                arrayList.add(com$ss$ugc$aweme$proto$AwemeStructV2$$com$ss$android$ugc$aweme$feed$model$Aweme);
            }
        }
        return arrayList;
    }

    public static Object LIZLLL(int i) {
        InterfaceC26200AQa LIZJ = LIZJ();
        String curSecUserId = LIZ.getCurSecUserId();
        if (curSecUserId == null) {
            return C61878OQg.INSTANCE;
        }
        AQV.LJLIL.getClass();
        return LIZJ.LJIIJ(i, AQV.LJLJI, curSecUserId);
    }

    public static Object LJI(String str, FeedItemList feedItemList, int i) {
        String curSecUserId = LIZ.getCurSecUserId();
        if (curSecUserId == null) {
            return C61878OQg.INSTANCE;
        }
        if (!o.LJ(curSecUserId, str)) {
            return C61878OQg.INSTANCE;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (i > feedItemList.size() || i <= 0) {
            return C61878OQg.INSTANCE;
        }
        List<RCZ> subList = feedItemList.pbData.aweme_list.subList(0, i);
        ArrayList arrayList = new ArrayList(C32I.LJJL(subList, 10));
        for (RCZ it : subList) {
            o.LJIIIIZZ(it, "it");
            String str2 = it.aweme_id;
            o.LJIIIIZZ(str2, "it.aweme_id");
            arrayList.add(new C87526YWs(str, currentTimeMillis, it, str2, false, false, Long.MAX_VALUE, ""));
        }
        return LIZJ().LJIIIIZZ(arrayList);
    }
}
