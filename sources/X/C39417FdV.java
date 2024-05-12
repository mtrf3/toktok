package X;

import android.util.Pair;
import com.bytedance.geckox.model.LocalPackageModel;
import com.bytedance.geckox.model.UpdatePackage;
import defpackage.b0;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.FdV, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39417FdV extends AbstractC61537ODd {
    public final /* synthetic */ InterfaceC39418FdW LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ String LIZJ;

    @Override // X.AbstractC61537ODd
    public final void LJIIIZ(LocalPackageModel localPackageModel) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLocalNewestVersion:localPackage:");
        LIZ.append(localPackageModel);
        C39930Flm.LJ("GeckoXAdapter", X1D.LIZIZ(LIZ), 4);
        InterfaceC39418FdW interfaceC39418FdW = this.LIZ;
        String str = this.LIZIZ;
        localPackageModel.getChannelPath();
        interfaceC39418FdW.LIZIZ(Long.valueOf(localPackageModel.getLatestVersion()), str);
    }

    @Override // X.AbstractC61537ODd
    public final void LIZLLL(Throwable th, java.util.Map map) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onCheckServerVersionFail:requestMap:");
        LIZ.append(map);
        C39930Flm.LIZIZ("GeckoXAdapter", X1D.LIZIZ(LIZ), th);
        InterfaceC39418FdW interfaceC39418FdW = this.LIZ;
        String str = this.LIZIZ;
        if (th == null) {
            th = new Throwable("geckox update failed", th);
        }
        interfaceC39418FdW.LIZ(str, th);
    }

    @Override // X.AbstractC61537ODd
    public final void LJFF(java.util.Map<String, List<Pair<String, Long>>> map, java.util.Map<String, List<UpdatePackage>> map2) {
        List<UpdatePackage> list;
        List<Pair<String, Long>> list2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onCheckServerVersionSuccess:requestMap:");
        LIZ.append(map);
        LIZ.append(" responseMap:");
        LIZ.append(map2);
        C39930Flm.LJI("GeckoXAdapter", X1D.LIZIZ(LIZ), false, 4);
        if (map != null && (list2 = map.get(this.LIZJ)) != null) {
            Iterator<Pair<String, Long>> it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Pair<String, Long> next = it.next();
                if (o.LJ(next.first, this.LIZIZ)) {
                    if (next != null) {
                        return;
                    }
                }
            }
        }
        if (map2 != null && (list = map2.get(this.LIZJ)) != null) {
            Iterator<UpdatePackage> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                UpdatePackage next2 = it2.next();
                if (o.LJ(next2.getChannel(), this.LIZIZ)) {
                    if (next2 != null) {
                        return;
                    }
                }
            }
        }
        this.LIZ.LIZ(this.LIZIZ, new Throwable("invalid channel"));
    }

    @Override // X.AbstractC61537ODd
    public final void LJIIJ(UpdatePackage updatePackage, Throwable th) {
        InterfaceC39418FdW interfaceC39418FdW = this.LIZ;
        String str = this.LIZIZ;
        if (th == null) {
            th = new Throwable("geckox update failed", th);
        }
        interfaceC39418FdW.LIZ(str, th);
    }

    @Override // X.AbstractC61537ODd
    public final void LJIILL(UpdatePackage updatePackage, long j) {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onUpdateSuccess:channel:");
        if (updatePackage != null) {
            str = updatePackage.getChannel();
        } else {
            str = null;
        }
        b0.LJ(LIZ, str, " version:", j);
        C39930Flm.LJI("GeckoXAdapter", X1D.LIZIZ(LIZ), false, 4);
        this.LIZ.LIZIZ(Long.valueOf(j), this.LIZIZ);
    }

    public C39417FdV(InterfaceC39418FdW interfaceC39418FdW, String str, String str2) {
        this.LIZ = interfaceC39418FdW;
        this.LIZIZ = str;
        this.LIZJ = str2;
    }

    @Override // X.AbstractC61537ODd
    public final void LIZJ(int i, Throwable th, java.util.Map map) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onCheckRequestIntercept:code:");
        LIZ.append(i);
        LIZ.append(" requestMap:");
        LIZ.append(map);
        C39930Flm.LIZIZ("GeckoXAdapter", X1D.LIZIZ(LIZ), th);
        this.LIZ.LIZ(this.LIZIZ, th);
    }
}
