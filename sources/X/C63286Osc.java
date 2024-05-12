package X;

import Y.ARunnableS29S0200000_10;
import Y.IDcS134S0200000_10;
import com.bytedance.im.core.proto.ResponseBody;
import java.util.List;

/* renamed from: X.Osc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63286Osc extends AbstractC63515OwJ<List<C109544Rq>> {
    public final C63120Opw LIZJ;

    @Override // X.AbstractC63515OwJ
    public final boolean LJFF() {
        return true;
    }

    @Override // X.AbstractC63515OwJ
    public final boolean LJIIIZ(C63622Oy2 c63622Oy2) {
        ResponseBody responseBody = c63622Oy2.LJLJL.body;
        if (responseBody != null && responseBody.get_messages_body != null) {
            return true;
        }
        return false;
    }

    public C63286Osc(C63120Opw c63120Opw, InterfaceC86963bA<List<C109544Rq>> interfaceC86963bA) {
        super(EnumC63625Oy5.GET_MESSAGES.getValue(), interfaceC86963bA);
        this.LIZJ = c63120Opw;
    }

    @Override // X.AbstractC63515OwJ
    public final void LJII(C63622Oy2 c63622Oy2, ARunnableS29S0200000_10 aRunnableS29S0200000_10) {
        if (c63622Oy2.LJIIJ() && LJIIIZ(c63622Oy2)) {
            RunnableC63345OtZ.LJ(new IDcS134S0200000_10(this, c63622Oy2, 16), new C73340SqO(), false);
        } else {
            LIZIZ(c63622Oy2);
        }
    }
}
