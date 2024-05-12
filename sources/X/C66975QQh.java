package X;

import android.content.Context;
import com.bytedance.push.settings.LocalFrequencySettings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.QQh, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66975QQh {
    public static java.util.Map<Integer, C66977QQj> LIZ;

    public static void LIZ(Context context) {
        if (LIZ != null) {
            return;
        }
        List<C66977QQj> LJJIFFI = ((LocalFrequencySettings) PT6.LIZ(context, LocalFrequencySettings.class)).LJJIFFI();
        if (LJJIFFI == null) {
            LIZ = new HashMap();
            return;
        }
        HashMap hashMap = new HashMap();
        for (C66977QQj c66977QQj : LJJIFFI) {
            if (c66977QQj != null) {
                hashMap.put(Integer.valueOf(c66977QQj.LJ), c66977QQj);
            }
        }
        LIZ = hashMap;
    }

    public static synchronized C66977QQj LIZIZ(int i, Context context) {
        synchronized (C66975QQh.class) {
            LIZ(context);
            java.util.Map<Integer, C66977QQj> map = LIZ;
            if (map == null) {
                return null;
            }
            return (C66977QQj) ((HashMap) map).get(Integer.valueOf(i));
        }
    }

    public static synchronized void LIZJ(Context context, C66977QQj c66977QQj) {
        synchronized (C66975QQh.class) {
            LIZ(context);
            java.util.Map<Integer, C66977QQj> map = LIZ;
            if (map == null) {
                return;
            }
            ((HashMap) map).put(Integer.valueOf(c66977QQj.LJ), c66977QQj);
            ((LocalFrequencySettings) PT6.LIZ(context, LocalFrequencySettings.class)).LJIIJJI(new ArrayList(((HashMap) LIZ).values()));
        }
    }
}
