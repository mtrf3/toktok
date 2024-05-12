package com.bytedance.android.livesdk.module;

import X.AbstractC37594EpC;
import X.CN1;
import com.bytedance.android.live.browser.IHostJsbRegisterService;
import com.bytedance.android.live.wallet.IWalletService;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public class HostJsbRegisterService implements IHostJsbRegisterService {
    @Override // X.InterfaceC06390Mx
    public final /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.live.browser.IHostJsbRegisterService
    public final List<Class<? extends AbstractC37594EpC<?, ?>>> provideXBridgetIDLMethodList() {
        List<Class<? extends AbstractC37594EpC<?, ?>>> provideJsbForHost;
        ArrayList arrayList = new ArrayList();
        IWalletService iWalletService = (IWalletService) CN1.LIZ(IWalletService.class);
        if (iWalletService != null && (provideJsbForHost = iWalletService.provideJsbForHost()) != null) {
            arrayList.addAll(provideJsbForHost);
        }
        return arrayList;
    }
}
