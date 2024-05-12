package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.GiftInfoInBox;
import com.bytedance.android.livesdk.model.GiftsBoxInfo;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.UkO, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78064UkO {
    public static final /* synthetic */ int LIZ = 0;

    public static C78072UkW LIZ(GiftMessage msg, long j) {
        String str;
        boolean z;
        List<GiftInfoInBox> list;
        Object next;
        o.LJIIIZ(msg, "msg");
        C78072UkW c78072UkW = new C78072UkW(msg);
        Gift findGiftById = GiftManager.inst().findGiftById(msg.giftId);
        if ((findGiftById == null && (findGiftById = msg.mGift) == null) || (str = findGiftById.describe) == null) {
            str = "";
        }
        User user = msg.toUser;
        int i = 0;
        if (user != null && user.getId() > 0 && msg.toUser.getId() != j) {
            str = C15380j0.LJIILL(R.string.sr7, C05170If.LIZ(msg.toUser));
            o.LJIIIIZZ(str, "getString(R.string.ttliv…tDisplayName(msg.toUser))");
        }
        c78072UkW.LIZJ = C78062UkM.LIZ(c78072UkW);
        if (j == ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) {
            z = true;
        } else {
            z = false;
        }
        c78072UkW.LJJJIL = C05170If.LIZ(msg.fromUser);
        boolean z2 = msg.LJLILLLLZI;
        c78072UkW.LJJJJJL = z2;
        c78072UkW.LJJIZ.LJLIL = z2;
        c78072UkW.LJJJJL = z;
        c78072UkW.LJIIIIZZ = msg.comboCount;
        c78072UkW.LJJJJI = str;
        Gift gift = msg.mGift;
        if (gift != null) {
            if (gift.isBoxGift) {
                GiftsBoxInfo giftsBoxInfo = msg.giftsInBox;
                if (giftsBoxInfo != null && (list = giftsBoxInfo.gifts) != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<GiftInfoInBox> it = list.iterator();
                    while (it.hasNext()) {
                        Gift findGiftById2 = GiftManager.inst().findGiftById(it.next().giftId);
                        if (findGiftById2 != null) {
                            arrayList.add(findGiftById2);
                        }
                    }
                    Iterator it2 = arrayList.iterator();
                    if (!it2.hasNext()) {
                        next = null;
                    } else {
                        next = it2.next();
                        if (it2.hasNext()) {
                            int i2 = ((Gift) next).diamondCount;
                            do {
                                Object next2 = it2.next();
                                int i3 = ((Gift) next2).diamondCount;
                                if (i2 < i3) {
                                    next = next2;
                                    i2 = i3;
                                }
                            } while (it2.hasNext());
                        }
                    }
                    Gift gift2 = (Gift) next;
                    if (gift2 != null) {
                        i = gift2.diamondCount;
                    }
                }
            } else {
                i = gift.diamondCount;
            }
        }
        c78072UkW.LIZLLL = msg.comboCount * i;
        c78072UkW.LJIL = C30725C4b.LIZ();
        c78072UkW.LJJ = System.currentTimeMillis();
        c78072UkW.LJJIZ.N(msg);
        return c78072UkW;
    }
}
