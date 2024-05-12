package X;

import android.content.Context;
import com.bytedance.ttnet.TTNetInit;

/* renamed from: X.PbP, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC64767PbP implements Runnable {
    public final /* synthetic */ Context LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            TTNetInit.com_bytedance_ttnet_TTNetInit_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_tryInitCookieManager(this.LJLIL, this.LJLILLLLZI, this.LJLJI);
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC64767PbP(Context context, boolean z, boolean z2) {
        this.LJLIL = context;
        this.LJLILLLLZI = z;
        this.LJLJI = z2;
    }
}
