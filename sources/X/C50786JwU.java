package X;

import Y.ARunnableS22S0200000_3;
import android.content.Context;
import android.os.MessageQueue;
import com.ss.android.ugc.aweme.search.ecommerce.middle.DynamicSingleIntermediateFragmentNew;

/* renamed from: X.JwU, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50786JwU implements MessageQueue.IdleHandler {
    public final /* synthetic */ DynamicSingleIntermediateFragmentNew LJLIL;

    public C50786JwU(DynamicSingleIntermediateFragmentNew dynamicSingleIntermediateFragmentNew) {
        this.LJLIL = dynamicSingleIntermediateFragmentNew;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        DynamicSingleIntermediateFragmentNew dynamicSingleIntermediateFragmentNew = this.LJLIL;
        if (!dynamicSingleIntermediateFragmentNew.LLIIIILZ) {
            dynamicSingleIntermediateFragmentNew.LLIIIILZ = true;
            Context context = dynamicSingleIntermediateFragmentNew.getContext();
            if (context != null) {
                C38995FSd.LIZJ().execute(new ARunnableS22S0200000_3(KK8.LIZIZ, context, 52));
                KK8.LIZ(context);
                return false;
            }
            return false;
        }
        return false;
    }
}
