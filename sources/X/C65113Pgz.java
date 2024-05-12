package X;

import com.ss.android.ugc.aweme.feed.experiment.WeakNetworkFeedOptExperiment;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Pgz, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65113Pgz implements InterfaceC65108Pgu {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C65117Ph3.LJLIL);
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C65115Ph1.LJLIL);

    @Override // X.InterfaceC65105Pgr
    public final String LJ() {
        return C64904Pdc.LIZIZ(this);
    }

    @Override // X.InterfaceC65108Pgu
    public final void LJIIIZ(C64907Pdf c64907Pdf, C37826Esw c37826Esw) {
        int i;
        WeakNetworkFeedOptExperiment.WeakNetworkOptConfig weakNetworkOptConfig = (WeakNetworkFeedOptExperiment.WeakNetworkOptConfig) this.LIZIZ.getValue();
        int i2 = 0;
        if (weakNetworkOptConfig != null) {
            i = weakNetworkOptConfig.level;
        } else {
            i = 0;
        }
        WeakNetworkFeedOptExperiment.WeakNetworkOptConfig weakNetworkOptConfig2 = (WeakNetworkFeedOptExperiment.WeakNetworkOptConfig) this.LIZIZ.getValue();
        if (weakNetworkOptConfig2 != null) {
            i2 = weakNetworkOptConfig2.initial;
        }
        if (i > 0) {
            Object value = this.LIZ.getValue();
            o.LJIIIIZZ(value, "<get-networkStateService>(...)");
            if (((INetworkStateService) value).getEffectiveConnectionType() <= i && o.LJ(c64907Pdf.LIZIZ.LJI.LIZJ("pull_type"), CardStruct.IStatusCode.DEFAULT)) {
                c64907Pdf.LIZIZ.LJI.LIZLLL("retry", "-1");
                java.util.Map<String, Object> map = c64907Pdf.LJIIJ.LJJJLL;
                o.LJIIIIZZ(map, "request.metrics.bizExtraInfo");
                ((HashMap) map).put("retry", -1);
            }
        }
        if (i2 == 1 && o.LJ(c64907Pdf.LIZIZ.LJI.LIZJ("pull_type"), "4")) {
            c64907Pdf.LIZIZ.LJI.LIZLLL("retry", "-1");
            java.util.Map<String, Object> map2 = c64907Pdf.LJIIJ.LJJJLL;
            o.LJIIIIZZ(map2, "request.metrics.bizExtraInfo");
            ((HashMap) map2).put("retry", -1);
        }
    }
}
