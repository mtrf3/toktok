package X;

import com.ss.android.ugc.aweme.services.external.ability.IAVProcessService;
import v5.n;

/* loaded from: classes8.dex */
public final class HN7 implements IAVProcessService.IProcessCallback<Integer> {
    public final /* synthetic */ n<Integer> LIZ;

    public HN7(n<Integer> nVar) {
        this.LIZ = nVar;
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVProcessService.IProcessCallback
    public final void finish(Integer num) {
        this.LIZ.LIZJ(Integer.valueOf(num.intValue()));
    }
}
