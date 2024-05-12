package X;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.gift.model.WishListUpdateMessage;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.model.EnvelopePortalMessage;
import com.bytedance.android.livesdk.model.message.AssetMessage;
import com.bytedance.android.livesdk.model.message.CapsuleMessage;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdk.model.message.CommentsMessage;
import com.bytedance.android.livesdk.model.message.ControlMessage;
import com.bytedance.android.livesdk.model.message.DiggMessage;
import com.bytedance.android.livesdk.model.message.EmoteChatMessage;
import com.bytedance.android.livesdk.model.message.GiftCollectionUpdateMessage;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.model.message.GuideMessage;
import com.bytedance.android.livesdk.model.message.LikeMessage;
import com.bytedance.android.livesdk.model.message.LiveIntroMessage;
import com.bytedance.android.livesdk.model.message.MemberMessage;
import com.bytedance.android.livesdk.model.message.ModeratorSpeakerMessage;
import com.bytedance.android.livesdk.model.message.PortalMessage;
import com.bytedance.android.livesdk.model.message.RankTextMessage;
import com.bytedance.android.livesdk.model.message.RichChatMessage;
import com.bytedance.android.livesdk.model.message.RoomMessage;
import com.bytedance.android.livesdk.model.message.ScreenMessage;
import com.bytedance.android.livesdk.model.message.SocialMessage;
import com.bytedance.android.livesdk.model.message.SubNotifyMessage;
import com.bytedance.android.livesdk.model.message.UnauthorizedMemberMessage;
import com.bytedance.android.livesdk.model.message.UpgradeMessage;
import com.bytedance.android.livesdk.model.message.XGGoodsOrderMessage;
import com.bytedance.android.livesdk.model.message.redenvelope.RedEnvelopMessage;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import defpackage.a1;

/* loaded from: classes6.dex */
public final class CPR {
    public static int LIZ(int i) {
        return C15380j0.LIZLLL().getResources().getColor(i);
    }

    public static CQO<? extends CR6> LJ(CR6 cr6) {
        switch (C31294CPy.LIZ[cr6.getMessageType().ordinal()]) {
            case 1:
                ChatMessage chatMessage = (ChatMessage) cr6;
                if (CMU.LIZ.contains(Long.valueOf(chatMessage.chatId))) {
                    return new CQM(chatMessage);
                }
                if (cr6.isLocalInsertMsg) {
                    return new CPZ(chatMessage);
                }
                return new CQJ(chatMessage);
            case 2:
                return new CQN((EmoteChatMessage) cr6);
            case 3:
                return new C31290CPu((GiftMessage) cr6);
            case 4:
                return new CPS((DiggMessage) cr6);
            case 5:
                return new CQ6((LikeMessage) cr6);
            case 6:
                return new C31276CPg((MemberMessage) cr6);
            case 7:
                return new CPG((UnauthorizedMemberMessage) cr6);
            case 8:
                return new C29818Bn4((RoomMessage) cr6);
            case 9:
                SocialMessage socialMessage = (SocialMessage) cr6;
                if (socialMessage.shareDisplayStyle == 1) {
                    return new CPY(socialMessage);
                }
                return new CQ7(socialMessage);
            case 10:
                return new BWQ((ControlMessage) cr6);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return new CPT((ScreenMessage) cr6);
            case 12:
                return new CTE((RichChatMessage) cr6);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return new C29392BgC((CommentsMessage) cr6);
            case 14:
                return new CTP((XGGoodsOrderMessage) cr6);
            case 15:
                return new C29922Bok((AssetMessage) cr6);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return new C31388CTo((PortalMessage) cr6);
            case 17:
                return new C29416Bga((RedEnvelopMessage) cr6);
            case 18:
                return new C31273CPd((LiveIntroMessage) cr6);
            case 19:
                return new C30781C6f((SubNotifyMessage) cr6);
            case 20:
                return new CQ1((GiftCollectionUpdateMessage) cr6);
            case 21:
                return new C29610Bji((RankTextMessage) cr6);
            case 22:
                WishListUpdateMessage wishListUpdateMessage = (WishListUpdateMessage) cr6;
                if (wishListUpdateMessage.baseMessage == null) {
                    return null;
                }
                return new CPW(wishListUpdateMessage);
            case 23:
                GuideMessage guideMessage = (GuideMessage) cr6;
                if (guideMessage.guideType != 2 || guideMessage.displayStyle != 1) {
                    return null;
                }
                return new C29821Bn7(guideMessage);
            case 24:
                return new C29820Bn6((ModeratorSpeakerMessage) cr6);
            case 25:
                return new C29846BnW((CapsuleMessage) cr6, null, null);
            case 26:
                return new C29414BgY((EnvelopePortalMessage) cr6);
            case 27:
                return new C29817Bn3((UpgradeMessage) cr6);
            default:
                return null;
        }
    }

    public static CharSequence LIZIZ(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ForegroundColorSpan(LIZ(i)), 0, spannableString.length(), 18);
        return spannableString;
    }

    public static Spannable LIZJ(User user, String str, String str2, int i, int i2, CXK cxk) {
        if (user == null || TextUtils.isEmpty(C05170If.LIZ(user)) || TextUtils.isEmpty(C05170If.LIZ(user)) || TextUtils.isEmpty(str2)) {
            return CXJ.LIZ;
        }
        String LIZ = C05170If.LIZ(user);
        C30777C6b LJIILJJIL = cxk.LJIILJJIL(LIZ(i), user);
        C30778C6c LJJIJ = cxk.LJJIJ(LIZ(i2), user);
        SpannableString spannableString = new SpannableString(a1.LJ(LIZ, str, str2));
        spannableString.setSpan(LJIILJJIL, 0, LIZ.length() + 1, 33);
        spannableString.setSpan(LJJIJ, LIZ.length() + 1, spannableString.length(), 18);
        return spannableString;
    }

    public static Spannable LIZLLL(User user, String str, String str2, int i, int i2, CXK cxk) {
        if (user == null || TextUtils.isEmpty(C05170If.LIZ(user)) || TextUtils.isEmpty(C05170If.LIZ(user)) || TextUtils.isEmpty(str2)) {
            return CXJ.LIZ;
        }
        String LIZ = C05170If.LIZ(user);
        C30777C6b LJIILJJIL = cxk.LJIILJJIL(LIZ(i), user);
        C30778C6c LJJIJ = cxk.LJJIJ(LIZ(i2), user);
        SpannableString spannableString = new SpannableString(a1.LJ(LIZ, str, str2));
        spannableString.setSpan(LJIILJJIL, 0, LIZ.length(), 33);
        spannableString.setSpan(LJJIJ, LIZ.length(), spannableString.length(), 18);
        return spannableString;
    }
}
