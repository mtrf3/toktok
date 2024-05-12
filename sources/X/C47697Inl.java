package X;

import android.os.Build;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: X.Inl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47697Inl {
    public static final java.util.Map<String, Integer> LIZ;

    static {
        HashMap hashMap = new HashMap();
        LIZ = hashMap;
        Integer valueOf = Integer.valueOf(LiveTryModeCountDownThresholdSetting.DEFAULT);
        hashMap.put("sdm660", valueOf);
        hashMap.put("msm8994", valueOf);
        hashMap.put("sdm845", 240);
        hashMap.put("sm8150", 480);
    }

    public static String LIZ() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/cpuinfo"));
            String str = "";
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                str = readLine;
            }
            if (str.contains("Hardware")) {
                return str.split(":\\s+", 2)[1];
            }
        } catch (FileNotFoundException e) {
            C16880lQ.LLLLIIL(e);
        } catch (IOException e2) {
            C16880lQ.LLLLIIL(e2);
        }
        return Build.HARDWARE;
    }
}
