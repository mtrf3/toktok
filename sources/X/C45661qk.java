package X;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.service.media.MediaBrowserService;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.media.MediaBrowserServiceCompat;
import java.util.List;

/* renamed from: X.1qk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C45661qk extends C40121ho {
    public final /* synthetic */ MediaBrowserServiceCompat LJFF;

    @Override // X.C40121ho, X.C1BG, X.C09P
    public final void onCreate() {
        final MediaBrowserServiceCompat mediaBrowserServiceCompat = this.LJFF;
        C1BH c1bh = new C1BH(mediaBrowserServiceCompat) { // from class: X.1hp
            @Override // X.C1BH, X.C09Q, android.app.Service, android.content.ContextWrapper
            public final void attachBaseContext(Context context) {
                if (!C84763XOl.LJIIJJI && C38413F5t.LIZ("serviceAttachBaseContext")) {
                    C35532Dx2.LIZJ();
                }
                super.attachBaseContext(context);
            }

            @Override // android.service.media.MediaBrowserService
            public final void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result, Bundle bundle) {
                MediaSessionCompat.LIZ(bundle);
                C45661qk.this.LJFF.getClass();
                C45661qk c45661qk = C45661qk.this;
                C09S c09s = new C09S(result);
                c45661qk.getClass();
                C09R<List<MediaBrowserCompat.MediaItem>> c09r = new C09R<List<MediaBrowserCompat.MediaItem>>(c45661qk, str, c09s, bundle) { // from class: X.1BP
                    public final /* synthetic */ C09S LJ;

                    @Override // X.C09R
                    public final void LIZIZ() {
                        this.LJ.LIZ(null);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(str);
                        this.LJ = c09s;
                    }
                };
                MediaBrowserServiceCompat mediaBrowserServiceCompat2 = c45661qk.LJFF;
                mediaBrowserServiceCompat2.getClass();
                c09r.LIZLLL = 1;
                mediaBrowserServiceCompat2.LIZIZ(str, c09r);
                c45661qk.LJFF.getClass();
                C45661qk.this.LJFF.getClass();
            }
        };
        this.LIZIZ = c1bh;
        c1bh.onCreate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45661qk(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
        super(mediaBrowserServiceCompat);
        this.LJFF = mediaBrowserServiceCompat;
    }
}
