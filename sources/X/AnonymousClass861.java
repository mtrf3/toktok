package X;

import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.861, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass861 {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZIZ(char c) {
        if ('a' <= c) {
            if (c >= '{') {
                return false;
            }
        } else if ('A' > c || c >= '[') {
            return false;
        }
        return true;
    }

    public static String LIZ(String text) {
        o.LJIIIZ(text, "text");
        AnonymousClass863.Companion.getClass();
        AnonymousClass863 anonymousClass863 = AnonymousClass863.CHARACTER_AND;
        AnonymousClass863 anonymousClass8632 = AnonymousClass863.CHARACTER_LOWER_THAN;
        AnonymousClass863 anonymousClass8633 = AnonymousClass863.CHARACTER_GREATER_THAN;
        for (Map.Entry entry : C113554cx.LJJL(new OSZ(anonymousClass863.getMarkup(), String.valueOf(anonymousClass863.getText())), new OSZ(anonymousClass8632.getMarkup(), String.valueOf(anonymousClass8632.getText())), new OSZ(anonymousClass8633.getMarkup(), String.valueOf(anonymousClass8633.getText()))).entrySet()) {
            text = ujb.o.LJJJJZ(text, (String) entry.getKey(), (String) entry.getValue(), false);
        }
        return text;
    }
}
