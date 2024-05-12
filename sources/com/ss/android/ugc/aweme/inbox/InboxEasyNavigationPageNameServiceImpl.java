package com.ss.android.ugc.aweme.inbox;

import X.C53355Kwp;
import X.C58096Mr6;
import X.InterfaceC27853AwT;
import X.InterfaceC36571c5;
import X.LK2;
import androidx.fragment.app.Fragment;
import com.bytedance.router.fragment.NavigationUtils;

/* loaded from: classes5.dex */
public final class InboxEasyNavigationPageNameServiceImpl implements InboxEasyNavigationPageNameService {
    public static InboxEasyNavigationPageNameService LIZIZ() {
        Object LIZ = C58096Mr6.LIZ(InboxEasyNavigationPageNameService.class, false);
        if (LIZ != null) {
            return (InboxEasyNavigationPageNameService) LIZ;
        }
        if (C58096Mr6.r1 == null) {
            synchronized (InboxEasyNavigationPageNameService.class) {
                if (C58096Mr6.r1 == null) {
                    C58096Mr6.r1 = new InboxEasyNavigationPageNameServiceImpl();
                }
            }
        }
        return C58096Mr6.r1;
    }

    @Override // com.ss.android.ugc.aweme.inbox.InboxEasyNavigationPageNameService
    public final String LIZ(Fragment fragment) {
        InterfaceC27853AwT interfaceC27853AwT;
        String pageName;
        if (C53355Kwp.LIZ() && NavigationUtils.findNavigationContainer(fragment) != null) {
            InterfaceC36571c5 findTopFragment = NavigationUtils.findTopFragment(fragment);
            if ((findTopFragment instanceof LK2) && (interfaceC27853AwT = (InterfaceC27853AwT) findTopFragment) != null && (pageName = interfaceC27853AwT.getPageName()) != null) {
                return pageName;
            }
        }
        return "notification_page";
    }
}
