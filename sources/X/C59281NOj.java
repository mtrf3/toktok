package X;

import android.content.Context;
import android.os.Bundle;
import kotlin.jvm.internal.o;

/* renamed from: X.NOj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59281NOj extends AbstractC59249NNd {
    public final boolean LIZJ;
    public final String LIZLLL;
    public final String LJ;

    @Override // X.AbstractC59248NNc
    public final boolean LIZIZ() {
        C59280NOi c59280NOi = C59280NOi.LIZIZ;
        boolean z = this.LIZJ;
        String adType = this.LJ;
        o.LJIIIIZZ(adType, "adType");
        String packageName = this.LIZLLL;
        o.LJIIIIZZ(packageName, "packageName");
        if (c59280NOi.LIZ.LJIIJJI(adType, packageName, z)) {
            c59280NOi.LJFF(this.LIZIZ);
            return false;
        }
        return true;
    }

    @Override // X.AbstractC59249NNd
    public final C59289NOr LIZJ() {
        C59280NOi c59280NOi = C59280NOi.LIZIZ;
        Context context = this.LIZIZ;
        String packageName = this.LIZLLL;
        o.LJIIIIZZ(packageName, "packageName");
        if (c59280NOi.LJIIIIZZ(context, packageName)) {
            return new C59289NOr(true);
        }
        return new C59289NOr(false, "jump to google play failed");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59281NOj(InterfaceC59247NNb taskContext, Bundle bundle) {
        super(taskContext, bundle);
        o.LJIIIZ(taskContext, "taskContext");
        this.LIZJ = bundle.getBoolean("is_awesome_splash_ad");
        this.LIZLLL = bundle.getString("aweme_package_name", "");
        this.LJ = bundle.getString("ad_type", "");
    }
}
