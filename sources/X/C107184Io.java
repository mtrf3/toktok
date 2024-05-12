package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareProductContent;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.4Io, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C107184Io {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(IMContact iMContact) {
        if (iMContact instanceof IMUser) {
            return "private";
        }
        if (iMContact instanceof IMConversation) {
            return "group";
        }
        return "";
    }

    public static String LIZIZ(C109544Rq c109544Rq) {
        if (c109544Rq.getConversationType() == AbstractC63505Ow9.LIZIZ) {
            return "group";
        }
        return "private";
    }

    public static String LIZJ(IMContact iMContact) {
        if (iMContact instanceof IMUser) {
            return C81273Gx.LIZJ(((IMUser) iMContact).getUid());
        }
        if (iMContact instanceof IMConversation) {
            String conversationId = ((IMConversation) iMContact).getConversationId();
            o.LJIIIIZZ(conversationId, "contact.conversationId");
            return conversationId;
        }
        return "";
    }

    public static String LIZLLL(IMContact iMContact) {
        if (iMContact instanceof IMUser) {
            String uid = ((IMUser) iMContact).getUid();
            o.LJIIIIZZ(uid, "contact.uid");
            return uid;
        }
        if (iMContact instanceof IMConversation) {
            return "-1";
        }
        return "";
    }

    public static String LJ(C109544Rq c109544Rq) {
        return String.valueOf(C81273Gx.LIZLLL(c109544Rq.getConversationId()));
    }

    public static String LJFF(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (TextUtils.equals(String.valueOf(str), BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID())) {
                return "author";
            }
            return "user";
        }
        return "";
    }

    public static JSONObject LJII(java.util.Map map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            jSONObject.put((String) entry.getKey(), entry.getValue());
        }
        return jSONObject;
    }

    public static java.util.Map LJIIIIZZ(String str) {
        String queryParameter;
        HashMap hashMap = new HashMap();
        if (str != null && (queryParameter = UriProtector.getQueryParameter(UriProtector.parse(str), "trackParams")) != null) {
            hashMap.putAll((java.util.Map) GsonProtectorUtils.fromJson(new Gson(), queryParameter, new TypeToken<HashMap<String, Object>>() { // from class: X.4Ip
            }.getType()));
        }
        if (hashMap.containsKey("entrance_info")) {
            hashMap.remove("entrance_info");
        }
        String json = GsonProtectorUtils.toJson(new Gson(), hashMap);
        o.LJIIIIZZ(json, "Gson().toJson(trackParams)");
        hashMap.put("entrance_info", json);
        return hashMap;
    }

    public static void LJI(C109544Rq c109544Rq, ShareProductContent shareProductContent) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LJIIIIZZ(shareProductContent.getQueryParams()));
        linkedHashMap.put("page_name", "chat_im");
        linkedHashMap.put("source_page_type", "");
        linkedHashMap.put("entrance_form", "product_share_card");
        linkedHashMap.put("enter_from_info", "product_share_im");
        linkedHashMap.put("chat_type", LIZIZ(c109544Rq));
        String conversationId = c109544Rq.getConversationId();
        o.LJIIIIZZ(conversationId, "message.conversationId");
        linkedHashMap.put("conversation_id", conversationId);
        linkedHashMap.put("from_user_id", Long.valueOf(c109544Rq.getSender()));
        linkedHashMap.put("to_user_id", LJ(c109544Rq));
        linkedHashMap.put("is_receptor", Integer.valueOf(!TextUtils.equals(String.valueOf(c109544Rq.getSender()), BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID()) ? 1 : 0));
        if (linkedHashMap.containsKey("entrance_info")) {
            linkedHashMap.remove("entrance_info");
        }
        FMX.LJIILJJIL("tiktokec_product_click", LJII(linkedHashMap));
    }

    public static void LJIIIZ(SharePackage sharePackage, String str, List list) {
        String str2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LJIIIIZZ(sharePackage.extras.getString("product_query_params")));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            IMContact iMContact = (IMContact) it.next();
            arrayList.add(LIZ(iMContact));
            arrayList2.add(LIZJ(iMContact));
            arrayList3.add(LIZLLL(iMContact));
            arrayList4.add(Integer.valueOf(iMContact.getIsRecentTop5Contact()));
            arrayList5.add(Integer.valueOf(iMContact.getIsRecentContact()));
        }
        Object obj = linkedHashMap.get("author_id");
        if (obj instanceof String) {
            str2 = (String) obj;
        } else {
            str2 = null;
        }
        linkedHashMap.put("user_type", LJFF(str2));
        linkedHashMap.put("chat_type", arrayList.toString());
        linkedHashMap.put("conversation_id", arrayList2.toString());
        String currentUserID = BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID();
        o.LJIIIIZZ(currentUserID, "get().getService(IUserSe…class.java).currentUserID");
        linkedHashMap.put("from_user_id", currentUserID);
        linkedHashMap.put("to_user_id", arrayList3.toString());
        linkedHashMap.put("is_chat_list_top5", arrayList4.toString());
        linkedHashMap.put("is_recent_contact", arrayList5.toString());
        linkedHashMap.put("is_with_text", Integer.valueOf(!TextUtils.isEmpty(str) ? 1 : 0));
        linkedHashMap.put("chat_cnt", Integer.valueOf(list.size()));
        FMX.LJIILJJIL("tiktokec_share_product_to_chat", LJII(linkedHashMap));
    }
}
