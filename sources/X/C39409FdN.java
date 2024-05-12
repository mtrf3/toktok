package X;

import android.content.Context;
import android.util.Pair;
import com.bytedance.geckox.model.LocalPackageModel;
import com.bytedance.geckox.model.UpdatePackage;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import defpackage.b0;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.FdN, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39409FdN extends AbstractC61537ODd {
    public final /* synthetic */ InterfaceC39410FdO LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ Context LIZJ;
    public final /* synthetic */ Locale LIZLLL;
    public final /* synthetic */ String LJ;

    @Override // X.AbstractC61537ODd
    public final void LJIIIZ(LocalPackageModel localPackageModel) {
        InterfaceC39410FdO interfaceC39410FdO = this.LIZ;
        if (interfaceC39410FdO != null) {
            String str = this.LIZIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onLocalNewestVersion");
            LIZ.append(localPackageModel.getChannelPath());
            X1D.LIZIZ(LIZ);
            localPackageModel.getLatestVersion();
            interfaceC39410FdO.LIZIZ(str);
        }
    }

    @Override // X.AbstractC61537ODd
    public final void LIZLLL(Throwable th, java.util.Map map) {
        InterfaceC39410FdO interfaceC39410FdO = this.LIZ;
        if (interfaceC39410FdO != null) {
            String str = this.LIZIZ;
            if (th == null) {
                th = new Throwable("geckox update failed", th);
            }
            interfaceC39410FdO.LIZ(str, th);
        }
    }

    @Override // X.AbstractC61537ODd
    public final void LJFF(java.util.Map<String, List<Pair<String, Long>>> map, java.util.Map<String, List<UpdatePackage>> map2) {
        List<UpdatePackage> list;
        List<Pair<String, Long>> list2;
        if (map != null && (list2 = map.get(this.LJ)) != null) {
            String str = this.LIZIZ;
            Iterator<Pair<String, Long>> it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Pair<String, Long> next = it.next();
                if (o.LJ(next.first, str)) {
                    if (next != null) {
                        return;
                    }
                }
            }
        }
        if (map2 != null && (list = map2.get(this.LJ)) != null) {
            String str2 = this.LIZIZ;
            Iterator<UpdatePackage> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                UpdatePackage next2 = it2.next();
                if (o.LJ(next2.getChannel(), str2)) {
                    if (next2 != null) {
                        return;
                    }
                }
            }
        }
        InterfaceC39410FdO interfaceC39410FdO = this.LIZ;
        if (interfaceC39410FdO != null) {
            interfaceC39410FdO.LIZ(this.LIZIZ, new Throwable("invalid channel"));
        }
    }

    @Override // X.AbstractC61537ODd
    public final void LJIIJ(UpdatePackage updatePackage, Throwable th) {
        InterfaceC39410FdO interfaceC39410FdO = this.LIZ;
        if (interfaceC39410FdO != null) {
            String str = this.LIZIZ;
            if (th == null) {
                th = new Throwable("geckox update failed", th);
            }
            interfaceC39410FdO.LIZ(str, th);
        }
    }

    @Override // X.AbstractC61537ODd
    public final void LJIILL(UpdatePackage updatePackage, long j) {
        String str;
        String str2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onUpdateSuccess:channel:");
        String str3 = null;
        if (updatePackage != null) {
            str = updatePackage.getChannel();
        } else {
            str = null;
        }
        b0.LJ(LIZ, str, " version:", j);
        C39930Flm.LJI("StringPatchLoader", X1D.LIZIZ(LIZ), false, 4);
        IMainService createIMainServicebyMonsterPlugin = MainServiceImpl.createIMainServicebyMonsterPlugin(false);
        if (updatePackage != null) {
            str2 = updatePackage.getChannel();
        } else {
            str2 = null;
        }
        String anywhereChannelPath = createIMainServicebyMonsterPlugin.getAnywhereChannelPath(str2);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onUpdateSuccess:channel path:");
        LIZ2.append(anywhereChannelPath);
        C39930Flm.LJI("StringPatchLoader", X1D.LIZIZ(LIZ2), false, 4);
        if (updatePackage != null) {
            String channel = updatePackage.getChannel();
            if (channel != null && anywhereChannelPath != null) {
                C39408FdM.LIZ.storeString(channel, anywhereChannelPath);
            }
            str3 = updatePackage.getChannel();
        }
        if (o.LJ(str3, this.LIZIZ)) {
            Context context = this.LIZJ;
            Locale locale = this.LIZLLL;
            C40905G3p.LIZJ(context, locale, MainServiceImpl.createIMainServicebyMonsterPlugin(false).getAnywhereChannelPath(this.LIZIZ), "download", System.nanoTime(), new C39407FdL(EF7.LJ(), locale));
        }
        InterfaceC39410FdO interfaceC39410FdO = this.LIZ;
        if (interfaceC39410FdO != null) {
            String str4 = this.LIZIZ;
            C1JX.LJIIIIZZ("onUpdateSuccess:", anywhereChannelPath);
            if (updatePackage != null) {
                updatePackage.getVersion();
            }
            interfaceC39410FdO.LIZIZ(str4);
        }
    }

    @Override // X.AbstractC61537ODd
    public final void LIZJ(int i, Throwable th, java.util.Map map) {
        InterfaceC39410FdO interfaceC39410FdO = this.LIZ;
        if (interfaceC39410FdO != null) {
            interfaceC39410FdO.LIZ(this.LIZIZ, th);
        }
    }

    public C39409FdN(Context context, C39412FdQ c39412FdQ, String str, String str2, Locale locale) {
        this.LIZ = c39412FdQ;
        this.LIZIZ = str;
        this.LIZJ = context;
        this.LIZLLL = locale;
        this.LJ = str2;
    }
}
