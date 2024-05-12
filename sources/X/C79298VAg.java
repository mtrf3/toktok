package X;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Collections;

/* renamed from: X.VAg, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C79298VAg implements InvocationHandler {
    public final VBH LIZ;

    public C79298VAg(VBH vbh) {
        this.LIZ = vbh;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        VBH vbh;
        if (TextUtils.equals("onPreloadEvent", method.getName()) && objArr.length >= 2 && (vbh = this.LIZ) != null) {
            int intValue = ((Integer) objArr[0]).intValue();
            Bundle bundle = (Bundle) objArr[1];
            VAJ vaj = (VAJ) vbh;
            if (bundle.getInt("mode", 0) == 1) {
                Bundle bundle2 = bundle.getBundle("ext_info");
                if (bundle2 != null) {
                    int i = bundle2.getInt("mpd_updating", 0);
                    int i2 = bundle2.getInt("mpd_update_int", LiveNetAdaptiveHurryTimeSetting.DEFAULT);
                    vaj.LJIIJJI(intValue, i, bundle);
                    if (intValue == 1) {
                        synchronized (vaj.LJJJI) {
                            vaj.LJJJIL.add(new C79311VAt(Long.valueOf(SystemClock.uptimeMillis() + i2), bundle2));
                            Collections.sort(vaj.LJJJIL);
                        }
                        return null;
                    }
                    return null;
                }
                return null;
            }
            vaj.LJIIJJI(intValue, 0, bundle);
            return null;
        }
        return null;
    }
}
