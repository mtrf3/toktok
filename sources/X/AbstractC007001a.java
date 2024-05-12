package X;

import android.content.Intent;
import android.media.Rating;
import android.media.session.MediaSession;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.ResultReceiver;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.versionedparcelable.ParcelImpl;
import java.lang.ref.WeakReference;

/* renamed from: X.01a, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC007001a {
    public boolean LIZJ;
    public C01Y LJ;
    public final Object LIZ = new Object();
    public final C01Z LIZIZ = new MediaSession.Callback() { // from class: X.01Z
        public final AnonymousClass184 LIZ() {
            AnonymousClass184 anonymousClass184;
            synchronized (AbstractC007001a.this.LIZ) {
                anonymousClass184 = (AnonymousClass184) AbstractC007001a.this.LIZLLL.get();
            }
            if (anonymousClass184 != null && AbstractC007001a.this == anonymousClass184.LIZ()) {
                return anonymousClass184;
            }
            return null;
        }

        @Override // android.media.session.MediaSession.Callback
        public final void onFastForward() {
            AnonymousClass184 LIZ = LIZ();
            if (LIZ == null) {
                return;
            }
            LIZIZ(LIZ);
            AbstractC007001a.this.getClass();
            LIZ.LIZJ(null);
        }

        @Override // android.media.session.MediaSession.Callback
        public final void onPause() {
            AnonymousClass184 LIZ = LIZ();
            if (LIZ == null) {
                return;
            }
            LIZIZ(LIZ);
            AbstractC007001a.this.LIZJ();
            LIZ.LIZJ(null);
        }

        @Override // android.media.session.MediaSession.Callback
        public final void onPlay() {
            AnonymousClass184 LIZ = LIZ();
            if (LIZ == null) {
                return;
            }
            LIZIZ(LIZ);
            AbstractC007001a.this.LIZLLL();
            LIZ.LIZJ(null);
        }

        @Override // android.media.session.MediaSession.Callback
        public final void onPrepare() {
            AnonymousClass184 LIZ = LIZ();
            if (LIZ == null) {
                return;
            }
            LIZIZ(LIZ);
            AbstractC007001a.this.getClass();
            LIZ.LIZJ(null);
        }

        @Override // android.media.session.MediaSession.Callback
        public final void onRewind() {
            AnonymousClass184 LIZ = LIZ();
            if (LIZ == null) {
                return;
            }
            LIZIZ(LIZ);
            AbstractC007001a.this.getClass();
            LIZ.LIZJ(null);
        }

        @Override // android.media.session.MediaSession.Callback
        public final void onSkipToNext() {
            AnonymousClass184 LIZ = LIZ();
            if (LIZ == null) {
                return;
            }
            LIZIZ(LIZ);
            AbstractC007001a.this.LJFF();
            LIZ.LIZJ(null);
        }

        @Override // android.media.session.MediaSession.Callback
        public final void onSkipToPrevious() {
            AnonymousClass184 LIZ = LIZ();
            if (LIZ == null) {
                return;
            }
            LIZIZ(LIZ);
            AbstractC007001a.this.LJI();
            LIZ.LIZJ(null);
        }

        @Override // android.media.session.MediaSession.Callback
        public final void onStop() {
            AnonymousClass184 LIZ = LIZ();
            if (LIZ == null) {
                return;
            }
            LIZIZ(LIZ);
            AbstractC007001a.this.LJII();
            LIZ.LIZJ(null);
        }

        public static void LIZIZ(AnonymousClass184 anonymousClass184) {
            if (Build.VERSION.SDK_INT >= 28) {
                return;
            }
            String LJ = anonymousClass184.LJ();
            if (TextUtils.isEmpty(LJ)) {
                LJ = "android.media.session.MediaController";
            }
            anonymousClass184.LIZJ(new C12210dt(LJ, -1, -1));
        }

        @Override // android.media.session.MediaSession.Callback
        public final boolean onMediaButtonEvent(Intent intent) {
            AnonymousClass184 LIZ = LIZ();
            if (LIZ == null) {
                return false;
            }
            LIZIZ(LIZ);
            boolean LIZIZ = AbstractC007001a.this.LIZIZ(intent);
            LIZ.LIZJ(null);
            if (!LIZIZ && !super.onMediaButtonEvent(intent)) {
                return false;
            }
            return true;
        }

        @Override // android.media.session.MediaSession.Callback
        public final void onSeekTo(long j) {
            AnonymousClass184 LIZ = LIZ();
            if (LIZ == null) {
                return;
            }
            LIZIZ(LIZ);
            AbstractC007001a.this.LJ(j);
            LIZ.LIZJ(null);
        }

        @Override // android.media.session.MediaSession.Callback
        public final void onSetPlaybackSpeed(float f) {
            AnonymousClass184 LIZ = LIZ();
            if (LIZ == null) {
                return;
            }
            LIZIZ(LIZ);
            AbstractC007001a.this.getClass();
            LIZ.LIZJ(null);
        }

        @Override // android.media.session.MediaSession.Callback
        public final void onSetRating(Rating rating) {
            AnonymousClass184 LIZ = LIZ();
            if (LIZ == null) {
                return;
            }
            LIZIZ(LIZ);
            AbstractC007001a abstractC007001a = AbstractC007001a.this;
            RatingCompat.LIZ(rating);
            abstractC007001a.getClass();
            LIZ.LIZJ(null);
        }

        @Override // android.media.session.MediaSession.Callback
        public final void onSkipToQueueItem(long j) {
            AnonymousClass184 LIZ = LIZ();
            if (LIZ == null) {
                return;
            }
            LIZIZ(LIZ);
            AbstractC007001a.this.getClass();
            LIZ.LIZJ(null);
        }

        @Override // android.media.session.MediaSession.Callback
        public final void onCustomAction(String str, Bundle bundle) {
            AnonymousClass184 LIZ = LIZ();
            if (LIZ == null) {
                return;
            }
            MediaSessionCompat.LIZ(bundle);
            LIZIZ(LIZ);
            try {
                if (str.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                    bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                    MediaSessionCompat.LIZ(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                    AbstractC007001a.this.getClass();
                } else if (str.equals("android.support.v4.media.session.action.PREPARE")) {
                    AbstractC007001a.this.getClass();
                } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                    bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                    MediaSessionCompat.LIZ(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                    AbstractC007001a.this.getClass();
                } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                    bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                    MediaSessionCompat.LIZ(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                    AbstractC007001a.this.getClass();
                } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                    bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                    MediaSessionCompat.LIZ(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                    AbstractC007001a.this.getClass();
                } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                    bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
                    AbstractC007001a.this.getClass();
                } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                    bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE");
                    AbstractC007001a.this.getClass();
                } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                    bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE");
                    AbstractC007001a.this.getClass();
                } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                    bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING");
                    MediaSessionCompat.LIZ(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                    AbstractC007001a.this.getClass();
                } else if (str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                    bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f);
                    AbstractC007001a.this.getClass();
                } else {
                    AbstractC007001a.this.getClass();
                }
            } catch (BadParcelableException unused) {
            }
            LIZ.LIZJ(null);
        }

        @Override // android.media.session.MediaSession.Callback
        public final void onPlayFromMediaId(String str, Bundle bundle) {
            AnonymousClass184 LIZ = LIZ();
            if (LIZ == null) {
                return;
            }
            MediaSessionCompat.LIZ(bundle);
            LIZIZ(LIZ);
            AbstractC007001a.this.getClass();
            LIZ.LIZJ(null);
        }

        @Override // android.media.session.MediaSession.Callback
        public final void onPlayFromSearch(String str, Bundle bundle) {
            AnonymousClass184 LIZ = LIZ();
            if (LIZ == null) {
                return;
            }
            MediaSessionCompat.LIZ(bundle);
            LIZIZ(LIZ);
            AbstractC007001a.this.getClass();
            LIZ.LIZJ(null);
        }

        @Override // android.media.session.MediaSession.Callback
        public final void onPlayFromUri(android.net.Uri uri, Bundle bundle) {
            AnonymousClass184 LIZ = LIZ();
            if (LIZ == null) {
                return;
            }
            MediaSessionCompat.LIZ(bundle);
            LIZIZ(LIZ);
            AbstractC007001a.this.getClass();
            LIZ.LIZJ(null);
        }

        @Override // android.media.session.MediaSession.Callback
        public final void onPrepareFromMediaId(String str, Bundle bundle) {
            AnonymousClass184 LIZ = LIZ();
            if (LIZ == null) {
                return;
            }
            MediaSessionCompat.LIZ(bundle);
            LIZIZ(LIZ);
            AbstractC007001a.this.getClass();
            LIZ.LIZJ(null);
        }

        @Override // android.media.session.MediaSession.Callback
        public final void onPrepareFromSearch(String str, Bundle bundle) {
            AnonymousClass184 LIZ = LIZ();
            if (LIZ == null) {
                return;
            }
            MediaSessionCompat.LIZ(bundle);
            LIZIZ(LIZ);
            AbstractC007001a.this.getClass();
            LIZ.LIZJ(null);
        }

        @Override // android.media.session.MediaSession.Callback
        public final void onPrepareFromUri(android.net.Uri uri, Bundle bundle) {
            AnonymousClass184 LIZ = LIZ();
            if (LIZ == null) {
                return;
            }
            MediaSessionCompat.LIZ(bundle);
            LIZIZ(LIZ);
            AbstractC007001a.this.getClass();
            LIZ.LIZJ(null);
        }

        @Override // android.media.session.MediaSession.Callback
        public final void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
            IBinder asBinder;
            AnonymousClass184 LIZ = LIZ();
            if (LIZ == null) {
                return;
            }
            MediaSessionCompat.LIZ(bundle);
            LIZIZ(LIZ);
            try {
                if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                    Bundle bundle2 = new Bundle();
                    MediaSessionCompat.Token token = LIZ.LIZIZ;
                    InterfaceC007701h LIZ2 = token.LIZ();
                    if (LIZ2 == null) {
                        asBinder = null;
                    } else {
                        asBinder = LIZ2.asBinder();
                    }
                    C021406o.LIZIZ(bundle2, "android.support.v4.media.session.EXTRA_BINDER", asBinder);
                    InterfaceC06180Mc LIZIZ = token.LIZIZ();
                    if (LIZIZ != null) {
                        Bundle bundle3 = new Bundle();
                        bundle3.putParcelable("a", new ParcelImpl(LIZIZ));
                        bundle2.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", bundle3);
                    }
                    resultReceiver.send(0, bundle2);
                } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                    AbstractC007001a abstractC007001a = AbstractC007001a.this;
                    bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");
                    abstractC007001a.getClass();
                } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                    AbstractC007001a abstractC007001a2 = AbstractC007001a.this;
                    bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");
                    bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX");
                    abstractC007001a2.getClass();
                } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                    AbstractC007001a abstractC007001a3 = AbstractC007001a.this;
                    bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");
                    abstractC007001a3.getClass();
                } else if (!str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) {
                    AbstractC007001a.this.getClass();
                }
            } catch (BadParcelableException unused) {
            }
            LIZ.LIZJ(null);
        }
    };
    public WeakReference<InterfaceC007101b> LIZLLL = new WeakReference<>(null);

    public void LIZJ() {
    }

    public void LIZLLL() {
    }

    public void LJ(long j) {
    }

    public void LJFF() {
    }

    public void LJI() {
    }

    public void LJII() {
    }

    public boolean LIZIZ(Intent intent) {
        InterfaceC007101b interfaceC007101b;
        C01Y c01y;
        KeyEvent keyEvent;
        if (Build.VERSION.SDK_INT >= 27) {
            return false;
        }
        synchronized (this.LIZ) {
            interfaceC007101b = this.LIZLLL.get();
            c01y = this.LJ;
        }
        if (interfaceC007101b == null || c01y == null || (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) == null || keyEvent.getAction() != 0) {
            return false;
        }
        C12210dt LIZIZ = interfaceC007101b.LIZIZ();
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 79 && keyCode != 85) {
            LIZ(interfaceC007101b, c01y);
            return false;
        }
        if (keyEvent.getRepeatCount() == 0) {
            if (this.LIZJ) {
                c01y.removeMessages(1);
                this.LIZJ = false;
                PlaybackStateCompat LJIIZILJ = interfaceC007101b.LJIIZILJ();
                if (LJIIZILJ != null && (LJIIZILJ.mActions & 32) != 0) {
                    LJFF();
                }
            } else {
                this.LIZJ = true;
                c01y.sendMessageDelayed(c01y.obtainMessage(1, LIZIZ), ViewConfiguration.getDoubleTapTimeout());
            }
        } else {
            LIZ(interfaceC007101b, c01y);
        }
        return true;
    }

    public final void LIZ(InterfaceC007101b interfaceC007101b, C01Y c01y) {
        boolean z;
        boolean z2;
        if (!this.LIZJ) {
            return;
        }
        boolean z3 = false;
        this.LIZJ = false;
        c01y.removeMessages(1);
        PlaybackStateCompat LJIIZILJ = interfaceC007101b.LJIIZILJ();
        if (LJIIZILJ == null) {
            return;
        }
        long j = LJIIZILJ.mActions;
        if (LJIIZILJ.mState == 3) {
            z = true;
        } else {
            z = false;
        }
        if ((516 & j) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((j & 514) != 0) {
            z3 = true;
        }
        if (z) {
            if (!z3) {
                return;
            }
            LIZJ();
        } else {
            if (!z2) {
                return;
            }
            LIZLLL();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.01Y] */
    /* JADX WARN: Type inference failed for: r1v3 */
    public final void LJIIIIZZ(InterfaceC007101b interfaceC007101b, Handler handler) {
        synchronized (this.LIZ) {
            this.LIZLLL = new WeakReference<>(interfaceC007101b);
            C01Y c01y = this.LJ;
            C01Y c01y2 = 0;
            c01y2 = 0;
            if (c01y != null) {
                c01y.removeCallbacksAndMessages(null);
            }
            if (interfaceC007101b != null && handler != null) {
                final Looper looper = handler.getLooper();
                c01y2 = new Handler(looper) { // from class: X.01Y
                    @Override // android.os.Handler
                    public final void handleMessage(Message message) {
                        InterfaceC007101b interfaceC007101b2;
                        AbstractC007001a abstractC007001a;
                        C01Y c01y3;
                        if (message.what == 1) {
                            synchronized (AbstractC007001a.this.LIZ) {
                                interfaceC007101b2 = AbstractC007001a.this.LIZLLL.get();
                                abstractC007001a = AbstractC007001a.this;
                                c01y3 = abstractC007001a.LJ;
                            }
                            if (interfaceC007101b2 == null || abstractC007001a != interfaceC007101b2.LIZ() || c01y3 == null) {
                                return;
                            }
                            interfaceC007101b2.LIZJ((C12210dt) message.obj);
                            AbstractC007001a.this.LIZ(interfaceC007101b2, c01y3);
                            interfaceC007101b2.LIZJ(null);
                        }
                    }
                };
            }
            this.LJ = c01y2;
        }
    }
}
