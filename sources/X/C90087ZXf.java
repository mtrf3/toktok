package X;

import X.C0M9;
import android.content.Context;
import android.media.MediaRoute2ProviderService;
import android.media.RouteDiscoveryPreference;
import android.media.RoutingSessionInfo;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.mediarouter.media.MediaRouteProviderService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Function;
import java.util.stream.Collectors;

/* renamed from: X.ZXf, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90087ZXf extends MediaRoute2ProviderService {
    public static final /* synthetic */ int LJLJJLL = 0;
    public final C90864ZlM LJLILLLLZI;
    public volatile C90099ZXr LJLJJL;
    public final Object LJLIL = new Object();
    public final C1HQ LJLJI = new C1HQ();
    public final SparseArray<String> LJLJJI = new SparseArray<>();

    public C90087ZXf(C90864ZlM c90864ZlM) {
        this.LJLILLLLZI = c90864ZlM;
    }

    public final String LIZ(C90086ZXe c90086ZXe) {
        String uuid;
        synchronized (this.LJLIL) {
            do {
                uuid = UUID.randomUUID().toString();
            } while (this.LJLJI.containsKey(uuid));
            c90086ZXe.LJIIIIZZ = uuid;
            this.LJLJI.put(uuid, c90086ZXe);
        }
        return uuid;
    }

    public final AbstractC90096ZXo LIZIZ(String str) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.LJLIL) {
            arrayList.addAll(this.LJLJI.values());
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC90096ZXo LIZ = ((C90086ZXe) it.next()).LIZ(str);
            if (LIZ != null) {
                return LIZ;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final AbstractC90599Zh5 LIZJ(String str) {
        AbstractC90599Zh5 abstractC90599Zh5;
        synchronized (this.LJLIL) {
            abstractC90599Zh5 = null;
            C90086ZXe c90086ZXe = (C90086ZXe) this.LJLJI.getOrDefault(str, null);
            if (c90086ZXe != null) {
                abstractC90599Zh5 = c90086ZXe.LIZIZ;
            }
        }
        return abstractC90599Zh5;
    }

    public final C90089ZXh LIZLLL(String str) {
        MediaRouteProviderService mediaRouteProviderService = this.LJLILLLLZI.LIZ;
        if (mediaRouteProviderService != null && mediaRouteProviderService.LJLJJI != null && this.LJLJJL != null) {
            for (C90089ZXh c90089ZXh : this.LJLJJL.LIZIZ) {
                if (TextUtils.equals(c90089ZXh.LIZLLL(), str)) {
                    return c90089ZXh;
                }
            }
        }
        return null;
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        if (!C84763XOl.LJIIJJI && C38413F5t.LIZ("serviceAttachBaseContext")) {
            C35532Dx2.LIZJ();
        }
        super.attachBaseContext(context);
    }

    @Override // android.media.MediaRoute2ProviderService
    public final void onDiscoveryPreferenceChanged(RouteDiscoveryPreference routeDiscoveryPreference) {
        C90100ZXs c90100ZXs = new C90100ZXs();
        c90100ZXs.LIZ((Collection) routeDiscoveryPreference.getPreferredFeatures().stream().map(new Function() { // from class: X.Zfl
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String str = (String) obj;
                str.getClass();
                switch (str.hashCode()) {
                    case 94496206:
                        if (!str.equals("android.media.route.feature.REMOTE_PLAYBACK")) {
                            return str;
                        }
                        return "android.media.intent.category.REMOTE_PLAYBACK";
                    case 1328964233:
                        if (!str.equals("android.media.route.feature.LIVE_AUDIO")) {
                            return str;
                        }
                        return "android.media.intent.category.LIVE_AUDIO";
                    case 1348000558:
                        if (!str.equals("android.media.route.feature.LIVE_VIDEO")) {
                            return str;
                        }
                        return "android.media.intent.category.LIVE_VIDEO";
                    default:
                        return str;
                }
            }
        }).collect(Collectors.toList()));
        C90101ZXt LIZJ = c90100ZXs.LIZJ();
        C90864ZlM c90864ZlM = this.LJLILLLLZI;
        C90524Zfs c90524Zfs = new C90524Zfs(LIZJ, routeDiscoveryPreference.shouldPerformActiveScan());
        if (!Objects.equals(c90864ZlM.LIZLLL, c90524Zfs)) {
            c90864ZlM.LIZLLL = c90524Zfs;
            c90864ZlM.LJI();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.media.MediaRoute2ProviderService
    public final void onReleaseSession(long j, String str) {
        C90086ZXe c90086ZXe;
        if (getSessionInfo(str) == null) {
            return;
        }
        synchronized (this.LJLIL) {
            c90086ZXe = (C90086ZXe) this.LJLJI.remove(str);
        }
        if (c90086ZXe == null) {
            notifyRequestFailed(j, 4);
        } else {
            c90086ZXe.LIZIZ(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJFF(AbstractC90599Zh5 abstractC90599Zh5, C90089ZXh c90089ZXh, Collection<C90092ZXk> collection) {
        C90086ZXe c90086ZXe;
        synchronized (this.LJLIL) {
            Iterator it = ((C0M9.b) this.LJLJI.entrySet()).iterator();
            do {
                C0M8 c0m8 = (C0M8) it;
                if (c0m8.hasNext()) {
                    c0m8.next();
                    c90086ZXe = (C90086ZXe) c0m8.getValue();
                } else {
                    return;
                }
            } while (c90086ZXe.LIZIZ != abstractC90599Zh5);
            c90086ZXe.LJ(c90089ZXh, collection);
        }
    }

    @Override // android.media.MediaRoute2ProviderService
    public final void onDeselectRoute(long j, String str, String str2) {
        if (getSessionInfo(str) == null) {
            notifyRequestFailed(j, 4);
            return;
        }
        if (LIZLLL(str2) == null) {
            notifyRequestFailed(j, 3);
            return;
        }
        AbstractC90599Zh5 LIZJ = LIZJ(str);
        if (LIZJ == null) {
            notifyRequestFailed(j, 3);
        } else {
            LIZJ.LJIILJJIL(str2);
        }
    }

    @Override // android.media.MediaRoute2ProviderService
    public final void onSelectRoute(long j, String str, String str2) {
        if (getSessionInfo(str) == null) {
            notifyRequestFailed(j, 4);
            return;
        }
        if (LIZLLL(str2) == null) {
            notifyRequestFailed(j, 3);
            return;
        }
        AbstractC90599Zh5 LIZJ = LIZJ(str);
        if (LIZJ == null) {
            notifyRequestFailed(j, 3);
        } else {
            LIZJ.LJIILIIL(str2);
        }
    }

    @Override // android.media.MediaRoute2ProviderService
    public final void onSetRouteVolume(long j, String str, int i) {
        AbstractC90096ZXo LIZIZ = LIZIZ(str);
        if (LIZIZ == null) {
            notifyRequestFailed(j, 3);
        } else {
            LIZIZ.LJI(i);
        }
    }

    @Override // android.media.MediaRoute2ProviderService
    public final void onSetSessionVolume(long j, String str, int i) {
        if (getSessionInfo(str) == null) {
            notifyRequestFailed(j, 4);
            return;
        }
        AbstractC90599Zh5 LIZJ = LIZJ(str);
        if (LIZJ == null) {
            notifyRequestFailed(j, 3);
        } else {
            LIZJ.LJI(i);
        }
    }

    @Override // android.media.MediaRoute2ProviderService
    public final void onTransferToRoute(long j, String str, String str2) {
        if (getSessionInfo(str) == null) {
            notifyRequestFailed(j, 4);
            return;
        }
        if (LIZLLL(str2) == null) {
            notifyRequestFailed(j, 3);
            return;
        }
        AbstractC90599Zh5 LIZJ = LIZJ(str);
        if (LIZJ == null) {
            notifyRequestFailed(j, 3);
        } else {
            LIZJ.LJIILL(Collections.singletonList(str2));
        }
    }

    @Override // android.media.MediaRoute2ProviderService
    public final void onCreateSession(long j, String str, String str2, Bundle bundle) {
        AbstractC90097ZXp abstractC90097ZXp;
        AbstractC90599Zh5 c90866ZlO;
        MediaRouteProviderService mediaRouteProviderService = this.LJLILLLLZI.LIZ;
        if (mediaRouteProviderService == null) {
            abstractC90097ZXp = null;
        } else {
            abstractC90097ZXp = mediaRouteProviderService.LJLJJI;
        }
        C90089ZXh LIZLLL = LIZLLL(str2);
        int i = 3;
        if (LIZLLL == null) {
            notifyRequestFailed(j, 3);
            return;
        }
        if (this.LJLJJL.LIZJ) {
            c90866ZlO = abstractC90097ZXp.LJIIJJI(str2);
            if (c90866ZlO == null) {
                notifyRequestFailed(j, 1);
                return;
            }
            i = 7;
        } else {
            AbstractC90096ZXo LJIIL = abstractC90097ZXp.LJIIL(str2);
            if (LJIIL == null) {
                notifyRequestFailed(j, 1);
                return;
            } else {
                if (LIZLLL.LIZIZ().isEmpty()) {
                    i = 1;
                }
                c90866ZlO = new C90866ZlO(LJIIL, str2);
            }
        }
        c90866ZlO.LJFF();
        C90086ZXe c90086ZXe = new C90086ZXe(this, c90866ZlO, j, i, null);
        RoutingSessionInfo.Builder volumeMax = new RoutingSessionInfo.Builder(LIZ(c90086ZXe), str).setName(LIZLLL.LJ()).setVolumeHandling(LIZLLL.LJI()).setVolume(LIZLLL.LJFF()).setVolumeMax(LIZLLL.LJII());
        if (LIZLLL.LIZIZ().isEmpty()) {
            volumeMax.addSelectedRoute(str2);
        } else {
            Iterator<String> it = LIZLLL.LIZIZ().iterator();
            while (it.hasNext()) {
                volumeMax.addSelectedRoute(it.next());
            }
        }
        RoutingSessionInfo build = volumeMax.build();
        c90086ZXe.LIZJ(build);
        if ((i & 6) == 2) {
            c90086ZXe.LIZLLL(str2, null, build);
        }
        C90864ZlM c90864ZlM = this.LJLILLLLZI;
        Context applicationContext = c90864ZlM.LIZ.getApplicationContext();
        if (C38891fp.LJLJI && applicationContext == null) {
            applicationContext = C38891fp.LJLILLLLZI;
        }
        c90866ZlO.LJIILLIIL(C04330Ez.LIZLLL(applicationContext), c90864ZlM.LJFF);
    }

    public final void LJ(C90592Zgy c90592Zgy, AbstractC90096ZXo abstractC90096ZXo, int i, String str, String str2) {
        int i2;
        AbstractC90599Zh5 c90866ZlO;
        C90089ZXh LIZLLL = LIZLLL(str2);
        if (LIZLLL == null) {
            return;
        }
        if (abstractC90096ZXo instanceof AbstractC90599Zh5) {
            c90866ZlO = (AbstractC90599Zh5) abstractC90096ZXo;
            i2 = 6;
        } else {
            if (!LIZLLL.LIZIZ().isEmpty()) {
                i2 = 2;
            } else {
                i2 = 0;
            }
            c90866ZlO = new C90866ZlO(abstractC90096ZXo, str2);
        }
        C90086ZXe c90086ZXe = new C90086ZXe(this, c90866ZlO, 0L, i2, c90592Zgy);
        c90086ZXe.LJIIIZ = str2;
        String LIZ = LIZ(c90086ZXe);
        this.LJLJJI.put(i, LIZ);
        c90086ZXe.LIZJ(new RoutingSessionInfo.Builder(LIZ, str).addSelectedRoute(str2).setName(LIZLLL.LJ()).setVolumeHandling(LIZLLL.LJI()).setVolume(LIZLLL.LJFF()).setVolumeMax(LIZLLL.LJII()).build());
    }
}
