package X;

import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.j;
import com.google.gson.m;
import com.ss.android.ugc.aweme.search.thirdpartylandingpage.core.communication.SccNetAdapter;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.search.thirdpartylandingpage.core.viewmodel.SearchSparkContainerHelper$initSCCSdk$1", f = "SearchSparkContainerHelper.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class FP2 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public FP2(InterfaceC67352kd<? super FP2> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new FP2(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String LJJIII;
        C141335gf.LIZJ(obj);
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        m mVar = FP5.LIZ;
        m mVar2 = (m) LIZLLL.LJIIIIZZ("tiktok_scc_sdk", m.class, mVar);
        if (mVar2 != null) {
            mVar = mVar2;
        }
        if (mVar != null) {
            j LJJIJ = mVar.LJJIJ("scc_cs_allow_list");
            ReentrantReadWriteLock reentrantReadWriteLock = (ReentrantReadWriteLock) C38639FEl.LIZLLL;
            reentrantReadWriteLock.writeLock().lock();
            if (LJJIJ == null) {
                LJJIII = null;
            } else {
                LJJIII = T2R.LJJIII(LJJIJ.LJIILLIIL());
            }
            C38639FEl.LIZJ = LJJIII;
            reentrantReadWriteLock.writeLock().unlock();
        }
        C38639FEl.LIZLLL(new SccNetAdapter());
        if (O3U.LJIILL("tiktok_adblock_rule")) {
            C38430F6k.LIZ();
        } else {
            SFS sfs = new SFS();
            C61520OCm LJIILIIL = O3U.LJIILIIL();
            HashMap hashMap = new HashMap();
            hashMap.put(FP4.LIZ, C47261Igj.LJJIJ(new CheckRequestBodyModel.TargetChannel("tiktok_adblock_rule")));
            LJIILIIL.LIZJ(hashMap, new FP3(sfs));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return new FP2(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
