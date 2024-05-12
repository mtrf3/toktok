package X;

import Y.IDBReceiverS10S0100000_14;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.XNp, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84741XNp {
    public final Context LIZ;
    public final InterfaceC80022Vas LIZIZ;
    public final InterfaceC80025Vav LIZJ;
    public final InterfaceC84737XNl LIZLLL;
    public final C62822Ol8 LJ;
    public final MediaSessionCompat LJFF;
    public final C62822Ol8 LJI;
    public final C62822Ol8 LJII;

    public final C01P LIZ() {
        return (C01P) this.LJII.getValue();
    }

    public final void LIZIZ() {
        try {
            MediaSessionCompat mediaSessionCompat = this.LJFF;
            mediaSessionCompat.LJ(false);
            mediaSessionCompat.LJFF(null, null);
            mediaSessionCompat.LIZLLL();
            C16880lQ.LJJLIIIJL(this.LIZ, (IDBReceiverS10S0100000_14) this.LJ.getValue());
        } catch (Throwable unused) {
        }
    }

    public final void LJ() {
        EnumC79954VZm LJ = this.LIZIZ.LJ();
        int i = C79955VZn.LIZ[LJ.ordinal()];
        boolean z = true;
        int i2 = 3;
        if (i != 1 && i != 2) {
            if (i != 3) {
                if (i == 4 || i == 5) {
                    i2 = 1;
                } else {
                    throw new C162476Zf();
                }
            } else {
                i2 = 2;
            }
        }
        ((C007501f) this.LJI.getValue()).LJFF = 822L;
        ((C007501f) this.LJI.getValue()).LIZIZ(i2, this.LIZIZ.getCurrentPlaybackTime());
        this.LJFF.LJII(((C007501f) this.LJI.getValue()).LIZ());
        MediaSessionCompat mediaSessionCompat = this.LJFF;
        if (LJ == EnumC79954VZm.PLAYBACK_STATE_STOPPED) {
            z = false;
        }
        mediaSessionCompat.LJ(z);
    }

    public final void LIZLLL() {
        long j;
        C01P LIZ = LIZ();
        V1L LIZ2 = this.LIZJ.LIZ();
        if (LIZ2 != null) {
            j = LIZ2.getDuration();
        } else {
            j = 0;
        }
        long duration = this.LIZIZ.getDuration();
        if (duration > 0) {
            j = duration;
        }
        LIZ.LIZJ(j);
        this.LJFF.LJI(LIZ().LIZ());
    }

    public final void LIZJ(Bitmap bitmap) {
        if (o.LJ(Build.MANUFACTURER, "Xiaomi")) {
            if (bitmap != null && bitmap.isRecycled()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("coverBitmap(");
                LIZ.append(bitmap);
                LIZ.append(") already recycled.");
                J7Z.LIZJ("MediaSessionController", X1D.LIZIZ(LIZ));
                return;
            }
            LIZ().LIZIZ(bitmap, "android.media.metadata.ART");
            this.LJFF.LJI(LIZ().LIZ());
        }
    }

    public C84741XNp(Context context, C48649J7l musicPlayer, C48653J7p musicQueue, C48652J7o musicPlayerQueueController, ComponentName mediaButtonReceiverComponentName) {
        int i;
        o.LJIIIZ(musicPlayer, "musicPlayer");
        o.LJIIIZ(musicQueue, "musicQueue");
        o.LJIIIZ(musicPlayerQueueController, "musicPlayerQueueController");
        o.LJIIIZ(mediaButtonReceiverComponentName, "mediaButtonReceiverComponentName");
        this.LIZ = context;
        this.LIZIZ = musicPlayer;
        this.LIZJ = musicQueue;
        this.LIZLLL = musicPlayerQueueController;
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS164S0100000_14(this, 399));
        this.LJ = LIZIZ;
        this.LJI = C221108m2.LIZIZ(XOJ.LJLIL);
        this.LJII = C221108m2.LIZIZ(XOI.LJLIL);
        MediaSessionCompat mediaSessionCompat = new MediaSessionCompat(context, "MediaSessionController", null, null);
        Intent component = new Intent("android.intent.action.MEDIA_BUTTON").setComponent(mediaButtonReceiverComponentName);
        if (Build.VERSION.SDK_INT >= 23) {
            i = 67108864;
        } else {
            i = 0;
        }
        mediaSessionCompat.LIZ.LIZ.setMediaButtonReceiver(PendingIntent.getService(context, 0, component, i));
        mediaSessionCompat.LJFF(new C84746XNu(mediaSessionCompat, this), null);
        mediaSessionCompat.LIZ.LIZ.setFlags(3);
        this.LJFF = mediaSessionCompat;
        C16880lQ.LJJLIIIJILLIZJL((BroadcastReceiver) LIZIZ.getValue(), context, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
    }
}
