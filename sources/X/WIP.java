package X;

import android.view.KeyEvent;
import android.view.View;
import com.ss.android.ugc.aweme.mix.addfeed.AddFeedToMixFragment;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WIP implements View.OnKeyListener {
    public final /* synthetic */ AddFeedToMixFragment LJLIL;

    public WIP(AddFeedToMixFragment addFeedToMixFragment) {
        this.LJLIL = addFeedToMixFragment;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        o.LJIIIZ(view, "<anonymous parameter 0>");
        o.LJIIIZ(keyEvent, "keyEvent");
        if (i == 4) {
            if (keyEvent.getAction() != 1 || keyEvent.isCanceled()) {
                return true;
            }
            this.LJLIL.vl();
            return true;
        }
        if (i == 4) {
            return true;
        }
        return false;
    }
}
