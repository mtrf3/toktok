package X;

import android.content.Context;
import android.text.Spanned;
import kotlin.jvm.internal.AqS154S0100000_4;

/* loaded from: classes5.dex */
public final class AT7 {
    public static /* synthetic */ Spanned LIZ(LKE lke, Context context, Integer num, Integer num2, int i, String str, int i2, AqS154S0100000_4 aqS154S0100000_4, int i3) {
        Integer num3 = num2;
        int i4 = i2;
        Integer num4 = num;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = aqS154S0100000_4;
        String str2 = null;
        if ((i3 & 2) != 0) {
            num4 = null;
        }
        if ((i3 & 4) != 0) {
            num3 = null;
        }
        if ((i3 & 64) != 0) {
            str2 = "";
        }
        if ((i3 & 128) != 0) {
            i4 = 1;
        }
        if ((i3 & 256) != 0) {
            interfaceC65784Pro = AT8.LJLIL;
        }
        return lke.LIZJ(context, num4, num3, null, i, str, str2, i4, interfaceC65784Pro);
    }
}
