package X;

import com.ss.android.ugc.aweme.ad.feed.feinteraction.AdFeInteractionImpl;
import com.ss.android.ugc.aweme.ad.feed.feinteraction.IAdFeInteraction;
import com.ss.android.ugc.aweme.commercialize.model.AdFeInteractionModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NHM implements IAdFeInteraction {
    public static final NHM LIZIZ = new NHM();
    public final /* synthetic */ IAdFeInteraction LIZ;

    @Override // com.ss.android.ugc.aweme.ad.feed.feinteraction.IAdFeInteraction
    public final AdFeInteractionModel LIZ(Aweme aweme) {
        return this.LIZ.LIZ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.feinteraction.IAdFeInteraction
    public final void LIZIZ(AwemeRawAd rawAd, List<String> list) {
        o.LJIIIZ(rawAd, "rawAd");
        this.LIZ.LIZIZ(rawAd, list);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.feinteraction.IAdFeInteraction
    public final boolean LIZJ(Aweme aweme) {
        return this.LIZ.LIZJ(aweme);
    }

    public NHM() {
        IAdFeInteraction iAdFeInteraction;
        Object LIZ = C58096Mr6.LIZ(IAdFeInteraction.class, false);
        if (LIZ != null) {
            iAdFeInteraction = (IAdFeInteraction) LIZ;
        } else {
            if (C58096Mr6.LJLLLLLL == null) {
                synchronized (IAdFeInteraction.class) {
                    if (C58096Mr6.LJLLLLLL == null) {
                        C58096Mr6.LJLLLLLL = new AdFeInteractionImpl();
                    }
                }
            }
            iAdFeInteraction = C58096Mr6.LJLLLLLL;
        }
        this.LIZ = iAdFeInteraction;
    }
}
