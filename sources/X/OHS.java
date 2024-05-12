package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import com.bytedance.bpea.basics.Cert;
import kotlin.jvm.internal.AqS141S0200000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OHS {
    public static OHW LIZ(int i, Cert cert, String str) {
        return new OHW(cert, str, new String[]{"clipboard"}, Integer.valueOf(EnumC39200Fa0.BPEA_ENTRY.getType()), "Collect", i);
    }

    public static void LIZIZ(ClipboardManager setPrimaryClip, ClipData clipData, Cert cert) {
        o.LJIIJ(setPrimaryClip, "$this$setPrimaryClip");
        o.LJIIJ(clipData, "clipData");
        OHW LIZ = LIZ(101807, cert, "clipboard_setClip");
        C78929UyL.LIZIZ(LIZ, "android/content/ClipboardManager", "setPrimaryClip(Landroid/content/ClipData;)V", C51029K0z.LJJIIZI(new OSZ("clipData", clipData)));
        C39207Fa7.LIZ(LIZ, new AqS141S0200000_10(setPrimaryClip, clipData, 61));
    }
}
