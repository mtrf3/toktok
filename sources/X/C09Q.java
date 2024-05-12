package X;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Messenger;
import android.service.media.MediaBrowserService;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.media.MediaBrowserServiceCompat;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.09Q, reason: invalid class name */
/* loaded from: classes.dex */
public class C09Q extends MediaBrowserService {
    public final /* synthetic */ C1BG LJLIL;

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        if (!C84763XOl.LJIIJJI && C38413F5t.LIZ("serviceAttachBaseContext")) {
            C35532Dx2.LIZJ();
        }
        super.attachBaseContext(context);
    }

    public C09Q(C1BG c1bg, MediaBrowserServiceCompat mediaBrowserServiceCompat) {
        this.LJLIL = c1bg;
        attachBaseContext(mediaBrowserServiceCompat);
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadChildren(final String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result) {
        C1BG c1bg = this.LJLIL;
        final C09S c09s = new C09S(result);
        c1bg.getClass();
        c1bg.LIZLLL.LIZIZ(str, new C09R<List<MediaBrowserCompat.MediaItem>>(str) { // from class: X.1BN
            @Override // X.C09R
            public final void LIZIZ() {
                c09s.LIZ(null);
            }
        });
        c1bg.LIZLLL.getClass();
    }

    @Override // android.service.media.MediaBrowserService
    public final MediaBrowserService.BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
        Bundle bundle2;
        int i2;
        MediaSessionCompat.LIZ(bundle);
        C1BG c1bg = this.LJLIL;
        if (bundle == null) {
            bundle2 = null;
        } else {
            bundle2 = new Bundle(bundle);
        }
        c1bg.getClass();
        if (bundle2 != null && bundle2.getInt("extra_client_version", 0) != 0) {
            bundle2.remove("extra_client_version");
            c1bg.LIZJ = new Messenger(c1bg.LIZLLL.LJLJJL);
            Bundle LIZ = C141415gn.LIZ("extra_service_version", 2);
            C021406o.LIZIZ(LIZ, "extra_messenger", c1bg.LIZJ.getBinder());
            c1bg.LIZLLL.getClass();
            ((ArrayList) c1bg.LIZ).add(LIZ);
            i2 = bundle2.getInt("extra_calling_pid", -1);
            bundle2.remove("extra_calling_pid");
        } else {
            i2 = -1;
        }
        new C09O(c1bg.LIZLLL, str, i2, i, null);
        c1bg.LIZLLL.getClass();
        c1bg.LIZLLL.LIZ(str);
        c1bg.LIZLLL.getClass();
        return null;
    }
}
