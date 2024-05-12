package X;

import com.bytedance.bpea.basics.Cert;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;

/* renamed from: X.LbS, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54578LbS {
    public static /* synthetic */ void LIZ(ILocationBaseServiceForMT iLocationBaseServiceForMT, String str, String str2, ActivityC45651qj activityC45651qj, E8H e8h, Cert cert, InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro interfaceC65784Pro2, InterfaceC65784Pro interfaceC65784Pro3, String str3, int i) {
        InterfaceC65784Pro interfaceC65784Pro4 = interfaceC65784Pro;
        String str4 = str2;
        InterfaceC65784Pro interfaceC65784Pro5 = interfaceC65784Pro2;
        InterfaceC65784Pro interfaceC65784Pro6 = interfaceC65784Pro3;
        String str5 = null;
        if ((i & 2) != 0) {
            str4 = null;
        }
        if ((i & 32) != 0) {
            interfaceC65784Pro4 = null;
        }
        if ((i & 64) != 0) {
            interfaceC65784Pro5 = null;
        }
        if ((i & 128) != 0) {
            interfaceC65784Pro6 = null;
        }
        if ((i & 256) == 0) {
            str5 = str3;
        }
        iLocationBaseServiceForMT.requestInAppConversionPopup(str, str4, activityC45651qj, e8h, cert, interfaceC65784Pro4, interfaceC65784Pro5, interfaceC65784Pro6, str5);
    }
}
