package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.ChM, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32012ChM<T> implements InterfaceC64592gB {
    public final /* synthetic */ InterfaceC32013ChN LJLIL;
    public final /* synthetic */ C68322mC<List<Long>> LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ long LJLJJI;

    public C32012ChM(InterfaceC32013ChN interfaceC32013ChN, C68322mC<List<Long>> c68322mC, int i, long j) {
        this.LJLIL = interfaceC32013ChN;
        this.LJLILLLLZI = c68322mC;
        this.LJLJI = i;
        this.LJLJJI = j;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        int i;
        Throwable throwable = (Throwable) obj;
        o.LJIIIZ(throwable, "throwable");
        C0NB.LJ("Assets Manager", throwable.getMessage());
        InterfaceC32013ChN interfaceC32013ChN = this.LJLIL;
        if (interfaceC32013ChN != null) {
            interfaceC32013ChN.onFailed();
        }
        String message = throwable.getMessage();
        String str = "";
        if (message == null) {
            message = "";
        }
        if (throwable instanceof C276516r) {
            i = ((C276516r) throwable).getErrorCode();
            if (throwable instanceof C29401Dk) {
                String logId = ((C29401Dk) throwable).getLogId();
                if (logId == null) {
                    logId = "";
                }
                String message2 = throwable.getMessage();
                if (message2 != null) {
                    str = message2;
                }
                message = str;
                str = logId;
            }
        } else {
            i = -1;
        }
        int size = this.LJLILLLLZI.element.size();
        int i2 = this.LJLJI;
        C65124PhA.LIZLLL().getClass();
        C32710Csc.LIZJ(0, size, i, i2, message, C65124PhA.LIZJ(), System.currentTimeMillis() - this.LJLJJI, str, null, null);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("fetch gift asset list fail ");
        LIZ.append(throwable.getMessage());
        C78983UzD.LJIJ(throwable, X1D.LIZIZ(LIZ));
    }
}
