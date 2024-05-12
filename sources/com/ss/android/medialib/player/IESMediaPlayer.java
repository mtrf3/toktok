package com.ss.android.medialib.player;

import X.C16880lQ;
import X.InterfaceC39806Fjm;
import android.content.Context;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Surface;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.medialib.model.Point;
import com.ss.android.ttve.nativePort.TENativeLibsLoader;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public class IESMediaPlayer {
    public Context context;
    public long mHandle = nativeCreatePlayer();
    public InterfaceC39806Fjm mInfoListener;

    private native long nativeCreatePlayer();

    private native long nativeCurrentPosition(long j);

    private native int nativeDeleteSeg(long j, int i);

    private native int nativeFillBackgroundColor(long j, int i);

    private native long nativeGetDuration(long j);

    private native long[] nativeGetDurations(long j);

    private native boolean nativeIsMultiSpeedSupported(long j, int i);

    private native boolean nativeIsPlaying(long j);

    private native boolean nativeIsSeeking(long j);

    private native int nativePause(long j);

    private native int nativePrepare(long j, String[] strArr, int i, int i2);

    private native void nativeRelease(long j);

    private native int nativeResume(long j);

    private native int nativeSeek(long j, long j2, int i);

    private native int nativeSelect(long j, int i);

    private native void nativeSetBoundary(long j, int i, long j2, long j3);

    private native void nativeSetLoop(long j, boolean z);

    private native int nativeSetSegPoints(long j, int i, long[] jArr);

    private native int nativeSetSegRotation(long j, int i, int i2);

    private native void nativeSetSpeed(long j, int i, double d);

    private native void nativeSetVolume(long j, double d);

    private native int nativeStart(long j, Surface surface);

    private native void nativeStop(long j);

    public void onInfo(int i, int i2) {
    }

    public void setMessageListener(InterfaceC39806Fjm interfaceC39806Fjm) {
    }

    public long getCurrentPosition() {
        long j = this.mHandle;
        if (j == 0) {
            return 0L;
        }
        return nativeCurrentPosition(j);
    }

    public long getDuration() {
        long j = this.mHandle;
        if (j == 0) {
            return 0L;
        }
        return nativeGetDuration(j);
    }

    public List<Long> getDurations() {
        ArrayList arrayList = new ArrayList();
        long j = this.mHandle;
        if (j == 0) {
            return arrayList;
        }
        long[] nativeGetDurations = nativeGetDurations(j);
        if (nativeGetDurations != null) {
            for (long j2 : nativeGetDurations) {
                arrayList.add(Long.valueOf(j2));
            }
        }
        return arrayList;
    }

    public boolean isPlaying() {
        long j = this.mHandle;
        if (j == 0) {
            return false;
        }
        return nativeIsPlaying(j);
    }

    public boolean isSeeking() {
        long j = this.mHandle;
        if (j == 0) {
            return false;
        }
        return nativeIsSeeking(j);
    }

    public int pause() {
        long j = this.mHandle;
        if (j == 0) {
            return -1;
        }
        return nativePause(j);
    }

    public void release() {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        nativeRelease(j);
        this.mHandle = 0L;
    }

    public int resume() {
        long j = this.mHandle;
        if (j == 0) {
            return -1;
        }
        return nativeResume(j);
    }

    public void stop() {
        long j = this.mHandle;
        if (j != 0) {
            nativeStop(j);
        }
    }

    public int unSelect() {
        long j = this.mHandle;
        if (j == 0) {
            return -1;
        }
        return nativeSelect(j, -1);
    }

    static {
        TENativeLibsLoader.loadRecorder();
    }

    public IESMediaPlayer(Context context) {
        this.context = context;
    }

    public int deleteSeg(int i) {
        long j = this.mHandle;
        if (j == 0) {
            return -1;
        }
        if (i < 0) {
            return -2;
        }
        return nativeDeleteSeg(j, i);
    }

    public int fillBackgroundColor(int i) {
        long j = this.mHandle;
        if (j == 0) {
            return -1;
        }
        return nativeFillBackgroundColor(j, i);
    }

    public boolean isSegMultiSpeedSupported(int i) {
        long j = this.mHandle;
        if (j == 0) {
            return false;
        }
        return nativeIsMultiSpeedSupported(j, i);
    }

    public int prepare(List<String> list) {
        int i;
        int i2;
        if (this.mHandle == 0) {
            return -1;
        }
        if (list == null || list.isEmpty()) {
            return -2;
        }
        Context context = this.context;
        if (context != null) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                packageManager.hasSystemFeature("android.hardware.audio.low_latency");
                packageManager.hasSystemFeature("android.hardware.audio.pro");
            }
            AudioManager audioManager = (AudioManager) C16880lQ.LLILL(context, "audio");
            String property = audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
            int i3 = 44100;
            if (!TextUtils.isEmpty(property)) {
                try {
                    i3 = CastIntegerProtector.parseInt(property);
                } catch (Exception unused) {
                }
            }
            String property2 = audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER");
            int i4 = 256;
            if (!TextUtils.isEmpty(property2)) {
                try {
                    i4 = CastIntegerProtector.parseInt(property2);
                } catch (Exception unused2) {
                }
            }
            Pair pair = new Pair(Integer.valueOf(i3), Integer.valueOf(i4));
            i = ((Integer) pair.first).intValue();
            i2 = ((Integer) pair.second).intValue();
        } else {
            i = 0;
            i2 = 0;
        }
        return nativePrepare(this.mHandle, (String[]) list.toArray(new String[list.size()]), i, i2);
    }

    public int seek(long j) {
        return seek(j, 0);
    }

    public int seekLeft(long j) {
        return seek(j, -1);
    }

    public int seekRight(long j) {
        return seek(j, 1);
    }

    public int select(int i) {
        long j = this.mHandle;
        if (j == 0) {
            return -1;
        }
        if (i < 0) {
            return -2;
        }
        return nativeSelect(j, i);
    }

    public void setLoop(boolean z) {
        long j = this.mHandle;
        if (j != 0) {
            nativeSetLoop(j, z);
        }
    }

    public void setSpeed(double d) {
        setSegSpeed(-1, d);
    }

    public void setVolume(double d) {
        long j = this.mHandle;
        if (j != 0) {
            nativeSetVolume(j, d);
        }
    }

    public int start(Surface surface) {
        long j = this.mHandle;
        if (j == 0) {
            return -1;
        }
        return nativeStart(j, surface);
    }

    public int prepare(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        return prepare(arrayList);
    }

    private int seek(long j, int i) {
        long j2 = this.mHandle;
        if (j2 == 0) {
            return -1;
        }
        return nativeSeek(j2, j, i);
    }

    public void setBoundary(long j, long j2) {
        long j3 = this.mHandle;
        if (j3 != 0) {
            nativeSetBoundary(j3, -1, j, j2);
        }
    }

    public int setSegPoints(int i, List<Point> list) {
        if (this.mHandle == 0) {
            return -1;
        }
        if (list == null || list.isEmpty()) {
            return -2;
        }
        long[] jArr = new long[list.size()];
        int size = list.size();
        for (int i2 = 0; i2 < size; i2 += 2) {
            Point point = (Point) ListProtector.get(list, i2);
            if (point == null) {
                jArr[i2] = -1;
                jArr[i2 + 1] = -1;
            } else {
                jArr[i2] = point.getLeft();
                jArr[i2 + 1] = point.getRight();
            }
        }
        return nativeSetSegPoints(this.mHandle, i, jArr);
    }

    public void setSegRotation(int i, int i2) {
        if (i < 0) {
            return;
        }
        long j = this.mHandle;
        if (j != 0) {
            nativeSetSegRotation(j, i, i2);
        }
    }

    public void setSegSpeed(int i, double d) {
        long j = this.mHandle;
        if (j != 0) {
            nativeSetSpeed(j, i, d);
        }
    }

    public void setSegBoundary(int i, long j, long j2) {
        if (i < 0) {
            return;
        }
        long j3 = this.mHandle;
        if (j3 != 0) {
            nativeSetBoundary(j3, i, j, j2);
        }
    }
}
