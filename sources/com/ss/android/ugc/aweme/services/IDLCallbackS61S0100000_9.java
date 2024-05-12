package com.ss.android.ugc.aweme.services;

import X.C55872LwK;
import X.MFS;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.external.ui.IRecordService;

/* loaded from: classes10.dex */
public class IDLCallbackS61S0100000_9 extends SimpleServiceLoadCallback {
    public final int $t;
    public Object l0;

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onLoad(AsyncAVService asyncAVService, long j) {
        switch (this.$t) {
            case 0:
                onLoad$0(this, asyncAVService, j);
                return;
            case 1:
                onLoad$1(this, asyncAVService, j);
                return;
            default:
                super.onLoad(asyncAVService, j);
                return;
        }
    }

    public IDLCallbackS61S0100000_9(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onLoad$0(IDLCallbackS61S0100000_9 iDLCallbackS61S0100000_9, AsyncAVService asyncAVService, long j) {
        IRecordService recordService = asyncAVService.uiService().recordService();
        C55872LwK c55872LwK = (C55872LwK) iDLCallbackS61S0100000_9.l0;
        recordService.startRecord(c55872LwK.LJII, c55872LwK.LJI);
    }

    public static final void onLoad$1(IDLCallbackS61S0100000_9 iDLCallbackS61S0100000_9, AsyncAVService asyncAVService, long j) {
        AVExternalServiceImpl.LIZ().draftService().openDraftActivity(((MFS) iDLCallbackS61S0100000_9.l0).LJLJJLL, null);
    }
}
