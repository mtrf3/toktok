package com.byted.cast.sdk.monitor;

import X.V0N;
import com.byted.cast.common.CastLogger;
import com.byted.cast.common.ContextManager;

/* loaded from: classes29.dex */
public class AudioMonitor {
    public OnAudioChangeListener mAudioChangeListener;
    public ContextManager.CastContext mCastContext;
    public CastLogger mLogger;

    /* loaded from: classes29.dex */
    public interface OnAudioChangeListener {
        void onAudioChanged(AudioDevice audioDevice, boolean z, int i);
    }

    /* loaded from: classes29.dex */
    public enum AudioDevice {
        DEVICE_UNKNOWN(-1),
        BUILTIN(0),
        BLUETOOTH(1),
        EARPIECE(2),
        EXTERNAL(3);

        public final int value;

        public int getValue() {
            return this.value;
        }

        public static AudioDevice valueOf(String str) {
            return (AudioDevice) V0N.LJJJ(AudioDevice.class, str);
        }

        AudioDevice(int i) {
            this.value = i;
        }
    }

    public AudioMonitor(ContextManager.CastContext castContext) {
        this.mCastContext = castContext;
        this.mLogger = ContextManager.getLogger(castContext);
    }

    public void setOnAudioChangeListener(OnAudioChangeListener onAudioChangeListener) {
        this.mAudioChangeListener = onAudioChangeListener;
    }
}
