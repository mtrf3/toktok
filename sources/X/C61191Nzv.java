package X;

import Y.ACallableS113S0100000_10;
import Y.ACallableS59S0300000_10;
import android.util.Pair;
import com.bytedance.geckox.model.LocalPackageModel;
import com.bytedance.geckox.model.UpdatePackage;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Nzv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61191Nzv extends AbstractC61537ODd {
    public final InterfaceC61189Nzt LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final String LIZLLL;

    @Override // X.AbstractC61537ODd
    public final void LJIIIZ(LocalPackageModel localPackageModel) {
        if (!this.LIZJ) {
            this.LIZ.LIZLLL();
        }
    }

    @Override // X.AbstractC61537ODd
    public final void LIZLLL(Throwable th, java.util.Map map) {
        C10K.LIZIZ(new ACallableS113S0100000_10(this, 17), C10K.LJIIIIZZ, null);
    }

    @Override // X.AbstractC61537ODd
    public final void LJFF(java.util.Map<String, List<Pair<String, Long>>> map, java.util.Map<String, List<UpdatePackage>> map2) {
        C10K.LIZIZ(new ACallableS59S0300000_10(this, map2, map, 4), C10K.LJIIIIZZ, null);
    }

    @Override // X.AbstractC61537ODd
    public final void LJIIJ(UpdatePackage updatePackage, Throwable th) {
        C10K.LIZIZ(new CallableC61192Nzw(this, updatePackage, true, th), C10K.LJIIIIZZ, null);
    }

    @Override // X.AbstractC61537ODd
    public final void LJIILL(UpdatePackage updatePackage, long j) {
        C10K.LIZIZ(new CallableC61192Nzw(this, updatePackage, false, null), C10K.LJIIIIZZ, null);
    }

    @Override // X.AbstractC61537ODd
    public final void LJII(UpdatePackage updatePackage, long j, long j2) {
        C10K.LIZIZ(new CallableC61193Nzx(this, updatePackage, j, j2), C10K.LJIIIIZZ, null);
    }

    public C61191Nzv(InterfaceC61189Nzt callback, String channel, boolean z, String accessKey) {
        o.LJIIIZ(callback, "callback");
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(accessKey, "accessKey");
        this.LIZ = callback;
        this.LIZIZ = channel;
        this.LIZJ = z;
        this.LIZLLL = accessKey;
    }
}
