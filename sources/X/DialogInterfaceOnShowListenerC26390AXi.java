package X;

import android.content.DialogInterface;
import com.ss.android.ugc.aweme.app.services.HybridABInfoService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.AXi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class DialogInterfaceOnShowListenerC26390AXi implements DialogInterface.OnShowListener {
    public final /* synthetic */ ViewOnClickListenerC26389AXh LJLIL;

    public DialogInterfaceOnShowListenerC26390AXi(ViewOnClickListenerC26389AXh viewOnClickListenerC26389AXh) {
        this.LJLIL = viewOnClickListenerC26389AXh;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        String str;
        C26387AXf.LIZ().LIZJ();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", this.LJLIL.LJLILLLLZI);
        if (RBW.LJLLI.LJI()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJIIIZ("is_login", str);
        Integer LIZIZ = HybridABInfoService.LIZJ().LIZIZ();
        if (LIZIZ != null) {
            c188727au.LIZLLL(LIZIZ.intValue(), "is_ab_backend_resp_received");
        }
        G2H g2h = G2H.SHOW_CONTENT_LANGUAGE_POPUP;
        java.util.Map<String, String> onShow$lambda$1 = c188727au.LIZ;
        o.LJIIIIZZ(onShow$lambda$1, "onShow$lambda$1");
        V2B.LJIJ(onShow$lambda$1);
        C36222EJm.LIZIZ(g2h, onShow$lambda$1);
    }
}
