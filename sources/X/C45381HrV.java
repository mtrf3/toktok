package X;

import com.ss.android.ugc.aweme.services.external.ability.IAVProcessService;
import v5.n;

/* renamed from: X.HrV, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45381HrV implements IAVProcessService.IProcessCallback<Integer> {
    public final /* synthetic */ n<Integer> LIZ;

    public C45381HrV(n<Integer> nVar) {
        this.LIZ = nVar;
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVProcessService.IProcessCallback
    public final void finish(Integer num) {
        this.LIZ.LIZJ(Integer.valueOf(num.intValue()));
    }
}
