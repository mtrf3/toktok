package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.ss.android.ugc.aweme.feed.background.BackgroundAudioBrowserService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XNW implements ServiceConnection {
    public final IDP LJLIL;
    public BackgroundAudioBrowserService LJLILLLLZI;

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
    }

    public final void LIZIZ() {
        BackgroundAudioBrowserService backgroundAudioBrowserService = this.LJLILLLLZI;
        if (backgroundAudioBrowserService != null) {
            backgroundAudioBrowserService.LIZ();
        }
    }

    public XNW(IDP playerController) {
        o.LJIIIZ(playerController, "playerController");
        this.LJLIL = playerController;
    }

    public final void LIZ(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        BackgroundAudioBrowserService backgroundAudioBrowserService = this.LJLILLLLZI;
        if (backgroundAudioBrowserService != null) {
            C84741XNp c84741XNp = backgroundAudioBrowserService.LJLL;
            if (c84741XNp != null) {
                c84741XNp.LJFF.LJ(true);
                C84751XNz c84751XNz = backgroundAudioBrowserService.LJLJLLL;
                if (c84751XNz != null) {
                    c84751XNz.LIZJ().LIZ = true;
                    C84741XNp c84741XNp2 = backgroundAudioBrowserService.LJLL;
                    if (c84741XNp2 != null) {
                        C47182IfS LIZIZ = C60903NvH.LIZIZ(aweme);
                        C01P LIZ = c84741XNp2.LIZ();
                        LIZ.LIZLLL("android.media.metadata.TITLE", LIZIZ.getSongName());
                        LIZ.LIZLLL("android.media.metadata.ALBUM", "");
                        LIZ.LIZLLL("android.media.metadata.ARTIST", LIZIZ.getArtistName());
                        long duration = c84741XNp2.LIZIZ.getDuration();
                        if (duration <= 0) {
                            duration = -1;
                        }
                        LIZ.LIZJ(duration);
                        LIZ.LIZIZ(null, "android.media.metadata.ART");
                        c84741XNp2.LJFF.LJ(true);
                        c84741XNp2.LJFF.LJI(c84741XNp2.LIZ().LIZ());
                        C84741XNp c84741XNp3 = backgroundAudioBrowserService.LJLL;
                        if (c84741XNp3 != null) {
                            c84741XNp3.LJ();
                            C84741XNp c84741XNp4 = backgroundAudioBrowserService.LJLL;
                            if (c84741XNp4 != null) {
                                c84741XNp4.LIZLLL();
                                C84751XNz c84751XNz2 = backgroundAudioBrowserService.LJLJLLL;
                                if (c84751XNz2 != null) {
                                    C47182IfS LIZIZ2 = C60903NvH.LIZIZ(aweme);
                                    XNV xnv = new XNV();
                                    xnv.LIZ = Boolean.FALSE;
                                    xnv.LIZIZ = Boolean.valueOf(c84751XNz2.LIZLLL.LIZLLL());
                                    xnv.LIZJ = Boolean.valueOf(c84751XNz2.LIZLLL.LJFF());
                                    xnv.LIZLLL = LIZIZ2.getSongName();
                                    xnv.LJ = LIZIZ2.getArtistName();
                                    xnv.LJFF = "";
                                    xnv.LJI = null;
                                    c84751XNz2.LJFF(xnv);
                                    c84751XNz2.LJIIIZ = xnv;
                                    XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new XNS(aweme, backgroundAudioBrowserService, null), 3);
                                    return;
                                }
                                o.LJIJI("xNotificationController");
                                throw null;
                            }
                            o.LJIJI("xAndroidSessionController");
                            throw null;
                        }
                        o.LJIJI("xAndroidSessionController");
                        throw null;
                    }
                    o.LJIJI("xAndroidSessionController");
                    throw null;
                }
                o.LJIJI("xNotificationController");
                throw null;
            }
            o.LJIJI("xAndroidSessionController");
            throw null;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.LJLILLLLZI = null;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder service) {
        X69 x69;
        o.LJIIIZ(service, "service");
        if ((service instanceof X69) && (x69 = (X69) service) != null) {
            BackgroundAudioBrowserService backgroundAudioBrowserService = x69.LJLIL.get();
            this.LJLILLLLZI = backgroundAudioBrowserService;
            if (backgroundAudioBrowserService != null) {
                IDP playerController = this.LJLIL;
                o.LJIIIZ(playerController, "playerController");
                C48649J7l c48649J7l = backgroundAudioBrowserService.LJLILLLLZI;
                c48649J7l.getClass();
                c48649J7l.LJLIL = playerController;
                C48653J7p c48653J7p = backgroundAudioBrowserService.LJLJI;
                c48653J7p.getClass();
                c48653J7p.LJLIL = playerController;
                C48652J7o c48652J7o = backgroundAudioBrowserService.LJLJJI;
                c48652J7o.getClass();
                c48652J7o.LJLIL = playerController;
            }
            C2M9.LIZ = true;
            Iterator it = ((ArrayList) C2M9.LIZIZ).iterator();
            while (it.hasNext()) {
                ((XNX) it.next()).LIZ();
            }
        }
    }
}
