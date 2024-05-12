package com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge;

import X.C38049EwX;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;

/* loaded from: classes9.dex */
public final class SearchKeywordChangeMethod extends BaseCommonJavaMethod {
    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public SearchKeywordChangeMethod() {
    }

    public SearchKeywordChangeMethod(C38049EwX c38049EwX) {
        super(c38049EwX);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0042, code lost:
    
        r7.onSuccess(new org.json.JSONArray());
     */
    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handle(org.json.JSONObject r6, X.InterfaceC36488ETs r7) {
        /*
            r5 = this;
            java.lang.String r4 = "type"
            if (r6 == 0) goto L40
            java.lang.String r0 = "enterFrom"
            java.lang.String r1 = r6.optString(r0)     // Catch: java.lang.Exception -> L4b
            java.lang.String r0 = "keyword"
            java.lang.String r0 = r6.optString(r0)     // Catch: java.lang.Exception -> L4b
            java.lang.String r3 = r6.optString(r4)     // Catch: java.lang.Exception -> L4b
            com.ss.android.ugc.aweme.search.model.SearchResultParam r2 = new com.ss.android.ugc.aweme.search.model.SearchResultParam     // Catch: java.lang.Exception -> L4b
            r2.<init>()     // Catch: java.lang.Exception -> L4b
            r2.setSearchFrom(r1)     // Catch: java.lang.Exception -> L4b
            r2.setKeyword(r0)     // Catch: java.lang.Exception -> L4b
            X.JnN r1 = new X.JnN     // Catch: java.lang.Exception -> L4b
            java.lang.String r0 = "param"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)     // Catch: java.lang.Exception -> L4b
            r1.<init>(r2)     // Catch: java.lang.Exception -> L4b
            X.C2U8.LIZ(r1)     // Catch: java.lang.Exception -> L4b
            com.ss.android.ugc.aweme.search.pages.result.common.tabs.core.viewmodel.SearchTabViewModel r0 = X.C49446Jas.LIZ     // Catch: java.lang.Exception -> L4b
            if (r0 == 0) goto L40
            com.bytedance.ies.sdk.widgets.NextLiveData<X.Cas> r1 = r0.LJLIL     // Catch: java.lang.Exception -> L4b
            if (r1 != 0) goto L35
            goto L40
        L35:
            X.Cas r0 = new X.Cas     // Catch: java.lang.Exception -> L4b
            kotlin.jvm.internal.o.LJIIIIZZ(r3, r4)     // Catch: java.lang.Exception -> L4b
            r0.<init>(r3)     // Catch: java.lang.Exception -> L4b
            r1.setValue(r0)     // Catch: java.lang.Exception -> L4b
        L40:
            if (r7 == 0) goto L5e
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Exception -> L4b
            r0.<init>()     // Catch: java.lang.Exception -> L4b
            r7.onSuccess(r0)     // Catch: java.lang.Exception -> L4b
            goto L5e
        L4b:
            r2 = move-exception
            java.lang.String r0 = "SearchKeywordChangeMethod"
            X.IGF.LIZ(r2, r0)
            if (r7 == 0) goto L5b
            r1 = 0
            java.lang.String r0 = r2.getMessage()
            r7.LIZ(r1, r0)
        L5b:
            X.C16880lQ.LLLLIIL(r2)
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.SearchKeywordChangeMethod.handle(org.json.JSONObject, X.ETs):void");
    }
}
