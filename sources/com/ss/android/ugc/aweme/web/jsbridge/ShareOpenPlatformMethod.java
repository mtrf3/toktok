package com.ss.android.ugc.aweme.web.jsbridge;

import X.ActivityC45651qj;
import X.C10K;
import X.C38049EwX;
import X.C43995HOl;
import X.C78450Uqc;
import X.C78451Uqd;
import X.C78685UuP;
import X.EDK;
import X.HG3;
import X.InterfaceC36488ETs;
import X.RBX;
import Y.AgS49S1100000_7;
import Y.IDeS97S0200000_7;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.api.AnchorAutoSelectionService;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class ShareOpenPlatformMethod extends BaseCommonJavaMethod {
    public String LJLJI;
    public String LJLJJI;
    public String LJLJJL;

    public ShareOpenPlatformMethod() {
        super(null);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public ShareOpenPlatformMethod(C38049EwX c38049EwX) {
        super(c38049EwX);
    }

    public final ActivityC45651qj LIZIZ(Context context) {
        if (context instanceof ActivityC45651qj) {
            return (ActivityC45651qj) context;
        }
        if (context instanceof ContextWrapper) {
            return LIZIZ(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public final void LIZJ(JSONObject jSONObject) {
        if (jSONObject != null) {
            Integer valueOf = Integer.valueOf(JSONObjectProtectorUtils.getInt(jSONObject, "action_type"));
            String string = JSONObjectProtectorUtils.getString(jSONObject, "anchor_source_type");
            String string2 = JSONObjectProtectorUtils.getString(jSONObject, "extra");
            if (valueOf == null || valueOf.intValue() != 1 || !C78685UuP.LJJJZ(string)) {
                return;
            }
            EDK edk = AnchorAutoSelectionService.LIZ;
            String str = this.LJLJJL;
            edk.getClass();
            EDK.LIZIZ.getAnchorAutoSelectionResponse(str, string2, string, 4, null).LJ(new AgS49S1100000_7(this, string2, 1), C10K.LJIIIIZZ, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC36488ETs interfaceC36488ETs) {
        String string;
        String string2;
        String str = null;
        if (jSONObject == null) {
            string = null;
        } else {
            try {
                string = JSONObjectProtectorUtils.getString(jSONObject, "client_key");
            } catch (JSONException unused) {
            }
        }
        this.LJLJJL = string;
        if (jSONObject == null) {
            string2 = null;
        } else {
            try {
                string2 = JSONObjectProtectorUtils.getString(jSONObject, "enter_from");
            } catch (JSONException unused2) {
            }
        }
        this.LJLJI = string2;
        if (jSONObject != null) {
            str = JSONObjectProtectorUtils.getString(jSONObject, "enter_method");
        }
        this.LJLJJI = str;
        if (!((RBX) HG3.LJIILL()).isLogin()) {
            Activity LIZ = C43995HOl.LIZ(getActContext());
            if (LIZ != null) {
                C78450Uqc c78450Uqc = new C78450Uqc();
                c78450Uqc.LIZ = LIZ;
                c78450Uqc.LIZIZ = this.LJLJI;
                c78450Uqc.LIZJ = this.LJLJJI;
                c78450Uqc.LJ = new IDeS97S0200000_7(this, jSONObject, 1);
                HG3.LJIIIIZZ().showLoginAndRegisterView(new C78451Uqd(c78450Uqc));
                return;
            }
            return;
        }
        LIZJ(jSONObject);
    }
}
