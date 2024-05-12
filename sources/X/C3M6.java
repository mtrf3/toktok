package X;

import Y.ARunnableS5S0101000_1;
import android.os.Handler;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3M6, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3M6 implements InterfaceC82123Ke {
    public final InterfaceC65784Pro<Boolean> LJLIL;
    public final C81983Jq LJLILLLLZI;
    public final String LJLJI;
    public final C62822Ol8 LJLJJI;
    public volatile int LJLJJL;

    @Override // X.InterfaceC82123Ke
    public final C39N LIZIZ() {
        return C39N.LOGIN;
    }

    public static void LJFF(int i) {
        if (C82903Ne.LIZIZ() == 2) {
            C3MT LIZ = C82213Kn.LIZ();
            String LIZ2 = C80763Ey.LIZ(false);
            LIZ2.toString();
            LIZ.LJFF(i, LIZ2);
        }
    }

    @Override // X.InterfaceC82123Ke
    public void LIZ(C81983Jq c81983Jq, List<? extends C3L4> sessionList) {
        o.LJIIIZ(sessionList, "sessionList");
        if (!o.LJ(c81983Jq.LIZ, this.LJLILLLLZI.LIZ)) {
            return;
        }
        if (this.LJLJJL == -1) {
            C81843Jc.LIZJ(this.LJLJI, "the unread count is invalid");
            return;
        }
        String str = this.LJLJI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sessionPageChange: unreadCount: ");
        LIZ.append(this.LJLJJL);
        LIZ.append("  sessionList: ");
        LIZ.append(sessionList.size());
        C81843Jc.LIZJ(str, X1D.LIZIZ(LIZ));
        LJ(this.LJLJJL, sessionList);
        LJFF(this.LJLJJL);
    }

    public final void LJ(int i, List<? extends C3L4> sessionList) {
        o.LJIIIZ(sessionList, "sessionList");
        if (L0W.LIZ()) {
            C2U8.LIZ(new C82793Mt(i));
        }
        ((Handler) this.LJLJJI.getValue()).post(new ARunnableS5S0101000_1(sessionList, i, 15));
    }

    public C3M6(InterfaceC65784Pro<Boolean> interfaceC65784Pro, C81983Jq targetSessionPage, String str) {
        o.LJIIIZ(targetSessionPage, "targetSessionPage");
        this.LJLIL = interfaceC65784Pro;
        this.LJLILLLLZI = targetSessionPage;
        this.LJLJI = str;
        this.LJLJJI = C221108m2.LIZIZ(C3MZ.INSTANCE);
        this.LJLJJL = -1;
    }
}
