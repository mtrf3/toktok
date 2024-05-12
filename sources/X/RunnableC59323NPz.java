package X;

import android.animation.AnimatorSet;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeSplashInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.NPz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC59323NPz implements Runnable {
    public final Aweme LJLIL;
    public boolean LJLILLLLZI;
    public final /* synthetic */ C59316NPs LJLJI;

    public final void LIZ() {
        String str;
        AwemeSplashInfo awemeSplashInfo;
        Aweme aweme = this.LJLIL;
        if (aweme != null && !this.LJLILLLLZI) {
            String aid = aweme.getAid();
            Aweme aweme2 = this.LJLJI.LJLJLJ;
            if (aweme2 != null) {
                str = aweme2.getAid();
            } else {
                str = null;
            }
            if (!TextUtils.equals(aid, str) || !this.LJLJI.LLLLIIL) {
                return;
            }
            Aweme aweme3 = this.LJLIL;
            if (aweme3 != null) {
                awemeSplashInfo = C63081OpJ.LJJJJZI(aweme3);
            } else {
                awemeSplashInfo = null;
            }
            if (awemeSplashInfo != null) {
                awemeSplashInfo.setShown(true);
            }
            this.LJLJI.r(3);
            NQ2 nq2 = this.LJLJI.LLD;
            if (nq2 != null) {
                nq2.LJIJI(true);
                this.LJLJI.LJLIL.b2(false);
                this.LJLJI.LLJJ.setAlpha(0.0f);
                AnimatorSet animatorSet = this.LJLJI.LLLLIIIILLL;
                if (animatorSet != null) {
                    animatorSet.start();
                    return;
                }
                return;
            }
            o.LJIJI("nativeAdBottomLabelView");
            throw null;
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

    public RunnableC59323NPz(C59316NPs c59316NPs, Aweme aweme) {
        this.LJLJI = c59316NPs;
        this.LJLIL = aweme;
    }
}
