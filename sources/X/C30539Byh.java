package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Byh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30539Byh extends BroadcastReceiver {
    public final InterfaceC65784Pro<C76800UCe> LIZ;

    public C30539Byh(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LIZ = interfaceC65784Pro;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            if (o.LJ(intent.getAction(), "android.media.AUDIO_BECOMING_NOISY")) {
                this.LIZ.invoke();
            }
        } else {
            C38523F9z.LIZ();
            if (!o.LJ(intent.getAction(), "android.media.AUDIO_BECOMING_NOISY")) {
                return;
            }
            this.LIZ.invoke();
        }
    }
}
