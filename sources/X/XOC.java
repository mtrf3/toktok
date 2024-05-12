package X;

import android.os.Binder;
import androidx.media.MediaBrowserServiceCompat;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class XOC extends Binder {
    public final MediaBrowserServiceCompat LJLIL;

    public XOC(MediaBrowserServiceCompat service) {
        o.LJIIIZ(service, "service");
        this.LJLIL = service;
    }
}
