package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.ImageCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.PictureCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.VideoCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.QueryDataComponent;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageEventParcel;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageTemplateTask;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.3j9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C91913j9 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.bytedance.ies.abmock.SettingsManager] */
    /* JADX WARN: Type inference failed for: r9v3, types: [X.3mF] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, X.3mF] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.util.LinkedHashMap, java.util.HashMap] */
    public static final void LIZ(C99033ud mSessionInfo, Context context, BaseContent baseContent, BaseTemplate baseTemplate, C109544Rq currentMsg) {
        String str;
        SharePackage generateSharePackage;
        boolean z;
        ?? r9;
        String str2;
        List<C117824jq> list;
        Integer num;
        BaseTemplate baseTemplate2 = baseTemplate;
        o.LJIIIZ(mSessionInfo, "mSessionInfo");
        o.LJIIIZ(currentMsg, "currentMsg");
        Activity LJIJJ = C45804HyK.LJIJJ(context);
        if (LJIJJ == null) {
            return;
        }
        String enterFromForMob = mSessionInfo.getEnterFromForMob();
        if (enterFromForMob.length() == 0) {
            enterFromForMob = "chat";
        }
        java.util.Map<String, String> map = null;
        if (mSessionInfo instanceof C98523to) {
            IMUser fromUser = ((C98523to) mSessionInfo).getFromUser();
            if (fromUser != null) {
                num = Integer.valueOf(fromUser.getFollowStatus());
            } else {
                num = null;
            }
            str = String.valueOf(num);
        } else {
            str = "";
        }
        if (baseTemplate2 != null) {
            String scene = currentMsg.getScene();
            if (scene == null) {
                C34B.LIZJ("ShareMessageHelper", "Unable to share message template because message scene is null");
                return;
            }
            long msgId = currentMsg.getMsgId();
            String prevConvId = mSessionInfo.getConversationId();
            o.LJIIIZ(prevConvId, "prevConvId");
            if (msgId > 0) {
                QueryDataComponent queryDataComponent = baseTemplate2.LLLL().queryData;
                java.util.Map LJJLIL = C113554cx.LJJLIL(queryDataComponent.extras);
                LJJLIL.put("prev_id", String.valueOf(msgId));
                LinkedHashMap linkedHashMap = (LinkedHashMap) LJJLIL;
                CharSequence charSequence = (CharSequence) linkedHashMap.get("root_id");
                if (charSequence == null || charSequence.length() == 0) {
                    LJJLIL.put("root_id", String.valueOf(msgId));
                }
                LJJLIL.put("prev_conv_id", prevConvId);
                CharSequence charSequence2 = (CharSequence) linkedHashMap.get("root_conv_id");
                if (charSequence2 == null || charSequence2.length() == 0) {
                    LJJLIL.put("root_conv_id", prevConvId);
                }
                CharSequence charSequence3 = (CharSequence) linkedHashMap.get("root_relation_tag");
                if (charSequence3 == null || charSequence3.length() == 0) {
                    LJJLIL.put("root_relation_tag", str);
                }
                String resourceID = queryDataComponent.resourceID;
                o.LJIIIZ(resourceID, "resourceID");
                QueryDataComponent queryDataComponent2 = new QueryDataComponent(resourceID, LJJLIL);
                baseTemplate2.LLLL().getClass();
                baseTemplate2 = baseTemplate2.LLLLZLLLI(baseTemplate2.LLZLL(), new BaseRequestComponent(queryDataComponent2), baseTemplate2.LLILLJJLI());
            }
            if (o.LJ(scene, "ai_avatar")) {
                str2 = "ai_avatar_share_panel";
            } else {
                str2 = null;
            }
            enterFromForMob = enterFromForMob;
            SendMessageEventParcel sendMessageEventParcel = new SendMessageEventParcel(enterFromForMob, (String) null, str2, (String) null, 24);
            if (C93793mB.LJI(currentMsg)) {
                list = currentMsg.getAttachments();
            } else {
                list = null;
            }
            SendMessageTemplateTask sendMessageTemplateTask = new SendMessageTemplateTask(scene, baseTemplate2, sendMessageEventParcel, list);
            generateSharePackage = C106684Gq.LIZ(sendMessageTemplateTask);
            BaseTemplate baseTemplate3 = sendMessageTemplateTask.template;
            if ((baseTemplate3 instanceof ImageCardTemplate) || (!(baseTemplate3 instanceof PictureCardTemplate) && !(baseTemplate3 instanceof VideoCardTemplate))) {
                z = true;
            } else {
                z = false;
            }
        } else {
            if (baseContent == null || (generateSharePackage = baseContent.generateSharePackage()) == null) {
                return;
            }
            baseContent.wrapForward(currentMsg.getMsgId(), mSessionInfo.getConversationId(), str);
            z = true;
        }
        Bundle bundle = generateSharePackage.extras;
        bundle.putString("enter_method", "forward");
        bundle.putString("enter_from", enterFromForMob);
        bundle.putString("platform", "chat_forward");
        try {
            ?? LIZLLL = SettingsManager.LIZLLL();
            r9 = C91923jA.LIZ;
            java.util.Map map2 = (java.util.Map) LIZLLL.LJIIIIZZ("dm_forward_limit_config", java.util.Map.class, r9);
            if (map2 != null) {
                r9 = new LinkedHashMap(C51029K0z.LJJIIZ(map2.size()));
                for (Object obj : map2.entrySet()) {
                    r9.put(((Map.Entry) obj).getKey(), Integer.valueOf(CastIntegerProtector.parseInt((String) ((Map.Entry) obj).getValue())));
                }
            }
        } catch (NumberFormatException unused) {
            r9 = C91923jA.LIZ;
        }
        Integer num2 = (Integer) r9.get(String.valueOf(currentMsg.getMsgType()));
        if (num2 != null) {
            bundle.putInt("forward_limit", num2.intValue());
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("share_package", generateSharePackage);
        bundle2.putSerializable("share_content", baseContent);
        bundle2.putString("share_ext_map", currentMsg.getExtStr());
        String str3 = generateSharePackage.itemType;
        if (o.LJ("aweme", str3) || o.LJ("aweme_photo", str3) || o.LJ("story_video", str3)) {
            String str4 = currentMsg.getLocalExt().get("feed_video_status_flag");
            if (str4 == null) {
                str4 = CardStruct.IStatusCode.DEFAULT;
            }
            if (!o.LJ(str4, CardStruct.IStatusCode.DEFAULT) || C84973Vd.LJFF(currentMsg)) {
                generateSharePackage.extras.remove("video_cover");
            }
        }
        currentMsg.addLocalExt("enter_method", "forward");
        XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C3OM(System.currentTimeMillis(), "forward", null), 3);
        EnumC110124Tw.Companion.getClass();
        BaseContent LIZJ = C110134Tx.LIZJ(currentMsg);
        if (LIZJ != null) {
            map = LIZJ.getExtForShare(currentMsg);
        }
        C16880lQ.LIZ(new C4NH(LJIJJ, OQY.INSTANCE, null, generateSharePackage, baseContent, map, currentMsg.getLocalExt(), z, false));
    }
}
