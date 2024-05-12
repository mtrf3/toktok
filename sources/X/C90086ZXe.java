package X;

import Y.IDRunnableS5S1100000_24;
import android.media.RoutingSessionInfo;
import android.os.Bundle;
import android.os.Messenger;
import androidx.mediarouter.media.MediaRouteProviderService;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: X.ZXe, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90086ZXe {
    public final AbstractC90599Zh5 LIZIZ;
    public final long LIZJ;
    public final int LIZLLL;
    public final WeakReference<C90592Zgy> LJ;
    public boolean LJI;
    public RoutingSessionInfo LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public final /* synthetic */ C90087ZXf LJIIJ;
    public final C1HQ LIZ = new C1HQ();
    public boolean LJFF = false;

    /* JADX WARN: Multi-variable type inference failed */
    public final AbstractC90096ZXo LIZ(String str) {
        C90592Zgy c90592Zgy = this.LJ.get();
        if (c90592Zgy != null) {
            return (AbstractC90096ZXo) c90592Zgy.LJLJLJ.getOrDefault(str, null);
        }
        return (AbstractC90096ZXo) this.LIZ.getOrDefault(str, null);
    }

    public final void LIZIZ(boolean z) {
        C90592Zgy c90592Zgy;
        int keyAt;
        if (!this.LJI) {
            if ((this.LIZLLL & 3) == 3) {
                LIZLLL(null, this.LJII, null);
            }
            if (z) {
                this.LIZIZ.LJIIIIZZ(2);
                this.LIZIZ.LJ();
                if ((this.LIZLLL & 1) == 0 && (c90592Zgy = this.LJ.get()) != null) {
                    AbstractC90096ZXo abstractC90096ZXo = this.LIZIZ;
                    if (abstractC90096ZXo instanceof C90866ZlO) {
                        abstractC90096ZXo = ((C90866ZlO) abstractC90096ZXo).LJI;
                    }
                    String str = this.LJIIIZ;
                    int indexOfValue = c90592Zgy.LJLJJL.indexOfValue(abstractC90096ZXo);
                    if (indexOfValue < 0) {
                        keyAt = -1;
                    } else {
                        keyAt = c90592Zgy.LJLJJL.keyAt(indexOfValue);
                    }
                    c90592Zgy.LJFF(keyAt);
                    if (c90592Zgy.LJLILLLLZI >= 4) {
                        if (keyAt >= 0) {
                            MediaRouteProviderService.LJ(c90592Zgy.LJLIL, 8, 0, keyAt, null, null);
                        }
                    } else {
                        c90592Zgy.LJLL.put(str, Integer.valueOf(keyAt));
                        c90592Zgy.LJLJLLL.postDelayed(new IDRunnableS5S1100000_24(c90592Zgy, str, 2), 5000L);
                        C90099ZXr c90099ZXr = c90592Zgy.LJLLI.LIZ.LJLJJI.LJLJL;
                        if (c90099ZXr != null) {
                            MediaRouteProviderService.LJ(c90592Zgy.LJLIL, 5, 0, 0, c90592Zgy.LIZ(c90099ZXr), null);
                        }
                    }
                }
            }
            this.LJI = true;
            this.LJIIJ.notifySessionReleased(this.LJIIIIZZ);
        }
    }

    public final void LIZJ(RoutingSessionInfo routingSessionInfo) {
        String str;
        if (this.LJII != null) {
            return;
        }
        Messenger messenger = new Messenger(new HandlerC90085ZXd(this.LJIIJ, this.LJIIIIZZ));
        RoutingSessionInfo.Builder builder = new RoutingSessionInfo.Builder(routingSessionInfo);
        Bundle bundle = new Bundle();
        bundle.putParcelable("androidx.mediarouter.media.KEY_MESSENGER", messenger);
        if (routingSessionInfo.getName() != null) {
            str = routingSessionInfo.getName().toString();
        } else {
            str = null;
        }
        bundle.putString("androidx.mediarouter.media.KEY_SESSION_NAME", str);
        this.LJII = builder.setControlHints(bundle).build();
    }

    public final void LJ(C90089ZXh c90089ZXh, Collection<C90092ZXk> collection) {
        RoutingSessionInfo routingSessionInfo = this.LJII;
        if (routingSessionInfo == null) {
            return;
        }
        if (c90089ZXh != null && !c90089ZXh.LIZ.getBoolean("enabled", true)) {
            this.LJIIJ.onReleaseSession(0L, this.LJIIIIZZ);
            return;
        }
        RoutingSessionInfo.Builder builder = new RoutingSessionInfo.Builder(routingSessionInfo);
        if (c90089ZXh != null) {
            this.LJIIIZ = c90089ZXh.LIZLLL();
            builder.setName(c90089ZXh.LJ()).setVolume(c90089ZXh.LJFF()).setVolumeMax(c90089ZXh.LJII()).setVolumeHandling(c90089ZXh.LJI());
            Bundle controlHints = routingSessionInfo.getControlHints();
            if (controlHints == null) {
                controlHints = new Bundle();
            }
            controlHints.putString("androidx.mediarouter.media.KEY_SESSION_NAME", c90089ZXh.LJ());
            controlHints.putBundle("androidx.mediarouter.media.KEY_GROUP_ROUTE", c90089ZXh.LIZ);
            builder.setControlHints(controlHints);
        }
        this.LJII = builder.build();
        if (collection != null && !collection.isEmpty()) {
            builder.clearSelectedRoutes();
            builder.clearSelectableRoutes();
            builder.clearDeselectableRoutes();
            builder.clearTransferableRoutes();
            boolean z = false;
            for (C90092ZXk c90092ZXk : collection) {
                String LIZLLL = c90092ZXk.LIZ.LIZLLL();
                int i = c90092ZXk.LIZIZ;
                if (i == 2 || i == 3) {
                    builder.addSelectedRoute(LIZLLL);
                    z = true;
                }
                if (c90092ZXk.LIZLLL) {
                    builder.addSelectableRoute(LIZLLL);
                }
                if (c90092ZXk.LIZJ) {
                    builder.addDeselectableRoute(LIZLLL);
                }
                if (c90092ZXk.LJ) {
                    builder.addTransferableRoute(LIZLLL);
                }
            }
            if (z) {
                this.LJII = builder.build();
            }
        }
        if ((this.LIZLLL & 5) == 5 && c90089ZXh != null) {
            LIZLLL(c90089ZXh.LIZLLL(), routingSessionInfo, this.LJII);
        }
        if (!this.LJFF) {
            this.LJFF = true;
            this.LJIIJ.notifySessionCreated(this.LIZJ, this.LJII);
        } else {
            this.LJIIJ.notifySessionUpdated(this.LJII);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZLLL(String str, RoutingSessionInfo routingSessionInfo, RoutingSessionInfo routingSessionInfo2) {
        List<String> selectedRoutes;
        List<String> selectedRoutes2;
        AbstractC90096ZXo abstractC90096ZXo;
        if (routingSessionInfo == null) {
            selectedRoutes = Collections.emptyList();
        } else {
            selectedRoutes = routingSessionInfo.getSelectedRoutes();
        }
        if (routingSessionInfo2 == null) {
            selectedRoutes2 = Collections.emptyList();
        } else {
            selectedRoutes2 = routingSessionInfo2.getSelectedRoutes();
        }
        for (String str2 : selectedRoutes2) {
            if (LIZ(str2) == null) {
                AbstractC90097ZXp abstractC90097ZXp = null;
                AbstractC90096ZXo abstractC90096ZXo2 = (AbstractC90096ZXo) this.LIZ.getOrDefault(str2, null);
                if (abstractC90096ZXo2 == null) {
                    if (str == null) {
                        MediaRouteProviderService mediaRouteProviderService = this.LJIIJ.LJLILLLLZI.LIZ;
                        if (mediaRouteProviderService != null) {
                            abstractC90097ZXp = mediaRouteProviderService.LJLJJI;
                        }
                        abstractC90096ZXo2 = abstractC90097ZXp.LJIIL(str2);
                    } else {
                        MediaRouteProviderService mediaRouteProviderService2 = this.LJIIJ.LJLILLLLZI.LIZ;
                        if (mediaRouteProviderService2 != null) {
                            abstractC90097ZXp = mediaRouteProviderService2.LJLJJI;
                        }
                        abstractC90096ZXo2 = abstractC90097ZXp.LJIILIIL(str2, str);
                    }
                    if (abstractC90096ZXo2 != null) {
                        this.LIZ.put(str2, abstractC90096ZXo2);
                    }
                }
                abstractC90096ZXo2.LJFF();
            }
        }
        for (String str3 : selectedRoutes) {
            if (!selectedRoutes2.contains(str3) && (abstractC90096ZXo = (AbstractC90096ZXo) this.LIZ.remove(str3)) != null) {
                abstractC90096ZXo.LJIIIIZZ(0);
                abstractC90096ZXo.LJ();
            }
        }
    }

    public C90086ZXe(C90087ZXf c90087ZXf, AbstractC90599Zh5 abstractC90599Zh5, long j, int i, C90592Zgy c90592Zgy) {
        this.LJIIJ = c90087ZXf;
        this.LIZIZ = abstractC90599Zh5;
        this.LIZJ = j;
        this.LIZLLL = i;
        this.LJ = new WeakReference<>(c90592Zgy);
    }
}
