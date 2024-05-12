package X;

import android.os.Bundle;
import com.bytedance.android.livesdk.adminsetting.LiveAdminSettingDialog;
import kotlin.jvm.internal.o;

/* renamed from: X.BBc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28360BBc {
    public static LiveAdminSettingDialog LIZ(BBP initialPage, String str, boolean z) {
        o.LJIIIZ(initialPage, "initialPage");
        LiveAdminSettingDialog liveAdminSettingDialog = new LiveAdminSettingDialog();
        Bundle bundle = new Bundle();
        bundle.putSerializable("argument_initial_page", initialPage);
        bundle.putSerializable("argument_dim", Boolean.valueOf(z));
        if (str != null) {
            bundle.putString("argument_entrance", str);
        }
        liveAdminSettingDialog.setArguments(bundle);
        return liveAdminSettingDialog;
    }
}
