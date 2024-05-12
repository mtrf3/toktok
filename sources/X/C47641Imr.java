package X;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* renamed from: X.Imr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47641Imr extends AudioDeviceCallback {
    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        C38995FSd.LIZIZ().execute(new RunnableC47639Imp(C47640Imq.LIZ));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        C38995FSd.LIZIZ().execute(new RunnableC47639Imp(C47640Imq.LIZ));
    }
}
