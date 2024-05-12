package X;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.NyV, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC61103NyV extends AbstractC61106NyY {
    public abstract void LIZIZ(C61101NyT c61101NyT, C164906da... c164906daArr);

    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    @Override // X.AbstractC61106NyY
    public final void LIZ(C61101NyT c61101NyT, String... strArr) {
        WeakReference<Context> weakReference;
        Context context;
        o.LJIIIZ(strArr, OHQ.LIZIZ);
        if (c61101NyT != null && (weakReference = c61101NyT.LJ) != null && (context = weakReference.get()) != null) {
            C164906da[] c164906daArr = (C164906da[]) C17J.LJIJ(context, ORY.LJJZZIII(strArr)).toArray(new C164906da[0]);
            LIZIZ(c61101NyT, (C164906da[]) Arrays.copyOf(c164906daArr, c164906daArr.length));
        }
    }
}
