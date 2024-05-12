package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.broadcast.preview.widget.levelup.AnchorTechViewPagerDialog;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* loaded from: classes6.dex */
public final class BQT {
    public static void LIZ(DataChannel dataChannel, String str) {
        if (dataChannel == null) {
            return;
        }
        Bundle LIZ = C0H1.LIZ("ENTER_FROM_PARAM", str);
        AnchorTechViewPagerDialog anchorTechViewPagerDialog = new AnchorTechViewPagerDialog();
        anchorTechViewPagerDialog.setArguments(LIZ);
        try {
            FragmentManager fragmentManager = (FragmentManager) dataChannel.kv0(C29494Bhq.class);
            if (fragmentManager != null) {
                anchorTechViewPagerDialog.show(fragmentManager, fragmentManager.getClass().getName());
            } else {
                "Required value was null.".toString();
                throw new IllegalStateException("Required value was null.");
            }
        } catch (IllegalStateException unused) {
        }
    }
}
