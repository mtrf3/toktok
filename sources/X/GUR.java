package X;

import Y.IDComparatorS35S0000000_7;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AqS111S0300000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GUR implements Runnable {
    public final /* synthetic */ GUS LJLIL;
    public final /* synthetic */ GUQ LJLILLLLZI;
    public final /* synthetic */ AbstractC41479GPr LJLJI;
    public final /* synthetic */ Object LJLJJI;
    public final /* synthetic */ PublishModel LJLJJL;

    public GUR(GUS gus, GUQ guq, AbstractC41479GPr abstractC41479GPr, Object obj, PublishModel publishModel) {
        this.LJLIL = gus;
        this.LJLILLLLZI = guq;
        this.LJLJI = abstractC41479GPr;
        this.LJLJJI = obj;
        this.LJLJJL = publishModel;
    }

    public final void LIZ() {
        if (!this.LJLIL.LIZ(this.LJLILLLLZI.LJLJJL.LIZLLL, "finish on no running")) {
            return;
        }
        GUU guu = this.LJLILLLLZI.LJLJJL;
        AbstractC41479GPr result = this.LJLJI;
        Object obj = this.LJLJJI;
        guu.getClass();
        o.LJIIIZ(result, "result");
        guu.LIZ(new GOS(result, obj));
        guu.LJFF = SystemClock.uptimeMillis();
        guu.LJI = null;
        GUJ guj = this.LJLILLLLZI.LJLILLLLZI;
        synchronized (guj) {
            Collection<GUU> values = guj.LIZIZ.values();
            o.LJIIIIZZ(values, "records.values");
            ArrayList arrayList = new ArrayList();
            for (GUU guu2 : values) {
                if (guu2.LIZLLL instanceof GOS) {
                    arrayList.add(guu2);
                }
            }
            Iterator it = ORZ.LJLJL(1, ORZ.LLILII(new IDComparatorS35S0000000_7(9), arrayList)).iterator();
            while (it.hasNext()) {
                guj.LIZIZ.remove(((GUU) it.next()).LIZIZ);
            }
        }
        this.LJLILLLLZI.LIZLLL(new AqS111S0300000_7(this.LJLJI, this.LJLJJI, this.LJLJJL, 24));
        ((ArrayList) this.LJLILLLLZI.LJLJLJ).clear();
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
}
