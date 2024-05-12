package com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge;

import X.AbstractC73638SvC;
import X.AbstractC73672Svk;
import X.C49664JeO;
import X.C49995Jjj;
import X.C50345JpN;
import X.C73969T1h;
import X.EnumC50341JpJ;
import X.F3T;
import X.IGF;
import X.InterfaceC37146Ehy;
import X.InterfaceC92693kP;
import X.JSE;
import X.T16;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.search.pages.result.core.repo.SearchApiNew;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class HorizontalLoadMoreMethod extends BaseBridgeMethod {
    public InterfaceC92693kP LJLIL;
    public JSE LJLILLLLZI;
    public final String LJLJI;
    public final C50345JpN LJLJJI;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
        if (event == Lifecycle.Event.ON_DESTROY) {
            disposableObservable();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void disposableObservable() {
        InterfaceC92693kP interfaceC92693kP = this.LJLIL;
        if (interfaceC92693kP != null) {
            interfaceC92693kP.dispose();
        }
    }

    @Override // X.InterfaceC38217EzF
    public final String getName() {
        return this.LJLJI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalLoadMoreMethod(F3T contextProviderFactory) {
        super(contextProviderFactory);
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
        this.LJLJI = "horizontalLoadMore";
        this.LJLJJI = new C50345JpN(contextProviderFactory, "horizontalLoadMore", EnumC50341JpJ.STABLE);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void handle(JSONObject params, InterfaceC37146Ehy iReturn) {
        AbstractC73672Svk horizontalLoadmore;
        String str;
        String str2;
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        if (this.LJLJJI.LIZ(params, iReturn)) {
            return;
        }
        this.LJLIL = null;
        int optInt = params.optInt("sessionId", -1);
        JSONObject optJSONObject = params.optJSONObject("params");
        JSE LIZ = C49995Jjj.LIZ.LIZ(optInt);
        this.LJLILLLLZI = LIZ;
        if (optJSONObject == null || LIZ == null) {
            iReturn.LIZ(-1, "params null");
            return;
        }
        try {
            SearchApiNew.RealApi LIZ2 = SearchApiNew.LIZ();
            String optString = optJSONObject.optString("search_id");
            String str3 = "";
            if (optString == null) {
                optString = "";
            }
            String optString2 = optJSONObject.optString("query");
            if (optString2 == null) {
                optString2 = "";
            }
            String optString3 = optJSONObject.optString("backtrace");
            if (optString3 == null) {
                optString3 = "";
            }
            String optString4 = optJSONObject.optString("log_id");
            if (optString4 == null) {
                optString4 = "";
            }
            String optString5 = optJSONObject.optString("token_type");
            if (optString5 == null) {
                optString5 = "";
            }
            long optLong = optJSONObject.optLong("cursor", 0L);
            String optString6 = optJSONObject.optString("search_result_id");
            if (optString6 == null) {
                optString6 = "";
            }
            JSE jse = this.LJLILLLLZI;
            if (jse != null && (str = jse.LJII) != null && str.length() != 0) {
                JSE jse2 = this.LJLILLLLZI;
                if (jse2 != null && (str2 = jse2.LJII) != null) {
                    str3 = str2;
                }
                iReturn.onSuccess(str3);
                return;
            }
            horizontalLoadmore = LIZ2.horizontalLoadmore(optString, optString2, optString3, optString4, optString5, optLong, null);
            AbstractC73638SvC.LJIIZILJ(horizontalLoadmore).LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()).LIZ(new C49664JeO(this, iReturn, optString5, optString6));
        } catch (Exception e) {
            IGF.LIZ(e, "LoadMoreSearchVideoList");
            iReturn.LIZ(-1, e.getMessage());
        }
    }
}
