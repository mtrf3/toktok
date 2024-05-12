package com.ss.android.ttve.nativePort;

import X.C16880lQ;
import X.C63836P3o;
import X.EnumC63837P3p;
import android.content.Context;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Build;
import android.util.Pair;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.vesdk.runtime.VERuntime;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes12.dex */
public class TESystemUtils {
    public static int getOutputAudioDeviceType() {
        if (Build.VERSION.SDK_INT >= 23) {
            new C63836P3o();
            return C63836P3o.LIZ().ordinal();
        }
        return EnumC63837P3p.DEFAULT.ordinal();
    }

    public static Pair<Integer, Integer> getSuggestedOutputProperty() {
        Context context = VERuntime.getInstance().getContext();
        if (context == null) {
            return null;
        }
        AudioManager audioManager = (AudioManager) C16880lQ.LLILL(context, "audio");
        String property = audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
        String property2 = audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER");
        try {
            return new Pair<>(Integer.valueOf(CastIntegerProtector.parseInt(property)), Integer.valueOf(CastIntegerProtector.parseInt(property2)));
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean hasLowLatencyFeature() {
        PackageManager packageManager;
        Context context = VERuntime.getInstance().getContext();
        if (context == null || (packageManager = context.getPackageManager()) == null) {
            return false;
        }
        return packageManager.hasSystemFeature("android.hardware.audio.low_latency");
    }

    public static int getAudioTrackBufferSize(int i) {
        return AudioTrack.getMinBufferSize(i, 12, 2);
    }

    public static int getOutputLatency(int i) {
        try {
            Class<?> cls = Class.forName("android.media.AudioSystem");
            Method declaredMethod = cls.getDeclaredMethod("getOutputLatency", Integer.TYPE);
            if (declaredMethod == null) {
                return 0;
            }
            declaredMethod.setAccessible(true);
            return ((Integer) declaredMethod.invoke(cls, Integer.valueOf(i))).intValue();
        } catch (ClassNotFoundException e) {
            C16880lQ.LLLLIIL(e);
            return 0;
        } catch (IllegalAccessException e2) {
            C16880lQ.LLLLIIL(e2);
            return 0;
        } catch (NoSuchMethodException e3) {
            C16880lQ.LLLLIIL(e3);
            return 0;
        } catch (InvocationTargetException e4) {
            C16880lQ.LLLLIIL(e4);
            return 0;
        }
    }
}
