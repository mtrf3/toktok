package com.ss.android.ugc.aweme.fe.method;

import X.C38049EwX;
import X.C40309Frt;
import X.C40517FvF;
import X.C78842Uww;
import X.F0E;
import X.InterfaceC36488ETs;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.gift.LiveExchangeConfirmThreshold;
import com.ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class RoutePushMethod extends BaseCommonJavaMethod {
    public static final C40517FvF LJLJJL = C78842Uww.LJJ(LiveExchangeConfirmThreshold.DEFAULT, 60000);
    public final Map<Integer, InterfaceC36488ETs> LJLJI;
    public int LJLJJI;

    public RoutePushMethod() {
        this(null);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public RoutePushMethod(C38049EwX c38049EwX) {
        super(c38049EwX);
        this.LJLJI = new LinkedHashMap();
        this.LJLJJI = LJLJJL.LJLIL;
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC36488ETs interfaceC36488ETs) {
        String optString;
        WeakReference<F0E> weakReference;
        F0E f0e;
        AbsActivityContainer absActivityContainer;
        if (jSONObject != null && (optString = jSONObject.optString("schema")) != null && (!TextUtils.isEmpty(optString)) && (weakReference = this.LJLIL) != null && (f0e = weakReference.get()) != null && (absActivityContainer = (AbsActivityContainer) f0e.LIZ(AbsActivityContainer.class)) != null) {
            absActivityContainer.LJFF(new C40309Frt(this, absActivityContainer));
            if (absActivityContainer.LJIILIIL(this.LJLJJI, optString)) {
                if (interfaceC36488ETs != null) {
                    this.LJLJI.put(Integer.valueOf(this.LJLJJI), interfaceC36488ETs);
                }
                int i = this.LJLJJI + 1;
                this.LJLJJI = i;
                C40517FvF c40517FvF = LJLJJL;
                if (i > c40517FvF.LJLILLLLZI) {
                    this.LJLJJI = c40517FvF.LJLIL;
                    return;
                }
                return;
            }
            if (interfaceC36488ETs == null) {
                return;
            }
            interfaceC36488ETs.LIZ(-1, "router not supported");
            return;
        }
        if (interfaceC36488ETs != null) {
            interfaceC36488ETs.LIZ(-1, "params not valid");
        }
    }
}
