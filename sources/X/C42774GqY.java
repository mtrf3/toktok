package X;

import android.view.KeyEvent;
import android.widget.TextView;
import com.ss.android.ugc.aweme.AnchorSearchFragment;

/* renamed from: X.GqY, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42774GqY implements TextView.OnEditorActionListener {
    public final /* synthetic */ AnchorSearchFragment LJLIL;

    public C42774GqY(AnchorSearchFragment anchorSearchFragment) {
        this.LJLIL = anchorSearchFragment;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 3 && i != 4 && (keyEvent == null || keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
            return false;
        }
        this.LJLIL.wl();
        return true;
    }
}
