package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* renamed from: X.UzF, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78985UzF extends QNA {
    public final /* synthetic */ CompletionBlock<InterfaceC78988UzI> LIZ;

    public C78985UzF(C37356ElM c37356ElM) {
        this.LIZ = c37356ElM;
    }

    @Override // X.QNA
    public final void LIZIZ(int i, boolean z) {
        CompletionBlock<InterfaceC78988UzI> completionBlock = this.LIZ;
        XBaseModel LIZJ = ED5.LIZJ(InterfaceC78988UzI.class, null);
        ((InterfaceC78988UzI) LIZJ).setResult(Boolean.valueOf(z));
        completionBlock.onSuccess((XBaseResultModel) LIZJ, "");
    }
}
