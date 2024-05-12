package Y;

import X.C115284fk;
import X.C47922IrO;
import X.C63081OpJ;
import X.C63089OpR;
import X.C63120Opw;
import X.C63124Oq0;
import X.C63133Oq9;
import X.InterfaceC63352Otg;
import android.text.TextUtils;
import com.bytedance.im.core.proto.Participant;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public class IDcS13S1100000_1 implements InterfaceC63352Otg {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.InterfaceC63352Otg
    public final Object LIZIZ() {
        switch (this.$t) {
            case 0:
                return LIZIZ$0(this);
            case 1:
                return LIZIZ$1(this);
            case 2:
                return LIZIZ$2(this);
            default:
                return null;
        }
    }

    public static final Object LIZIZ$0(IDcS13S1100000_1 iDcS13S1100000_1) {
        return Boolean.valueOf(C63133Oq9.LJJII(iDcS13S1100000_1.s0, (Map) iDcS13S1100000_1.l1));
    }

    public static final Object LIZIZ$1(IDcS13S1100000_1 iDcS13S1100000_1) {
        C47922IrO.LIZ();
        ((C63120Opw) iDcS13S1100000_1.l1).setUpdatedTime(System.currentTimeMillis());
        C63133Oq9.LJIJI(((C63120Opw) iDcS13S1100000_1.l1).getUpdatedTime(), iDcS13S1100000_1.s0);
        C63120Opw c63120Opw = (C63120Opw) iDcS13S1100000_1.l1;
        if (c63120Opw != null && !TextUtils.isEmpty(c63120Opw.getConversationId())) {
            C63133Oq9.LJJ(C63133Oq9.LJII(c63120Opw), c63120Opw.getConversationId());
        }
        return (C63120Opw) iDcS13S1100000_1.l1;
    }

    public static final Object LIZIZ$2(IDcS13S1100000_1 iDcS13S1100000_1) {
        int conversationType;
        C63089OpR LJIIJJI = C63081OpJ.LJIIJJI(iDcS13S1100000_1.s0, (Participant) iDcS13S1100000_1.l1);
        C63120Opw LJIIIZ = C115284fk.LJIILIIL().LJIIIZ(iDcS13S1100000_1.s0);
        String str = iDcS13S1100000_1.s0;
        if (LJIIIZ == null) {
            conversationType = -1;
        } else {
            conversationType = LJIIIZ.getConversationType();
        }
        if (C63124Oq0.LJII(conversationType, str, Collections.singletonList(LJIIJJI))) {
            return LJIIJJI;
        }
        return null;
    }

    public IDcS13S1100000_1(String str, Object obj, int i) {
        this.$t = i;
        this.s0 = str;
        this.l1 = obj;
    }

    public IDcS13S1100000_1(C63120Opw c63120Opw, C63120Opw c63120Opw2, String str, int i) {
        this.$t = i;
        this.l1 = c63120Opw2;
        this.s0 = str;
    }
}
