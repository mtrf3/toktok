package X;

import android.util.Pair;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.ies.ugc.aweme.commercialize.splash.report.ITopViewAdEventLogger;
import com.bytedance.ies.ugc.aweme.commercialize.splash.report.TopViewAdEventLogger;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS12S2000000_10;
import kotlin.jvm.internal.AqS33S1000000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NLN extends AbstractC61537ODd {
    public final AwemeRawAd LIZ;
    public final List<String> LIZIZ;
    public final String LIZJ;

    @Override // X.AbstractC61537ODd
    public final void LIZLLL(Throwable th, java.util.Map map) {
        Iterator<String> it = this.LIZIZ.iterator();
        while (it.hasNext()) {
            LJIILLIIL(it.next(), "check_server_fail");
        }
    }

    @Override // X.AbstractC61537ODd
    public final void LJFF(java.util.Map<String, List<Pair<String, Long>>> map, java.util.Map<String, List<UpdatePackage>> map2) {
        List<UpdatePackage> list;
        List<Pair<String, Long>> list2;
        for (String str : this.LIZIZ) {
            if (map != null && (list2 = map.get(this.LIZJ)) != null) {
                Iterator<Pair<String, Long>> it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Pair<String, Long> next = it.next();
                    if (o.LJ(next.first, str)) {
                        if (next == null) {
                        }
                    }
                }
            }
            if (map2 != null && (list = map2.get(this.LIZJ)) != null) {
                Iterator<UpdatePackage> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    UpdatePackage next2 = it2.next();
                    if (o.LJ(next2.getChannel(), str)) {
                        if (next2 == null) {
                        }
                    }
                }
            }
            LJIILLIIL(str, "invalid_channel");
        }
    }

    @Override // X.AbstractC61537ODd
    public final void LJIIJJI(String str, Throwable th) {
        if (str != null) {
            LJIILLIIL(str, "update_fail");
        }
    }

    @Override // X.AbstractC61537ODd
    public final void LJIILJJIL(long j, String str) {
        if (str != null) {
            ITopViewAdEventLogger LJJIJ = TopViewAdEventLogger.LJJIJ();
            NMA.LIZ.getClass();
            LJJIJ.LJIIIZ(NMA.LJJIIJZLJL, this.LIZ, new AqS33S1000000_10(str, 9));
        }
    }

    public final void LJIILLIIL(String str, String str2) {
        ITopViewAdEventLogger LJJIJ = TopViewAdEventLogger.LJJIJ();
        NMA.LIZ.getClass();
        LJJIJ.LJIIIZ(NMA.LJJIIZ, this.LIZ, new AqS12S2000000_10(str, str2, 0));
    }

    public NLN(AwemeRawAd awemeRawAd, List<String> channelList, String str) {
        o.LJIIIZ(awemeRawAd, "awemeRawAd");
        o.LJIIIZ(channelList, "channelList");
        this.LIZ = awemeRawAd;
        this.LIZIZ = channelList;
        this.LIZJ = str;
    }
}
