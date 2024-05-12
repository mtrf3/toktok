package X;

import com.lynx.tasm.base.LLog;
import com.lynx.tasm.core.ExternalSourceLoader;
import java.util.concurrent.FutureTask;

/* loaded from: classes15.dex */
public final class VEL extends QXX {
    public final /* synthetic */ VEM LJLIL;
    public final /* synthetic */ FutureTask LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ ExternalSourceLoader LJLJJI;

    @Override // X.QXX
    public final void LLLILZJ(VEH<byte[]> veh) {
        if (veh.LIZJ != null) {
            LLog.LIZLLL(2, "ExternalSourceLoader", "loadExternalSource onSuccess.");
            this.LJLIL.LJLIL = veh.LIZJ;
            this.LJLILLLLZI.run();
            return;
        }
        this.LJLILLLLZI.run();
        ExternalSourceLoader externalSourceLoader = this.LJLJJI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ExternalSourceLoader loadExternalSource request failed, url: ");
        LIZ.append(this.LJLJI);
        LIZ.append(" error:");
        LIZ.append(veh.LIZ);
        externalSourceLoader.LIZIZ(1701, X1D.LIZIZ(LIZ));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VEL(ExternalSourceLoader externalSourceLoader, VEM vem, FutureTask futureTask, String str) {
        super((Object) null);
        this.LJLJJI = externalSourceLoader;
        this.LJLIL = vem;
        this.LJLILLLLZI = futureTask;
        this.LJLJI = str;
    }
}
