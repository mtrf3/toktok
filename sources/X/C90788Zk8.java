package X;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.ReconnectionService;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import com.google.android.gms.cast.framework.media.MediaNotificationService;
import com.google.android.gms.common.images.WebImage;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.Zk8, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90788Zk8 implements InterfaceC90123ZYp {
    public static final C90469Zez LJIIL = new C90469Zez("MediaSessionManager");
    public final Context LIZ;
    public final CastOptions LIZIZ;
    public final BinderC90889Zll LIZJ;
    public final ComponentName LIZLLL;
    public final C90423ZeF LJ;
    public final C90423ZeF LJFF;
    public final Handler LJI;
    public final Runnable LJII;
    public C90639Zhj LJIIIIZZ;
    public CastDevice LJIIIZ;
    public MediaSessionCompat LJIIJ;
    public boolean LJIIJJI;

    @Override // X.InterfaceC90123ZYp
    public final void LJIIJJI() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        LJIILJJIL(r1, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        if (r9.LJIIIIZZ.LJIIIZ() != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        LJIIL();
        LJIILIIL();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005a, code lost:
    
        if (r1 == 0) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005f, code lost:
    
        if (r9.LJIIIZ == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
    
        r0 = r9.LIZIZ.zzf;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0065, code lost:
    
        if (r0 != null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0073, code lost:
    
        r0 = r0.zze;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0075, code lost:
    
        if (r0 != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0078, code lost:
    
        r4 = r0.zzH;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007a, code lost:
    
        if (r4 != null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00eb, code lost:
    
        if (r1.intValue() < (r5.zzq.size() - 1)) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0110, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0111, code lost:
    
        r2 = r4.LJIIIIZZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0116, code lost:
    
        r1 = com.google.android.gms.cast.framework.media.MediaNotificationService.LJLZ;
        X.C16880lQ.LJLLJ(X.ZZ2.class);
        r1.getClass();
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r2 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x001b, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        if (r2.zzf == null) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ() {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90788Zk8.LIZJ():void");
    }

    public final C01P LJII() {
        MediaMetadataCompat LIZ;
        MediaSessionCompat mediaSessionCompat = this.LJIIJ;
        if (mediaSessionCompat == null || (LIZ = mediaSessionCompat.LIZIZ.LIZ()) == null) {
            return new C01P();
        }
        return new C01P(LIZ);
    }

    public final void LJIIL() {
        if (this.LIZIZ.zzf.zze == null) {
            return;
        }
        LJIIL.getClass();
        if (Build.VERSION.SDK_INT >= 26) {
            Runnable runnable = MediaNotificationService.LJZ;
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        Intent intent = new Intent(this.LIZ, (Class<?>) MediaNotificationService.class);
        intent.setPackage(this.LIZ.getPackageName());
        intent.setAction("com.google.android.gms.cast.framework.action.UPDATE_NOTIFICATION");
        this.LIZ.stopService(intent);
    }

    public final void LJIILIIL() {
        if (!this.LIZIZ.zzg) {
            return;
        }
        this.LJI.removeCallbacks(this.LJII);
        Intent intent = new Intent(this.LIZ, (Class<?>) ReconnectionService.class);
        intent.setPackage(this.LIZ.getPackageName());
        this.LIZ.stopService(intent);
    }

    @Override // X.InterfaceC90123ZYp
    public final void LIZIZ() {
        LIZJ();
    }

    @Override // X.InterfaceC90123ZYp
    public final void LIZLLL() {
        LIZJ();
    }

    @Override // X.InterfaceC90123ZYp
    public final void LJ() {
        LIZJ();
    }

    @Override // X.InterfaceC90123ZYp
    public final void LJI() {
        LIZJ();
    }

    @Override // X.InterfaceC90123ZYp
    public final void LJIIJ() {
        LIZJ();
    }

    public final void LJIIIZ(boolean z) {
        if (!this.LIZIZ.zzg) {
            return;
        }
        this.LJI.removeCallbacks(this.LJII);
        Intent intent = new Intent(this.LIZ, (Class<?>) ReconnectionService.class);
        intent.setPackage(this.LIZ.getPackageName());
        try {
            C16880lQ.LLLL(this.LIZ, intent);
        } catch (IllegalStateException unused) {
            if (z) {
                this.LJI.postDelayed(this.LJII, 1000L);
            }
        }
    }

    public final void LIZ(C90639Zhj c90639Zhj, CastDevice castDevice) {
        CastOptions castOptions;
        if (this.LJIIJJI || (castOptions = this.LIZIZ) == null || castOptions.zzf == null || c90639Zhj == null || castDevice == null) {
            return;
        }
        this.LJIIIIZZ = c90639Zhj;
        QH7.LJ("Must be called from the main thread.");
        ((CopyOnWriteArrayList) c90639Zhj.LJI).add(this);
        this.LJIIIZ = castDevice;
        ComponentName componentName = new ComponentName(this.LIZ, this.LIZIZ.zzf.zzb);
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setComponent(componentName);
        PendingIntent broadcast = PendingIntent.getBroadcast(this.LIZ, 0, intent, C90295ZcB.LIZ);
        if (this.LIZIZ.zzf.zzg) {
            this.LJIIJ = new MediaSessionCompat(this.LIZ, "CastMediaSession", componentName, broadcast);
            LJIILJJIL(0, null);
            CastDevice castDevice2 = this.LJIIIZ;
            if (castDevice2 != null && !TextUtils.isEmpty(castDevice2.zzd)) {
                MediaSessionCompat mediaSessionCompat = this.LJIIJ;
                C01P c01p = new C01P();
                c01p.LIZLLL("android.media.metadata.ALBUM_ARTIST", this.LIZ.getResources().getString(R.string.c, this.LJIIIZ.zzd));
                mediaSessionCompat.LJI(c01p.LIZ());
            }
            this.LJIIJ.LJFF(new C90787Zk7(this), null);
            this.LJIIJ.LJ(true);
            this.LIZJ.LLJI(this.LJIIJ);
        }
        this.LJIIJJI = true;
        LIZJ();
    }

    public final android.net.Uri LJFF(MediaMetadata mediaMetadata, int i) {
        WebImage webImage;
        if (this.LIZIZ.zzf.LJJJJL() != null) {
            this.LIZIZ.zzf.LJJJJL().getClass();
            webImage = C90117ZYj.LIZ(mediaMetadata);
        } else {
            List<WebImage> list = mediaMetadata.zzd;
            if (list != null && !list.isEmpty()) {
                webImage = (WebImage) ListProtector.get(mediaMetadata.zzd, 0);
            }
            return null;
        }
        if (webImage != null) {
            return webImage.zab;
        }
        return null;
    }

    public final void LJIIIIZZ(int i, Bitmap bitmap) {
        MediaSessionCompat mediaSessionCompat = this.LJIIJ;
        if (mediaSessionCompat == null) {
            return;
        }
        if (i == 0) {
            if (bitmap != null) {
                C01P LJII = LJII();
                LJII.LIZIZ(bitmap, "android.media.metadata.DISPLAY_ICON");
                mediaSessionCompat.LJI(LJII.LIZ());
                return;
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                createBitmap.eraseColor(0);
                MediaSessionCompat mediaSessionCompat2 = this.LJIIJ;
                C01P LJII2 = LJII();
                LJII2.LIZIZ(createBitmap, "android.media.metadata.DISPLAY_ICON");
                mediaSessionCompat2.LJI(LJII2.LIZ());
                return;
            }
        }
        if (i == 3) {
            C01P LJII3 = LJII();
            LJII3.LIZIZ(bitmap, "android.media.metadata.ALBUM_ART");
            mediaSessionCompat.LJI(LJII3.LIZ());
        }
    }

    public final void LJIILJJIL(int i, MediaInfo mediaInfo) {
        long j;
        long LIZJ;
        PendingIntent activity;
        MediaSessionCompat mediaSessionCompat = this.LJIIJ;
        if (mediaSessionCompat == null) {
            return;
        }
        long j2 = 0;
        if (i == 0) {
            C007501f c007501f = new C007501f();
            c007501f.LIZIZ(0, 0L);
            mediaSessionCompat.LJII(c007501f.LIZ());
            this.LJIIJ.LJI(new C01P().LIZ());
            return;
        }
        if (true != this.LJIIIIZZ.LJIIJJI()) {
            j = 768;
        } else {
            j = 512;
        }
        if (this.LJIIIIZZ.LJIIJJI()) {
            LIZJ = 0;
        } else {
            LIZJ = this.LJIIIIZZ.LIZJ();
        }
        MediaSessionCompat mediaSessionCompat2 = this.LJIIJ;
        C007501f c007501f2 = new C007501f();
        c007501f2.LIZIZ(i, LIZJ);
        c007501f2.LJFF = j;
        mediaSessionCompat2.LJII(c007501f2.LIZ());
        MediaSessionCompat mediaSessionCompat3 = this.LJIIJ;
        if (this.LIZLLL == null) {
            activity = null;
        } else {
            Intent intent = new Intent();
            intent.setComponent(this.LIZLLL);
            activity = PendingIntent.getActivity(this.LIZ, 0, intent, C90295ZcB.LIZ | 134217728);
        }
        mediaSessionCompat3.LIZ.LIZ.setSessionActivity(activity);
        if (this.LJIIJ == null) {
            return;
        }
        MediaMetadata mediaMetadata = mediaInfo.zzf;
        if (!this.LJIIIIZZ.LJIIJJI()) {
            j2 = mediaInfo.zzg;
        }
        C01P LJII = LJII();
        LJII.LIZLLL("android.media.metadata.TITLE", mediaMetadata.LJJJJZ("com.google.android.gms.cast.metadata.TITLE"));
        LJII.LIZLLL("android.media.metadata.DISPLAY_TITLE", mediaMetadata.LJJJJZ("com.google.android.gms.cast.metadata.TITLE"));
        LJII.LIZLLL("android.media.metadata.DISPLAY_SUBTITLE", mediaMetadata.LJJJJZ("com.google.android.gms.cast.metadata.SUBTITLE"));
        LJII.LIZJ(j2);
        this.LJIIJ.LJI(LJII.LIZ());
        android.net.Uri LJFF = LJFF(mediaMetadata, 0);
        if (LJFF != null) {
            this.LJ.LIZ(LJFF);
        } else {
            LJIIIIZZ(0, null);
        }
        android.net.Uri LJFF2 = LJFF(mediaMetadata, 3);
        if (LJFF2 != null) {
            this.LJFF.LIZ(LJFF2);
        } else {
            LJIIIIZZ(3, null);
        }
    }

    public C90788Zk8(Context context, CastOptions castOptions, BinderC90889Zll binderC90889Zll) {
        this.LIZ = context;
        this.LIZIZ = castOptions;
        this.LIZJ = binderC90889Zll;
        CastMediaOptions castMediaOptions = castOptions.zzf;
        if (castMediaOptions != null && !TextUtils.isEmpty(castMediaOptions.zzc)) {
            this.LIZLLL = new ComponentName(context, castOptions.zzf.zzc);
        } else {
            this.LIZLLL = null;
        }
        C90423ZeF c90423ZeF = new C90423ZeF(context);
        this.LJ = c90423ZeF;
        c90423ZeF.LJ = new C90785Zk5(this);
        C90423ZeF c90423ZeF2 = new C90423ZeF(context);
        this.LJFF = c90423ZeF2;
        c90423ZeF2.LJ = new C90786Zk6(this);
        this.LJI = new HandlerC90301ZcH(C16880lQ.LLJJJJ());
        this.LJII = new Runnable() { // from class: X.ZeI
            @Override // java.lang.Runnable
            public final void run() {
                boolean LIZ;
                try {
                    C90788Zk8.this.LJIIIZ(false);
                } finally {
                    if (LIZ) {
                    }
                }
            }
        };
    }
}
