package X;

import android.content.Context;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveExchangeConfirmThreshold;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.ss.android.ugc.aweme.ecommerce.core.preloader.ImagePreloadExperiment;
import java.util.LinkedList;

/* loaded from: classes15.dex */
public final class VYB {
    public final LinkedList<VYC> LIZ;
    public long LIZIZ;

    public final void LIZ(float f) {
        int size = this.LIZ.size() - 1;
        for (int i = 0; i < size; i++) {
            if (f <= this.LIZ.get(i).LIZ && f > this.LIZ.get(i + 1).LIZ) {
                this.LIZIZ = this.LIZ.get(i).LIZIZ;
                return;
            }
        }
        this.LIZIZ = this.LIZ.get(r1.size() - 1).LIZIZ;
    }

    public VYB(Context context, float f) {
        float LIZ = J75.LIZ(context, 64.0f);
        LinkedList<VYC> linkedList = new LinkedList<>();
        this.LIZ = linkedList;
        linkedList.add(new VYC(10000000 / LIZ, 10000000L));
        linkedList.add(new VYC(1000000 / LIZ, 1000000L));
        linkedList.add(new VYC(500000 / LIZ, 500000L));
        linkedList.add(new VYC(ImagePreloadExperiment.PRIORITY_DEFAULT / LIZ, 100000L));
        linkedList.add(new VYC(LiveExchangeConfirmThreshold.DEFAULT / LIZ, 50000L));
        linkedList.add(new VYC(20000 / LIZ, 20000L));
        linkedList.add(new VYC(10000 / LIZ, 10000L));
        linkedList.add(new VYC(3000 / LIZ, 3000L));
        linkedList.add(new VYC(LiveNetAdaptiveHurryTimeSetting.DEFAULT / LIZ, 2000L));
        linkedList.add(new VYC(1000 / LIZ, 1000L));
        linkedList.add(new VYC(LiveMaxRetainAlogMessageSizeSetting.DEFAULT / LIZ, 500L));
        linkedList.add(new VYC(200 / LIZ, 200L));
        linkedList.add(new VYC(100 / LIZ, 100L));
        LIZ(f);
    }
}
