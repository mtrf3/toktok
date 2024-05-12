package Y;

import X.C61878OQg;
import X.C74100T6i;
import X.C74118T7a;
import X.InterfaceC64592gB;
import X.KKR;
import X.T7B;
import com.ss.android.ugc.aweme.qna.api.TiktokV1ForumProfileQuestionsResponse;
import java.util.List;

/* loaded from: classes13.dex */
public class AfS0S1120000_12 implements InterfaceC64592gB {
    public final int $t;
    public Object l1;
    public String s0;
    public boolean z2;
    public boolean z3;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS0S1120000_12 afS0S1120000_12, Object obj) {
        T7B t7b = (T7B) afS0S1120000_12.l1;
        String str = afS0S1120000_12.s0;
        boolean z = afS0S1120000_12.z2;
        boolean z2 = afS0S1120000_12.z3;
        t7b.getClass();
        T7B.LIZJ(t7b, C61878OQg.INSTANCE, str, z, z2, 16);
        ((T7B) afS0S1120000_12.l1).LIZLLL.setValue(new C74100T6i<>(KKR.FAILURE));
    }

    public static final void accept$1(AfS0S1120000_12 afS0S1120000_12, Object obj) {
        TiktokV1ForumProfileQuestionsResponse tiktokV1ForumProfileQuestionsResponse = (TiktokV1ForumProfileQuestionsResponse) obj;
        ((T7B) afS0S1120000_12.l1).LJIILLIIL.set(tiktokV1ForumProfileQuestionsResponse.hasMore);
        T7B t7b = (T7B) afS0S1120000_12.l1;
        t7b.LJIIL = tiktokV1ForumProfileQuestionsResponse.cursor;
        List list = tiktokV1ForumProfileQuestionsResponse.questions;
        if (list == null) {
            list = C61878OQg.INSTANCE;
        }
        T7B.LIZJ(t7b, list, afS0S1120000_12.s0, afS0S1120000_12.z2, afS0S1120000_12.z3, 16);
        T7B t7b2 = (T7B) afS0S1120000_12.l1;
        t7b2.LIZJ.setValue(new C74100T6i<>(C74118T7a.LIZ(tiktokV1ForumProfileQuestionsResponse, t7b2.LJII)));
        ((T7B) afS0S1120000_12.l1).LJIILL.set(false);
    }

    public static final void accept$2(AfS0S1120000_12 afS0S1120000_12, Object obj) {
        T7B t7b = (T7B) afS0S1120000_12.l1;
        String str = afS0S1120000_12.s0;
        boolean z = afS0S1120000_12.z2;
        boolean z2 = afS0S1120000_12.z3;
        t7b.getClass();
        T7B.LIZJ(t7b, C61878OQg.INSTANCE, str, z, z2, 16);
        ((T7B) afS0S1120000_12.l1).LIZJ.setValue(new C74100T6i<>(KKR.FAILURE));
        ((T7B) afS0S1120000_12.l1).LJIILL.set(false);
    }

    public AfS0S1120000_12(T7B t7b, String str, boolean z, boolean z2, int i) {
        this.$t = i;
        this.l1 = t7b;
        this.s0 = str;
        this.z2 = z;
        this.z3 = z2;
    }
}
