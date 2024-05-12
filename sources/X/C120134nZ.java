package X;

import Y.ARunnableS29S0200000_10;
import Y.IDcS364S0100000_1;
import com.bytedance.im.core.proto.ResponseBody;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4nZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C120134nZ extends AbstractC63515OwJ<List<C63120Opw>> {
    public List<C63120Opw> LIZJ;
    public int LIZLLL;

    @Override // X.AbstractC63515OwJ
    public final boolean LJFF() {
        return true;
    }

    public C120134nZ(IDcS364S0100000_1 iDcS364S0100000_1) {
        super(EnumC63625Oy5.BATCH_MARK_CONVERSATION_READ.getValue(), iDcS364S0100000_1);
        this.LIZJ = new ArrayList();
    }

    @Override // X.AbstractC63515OwJ
    public final boolean LJIIIZ(C63622Oy2 c63622Oy2) {
        ResponseBody responseBody = c63622Oy2.LJLJL.body;
        if (responseBody != null && responseBody.batch_mark_read_body != null) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC63515OwJ
    public final void LJII(C63622Oy2 c63622Oy2, ARunnableS29S0200000_10 aRunnableS29S0200000_10) {
        if (c63622Oy2.LJIIJ() && LJIIIZ(c63622Oy2)) {
            C63337OtR.LJII(c63622Oy2, true).LIZ();
        } else {
            LIZIZ(c63622Oy2);
            C63337OtR.LJII(c63622Oy2, false).LIZ();
        }
    }
}
