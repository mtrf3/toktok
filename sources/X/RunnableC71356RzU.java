package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.PdpPreviewServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;

/* renamed from: X.RzU, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class RunnableC71356RzU implements Runnable {
    public final /* synthetic */ View LJLIL;
    public final /* synthetic */ C71362Rza LJLILLLLZI;
    public final /* synthetic */ C34K LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ Aweme LJLJJL;

    public RunnableC71356RzU(View view, C71362Rza c71362Rza, C34K c34k, boolean z, Aweme aweme) {
        this.LJLIL = view;
        this.LJLILLLLZI = c71362Rza;
        this.LJLJI = c34k;
        this.LJLJJI = z;
        this.LJLJJL = aweme;
    }

    public final void LIZ() {
        boolean z;
        View view = this.LJLIL;
        C71362Rza c71362Rza = this.LJLILLLLZI;
        C34K c34k = this.LJLJI;
        boolean z2 = this.LJLJJI;
        Aweme aweme = this.LJLJJL;
        if (view != null) {
            try {
                if (!view.isAttachedToWindow()) {
                    return;
                }
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable unused) {
                return;
            }
        }
        int i = C71357RzV.LIZ().preloadSize;
        List LJJII = c71362Rza.LJJII();
        if (((ArrayList) LJJII).size() <= 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (LJJII != null) {
                int i2 = 0;
                for (Object obj : LJJII) {
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        String str = (String) obj;
                        if (i2 <= i) {
                            if (!z2) {
                                C70868Rrc.LIZIZ(str);
                            } else if (c34k.element) {
                                C70868Rrc.LIZIZ(str);
                            }
                        }
                        i2 = i3;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
            }
        } else {
            LJJII = null;
        }
        if (c34k.element && LJJII != null && LJJII.size() == 1 && z2) {
            PdpPreviewServiceImpl.LIZJ().LIZ(null, null, c71362Rza.LJJIFFI(), ORY.LJJZ(M2T.LJ(aweme)));
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
