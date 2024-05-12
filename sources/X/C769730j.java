package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.30j, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C769730j {
    public static final /* synthetic */ int LIZ = 0;

    public static char[] LIZ(C109544Rq c109544Rq) {
        o.LJIIIZ(c109544Rq, "<this>");
        String str = c109544Rq.getLocalExt().get("text_view_click_status");
        if (str != null) {
            char[] charArray = str.toCharArray();
            o.LJIIIIZZ(charArray, "this as java.lang.String).toCharArray()");
            return charArray;
        }
        return null;
    }

    public static void LIZIZ(C109544Rq c109544Rq) {
        String str;
        if (c109544Rq != null && (str = c109544Rq.getLocalExt().get("info_card_msg_id")) != null) {
            XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C769630i(CastLongProtector.parseLong(str), c109544Rq, null), 3);
        }
    }

    public static void LIZJ(C109544Rq c109544Rq, char[] cArr) {
        java.util.Map<String, String> localExt = c109544Rq.getLocalExt();
        o.LJIIIIZZ(localExt, "msg.localExt");
        localExt.put("text_view_click_status", new String(cArr));
        C106674Gp.LJIILJJIL(c109544Rq);
    }
}
