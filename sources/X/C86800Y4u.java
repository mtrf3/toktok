package X;

import com.ss.android.ugc.aweme.AccountService;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Y4u, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86800Y4u implements InterfaceC39320Fbw {
    public final List<String> LIZ = C47261Igj.LJJIJIIJI("com.tmobile.dm.cm", "com.sprint.w.installer", "com.sprint.ce.updater", "com.LogiaGroup.LogiaDeck", "com.dti.cricket", "com.dti.tracfone", "com.ironsrc.aura.tmo", "com.ironsrc.aura.appmanager.tmo");
    public final List<String> LIZIZ = C47261Igj.LJJIJIIJI("BR", "MX", "CO", "PE", "AR", "CL", "EC", "PA", "PY", "BO", "UY", "GT", "VE", "DO", "DM", "CR", "NI", "SV", "HN", "BZ", "GY", "GP", "MQ", "SR", "GF");

    @Override // X.InterfaceC39320Fbw
    public final boolean LIZIZ() {
        return true;
    }

    @Override // X.InterfaceC39320Fbw
    public final C39316Fbs LIZ(C39316Fbs preInstallResult) {
        o.LJIIIZ(preInstallResult, "preInstallResult");
        if (this.LIZIZ.contains(AccountService.LJIJ().LJIILL())) {
            ArrayList arrayList = new ArrayList();
            for (String str : this.LIZ) {
                if (FCD.LJFF(EF7.LIZIZ(), str)) {
                    arrayList.add(str);
                }
            }
            preInstallResult.LIZ.LJLLLL.addAll(arrayList);
            preInstallResult.LIZ.LJLLLLLL = true;
        }
        return preInstallResult;
    }
}
