package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.android.play.core.assetpacks.w0;
import com.ss.android.ugc.aweme.im.sdk.search.data.RecentContactData;
import com.ss.android.ugc.aweme.im.sdk.search.data.SingleRecentContactData;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.AqS0S1001000_1;
import kotlin.jvm.internal.AqS148S0200000_1;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.33d, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C776933d {
    public final C88213dB LIZ;
    public final w0 LIZJ;
    public boolean LJ;
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C776633a.LJLIL);
    public final C98453th LIZLLL = new C98453th("default_recent", "search", 4);
    public final java.util.Set<String> LJFF = new LinkedHashSet();

    public final AnonymousClass336 LIZIZ() {
        OSZ LIZIZ = C35E.LIZIZ(new AqS151S0100000_1(this, 15));
        List list = (List) LIZIZ.getFirst();
        long longValue = ((Number) LIZIZ.getSecond()).longValue();
        OSZ LIZIZ2 = C35E.LIZIZ(new AqS148S0200000_1(list, (List<SingleRecentContactData>) this, (C776933d) 2));
        List list2 = (List) LIZIZ2.getFirst();
        long longValue2 = ((Number) LIZIZ2.getSecond()).longValue();
        C98453th c98453th = this.LIZLLL;
        StringBuilder LIZJ = V10.LIZJ("getRecentContact query cost ", longValue, ", convert cost ");
        LIZJ.append(longValue2);
        c98453th.LJFF(X1D.LIZIZ(LIZJ));
        C98453th c98453th2 = this.LIZLLL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("shouldScrollToTop ");
        LIZ.append(this.LJ);
        c98453th2.LJFF(X1D.LIZIZ(LIZ));
        return new AnonymousClass336(longValue, this.LJ, longValue2, list2);
    }

    public final String LIZLLL() {
        return (String) this.LIZIZ.getValue();
    }

    public final RecentContactData LIZJ() {
        RecentContactData recentContactData;
        String string = Keva.getRepo(LIZLLL()).getString("recent_contact_data", null);
        if (string != null && (recentContactData = (RecentContactData) C62070OXq.LIZ(RecentContactData.class, string)) != null) {
            return recentContactData;
        }
        return new RecentContactData(C61878OQg.INSTANCE);
    }

    public C776933d(C40651FxP c40651FxP, C88213dB c88213dB) {
        this.LIZ = c88213dB;
        this.LIZJ = new w0(0, c40651FxP);
    }

    public final void LIZ(int i, String businessId) {
        List arrayList;
        o.LJIIIZ(businessId, "businessId");
        List<SingleRecentContactData> list = LIZJ().contactList;
        this.LJ = false;
        C98453th c98453th = this.LIZLLL;
        StringBuilder LIZ = C06830Op.LIZ("delete type ", i, " businessId ", businessId, " stored recent contact ");
        LIZ.append(list);
        c98453th.LJFF(X1D.LIZIZ(LIZ));
        if (list != null) {
            arrayList = ORZ.LLJILJILJ(list);
        } else {
            arrayList = new ArrayList();
        }
        ORS.LJJLIL(new AqS0S1001000_1(i, businessId, 0), arrayList);
        Keva.getRepo(LIZLLL()).storeString("recent_contact_data", C62070OXq.LIZIZ(new RecentContactData(arrayList)));
    }

    public final void LJ(int i, String businessId) {
        o.LJIIIZ(businessId, "businessId");
        RecentContactData LIZJ = LIZJ();
        List list = LIZJ.contactList;
        if (list == null) {
            list = C61878OQg.INSTANCE;
        }
        this.LJ = list.isEmpty();
        C98453th c98453th = this.LIZLLL;
        StringBuilder LIZ = C06830Op.LIZ("store type ", i, " businessId ", businessId, " stored recent contact ");
        LIZ.append(LIZJ);
        c98453th.LJFF(X1D.LIZIZ(LIZ));
        List LLJILJILJ = ORZ.LLJILJILJ(list);
        if (ORS.LJJLIL(new AqS0S1001000_1(i, businessId, 1), LLJILJILJ)) {
            ListProtector.add(LLJILJILJ, 0, new SingleRecentContactData(businessId, i));
        } else if (list.size() >= 20) {
            LLJILJILJ = ORZ.LLJILJILJ(ORZ.LLILLL(list, 19));
            ListProtector.add(LLJILJILJ, 0, new SingleRecentContactData(businessId, i));
        } else {
            LLJILJILJ = ORZ.LLJILJILJ(list);
            ListProtector.add(LLJILJILJ, 0, new SingleRecentContactData(businessId, i));
        }
        Keva.getRepo(LIZLLL()).storeString("recent_contact_data", C62070OXq.LIZIZ(new RecentContactData(LLJILJILJ)));
    }
}
