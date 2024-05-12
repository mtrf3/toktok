package X;

import kotlin.jvm.internal.o;

/* renamed from: X.3P6, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3P6 {
    public static C3P7 LIZ(String noticeCode) {
        o.LJIIIZ(noticeCode, "noticeCode");
        if (o.LJ(noticeCode, "sayhi_suggested_stickers")) {
            return C3P7.SAY_HI;
        }
        if (o.LJ(noticeCode, "recommended_chat_suggested_stickers")) {
            return C3P7.RECOMMENDED_CHAT;
        }
        return C3P7.OTHERS;
    }
}
