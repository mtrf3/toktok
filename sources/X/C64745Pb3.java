package X;

import android.content.Context;
import com.bytedance.ttnet.TTNetInit;

/* renamed from: X.Pb3, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64745Pb3 extends RunnableC39007FSp {
    public final /* synthetic */ Context LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;

    @Override // X.RunnableC39007FSp, java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            C64734Pas.LJIIIZ(this.LJLJJL).LJIIZILJ();
            C64734Pas.LJIIIZ(this.LJLJJL).LJIJ(EnumC64748Pb6.TTSERVER, true);
            TTNetInit.com_bytedance_ttnet_TTNetInit_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_tryInitCookieManager(this.LJLJJL, this.LJLJJLL, true);
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C64745Pb3(Context context, boolean z) {
        super((Object) null);
        this.LJLJJL = context;
        this.LJLJJLL = z;
    }
}
