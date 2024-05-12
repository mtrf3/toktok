package X;

import android.content.Context;
import com.bytedance.android.live.base.model.user.User;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.BTv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28847BTv {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZJ() {
        User LJ = ((C29374Bfu) B83.LIZ().LIZIZ()).LJ();
        o.LJIIIIZZ(LJ, "getInstance().user().currentUserOpt");
        if (TV3.LJI(LJ)) {
            C28733BPl.LJIILIIL().getClass();
            C0NE.LIZ("MultiGuestV3ModeratorToastHelper", "showOperationDelayToastForAudience");
            C30868C9o.LIZJ(R.string.n3o);
        }
    }

    public static String LIZ(String str) {
        if (15 <= str.length()) {
            String substring = str.substring(0, 15);
            o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        C28733BPl LJIILIIL = C28733BPl.LJIILIIL();
        StringBuilder LIZJ = C06460Ne.LIZJ("safeSubstring StringIndexOutOfBoundsException: startIndex=", 0, ", endIndex=", 15, ", length=");
        LIZJ.append(str.length());
        String LIZIZ = X1D.LIZIZ(LIZJ);
        LJIILIIL.getClass();
        C0NE.LIZLLL("MultiGuestV3ModeratorToastHelper", LIZIZ);
        return str;
    }

    public static void LIZIZ(int i, String str, User user, User user2) {
        OSZ osz;
        String string;
        HashMap hashMap = new HashMap();
        C74824TYe.LIZ(hashMap);
        hashMap.put("toast_type", str);
        C74824TYe.LJLL("livesdk_anchor_guest_moderator_toast_show", hashMap);
        C28733BPl.LJIILIIL().getClass();
        C0NE.LIZ("MultiGuestV3ModeratorToastHelper", "showAnchorReceiveModeratorOperateToast");
        if (user != null && user2 != null) {
            String LIZ2 = C05170If.LIZ(user);
            String str2 = "";
            if (LIZ2 == null) {
                LIZ2 = "";
            }
            String LIZ3 = C05170If.LIZ(user2);
            if (LIZ3 != null) {
                str2 = LIZ3;
            }
            if (str2.length() + LIZ2.length() > 30) {
                osz = new OSZ(LIZ(LIZ2), LIZ(str2));
            } else {
                osz = new OSZ(LIZ2, str2);
            }
            Context LIZLLL = C15380j0.LIZLLL();
            if (LIZLLL != null && (string = LIZLLL.getString(i, osz.getFirst(), osz.getSecond())) != null) {
                C28733BPl LJIILIIL = C28733BPl.LJIILIIL();
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("formatText=");
                LIZ4.append(string);
                String LIZIZ = X1D.LIZIZ(LIZ4);
                LJIILIIL.getClass();
                C0NE.LIZ("MultiGuestV3ModeratorToastHelper", LIZIZ);
                C30868C9o.LJI(string);
            }
        }
    }
}
