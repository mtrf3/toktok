package X;

import android.os.Bundle;
import com.bytedance.router.SmartRoute;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3uR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C98913uR {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZJ(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String LIZ2 = C93793mB.LIZ((C109544Rq) it.next());
            if (LIZ2 != null) {
                arrayList.add(LIZ2);
            }
        }
        if (ORZ.LJLJJL(arrayList).size() < arrayList.size()) {
            return true;
        }
        return false;
    }

    public static void LIZ(Bundle bundle, String str, C109544Rq c109544Rq, int i, boolean z, boolean z2, String str2) {
        String str3;
        if (z2) {
            str3 = "click";
        } else {
            str3 = "click_quoted_message";
        }
        boolean LJ = C93793mB.LJ(c109544Rq);
        bundle.putBoolean("key_from_chat_room_playing", true);
        bundle.putString("key_from_chat_room_real_aid", str);
        bundle.putInt("is_from_auto_message", LJ ? 1 : 0);
        bundle.putString("enter_method", str3);
        bundle.putString("conversation_id", c109544Rq.getConversationId());
        bundle.putInt("chat_type", i);
        bundle.putSerializable("message", c109544Rq);
        if (C3OT.LIZIZ) {
            bundle.putBoolean("im_support_duplicate", z);
        }
        if (!z2) {
            bundle.putLong("message_id", c109544Rq.getMsgId());
            bundle.putBoolean("key_from_quoted_video", true);
        }
        if (str2 == null || str2.length() == 0) {
            return;
        }
        bundle.putString("cid", str2);
        bundle.putString("enter_method", "click_shared_comment");
        bundle.putString("realItemId", str);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0157  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZLLL(android.view.View r17, java.util.List<? extends X.C109544Rq> r18, java.lang.String r19, X.C109544Rq r20, X.C99033ud r21, java.lang.String r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C98913uR.LIZLLL(android.view.View, java.util.List, java.lang.String, X.4Rq, X.3ud, java.lang.String, boolean):void");
    }

    public static void LIZIZ(SmartRoute smartRoute, String str, C109544Rq c109544Rq, int i, boolean z, boolean z2, String str2, String str3) {
        String str4;
        if (z2) {
            str4 = "click";
        } else {
            str4 = "click_quoted_message";
        }
        boolean LJ = C93793mB.LJ(c109544Rq);
        smartRoute.withParam("refer", str3);
        smartRoute.withParam("video_from", "from_chat");
        smartRoute.withParam("enter_method", str4);
        smartRoute.withParam("key_from_chat_room_playing", true);
        smartRoute.withParam("key_from_chat_room_real_aid", str);
        smartRoute.withParam("conversation_id", c109544Rq.getConversationId());
        smartRoute.withParam("message", c109544Rq);
        smartRoute.withParam("chat_type", String.valueOf(i));
        smartRoute.withParam("is_from_auto_message", LJ ? 1 : 0);
        if (!z2) {
            smartRoute.withParam("message_id", c109544Rq.getMsgId());
            smartRoute.withParam("key_from_quoted_video", true);
        }
        if (C3OT.LIZIZ) {
            smartRoute.withParam("im_support_duplicate", z);
        }
        if (str2 == null || str2.length() == 0) {
            return;
        }
        smartRoute.withParam("enter_method", "click_shared_comment");
        smartRoute.withParam("cid", str2);
    }
}
