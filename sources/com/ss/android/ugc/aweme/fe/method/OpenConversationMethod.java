package com.ss.android.ugc.aweme.fe.method;

import X.C38049EwX;
import X.C65777Prh;
import X.C98763uC;
import X.InterfaceC36488ETs;
import X.QD3;
import X.V1B;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import java.util.HashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class OpenConversationMethod extends BaseCommonJavaMethod {
    public final HashMap<String, InterfaceC36488ETs> LJLJI;

    public OpenConversationMethod() {
        this(null);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public OpenConversationMethod(C38049EwX c38049EwX) {
        super(c38049EwX);
        this.LJLJI = new HashMap<>();
    }

    @QD3
    public final void onSelectedChatMsg(C98763uC event) {
        InterfaceC36488ETs interfaceC36488ETs;
        o.LJIIIZ(event, "event");
        String str = event.LJLILLLLZI;
        if (V1B.LJL(str) && this.LJLJI.containsKey(str) && (interfaceC36488ETs = (InterfaceC36488ETs) C65777Prh.LIZJ(this.LJLJI).remove(str)) != null) {
            if (V1B.LJL(event.LJLIL)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("msgList", event.LJLIL);
                interfaceC36488ETs.LIZJ(1, "", jSONObject);
                return;
            }
            interfaceC36488ETs.LIZ(0, "");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0095, code lost:
    
        if (r4 != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0054, code lost:
    
        if (r6 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0050, code lost:
    
        if (r6 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x004c, code lost:
    
        if (r6 != null) goto L14;
     */
    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handle(org.json.JSONObject r9, X.InterfaceC36488ETs r10) {
        /*
            r8 = this;
            r1 = 0
            if (r9 == 0) goto L13
            java.lang.String r0 = "extra"
            java.lang.String r2 = r9.optString(r0)
            r7 = 0
            r5 = 1
            if (r2 == 0) goto L13
            int r0 = r2.length()
            if (r0 != 0) goto L14
        L13:
            return
        L14:
            java.lang.String r0 = "utf-8"
            java.lang.String r2 = java.net.URLDecoder.decode(r2, r0)
            java.lang.Class<com.google.gson.m> r0 = com.google.gson.m.class
            java.lang.Object r6 = X.C75792yF.LIZ(r2, r0)
            com.google.gson.m r6 = (com.google.gson.m) r6
            if (r6 == 0) goto L4b
            java.lang.String r0 = "conversation_id"
            com.google.gson.j r0 = r6.LJJIJ(r0)
            if (r0 == 0) goto L4b
            java.lang.String r4 = r0.LJJIFFI()
        L30:
            java.lang.String r0 = "uid"
            com.google.gson.j r0 = r6.LJJIJ(r0)
            if (r0 == 0) goto L4f
            java.lang.String r3 = r0.LJJIFFI()
        L3c:
            java.lang.String r0 = "nickname"
            com.google.gson.j r0 = r6.LJJIJ(r0)
            if (r0 == 0) goto L53
            java.lang.String r2 = r0.LJJIFFI()
        L48:
            java.lang.String r0 = "msg_list"
            goto L57
        L4b:
            r4 = r1
            if (r6 == 0) goto L4f
            goto L30
        L4f:
            r3 = r1
            if (r6 == 0) goto L53
            goto L3c
        L53:
            r2 = r1
            if (r6 == 0) goto L67
            goto L48
        L57:
            com.google.gson.j r0 = r6.LJJIJ(r0)     // Catch: java.lang.ClassCastException -> L65
            java.lang.String r1 = r0.LJJIFFI()     // Catch: java.lang.ClassCastException -> L65
            java.lang.String r0 = "{\n            get(key).asString\n        }"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)     // Catch: java.lang.ClassCastException -> L65
            goto L67
        L65:
            java.lang.String r1 = ""
        L67:
            if (r4 == 0) goto L6f
            int r0 = r4.length()
            if (r0 != 0) goto L97
        L6f:
            boolean r0 = X.V1B.LJL(r3)
            if (r0 == 0) goto L95
            boolean r0 = X.V1B.LJL(r2)
            if (r0 == 0) goto L95
            com.ss.android.ugc.aweme.im.service.IIMService r0 = com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService.createIIMServicebyMonsterPlugin(r7)
            X.3GF r0 = r0.getImUserService()
            java.lang.String r4 = r0.LJIIJJI(r3)
            com.ss.android.ugc.aweme.im.service.model.IMUser r0 = new com.ss.android.ugc.aweme.im.service.model.IMUser
            r0.<init>()
            r0.setUid(r3)
            r0.setNickName(r2)
            r0.setFake(r5)
        L95:
            if (r4 == 0) goto L9d
        L97:
            int r0 = r4.length()
            if (r0 != 0) goto Laa
        L9d:
            X.3uC r0 = new X.3uC
            r0.<init>()
            r0.LJLILLLLZI = r4
            r0.LJLIL = r1
            r8.onSelectedChatMsg(r0)
            return
        Laa:
            java.util.HashMap<java.lang.String, X.ETs> r0 = r8.LJLJI
            r0.put(r4, r10)
            goto L9d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.fe.method.OpenConversationMethod.handle(org.json.JSONObject, X.ETs):void");
    }
}
