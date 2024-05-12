package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.CommentContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.GroupInviteCardContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareAwemeContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareChallengeContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareCompilationContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareEffectContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareLiveContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareLiveEventContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareMusicContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareProductContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareQnAContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareSearchContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareStoryContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareSubOnlyVideoContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareSubscribeInviteContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareUserContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareWebContent;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.o;

/* renamed from: X.4Ix, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C107274Ix {
    public static C107284Iy LIZ;
    public static final Handler LIZIZ = new Handler(C16880lQ.LLJJJJ(), new Handler.Callback() { // from class: X.4J1
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message == null || message.what != 100) {
                return false;
            }
            Object obj = message.obj;
            if (!(obj instanceof C107284Iy)) {
                return false;
            }
            C107284Iy c107284Iy = (C107284Iy) obj;
            if (c107284Iy.LIZ != C4J0.SENDING) {
                return false;
            }
            C34B.LIZIZ("ShareHelper", "realSendShareMsg because reach to time");
            C107274Ix.LIZLLL(c107284Iy);
            return false;
        }
    });

    public static BaseContent LIZ(SharePackage sharePackage) {
        String str = sharePackage.itemType;
        if (TextUtils.equals("web", str)) {
            return ShareWebContent.fromSharePackage(sharePackage);
        }
        boolean z = false;
        if (TextUtils.equals("aweme", str) || TextUtils.equals("aweme_photo", str)) {
            if (sharePackage.extras.getBoolean("is_sub_only_video", false)) {
                return ShareSubOnlyVideoContent.fromSharePackage(sharePackage);
            }
            if (sharePackage.extras.getBoolean("is_story")) {
                return ShareStoryContent.fromSharePackage(sharePackage);
            }
            return ShareAwemeContent.fromSharePackage(sharePackage);
        }
        if (TextUtils.equals("music", str)) {
            return ShareMusicContent.fromSharePackage(sharePackage);
        }
        if (TextUtils.equals("challenge", str)) {
            return ShareChallengeContent.fromSharePackage(sharePackage);
        }
        if (TextUtils.equals("qna", str)) {
            try {
                FFL.LJIIIZ().getClass();
                z = FFL.LJ(31744, "share_qna_enable_message", true, false);
            } catch (Throwable unused) {
            }
            if (z) {
                return ShareQnAContent.Companion.fromSharePackage(sharePackage);
            }
        }
        if (TextUtils.equals("live_event", str)) {
            return ShareLiveEventContent.fromSharePackage(sharePackage);
        }
        if (TextUtils.equals("search", str)) {
            return ShareSearchContent.Companion.fromSharePackage(sharePackage);
        }
        if (TextUtils.equals("user", str)) {
            return ShareUserContent.fromSharePackage(sharePackage);
        }
        if (TextUtils.equals("live", str) || TextUtils.equals("multi_live", str)) {
            return ShareLiveContent.fromSharePackage(sharePackage);
        }
        if (TextUtils.equals("mix_videos", str)) {
            return ShareCompilationContent.fromSharePackage(sharePackage);
        }
        if (TextUtils.equals("sticker", str)) {
            return ShareEffectContent.fromSharePackage(sharePackage);
        }
        if (TextUtils.equals("group", str)) {
            return GroupInviteCardContent.fromSharePackage(sharePackage);
        }
        if (TextUtils.equals("comment", str)) {
            return CommentContent.fromSharePackage(sharePackage);
        }
        if (TextUtils.equals("product", str)) {
            return ShareProductContent.fromPackage(sharePackage);
        }
        if (TextUtils.equals("subscribe_invite", str)) {
            return ShareSubscribeInviteContent.fromSharePackage(sharePackage);
        }
        return null;
    }

    public static boolean LIZIZ(SharePackage sharePackage) {
        if (TextUtils.equals("aweme", sharePackage.itemType) || TextUtils.equals("aweme_photo", sharePackage.itemType) || TextUtils.equals("now_invite", sharePackage.itemType) || TextUtils.equals("now_video", sharePackage.itemType) || TextUtils.equals("now_post", sharePackage.itemType) || TextUtils.equals("now_others_post", sharePackage.itemType) || TextUtils.equals("now_others_video_post", sharePackage.itemType) || TextUtils.equals("now_bonus_invite", sharePackage.itemType)) {
            return true;
        }
        return false;
    }

    public static void LIZLLL(C107284Iy c107284Iy) {
        C4J0 c4j0 = c107284Iy.LIZ;
        C4J0 c4j02 = C4J0.SENT;
        if (c4j0 != c4j02 && c4j0 != C4J0.UNDO) {
            o.LJIIIZ(c4j02, "<set-?>");
            c107284Iy.LIZ = c4j02;
            LIZIZ.removeMessages(100);
            LJ(c107284Iy.LIZLLL, c107284Iy.LJ, c107284Iy.LJFF, c107284Iy.LJI, c107284Iy.LJII, c107284Iy.LJIIIIZZ, c107284Iy.LJIIIZ, c107284Iy.LIZIZ, c107284Iy.LJIIJ);
        }
    }

    public static void LJFF(C107284Iy c107284Iy) {
        IMContact iMContact;
        boolean z;
        String str;
        String str2;
        String str3;
        boolean z2;
        if (c107284Iy.LIZ == C4J0.DEFAULT) {
            C107284Iy c107284Iy2 = LIZ;
            if (c107284Iy2 != null && !c107284Iy2.LIZIZ.equals(c107284Iy.LIZIZ) && (LIZ.LIZ != C4J0.SENT || LIZ.LIZ != C4J0.UNDO)) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("realSendShareMsg because shareId not same");
                LIZ2.append(c107284Iy.LIZIZ);
                C34B.LIZIZ("ShareHelper", X1D.LIZIZ(LIZ2));
                LIZLLL(LIZ);
            }
            LIZ = c107284Iy;
            Bundle bundle = c107284Iy.LJFF.extras;
            boolean z3 = bundle.getBoolean("is_ad");
            boolean equals = "true".equals(bundle.getString("cancel_undo_when_send_message"));
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("showShareSendingTips is direct");
            LIZ3.append(z3);
            C34B.LIZIZ("ShareHelper", X1D.LIZIZ(LIZ3));
            if (z3 || equals) {
                LIZLLL(c107284Iy);
                return;
            }
            C4J0 c4j0 = C4J0.SENDING;
            o.LJIIIZ(c4j0, "<set-?>");
            c107284Iy.LIZ = c4j0;
            Handler handler = LIZIZ;
            Message obtainMessage = handler.obtainMessage(100);
            obtainMessage.obj = c107284Iy;
            handler.sendMessageDelayed(obtainMessage, 3000L);
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("showShareSendingTips");
            LIZ4.append(c107284Iy.LIZIZ);
            C34B.LIZIZ("ShareHelper", X1D.LIZIZ(LIZ4));
            String str4 = null;
            if (C38891fp.LJJI(c107284Iy.LIZLLL)) {
                iMContact = null;
            } else {
                iMContact = (IMContact) ListProtector.get(c107284Iy.LIZLLL, 0);
            }
            List<IMContact> list = c107284Iy.LIZLLL;
            boolean z4 = true;
            if (list != null && list.size() > 0) {
                if (((ArrayList) C3K0.LIZLLL((IMContact[]) c107284Iy.LIZLLL.toArray(new IMContact[0]))).size() > 1) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            SharePackage sharePackage = c107284Iy.LJFF;
            if (sharePackage != null) {
                str4 = sharePackage.extras.getString("enter_from");
                str = sharePackage.extras.getString("enter_method");
                str2 = sharePackage.extras.getString("enter_position");
                str3 = sharePackage.extras.getString("follow_status");
                if (sharePackage.extras.containsKey("sending_message_has_animation")) {
                    z4 = sharePackage.extras.getBoolean("sending_message_has_animation");
                }
                z2 = sharePackage.extras.getBoolean("is_new_group", false);
            } else {
                str = null;
                str2 = null;
                str3 = null;
                z4 = true;
                z2 = false;
            }
            C2U8.LIZ(new C9BZ(c107284Iy.LIZJ, c107284Iy.LIZIZ, iMContact, z, new C107294Iz(c107284Iy, z4, z4, str, sharePackage, iMContact), str4, str, z4, z4, z2, str2, str3));
        }
    }

    public static void LIZJ(SharePackage sharePackage, IMContact iMContact, String str) {
        HashMap hashMap = new HashMap();
        if (sharePackage != null) {
            Bundle bundle = sharePackage.extras;
            hashMap.put("enter_method", bundle.getString("enter_method"));
            hashMap.put("panel_source", bundle.getString("enter_method"));
            hashMap.put("enter_from", bundle.getString("enter_from"));
        }
        hashMap.put("chat_type", "private");
        if (iMContact != null && (iMContact instanceof IMUser)) {
            IMUser iMUser = (IMUser) iMContact;
            hashMap.put("conversation_id", C81273Gx.LIZIZ(Long.valueOf(CastLongProtector.parseLong(iMUser.getUid())).longValue()));
            hashMap.put("to_user_id", iMUser.getUid());
        }
        hashMap.put("process_id", str);
        hashMap.put("message_type", "share_video");
        FMX.LJIIL("send_message_undo", hashMap);
    }

    public static void LJIIIZ(SharePackage sharePackage, List<IMContact> list, boolean z, String str) {
        IMContact iMContact;
        if (TextUtils.equals(sharePackage.extras.getString("enter_method"), "publish_share")) {
            return;
        }
        String string = sharePackage.extras.getString("aid");
        List<IMContact> list2 = null;
        if (C38891fp.LJJI(list)) {
            iMContact = null;
        } else {
            iMContact = (IMContact) ListProtector.get(list, 0);
        }
        if (!C38891fp.LJJI(list)) {
            if (list.size() == 1) {
                list2 = list.subList(0, 1);
            } else {
                Iterator<IMContact> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        IMContact next = it.next();
                        if (next instanceof IMConversation) {
                            list2 = Collections.singletonList(next);
                            break;
                        }
                    } else {
                        list2 = list.subList(0, 2);
                        break;
                    }
                }
            }
        }
        C107794Kx c107794Kx = new C107794Kx(list2, iMContact, list.size(), z, sharePackage.itemType, sharePackage.extras.getString("enter_from"), sharePackage.extras.getString("enter_method"), string, str, sharePackage.extras.getBoolean("is_new_group", false));
        c107794Kx.LJLLILLLL = sharePackage.extras.getBoolean("show_tips_until_cancel", false);
        c107794Kx.LJLLI = sharePackage.extras.getInt("context_id", 0);
        C2U8.LIZ(c107794Kx);
    }

    public static void LJIIIIZZ(Context context, SharePackage sharePackage, IMContact[] iMContactArr, String str, C4JZ c4jz, C4JZ c4jz2) {
        C4J2 c4j2 = new C4J2(context);
        c4j2.LIZIZ = iMContactArr;
        c4j2.LIZJ = sharePackage;
        c4j2.LIZLLL = c4jz2;
        c4j2.LJ = c4jz;
        C63081OpJ.LJIJJLI(context, 416);
        C63081OpJ.LJIJJLI(context, 335);
        if (str == null) {
            str = "";
        }
        c4j2.LJFF = str;
        C4JW c4jw = new C4JW(c4j2);
        if (new C03880Dg(2).LIZJ(300000, "com/ss/android/ugc/aweme/im/sdk/common/ui/widget/ImShareDialog", "show", c4jw, new Object[0], "void", new C65300Pk0(false, "()V", "-5831069839525098954")).LIZ) {
            return;
        }
        c4jw.show();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0071, code lost:
    
        if (r1 != null) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJII(java.lang.String r16, com.ss.android.ugc.aweme.profile.model.User r17, com.ss.android.ugc.aweme.feed.model.Aweme r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.Boolean r22, X.C4J3 r23) {
        /*
            java.lang.String r15 = X.C3Y4.LIZ()
            r3 = r18
            if (r3 != 0) goto L9
            return
        L9:
            java.lang.String r0 = "enter_position"
            r1 = r21
            java.util.HashMap r14 = X.C03660Ck.LIZJ(r0, r1)
            com.ss.android.ugc.aweme.profile.model.User r0 = r3.getAuthor()
            int r0 = r0.getFollowStatus()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "follow_status"
            r14.put(r0, r1)
            com.ss.android.ugc.aweme.profile.model.User r0 = r3.getAuthor()
            int r0 = r0.getFollowStatusRelation()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "follow_status_relation"
            r14.put(r0, r1)
            com.ss.android.ugc.aweme.profile.model.User r1 = r3.getAuthor()
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            java.lang.String r0 = r1.getSocialInfo()
            if (r0 == 0) goto L48
            int r0 = r0.length()
            if (r0 != 0) goto Lfb
        L48:
            r0 = 1
        L49:
            if (r0 == 0) goto Lf5
            com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct r0 = r1.getMatchedFriendStruct()
            if (r0 == 0) goto L73
            java.lang.String r2 = r0.getSocialInfo()
        L55:
            if (r2 == 0) goto L73
            com.google.gson.Gson r1 = X.C69432nz.LIZ()
            java.lang.Class<com.google.gson.m> r0 = com.google.gson.m.class
            java.lang.Object r1 = com.bytedance.mt.protector.impl.GsonProtectorUtils.fromJson(r1, r2, r0)
            com.google.gson.m r1 = (com.google.gson.m) r1
            if (r1 == 0) goto L73
            java.lang.String r0 = "friend_type_str"
            com.google.gson.j r0 = r1.LJJIJ(r0)
            if (r0 == 0) goto L73
            java.lang.String r1 = r0.LJJIFFI()
            if (r1 != 0) goto L75
        L73:
            java.lang.String r1 = ""
        L75:
            java.lang.String r0 = "social_info_friends_type_str"
            r14.put(r0, r1)
            java.lang.String r1 = "from_group_id"
            java.lang.String r0 = r3.getAid()
            r14.put(r1, r0)
            java.lang.String r1 = "author_id"
            java.lang.String r0 = r3.getAuthorUid()
            r14.put(r1, r0)
            boolean r0 = X.C54838Lfe.LJJI(r3)
            if (r0 == 0) goto L9b
            java.lang.String r1 = X.C78596Usy.LJJJLL(r3)
            java.lang.String r0 = "story_music_with_mute"
            r14.put(r0, r1)
        L9b:
            X.4Iy r5 = new X.4Iy
            X.4J0 r6 = X.C4J0.DEFAULT
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r7 = r0.toString()
            java.lang.String r8 = r3.getAid()
            r4 = r17
            com.ss.android.ugc.aweme.im.service.model.IMUser r0 = X.C78966Uyw.LJIIZILJ(r4)
            java.util.List r9 = java.util.Collections.singletonList(r0)
            java.lang.String r10 = ""
            com.ss.android.ugc.aweme.sharer.model.SharePackage r11 = new com.ss.android.ugc.aweme.sharer.model.SharePackage
            X.Odu r2 = new X.Odu
            r2.<init>()
            java.lang.String r0 = "text"
            r2.LIZ = r0
            java.lang.String r0 = "enter_from"
            r1 = r19
            r2.LIZIZ(r0, r1)
            java.lang.String r0 = "enter_method"
            r1 = r20
            r2.LIZIZ(r0, r1)
            java.lang.String r1 = "aid"
            java.lang.String r0 = r3.getAid()
            r2.LIZIZ(r1, r0)
            java.lang.String r1 = "cancel_undo_when_send_message"
            java.lang.String r0 = r22.toString()
            r2.LIZIZ(r1, r0)
            r11.<init>(r2)
            r0 = r16
            com.ss.android.ugc.aweme.im.sdk.chat.data.model.TextContent r12 = com.ss.android.ugc.aweme.im.sdk.chat.data.model.TextContent.obtainShareReplyContent(r0, r4, r3)
            r13 = 0
            r16 = r23
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            LJFF(r5)
            return
        Lf5:
            java.lang.String r2 = r1.getSocialInfo()
            goto L55
        Lfb:
            r0 = 0
            goto L49
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107274Ix.LJII(java.lang.String, com.ss.android.ugc.aweme.profile.model.User, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, X.4J3):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0286, code lost:
    
        if (r11.equals("story_float_emoji") == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0294, code lost:
    
        r10 = "story_reaction";
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0290, code lost:
    
        if (r11.equals("story_exposed_emoji") == false) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJ(java.util.List<com.ss.android.ugc.aweme.im.service.model.IMContact> r15, java.lang.String r16, com.ss.android.ugc.aweme.sharer.model.SharePackage r17, com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent r18, java.util.Map<java.lang.String, java.lang.String> r19, java.util.Map<java.lang.String, java.lang.String> r20, java.lang.String r21, java.lang.String r22, X.C4J3 r23) {
        /*
            Method dump skipped, instructions count: 900
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107274Ix.LJ(java.util.List, java.lang.String, com.ss.android.ugc.aweme.sharer.model.SharePackage, com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent, java.util.Map, java.util.Map, java.lang.String, java.lang.String, X.4J3):void");
    }

    public static void LJI(List<IMContact> list, String str, SharePackage sharePackage, BaseContent baseContent, java.util.Map<String, String> map, java.util.Map<String, String> map2, String str2, boolean z, C4J3 c4j3) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("sendShareMsgCanUndo");
        LIZ2.append(str2);
        C34B.LIZIZ("ShareHelper", X1D.LIZIZ(LIZ2));
        if (sharePackage == null || TextUtils.equals(sharePackage.extras.getString("enter_method"), "publish_share") || !TextUtils.equals(sharePackage.itemType, "aweme") || z) {
            C34B.LIZIZ("ShareHelper", "sendShareMsgCanUndo go direct send");
            LJ(list, str, sharePackage, baseContent, map, map2, str2, null, c4j3);
        } else {
            LJFF(new C107284Iy(C4J0.DEFAULT, UUID.randomUUID().toString(), sharePackage.extras.getString("aid"), list, str, sharePackage, baseContent, map, map2, str2, c4j3));
        }
    }
}
