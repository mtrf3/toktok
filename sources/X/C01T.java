package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: X.01T, reason: invalid class name */
/* loaded from: classes.dex */
public class C01T extends Handler {
    public boolean LIZ;
    public final /* synthetic */ C01U LIZIZ;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (!this.LIZ) {
            return;
        }
        switch (message.what) {
            case 1:
                MediaSessionCompat.LIZ(message.getData());
                this.LIZIZ.getClass();
                return;
            case 2:
                this.LIZIZ.LIZIZ((PlaybackStateCompat) message.obj);
                return;
            case 3:
                this.LIZIZ.LIZ((MediaMetadataCompat) message.obj);
                return;
            case 4:
                this.LIZIZ.getClass();
                return;
            case 5:
                this.LIZIZ.getClass();
                return;
            case 6:
                this.LIZIZ.getClass();
                return;
            case 7:
                MediaSessionCompat.LIZ((Bundle) message.obj);
                this.LIZIZ.getClass();
                return;
            case 8:
                this.LIZIZ.LIZJ();
                return;
            case 9:
                C01U c01u = this.LIZIZ;
                ((Integer) message.obj).intValue();
                c01u.getClass();
                return;
            case 10:
            default:
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                C01U c01u2 = this.LIZIZ;
                ((Boolean) message.obj).booleanValue();
                c01u2.getClass();
                return;
            case 12:
                C01U c01u3 = this.LIZIZ;
                ((Integer) message.obj).intValue();
                c01u3.getClass();
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                this.LIZIZ.getClass();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01T(C01U c01u, Looper looper) {
        super(looper);
        this.LIZIZ = c01u;
    }
}
