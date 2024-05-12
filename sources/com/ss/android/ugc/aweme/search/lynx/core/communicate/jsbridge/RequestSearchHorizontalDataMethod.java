package com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge;

import X.AbstractC50059Jkl;
import X.ActivityC45651qj;
import X.C2U8;
import X.C45804HyK;
import X.C49587Jd9;
import X.C49737JfZ;
import X.C50062Jko;
import X.C50345JpN;
import X.C60737Nsb;
import X.EnumC50341JpJ;
import X.F3T;
import X.IGF;
import X.InterfaceC37146Ehy;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class RequestSearchHorizontalDataMethod extends BaseBridgeMethod {
    public final String LJLIL;
    public final C50345JpN LJLILLLLZI;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC38217EzF
    public final String getName() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequestSearchHorizontalDataMethod(F3T contextProviderFactory) {
        super(contextProviderFactory);
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
        this.LJLIL = "requestSearchHorizontalData";
        this.LJLILLLLZI = new C50345JpN(contextProviderFactory, "requestSearchHorizontalData", EnumC50341JpJ.STABLE);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void handle(JSONObject params, InterfaceC37146Ehy iReturn) {
        Integer num;
        Integer valueOf;
        Context context;
        ActivityC45651qj LJJIFFI;
        ISearchContextAbility iSearchContextAbility;
        AbstractC50059Jkl<C49587Jd9> ut0;
        C49587Jd9 LIZJ;
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        if (this.LJLILLLLZI.LIZ(params, iReturn)) {
            return;
        }
        params.optInt("sessionId", -1);
        try {
            C60737Nsb c60737Nsb = this.contextProviderFactory.LIZIZ;
            Integer num2 = null;
            if (c60737Nsb != null && (iSearchContextAbility = (ISearchContextAbility) c60737Nsb.LIZIZ(ISearchContextAbility.class)) != null && (ut0 = iSearchContextAbility.ut0()) != null && (LIZJ = ut0.LIZJ()) != null) {
                num = Integer.valueOf(LIZJ.LJLILLLLZI);
            } else {
                num = null;
            }
            String optString = params.optString("searchId");
            String str = "";
            if (optString == null) {
                optString = "";
            }
            String optString2 = params.optString("query");
            if (optString2 == null) {
                optString2 = "";
            }
            String optString3 = params.optString("backtrace");
            if (optString3 == null) {
                optString3 = "";
            }
            String optString4 = params.optString("logId");
            if (optString4 == null) {
                optString4 = "";
            }
            String optString5 = params.optString("tokenType");
            if (optString5 != null) {
                str = optString5;
            }
            long optLong = params.optLong("cursor", 0L);
            long optLong2 = params.optLong("count", 0L);
            if (num != null && (num.intValue() == 40 || num.intValue() == 74)) {
                valueOf = Integer.valueOf(params.optInt("tabIndex"));
                context = getContext();
                if (context != null && (LJJIFFI = C45804HyK.LJJIFFI(context)) != null) {
                    num2 = Integer.valueOf(LJJIFFI.hashCode());
                }
                C2U8.LIZ(new C49737JfZ(new C50062Jko(num, optString, optString2, optString3, optString4, str, optLong, optLong2, null, valueOf, String.valueOf(num2), 256)));
                iReturn.onSuccess(0);
            }
            valueOf = null;
            context = getContext();
            if (context != null) {
                num2 = Integer.valueOf(LJJIFFI.hashCode());
            }
            C2U8.LIZ(new C49737JfZ(new C50062Jko(num, optString, optString2, optString3, optString4, str, optLong, optLong2, null, valueOf, String.valueOf(num2), 256)));
            iReturn.onSuccess(0);
        } catch (Exception e) {
            IGF.LIZ(e, "requestSearchHorizontalData");
            iReturn.LIZ(-1, e.getMessage());
        }
    }
}
