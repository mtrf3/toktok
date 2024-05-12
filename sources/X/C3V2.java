package X;

import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;

/* renamed from: X.3V2, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3V2 {
    public static final C64962gm LIZ = C48841JEv.LIZ(C78613UtF.LIZ);

    public static String LIZ(C109544Rq c109544Rq) {
        Integer valueOf;
        EnumC110124Tw.Companion.getClass();
        BaseContent LIZJ = C110134Tx.LIZJ(c109544Rq);
        if (LIZJ != null && (valueOf = Integer.valueOf(LIZJ.type)) != null) {
            if (valueOf.intValue() == 706) {
                return "get_started";
            }
            if (valueOf.intValue() == 707) {
                return "suggested_question_ask";
            }
        }
        return "unknown";
    }
}
