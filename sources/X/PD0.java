package X;

import com.bytedance.apm.doctor.DoctorManager;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes12.dex */
public final class PD0 implements PD3 {
    public final /* synthetic */ List LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.LJLIL.iterator();
        while (it.hasNext()) {
            ((DoctorManager.ApmListener) it.next()).onEvent(this.LJLILLLLZI, this.LJLJI);
        }
    }

    @Override // X.PD3
    public final PD7 LJIJ() {
        return PD7.LIGHT_WEIGHT;
    }

    public PD0(List list, String str, String str2) {
        this.LJLIL = list;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
    }
}
