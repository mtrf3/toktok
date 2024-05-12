package com.ss.android.ugc.aweme.bullet.bridge.common;

import X.ActivityC45651qj;
import X.C10K;
import X.C43995HOl;
import X.C78450Uqc;
import X.C78451Uqd;
import X.C78685UuP;
import X.EDK;
import X.F3T;
import X.HG3;
import X.InterfaceC37146Ehy;
import X.RBX;
import Y.AgS41S1200000_7;
import Y.IDeS97S0200000_7;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.api.AnchorAutoSelectionResponse;
import com.ss.android.ugc.aweme.api.AnchorAutoSelectionService;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class ShareOpenPlatformMethod extends BaseBridgeMethod {
    public String LJLIL;
    public String LJLILLLLZI;
    public String LJLJI;

    @Override // X.InterfaceC38217EzF
    public final String getName() {
        return "shareOpenPlatform";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareOpenPlatformMethod(F3T contextProviderFactory) {
        super(contextProviderFactory);
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
    }

    public final ActivityC45651qj LIZJ(Context context) {
        if (context instanceof ActivityC45651qj) {
            return (ActivityC45651qj) context;
        }
        if (context instanceof ContextWrapper) {
            return LIZJ(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public final void LIZLLL(JSONObject jSONObject) {
        int i = JSONObjectProtectorUtils.getInt(jSONObject, "action_type");
        String string = JSONObjectProtectorUtils.getString(jSONObject, "anchor_source_type");
        String string2 = JSONObjectProtectorUtils.getString(jSONObject, "extra");
        if (i == 1 && C78685UuP.LJJJZ(string)) {
            EDK edk = AnchorAutoSelectionService.LIZ;
            String str = this.LJLJI;
            edk.getClass();
            C10K<AnchorAutoSelectionResponse> anchorAutoSelectionResponse = EDK.LIZIZ.getAnchorAutoSelectionResponse(str, string2, string, 4, null);
            anchorAutoSelectionResponse.LJ(new AgS41S1200000_7(anchorAutoSelectionResponse, this, string2, 0), C10K.LJIIIIZZ, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void handle(JSONObject params, InterfaceC37146Ehy iReturn) {
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        try {
            this.LJLJI = JSONObjectProtectorUtils.getString(params, "client_key");
        } catch (JSONException unused) {
        }
        try {
            this.LJLIL = JSONObjectProtectorUtils.getString(params, "enter_from");
            this.LJLILLLLZI = JSONObjectProtectorUtils.getString(params, "enter_method");
        } catch (JSONException unused2) {
        }
        if (!((RBX) HG3.LJIILL()).isLogin()) {
            Activity LIZ = C43995HOl.LIZ(getContext());
            if (LIZ != null) {
                C78450Uqc c78450Uqc = new C78450Uqc();
                c78450Uqc.LIZ = LIZ;
                c78450Uqc.LIZIZ = this.LJLIL;
                c78450Uqc.LIZJ = this.LJLILLLLZI;
                c78450Uqc.LJ = new IDeS97S0200000_7(this, params, 0);
                HG3.LJIIIIZZ().showLoginAndRegisterView(new C78451Uqd(c78450Uqc));
                return;
            }
            return;
        }
        LIZLLL(params);
    }
}
