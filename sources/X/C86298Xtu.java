package X;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.utils.permission.PermissionViewModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Xtu, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86298Xtu {
    public static List<String> LIZ(Context context, String... strArr) {
        if (context == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (C04330Ez.LIZ(context, str) == -1) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public static void LIZIZ(Activity activity, int i, int[] iArr) {
        int i2;
        C86300Xtw c86300Xtw = ((PermissionViewModel) ViewModelProviders.of((ActivityC45651qj) activity).get(PermissionViewModel.class)).LJLIL;
        if (c86300Xtw != null && (i2 = c86300Xtw.LIZIZ) != -1 && i == i2 && c86300Xtw.LIZ != null) {
            for (int i3 : iArr) {
                if (i3 != 0) {
                    c86300Xtw.LIZ.LIZ();
                    return;
                }
            }
            c86300Xtw.LIZ.LIZIZ();
        }
    }
}
