package X;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Messenger;
import androidx.mediarouter.media.MediaRouteProviderService;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/* renamed from: X.ZlM, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public class C90864ZlM extends C90595Zh1 {
    public C90087ZXf LJ;
    public final C90840Zky LJFF;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Zky] */
    public C90864ZlM(MediaRouteProviderService mediaRouteProviderService) {
        super(mediaRouteProviderService);
        this.LJFF = new InterfaceC90093ZXl() { // from class: X.Zky
            @Override // X.InterfaceC90093ZXl
            public final void LIZ(AbstractC90599Zh5 abstractC90599Zh5, C90089ZXh c90089ZXh, Collection collection) {
                C90864ZlM.this.LJ.LJFF(abstractC90599Zh5, c90089ZXh, collection);
            }
        };
    }

    @Override // X.C90595Zh1, X.ZXU
    public final void LIZ(Context context) {
        C90087ZXf c90087ZXf = this.LJ;
        if (c90087ZXf != null) {
            c90087ZXf.attachBaseContext(context);
        }
    }

    @Override // X.C90595Zh1, X.ZXU
    public final IBinder LIZIZ(Intent intent) {
        this.LIZ.LIZIZ();
        if (this.LJ == null) {
            this.LJ = new C90087ZXf(this);
            if (this.LIZ.getBaseContext() != null) {
                this.LJ.attachBaseContext(this.LIZ);
            }
        }
        IBinder LIZIZ = super.LIZIZ(intent);
        if (LIZIZ != null) {
            return LIZIZ;
        }
        return this.LJ.onBind(intent);
    }

    @Override // X.C90595Zh1
    public final void LJFF(C90099ZXr c90099ZXr) {
        List<C90089ZXh> list;
        List<C90086ZXe> list2;
        super.LJFF(c90099ZXr);
        C90087ZXf c90087ZXf = this.LJ;
        c90087ZXf.LJLJJL = c90099ZXr;
        if (c90099ZXr == null) {
            list = Collections.emptyList();
        } else {
            list = c90099ZXr.LIZIZ;
        }
        java.util.Map map = (java.util.Map) list.stream().filter(new C90516Zfk()).collect(Collectors.toMap(new Function() { // from class: X.Zfm
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((C90089ZXh) obj).LIZLLL();
            }
        }, new Function() { // from class: X.Zfn
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return obj;
            }
        }, new BinaryOperator() { // from class: X.Zfo
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return obj;
            }
        }));
        synchronized (c90087ZXf.LJLIL) {
            list2 = (List) c90087ZXf.LJLJI.values().stream().filter(new Predicate() { // from class: X.Zfr
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    if ((((C90086ZXe) obj).LIZLLL & 4) == 0) {
                        return true;
                    }
                    return false;
                }
            }).collect(Collectors.toList());
        }
        for (C90086ZXe c90086ZXe : list2) {
            C90866ZlO c90866ZlO = (C90866ZlO) c90086ZXe.LIZIZ;
            if (map.containsKey(c90866ZlO.LJFF)) {
                c90086ZXe.LJ((C90089ZXh) map.get(c90866ZlO.LJFF), null);
            }
        }
        c90087ZXf.notifyRoutes((Collection) map.values().stream().map(new Function() { // from class: X.Zfp
            /* JADX WARN: Code restructure failed: missing block: B:18:0x008b, code lost:
            
                if (r1 != 2) goto L16;
             */
            @Override // java.util.function.Function
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object apply(java.lang.Object r8) {
                /*
                    r7 = this;
                    X.ZXh r8 = (X.C90089ZXh) r8
                    if (r8 != 0) goto L6
                    r0 = 0
                L5:
                    return r0
                L6:
                    android.media.MediaRoute2Info$Builder r2 = new android.media.MediaRoute2Info$Builder
                    java.lang.String r1 = r8.LIZLLL()
                    java.lang.String r0 = r8.LJ()
                    r2.<init>(r1, r0)
                    android.os.Bundle r1 = r8.LIZ
                    java.lang.String r0 = "status"
                    java.lang.String r0 = r1.getString(r0)
                    android.media.MediaRoute2Info$Builder r3 = r2.setDescription(r0)
                    android.os.Bundle r2 = r8.LIZ
                    java.lang.String r1 = "connectionState"
                    r0 = 0
                    int r0 = r2.getInt(r1, r0)
                    android.media.MediaRoute2Info$Builder r1 = r3.setConnectionState(r0)
                    int r0 = r8.LJI()
                    android.media.MediaRoute2Info$Builder r1 = r1.setVolumeHandling(r0)
                    int r0 = r8.LJFF()
                    android.media.MediaRoute2Info$Builder r1 = r1.setVolume(r0)
                    int r0 = r8.LJII()
                    android.media.MediaRoute2Info$Builder r6 = r1.setVolumeMax(r0)
                    r8.LIZ()
                    java.util.List<android.content.IntentFilter> r0 = r8.LIZJ
                    java.util.HashSet r5 = new java.util.HashSet
                    r5.<init>()
                    java.util.Iterator r4 = r0.iterator()
                L52:
                    boolean r0 = r4.hasNext()
                    if (r0 == 0) goto L73
                    java.lang.Object r3 = r4.next()
                    android.content.IntentFilter r3 = (android.content.IntentFilter) r3
                    int r2 = r3.countCategories()
                    r1 = 0
                L63:
                    if (r1 >= r2) goto L52
                    java.lang.String r0 = r3.getCategory(r1)
                    java.lang.String r0 = X.ZY6.LIZJ(r0)
                    r5.add(r0)
                    int r1 = r1 + 1
                    goto L63
                L73:
                    android.media.MediaRoute2Info$Builder r1 = r6.addFeatures(r5)
                    android.net.Uri r0 = r8.LIZJ()
                    android.media.MediaRoute2Info$Builder r2 = r1.setIconUri(r0)
                    android.os.Bundle r0 = r8.LIZ
                    java.lang.String r5 = "deviceType"
                    int r1 = r0.getInt(r5)
                    r4 = 1
                    if (r1 == r4) goto Lf7
                    r0 = 2
                    if (r1 == r0) goto Lfc
                L8d:
                    java.util.List r0 = r8.LIZIZ()
                    boolean r0 = r0.isEmpty()
                    if (r0 != 0) goto L9c
                    java.lang.String r0 = "android.media.route.feature.REMOTE_GROUP_PLAYBACK"
                    r2.addFeature(r0)
                L9c:
                    android.os.Bundle r3 = new android.os.Bundle
                    r3.<init>()
                    android.os.Bundle r1 = r8.LIZ
                    java.lang.String r0 = "extras"
                    android.os.Bundle r1 = r1.getBundle(r0)
                    java.lang.String r0 = "androidx.mediarouter.media.KEY_EXTRAS"
                    r3.putBundle(r0, r1)
                    java.util.ArrayList r1 = new java.util.ArrayList
                    r8.LIZ()
                    java.util.List<android.content.IntentFilter> r0 = r8.LIZJ
                    r1.<init>(r0)
                    java.lang.String r0 = "androidx.mediarouter.media.KEY_CONTROL_FILTERS"
                    r3.putParcelableArrayList(r0, r1)
                    android.os.Bundle r0 = r8.LIZ
                    int r1 = r0.getInt(r5)
                    java.lang.String r0 = "androidx.mediarouter.media.KEY_DEVICE_TYPE"
                    r3.putInt(r0, r1)
                    android.os.Bundle r1 = r8.LIZ
                    java.lang.String r0 = "playbackType"
                    int r1 = r1.getInt(r0, r4)
                    java.lang.String r0 = "androidx.mediarouter.media.KEY_PLAYBACK_TYPE"
                    r3.putInt(r0, r1)
                    java.lang.String r1 = "androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID"
                    java.lang.String r0 = r8.LIZLLL()
                    r3.putString(r1, r0)
                    r2.setExtras(r3)
                    r8.LIZ()
                    java.util.List<android.content.IntentFilter> r0 = r8.LIZJ
                    boolean r0 = r0.isEmpty()
                    if (r0 == 0) goto Lf1
                    java.lang.String r0 = "android.media.route.feature.EMPTY"
                    r2.addFeature(r0)
                Lf1:
                    android.media.MediaRoute2Info r0 = r2.build()
                    goto L5
                Lf7:
                    java.lang.String r0 = "android.media.route.feature.REMOTE_VIDEO_PLAYBACK"
                    r2.addFeature(r0)
                Lfc:
                    java.lang.String r0 = "android.media.route.feature.REMOTE_AUDIO_PLAYBACK"
                    r2.addFeature(r0)
                    goto L8d
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C90521Zfp.apply(java.lang.Object):java.lang.Object");
            }
        }).filter(new C90522Zfq()).collect(Collectors.toList()));
    }

    @Override // X.C90595Zh1
    public final ZXV LIZJ(Messenger messenger, int i, String str) {
        return new C90592Zgy(this, messenger, i, str);
    }
}
