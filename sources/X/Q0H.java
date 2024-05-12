package X;

import android.app.Application;
import com.bytedance.pumbaa.bpea.adapter.api.IBPEADomainModule;
import com.google.gson.g;
import com.google.gson.m;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public abstract class Q0H implements IBPEADomainModule {
    public abstract void LIZLLL(g gVar);

    public void LJ(m mVar) {
    }

    public abstract void LJFF(m mVar);

    @Override // com.bytedance.pumbaa.bpea.adapter.api.IBPEADomainModule
    public void LIZJ(m mVar, Application application) {
        g gVar;
        m mVar2;
        m LJJIJIL;
        o.LJIIIZ(application, "application");
        m mVar3 = null;
        if (mVar != null) {
            gVar = mVar.LJJIJIIJI("pipeline");
        } else {
            gVar = null;
        }
        LIZLLL(gVar);
        if (mVar != null) {
            mVar2 = mVar.LJJIJIL("errorStrategy");
        } else {
            mVar2 = null;
        }
        LJFF(mVar2);
        if (mVar != null && (LJJIJIL = mVar.LJJIJIL("limit")) != null) {
            mVar3 = LJJIJIL.LJJIJIL("dynamicList");
        }
        LJ(mVar3);
    }
}
