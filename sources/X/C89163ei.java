package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.TextContent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3ei, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C89163ei {
    public static final C89163ei LIZ = new C89163ei();
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C3PU.INSTANCE);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C89173ej.LJLIL);

    public static int LIZJ() {
        return ((Number) LIZJ.getValue()).intValue();
    }

    public static void LIZ(List list) {
        C96963rI.LJII().getClass();
        if (!C1GE.LJIIL(C97353rv.LIZIZ())) {
            return;
        }
        C96963rI.LJII().getClass();
        String LIZLLL = C97353rv.LIZLLL();
        Keva kevaRepo = C84523Tk.LJII();
        o.LJIIIIZZ(kevaRepo, "kevaRepo");
        kevaRepo.storeBoolean(C84523Tk.LIZIZ(), true);
        if (list == null || list.isEmpty()) {
            return;
        }
        new C89233ep(LIZLLL, list).LIZ(0);
    }

    public static void LIZIZ(C99003ua c99003ua) {
        List<String> autoSendMsgContent;
        java.util.Map<String, String> linkedHashMap;
        if (c99003ua == null || (autoSendMsgContent = c99003ua.getAutoSendMsgContent()) == null || autoSendMsgContent.isEmpty()) {
            return;
        }
        String sessionId = c99003ua.getSessionId();
        java.util.Map<String, String> sendParams = c99003ua.getSendParams();
        if (sendParams != null) {
            linkedHashMap = C113554cx.LJJLIL(sendParams);
        } else {
            linkedHashMap = new LinkedHashMap<>();
        }
        java.util.Map<String, String> autoSendMsgExtra = c99003ua.getAutoSendMsgExtra();
        String str = null;
        if (autoSendMsgExtra != null && (!autoSendMsgExtra.isEmpty())) {
            linkedHashMap.putAll(autoSendMsgExtra);
        }
        linkedHashMap.put("content_type", CardStruct.IStatusCode.DEFAULT);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("auto send: ");
        List<String> autoSendMsgContent2 = c99003ua.getAutoSendMsgContent();
        if (autoSendMsgContent2 != null) {
            str = (String) ORZ.LJLLLLLL(0, autoSendMsgContent2);
        }
        LIZ2.append(str);
        V1B.LJIIZILJ(X1D.LIZIZ(LIZ2));
        List<String> autoSendMsgContent3 = c99003ua.getAutoSendMsgContent();
        String searchId = c99003ua.getSearchId();
        if (autoSendMsgContent3 == null || autoSendMsgContent3.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(C32I.LJJL(autoSendMsgContent3, 10));
        Iterator<String> it = autoSendMsgContent3.iterator();
        while (it.hasNext()) {
            arrayList.add(TextContent.Companion.obtain$default(TextContent.Companion, it.next(), null, null, 6, null));
        }
        C4MW c4mw = (C4MW) C88903eI.LIZ();
        c4mw.LIZ.LIZIZ = sessionId;
        c4mw.LJ(arrayList);
        c4mw.LIZ.LJFF = linkedHashMap;
        LIZ.getClass();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("from_enter_auto_send", "1");
        if (searchId.length() > 0) {
            linkedHashMap2.put("search_id", searchId);
        }
        c4mw.LIZ.LJII = linkedHashMap2;
        c4mw.LJI();
        C43045Guv.LIZLLL(C84613Tt.LJLIL, 0L);
    }

    public static boolean LIZLLL(C109544Rq c109544Rq) {
        String str;
        java.util.Map<String, String> localExt;
        if (LJ(c109544Rq)) {
            if (c109544Rq != null && (localExt = c109544Rq.getLocalExt()) != null) {
                str = localExt.get("#IS_LAST_WELCOME_MSG");
            } else {
                str = null;
            }
            if (o.LJ(str, "1")) {
                return true;
            }
        }
        return false;
    }

    public static boolean LJ(C109544Rq c109544Rq) {
        String str;
        java.util.Map<String, String> localExt;
        if (C93793mB.LJIIL(c109544Rq)) {
            if (c109544Rq != null && (localExt = c109544Rq.getLocalExt()) != null) {
                str = localExt.get("is_welcome_msg");
            } else {
                str = null;
            }
            if (o.LJ(str, "1")) {
                return true;
            }
        }
        return false;
    }
}
