package X;

import android.app.Activity;
import com.bytedance.android.livesdk.wallet.Diamond;
import java.util.List;

/* renamed from: X.Ca2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31558Ca2 {
    public static /* synthetic */ void LIZ(InterfaceC31557Ca1 interfaceC31557Ca1, Activity activity, Diamond diamond, InterfaceC77737Uf7 interfaceC77737Uf7, int i, Boolean bool, List list, String str, String str2, int i2) {
        Boolean bool2 = bool;
        int i3 = i;
        String str3 = str;
        if ((i2 & 8) != 0) {
            i3 = 0;
        }
        List list2 = null;
        if ((i2 & 16) != 0) {
            bool2 = null;
        }
        if ((i2 & 32) == 0) {
            list2 = list;
        }
        String str4 = "";
        if ((i2 & 64) != 0) {
            str3 = "";
        }
        if ((i2 & 128) == 0) {
            str4 = str2;
        }
        interfaceC31557Ca1.LIZIZ(activity, diamond, interfaceC77737Uf7, i3, bool2, list2, str3, str4);
    }
}
