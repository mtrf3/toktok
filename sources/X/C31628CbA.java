package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;

/* renamed from: X.CbA, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31628CbA implements InterfaceC18460ny {
    public final /* synthetic */ C31624Cb6 LIZ;
    public final /* synthetic */ CompletionBlock<InterfaceC31631CbD> LIZIZ;

    @Override // X.InterfaceC18460ny
    public final void LIZ(C1Z6 c1z6) {
        this.LIZ.getClass();
        InterfaceC31631CbD interfaceC31631CbD = (InterfaceC31631CbD) ED5.LIZJ(InterfaceC31631CbD.class, null);
        this.LIZ.getClass();
        InterfaceC31630CbC interfaceC31630CbC = (InterfaceC31630CbC) ED5.LIZJ(InterfaceC31630CbC.class, null);
        interfaceC31630CbC.setErrorCode(Integer.valueOf(c1z6.LIZ));
        interfaceC31630CbC.setErrorDetailCode(Integer.valueOf(c1z6.LIZIZ));
        interfaceC31630CbC.setErrorMsg(c1z6.LIZJ);
        interfaceC31631CbD.setErrorInfo(interfaceC31630CbC);
        this.LIZIZ.onFailure(0, c1z6.LIZJ, interfaceC31631CbD);
    }

    @Override // X.InterfaceC18460ny
    public final void LIZIZ(C1Z6 c1z6) {
        this.LIZ.getClass();
        InterfaceC31631CbD interfaceC31631CbD = (InterfaceC31631CbD) ED5.LIZJ(InterfaceC31631CbD.class, null);
        interfaceC31631CbD.setOrderID(c1z6.LIZLLL);
        this.LIZIZ.onSuccess(interfaceC31631CbD, "");
    }

    public C31628CbA(C31624Cb6 c31624Cb6, C37356ElM c37356ElM) {
        this.LIZ = c31624Cb6;
        this.LIZIZ = c37356ElM;
    }
}
