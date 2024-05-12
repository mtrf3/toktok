package X;

import androidx.fragment.app.Fragment;
import com.ss.ttlivestreamer.core.transport.RTMPUploadBWProbe;

/* loaded from: classes6.dex */
public final class C9R implements RTMPUploadBWProbe.Listener {
    public final /* synthetic */ C9N LIZ;

    public C9R(C9N c9n) {
        this.LIZ = c9n;
    }

    @Override // com.ss.ttlivestreamer.core.transport.RTMPUploadBWProbe.Listener
    public final void onMessage(int i, int i2, long j, String str) {
        ActivityC45651qj mo49getActivity;
        Fragment fragment = this.LIZ.LIZ;
        if (fragment != null && (mo49getActivity = fragment.mo49getActivity()) != null) {
            mo49getActivity.runOnUiThread(new C9P(i, i2, j, this.LIZ, str));
        }
    }
}
