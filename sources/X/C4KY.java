package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageEventParcel;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageTemplateTask;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4KY, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4KY {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(java.util.Map map, SharePackage sharePackage, List list) {
        Object obj;
        SendMessageEventParcel sendMessageEventParcel;
        String str;
        String str2;
        boolean z = sharePackage.extras.getBoolean("if_purchase", false);
        String str3 = "";
        String authorId = sharePackage.extras.getString("author_id", "");
        String followStatus = sharePackage.extras.getString("follow_status", "");
        String currentUserID = BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID();
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            IMContact iMContact = (IMContact) it.next();
            if (iMContact instanceof IMUser) {
                str2 = ((IMUser) iMContact).getUid();
                o.LJIIIIZZ(str2, "contact.uid");
            } else if (!(iMContact instanceof IMConversation)) {
                str2 = "";
            } else {
                str2 = "-1";
            }
            arrayList.add(str2);
        }
        SendMessageTemplateTask sendMessageTemplateTask = sharePackage.sendMessageTemplateTask;
        if (sendMessageTemplateTask != null && (sendMessageEventParcel = sendMessageTemplateTask.sendMessageEventParcel) != null && (str = sendMessageEventParcel.enterFrom) != null) {
            str3 = str;
        }
        map.put("enter_from", str3);
        map.put("collection_id", sharePackage.identifier);
        map.put("share_form", "collection");
        String str4 = "1";
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("if_purchase", obj);
        o.LJIIIIZZ(authorId, "authorId");
        map.put("collection_user_id", authorId);
        if (!arrayList.contains(currentUserID)) {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_self", str4);
        o.LJIIIIZZ(followStatus, "followStatus");
        map.put("follow_status", followStatus);
        map.put("enter_method", "icon");
    }
}
