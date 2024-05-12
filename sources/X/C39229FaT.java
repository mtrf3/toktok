package X;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import java.util.ArrayList;
import ms.bd.o.a;
import ms.bd.o.b;
import ms.bd.o.k;
import ms.bd.o.l2;

/* renamed from: X.FaT, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39229FaT extends b.a {
    @Override // ms.bd.o.b.a
    public final Object LIZIZ(long j, int i, String str, Object obj) {
        String str2;
        AudioManager audioManager = (AudioManager) C16880lQ.LLILL(a.LIZIZ.LIZ, (String) k.a(16777217, 0, 0L, "577bc4", new byte[]{37, 32, 64, 31, 83}));
        ArrayList arrayList = new ArrayList();
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                for (AudioDeviceInfo audioDeviceInfo : audioManager.getDevices(1)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(audioDeviceInfo.getType());
                    sb.append((String) k.a(16777217, 0, 0L, "b52ac4", new byte[]{76}));
                    int type = audioDeviceInfo.getType();
                    String[] strArr = l2.LIZ;
                    if (type <= strArr.length) {
                        str2 = strArr[type];
                    } else {
                        str2 = (String) k.a(16777217, 0, 0L, "0f154f", new byte[]{21, 93, 114, 100, 52, 68, 29, 108, 78, 74, 22, 74});
                    }
                    sb.append(str2);
                    arrayList.add(sb.toString());
                }
            }
        } catch (Throwable unused) {
        }
        return arrayList.toArray();
    }
}
