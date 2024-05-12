package X;

import Y.IDDListenerS151S0100000_12;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.commentfilter.subadapters.dislike.PermissionSettingSheet;
import kotlin.jvm.internal.o;

/* renamed from: X.SLh, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71941SLh {
    public static void LIZ(Context context, int i, boolean z, String str) {
        o.LJIIIZ(context, "context");
        if (context instanceof ActivityC45651qj) {
            PermissionSettingSheet permissionSettingSheet = new PermissionSettingSheet();
            Bundle bundle = new Bundle();
            bundle.putString("title", str);
            bundle.putBoolean("controlFlag", z);
            bundle.putInt("settingType", i);
            permissionSettingSheet.setArguments(bundle);
            TuxSheet tuxSheet = new ASL().LIZ;
            tuxSheet.LJLLILLLL = permissionSettingSheet;
            tuxSheet.LJLILLLLZI = new IDDListenerS151S0100000_12(permissionSettingSheet, 1);
            C1DG.LJII((ActivityC45651qj) context, "context.supportFragmentManager", tuxSheet, "PermissionSettingSheet");
        }
    }
}
