package android.support.v4.media.session;

import X.AnonymousClass183;
import X.BinderC45131pt;
import X.C01U;
import X.C01W;
import X.C021406o;
import X.C06160Ma;
import X.C39711h9;
import X.C45141pu;
import X.InterfaceC007701h;
import X.InterfaceC06180Mc;
import android.app.PendingIntent;
import android.content.Context;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.KeyEvent;
import androidx.versionedparcelable.ParcelImpl;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class MediaControllerCompat {
    public final MediaControllerImplApi21 LIZ;
    public final ConcurrentHashMap<C01U, Boolean> LIZIZ = new ConcurrentHashMap<>();

    /* loaded from: classes.dex */
    public static class MediaControllerImplApi21 {
        public final MediaController LIZ;
        public final Object LIZIZ = new Object();
        public final List<C01U> LIZJ = new ArrayList();
        public final HashMap<C01U, BinderC45131pt> LIZLLL = new HashMap<>();
        public final MediaSessionCompat.Token LJ;

        public final C01W LIZ() {
            final MediaController.TransportControls transportControls = this.LIZ.getTransportControls();
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                return new C45141pu(transportControls) { // from class: X.29Q
                };
            }
            if (i >= 24) {
                return new C45141pu(transportControls);
            }
            if (i >= 23) {
                return new C39711h9(transportControls);
            }
            return new AnonymousClass183(transportControls);
        }

        public final void LIZIZ() {
            if (this.LJ.LIZ() == null) {
                return;
            }
            Iterator it = ((ArrayList) this.LIZJ).iterator();
            while (it.hasNext()) {
                C01U c01u = (C01U) it.next();
                BinderC45131pt binderC45131pt = new BinderC45131pt(c01u);
                this.LIZLLL.put(c01u, binderC45131pt);
                c01u.LJLJI = binderC45131pt;
                try {
                    this.LJ.LIZ().LLZIL(binderC45131pt);
                    c01u.LIZLLL(13, null, null);
                } catch (RemoteException unused) {
                }
            }
            ((ArrayList) this.LIZJ).clear();
        }

        /* loaded from: classes.dex */
        public static class ExtraBinderRequestResultReceiver extends ResultReceiver {
            public WeakReference<MediaControllerImplApi21> mMediaControllerImpl;

            public ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediaControllerImplApi21) {
                super(null);
                this.mMediaControllerImpl = new WeakReference<>(mediaControllerImplApi21);
            }

            @Override // android.os.ResultReceiver
            public final void onReceiveResult(int i, Bundle bundle) {
                InterfaceC007701h interfaceC007701h;
                MediaControllerImplApi21 mediaControllerImplApi21 = this.mMediaControllerImpl.get();
                if (mediaControllerImplApi21 == null || bundle == null) {
                    return;
                }
                synchronized (mediaControllerImplApi21.LIZIZ) {
                    MediaSessionCompat.Token token = mediaControllerImplApi21.LJ;
                    final IBinder LIZ = C021406o.LIZ(bundle, "android.support.v4.media.session.EXTRA_BINDER");
                    InterfaceC06180Mc interfaceC06180Mc = null;
                    if (LIZ == null) {
                        interfaceC007701h = null;
                    } else {
                        IInterface queryLocalInterface = LIZ.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                        if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC007701h)) {
                            interfaceC007701h = (InterfaceC007701h) queryLocalInterface;
                        } else {
                            interfaceC007701h = new InterfaceC007701h(LIZ) { // from class: X.187
                                public final IBinder LJLIL;

                                @Override // X.InterfaceC007701h
                                public final PlaybackStateCompat LJIIZILJ() {
                                    PlaybackStateCompat playbackStateCompat;
                                    Parcel obtain = Parcel.obtain();
                                    Parcel obtain2 = Parcel.obtain();
                                    try {
                                        obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                                        this.LJLIL.transact(28, obtain, obtain2, 0);
                                        obtain2.readException();
                                        if (obtain2.readInt() != 0) {
                                            playbackStateCompat = PlaybackStateCompat.CREATOR.createFromParcel(obtain2);
                                        } else {
                                            playbackStateCompat = null;
                                        }
                                        return playbackStateCompat;
                                    } finally {
                                        obtain2.recycle();
                                        obtain.recycle();
                                    }
                                }

                                @Override // X.InterfaceC007701h
                                public final PendingIntent LLLZZ() {
                                    PendingIntent pendingIntent;
                                    Parcel obtain = Parcel.obtain();
                                    Parcel obtain2 = Parcel.obtain();
                                    try {
                                        obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                                        this.LJLIL.transact(8, obtain, obtain2, 0);
                                        obtain2.readException();
                                        if (obtain2.readInt() != 0) {
                                            pendingIntent = (PendingIntent) PendingIntent.CREATOR.createFromParcel(obtain2);
                                        } else {
                                            pendingIntent = null;
                                        }
                                        return pendingIntent;
                                    } finally {
                                        obtain2.recycle();
                                        obtain.recycle();
                                    }
                                }

                                @Override // X.InterfaceC007701h
                                public final MediaMetadataCompat getMetadata() {
                                    MediaMetadataCompat mediaMetadataCompat;
                                    Parcel obtain = Parcel.obtain();
                                    Parcel obtain2 = Parcel.obtain();
                                    try {
                                        obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                                        this.LJLIL.transact(27, obtain, obtain2, 0);
                                        obtain2.readException();
                                        if (obtain2.readInt() != 0) {
                                            mediaMetadataCompat = MediaMetadataCompat.CREATOR.createFromParcel(obtain2);
                                        } else {
                                            mediaMetadataCompat = null;
                                        }
                                        return mediaMetadataCompat;
                                    } finally {
                                        obtain2.recycle();
                                        obtain.recycle();
                                    }
                                }

                                @Override // X.InterfaceC007701h
                                public final void pause() {
                                    Parcel obtain = Parcel.obtain();
                                    Parcel obtain2 = Parcel.obtain();
                                    try {
                                        obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                                        this.LJLIL.transact(18, obtain, obtain2, 0);
                                        obtain2.readException();
                                    } finally {
                                        obtain2.recycle();
                                        obtain.recycle();
                                    }
                                }

                                @Override // X.InterfaceC007701h
                                public final void play() {
                                    Parcel obtain = Parcel.obtain();
                                    Parcel obtain2 = Parcel.obtain();
                                    try {
                                        obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                                        this.LJLIL.transact(13, obtain, obtain2, 0);
                                        obtain2.readException();
                                    } finally {
                                        obtain2.recycle();
                                        obtain.recycle();
                                    }
                                }

                                @Override // X.InterfaceC007701h
                                public final void stop() {
                                    Parcel obtain = Parcel.obtain();
                                    Parcel obtain2 = Parcel.obtain();
                                    try {
                                        obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                                        this.LJLIL.transact(19, obtain, obtain2, 0);
                                        obtain2.readException();
                                    } finally {
                                        obtain2.recycle();
                                        obtain.recycle();
                                    }
                                }

                                @Override // android.os.IInterface
                                public final IBinder asBinder() {
                                    return this.LJLIL;
                                }

                                {
                                    this.LJLIL = LIZ;
                                }

                                @Override // X.InterfaceC007701h
                                public final boolean LLLLZLL(KeyEvent keyEvent) {
                                    Parcel obtain = Parcel.obtain();
                                    Parcel obtain2 = Parcel.obtain();
                                    try {
                                        obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                                        boolean z = true;
                                        if (keyEvent != null) {
                                            obtain.writeInt(1);
                                            keyEvent.writeToParcel(obtain, 0);
                                        } else {
                                            obtain.writeInt(0);
                                        }
                                        this.LJLIL.transact(2, obtain, obtain2, 0);
                                        obtain2.readException();
                                        if (obtain2.readInt() == 0) {
                                            z = false;
                                        }
                                        return z;
                                    } finally {
                                        obtain2.recycle();
                                        obtain.recycle();
                                    }
                                }

                                @Override // X.InterfaceC007701h
                                public final void LLZIL(InterfaceC007601g interfaceC007601g) {
                                    IBinder iBinder;
                                    Parcel obtain = Parcel.obtain();
                                    Parcel obtain2 = Parcel.obtain();
                                    try {
                                        obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                                        if (interfaceC007601g == null) {
                                            iBinder = null;
                                        } else {
                                            iBinder = interfaceC007601g.asBinder();
                                        }
                                        obtain.writeStrongBinder(iBinder);
                                        this.LJLIL.transact(3, obtain, obtain2, 0);
                                        obtain2.readException();
                                    } finally {
                                        obtain2.recycle();
                                        obtain.recycle();
                                    }
                                }

                                @Override // X.InterfaceC007701h
                                public final void LLZILL(InterfaceC007601g interfaceC007601g) {
                                    IBinder iBinder;
                                    Parcel obtain = Parcel.obtain();
                                    Parcel obtain2 = Parcel.obtain();
                                    try {
                                        obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                                        if (interfaceC007601g == null) {
                                            iBinder = null;
                                        } else {
                                            iBinder = interfaceC007601g.asBinder();
                                        }
                                        obtain.writeStrongBinder(iBinder);
                                        this.LJLIL.transact(4, obtain, obtain2, 0);
                                        obtain2.readException();
                                    } finally {
                                        obtain2.recycle();
                                        obtain.recycle();
                                    }
                                }
                            };
                        }
                    }
                    token.LIZLLL(interfaceC007701h);
                    MediaSessionCompat.Token token2 = mediaControllerImplApi21.LJ;
                    try {
                        Bundle bundle2 = (Bundle) bundle.getParcelable("android.support.v4.media.session.SESSION_TOKEN2");
                        if (bundle2 != null) {
                            bundle2.setClassLoader(C06160Ma.class.getClassLoader());
                            Parcelable parcelable = bundle2.getParcelable("a");
                            if (parcelable instanceof ParcelImpl) {
                                interfaceC06180Mc = ((ParcelImpl) parcelable).mParcel;
                            } else {
                                throw new IllegalArgumentException("Invalid parcel");
                            }
                        }
                    } catch (RuntimeException unused) {
                    }
                    token2.LJ(interfaceC06180Mc);
                    mediaControllerImplApi21.LIZIZ();
                }
            }
        }

        public final void LIZJ(C01U c01u) {
            this.LIZ.unregisterCallback(c01u.LJLIL);
            synchronized (this.LIZIZ) {
                if (this.LJ.LIZ() != null) {
                    try {
                        BinderC45131pt remove = this.LIZLLL.remove(c01u);
                        if (remove != null) {
                            c01u.LJLJI = null;
                            this.LJ.LIZ().LLZILL(remove);
                        }
                    } catch (RemoteException unused) {
                    }
                } else {
                    ((ArrayList) this.LIZJ).remove(c01u);
                }
            }
        }

        public MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) {
            this.LJ = token;
            MediaController mediaController = new MediaController(context, (MediaSession.Token) token.mInner);
            this.LIZ = mediaController;
            if (token.LIZ() == null) {
                mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new ExtraBinderRequestResultReceiver(this));
            }
        }
    }

    public final MediaMetadataCompat LIZ() {
        MediaMetadata metadata = this.LIZ.LIZ.getMetadata();
        if (metadata != null) {
            return MediaMetadataCompat.LIZ(metadata);
        }
        return null;
    }

    public final void LIZIZ(C01U c01u) {
        if (c01u != null) {
            if (this.LIZIZ.putIfAbsent(c01u, Boolean.TRUE) != null) {
                return;
            }
            Handler handler = new Handler();
            c01u.LJ(handler);
            MediaControllerImplApi21 mediaControllerImplApi21 = this.LIZ;
            mediaControllerImplApi21.LIZ.registerCallback(c01u.LJLIL, handler);
            synchronized (mediaControllerImplApi21.LIZIZ) {
                if (mediaControllerImplApi21.LJ.LIZ() != null) {
                    BinderC45131pt binderC45131pt = new BinderC45131pt(c01u);
                    mediaControllerImplApi21.LIZLLL.put(c01u, binderC45131pt);
                    c01u.LJLJI = binderC45131pt;
                    try {
                        mediaControllerImplApi21.LJ.LIZ().LLZIL(binderC45131pt);
                        c01u.LIZLLL(13, null, null);
                    } catch (RemoteException unused) {
                    }
                } else {
                    c01u.LJLJI = null;
                    ((ArrayList) mediaControllerImplApi21.LIZJ).add(c01u);
                }
            }
            return;
        }
        throw new IllegalArgumentException("callback must not be null");
    }

    public final void LIZJ(C01U c01u) {
        if (c01u != null) {
            if (this.LIZIZ.remove(c01u) == null) {
                return;
            }
            try {
                this.LIZ.LIZJ(c01u);
                return;
            } finally {
                c01u.LJ(null);
            }
        }
        throw new IllegalArgumentException("callback must not be null");
    }

    public MediaControllerCompat(final Context context, MediaSessionCompat mediaSessionCompat) {
        if (mediaSessionCompat != null) {
            final MediaSessionCompat.Token token = mediaSessionCompat.LIZ.LIZIZ;
            if (Build.VERSION.SDK_INT >= 29) {
                this.LIZ = new MediaControllerImplApi21(context, token) { // from class: X.182
                };
                return;
            } else {
                this.LIZ = new MediaControllerImplApi21(context, token);
                return;
            }
        }
        throw new IllegalArgumentException("session must not be null");
    }

    public MediaControllerCompat(Context context, MediaSessionCompat.Token token) {
        if (token != null) {
            this.LIZ = new MediaControllerImplApi21(context, token);
            return;
        }
        throw new IllegalArgumentException("sessionToken must not be null");
    }
}
