package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.external.ability.IAVProcessService;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS119S0300000_15;
import kotlin.jvm.internal.o;
import v5.n;

/* loaded from: classes8.dex */
public final class HNV implements Runnable {
    public final List<String> LJLIL;
    public final InterfaceC88472Yns<List<String>, C76800UCe> LJLILLLLZI;

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ() {
        List<String> list = this.LJLIL;
        n nVar = new n();
        try {
            IAVProcessService processService = AVExternalServiceImpl.LIZ().abilityService().processService();
            ArrayList arrayList = new ArrayList();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                processService.compressPhoto(it.next(), Integer.valueOf(C86226Xsk.LJIIJJI), Integer.valueOf(C86226Xsk.LJIIL), new HN6(arrayList, list, nVar));
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            nVar.LJ(null);
        }
        C10K<TResult> c10k = nVar.LIZ;
        o.LJIIIIZZ(c10k, "taskCompletionSource.task");
        try {
            c10k.LJIJI();
        } catch (InterruptedException e2) {
            C16880lQ.LLLLIIL(e2);
        }
        Object compressFilePath = c10k.LJIIJJI();
        InterfaceC88472Yns<List<String>, C76800UCe> interfaceC88472Yns = this.LJLILLLLZI;
        o.LJIIIIZZ(compressFilePath, "compressFilePath");
        interfaceC88472Yns.invoke(compressFilePath);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public HNV(Activity activity, List list, InterfaceC86245Xt3 callback, AqS119S0300000_15 aqS119S0300000_15) {
        o.LJIIIZ(callback, "callback");
        this.LJLIL = list;
        this.LJLILLLLZI = aqS119S0300000_15;
        new WeakReference(callback);
    }
}
