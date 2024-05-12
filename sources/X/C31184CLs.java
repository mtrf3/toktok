package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;

/* renamed from: X.CLs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31184CLs implements InterfaceC29613Bjl {
    public final /* synthetic */ C29611Bjj LIZ;
    public final /* synthetic */ CompletionBlock<InterfaceC31185CLt> LIZIZ;

    @Override // X.InterfaceC29613Bjl
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC29613Bjl
    public final void LIZ(int i) {
        this.LIZ.getClass();
        InterfaceC31185CLt interfaceC31185CLt = (InterfaceC31185CLt) ED5.LIZJ(InterfaceC31185CLt.class, null);
        interfaceC31185CLt.setNotificationStatus(Integer.valueOf(i));
        this.LIZIZ.onSuccess(interfaceC31185CLt, "");
    }

    public C31184CLs(C29611Bjj c29611Bjj, C37356ElM c37356ElM) {
        this.LIZ = c29611Bjj;
        this.LIZIZ = c37356ElM;
    }
}
