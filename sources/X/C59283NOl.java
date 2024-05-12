package X;

import android.os.Bundle;
import kotlin.jvm.internal.o;

/* renamed from: X.NOl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59283NOl extends AbstractC59249NNd {
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;

    @Override // X.AbstractC59248NNc
    public final boolean LIZIZ() {
        C59280NOi c59280NOi = C59280NOi.LIZIZ;
        String openUrl = this.LIZJ;
        o.LJIIIIZZ(openUrl, "openUrl");
        return c59280NOi.LJIILJJIL(openUrl);
    }

    @Override // X.AbstractC59249NNd
    public final C59289NOr LIZJ() {
        C59280NOi.LIZIZ.LJIILLIIL(this.LJFF, this.LIZJ, this.LIZLLL, this.LJ, this.LIZIZ);
        return new C59289NOr(true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59283NOl(InterfaceC59247NNb taskContext, Bundle bundle) {
        super(taskContext, bundle);
        o.LJIIIZ(taskContext, "taskContext");
        this.LIZJ = bundle.getString("open_url", "");
        this.LIZLLL = bundle.getString("log_extra", "");
        this.LJ = bundle.getString("creative_id", "");
        this.LJFF = bundle.getString("aweme_id", "");
    }
}
