package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: X.Coe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32464Coe {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C78072UkW c78072UkW, boolean z) {
        Long l;
        Gift gift;
        int i;
        String str;
        boolean LJIILLIIL = C32455CoV.LJIILLIIL();
        boolean LJIIZILJ = C32455CoV.LJIIZILJ(c78072UkW.LIZ);
        if (LJIILLIIL || LJIIZILJ) {
            StringBuilder LJI = JBR.LJI("onQueueGiftMessage enqueue(", z, ") id(");
            LJI.append(c78072UkW.LJJJJIZL);
            LJI.append(") isLocal(");
            LJI.append(c78072UkW.LJJJJJL);
            LJI.append(") from(");
            LJI.append(c78072UkW.LJJJJZI);
            LJI.append(") to(");
            User user = c78072UkW.LJJJJZ;
            if (user != null) {
                l = Long.valueOf(user.getId());
            } else {
                l = null;
            }
            LJI.append(l);
            LJI.append(')');
            C0NB.LIZIZ("LiveGiftReceiveQueueMonitor", X1D.LIZIZ(LJI));
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            C32455CoV.LJII(jSONObject, jSONObject2);
            GiftMessage giftMessage = c78072UkW.LIZ;
            if (giftMessage == null || (gift = giftMessage.mGift) == null) {
                return;
            }
            C32455CoV.LIZJ(gift, giftMessage.giftsInBox, giftMessage.colorId, jSONObject, jSONObject2);
            C32455CoV.LIZIZ(giftMessage, jSONObject, jSONObject2);
            C32433Co9.LIZIZ(jSONObject2);
            c78072UkW.LJJIZ.L(jSONObject2);
            ArrayList<C32665Crt> arrayList = c78072UkW.LJJIJLIJ;
            int i2 = 0;
            if ((arrayList instanceof Collection) && arrayList.isEmpty()) {
                i = 0;
            } else {
                Iterator<C32665Crt> it = arrayList.iterator();
                i = 0;
                while (it.hasNext()) {
                    if ((!it.next().LJLJI) && (i = i + 1) < 0) {
                        C47261Igj.LJJJJIZL();
                        throw null;
                    }
                }
            }
            jSONObject2.put("msg_total", i);
            ArrayList<C32665Crt> arrayList2 = c78072UkW.LJJIJLIJ;
            if (!(arrayList2 instanceof Collection) || !arrayList2.isEmpty()) {
                Iterator<C32665Crt> it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    if (it2.next().LJLJI && (i2 = i2 + 1) < 0) {
                        C47261Igj.LJJJJIZL();
                        throw null;
                    }
                }
            }
            jSONObject2.put("interrupted_msg_total", i2);
            if (!z && LJIILLIIL) {
                long j = gift.id;
                long LIZ2 = C32394CnW.LIZ(gift, Long.valueOf(j));
                C32268ClU.LIZIZ = j;
                C32268ClU.LIZJ = LIZ2;
            }
            if (LJIIZILJ) {
                if (z) {
                    str = "gift_msg_enqueue_self";
                } else {
                    str = "gift_msg_dequeue_self";
                }
            } else if (z) {
                str = "gift_msg_enqueue_anchor";
            } else {
                str = "gift_msg_dequeue_anchor";
            }
            BZI LIZ3 = C28787BRn.LIZ(str);
            LIZ3.LJJ(jSONObject);
            LIZ3.LJJ(jSONObject2);
            LIZ3.LJJIIJZLJL();
            C0K2.LJI(str, jSONObject, new JSONObject(), jSONObject2);
            C0NB.LIZIZ("LiveGiftReceiveQueueMonitor", "reported(" + str + ')');
        }
    }
}
