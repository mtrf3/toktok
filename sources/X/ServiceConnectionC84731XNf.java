package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.ss.android.ugc.aweme.audiomode.fullepisodev2.notification.BackgroundAudioService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.XNf, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class ServiceConnectionC84731XNf implements ServiceConnection {
    public final C85068Xa4 LJLIL;
    public final InterfaceC84730XNe LJLILLLLZI;
    public final Aweme LJLJI;
    public BackgroundAudioService LJLJJI;

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.LJLJJI = null;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder service) {
        X68 x68;
        o.LJIIIZ(service, "service");
        if ((service instanceof X68) && (x68 = (X68) service) != null) {
            BackgroundAudioService backgroundAudioService = x68.LJLIL.get();
            this.LJLJJI = backgroundAudioService;
            if (backgroundAudioService != null) {
                C85068Xa4 mediaPlayerController = this.LJLIL;
                o.LJIIIZ(mediaPlayerController, "mediaPlayerController");
                C85099XaZ c85099XaZ = mediaPlayerController.LIZ;
                C84739XNn listener = backgroundAudioService.LJLLI;
                c85099XaZ.getClass();
                o.LJIIIZ(listener, "listener");
                C85096XaW<InterfaceC85091XaR> c85096XaW = c85099XaZ.LIZ;
                if (!c85096XaW.LIZ.contains(listener)) {
                    c85096XaW.LIZ.add(listener);
                }
                backgroundAudioService.LJLIL = mediaPlayerController;
                C84742XNq c84742XNq = backgroundAudioService.LJLJLLL;
                if (c84742XNq != null) {
                    c84742XNq.LIZIZ = mediaPlayerController;
                    XO0 xo0 = backgroundAudioService.LJLJLJ;
                    if (xo0 != null) {
                        xo0.LIZIZ = mediaPlayerController;
                    } else {
                        o.LJIJI("xNotificationController");
                        throw null;
                    }
                } else {
                    o.LJIJI("xAndroidSessionController");
                    throw null;
                }
            }
            BackgroundAudioService backgroundAudioService2 = this.LJLJJI;
            if (backgroundAudioService2 != null) {
                Aweme aweme = this.LJLJI;
                backgroundAudioService2.LJLILLLLZI = aweme;
                C84742XNq c84742XNq2 = backgroundAudioService2.LJLJLLL;
                if (c84742XNq2 != null) {
                    c84742XNq2.LIZJ = aweme;
                    XO0 xo02 = backgroundAudioService2.LJLJLJ;
                    if (xo02 != null) {
                        xo02.LIZLLL = aweme;
                    } else {
                        o.LJIJI("xNotificationController");
                        throw null;
                    }
                } else {
                    o.LJIJI("xAndroidSessionController");
                    throw null;
                }
            }
            InterfaceC84730XNe interfaceC84730XNe = this.LJLILLLLZI;
            if (interfaceC84730XNe != null) {
                interfaceC84730XNe.LIZ();
            }
        }
    }

    public ServiceConnectionC84731XNf(C85068Xa4 mediaPlayerController, C84728XNc c84728XNc, Aweme aweme) {
        o.LJIIIZ(mediaPlayerController, "mediaPlayerController");
        this.LJLIL = mediaPlayerController;
        this.LJLILLLLZI = c84728XNc;
        this.LJLJI = aweme;
    }
}
