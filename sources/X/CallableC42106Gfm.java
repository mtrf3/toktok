package X;

import com.ss.android.ugc.aweme.mvtheme.MvNetFileBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import ujb.o;

/* renamed from: X.Gfm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class CallableC42106Gfm<V> implements Callable {
    public final /* synthetic */ C43615H9v LJLIL;

    public CallableC42106Gfm(C43615H9v c43615H9v) {
        this.LJLIL = c43615H9v;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        for (Map.Entry entry : ((LinkedHashMap) this.LJLIL.LJIIIIZZ).entrySet()) {
            if (o.LJJJJ((String) entry.getValue(), ".bmp", false)) {
                C39579Fg7.LJIL((String) entry.getValue());
            }
        }
        Iterator it = ((ArrayList) this.LJLIL.LJIIIZ).iterator();
        while (it.hasNext()) {
            C39579Fg7.LJIL(((MvNetFileBean) it.next()).getFilePath());
        }
        return C76800UCe.LIZ;
    }
}
