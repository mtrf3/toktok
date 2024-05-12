package X;

import android.view.Window;
import com.bytedance.android.livesdk.LiveRoomFragment;
import com.bytedance.android.livesdk.liveroom.RoomListener;

/* loaded from: classes6.dex */
public final class B59 implements B4H {
    public final /* synthetic */ RoomListener LIZ;

    public B59(RoomListener roomListener) {
        this.LIZ = roomListener;
    }

    public final void LIZ(boolean z) {
        ActivityC45651qj mo49getActivity;
        Window window;
        LiveRoomFragment liveRoomFragment = this.LIZ.fragment;
        if (liveRoomFragment == null || (mo49getActivity = liveRoomFragment.mo49getActivity()) == null || (window = mo49getActivity.getWindow()) == null) {
            return;
        }
        if (z) {
            if (C15410j3.LIZJ(mo49getActivity)) {
                window.clearFlags(1024);
                return;
            }
            return;
        }
        mo49getActivity.getWindow().setFlags(1024, 1024);
    }
}
