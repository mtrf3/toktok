package X;

import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import yq4.a;

/* renamed from: X.3jp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C92333jp {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZIZ() {
        Integer valueOf;
        PrivacySettingsRestrictionItem LIZJ = a.LJIILIIL().LIZJ(0, "group_chat");
        if (LIZJ == null || (valueOf = Integer.valueOf(LIZJ.getShowType())) == null) {
            return false;
        }
        if (valueOf.intValue() == 0 || valueOf.intValue() == 1) {
            return true;
        }
        valueOf.intValue();
        return false;
    }

    public static List LIZ(List list) {
        o.LJIIIZ(list, "list");
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            IMContact iMContact = (IMContact) it.next();
            o.LJII(iMContact, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMUser");
            arrayList.add(((IMUser) iMContact).getUid());
        }
        return arrayList;
    }
}
