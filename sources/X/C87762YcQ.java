package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadMobProtocol;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.YcQ, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87762YcQ {
    public static AbstractC87761YcP LJII;
    public int LIZ;
    public final List<AbstractC87761YcP> LIZIZ;
    public final java.util.Map<String, Integer> LIZJ;
    public YXQ LIZLLL;
    public final String LJ;
    public final AbstractC45395Hrj LJFF;
    public final InterfaceC87758YcM LJI;

    public final void LIZ(AbstractC87761YcP abstractC87761YcP) {
        ((ArrayList) this.LIZIZ).add(abstractC87761YcP);
        ((HashMap) this.LIZJ).put(abstractC87761YcP.LJFF(), Integer.valueOf(((ArrayList) this.LIZIZ).size() - 1));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("add ability: ");
        LIZ.append(abstractC87761YcP.LJFF());
        C62737Ojl.LIZJ("ShareDownloadAbilityChain", X1D.LIZIZ(LIZ));
    }

    public C87762YcQ(AbstractC44957Hkf abstractC44957Hkf, InterfaceC87758YcM uiProvider) {
        o.LJIIIZ(uiProvider, "uiProvider");
        this.LJFF = abstractC44957Hkf;
        this.LJI = uiProvider;
        this.LIZIZ = new ArrayList();
        this.LIZJ = new HashMap();
        this.LIZLLL = new YXQ(false, false);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(abstractC44957Hkf.LIZIZ());
        LIZ.append(abstractC44957Hkf.LIZ);
        LIZ.append(abstractC44957Hkf.LIZJ);
        this.LJ = X1D.LIZIZ(LIZ);
    }

    public final void LIZIZ(String outPutPath, YXU resultData, InterfaceC87758YcM uiProvider, DownloadMobProtocol<AbstractC45395Hrj> downloadMobProtocol, C87762YcQ chain) {
        o.LJIIIZ(outPutPath, "outPutPath");
        o.LJIIIZ(resultData, "resultData");
        o.LJIIIZ(uiProvider, "uiProvider");
        o.LJIIIZ(chain, "chain");
        if (this.LIZ == ((ArrayList) this.LIZIZ).size()) {
            return;
        }
        AbstractC87761YcP abstractC87761YcP = (AbstractC87761YcP) ListProtector.get(this.LIZIZ, this.LIZ);
        LJII = abstractC87761YcP;
        this.LIZ++;
        abstractC87761YcP.LIZLLL(outPutPath, resultData, uiProvider, this.LIZLLL, downloadMobProtocol, chain);
    }

    public final void LIZJ(String outPutPath, YXU resultData, InterfaceC87758YcM uiProvider, DownloadMobProtocol<AbstractC45395Hrj> downloadMobProtocol, C87762YcQ chain) {
        Integer num;
        o.LJIIIZ(outPutPath, "outPutPath");
        o.LJIIIZ(resultData, "resultData");
        o.LJIIIZ(uiProvider, "uiProvider");
        o.LJIIIZ(chain, "chain");
        if (this.LIZ != ((ArrayList) this.LIZIZ).size() && (num = (Integer) ((HashMap) this.LIZJ).get("HandleOutPutAbility")) != null) {
            int intValue = num.intValue();
            this.LIZ = intValue + 1;
            ((AbstractC87761YcP) ListProtector.get(this.LIZIZ, intValue)).LIZLLL(outPutPath, resultData, uiProvider, this.LIZLLL, downloadMobProtocol, chain);
        }
    }
}
