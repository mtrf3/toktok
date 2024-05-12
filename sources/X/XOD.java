package X;

import android.os.Binder;
import androidx.media.MediaBrowserServiceCompat;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class XOD extends Binder {
    public final MediaBrowserServiceCompat LJLIL;

    public XOD(MediaBrowserServiceCompat service) {
        o.LJIIIZ(service, "service");
        this.LJLIL = service;
    }
}
