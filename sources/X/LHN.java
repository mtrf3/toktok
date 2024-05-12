package X;

import android.content.Context;
import com.ss.android.ugc.aweme.friendstab.model.SingleTabCounter;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LHN {
    public static String LIZ = "";

    public static void LIZ(Context context, String landingTag) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(landingTag, "landingTag");
        SingleTabCounter singleTabCounter = null;
        String LJ = C54024LIe.LJ(C45804HyK.LJJIFFI(context), LIZ, null);
        o.LJ(landingTag, "FRIENDS_FEED");
        ArrayList<SingleTabCounter> wE = C36207EIx.LIZ().wE();
        Iterator<SingleTabCounter> it = wE.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            i2 += it.next().getNumberCount();
        }
        Iterator<SingleTabCounter> it2 = wE.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            SingleTabCounter next = it2.next();
            if (o.LJ(next.getTag(), "FRIENDS_FEED")) {
                singleTabCounter = next;
                break;
            }
        }
        SingleTabCounter singleTabCounter2 = singleTabCounter;
        if (singleTabCounter2 != null) {
            i = singleTabCounter2.getNumberCount();
        }
        C10K.LIZJ(new LHV(LJ, i2, i));
    }
}
