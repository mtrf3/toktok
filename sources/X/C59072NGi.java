package X;

import android.os.Bundle;
import android.util.Pair;
import com.bytedance.geckox.model.LocalPackageModel;
import com.bytedance.geckox.model.UpdatePackage;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.NGi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59072NGi extends AbstractC61537ODd {
    public final java.util.Map<String, String> LIZ;
    public final NGY LIZIZ;
    public final EnumC242959gB LIZJ;
    public final String LIZLLL;
    public final long LJ;

    @Override // X.AbstractC61537ODd
    public final void LJIIIZ(LocalPackageModel localPackageModel) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLocalNewest version, channel ");
        LIZ.append(localPackageModel.getChannel());
        C58582Rq.LIZ(X1D.LIZIZ(LIZ), null);
        String str = this.LIZ.get(localPackageModel.getChannel());
        String channel = localPackageModel.getChannel();
        o.LJIIIIZZ(channel, "channel");
        String accessKey = localPackageModel.getAccessKey();
        o.LJIIIIZZ(accessKey, "accessKey");
        Bundle bundle = new Bundle();
        if (str == null) {
            str = "";
        }
        bundle.putString(WM7.SCENE_SERVICE, str);
        bundle.putInt("code", 2);
        new C59073NGj(channel, accessKey);
    }

    @Override // X.AbstractC61537ODd
    public final void LIZLLL(Throwable th, java.util.Map map) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("gecko onCheckServerVersionFail,requestMap = ");
        LIZ.append(map);
        C58582Rq.LIZ(X1D.LIZIZ(LIZ), this.LIZLLL);
        if (map == null) {
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list != null && !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Object obj = ((Pair) it.next()).first;
                    o.LJIIIIZZ(obj, "pair.first");
                    new Bundle().putInt("code", 4);
                    new C59073NGj((String) obj, str);
                }
            }
        }
    }

    @Override // X.AbstractC61537ODd
    public final void LJFF(java.util.Map<String, ? extends List<? extends Pair<String, Long>>> map, java.util.Map<String, ? extends List<? extends UpdatePackage>> map2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("gecko onCheckServerVersionSuccess, requestMap = ");
        LIZ.append(map);
        C58582Rq.LIZ(X1D.LIZIZ(LIZ), this.LIZLLL);
        if ((map == null || map.isEmpty()) && map2 != null) {
            map2.isEmpty();
        }
    }

    @Override // X.AbstractC61537ODd
    public final void LJIIJ(UpdatePackage updatePackage, Throwable th) {
        String str;
        String str2;
        long j;
        if (updatePackage != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("update channel ");
            LIZ.append(updatePackage.getChannel());
            LIZ.append(" failed, msg: ");
            String str3 = "";
            if (th == null || (str = th.getMessage()) == null) {
                str = "";
            }
            LIZ.append(str);
            C58582Rq.LIZ(X1D.LIZIZ(LIZ), null);
            String str4 = this.LIZ.get(updatePackage.getChannel());
            String channel = updatePackage.getChannel();
            if (str4 == null) {
                str2 = "";
            } else {
                str2 = str4;
            }
            int ordinal = this.LIZJ.ordinal();
            long currentTimeMillis = System.currentTimeMillis() - this.LJ;
            UpdatePackage.Package r1 = updatePackage.getPackage();
            long j2 = -1;
            if (r1 != null) {
                j = r1.getId();
            } else {
                j = -1;
            }
            UpdatePackage.Package r12 = updatePackage.getPackage();
            if (r12 != null) {
                j2 = r12.getLength();
            }
            o.LJIIIIZZ(channel, "channel");
            NGX.LIZ(this.LIZIZ, new C59071NGh(channel, str2, Long.valueOf(currentTimeMillis), null, 0, 0, null, null, null, null, Integer.valueOf(ordinal), Long.valueOf(j), Long.valueOf(j2), 2008));
            C58582Rq.LIZ("preload gecko onUpdateFailed", this.LIZLLL);
            String channel2 = updatePackage.getChannel();
            o.LJIIIIZZ(channel2, "channel");
            String accessKey = updatePackage.getAccessKey();
            o.LJIIIIZZ(accessKey, "accessKey");
            Bundle bundle = new Bundle();
            if (str4 != null) {
                str3 = str4;
            }
            bundle.putString(WM7.SCENE_SERVICE, str3);
            bundle.putInt("code", 0);
            new C59073NGj(channel2, accessKey);
        }
    }

    @Override // X.AbstractC61537ODd
    public final void LJIILL(UpdatePackage updatePackage, long j) {
        String str;
        long j2;
        if (updatePackage != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("update channel ");
            LIZ.append(updatePackage.getChannel());
            LIZ.append(" success");
            C58582Rq.LIZ(X1D.LIZIZ(LIZ), null);
            String str2 = this.LIZ.get(updatePackage.getChannel());
            String channel = updatePackage.getChannel();
            if (str2 == null) {
                str = "";
            } else {
                str = str2;
            }
            int ordinal = this.LIZJ.ordinal();
            long currentTimeMillis = System.currentTimeMillis() - this.LJ;
            UpdatePackage.Package r0 = updatePackage.getPackage();
            long j3 = -1;
            if (r0 != null) {
                j2 = r0.getId();
            } else {
                j2 = -1;
            }
            UpdatePackage.Package r02 = updatePackage.getPackage();
            if (r02 != null) {
                j3 = r02.getLength();
            }
            o.LJIIIIZZ(channel, "channel");
            NGX.LIZ(this.LIZIZ, new C59071NGh(channel, str, Long.valueOf(currentTimeMillis), null, 1, 0, null, null, null, null, Integer.valueOf(ordinal), Long.valueOf(j2), Long.valueOf(j3), 2008));
            C58582Rq.LIZ("preload gecko onUpdateSuccess", this.LIZLLL);
            String channel2 = updatePackage.getChannel();
            o.LJIIIIZZ(channel2, "channel");
            String accessKey = updatePackage.getAccessKey();
            o.LJIIIIZZ(accessKey, "accessKey");
            Bundle bundle = new Bundle();
            if (str2 == null) {
                str2 = "";
            }
            bundle.putString(WM7.SCENE_SERVICE, str2);
            bundle.putInt("code", 1);
            new C59073NGj(channel2, accessKey);
        }
    }

    public C59072NGi(java.util.Map map, NGY ngy, EnumC242959gB adHybridGeckoLoadOpportunity) {
        o.LJIIIZ(adHybridGeckoLoadOpportunity, "adHybridGeckoLoadOpportunity");
        this.LIZ = map;
        this.LIZIZ = ngy;
        this.LIZJ = adHybridGeckoLoadOpportunity;
        this.LIZLLL = "AdHybridGeckoXImpl";
        this.LJ = System.currentTimeMillis();
    }

    @Override // X.AbstractC61537ODd
    public final void LIZJ(int i, Throwable th, java.util.Map map) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("gecko onCheckRequestIntercept, code ");
        LIZ.append(i);
        C58582Rq.LIZ(X1D.LIZIZ(LIZ), null);
        if (map == null) {
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list != null && !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Object obj = ((Pair) it.next()).first;
                    o.LJIIIIZZ(obj, "pair.first");
                    new Bundle().putInt("code", i);
                    new C59073NGj((String) obj, str);
                }
            }
        }
    }
}
