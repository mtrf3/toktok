package X;

import com.ss.android.ugc.aweme.services.external.ability.IAVTransformService;
import com.ss.android.vesdk.VEUtils;
import java.io.File;

/* loaded from: classes8.dex */
public final class HOP extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ IAVTransformService.ITransformCallback<Integer> LJLJJL;
    public final /* synthetic */ IAVTransformService.ITransformProgress LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HOP(String str, String str2, int i, int i2, IAVTransformService.ITransformCallback<Integer> iTransformCallback, IAVTransformService.ITransformProgress iTransformProgress) {
        super(0);
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = i;
        this.LJLJJI = i2;
        this.LJLJJL = iTransformCallback;
        this.LJLJJLL = iTransformProgress;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        C1I0.LIZJ(C43075GvP.LIZ);
        C1I0.LIZJ(C43075GvP.LJIIJ);
        new File(C43075GvP.LIZIZ).mkdirs();
        HOQ hoq = new HOQ();
        hoq.LIZ = this.LJLIL;
        hoq.LIZIZ = this.LJLILLLLZI;
        hoq.LJFF = this.LJLJI;
        hoq.LJI = this.LJLJJI;
        hoq.LIZLLL = -1;
        hoq.LJ = 240;
        hoq.LIZJ = 10;
        int convertVideo2Webp = VEUtils.convertVideo2Webp(hoq, new HOS(this.LJLJJLL));
        IAVTransformService.ITransformCallback<Integer> iTransformCallback = this.LJLJJL;
        if (iTransformCallback != null) {
            iTransformCallback.finish(Integer.valueOf(convertVideo2Webp));
        }
        return C76800UCe.LIZ;
    }
}
