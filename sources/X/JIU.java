package X;

import android.content.DialogInterface;
import android.view.KeyEvent;
import com.ss.android.ugc.aweme.live.livehostimpl.EducationVideoPlayerDialogFragment;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JIU implements DialogInterface.OnKeyListener {
    public final /* synthetic */ EducationVideoPlayerDialogFragment LJLIL;

    public JIU(EducationVideoPlayerDialogFragment educationVideoPlayerDialogFragment) {
        this.LJLIL = educationVideoPlayerDialogFragment;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent event) {
        o.LJIIIZ(event, "event");
        if (4 == i && 1 == event.getAction()) {
            EducationVideoPlayerDialogFragment educationVideoPlayerDialogFragment = this.LJLIL;
            educationVideoPlayerDialogFragment.dismiss();
            JIT jit = educationVideoPlayerDialogFragment.LJLLJ;
            if (jit != null) {
                jit.LIZ("exit");
            }
            educationVideoPlayerDialogFragment.vl();
            educationVideoPlayerDialogFragment.onDestroy();
            return true;
        }
        return false;
    }
}
