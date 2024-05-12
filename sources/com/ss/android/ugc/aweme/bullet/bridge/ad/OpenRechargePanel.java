package com.ss.android.ugc.aweme.bullet.bridge.ad;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C58660N0m;
import X.C59649Nb3;
import X.C59654Nb8;
import X.C68322mC;
import X.C77591Ucl;
import X.C86393XvR;
import X.F3T;
import X.InterfaceC37146Ehy;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import defpackage.i0;
import java.util.HashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class OpenRechargePanel extends BaseBridgeMethod {
    @Override // X.InterfaceC38217EzF
    public final String getName() {
        return "openRechargePanel";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenRechargePanel(F3T contextProviderFactory) {
        super(contextProviderFactory);
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [T, java.util.HashMap] */
    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void handle(JSONObject params, InterfaceC37146Ehy iReturn) {
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        Bundle bundle = new Bundle();
        int optInt = params.optInt("key_bundle_charge_source", 0);
        long optLong = params.optLong("diamond_count", 0L);
        long optLong2 = params.optLong("total_diamond_acount_needed", 0L);
        String chargeReason = params.optString("charge_reason");
        JSONObject optJSONObject = params.optJSONObject("track_info");
        if (chargeReason != null && chargeReason.equals("redpacket")) {
            chargeReason = i0.LJFF(chargeReason, "_new");
        }
        bundle.putInt("key_bundle_charge_source", optInt);
        bundle.putString("key_charge_reason", chargeReason);
        bundle.putLong("key_bundle_need_coins", optLong);
        bundle.putLong("key_bundle_total_coins", optLong2);
        Context context = getContext();
        if (!(context instanceof ActivityC45651qj)) {
            return;
        }
        C77591Ucl c77591Ucl = new C77591Ucl();
        c77591Ucl.LIZIZ = C58660N0m.LIZ(optJSONObject);
        C86393XvR LJJIJIL = LiveOuterService.LJJJLL().LJJIJIL();
        ActivityC45651qj activityC45651qj = (ActivityC45651qj) context;
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = new HashMap();
        DialogFragment rechargeDialogFragment = LJJIJIL.createRechargeDialogFragment(activityC45651qj, new C59649Nb3(optInt, this, c68322mC), bundle, c77591Ucl);
        FragmentManager supportFragmentManager = activityC45651qj.getSupportFragmentManager();
        o.LJIIIIZZ(supportFragmentManager, "context.supportFragmentManager");
        o.LJIIIIZZ(rechargeDialogFragment, "rechargeDialogFragment");
        o.LJIIIIZZ(chargeReason, "chargeReason");
        if (LiveOuterService.LJJJLL().LJJIJIL().LJLIL(activityC45651qj, rechargeDialogFragment, bundle, new C59654Nb8(rechargeDialogFragment, supportFragmentManager, new HashMap(), chargeReason, this)) == 0) {
            rechargeDialogFragment.showNow(activityC45651qj.getSupportFragmentManager(), C16880lQ.LJLLJ(OpenRechargePanel.class));
        }
        iReturn.onSuccess(null);
    }
}
