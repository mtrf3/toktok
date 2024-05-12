package X;

import com.ss.android.ugc.aweme.pipfeed.PipServiceImpl;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS39S1300000_6;

/* renamed from: X.FcJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39343FcJ implements InterfaceC82928Wge {
    public final /* synthetic */ C39342FcI LIZ;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LIZIZ;

    @Override // X.InterfaceC82928Wge
    public final void LIZ() {
        this.LIZIZ.invoke();
    }

    public C39343FcJ(C39342FcI c39342FcI, AqS39S1300000_6 aqS39S1300000_6) {
        this.LIZ = c39342FcI;
        this.LIZIZ = aqS39S1300000_6;
    }

    @Override // X.InterfaceC82928Wge
    public final void LIZIZ(java.util.Map<String, String> map, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        C39342FcI c39342FcI = this.LIZ;
        String str = (String) ((LinkedHashMap) map).get("content_popup_id");
        if (str == null) {
            str = "contentPopupIDEmpty";
        }
        c39342FcI.getClass();
        c39342FcI.LIZLLL = str;
        this.LIZ.LIZJ = interfaceC65784Pro;
        PipServiceImpl.LJJII().LJIILJJIL();
        this.LIZIZ.invoke();
    }
}
