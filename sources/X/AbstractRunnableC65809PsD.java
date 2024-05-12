package X;

import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.PsD, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractRunnableC65809PsD implements InterfaceC65812PsG, Runnable, Comparable<InterfaceC65812PsG>, WeakHandler.IHandler {
    public static C65810PsE LJLJL = C65810PsE.LIZ();
    public final AtomicBoolean LJLIL = new AtomicBoolean(false);
    public final AtomicBoolean LJLILLLLZI = new AtomicBoolean(false);
    public final WeakHandler LJLJI = new WeakHandler(C16880lQ.LLJJJJ(), this);
    public int LJLJJI;
    public final String LJLJJL;
    public final EnumC65806PsA LJLJJLL;

    @Override // java.lang.Runnable
    public void run() {
    }

    @Override // X.InterfaceC65812PsG
    public final int LIZJ() {
        return this.LJLJJI;
    }

    @Override // X.InterfaceC65812PsG
    public final EnumC65806PsA getPriority() {
        return this.LJLJJLL;
    }

    public AbstractRunnableC65809PsD(EnumC65806PsA enumC65806PsA) {
        this.LJLJJLL = enumC65806PsA;
        this.LJLJJL = C38354F3m.LJ(null) ? C16880lQ.LJLLJ(getClass()) : null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(InterfaceC65812PsG interfaceC65812PsG) {
        InterfaceC65812PsG interfaceC65812PsG2 = interfaceC65812PsG;
        EnumC65806PsA enumC65806PsA = this.LJLJJLL;
        EnumC65806PsA priority = interfaceC65812PsG2.getPriority();
        if (enumC65806PsA == null) {
            enumC65806PsA = EnumC65806PsA.NORMAL;
        }
        if (priority == null) {
            priority = EnumC65806PsA.NORMAL;
        }
        if (enumC65806PsA == priority) {
            return this.LJLJJI - interfaceC65812PsG2.LIZJ();
        }
        return priority.ordinal() - enumC65806PsA.ordinal();
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        if (message == null) {
            return;
        }
        try {
            int i = message.what;
            if (i == 0) {
                LJLJL.LIZJ();
            } else if (i == 1) {
                LJLJL.LIZIZ();
            }
        } catch (Throwable unused) {
        }
    }
}
