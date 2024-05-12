package X;

import com.google.android.play.core.assetpacks.w0;
import com.ss.android.ugc.aweme.im.sdk.search.data.api.SearchDoc;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.36m, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C785636m {
    public static final /* synthetic */ int LIZ = 0;

    public static List LIZ(List list, java.util.Set mobShowFilterSet, w0 w0Var, C88213dB launchPerformanceHandler, InterfaceC88472Yns interfaceC88472Yns) {
        C785736n c785736n;
        int i;
        String nickName;
        o.LJIIIZ(mobShowFilterSet, "mobShowFilterSet");
        o.LJIIIZ(launchPerformanceHandler, "launchPerformanceHandler");
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                SearchDoc searchDoc = (SearchDoc) it.next();
                int i3 = searchDoc.docType;
                String str = searchDoc.id;
                if (i3 != 0) {
                    if (i3 != 1) {
                        arrayList.add(searchDoc);
                    } else {
                        C3Q9.LIZ.getClass();
                        C75782yE.LIZ();
                        C63120Opw LJII = C4WC.LIZIZ.LJII(str);
                        if (LJII != null) {
                            if (LJII.getCoreInfo() == null) {
                                arrayList.add(searchDoc);
                            }
                            if (LJII.getCoreInfo() != null) {
                                String name = LJII.getCoreInfo().getName();
                                o.LJIIIIZZ(name, "it.coreInfo.name");
                                i = i2 + 1;
                                c785736n = new C785736n(new C87884YeO(new C87882YeM(LJII, name, i2, EnumC40672Fxk.SUGGESTED, mobShowFilterSet, w0Var), launchPerformanceHandler), null);
                                i2 = i;
                                arrayList2.add(c785736n);
                            }
                        }
                    }
                } else {
                    String LIZJ = C81273Gx.LIZJ(str);
                    C3Q9.LIZ.getClass();
                    C75782yE.LIZ();
                    C63120Opw LJII2 = C4WC.LIZIZ.LJII(LIZJ);
                    IMUser LIZLLL = C3GN.LIZIZ.LIZLLL(str);
                    if (LIZLLL == null || (nickName = LIZLLL.getNickName()) == null || nickName.length() == 0) {
                        arrayList.add(searchDoc);
                    } else {
                        C785836o.LIZ().getClass();
                        boolean LIZJ2 = C3FW.LIZJ(str);
                        i = i2 + 1;
                        c785736n = new C785736n(new C87883YeN(new C87881YeL(LIZLLL, LJII2, LIZJ2, i2, EnumC40672Fxk.SUGGESTED, mobShowFilterSet, w0Var), launchPerformanceHandler), null);
                        i2 = i;
                        arrayList2.add(c785736n);
                    }
                }
            }
            interfaceC88472Yns.invoke(arrayList);
            return arrayList2;
        }
        return C61878OQg.INSTANCE;
    }
}
