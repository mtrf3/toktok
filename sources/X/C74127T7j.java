package X;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.T7j, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74127T7j {
    public final java.util.Set LIZ;

    public final synchronized void LIZ(AbstractC40550Fvm abstractC40550Fvm) {
        Iterator it = ((HashSet) this.LIZ).iterator();
        while (it.hasNext()) {
            ((InterfaceC40559Fvv) it.next()).LIZ(abstractC40550Fvm);
        }
    }

    public C74127T7j(int i) {
        if (i != 1) {
            this.LIZ = new HashSet();
        } else {
            this.LIZ = new HashSet();
        }
    }

    public final void LIZIZ(C74141T7x c74141T7x) {
        String str;
        Integer num;
        if (c74141T7x != null && (str = c74141T7x.LIZIZ) != null) {
            int i = 0;
            if (c74141T7x.LIZ == 2 && c74141T7x.LJIIL && ((HashSet) this.LIZ).add(str)) {
                List<String> list = c74141T7x.LJIILIIL;
                String str2 = null;
                if (list != null) {
                    num = Integer.valueOf(list.size());
                } else {
                    num = null;
                }
                C71830SHa c71830SHa = c74141T7x.LIZLLL;
                if (c71830SHa != null) {
                    i = 1;
                }
                T7F t7f = InterfaceC72761Sh3.LIZ;
                if (c71830SHa != null) {
                    str2 = c71830SHa.LIZLLL;
                }
                t7f.getClass();
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("enter_from", "qa_personal_profile");
                c188727au.LJIIIZ("question_id", str);
                c188727au.LIZLLL(i, "is_thumbnail_show");
                c188727au.LJIIIZ("thumbnail_item_id", str2);
                c188727au.LJFF(num, "inviter_cnt");
                FMX.LJIIL("qa_invitation_show", c188727au.LIZ);
            }
        }
    }
}
