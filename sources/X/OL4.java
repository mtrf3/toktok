package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class OL4 implements Runnable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ List LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ Context LJLJJI;

    public OL4(int i, Context context, String str, List list) {
        this.LJLIL = str;
        this.LJLILLLLZI = list;
        this.LJLJI = i;
        this.LJLJJI = context;
    }

    public final void LIZ() {
        List list;
        try {
            if (OL3.LIZJ(this.LJLIL) && (list = this.LJLILLLLZI) != null && !list.isEmpty()) {
                Aweme aweme = (Aweme) ORZ.LJLLLLLL(this.LJLJI, this.LJLILLLLZI);
                if (aweme == null || !aweme.isAd()) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(this.LJLILLLLZI);
                    Iterator it = arrayList.iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        Object next = it.next();
                        int i2 = i + 1;
                        if (i >= 0) {
                            Aweme aweme2 = (Aweme) next;
                            if (OL1.LJIIIIZZ(aweme2) && i + 10 < this.LJLJI) {
                                if (OL1.LJIIIZ(aweme2)) {
                                    OL2.LIZJ(this.LJLJJI, OL1.LIZIZ, true);
                                }
                                OL5 LIZIZ = OL1.LIZIZ(aweme2);
                                if (LIZIZ != null) {
                                    LIZIZ.LJIIJ = false;
                                    LIZIZ.LJIIJJI = false;
                                    LIZIZ.LJIIL = false;
                                    LIZIZ.LJIILIIL = false;
                                    LIZIZ.LJIILJJIL = false;
                                    OLK olk = LIZIZ.LJIIIIZZ;
                                    if (olk != null) {
                                        olk.LIZ();
                                    }
                                    LIZIZ.LJIIIIZZ = null;
                                    LIZIZ.LJIIIZ = null;
                                }
                            }
                            i = i2;
                        } else {
                            C47261Igj.LJJJJJ();
                            throw null;
                        }
                    }
                    OL1.LIZ(this.LJLJJI, arrayList);
                }
            }
        } catch (Throwable unused) {
        }
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
