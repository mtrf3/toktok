package X;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import kotlin.jvm.internal.o;

/* renamed from: X.Imq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47640Imq {
    public static final C47640Imq LIZ;
    public static AudioDeviceInfo[] LIZIZ;
    public static final AudioManager LIZJ;

    static {
        C47640Imq c47640Imq = new C47640Imq();
        LIZ = c47640Imq;
        Object LLILL = C16880lQ.LLILL(EF7.LIZIZ(), "audio");
        o.LJII(LLILL, "null cannot be cast to non-null type android.media.AudioManager");
        AudioManager audioManager = (AudioManager) LLILL;
        LIZJ = audioManager;
        C38995FSd.LIZIZ().execute(new RunnableC47639Imp(c47640Imq));
        audioManager.registerAudioDeviceCallback(new C47641Imr(), null);
    }
}
