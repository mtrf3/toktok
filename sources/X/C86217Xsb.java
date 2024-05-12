package X;

import com.ss.android.ugc.aweme.services.external.ability.IAVProcessService;
import v5.n;

/* renamed from: X.Xsb, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86217Xsb implements IAVProcessService.IProcessCallback<String> {
    public final /* synthetic */ n<String> LIZ;

    public C86217Xsb(n<String> nVar) {
        this.LIZ = nVar;
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVProcessService.IProcessCallback
    public final void finish(String str) {
        this.LIZ.LJ(str);
    }
}
