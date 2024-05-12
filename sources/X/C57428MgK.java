package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.MgK, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57428MgK {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(IMContact iMContact) {
        if (iMContact instanceof IMUser) {
            return C81273Gx.LIZJ(((IMUser) iMContact).getUid());
        }
        if (iMContact instanceof IMConversation) {
            return ((IMConversation) iMContact).getConversationId();
        }
        return "null";
    }

    public static boolean LIZIZ(String str) {
        return o.LJ("homepage_familiar", str);
    }

    public static boolean LIZJ(String str) {
        return ORY.LJJIJIIJIL(str, new String[]{"homepage_hot", "homepage_follow", "homepage_fresh", "hot_search_video_board", "personal_homepage", "single_song", "prop_page", "others_homepage"});
    }

    public static void LJ(SharePackage sharePackage, String str, long j) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3;
        Bundle bundle4;
        Bundle bundle5;
        long currentTimeMillis = System.currentTimeMillis();
        C85323Wm onEventV3 = C772831o.LIZ();
        o.LJIIIZ(onEventV3, "onEventV3");
        String str7 = null;
        if (sharePackage != null && (bundle5 = sharePackage.extras) != null) {
            str2 = bundle5.getString("enter_method");
        } else {
            str2 = null;
        }
        if (!o.LJ("long_press", str2) && !o.LJ("long_press_more", str2)) {
            str2 = "more_button";
        }
        String str8 = "chat";
        if (sharePackage != null && (bundle4 = sharePackage.extras) != null) {
            str3 = bundle4.getString("platform", "chat");
        } else {
            str3 = null;
        }
        if (!TextUtils.equals(str3, "chat_list")) {
            str8 = str3;
        }
        String LIZIZ = C4KZ.LIZIZ(currentTimeMillis, "share_video_success");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("platform", str8);
        if (sharePackage != null && (bundle3 = sharePackage.extras) != null) {
            str4 = bundle3.getString("aid");
        } else {
            str4 = null;
        }
        c188727au.LJIIIZ("group_id", str4);
        if (sharePackage != null && (bundle2 = sharePackage.extras) != null) {
            str5 = bundle2.getString("author_id");
        } else {
            str5 = null;
        }
        c188727au.LJIIIZ("author_id", str5);
        if (sharePackage != null && (bundle = sharePackage.extras) != null) {
            str7 = bundle.getString("enter_from");
        }
        c188727au.LJIIIZ("enter_from", str7);
        if (j > 0) {
            str6 = "private";
        } else {
            str6 = "group";
        }
        c188727au.LJIIIZ("chat_type", str6);
        c188727au.LJIIIZ("enter_method", str2);
        c188727au.LJIIIZ("bind_id", LIZIZ);
        java.util.Map<String, String> eventParams = c188727au.LIZ;
        o.LJIIIIZZ(eventParams, "eventParams");
        onEventV3.LIZIZ("share_video_success", eventParams);
        C1HQ c1hq = new C1HQ();
        c1hq.put("bind_id", LIZIZ);
        c1hq.put("conversation_id", str);
        if (j > 0) {
            c1hq.put("to_user_id", String.valueOf(j));
        }
        onEventV3.LIZIZ("share_video_success_info", c1hq);
    }

    public static void LJII(Bundle bundle, JSONObject jSONObject, IMContact iMContact, Aweme aweme) {
        IMUser iMUser;
        java.util.Map LIZ2 = C176276vv.LIZ(aweme, Z9N.LIZIZ.LLJLLIL(bundle.getString("enter_from", ""), bundle.getString("previousPage")));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : LIZ2.entrySet()) {
            if (C78983UzD.LJIJJLI((String) entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            if (C78685UuP.LJJJZ((String) entry2.getValue())) {
                jSONObject.put((String) entry2.getKey(), entry2.getValue());
            }
        }
        if ((iMContact instanceof IMUser) && (iMUser = (IMUser) iMContact) != null) {
            jSONObject.put("to_user_id", iMUser.getUid());
        }
    }

    public static void LIZLLL(SharePackage sharePackage, String str, long j, boolean z, String str2) {
        String str3;
        String str4;
        String str5;
        String str6;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3;
        C85323Wm onEventV3 = C772831o.LIZ();
        o.LJIIIZ(onEventV3, "onEventV3");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("platform", "chat");
        String str7 = null;
        if (sharePackage != null && (bundle3 = sharePackage.extras) != null) {
            str3 = bundle3.getString("aid");
        } else {
            str3 = null;
        }
        c188727au.LJIIIZ("group_id", str3);
        if (sharePackage != null && (bundle2 = sharePackage.extras) != null) {
            str4 = bundle2.getString("author_id");
        } else {
            str4 = null;
        }
        c188727au.LJIIIZ("author_id", str4);
        if (sharePackage != null && (bundle = sharePackage.extras) != null) {
            str7 = bundle.getString("enter_from");
        }
        c188727au.LJIIIZ("enter_from", str7);
        c188727au.LJIIIZ("conversation_id", str);
        if (j > 0) {
            c188727au.LJ(j, "to_user_id");
            str5 = "private";
        } else {
            str5 = "group";
        }
        c188727au.LJIIIZ("chat_type", str5);
        c188727au.LJIIIZ("enter_method", "more_button");
        if (z) {
            str6 = "1";
        } else {
            str6 = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJIIIZ("status", str6);
        c188727au.LJIIIZ("error_code", str2);
        java.util.Map<String, String> params = c188727au.LIZ;
        o.LJIIIIZZ(params, "params");
        onEventV3.LIZIZ("share_video_response", params);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0378  */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v7, types: [X.8l2] */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.7au, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJFF(com.ss.android.ugc.aweme.sharer.model.SharePackage r15, java.lang.String r16, java.util.List r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 964
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57428MgK.LJFF(com.ss.android.ugc.aweme.sharer.model.SharePackage, java.lang.String, java.util.List, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:294:0x0915, code lost:
    
        if (r6 != null) goto L382;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x08fb, code lost:
    
        if (r6 != null) goto L375;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJI(com.ss.android.ugc.aweme.sharer.model.SharePackage r37, com.ss.android.ugc.aweme.im.service.model.IMContact r38, boolean r39, java.lang.String r40, long r41, X.C3V8 r43, int r44) {
        /*
            Method dump skipped, instructions count: 2393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57428MgK.LJI(com.ss.android.ugc.aweme.sharer.model.SharePackage, com.ss.android.ugc.aweme.im.service.model.IMContact, boolean, java.lang.String, long, X.3V8, int):void");
    }
}
