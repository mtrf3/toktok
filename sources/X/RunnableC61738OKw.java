package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.OKw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC61738OKw implements Runnable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ List LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    public RunnableC61738OKw(String str, List list, int i) {
        this.LJLIL = str;
        this.LJLILLLLZI = list;
        this.LJLJI = i;
    }

    public final void LIZ() {
        List list;
        OL5 LIZIZ;
        try {
            if (OL3.LIZJ(this.LJLIL) && (list = this.LJLILLLLZI) != null && !list.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.LJLILLLLZI);
                int i = this.LJLJI;
                if (i >= 0 && i < arrayList.size() - 1) {
                    int size = arrayList.size();
                    for (int i2 = this.LJLJI + 1; i2 < size; i2++) {
                        Aweme aweme = (Aweme) ListProtector.get(arrayList, i2);
                        if (OL1.LJIIIIZZ(aweme) && (LIZIZ = OL1.LIZIZ(aweme)) != null) {
                            OL3.LJFF(LIZIZ);
                        }
                    }
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
