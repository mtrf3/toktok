package X;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: X.Zey, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90468Zey {
    public static final Pattern LIZ = PatternProtector.compile("urn:x-cast:[-A-Za-z0-9_]+(\\.[-A-Za-z0-9_]+)*");
    public static final Random LIZIZ = new Random(SystemClock.elapsedRealtime());

    public static double LIZ(long j) {
        return j / 1000.0d;
    }

    public static long LIZJ(double d) {
        return (long) (d * 1000.0d);
    }

    public static void LIZLLL(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (str.length() <= 128) {
                if (str.startsWith("urn:x-cast:")) {
                    if (str.length() != 11) {
                        return;
                    } else {
                        throw new IllegalArgumentException("Namespace must begin with the prefix \"urn:x-cast:\" and have non-empty suffix");
                    }
                }
                throw new IllegalArgumentException("Namespace must begin with the prefix \"urn:x-cast:\"");
            }
            throw new IllegalArgumentException("Invalid namespace length");
        }
        throw new IllegalArgumentException("Namespace cannot be null or empty");
    }

    public static List<Integer> LJ(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }

    public static int[] LJI(Collection<Integer> collection) {
        int[] iArr = new int[collection.size()];
        Iterator<Integer> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = it.next().intValue();
            i++;
        }
        return iArr;
    }

    public static String LIZIZ(String str, JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has(str)) {
            return jSONObject.optString(str);
        }
        return null;
    }

    public static <T> boolean LJFF(T t, T t2) {
        if (t == null) {
            if (t2 == null) {
                return true;
            }
        } else {
            if (t != null && t2 != null && t.equals(t2)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
