package X;

import android.view.KeyEvent;
import android.widget.TextView;
import com.bytedance.effectcreatormobile.objectselect.gif.GifsFragment;

/* renamed from: X.aQX, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93417aQX implements TextView.OnEditorActionListener {
    public final /* synthetic */ GifsFragment LJLIL;

    public C93417aQX(GifsFragment gifsFragment) {
        this.LJLIL = gifsFragment;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i == 3) {
            C93736aVg.LIZ(this.LJLIL.requireContext());
            return true;
        }
        return false;
    }
}
