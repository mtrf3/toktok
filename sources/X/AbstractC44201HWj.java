package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.music.ui.MusicDetailActivity;
import kotlin.jvm.internal.o;

/* renamed from: X.HWj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC44201HWj implements GHC {
    public final Activity LJLIL;

    public AbstractC44201HWj(Activity activity) {
        o.LJIIIZ(activity, "activity");
        this.LJLIL = activity;
    }

    public final void LIZ(boolean z) {
        if (z) {
            Activity activity = this.LJLIL;
            if (activity instanceof MusicDetailActivity) {
                ((MusicDetailActivity) activity).registerActivityOnKeyDownListener(this);
                return;
            }
            return;
        }
        Activity activity2 = this.LJLIL;
        if (!(activity2 instanceof MusicDetailActivity)) {
            return;
        }
        ((MusicDetailActivity) activity2).unRegisterActivityOnKeyDownListener(this);
    }
}
