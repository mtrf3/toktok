package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.ecommercebase.preload.ECAsyncInflaterV2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class L90 {
    public final Activity LIZ;
    public final ECAsyncInflaterV2 LIZIZ;
    public final C62822Ol8 LIZJ;
    public final List<OSZ<Integer, Integer>> LIZLLL;

    public final void LIZ(InterfaceC88471Ynr<? super Integer, ? super Integer, C76800UCe> interfaceC88471Ynr) {
        Iterator it = ((ArrayList) this.LIZLLL).iterator();
        while (it.hasNext()) {
            OSZ osz = (OSZ) it.next();
            interfaceC88471Ynr.invoke(osz.getFirst(), osz.getSecond());
        }
    }

    public L90(Activity activity, ECAsyncInflaterV2 eCAsyncInflaterV2) {
        o.LJIIIZ(activity, "activity");
        this.LIZ = activity;
        this.LIZIZ = eCAsyncInflaterV2;
        this.LIZJ = C221108m2.LIZIZ(new AqS159S0100000_9(this, 763));
        this.LIZLLL = new ArrayList();
    }
}
