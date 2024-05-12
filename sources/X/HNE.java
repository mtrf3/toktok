package X;

import com.ss.android.ugc.aweme.services.external.ability.IAVProcessService;
import v5.n;

/* loaded from: classes8.dex */
public final class HNE implements IAVProcessService.IProcessCallback<String> {
    public final /* synthetic */ n<String> LIZ;

    public HNE(n<String> nVar) {
        this.LIZ = nVar;
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVProcessService.IProcessCallback
    public final void finish(String str) {
        this.LIZ.LJ(str);
    }
}
