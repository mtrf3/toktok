package X;

import android.content.res.Resources;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.model.GiftResultData;
import com.bytedance.android.livesdk.gift.model.SendGiftResult;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.model.message.GiftMonitorInfo;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common.TextPiece;
import com.bytedance.android.livesdk.model.message.common.TextPieceUser;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.CoZ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32459CoZ {
    public static final /* synthetic */ int LIZ = 0;

    public static final C31996Ch6 LIZ(GiftMessage giftMessage, User user) {
        long j;
        long LIZ2;
        boolean z;
        String LIZ3;
        if (!giftMessage.LJLIL && (giftMessage.getMessageId() == 0 || giftMessage.fromUser == null)) {
            return null;
        }
        Gift gift = giftMessage.mGift;
        if (!giftMessage.LJLIL) {
            if (gift == null) {
                return null;
            }
            j = C32394CnW.LIZ(gift, giftMessage.colorId);
        } else {
            j = giftMessage.giftId;
        }
        String LIZJ = C32341Cmf.LIZJ(j, false);
        if (giftMessage.LJLIL) {
            LIZ2 = giftMessage.giftId;
        } else {
            LIZ2 = C32394CnW.LIZ(gift, giftMessage.colorId);
        }
        C32221Ckj.LIZIZ();
        C32405Cnh.LIZ(LIZ2);
        String str = "";
        if (!giftMessage.LJLIL) {
            User user2 = giftMessage.toUser;
            if (user2 != null && user2.getId() > 0 && (user == null || giftMessage.toUser.getId() != user.getId())) {
                Resources LJIIJ = C15380j0.LJIIJ();
                Object[] objArr = new Object[1];
                if (C05170If.LIZ(giftMessage.toUser) == null) {
                    LIZ3 = "";
                } else {
                    LIZ3 = C05170If.LIZ(giftMessage.toUser);
                }
                objArr[0] = LIZ3;
                o.LJIIIIZZ(LJIIJ.getString(R.string.sr7, objArr), "{\n                    Re…      )\n                }");
            }
        } else {
            gift = new Gift();
            gift.primaryEffectId = giftMessage.giftId;
        }
        User user3 = giftMessage.toUser;
        if (user3 != null) {
            user = user3;
        }
        C31996Ch6 c31996Ch6 = new C31996Ch6();
        if (gift != null) {
            z = gift.isRandomGift;
        } else {
            z = false;
        }
        c31996Ch6.LIZIZ = z;
        c31996Ch6.LIZJ = giftMessage.getMessageId();
        c31996Ch6.LIZLLL = C32394CnW.LIZ(gift, giftMessage.colorId);
        c31996Ch6.LJ = LIZJ;
        c31996Ch6.LJFF = false;
        c31996Ch6.LJI = user;
        c31996Ch6.LJII = giftMessage.fromUser;
        c31996Ch6.LJIIIIZZ = gift.id;
        c31996Ch6.LJIIIZ = giftMessage.LJLILLLLZI;
        c31996Ch6.LJIIJ = giftMessage.mLogId;
        String str2 = gift.name;
        if (str2 != null) {
            str = str2;
        }
        c31996Ch6.LIZ = str;
        return c31996Ch6;
    }

    public static final GiftMessage LIZIZ(long j, SendGiftResult sendGiftResult, User user, User user2) {
        Text text;
        User user3;
        if (sendGiftResult == null) {
            C78983UzD.LJIILL("SendGiftResult cannot be null");
            return new GiftMessage();
        }
        GiftMessage giftMessage = new GiftMessage();
        CommonMessageData commonMessageData = new CommonMessageData();
        commonMessageData.roomId = j;
        commonMessageData.messageId = sendGiftResult.msgId;
        commonMessageData.createTime = System.currentTimeMillis();
        commonMessageData.showMsg = true;
        commonMessageData.describe = sendGiftResult.describe;
        commonMessageData.displayText = sendGiftResult.displayText;
        giftMessage.baseMessage = commonMessageData;
        giftMessage.mLogId = C32465Cof.LIZIZ(sendGiftResult.monitorExtra);
        Text text2 = sendGiftResult.displayText;
        Text text3 = null;
        if (text2 != null && !C79004UzY.LJJIFFI(text2.pieces)) {
            Iterator<TextPiece> it = text2.pieces.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                TextPiece next = it.next();
                TextPieceUser textPieceUser = next.userValue;
                if (textPieceUser != null && (user3 = textPieceUser.user) != null) {
                    if (user3.getId() == ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) {
                        User user4 = next.userValue.user;
                        if (user4 != null) {
                            giftMessage.fromUser = user4;
                        }
                    }
                }
            }
        }
        if (user2 != null) {
            giftMessage.fromUser = user2;
        } else {
            giftMessage.fromUser = C05200Ii.LIZIZ();
        }
        giftMessage.colorId = Long.valueOf(sendGiftResult.LIZ);
        giftMessage.repeatCount = sendGiftResult.repeatCount;
        giftMessage.fanTicketCount = sendGiftResult.fanTicketCount;
        giftMessage.giftId = sendGiftResult.mGiftId;
        giftMessage.toUser = user;
        giftMessage.comboCount = sendGiftResult.comboCount;
        giftMessage.groupCount = sendGiftResult.groupCount;
        giftMessage.groupId = sendGiftResult.groupId;
        giftMessage.isFirstSendGift = sendGiftResult.isFirstSend;
        giftMessage.matchInfo = sendGiftResult.matchInfo;
        List<GiftResultData> list = sendGiftResult.gifts;
        if (list != null && list.size() >= 1) {
            GiftResultData giftResultData = (GiftResultData) ListProtector.get(list, 0);
            if (giftResultData != null) {
                text = giftResultData.displayTextForAnchor;
            } else {
                text = null;
            }
            giftMessage.displayTextForAnchor = text;
            GiftResultData giftResultData2 = (GiftResultData) ListProtector.get(list, 0);
            if (giftResultData2 != null) {
                text3 = giftResultData2.displayTextForAudience;
            }
            giftMessage.displayTextForAudience = text3;
        }
        giftMessage.isLocalInsertMsg = true;
        giftMessage.mGift = GiftManager.inst().findGiftById(sendGiftResult.mGiftId);
        giftMessage.LJLJI = sendGiftResult.monitorExtra;
        return giftMessage;
    }

    public static final List<GiftMessage> LIZJ(long j, SendGiftResult sendGiftResult, User user, User user2) {
        User user3;
        ArrayList arrayList = new ArrayList();
        if (sendGiftResult == null) {
            return arrayList;
        }
        List<GiftResultData> list = sendGiftResult.gifts;
        if (list == null) {
            return arrayList;
        }
        for (GiftResultData giftResultData : list) {
            GiftMessage giftMessage = new GiftMessage();
            giftMessage.mLogId = C32465Cof.LIZIZ(sendGiftResult.monitorExtra);
            CommonMessageData commonMessageData = new CommonMessageData();
            commonMessageData.roomId = j;
            commonMessageData.messageId = giftResultData.msgId;
            commonMessageData.createTime = System.currentTimeMillis();
            commonMessageData.showMsg = true;
            commonMessageData.describe = giftResultData.describe;
            Text text = giftResultData.displayText;
            commonMessageData.displayText = text;
            giftMessage.baseMessage = commonMessageData;
            if (text != null && !C79004UzY.LJJIFFI(text.pieces)) {
                Iterator<TextPiece> it = text.pieces.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    TextPiece next = it.next();
                    TextPieceUser textPieceUser = next.userValue;
                    if (textPieceUser != null && (user3 = textPieceUser.user) != null) {
                        if (user3.getId() == ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) {
                            User user4 = next.userValue.user;
                            if (user4 != null) {
                                giftMessage.fromUser = user4;
                            }
                        }
                    }
                }
            }
            giftMessage.fromUser = user2;
            giftMessage.colorId = Long.valueOf(sendGiftResult.LIZ);
            giftMessage.repeatCount = giftResultData.repeatCount;
            giftMessage.fanTicketCount = sendGiftResult.fanTicketCount;
            giftMessage.giftId = giftResultData.giftId;
            giftMessage.toUser = user;
            giftMessage.comboCount = giftResultData.comboCount;
            giftMessage.groupCount = giftResultData.groupCount;
            giftMessage.groupId = sendGiftResult.groupId;
            giftMessage.LJLILLLLZI = true;
            giftMessage.isLocalInsertMsg = true;
            giftMessage.giftsInBox = giftResultData.giftsInBox;
            giftMessage.mTrayInfo = giftResultData.mTrayInfo;
            giftMessage.isFirstSendGift = sendGiftResult.isFirstSend;
            giftMessage.displayTextForAnchor = giftResultData.displayTextForAnchor;
            giftMessage.displayTextForAudience = giftResultData.displayTextForAudience;
            Gift gift = giftResultData.mGift;
            if (gift != null) {
                giftMessage.mGift = gift;
            } else {
                giftMessage.mGift = GiftManager.inst().findGiftById(sendGiftResult.mGiftId);
            }
            GiftMonitorInfo giftMonitorInfo = new GiftMonitorInfo();
            giftMonitorInfo.send_gift_req_start_ms = sendGiftResult.LIZIZ;
            giftMessage.giftMonitorInfo = giftMonitorInfo;
            giftMessage.LJLJI = sendGiftResult.monitorExtra;
            giftMessage.lynxExtra = sendGiftResult.lynxExtra;
            giftMessage.linkmicGiftExpressionStrategy = sendGiftResult.linkmicGiftExpressionStrategy;
            giftMessage.matchInfo = sendGiftResult.matchInfo;
            giftMessage.flyingMicResources = sendGiftResult.flyingMicResources;
            arrayList.add(giftMessage);
        }
        C0NB.LIZIZ("get message list", "success");
        return arrayList;
    }
}
