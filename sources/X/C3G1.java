package X;

import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.social.model.MAFIMUser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3G1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3G1 extends AbstractC65781Prl implements InterfaceC65784Pro<List<? extends String>> {
    public static final C3G1 LJLIL = new C3G1();

    public C3G1() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final List<? extends String> invoke() {
        List<MAFIMUser> LIZ = C785836o.LIZ().LIZ();
        ArrayList arrayList = new ArrayList(C32I.LJJL(LIZ, 10));
        Iterator it = ((ArrayList) LIZ).iterator();
        while (it.hasNext()) {
            arrayList.add(((IMUser) it.next()).getUid());
        }
        return arrayList;
    }
}
