package X;

import Y.AfS21S1100000_6;
import android.app.Activity;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.PolicyNoticeServiceImpl;
import com.ss.android.ugc.aweme.pipfeed.PipServiceImpl;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS156S0100000_6;

/* renamed from: X.FcK, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39344FcK implements InterfaceC82928Wge {
    public final /* synthetic */ PolicyNoticeServiceImpl LIZ;

    @Override // X.InterfaceC82928Wge
    public final void LIZ() {
        this.LIZ.LIZ = false;
    }

    public C39344FcK(PolicyNoticeServiceImpl policyNoticeServiceImpl) {
        this.LIZ = policyNoticeServiceImpl;
    }

    @Override // X.InterfaceC82928Wge
    public final void LIZIZ(java.util.Map<String, String> map, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        String str = (String) ((LinkedHashMap) map).get("content_popup_id");
        if (str == null) {
            str = "contentPopupIDEmpty";
        }
        PipServiceImpl.LJJII().LJIILJJIL();
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ != null) {
            PopupManager.LJIIL(new C40461FuL(LJIIIIZZ, str, null, new AqS156S0100000_6(interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 33)));
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        C84763XOl.LIZLLL().LJJL(T16.LIZIZ).LJJLIIIJ(1L).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS21S1100000_6(str, interfaceC65784Pro, 0));
    }
}
