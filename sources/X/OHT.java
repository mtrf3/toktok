package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import com.bytedance.bpea.cert.token.TokenCert;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OHT {
    public static CharSequence LIZIZ(Context context, C78862UxG c78862UxG) {
        ClipboardManager getText = (ClipboardManager) C16880lQ.LLILL(context, "clipboard");
        C252609vk.LIZ.getClass();
        o.LJIIJ(getText, "$this$getText");
        OHW LIZ = OHS.LIZ(101804, c78862UxG, "clipboard_getText");
        C78929UyL.LIZIZ(LIZ, "android/content/ClipboardManager", "getText()Ljava/lang/CharSequence;", null);
        return (CharSequence) C39207Fa7.LIZ(LIZ, new AqS176S0100000_10(getText, 240));
    }

    public static boolean LIZJ(Context context, TokenCert tokenCert) {
        ClipboardManager hasText = (ClipboardManager) C16880lQ.LLILL(context, "clipboard");
        C252609vk.LIZ.getClass();
        o.LJIIJ(hasText, "$this$hasText");
        OHW LIZ = OHS.LIZ(101806, tokenCert, "clipboard_hasText");
        C78929UyL.LIZIZ(LIZ, "android/content/ClipboardManager", "hasText()Z", null);
        return ((Boolean) C39207Fa7.LIZ(LIZ, new AqS176S0100000_10(hasText, 241))).booleanValue();
    }

    public static void LIZ(String str, String str2, Context context, AbstractC39330Fc6 abstractC39330Fc6) {
        ClipboardManager clipboardManager = (ClipboardManager) C16880lQ.LLILL(context, "clipboard");
        ClipData newPlainText = ClipData.newPlainText(str, str2);
        C252609vk.LIZ.getClass();
        OHS.LIZIZ(clipboardManager, newPlainText, abstractC39330Fc6);
    }
}
