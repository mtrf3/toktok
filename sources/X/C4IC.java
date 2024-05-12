package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* renamed from: X.4IC, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4IC {
    public static final /* synthetic */ int LIZ = 0;

    public static java.util.Map LIZ(C4ID c4id) {
        String str;
        Object obj;
        int i = c4id.LJI;
        String str2 = "";
        if (i != 0) {
            if (i != 3) {
                str = "";
            } else {
                str = "group";
            }
        } else if (c4id.LJII) {
            str = "business";
        } else {
            str = "private";
        }
        OSZ[] oszArr = new OSZ[10];
        oszArr[0] = new OSZ("enter_from", c4id.LIZ);
        oszArr[1] = new OSZ("enter_method", c4id.LIZIZ);
        oszArr[2] = new OSZ("conversation_id", c4id.LIZJ);
        oszArr[3] = new OSZ("author_id", c4id.LIZLLL);
        oszArr[4] = new OSZ("group_id", c4id.LJ);
        oszArr[5] = new OSZ("to_user_id", c4id.LJFF);
        oszArr[6] = new OSZ("chat_type", str);
        oszArr[7] = new OSZ("panel_source", c4id.LJIIIIZZ);
        if (c4id.LJIIJ) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        oszArr[8] = new OSZ("is_recommended_chat", obj);
        int i2 = c4id.LJIIIZ;
        if (i2 == 27) {
            str2 = "1";
        } else if (i2 == 31) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        oszArr[9] = new OSZ("online_order", str2);
        return C113554cx.LJJL(oszArr);
    }
}
