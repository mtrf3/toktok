package com.ss.android.ugc.aweme.web.jsbridge;

import X.C38049EwX;
import X.C38919FPf;
import X.C40268FrE;
import X.C40273FrJ;
import X.InterfaceC36488ETs;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class FeedbackUploadALog extends BaseCommonJavaMethod {
    public C38919FPf LJLJI;

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public FeedbackUploadALog(C38049EwX c38049EwX) {
        super(c38049EwX);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC36488ETs interfaceC36488ETs) {
        if (this.LJLJI == null) {
            this.LJLJI = new C38919FPf();
        }
        this.LJLJI.LIZ(new C40273FrJ(1, interfaceC36488ETs), new C40268FrE(interfaceC36488ETs));
    }
}
