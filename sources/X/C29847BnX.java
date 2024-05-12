package X;

import android.view.View;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.model.message.CapsuleMessage;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.BnX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29847BnX {
    public final /* synthetic */ C29846BnW LIZ;

    public C29847BnX(C29846BnW c29846BnW) {
        this.LIZ = c29846BnW;
    }

    public final void LIZ(View v, CQQ publicScreenContext) {
        o.LJIIIZ(v, "v");
        o.LJIIIZ(publicScreenContext, "publicScreenContext");
        List<InterfaceC29848BnY> hr0 = ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).hr0(((CapsuleMessage) this.LIZ.LJIJJLI).capsuleType);
        C29846BnW c29846BnW = this.LIZ;
        if (hr0 != null) {
            for (InterfaceC29848BnY interfaceC29848BnY : hr0) {
                if (interfaceC29848BnY != null && interfaceC29848BnY.LIZJ(c29846BnW)) {
                    break;
                }
            }
        }
        ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).FY(publicScreenContext, (CapsuleMessage) this.LIZ.LJIJJLI);
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LIZ.LJJ;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (hr0 != null) {
            C29846BnW c29846BnW2 = this.LIZ;
            for (InterfaceC29848BnY interfaceC29848BnY2 : hr0) {
                if (interfaceC29848BnY2 != null) {
                    interfaceC29848BnY2.LJI(c29846BnW2, linkedHashMap);
                }
            }
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_live_capsule_click");
        LIZ.LJIILLIIL(publicScreenContext.LJIIIIZZ);
        LIZ.LJIJJ(this.LIZ.LLD(), "admin_type");
        LIZ.LJIJJ(Long.valueOf(this.LIZ.LJIJJLI.getMessageId()), "msg_id");
        LIZ.LJIJJ(((CapsuleMessage) this.LIZ.LJIJJLI).scene, "msg_name");
        LIZ.LJIJJ(Integer.valueOf(((CapsuleMessage) this.LIZ.LJIJJLI).capsuleType), "msg_type");
        LIZ.LJJIFFI(linkedHashMap);
        LIZ.LJJIIJZLJL();
    }
}
