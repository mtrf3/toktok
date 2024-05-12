package X;

import android.media.MediaDescription;
import android.media.session.MediaSession;

/* renamed from: X.01X, reason: invalid class name */
/* loaded from: classes.dex */
public class C01X {
    public static MediaDescription LIZIZ(MediaSession.QueueItem queueItem) {
        return queueItem.getDescription();
    }

    public static long LIZJ(MediaSession.QueueItem queueItem) {
        return queueItem.getQueueId();
    }

    public static MediaSession.QueueItem LIZ(MediaDescription mediaDescription, long j) {
        return new MediaSession.QueueItem(mediaDescription, j);
    }
}
