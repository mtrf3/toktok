package com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.bullet;

import X.C50345JpN;
import X.F3T;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class GetSearchHistoryMethod extends BaseBridgeMethod {
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
    public GetSearchHistoryMethod(F3T contextProviderFactory) {
        super(contextProviderFactory);
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
        this.LJLIL = "getSearchHistory";
        this.LJLILLLLZI = new C50345JpN(contextProviderFactory, "getSearchHistory");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a7, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L31;
     */
    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handle(org.json.JSONObject r11, X.InterfaceC37146Ehy r12) {
        /*
            r10 = this;
            java.lang.String r0 = "params"
            kotlin.jvm.internal.o.LJIIIZ(r11, r0)
            java.lang.String r0 = "iReturn"
            kotlin.jvm.internal.o.LJIIIZ(r12, r0)
            X.JpN r0 = r10.LJLILLLLZI
            boolean r0 = r0.LIZ(r11, r12)
            if (r0 == 0) goto L13
            return
        L13:
            r3 = 0
            java.lang.String r0 = "enterFrom"
            r11.optString(r0)     // Catch: java.lang.Exception -> Le8
            android.app.Activity r1 = X.C84763XOl.LJIIIIZZ()     // Catch: java.lang.Exception -> Le8
            X.KAr r4 = X.EnumC51281KAr.DEFAULT     // Catch: java.lang.Exception -> Le8
            r7 = 0
            if (r1 == 0) goto L58
            boolean r0 = r1 instanceof X.ActivityC45651qj     // Catch: java.lang.Exception -> Le8
            if (r0 == 0) goto L58
            X.1qj r1 = (X.ActivityC45651qj) r1     // Catch: java.lang.Exception -> Le8
            X.Jz6 r2 = X.JTO.LIZIZ(r1)     // Catch: java.lang.Exception -> Le8
            X.KAs r1 = X.EnumC51281KAr.Companion     // Catch: java.lang.Exception -> Le8
            int r0 = X.KB1.LIZ(r2)     // Catch: java.lang.Exception -> Le8
            r1.getClass()     // Catch: java.lang.Exception -> Le8
            X.KAr r4 = X.C51282KAs.LIZIZ(r0)     // Catch: java.lang.Exception -> Le8
            boolean r1 = X.KB1.LJI(r4)     // Catch: java.lang.Exception -> Le8
            if (r2 == 0) goto L56
            com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData r0 = r2.getEcSearchEntranceData()     // Catch: java.lang.Exception -> Le8
        L43:
            X.Juc r0 = X.C50837JxJ.LJIIL(r4, r0)     // Catch: java.lang.Exception -> Le8
            X.JwH r5 = X.C50668Jua.LIZ(r1)     // Catch: java.lang.Exception -> Le8
            java.util.List r2 = r0.LIZIZ()     // Catch: java.lang.Exception -> Le8
            java.lang.String r0 = "model.searchHistory"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)     // Catch: java.lang.Exception -> Le8
            goto L5b
        L56:
            r0 = r7
            goto L43
        L58:
            r0 = r7
            r1 = 0
            goto L43
        L5b:
            if (r5 == 0) goto L61
            java.util.List r7 = r5.LJI(r2)     // Catch: java.lang.Exception -> Le8
        L61:
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch: java.lang.Exception -> Le8
            r4.<init>()     // Catch: java.lang.Exception -> Le8
            java.lang.String r6 = "word"
            if (r7 == 0) goto La9
            boolean r0 = r7.isEmpty()     // Catch: java.lang.Exception -> Le8
            r0 = r0 ^ 1
            if (r0 == 0) goto La9
            java.util.Iterator r9 = r7.iterator()     // Catch: java.lang.Exception -> Le8
        L76:
            boolean r0 = r9.hasNext()     // Catch: java.lang.Exception -> Le8
            if (r0 == 0) goto La5
            java.lang.Object r8 = r9.next()     // Catch: java.lang.Exception -> Le8
            com.ss.android.ugc.aweme.discover.model.suggest.TopHistoryWord r8 = (com.ss.android.ugc.aweme.discover.model.suggest.TopHistoryWord) r8     // Catch: java.lang.Exception -> Le8
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch: java.lang.Exception -> Le8
            r7.<init>()     // Catch: java.lang.Exception -> Le8
            java.lang.String r0 = r8.word     // Catch: java.lang.Exception -> La1
            r7.put(r6, r0)     // Catch: java.lang.Exception -> La1
            java.lang.String r1 = "is_top_word"
            java.lang.Integer r0 = r8.isTopWord     // Catch: java.lang.Exception -> La1
            r7.put(r1, r0)     // Catch: java.lang.Exception -> La1
            java.lang.String r1 = "icon_type"
            java.lang.String r0 = r8.iconType     // Catch: java.lang.Exception -> La1
            r7.put(r1, r0)     // Catch: java.lang.Exception -> La1
            java.lang.String r1 = "group_id"
            java.lang.String r0 = r8.groupId     // Catch: java.lang.Exception -> La1
            r7.put(r1, r0)     // Catch: java.lang.Exception -> La1
        La1:
            r4.put(r7)     // Catch: java.lang.Exception -> Le8
            goto L76
        La5:
            X.UCe r0 = X.C76800UCe.LIZ     // Catch: java.lang.Exception -> Le8
            if (r0 != 0) goto Lcd
        La9:
            r0 = 20
            java.util.List r0 = X.ORZ.LLILLL(r2, r0)     // Catch: java.lang.Exception -> Le8
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Exception -> Le8
        Lb3:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Exception -> Le8
            if (r0 == 0) goto Lcd
            java.lang.Object r0 = r2.next()     // Catch: java.lang.Exception -> Le8
            com.ss.android.ugc.aweme.search.model.SearchHistory r0 = (com.ss.android.ugc.aweme.search.model.SearchHistory) r0     // Catch: java.lang.Exception -> Le8
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> Le8
            r1.<init>()     // Catch: java.lang.Exception -> Le8
            java.lang.String r0 = r0.keyword     // Catch: java.lang.Exception -> Le8
            r1.put(r6, r0)     // Catch: java.lang.Exception -> Le8
            r4.put(r1)     // Catch: java.lang.Exception -> Le8
            goto Lb3
        Lcd:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Exception -> Le8
            r2.<init>()     // Catch: java.lang.Exception -> Le8
            java.lang.String r0 = "history_list"
            r2.put(r0, r4)     // Catch: java.lang.Exception -> Le4
            if (r5 == 0) goto Le4
            java.lang.String r1 = r5.LIZLLL()     // Catch: java.lang.Exception -> Le4
            if (r1 == 0) goto Le4
            java.lang.String r0 = "historyTopWordLogId"
            r2.put(r0, r1)     // Catch: java.lang.Exception -> Le4
        Le4:
            r12.onSuccess(r2)     // Catch: java.lang.Exception -> Le8
            goto Lf8
        Le8:
            r1 = move-exception
            java.lang.String r0 = "GetSearchHistoryMethod"
            X.IGF.LIZ(r1, r0)
            java.lang.String r0 = r1.getMessage()
            r12.LIZ(r3, r0)
            X.C16880lQ.LLLLIIL(r1)
        Lf8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.bullet.GetSearchHistoryMethod.handle(org.json.JSONObject, X.Ehy):void");
    }
}
