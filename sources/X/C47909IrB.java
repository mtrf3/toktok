package X;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.IrB, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47909IrB extends C47849IqD {
    public final InterfaceC88472Yns<Integer, C76800UCe> LIZIZ;
    public final WeakReference<AudioManager> LIZJ;

    public final void LIZIZ(Intent intent) {
        WeakReference<AudioManager> weakReference;
        WeakReference<AudioManager> weakReference2;
        AudioManager audioManager;
        o.LJIIIZ(intent, "intent");
        try {
            if (o.LJ(intent.getAction(), "android.media.VOLUME_CHANGED_ACTION") && intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3 && (weakReference = this.LIZJ) != null && weakReference.get() != null && (weakReference2 = this.LIZJ) != null && (audioManager = weakReference2.get()) != null) {
                this.LIZIZ.invoke(Integer.valueOf(audioManager.getStreamVolume(3)));
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47909IrB(AudioManager audioManager, IIP onVolumeChanged) {
        super(audioManager);
        o.LJIIIZ(onVolumeChanged, "onVolumeChanged");
        this.LIZIZ = onVolumeChanged;
        this.LIZJ = new WeakReference<>(audioManager);
    }

    @Override // X.C47849IqD, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            LIZIZ(intent);
        } else {
            C38523F9z.LIZ();
            LIZIZ(intent);
        }
    }
}
