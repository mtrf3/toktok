package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.AqS140S0200000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MCL extends AbstractC85293Wj {
    public final /* synthetic */ MCM LJLIL;

    public MCL(MCM mcm) {
        this.LJLIL = mcm;
    }

    @Override // X.InterfaceC78660Uu0
    public final void LIZIZ(Bitmap bitmap) {
        boolean z;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLIL.LJII);
        LIZ.append(" setContentRemoteViews load cover success, bitmap is null: ");
        boolean z2 = false;
        if (bitmap == null) {
            z = true;
        } else {
            z = false;
        }
        LIZ.append(z);
        MCT.LIZ("NowWidgetViewModel", X1D.LIZIZ(LIZ));
        if (bitmap == null) {
            return;
        }
        MCM mcm = this.LJLIL;
        int[] iArr = mcm.LJ;
        Aweme aweme = mcm.LJIIIIZZ;
        if (aweme != null && aweme.getAwemeType() == 43) {
            z2 = true;
        }
        MCI.LIZJ(bitmap, iArr, z2, mcm.LJFF, new AqS140S0200000_9(mcm, mcm, 97));
    }

    @Override // X.InterfaceC78660Uu0
    public final void onFailed(Throwable th) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLIL.LJII);
        LIZ.append(" setContentRemoteViews load cover failed");
        String message = X1D.LIZIZ(LIZ);
        o.LJIIIZ(message, "message");
    }
}
