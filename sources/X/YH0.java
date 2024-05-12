package X;

import com.ss.android.ugc.aweme.commercialize.measurement.mrc.MRCManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YH0 implements YHB {
    public final /* synthetic */ YH1 LIZ;
    public final /* synthetic */ MRCManager LIZIZ;

    @Override // X.YHB
    public final String LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // X.YHB
    public final boolean isPlaying() {
        return this.LIZ.isPlaying();
    }

    public YH0(NT5 nt5, MRCManager mRCManager) {
        this.LIZ = nt5;
        this.LIZIZ = mRCManager;
    }

    @Override // X.YHB
    public final void LIZIZ(String id, String str, YH3 yh3) {
        Aweme aweme;
        o.LJIIIZ(id, "id");
        OSZ osz = (OSZ) ((LinkedHashMap) this.LIZIZ.LIZIZ).get(id);
        if (osz != null && (aweme = (Aweme) osz.getFirst()) != null) {
            C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "viewable_impression", aweme.getAwemeRawAd());
            LIZLLL.LIZIZ(yh3.getLabel(), "viewable_length");
            LIZLLL.LIZIZ(str, "trigger_from");
            LIZLLL.LJI();
        }
    }

    @Override // X.YHB
    public final void LIZJ(String id, float f, float f2, String str, long j, long j2, long j3) {
        Aweme aweme;
        o.LJIIIZ(id, "id");
        OSZ osz = (OSZ) ((LinkedHashMap) this.LIZIZ.LIZIZ).get(id);
        if (osz != null && (aweme = (Aweme) osz.getFirst()) != null) {
            MRCManager mRCManager = this.LIZIZ;
            float f3 = 100;
            float rint = ((float) Math.rint(f * f3)) / f3;
            float rint2 = ((float) Math.rint(f2 * f3)) / f3;
            C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "piv_tracker", aweme.getAwemeRawAd());
            LIZLLL.LIZIZ(Float.valueOf(rint), "piv_max");
            LIZLLL.LIZIZ(Float.valueOf(rint2), "piv_ad_metadata");
            LIZLLL.LIZIZ(Long.valueOf(j), "piv_calculate_play_continuous");
            LIZLLL.LIZIZ(Long.valueOf(j2), "piv_calculate_count");
            LIZLLL.LIZIZ(Long.valueOf(j3), "piv_calculate_count_invalid");
            LIZLLL.LJI();
            OSZ osz2 = (OSZ) ((LinkedHashMap) mRCManager.LIZIZ).get(id);
            if (osz2 != null) {
                Aweme aweme2 = (Aweme) osz2.getFirst();
                Object second = osz2.getSecond();
                if (YH8.LIZ().enableMRC && aweme2.isAd() && mRCManager.LIZJ.contains(second)) {
                    mRCManager.LIZ.remove(MRCManager.LIZLLL((Aweme) osz2.getFirst(), (NT4) osz2.getSecond()));
                    mRCManager.LIZIZ.remove(id);
                }
            }
        }
    }
}
