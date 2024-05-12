package X;

import Y.IDBReceiverS11S0100000_15;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.XNq, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84742XNq {
    public final Context LIZ;
    public C85068Xa4 LIZIZ;
    public Aweme LIZJ;
    public final C62822Ol8 LIZLLL;
    public final MediaSessionCompat LJ;
    public final C62822Ol8 LJFF;
    public final C62822Ol8 LJI;

    public final C01P LIZ() {
        return (C01P) this.LJI.getValue();
    }

    public final void LIZIZ() {
        try {
            MediaSessionCompat mediaSessionCompat = this.LJ;
            mediaSessionCompat.LJ(false);
            mediaSessionCompat.LJFF(null, null);
            mediaSessionCompat.LIZLLL();
            C16880lQ.LJJLIIIJL(this.LIZ, (IDBReceiverS11S0100000_15) this.LIZLLL.getValue());
        } catch (Throwable unused) {
        }
    }

    public final void LJ() {
        XOX LIZIZ = this.LIZIZ.LIZIZ();
        int i = XOW.LIZ[LIZIZ.ordinal()];
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
        ((C007501f) this.LJFF.getValue()).LJFF = 822L;
        ((C007501f) this.LJFF.getValue()).LIZIZ(i2, this.LIZIZ.LIZJ());
        this.LJ.LJII(((C007501f) this.LJFF.getValue()).LIZ());
        MediaSessionCompat mediaSessionCompat = this.LJ;
        if (LIZIZ == XOX.PLAYBACK_STATE_STOPPED) {
            z = false;
        }
        mediaSessionCompat.LJ(z);
    }

    public final void LIZLLL() {
        LIZ().LIZJ(this.LIZIZ.LIZLLL());
        this.LJ.LJI(LIZ().LIZ());
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
            this.LJ.LJI(LIZ().LIZ());
        }
    }

    public C84742XNq(Context context, C85068Xa4 mediaPlayerController, ComponentName mediaButtonReceiverComponentName, Aweme aweme) {
        int i;
        o.LJIIIZ(mediaPlayerController, "mediaPlayerController");
        o.LJIIIZ(mediaButtonReceiverComponentName, "mediaButtonReceiverComponentName");
        this.LIZ = context;
        this.LIZIZ = mediaPlayerController;
        this.LIZJ = aweme;
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS165S0100000_15(this, 794));
        this.LIZLLL = LIZIZ;
        this.LJFF = C221108m2.LIZIZ(XO3.LJLIL);
        this.LJI = C221108m2.LIZIZ(C84749XNx.LJLIL);
        MediaSessionCompat mediaSessionCompat = new MediaSessionCompat(context, "MediaSessionController", null, null);
        Intent component = new Intent("android.intent.action.MEDIA_BUTTON").setComponent(mediaButtonReceiverComponentName);
        if (Build.VERSION.SDK_INT >= 23) {
            i = 67108864;
        } else {
            i = 0;
        }
        mediaSessionCompat.LIZ.LIZ.setMediaButtonReceiver(PendingIntent.getService(context, 0, component, i));
        mediaSessionCompat.LJFF(new C84745XNt(mediaSessionCompat, this), null);
        mediaSessionCompat.LIZ.LIZ.setFlags(3);
        this.LJ = mediaSessionCompat;
        C16880lQ.LJJLIIIJILLIZJL((BroadcastReceiver) LIZIZ.getValue(), context, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
    }
}
