package X;

import android.media.AudioRecord;

/* loaded from: classes12.dex */
public final class P3K implements InterfaceC63834P3m<Object> {
    public final /* synthetic */ AudioRecord LIZ;

    @Override // X.InterfaceC63834P3m
    public final Object invoke() {
        AudioRecord audioRecord = this.LIZ;
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = new Object[0];
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "()V", "-5749757324009084451");
        if (c03880Dg.LIZJ(100400, "android/media/AudioRecord", "startRecording", audioRecord, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(100400, "android/media/AudioRecord", "startRecording", null, objArr, audioRecord, c65300Pk0, false);
            return null;
        }
        audioRecord.startRecording();
        c03880Dg.LIZIZ(100400, "android/media/AudioRecord", "startRecording", null, objArr, audioRecord, c65300Pk0, true);
        return null;
    }

    public P3K(AudioRecord audioRecord) {
        this.LIZ = audioRecord;
    }
}