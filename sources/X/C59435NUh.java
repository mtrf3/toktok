package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.NUh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59435NUh extends BroadcastReceiver {
    public final NRH LIZ;
    public int LIZIZ;

    public C59435NUh(NRH nrh) {
        this.LIZ = nrh;
        this.LIZIZ = nrh.LIZ();
    }

    public final void LIZ(Intent intent) {
        String str;
        int i = -1;
        if (intent != null) {
            i = intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1);
        }
        String str2 = null;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (!o.LJ("android.media.VOLUME_CHANGED_ACTION", str) || i != 3) {
            if (intent != null) {
                str2 = intent.getAction();
            }
            if (!o.LJ("android.media.STREAM_MUTE_CHANGED_ACTION", str2)) {
                return;
            }
        }
        NRH nrh = this.LIZ;
        NSP nsp = nrh.LIZIZ;
        int i2 = this.LIZIZ;
        int LIZ = nrh.LIZ();
        this.LIZIZ = LIZ;
        if (nsp != null) {
            if (LIZ == 0) {
                if (i2 > 0) {
                    nsp.LIZ.LJIJJLI(true, nsp.LIZIZ);
                }
            } else {
                if (LIZ <= 0 || i2 != 0) {
                    return;
                }
                nsp.LIZ.LJIJJLI(false, nsp.LIZIZ);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            LIZ(intent);
        } else {
            C38523F9z.LIZ();
            LIZ(intent);
        }
    }
}
