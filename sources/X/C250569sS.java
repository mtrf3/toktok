package X;

import com.bytedance.touchpoint.core.model.Control;
import com.bytedance.touchpoint.core.model.InAppPush;

/* renamed from: X.9sS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C250569sS {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(InAppPush inAppPush, String str) {
        Integer num;
        InterfaceC247459nR interfaceC247459nR = C95J.LIZ;
        if (interfaceC247459nR != null) {
            OSZ[] oszArr = new OSZ[5];
            oszArr[0] = new OSZ("button_name", str);
            Control control = inAppPush.control;
            String str2 = null;
            if (control != null) {
                num = Integer.valueOf(control.type);
            } else {
                num = null;
            }
            oszArr[1] = new OSZ("type", String.valueOf(num));
            String str3 = inAppPush.inAppPushName;
            String str4 = "";
            if (str3 == null) {
                str3 = "";
            }
            oszArr[2] = new OSZ("name", str3);
            String str5 = inAppPush.taskIds;
            if (str5 != null) {
                str4 = str5;
            }
            oszArr[3] = new OSZ("task_id", str4);
            AbstractC247499nV abstractC247499nV = (AbstractC247499nV) C95J.LIZ(0);
            if (abstractC247499nV != null) {
                str2 = abstractC247499nV.LJIIJ();
            }
            oszArr[4] = new OSZ("region", str2);
            interfaceC247459nR.LIZIZ("inapp_push_click", C113554cx.LJJLIIIIJ(oszArr));
        }
    }
}
