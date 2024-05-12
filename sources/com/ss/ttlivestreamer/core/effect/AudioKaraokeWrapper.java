package com.ss.ttlivestreamer.core.effect;

import X.C06460Ne;
import X.X1D;
import com.ss.ttlivestreamer.core.engine.NativeObject;
import com.ss.ttlivestreamer.core.utils.AVLog;
import java.nio.Buffer;

/* loaded from: classes12.dex */
public class AudioKaraokeWrapper extends NativeObject {
    public int mChannels;

    public static native long nativeCreate(int i, int i2, String str, String str2);

    public static native int[] nativeGetMidiDrawingData(String str, int[] iArr);

    private native void nativeGetScoreInfo(double[] dArr, long j);

    private native void nativeProcess(Buffer buffer, int i, int i2, long j);

    public native void nativeSeekLyricPos(double d);

    public native void nativeSetTranspose(int i);

    public AudioKaraokeWrapper() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Ctor AudioKaraokeWrapper ");
        LIZ.append(this);
        AVLog.iod("AudioKaraokeWrapper", X1D.LIZIZ(LIZ));
    }

    public void getScoreInfo(double[] dArr) {
        nativeGetScoreInfo(dArr, this.mNativeObj);
    }

    public void process(Buffer buffer, int i) {
        nativeProcess(buffer, this.mChannels, i, this.mNativeObj);
    }

    public static AudioKaraokeWrapper create(int i, int i2, String str, String str2) {
        AudioKaraokeWrapper audioKaraokeWrapper = new AudioKaraokeWrapper();
        if (str != null && str2 != null && audioKaraokeWrapper.init(i, i2, str, str2)) {
            return audioKaraokeWrapper;
        }
        return null;
    }

    private boolean init(int i, int i2, String str, String str2) {
        long nativeCreate = nativeCreate(i, i2, str, str2);
        if (nativeCreate != 0) {
            setNativeObj(nativeCreate);
            this.mChannels = i2;
            return true;
        }
        StringBuilder LIZJ = C06460Ne.LIZJ("Init failed with sample ", i, " channel ", i2, " midiFile ");
        LIZJ.append(str);
        LIZJ.append(" lyricFile ");
        LIZJ.append(str2);
        AVLog.ioe("AudioKaraokeWrapper", X1D.LIZIZ(LIZJ));
        return false;
    }
}
