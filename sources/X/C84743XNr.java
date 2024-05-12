package X;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat;
import kotlin.jvm.internal.o;

/* renamed from: X.XNr, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84743XNr {
    public final MediaSessionCompat LIZ;
    public final C62822Ol8 LIZIZ;
    public final C62822Ol8 LIZJ;
    public final InterfaceC80022Vas LIZLLL;
    public final InterfaceC80025Vav LJ;
    public final InterfaceC84737XNl LJFF;

    public final C01P LIZ() {
        return (C01P) this.LIZJ.getValue();
    }

    public final void LIZIZ() {
        try {
            MediaSessionCompat mediaSessionCompat = this.LIZ;
            mediaSessionCompat.LJ(false);
            mediaSessionCompat.LJFF(null, null);
            mediaSessionCompat.LIZLLL();
        } catch (Throwable unused) {
        }
    }

    public final void LIZJ() {
        EnumC79954VZm LJ = this.LIZLLL.LJ();
        int i = C79952VZk.LIZ[LJ.ordinal()];
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
        ((C007501f) this.LIZIZ.getValue()).LJFF = 822L;
        ((C007501f) this.LIZIZ.getValue()).LIZIZ(i2, this.LIZLLL.getCurrentPlaybackTime());
        this.LIZ.LJII(((C007501f) this.LIZIZ.getValue()).LIZ());
        MediaSessionCompat mediaSessionCompat = this.LIZ;
        if (LJ == EnumC79954VZm.PLAYBACK_STATE_STOPPED) {
            z = false;
        }
        mediaSessionCompat.LJ(z);
    }

    public C84743XNr(Context context, InterfaceC80022Vas musicPlayer, InterfaceC80025Vav musicQueue, InterfaceC84737XNl musicPlayerQueueController, ComponentName mediaButtonReceiverComponentName) {
        int i;
        o.LJIIJ(context, "context");
        o.LJIIJ(musicPlayer, "musicPlayer");
        o.LJIIJ(musicQueue, "musicQueue");
        o.LJIIJ(musicPlayerQueueController, "musicPlayerQueueController");
        o.LJIIJ(mediaButtonReceiverComponentName, "mediaButtonReceiverComponentName");
        this.LIZLLL = musicPlayer;
        this.LJ = musicQueue;
        this.LJFF = musicPlayerQueueController;
        this.LIZIZ = C221108m2.LIZIZ(C84750XNy.LJLIL);
        this.LIZJ = C221108m2.LIZIZ(C84748XNw.LJLIL);
        if (Build.VERSION.SDK_INT >= 23) {
            i = 67108864;
        } else {
            i = 0;
        }
        MediaSessionCompat mediaSessionCompat = new MediaSessionCompat(context, "MediaSessionController", null, null);
        mediaSessionCompat.LIZ.LIZ.setMediaButtonReceiver(PendingIntent.getBroadcast(context, 0, new Intent("android.intent.action.MEDIA_BUTTON").setComponent(mediaButtonReceiverComponentName), i));
        mediaSessionCompat.LJFF(new C84744XNs(mediaSessionCompat, this), null);
        mediaSessionCompat.LIZ.LIZ.setFlags(3);
        this.LIZ = mediaSessionCompat;
    }
}
