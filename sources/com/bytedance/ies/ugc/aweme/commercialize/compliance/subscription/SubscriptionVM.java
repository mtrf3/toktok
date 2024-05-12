package com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription;

import X.GKJ;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.api.ICommercializeComplianceApi;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.SubscriptionStatusResponse;

/* loaded from: classes8.dex */
public final class SubscriptionVM extends ViewModel {
    public static final /* synthetic */ int LJLJJI = 0;
    public final ICommercializeComplianceApi LJLIL;
    public final MutableLiveData<SubscriptionStatusResponse> LJLILLLLZI;
    public final MutableLiveData<Boolean> LJLJI;

    public SubscriptionVM() {
        ICommercializeComplianceApi.LIZ.getClass();
        this.LJLIL = GKJ.LIZ();
        this.LJLILLLLZI = new MutableLiveData<>();
        this.LJLJI = new MutableLiveData<>();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0023, code lost:
    
        if (r8.intValue() == 0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void gv0(java.lang.Integer r7, java.lang.Integer r8, java.lang.Boolean r9, java.lang.Boolean r10, java.lang.String r11) {
        /*
            r6 = this;
            X.UTU r0 = X.UTU.LIZ
            boolean r0 = X.UTU.LIZIZ(r0)
            if (r0 == 0) goto L9
            return
        L9:
            r2 = 1
            if (r8 != 0) goto Le
        Lc:
            r2 = -1
            goto L25
        Le:
            int r0 = r8.intValue()
            if (r0 != r2) goto L16
            r2 = 3
            goto L25
        L16:
            int r1 = r8.intValue()
            r0 = 2
            if (r1 != r0) goto L1f
            r2 = 2
            goto L25
        L1f:
            int r0 = r8.intValue()
            if (r0 != 0) goto Lc
        L25:
            com.bytedance.ies.ugc.aweme.commercialize.compliance.api.ICommercializeComplianceApi r0 = r6.LJLIL     // Catch: java.lang.Exception -> L3c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L3c
            r3 = r9
            r1 = r7
            r5 = r11
            r4 = r10
            X.Ek4 r2 = r0.setSubscriptionUserChoice(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> L3c
            Y.IDdS378S0100000_6 r1 = new Y.IDdS378S0100000_6     // Catch: java.lang.Exception -> L3c
            r0 = 2
            r1.<init>(r6, r0)     // Catch: java.lang.Exception -> L3c
            r2.enqueue(r1)     // Catch: java.lang.Exception -> L3c
        L3c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.SubscriptionVM.gv0(java.lang.Integer, java.lang.Integer, java.lang.Boolean, java.lang.Boolean, java.lang.String):void");
    }
}
