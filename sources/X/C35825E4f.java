package X;

import android.content.Context;
import com.ss.android.ugc.aweme.lancet.AdjustSampleRateSetting;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/* renamed from: X.E4f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35825E4f {
    public static final List<String> LIZ = Arrays.asList("LiveBroadcastActivity", "LivePlayActivity");
    public static final Random LIZIZ = new Random();

    public static boolean LIZ() {
        if (LIZIZ.nextFloat() < AdjustSampleRateSetting.getSampleRate()) {
            return true;
        }
        return false;
    }

    public static void LIZIZ(int i, long j, Context context, String str) {
        C37179EiV.LIZJ(false).execute(new RunnableC36852EdE(str, i, C16880lQ.LLLLIIIILLL().getName(), context, j, System.currentTimeMillis() - C56662Kg.LIZ().LJIIJ));
    }
}
