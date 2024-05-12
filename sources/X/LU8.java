package X;

import Y.ARunnableS13S0400000_9;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.publish.service.PublishConfigExternalService;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LU8 extends LP1 {
    public final E6C LJ;
    public final WeakReference<Context> LJFF;

    @Override // X.InterfaceC54194LOs
    public final void LIZJ() {
        LJFF("1002");
    }

    @Override // X.InterfaceC54194LOs
    public final boolean LIZLLL() {
        WeakReference<LUF> weakReference;
        LUF luf;
        LUF luf2;
        if (!PublishConfigExternalService.LIZ().shouldShowParallelGuideTooltip() || (weakReference = this.LJ.LIZIZ) == null || (luf = weakReference.get()) == null || luf.LIZLLL() || (luf2 = this.LJ.LIZIZ.get()) == null || luf2.LJ == 1) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC54194LOs
    public final void LIZ(InterfaceC65784Pro<C76800UCe> shown) {
        View view;
        Context context;
        o.LJIIIZ(shown, "shown");
        WeakReference<View> weakReference = this.LJ.LIZ;
        if (weakReference == null || (view = weakReference.get()) == null || (context = this.LJFF.get()) == null) {
            return;
        }
        view.post(new ARunnableS13S0400000_9(this, context, view, shown, 7));
    }

    public LU8(E6C e6c, WeakReference<Context> weakReference) {
        super(e6c, weakReference);
        this.LJ = e6c;
        this.LJFF = weakReference;
    }
}
