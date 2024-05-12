package X;

import java.util.ArrayList;

/* renamed from: X.Ecb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36813Ecb<TTaskResult, TContinuationResult> implements C10I {
    public final /* synthetic */ C47651In1 LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LIZJ;
    public final /* synthetic */ String LIZLLL;

    public C36813Ecb(C47651In1 c47651In1, String str, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, String str2) {
        this.LIZ = c47651In1;
        this.LIZIZ = str;
        this.LIZJ = interfaceC65784Pro;
        this.LIZLLL = str2;
    }

    @Override // X.C10I
    public final Object then(C10K c10k) {
        ((ArrayList) this.LIZ.LIZIZ).remove(this.LIZIZ);
        this.LIZJ.invoke();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LocalVideoCache=>delete video cache,filePath:");
        LIZ.append(this.LIZLLL);
        H7B.LIZ(X1D.LIZIZ(LIZ));
        return C76800UCe.LIZ;
    }
}
