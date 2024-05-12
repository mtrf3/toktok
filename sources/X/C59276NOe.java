package X;

import android.os.Bundle;
import com.bytedance.ies.ugc.aweme.rich.model.CommonAdData;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.jvm.internal.o;

/* renamed from: X.NOe, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59276NOe extends AbstractC59249NNd {
    public final String LIZJ;
    public final String LIZLLL;
    public final int LJ;
    public final String LJFF;
    public final AwemeRawAd LJI;

    @Override // X.AbstractC59248NNc
    public final boolean LIZIZ() {
        if (this.LIZJ.length() == 0) {
            return false;
        }
        return C59275NOd.LIZ(this.LIZJ);
    }

    @Override // X.AbstractC59249NNd
    public final C59289NOr LIZJ() {
        if (C59280NOi.LIZIZ.LJIIJ(this.LIZIZ, this.LJI, this.LIZJ, this.LIZLLL, this.LJFF, this.LJ)) {
            return new C59289NOr(true);
        }
        return new C59289NOr(false, "handle popup web failed");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59276NOe(InterfaceC59247NNb taskContext, Bundle bundle) {
        super(taskContext, bundle);
        AwemeRawAd awemeRawAd;
        o.LJIIIZ(taskContext, "taskContext");
        String string = bundle.getString("real_web_url", "");
        o.LJIIIIZZ(string, "params.getString(RichTas…ams.KEY_REAL_WEB_URL, \"\")");
        this.LIZJ = string;
        String string2 = bundle.getString("title", "");
        o.LJIIIIZZ(string2, "params.getString(RichTaskParams.KEY_TITLE, \"\")");
        this.LIZLLL = string2;
        this.LJ = bundle.getInt("click_from");
        String string3 = bundle.getString("aweme_id", "");
        o.LJIIIIZZ(string3, "params.getString(RichTaskParams.KEY_AWEME_ID, \"\")");
        this.LJFF = string3;
        CommonAdData LIZ = taskContext.LIZ();
        if (LIZ instanceof AwemeRawAd) {
            awemeRawAd = (AwemeRawAd) LIZ;
        } else {
            awemeRawAd = null;
        }
        this.LJI = awemeRawAd;
    }
}
