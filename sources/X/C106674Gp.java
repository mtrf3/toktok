package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.message.template.card.VideoCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.IconTypeComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VideoCardFallbackInfoComponent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareAwemeContent;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4Gp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C106674Gp {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZJ(C109544Rq msg) {
        C117824jq c117824jq;
        String localPath;
        o.LJIIIZ(msg, "msg");
        String LJIIJ = C78923UyF.LJIIJ(msg);
        String str = null;
        if (LJIIJ != null && LJIIJ.length() > 0) {
            return LJIIJ;
        }
        List<C117824jq> attachments = msg.getAttachments();
        if (attachments != null && (c117824jq = (C117824jq) ORZ.LJLLLLLL(0, attachments)) != null && (localPath = c117824jq.getLocalPath()) != null) {
            str = C78923UyF.LJIJI(localPath);
        }
        return str;
    }

    public static String LJ(C109544Rq message) {
        o.LJIIIZ(message, "message");
        String scene = message.getScene();
        if (C93793mB.LJIIJ(message)) {
            if (message.isSelf()) {
                return "share_story";
            }
            return "story_replied";
        }
        if (C93793mB.LJIILL(message) && scene != null && scene.length() != 0) {
            return scene;
        }
        int msgType = message.getMsgType();
        if (msgType != 8 && msgType != 11) {
            return LJFF(message, null);
        }
        ShareAwemeContent.Companion companion = ShareAwemeContent.Companion;
        if (companion.isVideoMention$im_base_release(message)) {
            return "mention_video";
        }
        if (companion.isVideoTag$im_base_release(message)) {
            return "tag_video";
        }
        if (companion.isVideoMentionAndTag$im_base_release(message)) {
            return "tag_mention_video";
        }
        return "share_video";
    }

    public static String LJII(C109544Rq msg) {
        int i;
        Integer LJJIL;
        o.LJIIIZ(msg, "msg");
        String str = msg.getLocalExt().get("s:inbox_page_category");
        if (str != null && (LJJIL = C38350F3i.LJJIL(str)) != null) {
            i = LJJIL.intValue();
        } else {
            i = 0;
        }
        C4YY fromValue = C4YY.fromValue(i);
        if (fromValue != null) {
            int i2 = C4YX.LIZ[fromValue.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        return "filtered_message";
                    }
                } else {
                    return "message_request";
                }
            } else {
                return "inbox";
            }
        }
        return "";
    }

    public static C109544Rq LJIIIIZZ(String msgId) {
        o.LJIIIZ(msgId, "msgId");
        C31F.LIZ.getClass();
        C31G.LIZ();
        return C63150OqQ.LJIILIIL(CastLongProtector.parseLong(msgId));
    }

    public static String LJIIIZ(String str) {
        if (TextUtils.equals(str, "aweme")) {
            return "video";
        }
        if (TextUtils.equals(str, "aweme_photo")) {
            return "photo_mode";
        }
        if (TextUtils.equals(str, "pic")) {
            return "pic";
        }
        if (TextUtils.equals(str, "gif")) {
            return "gif";
        }
        if (TextUtils.equals(str, "text")) {
            return "text";
        }
        if (TextUtils.equals(str, "music")) {
            return "music_card";
        }
        if (TextUtils.equals(str, "challenge")) {
            return "tag_card";
        }
        if (TextUtils.equals(str, "ranking")) {
            return "hot_search_card";
        }
        if (TextUtils.equals(str, "game")) {
            return "game";
        }
        if (TextUtils.equals(str, "user")) {
            return "profile";
        }
        if (TextUtils.equals(str, "live")) {
            return "live";
        }
        if (TextUtils.equals(str, "web")) {
            return "webview";
        }
        if (TextUtils.equals(str, "qna")) {
            return "question_detail";
        }
        if (TextUtils.equals(str, "product")) {
            return "product";
        }
        if (TextUtils.equals(str, "aigc_avatar")) {
            return "ai_avatar";
        }
        return "";
    }

    public static boolean LJIIJ(C109544Rq c109544Rq) {
        if (c109544Rq == null || c109544Rq.getMsgStatus() == 3) {
            return false;
        }
        java.util.Map<String, String> localExt = c109544Rq.getLocalExt();
        if (localExt != null && localExt.containsKey("s:send_response_check_code")) {
            return TextUtils.equals(CardStruct.IStatusCode.DEFAULT, localExt.get("s:send_response_check_code"));
        }
        return true;
    }

    public static final void LJIILIIL(C109544Rq c109544Rq) {
        if (c109544Rq != null) {
            C31F.LIZ.getClass();
            C31G.LIZ();
            C63164Oqe.LIZIZ.LJIJJ(null, c109544Rq);
        }
    }

    public static final void LJIILJJIL(C109544Rq c109544Rq) {
        if (c109544Rq != null) {
            C31F.LIZ.getClass();
            C31G.LIZ();
            C63164Oqe.LIZIZ.LJIIZILJ(null, c109544Rq);
        }
    }

    public static VideoCardFallbackInfoComponent LIZIZ(C109544Rq msg, VideoCardTemplate videoCardTemplate) {
        o.LJIIIZ(msg, "msg");
        VideoCardFallbackInfoComponent videoCardFallbackInfoComponent = videoCardTemplate.fallbackInfo;
        VideoCardFallbackInfoComponent.Companion.getClass();
        VideoCardFallbackInfoComponent videoCardFallbackInfoComponent2 = VideoCardFallbackInfoComponent.EMPTY_FALLBACK;
        if (!o.LJ(videoCardFallbackInfoComponent, videoCardFallbackInfoComponent2)) {
            if (videoCardTemplate.fallbackInfo.image.iconType == IconTypeComponent.LOADING && C78685UuP.LJJJZ(LIZJ(msg))) {
                return videoCardFallbackInfoComponent2;
            }
            return videoCardTemplate.fallbackInfo;
        }
        return videoCardFallbackInfoComponent2;
    }

    public static final String LIZLLL(C109544Rq message, BaseContent baseContent) {
        o.LJIIIZ(message, "message");
        return LJFF(message, baseContent);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008e, code lost:
    
        if (r5 != null) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001a A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJFF(X.C109544Rq r4, com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent r5) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C106674Gp.LJFF(X.4Rq, com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x01c4, code lost:
    
        if (r5 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x01d0, code lost:
    
        if (r5 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x01de, code lost:
    
        if (r5 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x01ec, code lost:
    
        if (r5 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x01fa, code lost:
    
        if (r5 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0208, code lost:
    
        if (r5 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0089, code lost:
    
        if (r5 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        if (r10 != null) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x012f, code lost:
    
        if (r3.equals("share_video_photo") != false) goto L92;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C3V3 LJI(X.C109544Rq r9, com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent r10) {
        /*
            Method dump skipped, instructions count: 553
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C106674Gp.LJI(X.4Rq, com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent):X.3V3");
    }

    public static void LJIIJJI(String str, boolean z) {
        C96423qQ.LIZ();
        C4Z2.LJIJ(E2C.LIZJ("trigger_reason", str), z);
    }

    public static final void LJIIL(InterfaceC86963bA interfaceC86963bA, C109544Rq msg) {
        o.LJIIIZ(msg, "msg");
        C31F.LIZ.getClass();
        C31G.LIZ();
        C63164Oqe.LIZIZ.LJIJI(interfaceC86963bA, msg);
    }

    public static final void LIZ(C109544Rq c109544Rq, String uid, C63120Opw c63120Opw, String emoji, C80363Dk c80363Dk) {
        o.LJIIIZ(uid, "uid");
        o.LJIIIZ(emoji, "emoji");
        C106694Gr c106694Gr = new C106694Gr();
        c106694Gr.LIZIZ(c63120Opw);
        c106694Gr.LIZ.serverMessageId = c109544Rq.getMsgId();
        c106694Gr.LIZ.clientMessageId = c109544Rq.getUuid();
        if (!o.LJ(emoji, "love")) {
            EnumC63258OsA enumC63258OsA = EnumC63258OsA.REMOVE_PROPERTY_ITEM;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("e:");
            LIZ2.append(emoji);
            c106694Gr.LIZ(enumC63258OsA, X1D.LIZIZ(LIZ2), uid);
        }
        c106694Gr.LIZ(EnumC63258OsA.REMOVE_PROPERTY_ITEM, "e:love", uid);
        C31F.LIZ.getClass();
        C31G.LIZ();
        C63164Oqe c63164Oqe = C63164Oqe.LIZIZ;
        C63219OrX c63219OrX = c106694Gr.LIZ;
        o.LJIIIIZZ(c63219OrX, "modifyRequestBuilder.build()");
        c63164Oqe.LJIILIIL(c63219OrX, c80363Dk);
        C100483wy.LJFF("like_message_local_label", "1");
        C100483wy.LJFF("like_message_local_time_stamp", String.valueOf(NetworkUtils.getServerTimeMills()));
    }

    public static final void LJIILL(C109544Rq c109544Rq, String uid, C63120Opw c63120Opw, String str, String str2) {
        o.LJIIIZ(uid, "uid");
        C106694Gr c106694Gr = new C106694Gr();
        c106694Gr.LIZIZ(c63120Opw);
        c106694Gr.LIZ.serverMessageId = c109544Rq.getMsgId();
        c106694Gr.LIZ.clientMessageId = c109544Rq.getUuid();
        if (str != null) {
            EnumC63258OsA enumC63258OsA = EnumC63258OsA.REMOVE_PROPERTY_ITEM;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("e:");
            LIZ2.append(str);
            c106694Gr.LIZ(enumC63258OsA, X1D.LIZIZ(LIZ2), uid);
            c106694Gr.LIZ(enumC63258OsA, "e:love", uid);
        }
        EnumC63258OsA enumC63258OsA2 = EnumC63258OsA.ADD_PROPERTY_ITEM;
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("e:");
        LIZ3.append(str2);
        c106694Gr.LIZ(enumC63258OsA2, X1D.LIZIZ(LIZ3), uid);
        c106694Gr.LIZ(enumC63258OsA2, "e:love", uid);
        C31F.LIZ.getClass();
        C31G.LIZ();
        C63164Oqe c63164Oqe = C63164Oqe.LIZIZ;
        C63219OrX c63219OrX = c106694Gr.LIZ;
        o.LJIIIIZZ(c63219OrX, "modifyRequestBuilder.build()");
        c63164Oqe.LJIILIIL(c63219OrX, null);
        C100483wy.LJFF("like_message_local_label", "1");
        C100483wy.LJFF("like_message_local_time_stamp", String.valueOf(NetworkUtils.getServerTimeMills()));
        java.util.Map<String, String> localExt = c109544Rq.getLocalExt();
        o.LJIIIIZZ(localExt, "localExt");
        localExt.put("IS_REPLIED_OR_REACTED", "react");
        c109544Rq.getLocalExt().remove("SUGGESTED_REPLIES");
        LJIILJJIL(c109544Rq);
    }
}
