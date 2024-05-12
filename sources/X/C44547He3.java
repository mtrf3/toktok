package X;

import com.google.android.play.core.appupdate.u;
import com.ss.android.ugc.aweme.creative.compileConfig.VEVideoEncodeConfigParams;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.He3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44547He3 extends AbstractC44652Hfk<VEVideoEncodeConfigParams> {
    public final C44539Hdv LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final int LJ;

    @Override // X.InterfaceC44653Hfl
    public final String LIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC44653Hfl
    public final String getName() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC44653Hfl
    public final int getPriority() {
        return this.LJ;
    }

    @Override // X.AbstractC44652Hfk
    public final void LIZIZ(VEVideoEncodeConfigParams vEVideoEncodeConfigParams) {
        String LJIIJJI;
        VEVideoEncodeConfigParams vEVideoEncodeConfigParams2 = vEVideoEncodeConfigParams;
        C44549He5 c44549He5 = this.LIZIZ.LIZIZ;
        if (c44549He5.LIZIZ != null) {
            return;
        }
        List<AbstractC44565HeL> LIZIZ = c44549He5.LIZIZ();
        if ((LIZIZ != null && !LIZIZ.isEmpty()) || (LJIIJJI = u.LJIIJJI(this.LIZIZ.LIZ.uploadSpeedInfo)) == null) {
            return;
        }
        vEVideoEncodeConfigParams2.setEnableRemuxVideo(false);
        vEVideoEncodeConfigParams2.setExternalSettingsJsonStr(LJIIJJI);
        this.LIZIZ.LIZIZ.LIZ = new C44570HeQ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44547He3(InterfaceC44653Hfl strategy, C44539Hdv initParams) {
        super(strategy);
        C44575HeV c44575HeV = C44575HeV.LIZ;
        String name = c44575HeV.key;
        int i = c44575HeV.priority;
        o.LJIIIZ(strategy, "strategy");
        o.LJIIIZ(initParams, "initParams");
        o.LJIIIZ(name, "name");
        this.LIZIZ = initParams;
        this.LIZJ = "upload";
        this.LIZLLL = name;
        this.LJ = i;
    }
}
