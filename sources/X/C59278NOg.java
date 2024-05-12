package X;

import android.os.Bundle;
import com.bytedance.ies.ugc.aweme.rich.model.CommonAdData;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.jvm.internal.o;

/* renamed from: X.NOg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59278NOg extends AbstractC59249NNd {
    public final String LIZJ;
    public final AwemeRawAd LIZLLL;

    @Override // X.AbstractC59248NNc
    public final boolean LIZIZ() {
        AwemeRawAd awemeRawAd = this.LIZLLL;
        if (awemeRawAd != null && C59280NOi.LIZIZ.LJI(awemeRawAd)) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC59249NNd
    public final C59289NOr LIZJ() {
        if (C59280NOi.LIZIZ.LJIILIIL(this.LIZIZ, this.LIZLLL, this.LIZJ)) {
            return new C59289NOr(true);
        }
        return new C59289NOr(false, "handle vast app failed");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59278NOg(InterfaceC59247NNb taskContext, Bundle bundle) {
        super(taskContext, bundle);
        AwemeRawAd awemeRawAd;
        o.LJIIIZ(taskContext, "taskContext");
        String string = bundle.getString("real_web_url", "");
        o.LJIIIIZZ(string, "params.getString(RichTas…ams.KEY_REAL_WEB_URL, \"\")");
        this.LIZJ = string;
        CommonAdData LIZ = taskContext.LIZ();
        if (LIZ instanceof AwemeRawAd) {
            awemeRawAd = (AwemeRawAd) LIZ;
        } else {
            awemeRawAd = null;
        }
        this.LIZLLL = awemeRawAd;
    }
}
