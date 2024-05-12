package X;

import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.01U, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C01U implements IBinder.DeathRecipient {
    public final C01S LJLIL = new MediaController.Callback(this) { // from class: X.01S
        public final WeakReference<C01U> LIZ;

        @Override // android.media.session.MediaController.Callback
        public final void onSessionDestroyed() {
            C01U c01u = this.LIZ.get();
            if (c01u != null) {
                c01u.LIZJ();
            }
        }

        {
            this.LIZ = new WeakReference<>(this);
        }

        @Override // android.media.session.MediaController.Callback
        public final void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
            if (this.LIZ.get() != null) {
                playbackInfo.getPlaybackType();
                playbackInfo.getAudioAttributes();
                if (Build.VERSION.SDK_INT >= 26) {
                }
                playbackInfo.getVolumeControl();
                playbackInfo.getMaxVolume();
                playbackInfo.getCurrentVolume();
            }
        }

        @Override // android.media.session.MediaController.Callback
        public final void onExtrasChanged(Bundle bundle) {
            MediaSessionCompat.LIZ(bundle);
            this.LIZ.get();
        }

        @Override // android.media.session.MediaController.Callback
        public final void onMetadataChanged(MediaMetadata mediaMetadata) {
            C01U c01u = this.LIZ.get();
            if (c01u != null) {
                c01u.LIZ(MediaMetadataCompat.LIZ(mediaMetadata));
            }
        }

        @Override // android.media.session.MediaController.Callback
        public final void onPlaybackStateChanged(PlaybackState playbackState) {
            C01U c01u = this.LIZ.get();
            if (c01u == null || c01u.LJLJI != null) {
                return;
            }
            c01u.LIZIZ(PlaybackStateCompat.LIZ(playbackState));
        }

        @Override // android.media.session.MediaController.Callback
        public final void onQueueChanged(List<MediaSession.QueueItem> list) {
            MediaSessionCompat.QueueItem queueItem;
            if (this.LIZ.get() != null && list != null) {
                ArrayList arrayList = new ArrayList(list.size());
                for (MediaSession.QueueItem queueItem2 : list) {
                    if (queueItem2 != null) {
                        MediaSession.QueueItem queueItem3 = queueItem2;
                        queueItem = new MediaSessionCompat.QueueItem(queueItem3, MediaDescriptionCompat.LIZ(C01X.LIZIZ(queueItem3)), C01X.LIZJ(queueItem3));
                    } else {
                        queueItem = null;
                    }
                    arrayList.add(queueItem);
                }
            }
        }

        @Override // android.media.session.MediaController.Callback
        public final void onQueueTitleChanged(CharSequence charSequence) {
            this.LIZ.get();
        }

        @Override // android.media.session.MediaController.Callback
        public final void onSessionEvent(String str, Bundle bundle) {
            MediaSessionCompat.LIZ(bundle);
            this.LIZ.get();
        }
    };
    public C01T LJLILLLLZI;
    public BinderC45131pt LJLJI;

    public void LIZ(MediaMetadataCompat mediaMetadataCompat) {
    }

    public void LIZIZ(PlaybackStateCompat playbackStateCompat) {
    }

    public void LIZJ() {
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        LIZLLL(8, null, null);
    }

    public final void LJ(Handler handler) {
        if (handler == null) {
            C01T c01t = this.LJLILLLLZI;
            if (c01t != null) {
                c01t.LIZ = false;
                c01t.removeCallbacksAndMessages(null);
                this.LJLILLLLZI = null;
                return;
            }
            return;
        }
        C01T c01t2 = new C01T(this, handler.getLooper());
        this.LJLILLLLZI = c01t2;
        c01t2.LIZ = true;
    }

    public final void LIZLLL(int i, Object obj, Bundle bundle) {
        C01T c01t = this.LJLILLLLZI;
        if (c01t != null) {
            Message obtainMessage = c01t.obtainMessage(i, obj);
            obtainMessage.setData(bundle);
            obtainMessage.sendToTarget();
        }
    }
}
