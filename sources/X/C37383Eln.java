package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;

/* renamed from: X.Eln, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37383Eln<T> implements BQ6 {
    public final /* synthetic */ CompletionBlock<EX9> LIZ;

    public C37383Eln(C37356ElM c37356ElM) {
        this.LIZ = c37356ElM;
    }

    @Override // X.BQ6
    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        if (th instanceof C37394Ely) {
            CompletionBlock<EX9> completionBlock = this.LIZ;
            int code = ((C37394Ely) th).getCode();
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            C31626Cb8.LIZ(completionBlock, code, message, 4);
            return;
        }
        C31626Cb8.LIZ(this.LIZ, 0, th.toString(), 4);
    }
}
