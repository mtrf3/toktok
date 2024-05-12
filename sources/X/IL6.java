package X;

import com.google.gson.internal.b;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;

/* loaded from: classes9.dex */
public class IL6 implements IXJ<Integer> {
    public final VideoUrlModel LIZ;

    @Override // X.IXJ
    public final /* synthetic */ Integer LIZ() {
        return null;
    }

    @Override // X.IXJ
    public final Integer get() {
        Integer valueOf;
        SimVideoUrlModel LJJIL = b.LJJIL(this.LIZ);
        int i = -1;
        if (LJJIL != null) {
            IYN hitBitrate = LJJIL.getHitBitrate();
            if (hitBitrate == null || (valueOf = Integer.valueOf(hitBitrate.getQualityType())) == null) {
                valueOf = -1;
            }
            i = valueOf.intValue();
        }
        return Integer.valueOf(i);
    }

    public IL6(VideoUrlModel videoUrlModel) {
        this.LIZ = videoUrlModel;
    }
}
