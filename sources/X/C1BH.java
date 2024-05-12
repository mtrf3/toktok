package X;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.service.media.MediaBrowserService;
import android.support.v4.media.MediaBrowserCompat;
import androidx.media.MediaBrowserServiceCompat;

/* renamed from: X.1BH, reason: invalid class name */
/* loaded from: classes.dex */
public class C1BH extends C09Q {
    public final /* synthetic */ C40121ho LJLILLLLZI;

    @Override // X.C09Q, android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        if (!C84763XOl.LJIIJJI && C38413F5t.LIZ("serviceAttachBaseContext")) {
            C35532Dx2.LIZJ();
        }
        super.attachBaseContext(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1BH(C40121ho c40121ho, MediaBrowserServiceCompat mediaBrowserServiceCompat) {
        super(c40121ho, mediaBrowserServiceCompat);
        this.LJLILLLLZI = c40121ho;
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadItem(final String str, MediaBrowserService.Result<MediaBrowser.MediaItem> result) {
        C40121ho c40121ho = this.LJLILLLLZI;
        final C09S c09s = new C09S(result);
        c40121ho.getClass();
        C09R<MediaBrowserCompat.MediaItem> c09r = new C09R<MediaBrowserCompat.MediaItem>(str) { // from class: X.1BO
            @Override // X.C09R
            public final void LIZIZ() {
                c09s.LIZ(null);
            }
        };
        c09r.LIZLLL = 2;
        c09r.LIZJ();
        c40121ho.LJ.getClass();
    }
}
