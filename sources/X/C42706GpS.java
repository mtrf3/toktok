package X;

import android.app.Application;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.tools.policysecurity.OriginalSoundUploadTask;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.GpS, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42706GpS implements InterfaceC42708GpU {
    public final ConcurrentHashMap<String, AbstractC42707GpT> LIZ = new ConcurrentHashMap<>();

    @Override // X.InterfaceC42708GpU
    public final C43068GvI LIZ() {
        C43068GvI c43068GvI = new C43068GvI(C2YZ.LJLIL);
        Iterator LIZLLL = C47135Ieh.LIZLLL(this.LIZ, "mAllowListHolder.values");
        while (LIZLLL.hasNext()) {
            AbstractC42707GpT abstractC42707GpT = (AbstractC42707GpT) LIZLLL.next();
            if (!abstractC42707GpT.LIZ.get()) {
                if (!C60903NvH.LJIIJJI().LJJIJL().getPersistedAllowListManager().LIZIZ(abstractC42707GpT.getClass().getName())) {
                    GXW.LIZJ();
                }
                abstractC42707GpT.LIZJ.clear();
                Object value = abstractC42707GpT.LIZIZ.getValue();
                o.LJIIIIZZ(value, "<get-mRepo>(...)");
                String[] array = ((Keva) value).getStringArray(String.valueOf(abstractC42707GpT.getClass().getName().hashCode()), new String[0]);
                o.LJIIIIZZ(array, "array");
                Iterator it = ((ArrayList) ORY.LJJIJLIJ(array)).iterator();
                while (it.hasNext()) {
                    abstractC42707GpT.LIZJ.add(it.next());
                }
                abstractC42707GpT.LIZ.set(true);
            }
            c43068GvI.addAll(abstractC42707GpT.LIZJ);
        }
        Application context = C44172HVg.LIZ;
        o.LJIIIIZZ(context, "context");
        ArrayList<OriginalSoundUploadTask> LIZIZ = HGH.LIZ(context).LIZIZ();
        ArrayList arrayList = new ArrayList(C32I.LJJL(LIZIZ, 10));
        Iterator<OriginalSoundUploadTask> it2 = LIZIZ.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().originalSoundPath);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        c43068GvI.addAll(C47261Igj.LJJIJIIJI(Arrays.copyOf(strArr, strArr.length)));
        C43068GvI c43068GvI2 = new C43068GvI(C60242Ya.LJLIL);
        c43068GvI2.addAll(C78934UyQ.LJLIL.LJIIIZ().LJIIJ());
        c43068GvI2.addAll(C60903NvH.LJIIJJI().LJJJI().LIZJ().LIZLLL());
        AwemeDraft LIZ = C60903NvH.LJIIJJI().LJIIJ().LIZ();
        if (LIZ != null) {
            c43068GvI2.add(C62850Ola.LJ().LJFF(LIZ.LIZIZ()));
        }
        c43068GvI.addAll(c43068GvI2);
        return c43068GvI;
    }

    @Override // X.InterfaceC42708GpU
    public final boolean LIZIZ(String str) {
        return this.LIZ.containsKey(str);
    }

    @Override // X.InterfaceC42708GpU
    public final void LIZJ(C42709GpV c42709GpV) {
        this.LIZ.put(C42709GpV.class.getName(), c42709GpV);
    }
}
