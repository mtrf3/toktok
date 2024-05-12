package X;

import android.content.Context;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JXR implements InterfaceC49473JbJ {
    @Override // X.InterfaceC49473JbJ
    public final void LIZIZ(JW6 item) {
        o.LJIIIZ(item, "item");
    }

    @Override // X.InterfaceC49473JbJ
    public final String LIZ(JW6 item, Context context) {
        o.LJIIIZ(item, "item");
        String str = null;
        if (context == null) {
            return null;
        }
        String botName = C49543JcR.LIZLLL().getBotName();
        if (botName != null && C78685UuP.LJJJZ(botName)) {
            str = botName;
        }
        String string = context.getString(R.string.s30);
        o.LJIIIIZZ(string, "context.getString(R.stri…koCard_area_sectionLabel)");
        return Q8U.LIZIZ(new Object[]{str}, 1, string, "format(format, *args)");
    }
}
