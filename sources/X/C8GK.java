package X;

import com.ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService;

/* renamed from: X.8GK, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8GK {
    public static /* synthetic */ void LIZ(IPolicyNoticeService iPolicyNoticeService, String str, String str2, String str3, String str4, Integer num, Integer num2, Boolean bool, InterfaceC65784Pro interfaceC65784Pro, int i) {
        InterfaceC65784Pro interfaceC65784Pro2 = interfaceC65784Pro;
        Boolean bool2 = bool;
        if ((i & 64) != 0) {
            bool2 = Boolean.FALSE;
        }
        if ((i & 256) != 0) {
            interfaceC65784Pro2 = null;
        }
        iPolicyNoticeService.LIZ(str, str2, str3, str4, num, num2, bool2, null, interfaceC65784Pro2);
    }
}
