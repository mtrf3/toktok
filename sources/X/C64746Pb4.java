package X;

import android.content.Context;
import com.bytedance.ttnet.TTNetInit;

/* renamed from: X.Pb4, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64746Pb4 extends RunnableC39007FSp {
    public final /* synthetic */ Context LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;

    @Override // X.RunnableC39007FSp, java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            C64734Pas.LJIIIZ(this.LJLJJL).LJIIZILJ();
            TTNetInit.com_bytedance_ttnet_TTNetInit_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_tryInitCookieManager(this.LJLJJL, this.LJLJJLL, false);
            C64734Pas.LJIIIZ(this.LJLJJL).LJIJ(EnumC64748Pb6.TTSERVER, true);
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C64746Pb4(Context context, boolean z) {
        super((Object) null);
        this.LJLJJL = context;
        this.LJLJJLL = z;
    }
}
