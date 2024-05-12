package X;

import android.app.PendingIntent;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.VolumeProvider;
import android.media.session.MediaSession;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteCallbackList;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.KeyEvent;

/* renamed from: X.184, reason: invalid class name */
/* loaded from: classes.dex */
public class AnonymousClass184 implements InterfaceC007101b {
    public final MediaSession LIZ;
    public final MediaSessionCompat.Token LIZIZ;
    public final Bundle LIZLLL;
    public PlaybackStateCompat LJI;
    public MediaMetadataCompat LJII;
    public AbstractC007001a LJIIIIZZ;
    public C12210dt LJIIIZ;
    public final Object LIZJ = new Object();
    public boolean LJ = false;
    public final RemoteCallbackList<InterfaceC007601g> LJFF = new RemoteCallbackList<>();

    @Override // X.InterfaceC007101b
    public final AbstractC007001a LIZ() {
        AbstractC007001a abstractC007001a;
        synchronized (this.LIZJ) {
            abstractC007001a = this.LJIIIIZZ;
        }
        return abstractC007001a;
    }

    @Override // X.InterfaceC007101b
    public C12210dt LIZIZ() {
        C12210dt c12210dt;
        synchronized (this.LIZJ) {
            c12210dt = this.LJIIIZ;
        }
        return c12210dt;
    }

    public final String LJ() {
        if (Build.VERSION.SDK_INT < 24) {
            return null;
        }
        try {
            return (String) this.LIZ.getClass().getMethod("getCallingPackage", new Class[0]).invoke(this.LIZ, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // X.InterfaceC007101b
    public final PlaybackStateCompat LJIIZILJ() {
        return this.LJI;
    }

    @Override // X.InterfaceC007101b
    public void LIZJ(C12210dt c12210dt) {
        synchronized (this.LIZJ) {
            this.LJIIIZ = c12210dt;
        }
    }

    public final void LJI(int i) {
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        builder.setLegacyStreamType(i);
        this.LIZ.setPlaybackToLocal(builder.build());
    }

    public final void LJII(AbstractC12270dz abstractC12270dz) {
        this.LIZ.setPlaybackToRemote((VolumeProvider) abstractC12270dz.LIZ());
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.1hA] */
    public AnonymousClass184(Context context, String str) {
        MediaSession LIZLLL = LIZLLL(context, str);
        this.LIZ = LIZLLL;
        this.LIZIZ = new MediaSessionCompat.Token(LIZLLL.getSessionToken(), new AnonymousClass188() { // from class: X.1hA
            @Override // X.InterfaceC007701h
            public final void LLLLLLL() {
            }

            @Override // X.InterfaceC007701h
            public final void LLLZLL() {
            }

            @Override // X.InterfaceC007701h
            public final void LLLZLZ() {
            }

            @Override // X.InterfaceC007701h
            public final PlaybackStateCompat LJIIZILJ() {
                AnonymousClass184 anonymousClass184 = AnonymousClass184.this;
                return MediaSessionCompat.LIZIZ(anonymousClass184.LJI, anonymousClass184.LJII);
            }

            @Override // X.InterfaceC007701h
            public final Bundle LLLLLLJ() {
                if (AnonymousClass184.this.LIZLLL == null) {
                    return null;
                }
                return new Bundle(AnonymousClass184.this.LIZLLL);
            }

            @Override // X.InterfaceC007701h
            public final long LLLLLLLLL() {
                throw new AssertionError();
            }

            @Override // X.InterfaceC007701h
            public final void LLLLLLZ() {
                AnonymousClass184.this.getClass();
            }

            @Override // X.InterfaceC007701h
            public final void LLLLLLZZ() {
                throw new AssertionError();
            }

            @Override // X.InterfaceC007701h
            public final boolean LLLLLZ() {
                throw new AssertionError();
            }

            @Override // X.InterfaceC007701h
            public final CharSequence LLLLLZIL() {
                throw new AssertionError();
            }

            @Override // X.InterfaceC007701h
            public final ParcelableVolumeInfo LLLLZ() {
                throw new AssertionError();
            }

            @Override // X.InterfaceC007701h
            public final void LLLLZIL() {
                AnonymousClass184.this.getClass();
            }

            @Override // X.InterfaceC007701h
            public final void LLLLZLLLI() {
                AnonymousClass184.this.getClass();
            }

            @Override // X.InterfaceC007701h
            public final PendingIntent LLLZZ() {
                throw new AssertionError();
            }

            @Override // X.InterfaceC007701h
            public final void c0() {
                throw new AssertionError();
            }

            @Override // X.InterfaceC007701h
            public final Bundle getExtras() {
                throw new AssertionError();
            }

            @Override // X.InterfaceC007701h
            public final MediaMetadataCompat getMetadata() {
                throw new AssertionError();
            }

            @Override // X.InterfaceC007701h
            public final String getPackageName() {
                throw new AssertionError();
            }

            @Override // X.InterfaceC007701h
            public final String getTag() {
                throw new AssertionError();
            }

            @Override // X.InterfaceC007701h
            public final void k() {
                AnonymousClass184.this.getClass();
            }

            @Override // X.InterfaceC007701h
            public final void next() {
                throw new AssertionError();
            }

            @Override // X.InterfaceC007701h
            public final void pause() {
                throw new AssertionError();
            }

            @Override // X.InterfaceC007701h
            public final void play() {
                throw new AssertionError();
            }

            @Override // X.InterfaceC007701h
            public final void prepare() {
                throw new AssertionError();
            }

            @Override // X.InterfaceC007701h
            public final void previous() {
                throw new AssertionError();
            }

            @Override // X.InterfaceC007701h
            public final void stop() {
                throw new AssertionError();
            }

            @Override // X.InterfaceC007701h
            public final void LLLLLLLZIL(int i) {
                throw new AssertionError();
            }

            @Override // X.InterfaceC007701h
            public final void LLLLLZL(boolean z) {
                throw new AssertionError();
            }

            @Override // X.InterfaceC007701h
            public final boolean LLLLZLL(KeyEvent keyEvent) {
                throw new AssertionError();
            }

            @Override // X.InterfaceC007701h
            public final void LLLZI(long j) {
                throw new AssertionError();
            }

            @Override // X.InterfaceC007701h
            public final void LLLZIIL(int i) {
                throw new AssertionError();
            }

            @Override // X.InterfaceC007701h
            public final void LLLZIL(RatingCompat ratingCompat) {
                throw new AssertionError();
            }

            @Override // X.InterfaceC007701h
            public final void LLLZL(float f) {
                throw new AssertionError();
            }

            @Override // X.InterfaceC007701h
            public final void LLZIL(InterfaceC007601g interfaceC007601g) {
                if (AnonymousClass184.this.LJ) {
                    return;
                }
                AnonymousClass184.this.LJFF.register(interfaceC007601g, new C12210dt("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
                synchronized (AnonymousClass184.this.LIZJ) {
                    AnonymousClass184.this.getClass();
                }
            }

            @Override // X.InterfaceC007701h
            public final void LLZILL(InterfaceC007601g interfaceC007601g) {
                AnonymousClass184.this.LJFF.unregister(interfaceC007601g);
                Binder.getCallingPid();
                Binder.getCallingUid();
                synchronized (AnonymousClass184.this.LIZJ) {
                    AnonymousClass184.this.getClass();
                }
            }

            @Override // X.InterfaceC007701h
            public final void S(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            @Override // X.InterfaceC007701h
            public final void U(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            @Override // X.InterfaceC007701h
            public final void r0(int i) {
                throw new AssertionError();
            }

            @Override // X.InterfaceC007701h
            public final void seekTo(long j) {
                throw new AssertionError();
            }

            @Override // X.InterfaceC007701h
            public final void LLLLLLLLLL(android.net.Uri uri, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // X.InterfaceC007701h
            public final void LLLLZI(Bundle bundle, String str2) {
                throw new AssertionError();
            }

            @Override // X.InterfaceC007701h
            public final void LLLLZLLIL(MediaDescriptionCompat mediaDescriptionCompat, int i) {
                throw new AssertionError();
            }

            @Override // X.InterfaceC007701h
            public final void LLLZ(Bundle bundle, String str2) {
                throw new AssertionError();
            }

            @Override // X.InterfaceC007701h
            public final void LLLZZIL(RatingCompat ratingCompat, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // X.InterfaceC007701h
            public final void LLZL(int i, int i2) {
                throw new AssertionError();
            }

            @Override // X.InterfaceC007701h
            public final void Y(int i, int i2) {
                throw new AssertionError();
            }

            @Override // X.InterfaceC007701h
            public final void r(Bundle bundle, String str2) {
                throw new AssertionError();
            }

            @Override // X.InterfaceC007701h
            public final void t0(Bundle bundle, String str2) {
                throw new AssertionError();
            }

            @Override // X.InterfaceC007701h
            public final void w(Bundle bundle, String str2) {
                throw new AssertionError();
            }

            @Override // X.InterfaceC007701h
            public final void x(android.net.Uri uri, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // X.InterfaceC007701h
            public final void LLZ(String str2, Bundle bundle, MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper) {
                throw new AssertionError();
            }
        });
        this.LIZLLL = null;
        LIZLLL.setFlags(3);
    }

    public MediaSession LIZLLL(Context context, String str) {
        return new MediaSession(context, str);
    }

    public final void LJFF(AbstractC007001a abstractC007001a, Handler handler) {
        C01Z c01z;
        synchronized (this.LIZJ) {
            this.LJIIIIZZ = abstractC007001a;
            MediaSession mediaSession = this.LIZ;
            if (abstractC007001a == null) {
                c01z = null;
            } else {
                c01z = abstractC007001a.LIZIZ;
            }
            mediaSession.setCallback(c01z, handler);
            if (abstractC007001a != null) {
                abstractC007001a.LJIIIIZZ(this, handler);
            }
        }
    }
}
