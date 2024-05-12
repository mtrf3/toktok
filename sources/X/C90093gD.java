package X;

/* renamed from: X.3gD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C90093gD {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Integer num, Integer num2, String str, Long l) {
        C188727au c188727au = new C188727au();
        if (str != null) {
            c188727au.LJI("enter_from", str);
        }
        c188727au.LJI("enter_method", "ask_textual_question");
        if (l != null) {
            c188727au.LJ(l.longValue(), "question_id");
        }
        if (num != null) {
            c188727au.LIZLLL(num.intValue(), "invitee_cnt");
        }
        if (num2 != null) {
            c188727au.LIZLLL(num2.intValue(), "is_success");
        }
        FMX.LJIIL("send_qa_invitation", c188727au.LIZ);
    }
}
