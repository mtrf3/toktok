package X;

import com.bytedance.android.live.liveinteract.multilive.model.MultiGuestReserveResponse;
import com.bytedance.android.livesdk.model.message.AudienceReserveUserInfo;

/* renamed from: X.TcT, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75025TcT implements U4B {
    public final /* synthetic */ C75024TcS LJLIL;

    public C75025TcT(C75024TcS c75024TcS) {
        this.LJLIL = c75024TcS;
    }

    @Override // X.U4B
    public final void LIZJ(MultiGuestReserveResponse.ResponseData responseData) {
        long j;
        AudienceReserveUserInfo audienceReserveUserInfo;
        C75024TcS c75024TcS = this.LJLIL;
        c75024TcS.getClass();
        C28733BPl.LJIILIIL().getClass();
        C0NE.LIZ("ModeratorsMangeDialogGuestOperationViewSet", "onCancelReserveSuccess");
        if (responseData != null && (audienceReserveUserInfo = responseData.reserveUserInfo) != null) {
            j = audienceReserveUserInfo.reserveId;
        } else {
            j = 0;
        }
        c75024TcS.LIZIZ(j, "click", true);
        C75027TcV.LIZIZ(1);
        C75027TcV.LIZLLL = 0L;
        c75024TcS.LIZJ();
        InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns = c75024TcS.LJLJLJ;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Boolean.TRUE);
        }
    }

    @Override // X.U4B
    public final void onFailed(Throwable th) {
        String str;
        C75024TcS c75024TcS = this.LJLIL;
        c75024TcS.getClass();
        C28733BPl LJIILIIL = C28733BPl.LJIILIIL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onCancelReserveFailed, throwable=");
        if (th != null) {
            str = th.getMessage();
        } else {
            str = null;
        }
        LIZ.append(str);
        String LIZIZ = X1D.LIZIZ(LIZ);
        LJIILIIL.getClass();
        C0NE.LIZ("ModeratorsMangeDialogGuestOperationViewSet", LIZIZ);
        c75024TcS.LIZIZ(C75027TcV.LIZLLL, "click", true);
        InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns = c75024TcS.LJLJLJ;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Boolean.FALSE);
        }
    }
}
