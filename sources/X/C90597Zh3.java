package X;

import android.content.Context;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.RouteDiscoveryPreference;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/* renamed from: X.Zh3, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90597Zh3 extends AbstractC90097ZXp {
    public final MediaRouter2 LJLJLLL;
    public final ZXY LJLL;
    public final java.util.Map<MediaRouter2.RoutingController, C90865ZlN> LJLLI;
    public final MediaRouter2.RouteCallback LJLLILLLL;
    public final MediaRouter2.TransferCallback LJLLJ;
    public final MediaRouter2.ControllerCallback LJLLL;
    public final Executor LJLLLL;
    public List<MediaRoute2Info> LJLLLLLL;
    public final java.util.Map<String, String> LJLZ;

    public final void LJIJ() {
        List<MediaRoute2Info> list = (List) this.LJLJLLL.getRoutes().stream().distinct().filter(new Predicate() { // from class: X.Zfg
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return !((MediaRoute2Info) obj).isSystemRoute();
            }
        }).collect(Collectors.toList());
        if (list.equals(this.LJLLLLLL)) {
            return;
        }
        this.LJLLLLLL = list;
        ((ArrayMap) this.LJLZ).clear();
        for (MediaRoute2Info mediaRoute2Info : this.LJLLLLLL) {
            Bundle extras = mediaRoute2Info.getExtras();
            if (extras != null && extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID") != null) {
                ((ArrayMap) this.LJLZ).put(mediaRoute2Info.getId(), extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID"));
            }
        }
        List list2 = (List) this.LJLLLLLL.stream().map(new Function() { // from class: X.Zfi
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ZY6.LIZIZ((MediaRoute2Info) obj);
            }
        }).filter(new C90516Zfk()).collect(Collectors.toList());
        C90098ZXq c90098ZXq = new C90098ZXq();
        c90098ZXq.LIZIZ = true;
        if (list2 != null) {
            if (!list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    c90098ZXq.LIZ((C90089ZXh) it.next());
                }
            }
            LJIILL(new C90099ZXr(c90098ZXq.LIZ, c90098ZXq.LIZIZ));
            return;
        }
        throw new IllegalArgumentException("routes must not be null");
    }

    @Override // X.AbstractC90097ZXp
    public final AbstractC90599Zh5 LJIIJJI(String str) {
        Iterator it = ((ArrayMap) this.LJLLI).entrySet().iterator();
        while (it.hasNext()) {
            C90865ZlN c90865ZlN = (C90865ZlN) ((Map.Entry) it.next()).getValue();
            if (TextUtils.equals(str, c90865ZlN.LJFF)) {
                return c90865ZlN;
            }
        }
        return null;
    }

    @Override // X.AbstractC90097ZXp
    public final AbstractC90096ZXo LJIIL(String str) {
        return new C90596Zh2((String) ((ArrayMap) this.LJLZ).get(str), null);
    }

    @Override // X.AbstractC90097ZXp
    public final void LJIILJJIL(C90524Zfs c90524Zfs) {
        boolean z;
        RouteDiscoveryPreference build;
        C90605ZhB c90605ZhB = ZY5.LIZJ;
        if (c90605ZhB == null || c90605ZhB.LJJ <= 0) {
            this.LJLJLLL.unregisterRouteCallback(this.LJLLILLLL);
            this.LJLJLLL.unregisterTransferCallback(this.LJLLJ);
            this.LJLJLLL.unregisterControllerCallback(this.LJLLL);
            return;
        }
        C90509Zfd c90509Zfd = c90605ZhB.LJIILIIL;
        if (c90509Zfd == null) {
            z = false;
        } else {
            z = c90509Zfd.LIZIZ;
        }
        if (c90524Zfs == null) {
            c90524Zfs = new C90524Zfs(C90101ZXt.LIZJ, false);
        }
        c90524Zfs.LIZ();
        C90101ZXt c90101ZXt = c90524Zfs.LIZIZ;
        c90101ZXt.LIZ();
        List<String> list = c90101ZXt.LIZIZ;
        if (z) {
            if (!list.contains("android.media.intent.category.LIVE_AUDIO")) {
                list.add("android.media.intent.category.LIVE_AUDIO");
            }
        } else {
            list.remove("android.media.intent.category.LIVE_AUDIO");
        }
        C90100ZXs c90100ZXs = new C90100ZXs();
        c90100ZXs.LIZ(list);
        C90524Zfs c90524Zfs2 = new C90524Zfs(c90100ZXs.LIZJ(), c90524Zfs.LIZIZ());
        MediaRouter2 mediaRouter2 = this.LJLJLLL;
        Executor executor = this.LJLLLL;
        MediaRouter2.RouteCallback routeCallback = this.LJLLILLLL;
        if (!c90524Zfs2.LIZJ()) {
            build = new RouteDiscoveryPreference.Builder(new ArrayList(), false).build();
        } else {
            boolean LIZIZ = c90524Zfs2.LIZIZ();
            c90524Zfs2.LIZ();
            C90101ZXt c90101ZXt2 = c90524Zfs2.LIZIZ;
            c90101ZXt2.LIZ();
            build = new RouteDiscoveryPreference.Builder((List) c90101ZXt2.LIZIZ.stream().map(new Function() { // from class: X.Zfu
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ZY6.LIZJ((String) obj);
                }
            }).collect(Collectors.toList()), LIZIZ).build();
        }
        mediaRouter2.registerRouteCallback(executor, routeCallback, build);
        this.LJLJLLL.registerTransferCallback(this.LJLLLL, this.LJLLJ);
        this.LJLJLLL.registerControllerCallback(this.LJLLLL, this.LJLLL);
    }

    public final MediaRoute2Info LJIIZILJ(String str) {
        if (str == null) {
            return null;
        }
        for (MediaRoute2Info mediaRoute2Info : this.LJLLLLLL) {
            if (TextUtils.equals(mediaRoute2Info.getId(), str)) {
                return mediaRoute2Info;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00f9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJI(android.media.MediaRouter2.RoutingController r17) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90597Zh3.LJIJI(android.media.MediaRouter2$RoutingController):void");
    }

    public C90597Zh3(Context context, C90603Zh9 c90603Zh9) {
        super(context, null);
        this.LJLLI = new ArrayMap();
        this.LJLLILLLL = new C90083ZXb(this);
        this.LJLLJ = new C90084ZXc(this);
        this.LJLLL = new ZXZ(this);
        this.LJLLLLLL = new ArrayList();
        this.LJLZ = new ArrayMap();
        this.LJLJLLL = MediaRouter2.getInstance(context);
        this.LJLL = c90603Zh9;
        final Handler handler = new Handler(C16880lQ.LLJJJJ());
        this.LJLLLL = new Executor() { // from class: X.Zfe
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        };
    }

    @Override // X.AbstractC90097ZXp
    public final AbstractC90096ZXo LJIILIIL(String str, String str2) {
        String str3 = (String) ((ArrayMap) this.LJLZ).get(str);
        for (C90865ZlN c90865ZlN : ((ArrayMap) this.LJLLI).values()) {
            if (TextUtils.equals(str2, c90865ZlN.LJI.getId())) {
                return new C90596Zh2(str3, c90865ZlN);
            }
        }
        return new C90596Zh2(str3, null);
    }
}
