package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* renamed from: X.Uhq, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77906Uhq implements InterfaceC26333AVd {
    public final /* synthetic */ CompletionBlock<InterfaceC77907Uhr> LIZ;
    public final /* synthetic */ C77908Uhs LIZIZ;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC26333AVd
    public final void LIZ() {
        CompletionBlock<InterfaceC77907Uhr> completionBlock = this.LIZ;
        XBaseModel LJIIL = C17N.LJIIL(InterfaceC77907Uhr.class);
        ((InterfaceC77907Uhr) LJIIL).setErrorCode(0);
        completionBlock.onSuccess((XBaseResultModel) LJIIL, "Login flow has been successfully completed.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC26333AVd
    public final void LIZIZ() {
        C77908Uhs c77908Uhs = this.LIZIZ;
        CompletionBlock<InterfaceC77907Uhr> completionBlock = this.LIZ;
        c77908Uhs.getClass();
        XBaseModel LIZJ = ED5.LIZJ(InterfaceC77907Uhr.class, null);
        ((InterfaceC77907Uhr) LIZJ).setErrorCode(4);
        completionBlock.onSuccess((XBaseResultModel) LIZJ, "Login flow cannot be completed.");
    }

    public C77906Uhq(C37356ElM c37356ElM, C77908Uhs c77908Uhs) {
        this.LIZ = c37356ElM;
        this.LIZIZ = c77908Uhs;
    }
}
