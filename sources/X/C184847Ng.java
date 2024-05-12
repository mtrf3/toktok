package X;

import kotlin.jvm.internal.o;

/* renamed from: X.7Ng, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C184847Ng {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, String str2, String str3) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str);
        c188727au.LJIIIZ("topic_id", str2);
        c188727au.LJIIIZ("topic_title", str3);
        c188727au.LJIIIZ("category", "book");
        FMX.LJIIL("click_topic_recommend", c188727au.LIZ);
    }

    public static void LIZIZ(String str, String str2, String str3) {
        if (o.LJ("book", "book")) {
            FMX.LJIIL("enter_topic_detail", C113554cx.LJJLIIIIJ(new OSZ("enter_from", str), new OSZ("book_id", str2), new OSZ("book_title", str3), new OSZ("category", "book")));
        }
    }

    public static void LIZJ(String str, String str2, String str3) {
        FMX.LJIIL("show_topic_recommend", C113554cx.LJJLIIIIJ(new OSZ("enter_from", str), new OSZ("topic_id", str2), new OSZ("topic_title", str3), new OSZ("category", "book")));
    }
}
