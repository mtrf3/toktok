package X;

import com.ss.android.ugc.aweme.ad.feed.shakeEgg.IShakeEggService;
import com.ss.android.ugc.aweme.ad.feed.shakeEgg.ShakeEggService;
import com.ss.android.ugc.aweme.commercialize.model.ShakeModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NHO implements IShakeEggService {
    public static final NHO LIZIZ = new NHO();
    public final /* synthetic */ IShakeEggService LIZ;

    @Override // com.ss.android.ugc.aweme.ad.feed.shakeEgg.IShakeEggService
    public final boolean LIZ(Aweme aweme) {
        return this.LIZ.LIZ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.shakeEgg.IShakeEggService
    public final ShakeModel LIZIZ(Aweme aweme) {
        return this.LIZ.LIZIZ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.shakeEgg.IShakeEggService
    public final InterfaceC55508LqS LIZJ(C29S c29s) {
        return this.LIZ.LIZJ(c29s);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.shakeEgg.IShakeEggService
    public final void LIZLLL(AwemeRawAd rawAd, List<String> list) {
        o.LJIIIZ(rawAd, "rawAd");
        this.LIZ.LIZLLL(rawAd, list);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.shakeEgg.IShakeEggService
    public final String LJ(ShakeModel shakeModel, ActivityC45651qj context) {
        o.LJIIIZ(context, "context");
        return this.LIZ.LJ(shakeModel, context);
    }

    public NHO() {
        IShakeEggService iShakeEggService;
        Object LIZ = C58096Mr6.LIZ(IShakeEggService.class, false);
        if (LIZ != null) {
            iShakeEggService = (IShakeEggService) LIZ;
        } else {
            if (C58096Mr6.LJZL == null) {
                synchronized (IShakeEggService.class) {
                    if (C58096Mr6.LJZL == null) {
                        C58096Mr6.LJZL = new ShakeEggService();
                    }
                }
            }
            iShakeEggService = C58096Mr6.LJZL;
        }
        this.LIZ = iShakeEggService;
    }
}
