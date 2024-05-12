package X;

import Y.IDxS128S0200000_4;
import com.bytedance.touchpoint.core.invitecode.InviteCodeResponse;
import com.bytedance.touchpoint.data.request.INetworkApi;
import com.ss.android.ugc.aweme.ecommerce.core.preloader.ImagePreloadExperiment;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.o;

/* renamed from: X.9hS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C243749hS {
    public static void LIZ(final String inviterCode, InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns interfaceC88472Yns2) {
        o.LJIIIZ(inviterCode, "inviterCode");
        AbstractC73672Svk.LJIIJ(new InterfaceC86003Zc() { // from class: X.9hU
            @Override // X.InterfaceC86003Zc
            public final void subscribe(InterfaceC73573Su9<C243759hT> interfaceC73573Su9) {
                INetworkApi LJFF;
                C76L<InviteCodeResponse> postInviterCode;
                int i;
                Integer num;
                try {
                    InterfaceC247459nR interfaceC247459nR = C95J.LIZ;
                    if (interfaceC247459nR != null && (LJFF = interfaceC247459nR.LJFF()) != null && (postInviterCode = LJFF.postInviterCode(inviterCode)) != null) {
                        InviteCodeResponse inviteCodeResponse = postInviterCode.get();
                        if (inviteCodeResponse != null && inviteCodeResponse.status_code == 0) {
                            InviteCodeResponse.Data data = inviteCodeResponse.data;
                            if (data != null && (num = data.inviterBindStatus) != null) {
                                i = num.intValue();
                            } else {
                                i = -1;
                            }
                            interfaceC73573Su9.onNext(new C243759hT(i, inviteCodeResponse));
                        }
                    }
                } catch (InterruptedException unused) {
                    interfaceC73573Su9.onNext(new C243759hT(ImagePreloadExperiment.PRIORITY_DEFAULT, null));
                } catch (ExecutionException unused2) {
                    interfaceC73573Su9.onNext(new C243759hT(ImagePreloadExperiment.PRIORITY_DEFAULT, null));
                }
            }
        }).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LIZ(new IDxS128S0200000_4(interfaceC88472Yns, interfaceC88472Yns2, 4));
    }
}
