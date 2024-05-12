package X;

import com.ss.android.ugc.aweme.im.sdk.common.controller.abtest.IMInboxUnreadCountDiffCheckSettings;
import com.ss.android.ugc.aweme.im.service.appsettings.UnreadCountForgivenessSettingsConfig;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.3Hl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C81413Hl {
    public static volatile long LIZIZ;
    public static final C81413Hl LIZ = new C81413Hl();
    public static final long LIZJ = Calendar.getInstance().getTimeInMillis();

    public static boolean LIZIZ(C3L4 session) {
        o.LJIIIZ(session, "session");
        C82223Ko c82223Ko = C99033ud.Companion;
        String LJFF = session.LJFF();
        c82223Ko.getClass();
        if (C82223Ko.LIZ(LJFF)) {
            C96963rI.LIZLLL().getClass();
            if (!C84563To.LIZ()) {
                return true;
            }
        }
        return false;
    }

    public static boolean LJ(C3L4 session) {
        o.LJIIIZ(session, "session");
        if (C3TE.LIZ() != 2 && C3TE.LIZ() != 3) {
            return false;
        }
        long j = session.LJLJLJ;
        if (j == 0) {
            j = session.LJLJL;
        }
        if (session.LJLLILLLL <= 0 || LIZJ - j <= ((UnreadCountForgivenessSettingsConfig) C81423Hm.LIZIZ.getValue()).expiredDay * 86400000) {
            return false;
        }
        return true;
    }

    public static int LIZJ(List sessionList, InterfaceC88471Ynr interfaceC88471Ynr) {
        o.LJIIIZ(sessionList, "sessionList");
        Iterator it = sessionList.iterator();
        int i = 0;
        while (it.hasNext()) {
            int intValue = ((Number) interfaceC88471Ynr.invoke(it.next(), Boolean.FALSE)).intValue();
            if (intValue < 0) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("unread count for session < 0: ");
                LIZ2.append(intValue);
                C34B.LJI("SessionListUnreadHelper", X1D.LIZIZ(LIZ2));
            } else {
                i += intValue;
            }
        }
        if (!((IMInboxUnreadCountDiffCheckSettings.DifferenceCheckConfig) IMInboxUnreadCountDiffCheckSettings.LIZIZ.getValue()).enable) {
            C34B.LJI("SessionListUnreadHelper", "tryCheckDifferenceInner, [return] disable");
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - LIZIZ < ((IMInboxUnreadCountDiffCheckSettings.DifferenceCheckConfig) r2.getValue()).checkInterval) {
                C34B.LJI("SessionListUnreadHelper", "tryCheckDifferenceInner, [return] interval");
            } else {
                LIZIZ = currentTimeMillis;
                XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZ), null, null, new C39J(sessionList, null, interfaceC88471Ynr), 3);
            }
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("unread count: ");
        LIZ3.append(i);
        C34B.LJI("SessionListUnreadHelper", X1D.LIZIZ(LIZ3));
        return i;
    }

    public final void LIZLLL(C63120Opw c63120Opw, JSONObject jSONObject) {
        if (c63120Opw == null) {
            LIZ(LIZ, jSONObject, "null_conv_count");
            return;
        }
        int conversationType = c63120Opw.getConversationType();
        if (conversationType == AbstractC63505Ow9.LIZ) {
            LIZ(this, jSONObject, "single_conv_count");
        } else if (conversationType == AbstractC63505Ow9.LIZIZ) {
            LIZ(this, jSONObject, "group_conv_count");
        } else {
            LIZ(this, jSONObject, "unknown_conv_count");
        }
        if (c63120Opw.isDissolved()) {
            LIZ(this, jSONObject, "dissolved_conv_count");
        }
        if (c63120Opw.isFiltered()) {
            LIZ(this, jSONObject, "filtered_conv_count");
        }
        if (c63120Opw.isMute()) {
            LIZ(this, jSONObject, "mute_conv_count");
        }
        if (c63120Opw.isHide()) {
            LIZ(this, jSONObject, "hide_conv_count");
        }
        if (c63120Opw.isLocal()) {
            LIZ(this, jSONObject, "local_conv_count");
        }
        if (C79004UzY.LJJIIJZLJL(c63120Opw)) {
            LIZ(this, jSONObject, "tcm_conv_count");
        }
        if (c63120Opw.isTemp()) {
            LIZ(this, jSONObject, "temp_conv_count");
        }
    }

    public static void LIZ(C81413Hl c81413Hl, JSONObject jSONObject, String str) {
        c81413Hl.getClass();
        jSONObject.putOpt(str, Integer.valueOf(jSONObject.optInt(str) + 1));
    }
}
