package X;

import android.graphics.drawable.Animatable;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;

/* loaded from: classes11.dex */
public final class N5Y extends W4V<Object> {
    public final /* synthetic */ boolean LIZIZ;
    public final /* synthetic */ Aweme LIZJ;

    public N5Y(boolean z, Aweme aweme) {
        this.LIZIZ = z;
        this.LIZJ = aweme;
    }

    @Override // X.W4V, X.W4Z
    public final void LJ(String str, Throwable th) {
        if (!this.LIZIZ) {
            N5T.LIZLLL(1, this.LIZJ);
        }
    }

    @Override // X.W4V, X.W4Z
    public final void LJI(Object obj, String str) {
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        if (this.LIZIZ || (aweme = this.LIZJ) == null || (awemeRawAd = aweme.getAwemeRawAd()) == null) {
            return;
        }
        N5T.LJI("redpacket", "preload_start", awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), aweme.getAid(), -1);
    }

    @Override // X.W4V, X.W4Z
    public final void LJFF(String str, Object obj, Animatable animatable) {
        if (!this.LIZIZ) {
            N5T.LIZLLL(0, this.LIZJ);
        }
    }
}
