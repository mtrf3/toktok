package X;

import android.os.Bundle;
import com.bytedance.android.livesdk.usercard.LiveProfileManageDialog;

/* renamed from: X.BEl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28447BEl {
    public static LiveProfileManageDialog LIZ(boolean z, C28448BEm c28448BEm) {
        LiveProfileManageDialog liveProfileManageDialog = new LiveProfileManageDialog();
        Bundle bundle = new Bundle();
        bundle.putSerializable("report_arg", c28448BEm);
        bundle.putBoolean("arg_msg_is_vertical", z);
        liveProfileManageDialog.setArguments(bundle);
        return liveProfileManageDialog;
    }
}
