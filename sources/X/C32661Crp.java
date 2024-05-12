package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Crp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32661Crp {
    public static long LIZ;
    public static final /* synthetic */ int LIZIZ = 0;

    public static boolean LIZLLL() {
        return C31120CJg.LIZ.mT();
    }

    public static boolean LJ() {
        List<Long> QD = C31120CJg.LIZ.QD();
        o.LJIIIIZZ(QD, "interactService.multiCoHostLinkedUserList");
        if (QD.size() > 2) {
            return true;
        }
        return false;
    }

    public static void LIZJ(BZI bzi) {
        String str;
        bzi.LJIJJ(C31120CJg.LIZIZ(), "connection_type");
        if (LIZLLL()) {
            bzi.LJIJJ(Long.valueOf(C31120CJg.LIZ()), "pk_id");
            if (LJ()) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            bzi.LJIJJ(str, "is_multi");
        }
        if (LIZLLL() || C31120CJg.LIZ.OB()) {
            bzi.LJIJJ(Long.valueOf(C31120CJg.LIZ.LJJLI()), "channel_id");
        }
        bzi.LJIJJ(C32129CjF.LIZ.LJ, "gift_enter_from");
        bzi.LJI();
    }

    public static void LJFF(List list) {
        long j;
        C32697CsP c32697CsP;
        BZI LIZ2 = C28787BRn.LIZ("livesdk_backpack_show");
        LIZJ(LIZ2);
        LIZ2.LJIIZILJ();
        LIZ2.LJIJJ(Integer.valueOf(list.size()), "current_match_item_cnts");
        if (LIZ != 0) {
            j = System.currentTimeMillis() - LIZ;
        } else {
            j = 1;
        }
        LIZ2.LJIJJ(Long.valueOf(j), "duration");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            AbstractC32698CsQ abstractC32698CsQ = (AbstractC32698CsQ) obj;
            Object obj2 = null;
            if (abstractC32698CsQ != null) {
                obj2 = abstractC32698CsQ.LIZIZ;
            }
            if ((obj2 instanceof C32697CsP) && (c32697CsP = (C32697CsP) obj2) != null && c32697CsP.LJIIJJI && LIZLLL() && !LJ()) {
                arrayList.add(obj);
            }
        }
        LIZ2.LJIJJ(Integer.valueOf(arrayList.size()), "current_available_match_item_cnts");
        LIZ2.LJJIIJZLJL();
    }

    public static void LIZ(Throwable th, JSONObject jSONObject) {
        String str;
        int i;
        if (th != null) {
            str = th.toString();
        } else {
            str = null;
        }
        if (th instanceof C29401Dk) {
            C29401Dk c29401Dk = (C29401Dk) th;
            i = c29401Dk.getErrorCode();
            str = c29401Dk.getErrorMsg();
        } else if (th instanceof C0TL) {
            C0TL c0tl = (C0TL) th;
            i = c0tl.statusCode;
            str = c0tl.getMessage();
        } else {
            i = 10001;
        }
        C05630Jz.LJFF(jSONObject, "error_msg", i);
        C05630Jz.LJI(jSONObject, "error_detail", str);
        if (th != null) {
            C05630Jz.LJI(jSONObject, "error_class", th.getClass().getName());
        }
    }

    public static void LIZIZ(BZI bzi, AbstractC32698CsQ abstractC32698CsQ) {
        C32697CsP c32697CsP;
        boolean z;
        String str;
        long j;
        String str2;
        Object obj = null;
        if (abstractC32698CsQ != null) {
            obj = abstractC32698CsQ.LIZIZ;
        }
        if ((obj instanceof C32697CsP) && (c32697CsP = (C32697CsP) obj) != null) {
            if (c32697CsP.LJIIJJI && LIZLLL() && !LJ()) {
                z = true;
            } else {
                z = false;
            }
            int i = c32697CsP.LJIIIZ;
            if (i == 1) {
                str = "boosting_gloves";
            } else if (i == 2) {
                str = "magic_smokes";
            } else {
                str = "unknown";
            }
            bzi.LJIJJ(str, "match_item_type");
            if (z && LIZLLL() && !LJ()) {
                j = c32697CsP.LIZ;
            } else {
                j = 0;
            }
            bzi.LJIJJ(Long.valueOf(j), "match_item_cnts");
            if (z) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            bzi.LJIJJ(str2, "is_available");
        }
    }

    public static void LJI(String str, JSONObject jSONObject) {
        C31120CJg.LIZ.PW(Boolean.valueOf(C32257ClJ.LJI()), str, jSONObject);
    }
}
