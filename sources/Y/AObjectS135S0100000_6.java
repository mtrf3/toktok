package Y;

import X.C36922EeM;
import X.C38739FIh;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import com.ss.android.ugc.aweme.legoImp.task.TrimMemoryTask;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AqS153S0200000_6;

/* loaded from: classes7.dex */
public class AObjectS135S0100000_6 implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS135S0100000_6 aObjectS135S0100000_6) {
        TrimMemoryTask trimMemoryTask = (TrimMemoryTask) aObjectS135S0100000_6.l0;
        trimMemoryTask.getClass();
        C36922EeM.LJ("TrimMemoryTask");
        C38739FIh.LIZ(trimMemoryTask.LJLIL);
        return null;
    }

    public static final Object invoke$1(AObjectS135S0100000_6 aObjectS135S0100000_6) {
        InterfaceC65784Pro interfaceC65784Pro;
        WeakReference weakReference = (WeakReference) ((AqS153S0200000_6) aObjectS135S0100000_6.l0).l1;
        if (weakReference != null && (interfaceC65784Pro = (InterfaceC65784Pro) weakReference.get()) != null) {
            interfaceC65784Pro.invoke();
        }
        return C76800UCe.LIZ;
    }

    public AObjectS135S0100000_6(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
